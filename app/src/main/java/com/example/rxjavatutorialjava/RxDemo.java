package com.example.rxjavatutorialjava;


import android.annotation.SuppressLint;
import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RxDemo {

    //печатать в логи
    public static void printer(String string){
        Log.d("log", string);
    }

    @SuppressLint("CheckResult")
    public static void testRx(){

        String name = "Maxim";
        String lastName = "Fon";
        String rang = "General";

        /*
        Метод just работа с передаваемыми элементами
         */
        Observable.just(name ,lastName, rang)
                .reduce((a,b) -> a +" "+b)
                .subscribe(RxDemo::printer);

        /*
        Метод callable
         */
        Observable.fromCallable(() -> {
            //сюда можно засунуть кучу методов
            return Log.d("log", "hello world method callable");
        })
                .subscribe();

        /*
        Метод range перебирает значения от начального до конечного
         */
        Observable.range(1, 10)
                .subscribe(System.out::println);

        /*
        Метод intervalRange таймер с задержкой
         */
        Observable.intervalRange(1, 10, 2, 1, TimeUnit.SECONDS)
                .subscribe(System.out::println);

    }



}
