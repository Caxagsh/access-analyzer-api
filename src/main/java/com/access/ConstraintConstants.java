package com.access;

public interface ConstraintConstants {

    //regexp for validation IP subnet (3 octets x-xxx.x-xxx.x-xxx)
    //FIXME limit octets to 0-255
    String IP_SUBNET_REGEXP = "^(\\d{1,3}\\.){2}\\d{1,3}$";
}
