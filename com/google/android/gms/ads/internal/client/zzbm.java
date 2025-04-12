/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzbm
extends zzbae
implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 4;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            return false;
                        }
                        Object object = zzl.CREATOR;
                        object = (zzl)zzbaf.zza(parcel, object);
                        n7 = parcel.readInt();
                        zzbaf.zzc(parcel);
                        this.zzh((zzl)object, n7);
                        parcel2.writeNoException();
                    } else {
                        String string2 = this.zzf();
                        parcel2.writeNoException();
                        parcel2.writeString(string2);
                    }
                } else {
                    n3 = (int)(this.zzi() ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n3);
                }
            } else {
                String string3 = this.zze();
                parcel2.writeNoException();
                parcel2.writeString(string3);
            }
        } else {
            Object object = zzl.CREATOR;
            object = (zzl)zzbaf.zza(parcel, object);
            zzbaf.zzc(parcel);
            this.zzg((zzl)object);
            parcel2.writeNoException();
        }
        return n4 != 0;
    }
}

