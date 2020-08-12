package com.exalt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    private Logger logger = LoggerFactory.getLogger(FallbackController.class);

    @RequestMapping("/companyFallBack")
    public String companyServiceFallBack() {
        logger.info("companyServiceFallBack");
        return ("Company service is down, try again later ");
    }

    @RequestMapping("/managementFallBack")
    public String managementServiceFallBack() {
        logger.info("managementServiceFallBack");
        return ("management system service is down, try again later");
    }
}
