/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.internal.common.zza;

public final class zzx
extends zza
implements ICancelToken {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    public final void cancel() {
        Parcel parcel = this.zza();
        this.zzD(2, parcel);
    }
}

