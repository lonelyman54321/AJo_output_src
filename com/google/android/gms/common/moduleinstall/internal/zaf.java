/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zae;
import com.google.android.gms.common.moduleinstall.internal.zah;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zaf
extends zaa
implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zae2, ApiFeatureRequest apiFeatureRequest) {
        Parcel parcel = this.zaa();
        zac.zad(parcel, zae2);
        zac.zac(parcel, apiFeatureRequest);
        this.zac(1, parcel);
    }

    public final void zaf(zae zae2, ApiFeatureRequest apiFeatureRequest) {
        Parcel parcel = this.zaa();
        zac.zad(parcel, zae2);
        zac.zac(parcel, apiFeatureRequest);
        this.zac(3, parcel);
    }

    public final void zag(zae zae2, ApiFeatureRequest apiFeatureRequest, zah zah2) {
        Parcel parcel = this.zaa();
        zac.zad(parcel, zae2);
        zac.zac(parcel, apiFeatureRequest);
        zac.zad(parcel, zah2);
        this.zac(2, parcel);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) {
        Parcel parcel = this.zaa();
        zac.zad(parcel, iStatusCallback);
        zac.zac(parcel, apiFeatureRequest);
        this.zac(4, parcel);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zah2) {
        Parcel parcel = this.zaa();
        zac.zad(parcel, iStatusCallback);
        zac.zad(parcel, zah2);
        this.zac(6, parcel);
    }
}

