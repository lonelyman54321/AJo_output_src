/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class LQ1
implements Closeable {
    public final File a;
    public final long b;
    public final File c;
    public final RandomAccessFile d;
    public final FileChannel e;
    public final FileLock f;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public LQ1(File file, File object) {
        void var1_8;
        block16: {
            block17: {
                long l2;
                file.getPath();
                ((File)object).getPath();
                this.a = file;
                this.c = object;
                this.b = l2 = LQ1.b(file);
                file = new File((File)object, "MultiDex.lock");
                String string2 = "rw";
                this.d = object = new RandomAccessFile(file, string2);
                try {
                    this.e = object = ((RandomAccessFile)object).getChannel();
                }
                catch (IOException iOException) {
                    break block16;
                }
                try {
                    file.getPath();
                    this.f = object = ((FileChannel)object).lock();
                }
                catch (Error error) {
                    break block17;
                }
                catch (RuntimeException runtimeException) {
                    break block17;
                }
                catch (IOException iOException) {
                    // empty catch block
                    break block17;
                }
                file.getPath();
                return;
                catch (Error error) {
                    break block16;
                }
                catch (RuntimeException runtimeException) {
                    break block16;
                }
            }
            object = this.e;
            try {
                object.close();
            }
            catch (IOException iOException) {
                throw file;
            }
            {
                throw file;
            }
        }
        object = this.d;
        try {
            ((RandomAccessFile)object).close();
            throw var1_8;
        }
        catch (IOException iOException) {
            throw var1_8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(ZipFile closeable, ZipEntry object, LQ1$a object2, String object3) {
        Throwable throwable3;
        block15: {
            block14: {
                block16: {
                    Throwable throwable22;
                    Object object4;
                    block11: {
                        Object object5;
                        block12: {
                            block13: {
                                int n3;
                                closeable = ((ZipFile)closeable).getInputStream((ZipEntry)object);
                                object3 = kp1_0.c("tmp-", (String)object3);
                                object4 = ((File)object2).getParentFile();
                                object5 = ".zip";
                                object3 = File.createTempFile((String)object3, (String)object5, (File)object4);
                                ((File)object3).getPath();
                                Object object6 = new FileOutputStream((File)object3);
                                object5 = new BufferedOutputStream((OutputStream)object6);
                                object4 = new ZipOutputStream((OutputStream)object5);
                                try {
                                    int n4;
                                    object6 = "classes.dex";
                                    object5 = new ZipEntry((String)object6);
                                    long l2 = ((ZipEntry)object).getTime();
                                    ((ZipEntry)object5).setTime(l2);
                                    ((ZipOutputStream)object4).putNextEntry((ZipEntry)object5);
                                    n3 = 16384;
                                    object = new byte[n3];
                                    int n7 = ((InputStream)closeable).read((byte[])object);
                                    while (n7 != (n4 = -1)) {
                                        n4 = 0;
                                        object6 = null;
                                        ((ZipOutputStream)object4).write((byte[])object, 0, n7);
                                        n7 = ((InputStream)closeable).read((byte[])object);
                                    }
                                }
                                catch (Throwable throwable22) {
                                    break block11;
                                }
                                ((ZipOutputStream)object4).closeEntry();
                                try {
                                    ((ZipOutputStream)object4).close();
                                    n3 = ((File)object3).setReadOnly() ? 1 : 0;
                                    if (n3 == 0) break block12;
                                    ((File)object2).getPath();
                                    n3 = ((File)object3).renameTo((File)object2) ? 1 : 0;
                                    if (n3 == 0) break block13;
                                }
                                catch (Throwable throwable3) {}
                                try {
                                    closeable.close();
                                    break block14;
                                }
                                catch (IOException iOException) {}
                            }
                            object4 = new StringBuilder();
                            object5 = "Failed to rename \"";
                            ((StringBuilder)object4).append((String)object5);
                            object5 = ((File)object3).getAbsolutePath();
                            ((StringBuilder)object4).append((String)object5);
                            object5 = "\" to \"";
                            ((StringBuilder)object4).append((String)object5);
                            object2 = ((File)object2).getAbsolutePath();
                            ((StringBuilder)object4).append((String)object2);
                            object2 = "\"";
                            ((StringBuilder)object4).append((String)object2);
                            object2 = ((StringBuilder)object4).toString();
                            object = new IOException((String)object2);
                            throw object;
                            break block16;
                        }
                        object4 = new StringBuilder();
                        object5 = "Failed to mark readonly \"";
                        ((StringBuilder)object4).append((String)object5);
                        object5 = ((File)object3).getAbsolutePath();
                        ((StringBuilder)object4).append((String)object5);
                        object5 = "\" (tmp of \"";
                        ((StringBuilder)object4).append((String)object5);
                        object2 = ((File)object2).getAbsolutePath();
                        ((StringBuilder)object4).append((String)object2);
                        object2 = "\")";
                        ((StringBuilder)object4).append((String)object2);
                        object2 = ((StringBuilder)object4).toString();
                        object = new IOException((String)object2);
                        throw object;
                    }
                    ((ZipOutputStream)object4).close();
                    throw throwable22;
                }
                try {
                    closeable.close();
                    break block15;
                }
                catch (IOException iOException) {}
            }
            ((File)object3).delete();
            return;
        }
        ((File)object3).delete();
        throw throwable3;
    }

    public static long b(File object) {
        long l2;
        long l3;
        int n3;
        Object object2 = "r";
        RandomAccessFile randomAccessFile = new RandomAccessFile((File)object, (String)object2);
        object = KJ3.a(randomAccessFile);
        object2 = new CRC32();
        long l4 = ((KJ3$a)object).b;
        long l7 = ((KJ3$a)object).a;
        randomAccessFile.seek(l7);
        l7 = 16384L;
        long l8 = Math.min(l7, l4);
        int n4 = (int)l8;
        int n7 = 16384;
        byte[] byArray = new byte[n7];
        n4 = randomAccessFile.read(byArray, 0, n4);
        while (n4 != (n3 = -1)) {
            ((CRC32)object2).update(byArray, 0, n4);
            long l12 = n4;
            l4 -= l12;
            l12 = 0L;
            n4 = l4 == l12 ? 0 : (l4 < l12 ? -1 : 1);
            if (n4 == 0) break;
            l12 = Math.min(l7, l4);
            n4 = (int)l12;
            n4 = randomAccessFile.read(byArray, 0, n4);
        }
        try {
            l3 = ((CRC32)object2).getValue();
            l2 = -1;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            randomAccessFile.close();
        }
        n4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (n4 == 0) {
            l2 = 1L;
            l3 -= l2;
        }
        return l3;
    }

    public static void k(Context context, long l2, long l3, ArrayList object) {
        boolean bl2;
        int n3 = 4;
        context = context.getSharedPreferences("multidex.version", n3).edit();
        String string2 = "timestamp";
        context.putLong(string2, l2);
        context.putLong("crc", l3);
        int n4 = ((ArrayList)object).size() + 1;
        String string3 = "dex.number";
        context.putInt(string3, n4);
        Iterator iterator = ((ArrayList)object).iterator();
        int n7 = 2;
        while (bl2 = iterator.hasNext()) {
            LQ1$a lQ1$a = (LQ1$a)iterator.next();
            CharSequence charSequence = hj0_0.a(n7, "dex.crc.");
            long l4 = lQ1$a.a;
            context.putLong((String)charSequence, l4);
            object = "dex.time.";
            charSequence = new StringBuilder((String)object);
            ((StringBuilder)charSequence).append(n7);
            charSequence = ((StringBuilder)charSequence).toString();
            l4 = lQ1$a.lastModified();
            context.putLong((String)charSequence, l4);
            ++n7;
        }
        context.commit();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList c(Context var1_1, boolean var2_2) {
        var3_3 = this.a;
        var3_3.getPath();
        var4_4 = this.f;
        var5_5 = var4_4.isValid();
        if (!var5_5) {
            var1_1 = new IllegalStateException("MultiDexExtractor was closed");
            throw var1_1;
        }
        var6_6 = 1L;
        var8_7 = -1;
        if (var2_2) ** GOTO lbl37
        var10_8 = 4;
        var11_9 = var1_1.getSharedPreferences("multidex.version", var10_8);
        var12_10 = "timestamp";
        var13_11 = var11_9.getLong((String)var12_10, var8_7);
        var15_12 = var3_3.lastModified();
        cfr_temp_0 = var15_12 - var8_7;
        var17_13 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
        if (var17_13 == false) {
            var15_12 -= var6_6;
        }
        if ((var17_13 = var13_11 == var15_12 ? 0 : (var13_11 < var15_12 ? -1 : 1)) != false || (var2_2 = (cfr_temp_1 = (var13_11 = var11_9.getLong((String)(var12_10 = "crc"), var8_7)) - (var15_12 = this.b)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) ** GOTO lbl37
        try {
            var1_1 = this.d((Context)var1_1);
        }
        catch (IOException v0) {
            block6: {
                var11_9 = this.h();
                var13_11 = var3_3.lastModified();
                var18_14 = var13_11 == var8_7 ? 0 : (var13_11 < var8_7 ? -1 : 1);
                if (var18_14 == false) {
                    var13_11 -= var6_6;
                }
                var6_6 = var13_11;
                var8_7 = this.b;
                var3_3 = var1_1;
                var12_10 = var11_9;
                LQ1.k((Context)var1_1, var13_11, var8_7, var11_9);
                break block6;
lbl37:
                // 2 sources

                var11_9 = this.h();
                var13_11 = var3_3.lastModified();
                cfr_temp_2 = var13_11 - var8_7;
                var18_15 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                if (var18_15 == false) {
                    var13_11 -= var6_6;
                }
                var19_16 = this.b;
                var12_10 = var1_1;
                LQ1.k((Context)var1_1, var13_11, var19_16, var11_9);
            }
            var1_1 = var11_9;
        }
        var1_1.size();
        return var1_1;
    }

    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }

    public final ArrayList d(Context object) {
        CharSequence charSequence = new StringBuilder();
        String string2 = this.a.getName();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(".classes");
        charSequence = ((StringBuilder)charSequence).toString();
        object = object.getSharedPreferences("multidex.version", 4);
        string2 = "dex.number";
        int n3 = 1;
        int n4 = object.getInt(string2, n3);
        int n7 = n4 + -1;
        ArrayList<LQ1$a> arrayList = new ArrayList<LQ1$a>(n7);
        for (n7 = 2; n7 <= n4; ++n7) {
            CharSequence charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(n7);
            ((StringBuilder)charSequence2).append(".zip");
            charSequence2 = ((StringBuilder)charSequence2).toString();
            Object object2 = this.c;
            LQ1$a lQ1$a = new LQ1$a((File)object2, (String)charSequence2);
            boolean bl2 = lQ1$a.isFile();
            if (bl2) {
                long l2;
                long l3;
                long l4;
                lQ1$a.a = l4 = LQ1.b(lQ1$a);
                object2 = "dex.crc.";
                charSequence2 = new StringBuilder((String)object2);
                ((StringBuilder)charSequence2).append(n7);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                l4 = -1;
                long l7 = object.getLong((String)charSequence2, l4);
                String string3 = "dex.time.";
                charSequence2 = new StringBuilder(string3);
                ((StringBuilder)charSequence2).append(n7);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                l4 = object.getLong((String)charSequence2, l4);
                long l8 = lQ1$a.lastModified();
                bl2 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
                if (!bl2 && !(bl2 = (l3 = l7 - (l2 = lQ1$a.a)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) {
                    arrayList.add(lQ1$a);
                    continue;
                }
                charSequence = new StringBuilder("Invalid extracted dex: ");
                ((StringBuilder)charSequence).append(lQ1$a);
                ((StringBuilder)charSequence).append(" (key \"\"), expected modification time: ");
                ((StringBuilder)charSequence).append(l4);
                fn0_2.b((StringBuilder)charSequence, ", modification time: ", l8, ", expected crc: ");
                ((StringBuilder)charSequence).append(l7);
                ((StringBuilder)charSequence).append(", file crc: ");
                long l12 = lQ1$a.a;
                ((StringBuilder)charSequence).append(l12);
                charSequence = ((StringBuilder)charSequence).toString();
                object = new IOException((String)charSequence);
                throw object;
            }
            charSequence = new StringBuilder("Missing extracted secondary dex file '");
            string2 = lQ1$a.getPath();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("'");
            charSequence = ((StringBuilder)charSequence).toString();
            object = new IOException((String)charSequence);
            throw object;
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    public final ArrayList h() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 17[TRYBLOCK] [22 : 373->379)] java.lang.Throwable
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
}

