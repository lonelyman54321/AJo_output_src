/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzagt;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class zzagu {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzagu() {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.zza = byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zzb = dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String string2) {
        dataOutputStream.writeBytes(string2);
        dataOutputStream.writeByte(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zza(zzagt object) {
        IOException iOException2;
        Object object2;
        block3: {
            Object object3;
            block2: {
                object2 = this.zza;
                ((ByteArrayOutputStream)object2).reset();
                try {
                    object2 = this.zzb;
                    object3 = ((zzagt)object).zza;
                    zzagu.zzb((DataOutputStream)object2, (String)object3);
                    object2 = ((zzagt)object).zzb;
                    if (object2 != null) break block2;
                    object2 = "";
                }
                catch (IOException iOException2) {
                    break block3;
                }
            }
            object3 = this.zzb;
            zzagu.zzb((DataOutputStream)object3, (String)object2);
            object2 = this.zzb;
            long l2 = ((zzagt)object).zzc;
            ((DataOutputStream)object2).writeLong(l2);
            object2 = this.zzb;
            l2 = ((zzagt)object).zzd;
            ((DataOutputStream)object2).writeLong(l2);
            object2 = this.zzb;
            object = ((zzagt)object).zze;
            ((OutputStream)object2).write((byte[])object);
            object = this.zzb;
            ((DataOutputStream)object).flush();
            object = this.zza;
            return ((ByteArrayOutputStream)object).toByteArray();
        }
        object2 = new RuntimeException(iOException2);
        throw object2;
    }
}

