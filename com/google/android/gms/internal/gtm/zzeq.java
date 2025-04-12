/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class zzeq {
    final /* synthetic */ zzer zza;
    private int zzb;
    private final ByteArrayOutputStream zzc;

    public zzeq(zzer object) {
        this.zza = object;
        this.zzc = object = new ByteArrayOutputStream();
    }

    public final int zza() {
        return this.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzb(zzek object) {
        IOException iOException2;
        int n3;
        block7: {
            int n4;
            Object object2;
            block6: {
                Preconditions.checkNotNull(object);
                int n7 = this.zzb;
                n3 = 1;
                Object object3 = this.zza;
                ((zzbq)object3).zzw();
                int n8 = zzcs.zzg();
                if ((n7 += n3) > n8) {
                    return false;
                }
                object2 = this.zza.zza((zzek)object, false);
                if (object2 == null) {
                    this.zza.zzz().zzb((zzek)object, "Error formatting hit");
                    return n3 != 0;
                }
                object2 = ((String)object2).getBytes();
                n8 = ((Object)object2).length;
                zzer zzer2 = this.zza;
                zzer2.zzw();
                int n10 = zzcs.zzf();
                if (n8 > n10) {
                    this.zza.zzz().zzb((zzek)object, "Hit size exceeds the maximum size limit");
                    return n3 != 0;
                }
                object = this.zzc;
                n4 = ((ByteArrayOutputStream)object).size();
                if (n4 > 0) {
                    ++n8;
                }
                object = this.zzc;
                n4 = ((ByteArrayOutputStream)object).size() + n8;
                this.zza.zzw();
                object3 = (Integer)zzeh.zzt.zzb();
                n8 = (Integer)object3;
                if (n4 > n8) return false;
                try {
                    object = this.zzc;
                    n4 = ((ByteArrayOutputStream)object).size();
                    if (n4 <= 0) break block6;
                    object = this.zzc;
                    object3 = zzer.zzf();
                    ((OutputStream)object).write((byte[])object3);
                }
                catch (IOException iOException2) {
                    break block7;
                }
            }
            object = this.zzc;
            ((OutputStream)object).write((byte[])object2);
            this.zzb = n4 = this.zzb + n3;
            return n3 != 0;
        }
        this.zza.zzJ("Failed to write payload when batching hits", iOException2);
        return n3 != 0;
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}

