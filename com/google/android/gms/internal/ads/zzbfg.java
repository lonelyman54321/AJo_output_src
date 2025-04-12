/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbfh;

public abstract class zzbfg
extends zzbae
implements zzbfh {
    public zzbfg() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    int n8 = 4;
                    if (n3 != n8) {
                        n8 = 5;
                        if (n3 != n8) {
                            return false;
                        }
                        this.zzf();
                        parcel2.writeNoException();
                    } else {
                        this.zze();
                        parcel2.writeNoException();
                    }
                } else {
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    this.zzd(iObjectWrapper);
                    parcel2.writeNoException();
                }
            } else {
                String string2 = this.zzc();
                parcel2.writeNoException();
                parcel2.writeString(string2);
            }
        } else {
            String string3 = this.zzb();
            parcel2.writeNoException();
            parcel2.writeString(string3);
        }
        return n4 != 0;
    }
}

