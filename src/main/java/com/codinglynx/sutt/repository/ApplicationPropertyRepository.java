package com.codinglynx.sutt.repository;


import org.springframework.data.repository.Repository;

import com.codinglynx.sutt.domain.ApplicationProperty;
import com.codinglynx.sutt.domain.ApplicationPropertyRecord;

public interface ApplicationPropertyRepository extends Repository<ApplicationProperty, String> {
    ApplicationPropertyRecord findByKey(String key);
}
