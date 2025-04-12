/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbr;
import com.google.android.gms.internal.auth-api.zba;
import com.google.android.gms.internal.auth-api.zbc;

public final class zbs
extends zba
implements IInterface {
    public zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbr2, GoogleSignInOptions googleSignInOptions) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbr2);
        zbc.zbc(parcel, googleSignInOptions);
        this.zbb(103, parcel);
    }

    public final void zbd(zbr zbr2, GoogleSignInOptions googleSignInOptions) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbr2);
        zbc.zbc(parcel, googleSignInOptions);
        this.zbb(102, parcel);
    }

    public final void zbe(zbr zbr2, GoogleSignInOptions googleSignInOptions) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbr2);
        zbc.zbc(parcel, googleSignInOptions);
        this.zbb(101, parcel);
    }
}

