/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zzj
extends zzz {
    private final int zza;

    public zzj(byte[] byArray) {
        int n3;
        boolean bl2 = byArray.length;
        boolean bl3 = 25 != 0;
        bl2 = bl2 == bl3;
        Preconditions.checkArgument(bl2);
        this.zza = n3 = Arrays.hashCode(byArray);
    }

    public static byte[] zze(String string2) {
        Object object = "ISO-8859-1";
        try {
            return string2.getBytes((String)object);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = new AssertionError((Object)unsupportedEncodingException);
            throw object;
        }
    }

    public final boolean equals(Object object) {
        block11: {
            int n3;
            if (object != null && (n3 = object instanceof zzaa) != 0) {
                block10: {
                    try {
                        object = (zzaa)object;
                    }
                    catch (RemoteException remoteException) {}
                    n3 = object.zzc();
                    int n4 = this.zza;
                    if (n3 == n4) break block10;
                    return false;
                }
                object = object.zzd();
                if (object == null) break block11;
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                object = (byte[])object;
                byte[] byArray = this.zzf();
                return Arrays.equals(byArray, (byte[])object);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final int zzc() {
        return this.zza;
    }

    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(this.zzf());
    }

    public abstract byte[] zzf();
}

