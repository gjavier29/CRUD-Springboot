package com.javi.crudspring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ApiResultModel {
    private Boolean IsSuccess;
    private String Message;
    private String[] MessageParam;
    private Object ResultData;
}
