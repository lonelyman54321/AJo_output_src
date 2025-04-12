/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

final class zzd
implements Callable {
    private final /* synthetic */ FirebaseAnalytics zza;

    public zzd(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    public final /* synthetic */ Object call() {
        return FirebaseAnalytics.zza(this.zza).zzc();
    }
}

