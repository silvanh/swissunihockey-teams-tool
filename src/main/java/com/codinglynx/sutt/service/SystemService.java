package com.codinglynx.sutt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinglynx.sutt.domain.ApplicationProperty;
import com.codinglynx.sutt.dto.ApplicationPropertyDTO;
import com.codinglynx.sutt.repository.ApplicationPropertyRepository;

@Service
public class SystemService {

    @Autowired
    private ApplicationPropertyRepository applicationPropertyRepository;

    public ApplicationPropertyDTO getApplicationProperty(String key) {
        ApplicationProperty searchResultProperty = applicationPropertyRepository.findByKey(key);
        return ApplicationPropertyDTO.builder()
                    .key(searchResultProperty.getKey())
                    .value(searchResultProperty.getValue())
                    .build();
    }

}
