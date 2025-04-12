/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdk;
import com.google.android.gms.internal.ads.zzgdl;
import com.google.android.gms.internal.ads.zzgea;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public final class zzgdm {
    private static final OutputStream zza;

    static {
        zzgdk zzgdk2 = new zzgdk();
        zza = zzgdk2;
    }

    public static InputStream zza(InputStream inputStream, long l2) {
        zzgdl zzgdl2 = new zzgdl(inputStream, l2);
        return zzgdl2;
    }

    public static byte[] zzb(InputStream object) {
        block7: {
            block6: {
                int n3;
                int n4;
                object.getClass();
                ArrayDeque<byte[]> arrayDeque = new ArrayDeque<byte[]>(20);
                int n7 = Integer.highestOneBit(0);
                n7 += n7;
                n7 = Math.max(128, n7);
                n7 = Math.min(8192, n7);
                int n8 = 0;
                while (true) {
                    n4 = -1;
                    n3 = 0x7FFFFFF7;
                    if (n8 >= n3) break;
                    n3 -= n8;
                    n3 = Math.min(n7, n3);
                    byte[] byArray = new byte[n3];
                    arrayDeque.add(byArray);
                    int n10 = 0;
                    while (n10 < n3) {
                        int n14 = n3 - n10;
                        if ((n14 = ((InputStream)object).read(byArray, n10, n14)) == n4) {
                            object = zzgdm.zzc(arrayDeque, n8);
                            break block6;
                        }
                        n10 += n14;
                        n8 += n14;
                    }
                    n4 = 4096;
                    n4 = n7 < n4 ? 4 : 2;
                    long l2 = n7;
                    long l3 = n4;
                    n7 = zzgea.zze(l2 *= l3);
                }
                int n15 = ((InputStream)object).read();
                if (n15 != n4) break block7;
                object = zzgdm.zzc(arrayDeque, n3);
            }
            return object;
        }
        object = new OutOfMemoryError("input is too large to fit in a byte array");
        throw object;
    }

    private static byte[] zzc(Queue queue, int n3) {
        int n4;
        boolean bl2 = queue.isEmpty();
        if (bl2) {
            return new byte[0];
        }
        byte[] byArray = (byte[])queue.remove();
        int n7 = byArray.length;
        if (n7 == n3) {
            return byArray;
        }
        byArray = Arrays.copyOf(byArray, n3);
        for (n7 = n3 - n7; n7 > 0; n7 -= n4) {
            byte[] byArray2 = (byte[])queue.remove();
            n4 = byArray2.length;
            n4 = Math.min(n7, n4);
            int n8 = n3 - n7;
            System.arraycopy(byArray2, 0, byArray, n8, n4);
        }
        return byArray;
    }
}

