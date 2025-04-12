/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbg;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzdo;
import java.io.IOException;

public abstract class zzas
implements zzdo {
    private static boolean zzey = false;
    protected int zzex = 0;

    public void zzf(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final zzbb zzr() {
        Object object;
        int n3;
        try {
            n3 = this.zzas();
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            int n4 = string2.length() + 62;
            int n7 = "ByteString".length() + n4;
            StringBuilder stringBuilder = new StringBuilder(n7);
            stringBuilder.append("Serializing ");
            stringBuilder.append(string2);
            stringBuilder.append(" to a ByteString threw an IOException (should never happen).");
            string2 = stringBuilder.toString();
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        zzbg zzbg2 = zzbb.zzk(n3);
        object = zzbg2.zzae();
        this.zzb((zzbn)object);
        return zzbg2.zzad();
    }

    public int zzs() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

