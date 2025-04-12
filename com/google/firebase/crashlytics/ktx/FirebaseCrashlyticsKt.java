/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.ktx.KeyValueBuilder;
import com.google.firebase.ktx.Firebase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics getCrashlytics(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, Function1 function1) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder(firebaseCrashlytics);
        function1.invoke(keyValueBuilder);
    }
}

