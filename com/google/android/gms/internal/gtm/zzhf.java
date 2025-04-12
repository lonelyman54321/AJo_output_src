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
package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.internal.gtm.zzhb;
import com.google.android.gms.internal.gtm.zzhd;
import com.google.android.gms.internal.gtm.zzhe;
import com.google.android.gms.internal.gtm.zzhg;

public abstract class zzhf
extends zzas
implements zzhg {
    public zzhf() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    public static zzhg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        boolean bl2 = iInterface instanceof zzhg;
        if (bl2) {
            return (zzhg)iInterface;
        }
        iInterface = new zzhe(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 101;
                    if (n3 != n7) {
                        int n8 = 102;
                        if (n3 != n8) {
                            return false;
                        }
                        this.zze();
                    } else {
                        String string2 = parcel.readString();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        Parcelable.Creator creator2 = creator = zzat.zza(parcel, creator);
                        creator2 = (Bundle)creator;
                        String string3 = parcel.readString();
                        long l2 = parcel.readLong();
                        boolean bl2 = zzat.zzf(parcel);
                        zzat.zzc(parcel);
                        zzhf zzhf2 = this;
                        this.zzf(string2, (Bundle)creator2, string3, l2, bl2);
                    }
                } else {
                    this.zzi();
                }
            } else {
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    boolean bl3 = iInterface instanceof zzhd;
                    if (bl3) {
                        object = iInterface;
                        object = (zzhd)iInterface;
                    } else {
                        iInterface = new zzhb((IBinder)object);
                        object = iInterface;
                    }
                }
                zzat.zzc(parcel);
                this.zzh(string4, string5, string6, (zzhd)object);
            }
        } else {
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            zzat.zzc(parcel);
            this.zzg(string7, string8, string9);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

