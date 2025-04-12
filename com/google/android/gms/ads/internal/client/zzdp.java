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
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzdp
extends zzbae
implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzdq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        boolean bl2 = iInterface instanceof zzdq;
        if (bl2) {
            return (zzdq)iInterface;
        }
        iInterface = new zzdo(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 13: {
                this.zzn();
                parcel2.writeNoException();
                break;
            }
            case 12: {
                n3 = (int)(this.zzo() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 11: {
                zzdt zzdt2 = this.zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdt2);
                break;
            }
            case 10: {
                n3 = (int)(this.zzp() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 9: {
                float f5 = this.zze();
                parcel2.writeNoException();
                parcel2.writeFloat(f5);
                break;
            }
            case 8: {
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    n3 = 0;
                    float f6 = 0.0f;
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    boolean bl2 = iInterface instanceof zzdt;
                    if (bl2) {
                        object = iInterface;
                        object = (zzdt)iInterface;
                    } else {
                        iInterface = new zzdr((IBinder)object);
                        object = iInterface;
                    }
                }
                zzbaf.zzc(parcel);
                this.zzm((zzdt)object);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                float f7 = this.zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(f7);
                break;
            }
            case 6: {
                float f8 = this.zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(f8);
                break;
            }
            case 5: {
                n3 = this.zzh();
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 4: {
                n3 = (int)(this.zzq() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 3: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzj(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                this.zzk();
                parcel2.writeNoException();
                break;
            }
            case 1: {
                this.zzl();
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

