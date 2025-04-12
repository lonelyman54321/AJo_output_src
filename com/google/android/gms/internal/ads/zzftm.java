/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzftn;

public abstract class zzftm
extends zzbae
implements zzftn {
    public zzftm() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 8: {
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                parcel.readString();
                parcel.readString();
                zzbaf.zzc(parcel);
                break;
            }
            case 7: {
                parcel.readInt();
                zzbaf.zzc(parcel);
                break;
            }
            case 6: {
                parcel.readInt();
                zzbaf.zzc(parcel);
                break;
            }
            case 5: {
                parcel.createByteArray();
                zzbaf.zzc(parcel);
                break;
            }
            case 4: {
                parcel.createIntArray();
                zzbaf.zzc(parcel);
                break;
            }
            case 2: {
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                parcel.readString();
                zzbaf.zzc(parcel);
            }
            case 3: 
        }
        parcel2.writeNoException();
        return true;
    }
}

