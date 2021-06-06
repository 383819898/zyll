/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package cn.lp.zyll.quartz.service;


import cn.lp.zyll.quartz.domain.QuartzJob;

/*
 * @Author: 李鹏
 * @Description: TODO
 * @Date:  2021/6/6 23:30
 * @Version: v1.0
*/
public interface QuartzJobService {

    /* 
     * @Author: 李鹏
     * @Date:  2021/6/6 23:29
     * @Description: TODO 
     
     * @return: java.lang.Object
    */
    Object queryAll();

//    /**
//     * 查询全部
//     * @param criteria 条件
//     * @return /
//     */
//    List<QuartzJob> queryAll(JobQueryCriteria criteria);
//
//    /**
//     * 分页查询日志
//     * @param criteria 条件
//     * @param pageable 分页参数
//     * @return /
//     */
//    Object queryAllLog(JobQueryCriteria criteria, Pageable pageable);
//
//    /**
//     * 查询全部
//     * @param criteria 条件
//     * @return /
//     */
//    List<QuartzLog> queryAllLog(JobQueryCriteria criteria);
//
    /**
     * 创建
     * @param resources /
     */
    void create(QuartzJob resources);

//    /**
//     * 编辑
//     * @param resources /
//     */
//    void update(QuartzJob resources);
//
//    /**
//     * 删除任务
//     * @param ids /
//     */
//    void delete(Set<Long> ids);
//
    /**
     * 删除任务
     * @param uuid /
     */
    void delete(String uuid);

    /**
     * 根据ID查询
     * @param id ID
     * @return /
     */
    QuartzJob findById(Long id);
//
    /**
     * 更改定时任务状态
     * @param quartzJob /
     */
    void updateIsPause(QuartzJob quartzJob);

    /**
     * 立即执行定时任务
     * @param quartzJob /
     */
    void execution(QuartzJob quartzJob);

//    /**
//     * 导出定时任务
//     * @param queryAll 待导出的数据
//     * @param response /
//     * @throws IOException /
//     */
//    void download(List<QuartzJob> queryAll, HttpServletResponse response) throws IOException;
//
//    /**
//     * 导出定时任务日志
//     * @param queryAllLog 待导出的数据
//     * @param response /
//     * @throws IOException /
//     */
//    void downloadLog(List<QuartzLog> queryAllLog, HttpServletResponse response) throws IOException;
//
    /**
     * 执行子任务
     * @param tasks /
     * @throws InterruptedException /
     */
    void executionSubJob(String[] tasks) throws InterruptedException;
}