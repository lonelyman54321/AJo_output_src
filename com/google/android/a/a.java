/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a
implements IInterface {
    private final IBinder a;
    private final String b;

    public a(IBinder iBinder) {
        this.a = iBinder;
        this.b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
    }

    public final Parcel a() {
        Parcel parcel = Parcel.obtain();
        String string2 = this.b;
        parcel.writeInterfaceToken(string2);
        return parcel;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Parcel b(Parcel parcel) {
        Throwable throwable2222222;
        block4: {
            Parcel parcel2 = Parcel.obtain();
            IBinder iBinder = this.a;
            int n3 = 1;
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
}

