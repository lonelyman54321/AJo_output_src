/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbxd;
import com.google.android.gms.internal.ads.zzbxe;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbxu;

public abstract class zzbxc
extends zzbae
implements zzbxd {
    public zzbxc() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        boolean bl2 = false;
        Object object = null;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 4;
                String string2 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener";
                if (n3 != n7) {
                    n7 = 5;
                    if (n3 != n7) {
                        n7 = 6;
                        if (n3 != n7) {
                            n7 = 7;
                            if (n3 != n7) {
                                return false;
                            }
                            String string3 = parcel.readString();
                            IBinder iBinder = parcel.readStrongBinder();
                            if (iBinder != null) {
                                object = iBinder.queryLocalInterface(string2);
                                boolean bl3 = object instanceof zzbxn;
                                object = bl3 ? (zzbxn)object : new zzbxl(iBinder);
                            }
                            zzbaf.zzc(parcel);
                            this.zzh(string3, (zzbxn)object);
                            parcel2.writeNoException();
                        } else {
                            Object object2 = zzbxu.CREATOR;
                            object2 = (zzbxu)zzbaf.zza(parcel, object2);
                            IBinder iBinder = parcel.readStrongBinder();
                            if (iBinder != null) {
                                object = iBinder.queryLocalInterface(string2);
                                boolean bl4 = object instanceof zzbxn;
                                object = bl4 ? (zzbxn)object : new zzbxl(iBinder);
                            }
                            zzbaf.zzc(parcel);
                            this.zze((zzbxu)object2, (zzbxn)object);
                            parcel2.writeNoException();
                        }
                    } else {
                        Object object3 = zzbxu.CREATOR;
                        object3 = (zzbxu)zzbaf.zza(parcel, object3);
                        IBinder iBinder = parcel.readStrongBinder();
                        if (iBinder != null) {
                            object = iBinder.queryLocalInterface(string2);
                            boolean bl5 = object instanceof zzbxn;
                            object = bl5 ? (zzbxn)object : new zzbxl(iBinder);
                        }
                        zzbaf.zzc(parcel);
                        this.zzf((zzbxu)object3, (zzbxn)object);
                        parcel2.writeNoException();
                    }
                } else {
                    Object object4 = zzbxu.CREATOR;
                    object4 = (zzbxu)zzbaf.zza(parcel, object4);
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        object = iBinder.queryLocalInterface(string2);
                        boolean bl6 = object instanceof zzbxn;
                        object = bl6 ? (zzbxn)object : new zzbxl(iBinder);
                    }
                    zzbaf.zzc(parcel);
                    this.zzg((zzbxu)object4, (zzbxn)object);
                    parcel2.writeNoException();
                }
            } else {
                Object object5 = zzbws.CREATOR;
                object5 = (zzbws)zzbaf.zza(parcel, object5);
                object5 = parcel.readStrongBinder();
                if (object5 != null && (bl2 = (object5 = object5.queryLocalInterface((String)(object = "com.google.android.gms.ads.internal.request.IAdResponseListener"))) instanceof zzbxe)) {
                    object5 = (zzbxe)object5;
                }
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
            }
        } else {
            Object object6 = zzbws.CREATOR;
            object6 = (zzbws)zzbaf.zza(parcel, object6);
            zzbaf.zzc(parcel);
            parcel2.writeNoException();
            zzbaf.zze(parcel2, null);
        }
        return n4 != 0;
    }
}

