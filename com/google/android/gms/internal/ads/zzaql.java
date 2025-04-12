/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzaql {
    public static long zza(ByteBuffer byteBuffer) {
        zzaql.zzg(byteBuffer);
        int n3 = byteBuffer.position() + 16;
        return zzaql.zze(byteBuffer, n3);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzaql.zzg(byteBuffer);
        int n3 = byteBuffer.position() + 12;
        return zzaql.zze(byteBuffer, n3);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) {
        long l2;
        long l3 = randomAccessFile.length();
        long l4 = l3 - (l2 = (long)22);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            return null;
        }
        Pair pair = zzaql.zzf(randomAccessFile, 0);
        if (pair != null) {
            return pair;
        }
        return zzaql.zzf(randomAccessFile, (char)-1);
    }

    public static void zzd(ByteBuffer object, long l2) {
        long l3;
        zzaql.zzg((ByteBuffer)object);
        int n3 = ((Buffer)object).position() + 16;
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 >= 0 && (l7 = (l3 = l2 - (l4 = 0xFFFFFFFFL)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
            int n4 = ((Buffer)object).position() + n3;
            int n7 = (int)l2;
            ((ByteBuffer)object).putInt(n4, n7);
            return;
        }
        String string2 = Wm2.a(l2, "uint32 value of out range: ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    private static long zze(ByteBuffer byteBuffer, int n3) {
        return (long)byteBuffer.getInt(n3) & 0xFFFFFFFFL;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static Pair zzf(RandomAccessFile object, int n3) {
        long l2;
        long l3 = ((RandomAccessFile)object).length();
        long l4 = l3 - (l2 = (long)22);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 < 0) {
            return null;
        }
        l2 = n3;
        long l7 = (long)-22 + l3;
        l2 = Math.min(l2, l7);
        n3 = (int)l2;
        int n4 = 22;
        Object object3 = ByteBuffer.allocate(n3 += n4);
        Object object4 = ByteOrder.LITTLE_ENDIAN;
        ((ByteBuffer)object3).order((ByteOrder)object4);
        long l8 = ((Buffer)object3).capacity();
        ((RandomAccessFile)object).seek(l3 -= l8);
        object4 = ((ByteBuffer)object3).array();
        int n7 = ((ByteBuffer)object3).arrayOffset();
        int n8 = ((Buffer)object3).capacity();
        ((RandomAccessFile)object).readFully((byte[])object4, n7, n8);
        zzaql.zzg((ByteBuffer)object3);
        int n10 = ((Buffer)object3).capacity();
        int n14 = -1;
        boolean bl2 = true;
        while (true) {
            int n15;
            void var6_7;
            block8: {
                block7: {
                    block6: {
                        if (!bl2 || (bl2 = false)) break block6;
                        if (n10 < n4) break block7;
                        n4 = Math.min(n10 += -22, (char)-1);
                        boolean bl3 = false;
                    }
                    if (var6_7 < n4) break block8;
                }
                n8 = -1;
                break;
            }
            n8 = n10 - var6_7;
            int n16 = ((ByteBuffer)object3).getInt(n8);
            if (n16 == (n15 = 101010256)) {
                n16 = n8 + 20;
                if ((n16 = (int)((char)((ByteBuffer)object3).getShort(n16))) == var6_7) break;
            }
            ++var6_7;
        }
        if (n8 == n14) return null;
        ((ByteBuffer)object3).position(n8);
        object = ((ByteBuffer)object3).slice();
        object3 = ByteOrder.LITTLE_ENDIAN;
        ((ByteBuffer)object).order((ByteOrder)object3);
        l2 = n8;
        object3 = l3 + l2;
        return Pair.create((Object)object, (Object)object3);
    }

    private static void zzg(ByteBuffer object) {
        ByteOrder byteOrder;
        if ((object = ((ByteBuffer)object).order()) == (byteOrder = ByteOrder.LITTLE_ENDIAN)) {
            return;
        }
        object = new IllegalArgumentException("ByteBuffer byte order must be little endian");
        throw object;
    }
}

