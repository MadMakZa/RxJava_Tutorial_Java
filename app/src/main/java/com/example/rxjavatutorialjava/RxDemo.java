package com.example.rxjavatutorialjava;


import android.util.Log;

import io.reactivex.Observable;

public class RxDemo {

    public static void testRx(){
        //создание переменной
        Observable observable = Observable.just(Log.d("log","Hello Makza"));
        //подписываемся к ней и печатаем текст на который подписались
        observable.subscribe();
    }
}
