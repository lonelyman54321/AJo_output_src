/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhfb;
import java.nio.Buffer;
import java.nio.ByteBuffer;

abstract class zzhfc {
    /*
     * Enabled aggressive block sorting
     */
    public static final String zzd(ByteBuffer object, int n3, int n4) {
        char c2;
        int n7;
        int n8 = 3;
        int n10 = 2;
        int n14 = 1;
        int n15 = ((Buffer)object).limit() - n3;
        int n16 = n3 | n4;
        if ((n15 = n15 - n4 | n16) < 0) {
            object = ((Buffer)object).limit();
            Integer n17 = n3;
            Integer n18 = n4;
            Object[] objectArray = new Object[n8];
            objectArray[0] = object;
            objectArray[n14] = n17;
            objectArray[n10] = n18;
            object = String.format("buffer limit=%d, index=%d, limit=%d", objectArray);
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
            throw arrayIndexOutOfBoundsException;
        }
        n15 = n3 + n4;
        char[] cArray = new char[n4];
        n16 = 0;
        while (n3 < n15 && (n7 = zzhfb.zzd((byte)(c2 = ((ByteBuffer)object).get(n3)))) != 0) {
            n3 += n14;
            n7 = n16 + 1;
            cArray[n16] = c2 = (char)c2;
            n16 = n7;
        }
        int n19 = n16;
        block1: while (true) {
            char c3;
            block14: {
                block13: {
                    block12: {
                        if (n3 >= n15) {
                            return new String(cArray, 0, n19);
                        }
                        n16 = n3 + 1;
                        c2 = (char)((ByteBuffer)object).get(n3);
                        n7 = zzhfb.zzd((byte)c2);
                        if (n7 != 0) {
                            n3 = n19 + 1;
                            cArray[n19] = c2 = (char)c2;
                            n19 = n3;
                            n3 = n16;
                            while (true) {
                                if (n3 >= n15 || (c2 = (char)(zzhfb.zzd((byte)(n16 = (int)((ByteBuffer)object).get(n3))) ? 1 : 0)) == '\u0000') continue block1;
                                n3 += n14;
                                c2 = (char)(n19 + 1);
                                cArray[n19] = n16 = (int)((char)n16);
                                n19 = c2;
                            }
                        }
                        n7 = (int)(zzhfb.zzf((byte)c2) ? 1 : 0);
                        if (n7 == 0) break block12;
                        if (n16 >= n15) {
                            throw zzhcd.zzd();
                        }
                        n7 = n19 + 1;
                        n3 += n10;
                        n16 = ((ByteBuffer)object).get(n16);
                        zzhfb.zzc((byte)c2, (byte)n16, cArray, n19);
                        break block13;
                    }
                    n7 = (int)(zzhfb.zze((byte)c2) ? 1 : 0);
                    if (n7 == 0) break block14;
                    n7 = n15 + -1;
                    if (n16 >= n7) {
                        throw zzhcd.zzd();
                    }
                    n7 = n19 + 1;
                    c3 = n3 + 2;
                    n16 = ((ByteBuffer)object).get(n16);
                    n3 += n8;
                    c3 = (char)((ByteBuffer)object).get(c3);
                    zzhfb.zzb((byte)c2, (byte)n16, (byte)c3, cArray, n19);
                }
                n19 = n7;
                continue;
            }
            n7 = n15 + -2;
            if (n16 >= n7) {
                throw zzhcd.zzd();
            }
            n7 = n3 + 2;
            c3 = (char)((ByteBuffer)object).get(n16);
            n16 = n3 + 3;
            n7 = ((ByteBuffer)object).get(n7);
            n3 += 4;
            byte by2 = ((ByteBuffer)object).get(n16);
            n16 = c2;
            c2 = c3;
            c3 = (char)by2;
            zzhfb.zza((byte)n16, (byte)c2, (byte)n7, by2, cArray, n19);
            n19 += n10;
        }
    }

    public abstract int zza(int var1, byte[] var2, int var3, int var4);

    public abstract String zzb(byte[] var1, int var2, int var3);

    public final boolean zzc(byte[] byArray, int n3, int n4) {
        int n7 = this.zza(0, byArray, n3, n4);
        return n7 == 0;
    }
}

