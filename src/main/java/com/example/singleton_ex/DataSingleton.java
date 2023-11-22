package com.example.singleton_ex;

import java.util.HashMap;

public class DataSingleton {

    private String data = "test";

    /**
     * private 접근제한자로 외부에서 접근하는 것을 막아두고 static을 붙여 객체로 생성되지 않아도 사용 가능
     * final을 붙여 상수 값으로 설정
     * 컴파일러가 이 프로그램을 시작하기 전에 static으로 되어 있는 공간에다가 DataSingleton 클래스를 객체로 만들어서 넣어줌
     * 프로그램이 시작이 되기 전에 이 클래스를 만들어 둔 상태로 프로그램이 시작이 됨
     */
    private static final DataSingleton instance = new DataSingleton();

    // 생성자를 private 접근제한자로 막아둠
    // 외부에서 객체를 만들 수가 없음
    private DataSingleton(){
    }

    // 클래스가 객체로 만들어지지 않아도 사용할 수 있도록 static을 사용
    // 외부에서 이 클래스에 접근해서 getInstance를 통해 값을 전달 받음
    public static DataSingleton getInstance() {
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
