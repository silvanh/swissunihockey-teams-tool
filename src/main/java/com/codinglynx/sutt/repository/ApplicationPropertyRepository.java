package com.codinglynx.sutt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codinglynx.sutt.domain.ApplicationProperty;

public interface ApplicationPropertyRepository extends JpaRepository<ApplicationProperty, String> {
    ApplicationProperty findByKey(String key);
}
