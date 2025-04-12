/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzar;
import com.google.android.gms.internal.gtm.zzhd;

public final class zzhb
extends zzar
implements zzhd {
    public zzhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    public final void zze(boolean bl2, String string2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        parcel.writeString(string2);
        this.zzm(1, parcel);
    }
}

