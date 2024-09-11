package com.codinglynx.sutt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinglynx.sutt.domain.ApplicationPropertyRecord;
import com.codinglynx.sutt.dto.ApplicationPropertyDTO;
import com.codinglynx.sutt.repository.ApplicationPropertyRepository;

@Service
public class SystemService {

    @Autowired
    private ApplicationPropertyRepository applicationPropertyRepository;

    public ApplicationPropertyDTO getApplicationProperty(String key) {
        ApplicationPropertyRecord searchResultProperty = applicationPropertyRepository.findByKey(key);
        return ApplicationPropertyDTO.builder()
                    .key(searchResultProperty.key())
                    .value(searchResultProperty.value())
                    .build();
    }

}
