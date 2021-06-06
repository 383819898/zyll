package cn.lp.zyll.app.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.UUID;
import cn.lp.zyll.quartz.domain.QuartzJob;
import cn.lp.zyll.quartz.service.QuartzJobService;
import cn.lp.zyll.util.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags="定时任务" )
@RestController
@RequestMapping("api/quartz")
@RequiredArgsConstructor
public class QuartzController {

//    private static final String ENTITY_NAME = "quartzJob";
    private final QuartzJobService quartzJobService;

    @ApiOperation("查询定时任务")
    @PostMapping("/list")
    public ResponseUtil query(){

        return ResponseUtil.success(quartzJobService.queryAll());
    }

    @ApiOperation("修改定时任务")
    @PostMapping("/update")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Long", name = "id",value = "定时任务id",required = true),
    })
    public ResponseUtil update(Long id){
        QuartzJob byId = quartzJobService.findById(id);
        quartzJobService.updateIsPause(byId);
        return ResponseUtil.success();
    }


    @ApiOperation("执行定时任务")
    @PostMapping("/start")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Long", name = "id",value = "定时任务id",required = true),
    })
    public ResponseUtil execution( Long id){
        quartzJobService.execution(quartzJobService.findById(id));
        return ResponseUtil.success();
    }


    @ApiOperation("新增定时任务")
    @PostMapping("/add")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Long", name = "id",value = "定时任务id",required = true),
    })
    public ResponseUtil add( QuartzJob quartzJob){

        long l = System.currentTimeMillis() + 300*1000;

        DateTime date = DateUtil.date(l);
        System.out.println(DateUtil.year(date));
        System.out.println(DateUtil.month(date));
        System.out.println(DateUtil.dayOfMonth(date));
        System.out.println(DateUtil.hour(date,true));
        System.out.println(DateUtil.minute(date));
        int year = DateUtil.year(date);
        int month = DateUtil.month(date)+1;
        int day = DateUtil.dayOfMonth(date);
        int hour = DateUtil.hour(date, true);
        int minute = DateUtil.minute(date);
        int second = DateUtil.second(date);
        String cron = second+" "+minute+" "+hour+" "+day+" "+month+" ? "+ year;
        System.out.println(cron);
        quartzJob.setCronExpression(cron);

        quartzJob.setUuid(UUID.randomUUID().toString());
        quartzJobService.create(quartzJob);
//        quartzJobService.execution();
        return ResponseUtil.success();
    }

    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "向客人问好")
    @GetMapping("/sayHi")
    public ResponseEntity<String> sayHi(@RequestParam(value = "name")String name){
        return ResponseEntity.ok("Hi:"+name);
    }


}
