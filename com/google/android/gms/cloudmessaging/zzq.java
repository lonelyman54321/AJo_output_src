/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 */
package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

final class zzq {
    private final Messenger zza;
    private final zzd zzb;

    public zzq(IBinder object) {
        Object object2 = object.getInterfaceDescriptor();
        String string2 = "android.os.IMessenger";
        boolean bl2 = Objects.equals(object2, string2);
        if (bl2) {
            super(object);
            this.zza = object2;
            this.zzb = null;
            return;
        }
        string2 = "com.google.android.gms.iid.IMessengerCompat";
        bl2 = Objects.equals(object2, string2);
        if (bl2) {
            this.zzb = object2 = new zzd((IBinder)object);
            this.zza = null;
            return;
        }
        object = String.valueOf(object2);
        "Invalid interface descriptor: ".concat((String)object);
        super();
        throw object;
    }

    public final void zza(Message object) {
        Object object2 = this.zza;
        if (object2 != null) {
            object2.send(object);
            return;
        }
        object2 = this.zzb;
        if (object2 != null) {
            ((zzd)object2).zzb((Message)object);
            return;
        }
        object = new IllegalStateException("Both messengers are null");
        throw object;
    }
}

