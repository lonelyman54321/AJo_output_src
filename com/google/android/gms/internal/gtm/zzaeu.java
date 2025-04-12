/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacq;

final class zzaeu {
    public static /* bridge */ /* synthetic */ void zza(byte by2, byte by4, byte by5, byte by6, char[] cArray, int n3) {
        int n4 = zzaeu.zze(by4);
        if (n4 == 0) {
            n4 = by2 << 28;
            int n7 = by4 + 112 + n4;
            if ((n4 = n7 >> 30) == 0 && (n4 = (int)(zzaeu.zze(by5) ? 1 : 0)) == 0 && (n4 = (int)(zzaeu.zze(by6) ? 1 : 0)) == 0) {
                by2 = (byte)(by2 & 7);
                by4 = (byte)(by4 & 0x3F);
                by5 = (byte)(by5 & 0x3F);
                by6 = (byte)(by6 & 0x3F);
                by2 = (byte)(by2 << 18);
                by4 = (byte)(by4 << 12);
                by2 = (byte)(by2 | by4);
                by4 = (byte)(by5 << 6);
                by2 = (byte)(by2 | by4 | by6);
                by4 = (byte)((by2 >>> 10) + 55232);
                cArray[n3] = (char)by4;
                by2 = (byte)((by2 & 0x3FF) + 56320);
                cArray[++n3] = (char)by2;
                return;
            }
        }
        zzacq zzacq2 = new zzacq("Protocol message had invalid UTF-8.");
        throw zzacq2;
    }

    public static /* bridge */ /* synthetic */ void zzb(byte n3, byte by2, byte by4, char[] cArray, int n4) {
        block4: {
            byte by5;
            block6: {
                int n7;
                block5: {
                    by5 = zzaeu.zze(by2);
                    if (by5 != 0) break block4;
                    by5 = -96;
                    n7 = -32;
                    if (n3 != n7) break block5;
                    if (by2 < by5) break block4;
                    n3 = -32;
                }
                if (n3 != (n7 = -19)) break block6;
                if (by2 >= by5) break block4;
                n3 = -19;
            }
            if ((by5 = (byte)(zzaeu.zze(by4) ? 1 : 0)) == 0) {
                n3 &= 0xF;
                by2 = (byte)(by2 & 0x3F);
                by4 = (byte)(by4 & 0x3F);
                n3 <<= 12;
                by2 = (byte)(by2 << 6);
                cArray[n4] = n3 = (int)((char)(n3 | by2 | by4));
                return;
            }
        }
        zzacq zzacq2 = new zzacq("Protocol message had invalid UTF-8.");
        throw zzacq2;
    }

    public static /* bridge */ /* synthetic */ void zzc(byte by2, byte by4, char[] cArray, int n3) {
        byte by5 = -62;
        if (by2 >= by5 && (by5 = (byte)(zzaeu.zze(by4) ? 1 : 0)) == 0) {
            by2 = (byte)((by2 & 0x1F) << 6);
            by4 = (byte)(by4 & 0x3F);
            by2 = (byte)(by2 | by4);
            cArray[n3] = (char)by2;
            return;
        }
        zzacq zzacq2 = new zzacq("Protocol message had invalid UTF-8.");
        throw zzacq2;
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte by2) {
        return by2 >= 0;
    }

    private static boolean zze(byte by2) {
        byte by4 = -65;
        return by2 > by4;
    }
}

