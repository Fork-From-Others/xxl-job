package com.xxl.job.admin.component;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 示例执行器
 *
 * @author LiuDecai
 */
@Component
@JobHandler(value = "demoJobHandler")
public class DemoJobHandler extends IJobHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public ReturnT<String> execute(String param) {
        logger.info("执行定时任务, 参数：{}", param);
        return ReturnT.SUCCESS;
    }
}
