package com.example.rxjavatutorialjava;


import android.util.Log;

import io.reactivex.Observable;

public class RxDemo {



    public static void testRx(){

        String name = "Maxim";
        String lastName = "Fon";
        String rang = "General";

//        /*
//        обычно так не делают
//         */
//        //создание переменной
//        Observable observable = Observable.just(Log.d("log","Hello Makza"),(Log.d("log","Are you kidding me?")));
//        //подписываемся к ней и печатаем текст на который подписались
//        observable.subscribe();

        /*
        А делают так
         */
        Observable.just(name ,lastName, rang)
                .reduce((a,b) -> a+b)
                .subscribe(RxDemo::printer);
    }

    public static void printer(String string){
        Log.d("log", string);
    }
}
