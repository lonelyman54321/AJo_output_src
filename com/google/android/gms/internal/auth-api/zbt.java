/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.internal.auth-api.zba;
import com.google.android.gms.internal.auth-api.zbc;
import com.google.android.gms.internal.auth-api.zbp;
import com.google.android.gms.internal.auth-api.zbs;
import com.google.android.gms.internal.auth-api.zbu;

public final class zbt
extends zba
implements IInterface {
    public zbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zbc(zbs zbs2, zbp zbp2) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbs2);
        zbc.zbc(parcel, zbp2);
        this.zbb(3, parcel);
    }

    public final void zbd(zbs zbs2, CredentialRequest credentialRequest) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbs2);
        zbc.zbc(parcel, credentialRequest);
        this.zbb(1, parcel);
    }

    public final void zbe(zbs zbs2, zbu zbu2) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbs2);
        zbc.zbc(parcel, zbu2);
        this.zbb(2, parcel);
    }

    public final void zbf(zbs zbs2) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbs2);
        this.zbb(4, parcel);
    }
}

