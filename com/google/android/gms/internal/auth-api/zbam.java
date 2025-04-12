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
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.auth-api.zba;
import com.google.android.gms.internal.auth-api.zbac;
import com.google.android.gms.internal.auth-api.zbaf;
import com.google.android.gms.internal.auth-api.zbah;
import com.google.android.gms.internal.auth-api.zbc;

public final class zbam
extends zba
implements IInterface {
    public zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbac2, BeginSignInRequest beginSignInRequest) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbac2);
        zbc.zbc(parcel, beginSignInRequest);
        this.zbb(1, parcel);
    }

    public final void zbd(zbaf zbaf2, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String string2) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbaf2);
        zbc.zbc(parcel, getPhoneNumberHintIntentRequest);
        parcel.writeString(string2);
        this.zbb(4, parcel);
    }

    public final void zbe(zbah zbah2, GetSignInIntentRequest getSignInIntentRequest) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, zbah2);
        zbc.zbc(parcel, getSignInIntentRequest);
        this.zbb(3, parcel);
    }

    public final void zbf(IStatusCallback iStatusCallback, String string2) {
        Parcel parcel = this.zba();
        zbc.zbd(parcel, iStatusCallback);
        parcel.writeString(string2);
        this.zbb(2, parcel);
    }
}

