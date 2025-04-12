/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbal;
import com.google.android.gms.internal.auth-api.zbb;
import com.google.android.gms.internal.auth-api.zbc;

public abstract class zbak
extends zbb
implements zbal {
    public zbak() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    public final boolean zba(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zbc.zba(parcel, object);
            Object object2 = SavePasswordResult.CREATOR;
            object2 = (SavePasswordResult)zbc.zba(parcel, object2);
            zbc.zbb(parcel);
            this.zbb((Status)object, (SavePasswordResult)object2);
            return n7;
        }
        return false;
    }
}

