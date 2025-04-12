/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvv;
import java.util.List;

public abstract class zzbvu
extends zzbae
implements zzbvv {
    public zzbvu() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbvv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        boolean bl2 = iInterface instanceof zzbvv;
        if (bl2) {
            return (zzbvv)iInterface;
        }
        iInterface = new zzbvt(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            String string2 = parcel.readString();
            zzbaf.zzc(parcel);
            this.zze(string2);
        } else {
            Object object = Uri.CREATOR;
            object = parcel.createTypedArrayList(object);
            zzbaf.zzc(parcel);
            this.zzf((List)object);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

