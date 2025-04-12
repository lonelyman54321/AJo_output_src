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
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.internal.auth-api.zba;
import com.google.android.gms.internal.auth-api.zbaj;
import com.google.android.gms.internal.auth-api.zbal;
import com.google.android.gms.internal.auth-api.zbc;

public final class zbad
extends zba
implements IInterface {
    public zbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaj zbaj2, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbaj2);
        zbc.zbc(parcel, saveAccountLinkingTokenRequest);
        this.zbb(1, parcel);
    }

    public final void zbd(zbal zbal2, SavePasswordRequest savePasswordRequest) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbal2);
        zbc.zbc(parcel, savePasswordRequest);
        this.zbb(2, parcel);
    }
}

