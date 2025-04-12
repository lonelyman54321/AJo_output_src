/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import com.google.firebase.crashlytics.CustomKeysAndValues;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.KeyValueBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics getCrashlytics(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final void recordException(FirebaseCrashlytics firebaseCrashlytics, Throwable throwable, Function1 object) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(object, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        object.invoke(keyValueBuilder);
        object = keyValueBuilder.build$com_google_firebase_firebase_crashlytics();
        firebaseCrashlytics.recordException(throwable, (CustomKeysAndValues)object);
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, Function1 object) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(object, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        object.invoke(keyValueBuilder);
        object = keyValueBuilder.build$com_google_firebase_firebase_crashlytics();
        firebaseCrashlytics.setCustomKeys((CustomKeysAndValues)object);
    }
}

