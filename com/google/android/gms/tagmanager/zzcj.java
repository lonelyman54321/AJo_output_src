/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.tagmanager.zzcc;
import com.google.android.gms.tagmanager.zzce;
import com.google.android.gms.tagmanager.zzcf;
import com.google.android.gms.tagmanager.zzch;
import com.google.android.gms.tagmanager.zzck;
import java.util.Map;

public abstract class zzcj
extends zzas
implements zzck {
    public zzcj() {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 2;
        if (n3 != n4) {
            n4 = 11;
            if (n3 != n4) {
                n4 = 21;
                boolean bl2 = false;
                IInterface iInterface = null;
                if (n3 != n4) {
                    n4 = 22;
                    if (n3 != n4) {
                        return false;
                    }
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface2 = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
                        bl2 = iInterface2 instanceof zzce;
                        if (bl2) {
                            iInterface = iInterface2;
                            iInterface = (zzce)iInterface2;
                        } else {
                            iInterface = new zzcc(iBinder);
                        }
                    }
                    zzat.zzc(parcel);
                    this.zzd((zzce)iInterface);
                    parcel2.writeNoException();
                } else {
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface3 = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                        bl2 = iInterface3 instanceof zzch;
                        if (bl2) {
                            iInterface = iInterface3;
                            iInterface = (zzch)iInterface3;
                        } else {
                            iInterface = new zzcf(iBinder);
                        }
                    }
                    zzat.zzc(parcel);
                    this.zze((zzch)iInterface);
                    parcel2.writeNoException();
                }
            } else {
                Map map2 = this.zzb();
                parcel2.writeNoException();
                parcel2.writeMap(map2);
            }
        } else {
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Parcelable.Creator creator2 = creator = zzat.zza(parcel, creator);
            creator2 = (Bundle)creator;
            long l2 = parcel.readLong();
            zzat.zzc(parcel);
            zzcj zzcj2 = this;
            this.zzc(string2, string3, (Bundle)creator2, l2);
            parcel2.writeNoException();
        }
        return true;
    }
}

