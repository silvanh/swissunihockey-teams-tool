package com.codinglynx.sutt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinglynx.sutt.dto.ApplicationPropertyDTO;
import com.codinglynx.sutt.service.SystemService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/system")
public class SystemController {

    @Autowired
    SystemService systemService;

    @GetMapping("/applicationProperty/{key}")
    public ResponseEntity<ApplicationPropertyDTO> getApplicationProperty(@PathVariable String key) {
        ResponseEntity<ApplicationPropertyDTO> ok = ResponseEntity.ok(systemService.getApplicationProperty(key));
        return ok;
    }
}
