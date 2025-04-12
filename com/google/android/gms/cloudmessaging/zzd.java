/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.IMessengerCompat;
import com.google.android.gms.cloudmessaging.zzb;

public final class zzd
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    Messenger zza;
    IMessengerCompat zzb;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public zzd(IBinder iBinder) {
        Messenger messenger;
        this.zza = messenger = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        IBinder iBinder;
        if (object == null) {
            return false;
        }
        try {
            iBinder = this.zza();
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        object = (zzd)object;
        object = ((zzd)object).zza();
        return iBinder.equals(object);
    }

    public final int hashCode() {
        return this.zza().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Messenger messenger = this.zza;
        if (messenger != null) {
            messenger = messenger.getBinder();
            parcel.writeStrongBinder((IBinder)messenger);
            return;
        }
        messenger = this.zzb.asBinder();
        parcel.writeStrongBinder((IBinder)messenger);
    }

    public final IBinder zza() {
        Messenger messenger = this.zza;
        messenger = messenger != null ? messenger.getBinder() : this.zzb.asBinder();
        return messenger;
    }

    public final void zzb(Message message) {
        Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        this.zzb.send(message);
    }
}

