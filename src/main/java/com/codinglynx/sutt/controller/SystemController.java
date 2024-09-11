package com.codinglynx.sutt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinglynx.sutt.dto.ApplicationPropertyDTO;
import com.codinglynx.sutt.service.SystemService;

@RestController
@RequestMapping("/api/system")
public class SystemController {

    @Autowired
    SystemService systemService;

    @GetMapping("/version")
    public ResponseEntity<ApplicationPropertyDTO> getVersion() {
        ResponseEntity<ApplicationPropertyDTO> ok = ResponseEntity.ok(systemService.getApplicationProperty("version"));
        return ok;
    }
}
