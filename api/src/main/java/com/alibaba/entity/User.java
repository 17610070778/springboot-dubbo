package com.alibaba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 王亚奇
 * @date 2019/7/13 9:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
// 因为要通过网络传输，必须要序列化
public class User implements Serializable {
    private Integer age;
    private String username;
}
