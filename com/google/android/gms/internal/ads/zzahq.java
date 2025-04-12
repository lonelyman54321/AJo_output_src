/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzahn;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class zzahq {
    public static final zzaho zza;

    static {
        zzahn zzahn2 = new zzahn();
        zza = zzahn2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final zzcd zza(byte[] object, int n3, zzaho zzaho2, zzagr arrayList) {
        int n4;
        Object object2;
        int n7;
        int n8;
        ArrayList<zzahr> arrayList2 = new ArrayList<zzahr>();
        zzfu zzfu2 = new zzfu((byte[])object, n8);
        int n10 = zzfu2.zzb();
        n8 = 2;
        boolean bl2 = false;
        boolean bl3 = true;
        int n14 = 4;
        String string2 = "Id3Decoder";
        int n15 = 10;
        if (n10 < n15) {
            String string3 = "Data too short to be an ID3 tag";
            zzfk.zzf(string2, string3);
            return null;
        }
        n10 = zzfu2.zzo();
        if (n10 != (n7 = 0x494433)) {
            Integer n16 = n10;
            object2 = new Object[bl3];
            object2[0] = n16;
            String string4 = String.format("%06X", (Object[])object2);
            object2 = "Unexpected first three bytes of ID3 tag header: 0x";
            String string5 = ((String)object2).concat(string4);
            zzfk.zzf(string2, string5);
            return null;
        }
        n10 = zzfu2.zzm();
        zzfu2.zzL((int)(bl3 ? 1 : 0));
        n7 = zzfu2.zzm();
        int n17 = zzfu2.zzl();
        if (n10 == n8) {
            n4 = n7 & 0x40;
            if (n4 != 0) {
                String string6 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                zzfk.zzf(string2, string6);
                return null;
            }
        } else {
            n4 = 3;
            if (n10 == n4) {
                n4 = n7 & 0x40;
                if (n4 != 0) {
                    n4 = zzfu2.zzg();
                    zzfu2.zzL(n4);
                    n17 -= (n4 += n14);
                }
            } else {
                if (n10 != n14) {
                    object2 = "Skipped ID3 tag with unsupported majorVersion=";
                    w12_0.a(n10, (String)object2, string2);
                    return null;
                }
                n4 = n7 & 0x40;
                if (n4 != 0) {
                    n4 = zzfu2.zzl();
                    int n18 = n4 + -4;
                    zzfu2.zzL(n18);
                    n17 -= n4;
                }
                if ((n4 = n7 & 0x10) != 0) {
                    n17 += -10;
                }
            }
        }
        if (n10 < n14 && (n7 &= 0x80) != 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object2 = null;
        }
        zzahp zzahp2 = new zzahp(n10, n7 != 0, n17);
        if (zzahp2 == null) {
            return null;
        }
        n10 = zzfu2.zzd();
        n7 = zzahp.zzb(zzahp2);
        if (n7 == n8) {
            n15 = 6;
        }
        n8 = zzahp.zza(zzahp2);
        n7 = (int)(zzahp.zzc(zzahp2) ? 1 : 0);
        if (n7 != 0) {
            n8 = zzahp.zza(zzahp2);
            n8 = zzahq.zze(zzfu2, n8);
        }
        zzfu2.zzJ(n10 += n8);
        n10 = zzahp.zzb(zzahp2);
        n10 = (int)(zzahq.zzk(zzfu2, n10, n15, false) ? 1 : 0);
        if (n10 == 0) {
            n10 = zzahp.zzb(zzahp2);
            if (n10 == n14 && (n10 = (int)(zzahq.zzk(zzfu2, n14, n15, bl3) ? 1 : 0)) != 0) {
                bl2 = true;
            } else {
                w12_0.a(zzahp.zzb(zzahp2), "Failed to validate ID3 tag with majorVersion=", string2);
                return null;
            }
        }
        while ((n10 = zzfu2.zzb()) >= n15) {
            void var2_11;
            n10 = zzahp.zzb(zzahp2);
            zzahr zzahr2 = zzahq.zzf(n10, zzfu2, bl2, n15, (zzaho)var2_11);
            if (zzahr2 == null) continue;
            arrayList2.add(zzahr2);
        }
        return new zzcd(arrayList2);
    }

    private static int zzb(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 3)) {
            return 2;
        }
        return 1;
    }

    private static int zzc(byte[] byArray, int n3, int n4) {
        int n7;
        int n8 = zzahq.zzd(byArray, n3);
        if (n4 != 0 && n4 != (n7 = 3)) {
            while (n8 < (n7 = (n4 = byArray.length) + -1)) {
                n4 = n8 + 1;
                n7 = (n8 - n3) % 2;
                if (n7 == 0 && (n7 = byArray[n4]) == 0) {
                    return n8;
                }
                n8 = zzahq.zzd(byArray, n4);
            }
            return n4;
        }
        return n8;
    }

    private static int zzd(byte[] byArray, int n3) {
        int n4;
        while (n3 < (n4 = byArray.length)) {
            n4 = byArray[n3];
            if (n4 == 0) {
                return n3;
            }
            ++n3;
        }
        return n4;
    }

    private static int zze(zzfu zzfu2, int n3) {
        int n4;
        int n7;
        int n8;
        byte[] byArray = zzfu2.zzM();
        int n10 = n8 = zzfu2.zzd();
        while ((n7 = n10 + 1) < (n4 = n8 + n3)) {
            n4 = byArray[n10];
            int n14 = 255;
            if ((n4 &= n14) == n14 && (n4 = byArray[n7]) == 0) {
                n4 = n10 - n8;
                n4 = n3 - n4 + -2;
                System.arraycopy(byArray, n10 += 2, byArray, n7, n4);
                n3 += -1;
            }
            n10 = n7;
        }
        return n3;
    }

    /*
     * Exception decompiling
     */
    private static zzahr zzf(int var0, zzfu var1_1, boolean var2_2, int var3_3, zzaho var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [35, 34, 33 : 931->936)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static zzgbc zzg(byte[] object, int n3, int n4) {
        int n7 = ((byte[])object).length;
        String string2 = "";
        if (n4 >= n7) {
            return zzgbc.zzn(string2);
        }
        zzgaz zzgaz2 = new zzgaz();
        int n8 = zzahq.zzc((byte[])object, n4, n3);
        while (n4 < n8) {
            Charset charset = zzahq.zzj(n3);
            int n10 = n8 - n4;
            String string3 = new String((byte[])object, n4, n10, charset);
            zzgaz2.zzf(string3);
            n4 = zzahq.zzb(n3) + n8;
            n8 = zzahq.zzc((byte[])object, n4, n3);
        }
        object = zzgaz2.zzi();
        n3 = (int)(((AbstractCollection)object).isEmpty() ? 1 : 0);
        if (n3 != 0) {
            object = zzgbc.zzn(string2);
        }
        return object;
    }

    private static String zzh(byte[] byArray, int n3, int n4, Charset charset) {
        int n7;
        if (n4 > n3 && n4 <= (n7 = byArray.length)) {
            String string2 = new String(byArray, n3, n4 -= n3, charset);
            return string2;
        }
        return "";
    }

    private static String zzi(int n3, int n4, int n7, int n8, int n10) {
        Object object;
        int n14 = 1;
        int n15 = 3;
        int n16 = 2;
        if (n3 == n16) {
            object = Locale.US;
            Object object2 = n4;
            Integer n17 = n7;
            Integer n18 = n8;
            Object[] objectArray = new Object[n15];
            objectArray[0] = object2;
            objectArray[n14] = n17;
            objectArray[n16] = n18;
            object2 = "%c%c%c";
            object = String.format((Locale)object, (String)object2, objectArray);
        } else {
            object = Locale.US;
            Object object3 = n4;
            Integer n19 = n7;
            Integer n20 = n8;
            Integer n21 = n10;
            int n22 = 4;
            Object[] objectArray = new Object[n22];
            objectArray[0] = object3;
            objectArray[n14] = n19;
            objectArray[n16] = n20;
            objectArray[n15] = n21;
            object3 = "%c%c%c%c";
            object = String.format((Locale)object, (String)object3, objectArray);
        }
        return object;
    }

    private static Charset zzj(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return zzfxs.zzb;
                }
                return zzfxs.zzc;
            }
            return zzfxs.zzd;
        }
        return zzfxs.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean zzk(zzfu zzfu2, int n3, int n4, boolean bl2) {
        Throwable throwable2;
        int n7;
        zzfu zzfu3;
        block9: {
            int n8;
            zzfu3 = zzfu2;
            int n10 = n3;
            n7 = zzfu2.zzd();
            while (true) {
                long l2;
                int n14;
                block8: {
                    block11: {
                        long l3;
                        long l4;
                        int n15;
                        block13: {
                            block15: {
                                block14: {
                                    int n16;
                                    block12: {
                                        block10: {
                                            block7: {
                                                int n17;
                                                try {
                                                    n14 = zzfu2.zzb();
                                                    n8 = 1;
                                                    if (n14 < n4) break;
                                                    n14 = 3;
                                                    if (n10 >= n14) {
                                                        n15 = zzfu2.zzg();
                                                        l2 = zzfu2.zzu();
                                                        n16 = zzfu2.zzq();
                                                        break block7;
                                                    }
                                                    n15 = zzfu2.zzo();
                                                    n17 = zzfu2.zzo();
                                                }
                                                catch (Throwable throwable2) {
                                                    break block9;
                                                }
                                                l2 = n17;
                                                n16 = 0;
                                            }
                                            long l7 = 0L;
                                            if (n15 == 0 && (n15 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1))) == 0 && n16 == 0) break;
                                            n15 = 4;
                                            if (n10 != n15 || bl2) break block10;
                                            long l8 = 0x808080L & l2;
                                            long l12 = l8 - l7;
                                            Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                            if (object != false) break block11;
                                            l7 = 255L;
                                            l8 = l2 & l7;
                                            long l14 = l2 >> 8;
                                            long l15 = l2 >> 16;
                                            int n18 = 24;
                                            l2 >>= n18;
                                            l14 &= l7;
                                            l7 = l15 & l7;
                                            int n19 = 7;
                                            object = 14;
                                            l7 = l7 << object | (l8 |= (l14 <<= n19));
                                            int n20 = 21;
                                            l2 = l2 << n20 | l7;
                                        }
                                        if (n10 != n15) break block12;
                                        n14 = n16 & 0x40;
                                        if (n14 == 0) {
                                            n8 = 0;
                                        }
                                        n14 = n16 & 1;
                                        int n21 = n8;
                                        n8 = n14;
                                        n14 = n21;
                                        break block13;
                                    }
                                    if (n10 != n14) break block14;
                                    n14 = n16 & 0x20;
                                    n14 = n14 != 0 ? 1 : 0;
                                    n15 = n16 & 0x80;
                                    if (n15 == 0) break block15;
                                    break block13;
                                }
                                n14 = 0;
                            }
                            n8 = 0;
                        }
                        if (n8 != 0) {
                            n14 += 4;
                        }
                        if ((n15 = (int)((l4 = l2 - (l3 = (long)n14)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) < 0) break block11;
                        n14 = zzfu2.zzb();
                        l3 = n14;
                        n15 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
                        if (n15 >= 0) break block8;
                    }
                    n8 = 0;
                    break;
                }
                n14 = (int)l2;
                zzfu3.zzL(n14);
            }
            zzfu3.zzK(n7);
            return n8 != 0;
        }
        zzfu3.zzK(n7);
        throw throwable2;
    }

    private static byte[] zzl(byte[] byArray, int n3, int n4) {
        if (n4 <= n3) {
            return zzgd.zzf;
        }
        return Arrays.copyOfRange(byArray, n3, n4);
    }
}

