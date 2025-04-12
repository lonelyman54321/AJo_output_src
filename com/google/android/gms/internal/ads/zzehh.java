/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.view.InputEvent
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

public final class zzehh {
    private ml1_0 zza;
    private final Context zzb;

    public zzehh(Context context) {
        this.zzb = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza() {
        try {
            Object object = this.zzb;
            object = ml1_0.a(object);
            this.zza = object;
            if (object != null) return object.b();
            String string2 = "MeasurementManagerFutures is null";
            object = new IllegalStateException(string2);
            return zzgft.zzg((Throwable)object);
        }
        catch (Exception exception) {
            return zzgft.zzg(exception);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        ml1_0 ml1_02;
        try {
            ml1_02 = this.zza;
        }
        catch (Exception exception) {
            return zzgft.zzg(exception);
        }
        Objects.requireNonNull(ml1_02);
        return ml1_02.c(uri, inputEvent);
    }
}

