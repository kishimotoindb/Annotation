package com.cuihaichen.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Created by cuihaichen on 17-6-12.
 */

public interface Constants {

    @IntDef({
            TRAVEL,
            CAR,
            PURCHASE
    })
    @Retention(RetentionPolicy.SOURCE)
    @interface APPROVAL_TYPE {
    }

    int TRAVEL = 1;
    int CAR = 2;
    int PURCHASE = 3;



}
