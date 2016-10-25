package com.mezglews.rx.common;

import rx.Subscriber;

import static com.mezglews.rx.common.Utils.log;

/**
 * User: Szymon Mezglewski
 * Date: 2016-10-19
 */
public class PrintingSubscriber extends Subscriber<String> {

    @Override
    public void onCompleted() {
        log("Job completed!");
    }

    @Override
    public void onError(Throwable throwable) {
        log("Error occurred : " + throwable.getMessage());
    }

    @Override
    public void onNext(String s) {
        log("On next: " + s);
    }
}
