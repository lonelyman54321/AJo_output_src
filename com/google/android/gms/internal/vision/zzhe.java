/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkn;
import java.io.IOException;

public abstract class zzhe
implements zzkn {
    public /* synthetic */ Object clone() {
        return this.zza();
    }

    public abstract zzhe zza();

    public abstract zzhe zza(zzhf var1);

    public abstract zzhe zza(zzif var1, zzio var2);

    public zzhe zza(byte[] object, int n3, int n4, zzio object2) {
        zzjk zzjk22;
        block6: {
            RuntimeException runtimeException = null;
            object = zzif.zza((byte[])object, 0, n4, false);
            this.zza((zzif)object, (zzio)object2);
            try {
                ((zzif)object).zza(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (zzjk zzjk22) {
                break block6;
            }
            String string2 = this.getClass().getName();
            int n7 = string2.length() + 60;
            int n8 = "byte array".length() + n7;
            object2 = new StringBuilder(n8);
            ((StringBuilder)object2).append("Reading ");
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(" from a byte array threw an IOException (should never happen).");
            string2 = ((StringBuilder)object2).toString();
            runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw zzjk22;
    }

    public final /* synthetic */ zzkn zza(zzkk object) {
        Class<?> clazz = this.zzr().getClass();
        boolean bl2 = clazz.isInstance(object);
        if (bl2) {
            object = (zzhf)object;
            return this.zza((zzhf)object);
        }
        object = new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        throw object;
    }
}

