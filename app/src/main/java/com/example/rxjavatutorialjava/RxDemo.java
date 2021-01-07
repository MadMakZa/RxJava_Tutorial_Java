package com.example.rxjavatutorialjava;


import android.annotation.SuppressLint;
import android.util.Log;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

//public class RxDemo {
//
//    //печатать в логи
//    public static void printer(String string){
//        Log.d("log", string);
//    }
//
//    @SuppressLint("CheckResult")
//    public static void testRx() {
//
//        String name = "Maxim";
//        String lastName = "Fon";
//        String rang = "General";
//
//        /*
//        Метод just работа с передаваемыми элементами
//         */
//        Observable.just(name, lastName, rang)
//                .reduce((a, b) -> a + " " + b)
//                .subscribe(RxDemo::printer);
//
//        /*
//        Метод callable
//         */
//        Observable.fromCallable(() -> {
//            //сюда можно засунуть кучу методов, например:
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter secret word: ");
//            String s = scanner.nextLine();
//            if (s.equals("home")) {
//                return Log.d("log","correct!");
//            } else {
//                throw new Exception("Wrong word!, please enter again");
//            }
//        })
//                .retry(2)
//                .subscribe(System.out::println);
//
//
//        /*
//        Метод range перебирает значения от начального до конечного
//         */
//        Observable.range(1, 10)
//                .subscribe(System.out::println);
//
//        /*
//        Метод intervalRange таймер с задержкой
//         */
//        Observable.intervalRange(1, 10, 1, 1, TimeUnit.SECONDS)
//                .subscribe(System.out::println);
//
//        /*
//        Метод create emitter можно накрутить сложную логику
//         */
//        Observable.create(emitter -> {
//            emitter.onNext("Emitter123");
//            emitter.onComplete(); //
//        }).subscribe(System.out::println);
//
//    }
//
//
//
//}
