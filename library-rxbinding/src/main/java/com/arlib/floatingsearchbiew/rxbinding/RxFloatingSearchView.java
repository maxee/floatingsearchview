package com.arlib.floatingsearchbiew.rxbinding;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.jakewharton.rxbinding2.InitialValueObservable;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

public final class RxFloatingSearchView {

    @CheckResult
    @NonNull
    public static InitialValueObservable<CharSequence> queryChanges(
            @NonNull FloatingSearchView view) {
        return queryChanges(view, 1);
    }

    @CheckResult
    @NonNull
    public static InitialValueObservable<CharSequence> queryChanges(
            @NonNull FloatingSearchView view, int characterLimit) {
        checkNotNull(view, "view == null");
        return new QueryObservable(view, characterLimit);
    }

    public static void checkNotNull(Object value, String message) {
        if (value == null) {
            throw new NullPointerException(message);
        }
    }
}
