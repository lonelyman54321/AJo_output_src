/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.firebase.analytics;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

public final class ParametersBuilder {
    private final Bundle zza;

    public ParametersBuilder() {
        Bundle bundle;
        this.zza = bundle = new Bundle();
    }

    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(String string2, double d2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.zza.putDouble(string2, d2);
    }

    public final void param(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.zza.putLong(string2, l2);
    }

    public final void param(String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(bundle, "value");
        this.zza.putBundle(string2, bundle);
    }

    public final void param(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.zza.putString(string2, string3);
    }

    public final void param(String string2, Bundle[] bundleArray) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(bundleArray, "value");
        Bundle bundle = this.zza;
        bundleArray = (Parcelable[])bundleArray;
        bundle.putParcelableArray(string2, (Parcelable[])bundleArray);
    }
}

