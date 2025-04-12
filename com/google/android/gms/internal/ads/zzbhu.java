/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;

public abstract class zzbhu
extends zzbae
implements zzbhv {
    public zzbhu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbhv zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        boolean bl2 = iInterface instanceof zzbhv;
        if (bl2) {
            return (zzbhv)iInterface;
        }
        iInterface = new zzbht(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            return false;
                        }
                        n3 = this.zzc();
                        parcel2.writeNoException();
                        parcel2.writeInt(n3);
                    } else {
                        n3 = this.zzd();
                        parcel2.writeNoException();
                        parcel2.writeInt(n3);
                    }
                } else {
                    double d2 = this.zzb();
                    parcel2.writeNoException();
                    parcel2.writeDouble(d2);
                }
            } else {
                Uri uri = this.zze();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)uri);
            }
        } else {
            IObjectWrapper iObjectWrapper = this.zzf();
            parcel2.writeNoException();
            zzbaf.zzf(parcel2, iObjectWrapper);
        }
        return n7;
    }
}

