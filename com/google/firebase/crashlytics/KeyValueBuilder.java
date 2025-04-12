/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.CustomKeysAndValues;
import com.google.firebase.crashlytics.CustomKeysAndValues$Builder;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class KeyValueBuilder {
    private final CustomKeysAndValues$Builder builder;
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder() {
        CustomKeysAndValues$Builder customKeysAndValues$Builder = new CustomKeysAndValues$Builder();
        this(null, customKeysAndValues$Builder);
    }

    public KeyValueBuilder(FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "crashlytics");
        CustomKeysAndValues$Builder customKeysAndValues$Builder = new CustomKeysAndValues$Builder();
        this(firebaseCrashlytics, customKeysAndValues$Builder);
    }

    private KeyValueBuilder(FirebaseCrashlytics firebaseCrashlytics, CustomKeysAndValues$Builder customKeysAndValues$Builder) {
        this.crashlytics = firebaseCrashlytics;
        this.builder = customKeysAndValues$Builder;
    }

    public final CustomKeysAndValues build$com_google_firebase_firebase_crashlytics() {
        CustomKeysAndValues customKeysAndValues = this.builder.build();
        Intrinsics.checkNotNullExpressionValue(customKeysAndValues, "builder.build()");
        return customKeysAndValues;
    }

    public final void key(String object, double d2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.crashlytics;
        if (object2 != null) {
            ((FirebaseCrashlytics)object2).setCustomKey((String)object, d2);
            object = Unit.a;
        } else {
            object2 = this.builder;
            object = ((CustomKeysAndValues$Builder)object2).putDouble((String)object, d2);
            String string2 = "builder.putDouble(key, value)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
    }

    public final void key(String object, float f5) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.crashlytics;
        if (object2 != null) {
            ((FirebaseCrashlytics)object2).setCustomKey((String)object, f5);
            object = Unit.a;
        } else {
            object2 = this.builder;
            object = ((CustomKeysAndValues$Builder)object2).putFloat((String)object, f5);
            String string2 = "builder.putFloat(key, value)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
    }

    public final void key(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.crashlytics;
        if (object2 != null) {
            ((FirebaseCrashlytics)object2).setCustomKey((String)object, n3);
            object = Unit.a;
        } else {
            object2 = this.builder;
            object = ((CustomKeysAndValues$Builder)object2).putInt((String)object, n3);
            String string2 = "builder.putInt(key, value)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
    }

    public final void key(String object, long l2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.crashlytics;
        if (object2 != null) {
            ((FirebaseCrashlytics)object2).setCustomKey((String)object, l2);
            object = Unit.a;
        } else {
            object2 = this.builder;
            object = ((CustomKeysAndValues$Builder)object2).putLong((String)object, l2);
            String string2 = "builder.putLong(key, value)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
    }

    public final void key(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(string2, "value");
        Object object2 = this.crashlytics;
        if (object2 != null) {
            ((FirebaseCrashlytics)object2).setCustomKey((String)object, string2);
            object = Unit.a;
        } else {
            object2 = this.builder;
            object = ((CustomKeysAndValues$Builder)object2).putString((String)object, string2);
            string2 = "builder.putString(key, value)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
    }

    public final void key(String object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.crashlytics;
        if (object2 != null) {
            ((FirebaseCrashlytics)object2).setCustomKey((String)object, bl2);
            object = Unit.a;
        } else {
            object2 = this.builder;
            object = ((CustomKeysAndValues$Builder)object2).putBoolean((String)object, bl2);
            String string2 = "builder.putBoolean(key, value)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
    }
}

