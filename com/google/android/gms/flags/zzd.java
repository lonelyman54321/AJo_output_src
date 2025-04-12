/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.flags.zzc;
import com.google.android.gms.flags.zze;
import com.google.android.gms.internal.flags.zzb;

public abstract class zzd
extends zzb
implements zzc {
    public zzd() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static zzc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        boolean bl2 = iInterface instanceof zzc;
        if (bl2) {
            return (zzc)iInterface;
        }
        iInterface = new zze(iBinder);
        return iInterface;
    }

    public final boolean dispatchTransaction(int n3, Parcel parcel, Parcel parcel2, int n4) {
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
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        int n8 = parcel.readInt();
                        string2 = this.getStringFlagValue(string2, string3, n8);
                        parcel2.writeNoException();
                        parcel2.writeString(string2);
                    } else {
                        String string4 = parcel.readString();
                        long l2 = parcel.readLong();
                        int n10 = parcel.readInt();
                        long l3 = this.getLongFlagValue(string4, l2, n10);
                        parcel2.writeNoException();
                        parcel2.writeLong(l3);
                    }
                } else {
                    String string5 = parcel.readString();
                    n7 = parcel.readInt();
                    int n14 = parcel.readInt();
                    n3 = this.getIntFlagValue(string5, n7, n14);
                    parcel2.writeNoException();
                    parcel2.writeInt(n3);
                }
            } else {
                String string6 = parcel.readString();
                n7 = (int)(com.google.android.gms.internal.flags.zzc.zza(parcel) ? 1 : 0);
                int n15 = parcel.readInt();
                n3 = (int)(this.getBooleanFlagValue(string6, n7 != 0, n15) ? 1 : 0);
                parcel2.writeNoException();
                com.google.android.gms.internal.flags.zzc.writeBoolean(parcel2, n3 != 0);
            }
        } else {
            IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            this.init(iObjectWrapper);
            parcel2.writeNoException();
        }
        return n4 != 0;
    }
}

