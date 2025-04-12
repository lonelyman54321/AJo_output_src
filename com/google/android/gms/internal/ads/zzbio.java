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
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzbip;
import java.util.List;

public abstract class zzbio
extends zzbae
implements zzbip {
    public zzbio() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbip zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        boolean bl2 = iInterface instanceof zzbip;
        if (bl2) {
            return (zzbip)iInterface;
        }
        iInterface = new zzbin(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 17: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                n3 = (int)(this.zzr(iObjectWrapper) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 16: {
                zzbhs zzbhs2 = this.zzf();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbhs2);
                break;
            }
            case 15: {
                this.zzm();
                parcel2.writeNoException();
                break;
            }
            case 14: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzp(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                n3 = (int)(this.zzt() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 12: {
                n3 = (int)(this.zzq() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 11: {
                parcel2.writeNoException();
                n3 = 0;
                Object var5_8 = null;
                zzbaf.zzf(parcel2, null);
                break;
            }
            case 10: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                n3 = (int)(this.zzs(iObjectWrapper) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 9: {
                IObjectWrapper iObjectWrapper = this.zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 8: {
                this.zzl();
                parcel2.writeNoException();
                break;
            }
            case 7: {
                zzdq zzdq2 = this.zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                break;
            }
            case 6: {
                this.zzo();
                parcel2.writeNoException();
                break;
            }
            case 5: {
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzn(string2);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                String string3 = this.zzi();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 3: {
                List list = this.zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(list);
                break;
            }
            case 2: {
                Object object = parcel.readString();
                zzbaf.zzc(parcel);
                object = this.zzg((String)object);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, (IInterface)object);
                break;
            }
            case 1: {
                String string4 = parcel.readString();
                zzbaf.zzc(parcel);
                string4 = this.zzj(string4);
                parcel2.writeNoException();
                parcel2.writeString(string4);
            }
        }
        return true;
    }
}

