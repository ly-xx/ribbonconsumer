package com.example.demo.Observable_Subsciber;

import rx.Observable;
import rx.Subscriber;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

public class Obs_Subs {

    public static void main(String[] args) {

        //创建事件源
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello RxJava ");
                subscriber.onNext("I'm XX");
                subscriber.onCompleted();
            }
        });

        //创建订阅者
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {

            }
        };

        observable.subscribe(subscriber);

    }
}
