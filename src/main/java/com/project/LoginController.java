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

    // 这是b开发的b接口
    public void register () {
        System.out.println("b开发的注册接口");
    }

    // 这是c开发的接口
    public void test () {
        System.out.println("c开发的测试接口");
    }
}
