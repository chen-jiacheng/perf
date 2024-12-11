package com.chenjiacheng.perf.db.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by chenjiacheng on 2024/12/12 00:33
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@RequestMapping("/perf/db/common")
@RestController
public class PerfDBCommonController {

    @RequestMapping(method = RequestMethod.GET,path = "/echo")
    public ResponseEntity<String> echo(){
        return ResponseEntity.ok(LocalDateTime.now()+": ok.");
    }


}
