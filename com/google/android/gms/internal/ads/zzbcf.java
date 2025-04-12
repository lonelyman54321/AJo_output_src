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
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbck;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcn;

public abstract class zzbcf
extends zzbae
implements zzbcg {
    public zzbcf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 7: {
                zzdg zzdg2 = zzdf.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzh(zzdg2);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzg(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                zzdn zzdn2 = this.zzf();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdn2);
                break;
            }
            case 4: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    n4 = 0;
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    boolean bl2 = iInterface instanceof zzbcn;
                    if (bl2) {
                        object = iInterface;
                        object = (zzbcn)iInterface;
                    } else {
                        iInterface = new zzbcl((IBinder)object);
                        object = iInterface;
                    }
                }
                zzbaf.zzc(parcel);
                this.zzi(iObjectWrapper, (zzbcn)object);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                String string2;
                Object object = parcel.readStrongBinder();
                if (object != null && (n4 = (object = object.queryLocalInterface(string2 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback")) instanceof zzbck) != 0) {
                    object = (zzbck)object;
                }
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                zzbu zzbu2 = this.zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbu2);
            }
        }
        return true;
    }
}

