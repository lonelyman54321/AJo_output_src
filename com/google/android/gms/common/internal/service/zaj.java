/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.internal.service.zak;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zaj
extends zab
implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    public final boolean zaa(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            n3 = parcel.readInt();
            zac.zab(parcel);
            this.zab(n3);
            return n7;
        }
        return false;
    }
}

