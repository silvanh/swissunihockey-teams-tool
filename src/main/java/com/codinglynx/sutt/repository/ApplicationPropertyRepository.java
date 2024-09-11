package com.codinglynx.sutt.repository;


import org.springframework.data.repository.Repository;

import com.codinglynx.sutt.domain.ApplicationProperty;

public interface ApplicationPropertyRepository extends Repository<ApplicationProperty, String> {
    ApplicationProperty findByKey(String key);
}
