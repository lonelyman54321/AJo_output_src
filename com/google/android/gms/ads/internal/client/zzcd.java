/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrf;

public abstract class zzcd
extends zzbae
implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 0;
        Object object = null;
        switch (n3) {
            default: {
                return false;
            }
            case 17: {
                Object object2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = zzbre.zzf(parcel.readStrongBinder());
                int n7 = parcel.readInt();
                zzbaf.zzc(parcel);
                object2 = this.zzh((IObjectWrapper)object2, (zzbrf)object, n7);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object2);
                break;
            }
            case 16: {
                Object object3 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = zzbre.zzf(parcel.readStrongBinder());
                int n8 = parcel.readInt();
                zzbmo zzbmo2 = zzbmn.zzc(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                object3 = this.zzk((IObjectWrapper)object3, (zzbrf)object, n8, zzbmo2);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object3);
                break;
            }
            case 15: {
                Object object4 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = zzbre.zzf(parcel.readStrongBinder());
                int n10 = parcel.readInt();
                zzbaf.zzc(parcel);
                object4 = this.zzl((IObjectWrapper)object4, (zzbrf)object, n10);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object4);
                break;
            }
            case 14: {
                Object object5 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = zzbre.zzf(parcel.readStrongBinder());
                int n14 = parcel.readInt();
                zzbaf.zzc(parcel);
                object5 = this.zzp((IObjectWrapper)object5, (zzbrf)object, n14);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object5);
                break;
            }
            case 13: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Object object6 = zzq.CREATOR;
                Object object7 = object6 = zzbaf.zza(parcel, object6);
                object7 = (zzq)object6;
                String string2 = parcel.readString();
                zzbrf zzbrf2 = zzbre.zzf(parcel.readStrongBinder());
                int n15 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzcd zzcd2 = this;
                object6 = this.zzc(iObjectWrapper, (zzq)object7, string2, zzbrf2, n15);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, (IInterface)object6);
                break;
            }
            case 12: {
                Object object8 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = parcel.readString();
                zzbrf zzbrf3 = zzbre.zzf(parcel.readStrongBinder());
                int n16 = parcel.readInt();
                zzbaf.zzc(parcel);
                object8 = this.zzo((IObjectWrapper)object8, (String)object, zzbrf3, n16);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object8);
                break;
            }
            case 11: {
                Object object9 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                object9 = this.zzj((IObjectWrapper)object9, (IObjectWrapper)object, iObjectWrapper);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object9);
                break;
            }
            case 10: {
                Object object10 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = zzq.CREATOR;
                object = (zzq)zzbaf.zza(parcel, object);
                String string3 = parcel.readString();
                int n17 = parcel.readInt();
                zzbaf.zzc(parcel);
                object10 = this.zzf((IObjectWrapper)object10, (zzq)object, string3, n17);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object10);
                break;
            }
            case 9: {
                Object object11 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                n4 = parcel.readInt();
                zzbaf.zzc(parcel);
                object11 = this.zzg((IObjectWrapper)object11, n4);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object11);
                break;
            }
            case 8: {
                Object object12 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                object12 = this.zzm((IObjectWrapper)object12);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object12);
                break;
            }
            case 7: {
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                break;
            }
            case 6: {
                Object object13 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = zzbre.zzf(parcel.readStrongBinder());
                int n18 = parcel.readInt();
                zzbaf.zzc(parcel);
                object13 = this.zzn((IObjectWrapper)object13, (zzbrf)object, n18);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object13);
                break;
            }
            case 5: {
                Object object14 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                object14 = this.zzi((IObjectWrapper)object14, (IObjectWrapper)object);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object14);
                break;
            }
            case 4: {
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                break;
            }
            case 3: {
                Object object15 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = parcel.readString();
                zzbrf zzbrf4 = zzbre.zzf(parcel.readStrongBinder());
                int n19 = parcel.readInt();
                zzbaf.zzc(parcel);
                object15 = this.zzb((IObjectWrapper)object15, (String)object, zzbrf4, n19);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, object15);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Object object16 = zzq.CREATOR;
                Object object17 = object16 = zzbaf.zza(parcel, object16);
                object17 = (zzq)object16;
                String string4 = parcel.readString();
                zzbrf zzbrf5 = zzbre.zzf(parcel.readStrongBinder());
                int n20 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzcd zzcd3 = this;
                object16 = this.zze(iObjectWrapper, (zzq)object17, string4, zzbrf5, n20);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, (IInterface)object16);
                break;
            }
            case 1: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Object object18 = zzq.CREATOR;
                Object object19 = object18 = zzbaf.zza(parcel, object18);
                object19 = (zzq)object18;
                String string5 = parcel.readString();
                zzbrf zzbrf6 = zzbre.zzf(parcel.readStrongBinder());
                int n21 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzcd zzcd4 = this;
                object18 = this.zzd(iObjectWrapper, (zzq)object19, string5, zzbrf6, n21);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, (IInterface)object18);
            }
        }
        return true;
    }
}

