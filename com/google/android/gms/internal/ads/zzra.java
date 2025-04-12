/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzea;
import java.nio.ByteBuffer;

final class zzra
extends zzea {
    private int[] zzd;
    private int[] zze;

    public final void zze(ByteBuffer byteBuffer) {
        int n3;
        int[] nArray = this.zze;
        nArray.getClass();
        int n4 = byteBuffer.limit();
        int n7 = n4 - n3;
        int n8 = this.zzb.zze;
        n7 /= n8;
        zzdx zzdx2 = this.zzc;
        n8 = zzdx2.zze;
        ByteBuffer byteBuffer2 = this.zzj(n7 *= n8);
        for (n3 = byteBuffer.position(); n3 < n4; n3 += n8) {
            for (short s7 : nArray) {
                short s7 = s7 + s7 + n3;
                s7 = byteBuffer.getShort(s7);
                byteBuffer2.putShort(s7);
            }
            zzdx2 = this.zzb;
            n8 = zzdx2.zze;
        }
        byteBuffer.position(n4);
        byteBuffer2.flip();
    }

    public final zzdx zzi(zzdx zzdx2) {
        Object object = this.zzd;
        if (object == null) {
            return zzdx.zza;
        }
        int n3 = zzdx2.zzd;
        String string2 = "Unhandled input format:";
        int n4 = 2;
        if (n3 == n4) {
            int n7;
            n3 = zzdx2.zzc;
            int n8 = ((int[])object).length;
            n3 = n3 != n8 ? 1 : 0;
            for (n8 = 0; n8 < (n7 = ((int[])object).length); ++n8) {
                n7 = object[n8];
                int n10 = zzdx2.zzc;
                if (n7 < n10) {
                    n7 = n7 != n8 ? 1 : 0;
                    n3 |= n7;
                    continue;
                }
                object = new zzdy;
                object(string2, zzdx2);
                throw object;
            }
            if (n3 != 0) {
                object = new zzdx;
                int n14 = zzdx2.zzb;
                object(n14, n7, n4);
            } else {
                object = zzdx.zza;
            }
            return object;
        }
        object = new zzdy;
        object(string2, zzdx2);
        throw object;
    }

    public final void zzk() {
        int[] nArray = this.zzd;
        this.zze = nArray;
    }

    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] nArray) {
        this.zzd = nArray;
    }
}

