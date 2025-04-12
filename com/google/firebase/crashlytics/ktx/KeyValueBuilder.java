/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;

public final class KeyValueBuilder {
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "crashlytics");
        this.crashlytics = firebaseCrashlytics;
    }

    public final void key(String string2, double d2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.crashlytics.setCustomKey(string2, d2);
    }

    public final void key(String string2, float f5) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.crashlytics.setCustomKey(string2, f5);
    }

    public final void key(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.crashlytics.setCustomKey(string2, n3);
    }

    public final void key(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.crashlytics.setCustomKey(string2, l2);
    }

    public final void key(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.crashlytics.setCustomKey(string2, string3);
    }

    public final void key(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.crashlytics.setCustomKey(string2, bl2);
    }
}

