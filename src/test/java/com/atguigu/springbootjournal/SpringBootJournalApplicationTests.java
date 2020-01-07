package com.atguigu.springbootjournal;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJournalApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        logger.trace("这是trace级别日志");
        logger.debug("这是debug级别日志");
        logger.info("这是info级别日志");
        logger.warn("这是warn级别日志");
        logger.error("这是error级别日志");

    }

}
