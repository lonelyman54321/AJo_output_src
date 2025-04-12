/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarq;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzarz;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public final class zzasa
implements zzaqo {
    private final Map zza;
    private long zzb;
    private final zzarz zzc;
    private final int zzd;

    public zzasa(zzarz zzarz2, int n3) {
        LinkedHashMap linkedHashMap;
        this.zza = linkedHashMap = new LinkedHashMap(16, 0.75f, true);
        this.zzb = 0L;
        this.zzc = zzarz2;
        this.zzd = 0x500000;
    }

    public zzasa(File file, int n3) {
        Object object = new LinkedHashMap(16, 0.75f, true);
        this.zza = object;
        this.zzb = 0L;
        this.zzc = object = new zzarw(this, file);
        this.zzd = 0x1400000;
    }

    public static int zze(InputStream inputStream) {
        int n3 = zzasa.zzn(inputStream);
        int n4 = zzasa.zzn(inputStream) << 8;
        n3 |= n4;
        n4 = zzasa.zzn(inputStream) << 16;
        int n7 = zzasa.zzn(inputStream) << 24;
        return n7 | (n3 |= n4);
    }

    public static long zzf(InputStream inputStream) {
        long l2 = zzasa.zzn(inputStream);
        long l3 = zzasa.zzn(inputStream);
        long l4 = zzasa.zzn(inputStream);
        long l7 = zzasa.zzn(inputStream);
        long l8 = zzasa.zzn(inputStream);
        long l12 = zzasa.zzn(inputStream);
        long l14 = zzasa.zzn(inputStream);
        long l15 = zzasa.zzn(inputStream);
        long l16 = 255L;
        l3 &= l16;
        l4 &= l16;
        l7 &= l16;
        l8 &= l16;
        l12 &= l16;
        l14 &= l16;
        l15 &= l16;
        l2 &= l16;
        l2 |= (l3 <<= 8);
        l3 = l4 << 16;
        l2 |= l3;
        l3 = l7 << 24;
        l2 |= l3;
        l3 = l8 << 32;
        l2 |= l3;
        l3 = l12 << 40;
        l2 |= l3;
        l3 = l14 << 48;
        l2 |= l3;
        l3 = l15 << 56;
        return l2 | l3;
    }

    public static String zzh(zzary object) {
        long l2 = zzasa.zzf((InputStream)object);
        object = zzasa.zzm((zzary)object, l2);
        String string2 = new String((byte[])object, "UTF-8");
        return string2;
    }

    public static void zzj(OutputStream outputStream, int n3) {
        int n4 = n3 & 0xFF;
        outputStream.write(n4);
        n4 = n3 >> 8 & 0xFF;
        outputStream.write(n4);
        n4 = n3 >> 16 & 0xFF;
        outputStream.write(n4);
        n3 = n3 >> 24 & 0xFF;
        outputStream.write(n3);
    }

    public static void zzk(OutputStream outputStream, long l2) {
        byte by2 = (byte)l2;
        outputStream.write(by2);
        by2 = (byte)(l2 >>> 8);
        outputStream.write(by2);
        by2 = (byte)(l2 >>> 16);
        outputStream.write(by2);
        by2 = (byte)(l2 >>> 24);
        outputStream.write(by2);
        by2 = (byte)(l2 >>> 32);
        outputStream.write(by2);
        by2 = (byte)(l2 >>> 40);
        outputStream.write(by2);
        by2 = (byte)(l2 >>> 48);
        outputStream.write(by2);
        byte by4 = (byte)(l2 >>> 56);
        outputStream.write(by4);
    }

    public static void zzl(OutputStream outputStream, String object) {
        object = ((String)object).getBytes("UTF-8");
        int n3 = ((Object)object).length;
        long l2 = n3;
        zzasa.zzk(outputStream, l2);
        outputStream.write((byte[])object, 0, n3);
    }

    public static byte[] zzm(zzary object, long l2) {
        long l3;
        long l4;
        long l7;
        long l8 = l2 - 0L;
        long l12 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        long l14 = ((zzary)object).zza();
        if (l12 >= 0 && (l12 = l2 == l14 ? 0 : (l2 < l14 ? -1 : 1)) <= 0 && (l7 = (l4 = (l3 = (long)(l12 = (long)((int)l2))) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            byte[] byArray = new byte[l12];
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            dataInputStream.readFully(byArray);
            return byArray;
        }
        CharSequence charSequence = D70.c(l2, "streamToBytes length=", ", maxLength=");
        charSequence.append(l14);
        charSequence = charSequence.toString();
        object = new IOException((String)charSequence);
        throw object;
    }

    private static int zzn(InputStream object) {
        int n3;
        int n4 = ((InputStream)object).read();
        if (n4 != (n3 = -1)) {
            return n4;
        }
        object = new EOFException();
        throw object;
    }

    private final void zzo(String string2, zzarx zzarx2) {
        Object object = this.zza;
        boolean bl2 = object.containsKey(string2);
        if (!bl2) {
            long l2 = this.zzb;
            long l3 = zzarx2.zza;
            this.zzb = l2 += l3;
        } else {
            object = (zzarx)this.zza.get(string2);
            long l4 = this.zzb;
            long l7 = zzarx2.zza;
            long l8 = ((zzarx)object).zza;
            this.zzb = l7 = l7 - l8 + l4;
        }
        this.zza.put(string2, zzarx2);
    }

    private final void zzp(String object) {
        Map map2 = this.zza;
        if ((object = (zzarx)map2.remove(object)) != null) {
            long l2 = this.zzb;
            long l3 = ((zzarx)object).zza;
            this.zzb = l2 -= l3;
        }
    }

    private static final String zzq(String string2) {
        int n3 = string2.length() / 2;
        String string3 = String.valueOf(string2.substring(0, n3).hashCode());
        string2 = String.valueOf(string2.substring(n3).hashCode());
        String string4 = String.valueOf(string3);
        string2 = String.valueOf(string2);
        return string4.concat(string2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzaqn zza(String var1_1) {
        var2_3 = 2;
        var3_4 = 1;
        synchronized (this) {
            block16: {
                block17: {
                    block15: {
                        block14: {
                            var4_5 = this.zza;
                            var4_5 = var4_5.get(var1_1);
                            var4_5 = (zzarx)var4_5;
                            if (var4_5 != null) break block14;
                            return null;
                        }
                        var5_9 = this.zzg(var1_1);
                        var8_12 = new FileInputStream(var5_9);
                        var7_11 = new Iterator<E>((InputStream)var8_12);
                        var9_13 = var5_9.length();
                        var6_10 = new zzary((InputStream)var7_11, var9_13);
                        var7_11 = zzarx.zza(var6_10);
                        var8_12 = var7_11.zzb;
                        var11_14 = TextUtils.equals((CharSequence)var1_1, (CharSequence)var8_12);
                        if (var11_14) break block15;
                        var4_5 = "%s: key=%s, found=%s";
                        var8_12 = var5_9.getAbsolutePath();
                        var7_11 = var7_11.zzb;
                        var12_15 = 3;
                        var13_16 = new Object[var12_15];
                        var13_16[0] = var8_12;
                        var13_16[var3_4] = var1_1;
                        var13_16[var2_3] = var7_11;
                        zzarq.zza((String)var4_5, var13_16);
                        this.zzp(var1_1);
                        var6_10.close();
                        return null;
                    }
                    try {
                        var14_18 = var6_10.zza();
                        var7_11 = (Iterator<E>)zzasa.zzm(var6_10, var14_18);
                        var8_12 = new zzaqn();
                        var8_12.zza = (byte[])var7_11;
                        var7_11 = var4_5.zzc;
                        var8_12.zzb = var7_11;
                        var8_12.zzc = var16_19 = var4_5.zzd;
                        var8_12.zzd = var16_19 = var4_5.zze;
                        var8_12.zze = var16_19 = var4_5.zzf;
                        var8_12.zzf = var16_19 = var4_5.zzg;
                        var7_11 = var4_5.zzh;
                        var18_20 = String.CASE_INSENSITIVE_ORDER;
                        var13_17 = new TreeMap<String, Object>((Comparator<String>)var18_20);
                        var7_11 = var7_11.iterator();
                        while (var19_21 = var7_11.hasNext()) {
                            var18_20 = var7_11.next();
                            var18_20 = (zzaqw)var18_20;
                            var20_22 = var18_20.zza();
                            var18_20 = var18_20.zzb();
                            var13_17.put(var20_22, var18_20);
                        }
                    }
                    catch (Throwable var4_7) {}
                    break block17;
                    var8_12.zzg = var13_17;
                    var4_5 = var4_5.zzh;
                    var8_12.zzh = var4_5 = Collections.unmodifiableList(var4_5);
                    try {
                        ** try [egrp 7[TRYBLOCK] [61 : 418->436)] { 
lbl68:
                        // 1 sources

                    }
                    catch (Throwable var1_2) {}
                    {
                        var6_10.close();
                        return var8_12;
                    }
lbl72:
                    // 3 sources

                    catch (IOException var4_6) {}
                    finally {
                        break block16;
                    }
                }
                var6_10.close();
                throw var4_7;
            }
            throw var1_2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        String string2 = null;
        int n3 = 1;
        synchronized (this) {
            block13: {
                int n4;
                Object object;
                try {
                    object = this.zzc;
                    object = object.zza();
                    n4 = object.exists();
                    if (n4 == 0) {
                        n4 = object.mkdirs();
                        if (n4 == 0) {
                            object = object.getAbsolutePath();
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = object;
                            string2 = "Unable to create cache dir %s";
                            zzarq.zzb(string2, objectArray);
                            return;
                        }
                        break block13;
                    }
                    if ((object = object.listFiles()) == null) break block13;
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (int i3 = 0; i3 < (n4 = ((File[])object).length); i3 += n3) {
                    File file = object[i3];
                    long l2 = file.length();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    Object object2 = new BufferedInputStream(fileInputStream);
                    zzary zzary2 = new zzary((InputStream)object2, l2);
                    object2 = zzarx.zza(zzary2);
                    ((zzarx)object2).zza = l2;
                    String string3 = ((zzarx)object2).zzb;
                    this.zzo(string3, (zzarx)object2);
                    {
                        catch (Throwable throwable) {
                            ((InputStream)zzary2).close();
                            throw throwable;
                        }
                        try {
                            ((InputStream)zzary2).close();
                            continue;
                        }
                        catch (IOException iOException) {}
                        {
                        }
                        file.delete();
                        continue;
                    }
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String string2, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzaqn zzaqn2 = this.zza(string2);
                    if (zzaqn2 != null) {
                        long l2;
                        zzaqn2.zzf = l2 = 0L;
                        zzaqn2.zze = l2;
                        this.zzd(string2, zzaqn2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zzd(String var1_1, zzaqn var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 12[TRYBLOCK] [26, 25 : 207->217)] java.lang.Throwable
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

    public final File zzg(String string2) {
        Object object = this.zzc;
        object = object.zza();
        string2 = zzasa.zzq(string2);
        File file = new File((File)object, string2);
        return file;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = this.zzg(string2);
                    boolean bl2 = ((File)object).delete();
                    this.zzp(string2);
                    if (!bl2) {
                        object = zzasa.zzq(string2);
                        int n3 = 2;
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = string2;
                        int n4 = 1;
                        objectArray[n4] = object;
                        string2 = "Could not delete cache entry for key=%s, filename=%s";
                        zzarq.zza(string2, objectArray);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

