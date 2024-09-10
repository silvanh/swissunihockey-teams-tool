package com.codinglynx.sutt.controller;

import java.util.Map;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinglynx.sutt.domain.ApplicationVersion;

@RestController
@RequestMapping("/api/system")
public class SystemController {

    @GetMapping("/version")
    public ResponseEntity<Map<String, String>> getVersion() {
        return ResponseEntity.ok(Map.of("version", "0.1.0"));
    }

    @RepositoryRestResource(collectionResourceRel = "version", path = "version")
    public interface VersionRepository extends Repository<ApplicationVersion, Long> {
    }

}
