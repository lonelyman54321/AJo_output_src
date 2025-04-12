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
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.internal.auth-api.zba;
import com.google.android.gms.internal.auth-api.zbc;
import com.google.android.gms.internal.auth-api.zbz;

public final class zbaa
extends zba
implements IInterface {
    public zbaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbz zbz2, AuthorizationRequest authorizationRequest) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbz2);
        zbc.zbc(parcel, authorizationRequest);
        this.zbb(1, parcel);
    }
}

