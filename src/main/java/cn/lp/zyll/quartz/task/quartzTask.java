package cn.lp.zyll.quartz.task;



import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class quartzTask {

    public void redEnvelopeReturned(String json){
        System.out.println("===================================");
    }
    public void run1(String str){
        System.out.println("str = " + str);
        log.info("run1 执行成功，参数为： {}" + str);
    }
    public void run2(String str){

        System.out.println("str = " + str );

    }

    public static void main(String[] args) {

    }
}
