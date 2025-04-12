/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbac;
import com.google.android.gms.internal.auth-api.zbb;
import com.google.android.gms.internal.auth-api.zbc;

public abstract class zbab
extends zbb
implements zbac {
    public zbab() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    public final boolean zba(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zbc.zba(parcel, object);
            Object object2 = BeginSignInResult.CREATOR;
            object2 = (BeginSignInResult)zbc.zba(parcel, object2);
            zbc.zbb(parcel);
            this.zbb((Status)object, (BeginSignInResult)object2);
            return n7;
        }
        return false;
    }
}

