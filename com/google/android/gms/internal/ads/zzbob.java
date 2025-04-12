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
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbof;

public abstract class zzbob
extends zzbae
implements zzboc {
    public zzbob() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 3;
        if (n3 != n4) {
            n4 = 4;
            if (n3 != n4) {
                n4 = 5;
                if (n3 != n4) {
                    n4 = 6;
                    if (n3 != n4) {
                        int n7 = 7;
                        if (n3 != n7) {
                            return false;
                        }
                        zzbhs zzbhs2 = this.zzc();
                        parcel2.writeNoException();
                        zzbaf.zzf(parcel2, zzbhs2);
                    } else {
                        IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                        zzbaf.zzc(parcel);
                        this.zze(iObjectWrapper);
                        parcel2.writeNoException();
                    }
                } else {
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    Object object = parcel.readStrongBinder();
                    if (object == null) {
                        n4 = 0;
                        object = null;
                    } else {
                        IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                        boolean bl2 = iInterface instanceof zzbof;
                        if (bl2) {
                            object = iInterface;
                            object = (zzbof)iInterface;
                        } else {
                            iInterface = new zzbod((IBinder)object);
                            object = iInterface;
                        }
                    }
                    zzbaf.zzc(parcel);
                    this.zzf(iObjectWrapper, (zzbof)object);
                    parcel2.writeNoException();
                }
            } else {
                this.zzd();
                parcel2.writeNoException();
            }
        } else {
            zzdq zzdq2 = this.zzb();
            parcel2.writeNoException();
            zzbaf.zzf(parcel2, zzdq2);
        }
        return true;
    }
}

