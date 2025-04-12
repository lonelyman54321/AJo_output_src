/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbho;
import java.util.List;

public abstract class zzbhn
extends zzbae
implements zzbho {
    public zzbhn() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbho zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        boolean bl2 = iInterface instanceof zzbho;
        if (bl2) {
            return (zzbho)iInterface;
        }
        iInterface = new zzbhm(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 != n7) {
            n7 = 3;
            if (n3 != n7) {
                return false;
            }
            List list = this.zzh();
            parcel2.writeNoException();
            parcel2.writeList(list);
        } else {
            String string2 = this.zzg();
            parcel2.writeNoException();
            parcel2.writeString(string2);
        }
        return true;
    }
}

