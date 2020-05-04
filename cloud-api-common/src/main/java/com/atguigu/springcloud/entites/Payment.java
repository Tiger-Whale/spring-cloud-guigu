package com.atguigu.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author killer
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private Integer id;
    private String serial;
}
