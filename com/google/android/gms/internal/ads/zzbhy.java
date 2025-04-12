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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhz;

public abstract class zzbhy
extends zzbae
implements zzbhz {
    public zzbhy() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbhz zzdA(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        boolean bl2 = iInterface instanceof zzbhz;
        if (bl2) {
            return (zzbhz)iInterface;
        }
        iInterface = new zzbhx(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 9: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzdy(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    n3 = 0;
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    boolean bl2 = iInterface instanceof zzbhs;
                    if (bl2) {
                        object = iInterface;
                        object = (zzbhs)iInterface;
                    } else {
                        iInterface = new zzbhq((IBinder)object);
                        object = iInterface;
                    }
                }
                zzbaf.zzc(parcel);
                this.zzdx((zzbhs)object);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzd(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzdw(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                parcel.readInt();
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                this.zzc();
                parcel2.writeNoException();
                break;
            }
            case 3: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzdz(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                Object object = parcel.readString();
                zzbaf.zzc(parcel);
                object = this.zzb((String)object);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, (IInterface)object);
                break;
            }
            case 1: {
                String string2 = parcel.readString();
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzdv(string2, iObjectWrapper);
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

