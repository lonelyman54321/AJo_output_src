/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbwf;
import java.util.Map;

public final class zzbwe
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final View zza;
    public final Map zzb;

    static {
        zzbwf zzbwf2 = new zzbwf();
        CREATOR = zzbwf2;
    }

    public zzbwe(IBinder object, IBinder iBinder) {
        object = (View)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(object));
        this.zza = object;
        object = (Map)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder));
        this.zzb = object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        View view = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        view = ObjectWrapper.wrap(view).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 1, (IBinder)view, false);
        view = ObjectWrapper.wrap(this.zzb).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 2, (IBinder)view, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

