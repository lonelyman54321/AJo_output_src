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

public class zzbad
implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zzbad(IBinder iBinder, String string2) {
        this.zza = iBinder;
        this.zzb = string2;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel parcel = Parcel.obtain();
        String string2 = this.zzb;
        parcel.writeInterfaceToken(string2);
        return parcel;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Parcel zzdb(int n3, Parcel parcel) {
        Throwable throwable2222222;
        block4: {
            Parcel parcel2 = Parcel.obtain();
            IBinder iBinder = this.zza;
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (RuntimeException runtimeException) {}
                {
                    parcel2.recycle();
                    throw runtimeException;
                }
            }
            parcel.recycle();
            return parcel2;
        }
        parcel.recycle();
        throw throwable2222222;
    }

    public final void zzdc(int n3, Parcel parcel) {
        Parcel parcel2 = Parcel.obtain();
        try {
            IBinder iBinder = this.zza;
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel.recycle();
            parcel2.recycle();
        }
    }

    public final void zzdd(int n3, Parcel parcel) {
        try {
            IBinder iBinder = this.zza;
            int n4 = 1;
            iBinder.transact(n3, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

