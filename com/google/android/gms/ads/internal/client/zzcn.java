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
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.List;

public abstract class zzcn
extends zzbae
implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 18: {
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzt(string2);
                parcel2.writeNoException();
                break;
            }
            case 17: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzj(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 16: {
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    n3 = 0;
                    float f5 = 0.0f;
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    boolean bl2 = iInterface instanceof zzda;
                    if (bl2) {
                        object = iInterface;
                        object = (zzda)iInterface;
                    } else {
                        iInterface = new zzcy((IBinder)object);
                        object = iInterface;
                    }
                }
                zzbaf.zzc(parcel);
                this.zzm((zzda)object);
                parcel2.writeNoException();
                break;
            }
            case 15: {
                this.zzi();
                parcel2.writeNoException();
                break;
            }
            case 14: {
                Object object = zzff.CREATOR;
                object = (zzff)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzu((zzff)object);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                List list = this.zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                break;
            }
            case 12: {
                zzbnu zzbnu2 = zzbnt.zzc(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzs(zzbnu2);
                parcel2.writeNoException();
                break;
            }
            case 11: {
                zzbrf zzbrf2 = zzbre.zzf(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzo(zzbrf2);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                String string3 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzh(string3);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                String string4 = this.zzf();
                parcel2.writeNoException();
                parcel2.writeString(string4);
                break;
            }
            case 8: {
                n3 = (int)(this.zzv() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 7: {
                float f6 = this.zze();
                parcel2.writeNoException();
                parcel2.writeFloat(f6);
                break;
            }
            case 6: {
                String string5 = parcel.readString();
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzl(string5, iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                String string6 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzn(iObjectWrapper, string6);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzp(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                String string7 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzr(string7);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                float f7 = parcel.readFloat();
                zzbaf.zzc(parcel);
                this.zzq(f7);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                this.zzk();
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

