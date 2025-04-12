/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzft;
import com.google.android.gms.internal.clearcut.zzfz;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzfs {
    private final ByteBuffer zzgd;
    private zzbn zzrh;
    private int zzri;

    private zzfs(ByteBuffer byteBuffer) {
        this.zzgd = byteBuffer;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer.order(byteOrder);
    }

    private zzfs(byte[] object, int n3, int n4) {
        object = ByteBuffer.wrap(object, n3, n4);
        this((ByteBuffer)object);
    }

    private static int zza(CharSequence object) {
        int n3;
        int n4;
        int n7;
        int n8 = object.length();
        int n10 = 0;
        StringBuilder stringBuilder = null;
        for (n7 = 0; n7 < n8 && (n4 = (int)object.charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n14;
            n3 = object.charAt(n7);
            if (n3 < (n14 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            n3 = object.length();
            while (n7 < n3) {
                int n15 = object.charAt(n7);
                if (n15 < n14) {
                    n15 = 127 - n15 >>> 31;
                    n10 += n15;
                } else {
                    n10 += 2;
                    int n16 = 55296;
                    if (n16 <= n15 && n15 <= (n16 = 57343)) {
                        n15 = Character.codePointAt((CharSequence)object, n7);
                        if (n15 >= (n16 = 65536)) {
                            ++n7;
                        } else {
                            String string2 = tk3_2.a(39, n7, "Unpaired surrogate at index ");
                            object = new IllegalArgumentException(string2);
                            throw object;
                        }
                    }
                }
                ++n7;
            }
            n4 += n10;
            break;
        }
        if (n4 >= n8) {
            return n4;
        }
        long l2 = (long)n4 + 0x100000000L;
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(l2);
        String string3 = stringBuilder.toString();
        object = new IllegalArgumentException(string3);
        throw object;
    }

    private final void zzao(int n3) {
        n3 = (byte)n3;
        ByteBuffer byteBuffer = this.zzgd;
        int n4 = byteBuffer.hasRemaining();
        if (n4 != 0) {
            this.zzgd.put((byte)n3);
            return;
        }
        n4 = this.zzgd.position();
        int n7 = this.zzgd.limit();
        zzft zzft2 = new zzft(n4, n7);
        throw zzft2;
    }

    private final void zzap(int n3) {
        while (true) {
            int n4;
            if ((n4 = n3 & 0xFFFFFF80) == 0) {
                this.zzao(n3);
                return;
            }
            n4 = n3 & 0x7F | 0x80;
            this.zzao(n4);
            n3 >>>= 7;
        }
    }

    public static int zzb(int n3, zzfz zzfz2) {
        n3 = zzfs.zzr(n3);
        int n4 = zzfz2.zzas();
        return zzfs.zzz(n4) + n4 + n3;
    }

    public static int zzb(int n3, String string2) {
        n3 = zzfs.zzr(n3);
        return zzfs.zzh(string2) + n3;
    }

    public static int zzb(int n3, byte[] byArray) {
        n3 = zzfs.zzr(n3);
        return zzfs.zzh(byArray) + n3;
    }

    public static int zzd(int n3, long l2) {
        n3 = zzfs.zzr(n3);
        return zzfs.zzo(l2) + n3;
    }

    /*
     * Exception decompiling
     */
    private static void zzd(CharSequence var0, ByteBuffer var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 196->203)] java.lang.ArrayIndexOutOfBoundsException
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

    public static zzfs zzg(byte[] byArray) {
        int n3 = byArray.length;
        return zzfs.zzh(byArray, 0, n3);
    }

    public static int zzh(String string2) {
        int n3 = zzfs.zza(string2);
        return zzfs.zzz(n3) + n3;
    }

    public static int zzh(byte[] byArray) {
        int n3 = zzfs.zzz(byArray.length);
        int n4 = byArray.length;
        return n3 + n4;
    }

    public static zzfs zzh(byte[] byArray, int n3, int n4) {
        zzfs zzfs2 = new zzfs(byArray, 0, n4);
        return zzfs2;
    }

    public static long zzj(long l2) {
        long l3 = l2 << 1;
        return l2 >> 63 ^ l3;
    }

    public static int zzo(long l2) {
        long l3 = (long)-128 & l2;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            return 1;
        }
        l3 = 0xFFFFFFFFFFFFC000L & l2;
        long l8 = l3 - l4;
        object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return 2;
        }
        l3 = 0xFFE00000L & l2;
        long l12 = l3 - l4;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object == false) {
            return 3;
        }
        l3 = 0xF0000000L & l2;
        long l14 = l3 - l4;
        object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object == false) {
            return 4;
        }
        l3 = 0xFFFFFFF800000000L & l2;
        long l15 = l3 - l4;
        object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object == false) {
            return 5;
        }
        l3 = 0xFFFFFC0000000000L & l2;
        long l16 = l3 - l4;
        object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object == false) {
            return 6;
        }
        l3 = 0xFFFE000000000000L & l2;
        long l17 = l3 - l4;
        object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object == false) {
            return 7;
        }
        l3 = 0xFF00000000000000L & l2;
        long l18 = l3 - l4;
        object = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
        if (object == false) {
            return 8;
        }
        l3 = Long.MIN_VALUE;
        long l19 = (l2 &= l3) - l4;
        Object object2 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
        if (object2 == false) {
            return 9;
        }
        return 10;
    }

    public static int zzr(int n3) {
        return zzfs.zzz(n3 << 3);
    }

    public static int zzs(int n3) {
        if (n3 >= 0) {
            return zzfs.zzz(n3);
        }
        return 10;
    }

    private static int zzz(int n3) {
        int n4 = n3 & 0xFFFFFF80;
        if (n4 == 0) {
            return 1;
        }
        n4 = n3 & 0xFFFFC000;
        if (n4 == 0) {
            return 2;
        }
        n4 = 0xFFE00000 & n3;
        if (n4 == 0) {
            return 3;
        }
        n4 = -268435456;
        if ((n3 &= n4) == 0) {
            return 4;
        }
        return 5;
    }

    public final void zza(int n3, zzfz zzfz2) {
        int n4 = 2;
        this.zzb(n3, n4);
        n3 = zzfz2.zzrs;
        if (n3 < 0) {
            zzfz2.zzas();
        }
        n3 = zzfz2.zzrs;
        this.zzap(n3);
        zzfz2.zza(this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(int n3, String object) {
        int n4;
        BufferOverflowException bufferOverflowException2;
        int n7;
        block4: {
            block5: {
                block6: {
                    int n8;
                    n7 = 2;
                    this.zzb(n3, n7);
                    try {
                        n3 = ((String)object).length();
                        n3 = zzfs.zzz(n3);
                        n7 = ((String)object).length() * 3;
                    }
                    catch (BufferOverflowException bufferOverflowException2) {
                        break block4;
                    }
                    {
                        n7 = zzfs.zzz(n7);
                        if (n3 != n7) break block5;
                        ByteBuffer byteBuffer = this.zzgd;
                        n7 = byteBuffer.position();
                        ByteBuffer byteBuffer2 = this.zzgd;
                        n4 = byteBuffer2.remaining();
                        if (n4 < n3) break block6;
                        byteBuffer2 = this.zzgd;
                        int n10 = n7 + n3;
                        byteBuffer2.position(n10);
                        byteBuffer2 = this.zzgd;
                        zzfs.zzd((CharSequence)object, byteBuffer2);
                        object = this.zzgd;
                        n8 = ((Buffer)object).position();
                        byteBuffer2 = this.zzgd;
                        byteBuffer2.position(n7);
                        n7 = n8 - n7 - n3;
                    }
                    this.zzap(n7);
                    ByteBuffer byteBuffer = this.zzgd;
                    byteBuffer.position(n8);
                    return;
                }
                n7 += n3;
                ByteBuffer byteBuffer = this.zzgd;
                n3 = byteBuffer.limit();
                object = new zzft(n7, n3);
                throw object;
            }
            n3 = zzfs.zza((CharSequence)object);
            this.zzap(n3);
            ByteBuffer byteBuffer = this.zzgd;
            zzfs.zzd((CharSequence)object, byteBuffer);
            return;
        }
        n7 = this.zzgd.position();
        n4 = this.zzgd.limit();
        object = new zzft(n7, n4);
        ((Throwable)object).initCause(bufferOverflowException2);
        throw object;
    }

    public final void zza(int n3, byte[] byArray) {
        this.zzb(n3, 2);
        n3 = byArray.length;
        this.zzap(n3);
        n3 = byArray.length;
        ByteBuffer byteBuffer = this.zzgd;
        int n4 = byteBuffer.remaining();
        if (n4 >= n3) {
            this.zzgd.put(byArray, 0, n3);
            return;
        }
        int n7 = this.zzgd.position();
        n4 = this.zzgd.limit();
        zzft zzft2 = new zzft(n7, n4);
        throw zzft2;
    }

    public final void zzb(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.zzap(n3);
    }

    public final void zzb(int n3, boolean bl2) {
        int n4 = 0;
        this.zzb(25, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        ByteBuffer byteBuffer = this.zzgd;
        boolean bl3 = byteBuffer.hasRemaining();
        if (bl3) {
            this.zzgd.put((byte)n3);
            return;
        }
        int n7 = this.zzgd.position();
        n4 = this.zzgd.limit();
        zzft zzft2 = new zzft(n7, n4);
        throw zzft2;
    }

    public final void zzc(int n3, int n4) {
        this.zzb(n3, 0);
        if (n4 >= 0) {
            this.zzap(n4);
            return;
        }
        long l2 = n4;
        this.zzn(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zze(int n3, zzdo zzdo2) {
        Object object;
        block4: {
            int n4;
            block3: {
                block2: {
                    object = this.zzrh;
                    if (object != null) break block2;
                    object = zzbn.zza(this.zzgd);
                    this.zzrh = object;
                    break block3;
                }
                n4 = this.zzri;
                Object object2 = this.zzgd;
                int n7 = ((Buffer)object2).position();
                if (n4 == n7) break block4;
                object = this.zzrh;
                object2 = this.zzgd.array();
                int n8 = this.zzri;
                ByteBuffer byteBuffer = this.zzgd;
                int n10 = byteBuffer.position();
                int n14 = this.zzri;
                ((zzbn)object).write((byte[])object2, n8, n10 -= n14);
            }
            object = this.zzgd;
            this.zzri = n4 = ((Buffer)object).position();
        }
        object = this.zzrh;
        ((zzbn)object).zza(n3, zzdo2);
        ((zzbn)object).flush();
        this.zzri = n3 = this.zzgd.position();
    }

    public final void zzem() {
        Object object = this.zzgd;
        int n3 = ((Buffer)object).remaining();
        if (n3 == 0) {
            return;
        }
        String string2 = Gj0.b(this.zzgd.remaining(), "Did not write as much data as expected, ", " bytes remaining.");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void zzi(int n3, long l2) {
        this.zzb(n3, 0);
        this.zzn(l2);
    }

    public final void zzn(long l2) {
        while (true) {
            long l3;
            long l4;
            long l7;
            long l8;
            if ((l8 = (l7 = (l4 = (long)-128 & l2) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
                int n3 = (int)l2;
                this.zzao(n3);
                return;
            }
            int n4 = (int)l2 & 0x7F | 0x80;
            this.zzao(n4);
            n4 = 7;
            l2 >>>= n4;
        }
    }
}

