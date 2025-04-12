/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.bu;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.fc;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

final class fd {
    private static final o a;
    private final byte[] b;
    private final bm c;
    private final String d;
    private final int e;
    private final long f;
    private final String g;
    private int h;

    static {
        o o3;
        a = o3 = new o("SliceMetadataManager");
    }

    public fd(bm bm3, String string2, int n3, long l2, String string3) {
        byte[] byArray = new byte[8192];
        this.b = byArray;
        this.c = bm3;
        this.d = string2;
        this.e = n3;
        this.f = l2;
        this.g = string3;
        this.h = -1;
    }

    private final File n() {
        Object object = this.c;
        String string2 = this.d;
        int n3 = this.e;
        long l2 = this.f;
        String string3 = this.g;
        boolean bl2 = ((File)(object = ((bm)object).o(string2, n3, l2, string3))).exists();
        if (!bl2) {
            ((File)object).mkdirs();
        }
        return object;
    }

    private final File o() {
        Object object = this.c;
        String string2 = this.d;
        int n3 = this.e;
        long l2 = this.f;
        String string3 = this.g;
        object = ((bm)object).n(string2, n3, l2, string3);
        ((File)object).getParentFile().mkdirs();
        ((File)object).createNewFile();
        return object;
    }

    public final int a() {
        Object object = this.c;
        Object object2 = this.d;
        int n3 = this.e;
        long l2 = this.f;
        String string2 = this.g;
        boolean n4 = ((File)(object = ((bm)object).n((String)object2, n3, l2, string2))).exists();
        if (!n4) {
            return 0;
        }
        object2 = new FileInputStream((File)object);
        object = new Properties();
        ((Properties)object).load((InputStream)object2);
        String string3 = "-1";
        object2 = ((Properties)object).getProperty("fileStatus", string3);
        int n7 = Integer.parseInt((String)object2);
        n3 = 4;
        if (n7 == n3) {
            return -1;
        }
        object2 = "previousChunk";
        string3 = ((Properties)object).getProperty((String)object2);
        if (string3 != null) {
            return Integer.parseInt(((Properties)object).getProperty((String)object2)) + 1;
        }
        object = new cz("Slice checkpoint file corrupt.");
        throw object;
        finally {
            try {
                ((InputStream)object2).close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    public final fc b() {
        Object object = "-1";
        Object object2 = this.c;
        Object object3 = this.d;
        int n3 = this.e;
        long l2 = this.f;
        String string2 = this.g;
        boolean bl2 = ((File)(object2 = ((bm)object2).n((String)object3, n3, l2, string2))).exists();
        if (bl2) {
            String string3;
            Object object4;
            block19: {
                Object object5;
                object3 = new Properties();
                object4 = new FileInputStream((File)object2);
                ((Properties)object3).load((InputStream)object4);
                object2 = "fileStatus";
                object4 = ((Properties)object3).getProperty((String)object2);
                string3 = "Slice checkpoint file corrupt.";
                if (object4 == null || (object5 = ((Properties)object3).getProperty((String)(object4 = "previousChunk"))) == null) break block19;
                try {
                    object2 = ((Properties)object3).getProperty((String)object2);
                }
                catch (NumberFormatException numberFormatException) {
                    object2 = new cz(string3, numberFormatException);
                    throw object2;
                }
                int n4 = Integer.parseInt((String)object2);
                object2 = "fileName";
                String string4 = ((Properties)object3).getProperty((String)object2);
                object2 = "fileOffset";
                object2 = ((Properties)object3).getProperty((String)object2, (String)object);
                long l3 = Long.parseLong((String)object2);
                object2 = "remainingBytes";
                object = ((Properties)object3).getProperty((String)object2, (String)object);
                long l4 = Long.parseLong((String)object);
                object = ((Properties)object3).getProperty((String)object4);
                int n7 = Integer.parseInt((String)object);
                object = "metadataFileCounter";
                object2 = "0";
                object = ((Properties)object3).getProperty((String)object, (String)object2);
                int n8 = Integer.parseInt((String)object);
                this.h = n8;
                object5 = object;
                object = new bu(n4, string4, l3, l4, n7);
                return object;
            }
            object = new cz(string3);
            throw object;
            finally {
                ((InputStream)object4).close();
            }
        }
        object = new cz("Slice checkpoint file does not exist.");
        throw object;
    }

    public final File c() {
        File file = this.n();
        String string2 = UX.a(this.h, "-NAM.dat");
        File file2 = new File(file, string2);
        return file2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(InputStream inputStream, long l2) {
        int n3;
        RandomAccessFile randomAccessFile;
        File file;
        block5: {
            file = this.c();
            String string2 = "rw";
            randomAccessFile = new RandomAccessFile(file, string2);
            try {
                randomAccessFile.seek(l2);
                break block5;
            }
            catch (Throwable throwable) {}
            try {
                randomAccessFile.close();
                throw throwable;
            }
            catch (Throwable throwable) {
                throwable.addSuppressed(throwable);
            }
            throw throwable;
        }
        do {
            byte[] byArray;
            if ((n3 = inputStream.read(byArray = this.b)) <= 0) continue;
            byte[] byArray2 = this.b;
            file = null;
            randomAccessFile.write(byArray2, 0, n3);
        } while (n3 >= 0);
        randomAccessFile.close();
    }

    public final void e(long l2, byte[] byArray, int n3, int n4) {
        File file = this.c();
        String string2 = "rw";
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, string2);
        try {
            randomAccessFile.seek(l2);
            randomAccessFile.write(byArray, n3, n4);
            return;
        }
        finally {
            try {
                randomAccessFile.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    public final void f(int n3) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        long l2 = this.c().length();
        Object object = String.valueOf(l2);
        String string2 = "fileOffset";
        properties.put(string2, object);
        Object object2 = String.valueOf(n3);
        properties.put("previousChunk", object2);
        n3 = this.h;
        object2 = String.valueOf(n3);
        properties.put("metadataFileCounter", object2);
        object = this.o();
        object2 = new FileOutputStream((File)object);
        object = null;
        try {
            properties.store((OutputStream)object2, null);
            return;
        }
        finally {
            ((OutputStream)object2).close();
        }
    }

    public final void g(String object, long l2, long l3, int n3) {
        Properties properties = new Properties();
        String string2 = "1";
        properties.put("fileStatus", string2);
        String string3 = "fileName";
        properties.put(string3, object);
        Object object2 = String.valueOf(l2);
        properties.put("fileOffset", object2);
        object2 = String.valueOf(l3);
        properties.put("remainingBytes", object2);
        object2 = String.valueOf(n3);
        properties.put("previousChunk", object2);
        int n4 = this.h;
        object = String.valueOf(n4);
        properties.put("metadataFileCounter", object);
        object2 = this.o();
        object = new FileOutputStream((File)object2);
        object2 = null;
        try {
            properties.store((OutputStream)object, null);
            return;
        }
        finally {
            ((OutputStream)object).close();
        }
    }

    public final void h(byte[] byArray, int n3) {
        Object object;
        Object object2;
        block10: {
            object2 = new Properties();
            Object object3 = "2";
            ((Properties)object2).put("fileStatus", object3);
            object = String.valueOf(n3);
            ((Properties)object2).put("previousChunk", object);
            n3 = this.h;
            object = String.valueOf(n3);
            ((Properties)object2).put("metadataFileCounter", object);
            File file = this.o();
            object = new FileOutputStream(file);
            file = null;
            ((Properties)object2).store((OutputStream)object, null);
            object3 = this.c;
            String string2 = this.d;
            int n4 = this.e;
            long l2 = this.f;
            String string3 = this.g;
            object = ((bm)object3).m(string2, n4, l2, string3);
            boolean bl2 = ((File)object).exists();
            if (!bl2) break block10;
            ((File)object).delete();
        }
        object2 = new FileOutputStream((File)object);
        try {
            ((OutputStream)object2).write(byArray);
            return;
        }
        finally {
            ((OutputStream)object).close();
        }
    }

    public final void i(int n3) {
        Properties properties = new Properties();
        String string2 = "4";
        properties.put("fileStatus", string2);
        Object object = String.valueOf(n3);
        properties.put("previousChunk", object);
        n3 = this.h;
        object = String.valueOf(n3);
        properties.put("metadataFileCounter", object);
        File file = this.o();
        object = new FileOutputStream(file);
        file = null;
        try {
            properties.store((OutputStream)object, null);
            return;
        }
        finally {
            ((OutputStream)object).close();
        }
    }

    /*
     * Exception decompiling
     */
    public final void j(byte[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 87->93)] java.io.IOException
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(byte[] byArray, InputStream inputStream) {
        Throwable throwable2;
        FileOutputStream fileOutputStream;
        block5: {
            int n3;
            this.h = n3 = this.h + 1;
            Object object = this.c();
            fileOutputStream = new FileOutputStream((File)object);
            try {
                fileOutputStream.write(byArray);
                byArray = this.b;
                int n4 = inputStream.read(byArray);
                while (n4 > 0) {
                    object = this.b;
                    fileOutputStream.write((byte[])object, 0, n4);
                    byArray = this.b;
                    n4 = inputStream.read(byArray);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            fileOutputStream.close();
            return;
        }
        try {
            fileOutputStream.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    public final void l(byte[] byArray, int n3, int n4) {
        this.h = n3 = this.h + 1;
        File file = this.c();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        n3 = 0;
        file = null;
        try {
            fileOutputStream.write(byArray, 0, n4);
            return;
        }
        finally {
            fileOutputStream.close();
        }
    }

    /*
     * Exception decompiling
     */
    public final boolean m() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 160->166)] java.io.IOException
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

