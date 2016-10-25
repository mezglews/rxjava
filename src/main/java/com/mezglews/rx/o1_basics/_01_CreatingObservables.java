package com.mezglews.rx.o1_basics;

import com.mezglews.rx.common.Utils;
import rx.Observable;
import rx.schedulers.Schedulers;

import static com.mezglews.rx.common.Utils.sleep;

/**
 * User: Szymon Mezglewski
 * Date: 2016-10-25
 */
public class _01_CreatingObservables {

    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4)
//                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(Utils::log);

        sleep(4000);
    }

}
