package org.daimt.home.study;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {
    private int id;
    private String name;
}
