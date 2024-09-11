package com.codinglynx.sutt.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ApplicationPropertyDTO {

    private String key;
    private String value;
}
