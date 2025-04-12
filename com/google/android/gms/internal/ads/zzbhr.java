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
import com.google.android.gms.internal.ads.zzbjd;

public abstract class zzbhr
extends zzbae
implements zzbhs {
    public zzbhr() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 10: {
                n3 = (int)(this.zzk() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 9: {
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    n3 = 0;
                    float f5 = 0.0f;
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    boolean bl2 = iInterface instanceof zzbjd;
                    if (bl2) {
                        object = iInterface;
                        object = (zzbjd)iInterface;
                    } else {
                        iInterface = new zzbjd((IBinder)object);
                        object = iInterface;
                    }
                }
                zzbaf.zzc(parcel);
                this.zzm((zzbjd)object);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                n3 = (int)(this.zzl() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 7: {
                zzdq zzdq2 = this.zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                break;
            }
            case 6: {
                float f6 = this.zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(f6);
                break;
            }
            case 5: {
                float f7 = this.zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(f7);
                break;
            }
            case 4: {
                IObjectWrapper iObjectWrapper = this.zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 3: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzj(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                float f8 = this.zze();
                parcel2.writeNoException();
                parcel2.writeFloat(f8);
            }
        }
        return true;
    }
}

