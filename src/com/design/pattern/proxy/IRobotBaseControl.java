package com.design.pattern.proxy;

/**
 * 通用接口
 * @author EdwardAdmin
 *
 */
public interface IRobotBaseControl {

    void connect(String ip, String port);

    void connect(String ip);

    void setSpeed(String speed);
}
