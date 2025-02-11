package com.project;

public class LoginController {
    // 这是a开发的a接口
    public void login (String account, String password) {
        System.out.println("a开发的登录接口");
        // 登录的具体实现
        if (account == null || password == null) {
            System.out.println("账号或密码为空");
        } else {
            System.out.println("登录成功");
        }
    }
}
