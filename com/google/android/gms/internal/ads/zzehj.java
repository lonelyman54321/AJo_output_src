/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.Intrinsics;

public final class zzehj {
    private final Context zza;

    public zzehj(Context context) {
        this.zza = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza(boolean bl2) {
        Object object;
        String string2 = "com.google.android.gms.ads";
        Object object2 = "adsSdkName";
        try {
            Intrinsics.checkNotNullParameter(string2, (String)object2);
            object2 = new mZ0(string2, bl2);
            object = this.zza;
            object = Uo3.a(object);
            if (object != null) {
                return object.b((mZ0)object2);
            }
        }
        catch (Exception exception) {
            return zzgft.zzg(exception);
        }
        object = new IllegalStateException();
        return zzgft.zzg((Throwable)object);
    }
}

