/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.internal.a;
import com.google.android.play.core.assetpacks.internal.c;

public final class k
extends a
implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void c(Bundle bundle) {
        Parcel parcel = this.a();
        c.c(parcel, (Parcelable)bundle);
        this.b(4, parcel);
    }

    public final void d(Bundle bundle) {
        Parcel parcel = this.a();
        c.c(parcel, (Parcelable)bundle);
        this.b(3, parcel);
    }

    public final void e(Bundle bundle, Bundle bundle2) {
        Parcel parcel = this.a();
        c.c(parcel, (Parcelable)bundle);
        c.c(parcel, (Parcelable)bundle2);
        this.b(2, parcel);
    }
}

