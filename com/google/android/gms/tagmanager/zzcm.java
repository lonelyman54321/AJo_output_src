/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.tagmanager.zzbz;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzci;
import com.google.android.gms.tagmanager.zzck;
import com.google.android.gms.tagmanager.zzcl;
import com.google.android.gms.tagmanager.zzcn;

public abstract class zzcm
extends zzas
implements zzcn {
    public zzcm() {
        super("com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public static zzcn asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
        boolean bl2 = iInterface instanceof zzcn;
        if (bl2) {
            return (zzcn)iInterface;
        }
        iInterface = new zzcl(iBinder);
        return iInterface;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        Object object = "com.google.android.gms.tagmanager.ICustomEvaluatorProxy";
        Object object2 = "com.google.android.gms.tagmanager.IMeasurementProxy";
        int n7 = 1;
        boolean bl2 = false;
        Object object3 = null;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                Object object4;
                n8 = 3;
                if (n3 != n8) {
                    return false;
                }
                Parcelable.Creator creator = Intent.CREATOR;
                Parcelable.Creator creator2 = creator = zzat.zza(parcel, creator);
                creator2 = (Intent)creator;
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapper2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                creator = parcel.readStrongBinder();
                if (creator == null) {
                    object4 = null;
                } else {
                    n8 = (object2 = creator.queryLocalInterface((String)object2)) instanceof zzck;
                    object2 = n8 != 0 ? (zzck)object2 : new zzci((IBinder)creator);
                    object4 = object2;
                }
                creator = parcel.readStrongBinder();
                if (creator != null) {
                    boolean bl3 = (object = creator.queryLocalInterface((String)object)) instanceof zzcb;
                    if (bl3) {
                        object3 = object;
                        object3 = (zzcb)object;
                    } else {
                        object3 = new zzbz((IBinder)creator);
                    }
                }
                zzat.zzc(parcel);
                zzcm zzcm2 = this;
                this.previewIntent((Intent)creator2, iObjectWrapper, iObjectWrapper2, (zzck)object4, (zzcb)object3);
            } else {
                Parcelable.Creator creator = Intent.CREATOR;
                creator = (Intent)zzat.zza(parcel, creator);
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzat.zzc(parcel);
                this.preview((Intent)creator, (IObjectWrapper)object);
            }
        } else {
            IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            IBinder iBinder = parcel.readStrongBinder();
            if (iBinder == null) {
                boolean bl4 = false;
                object2 = null;
            } else {
                boolean bl5 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzck;
                object2 = bl5 ? (zzck)object2 : new zzci(iBinder);
            }
            iBinder = parcel.readStrongBinder();
            if (iBinder != null) {
                bl2 = (object = iBinder.queryLocalInterface((String)object)) instanceof zzcb;
                if (bl2) {
                    object3 = object;
                    object3 = (zzcb)object;
                } else {
                    object3 = new zzbz(iBinder);
                }
            }
            zzat.zzc(parcel);
            this.initialize(iObjectWrapper, (zzck)object2, (zzcb)object3);
        }
        parcel2.writeNoException();
        return n7;
    }
}

