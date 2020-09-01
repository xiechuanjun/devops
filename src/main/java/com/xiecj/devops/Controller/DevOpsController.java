package com.xiecj.devops.Controller;

import com.xiecj.devops.Service.DevOpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class DevOpsController {
    @Autowired
    private DevOpsService devOpsService;

    @RequestMapping("/pipeline")
    public String pipeline(String message){
        return devOpsService.getDevopsPipeline(message);
    }
}
