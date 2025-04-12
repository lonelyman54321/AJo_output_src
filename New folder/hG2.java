/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class hG2
extends FilterInputStream {
    public volatile byte[] a;
    public int b;
    public int c;
    public int d = -1;
    public int e;
    public final Kp f;

    public hG2(InputStream object, Kp kp) {
        super((InputStream)object);
        this.f = kp;
        object = (byte[])kp.c(byte[].class, 65536);
        this.a = (byte[])object;
    }

    public static void b() {
        IOException iOException = new IOException("BufferedInputStream is closed");
        throw iOException;
    }

    public final int a(InputStream inputStream, byte[] byArray) {
        int n3;
        int n4;
        int n7 = this.d;
        int n8 = 0;
        int n10 = -1;
        if (n7 != n10 && (n4 = this.e - n7) < (n3 = this.c)) {
            if (n7 == 0 && n3 > (n10 = byArray.length) && (n10 = this.b) == (n4 = byArray.length)) {
                n7 = byArray.length * 2;
                if (n7 <= n3) {
                    n3 = n7;
                }
                byte[] byArray2 = (byte[])this.f.c(byte[].class, n3);
                n10 = byArray.length;
                System.arraycopy(byArray, 0, byArray2, 0, n10);
                this.a = byArray2;
                Kp kp = this.f;
                kp.put(byArray);
                byArray = byArray2;
            } else if (n7 > 0) {
                n10 = byArray.length - n7;
                System.arraycopy(byArray, n7, byArray, 0, n10);
            }
            n7 = this.e;
            n10 = this.d;
            this.e = n7 -= n10;
            this.d = 0;
            this.b = 0;
            n8 = byArray.length - n7;
            int n14 = inputStream.read(byArray, n7, n8);
            int n15 = this.e;
            if (n14 > 0) {
                n15 += n14;
            }
            this.b = n15;
            return n14;
        }
        int n16 = inputStream.read(byArray);
        if (n16 > 0) {
            this.d = n10;
            this.e = 0;
            this.b = n16;
        }
        return n16;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int available() {
        synchronized (this) {
            Throwable throwable2;
            InputStream inputStream;
            block5: {
                int n3;
                try {
                    inputStream = this.in;
                    byte[] byArray = this.a;
                    if (byArray == null || inputStream == null) break block5;
                    int n4 = this.b;
                    int n7 = this.e;
                    n4 -= n7;
                    n3 = inputStream.available();
                }
                catch (Throwable throwable2) {}
                return n4 += n3;
            }
            hG2.b();
            boolean bl2 = false;
            inputStream = null;
            throw null;
            throw throwable2;
        }
    }

    public final void close() {
        Object object = this.a;
        if (object != null) {
            object = this.f;
            byte[] byArray = this.a;
            object.put(byArray);
            this.a = null;
        }
        object = this.in;
        this.in = null;
        if (object != null) {
            object.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void mark(int n3) {
        synchronized (this) {
            int n4 = this.c;
            this.c = n3 = Math.max(n4, n3);
            this.d = n3 = this.e;
            return;
        }
    }

    public final boolean markSupported() {
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read() {
        synchronized (this) {
            block9: {
                try {
                    var1_1 = this.a;
                    var2_3 = this.in;
                    var3_4 = 0;
                    if (var1_1 == null || var2_3 == null) ** GOTO lbl-1000
                    var4_5 = this.e;
                    var5_6 = this.b;
                    var6_7 = -1;
                    if (var4_5 >= var5_6 && (var7_8 = this.a((InputStream)var2_3, var1_1)) == var6_7) {
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_2) {
                    break block9;
                }
                return var6_7;
lbl-1000:
                // 1 sources

                {
                    var2_3 = this.a;
                    if (var1_1 != var2_3 && (var1_1 = this.a) == null) {
                        hG2.b();
                        throw null;
                    }
                    var7_8 = this.b;
                    var3_4 = this.e;
                    if ((var7_8 -= var3_4) <= 0) return var6_7;
                    var7_8 = var3_4 + 1;
                }
                {
                    this.e = var7_8;
                    return var1_1[var3_4] & 255;
                }
lbl-1000:
                // 1 sources

                {
                    hG2.b();
                    throw null;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Exception decompiling
     */
    public final int read(byte[] var1_1, int var2_3, int var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [8 : 140->144)] java.lang.Throwable
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = this.a;
                        if (object == null) break block4;
                        object = this.f;
                        byte[] byArray = this.a;
                        object.put(byArray);
                        object = null;
                        this.a = null;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reset() {
        Object object = "Mark has been invalidated, pos: ";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = this.a;
                    if (object2 == null) {
                        object2 = "Stream is closed";
                        object = new IOException((String)object2);
                        throw object;
                    }
                    int n3 = -1;
                    int n4 = this.d;
                    if (n3 != n4) {
                        this.e = n4;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = new hG2$a;
                StringBuilder stringBuilder = new StringBuilder((String)object);
                int n7 = this.e;
                stringBuilder.append(n7);
                object = " markLimit: ";
                stringBuilder.append((String)object);
                n7 = this.c;
                stringBuilder.append(n7);
                object = stringBuilder.toString();
                object2((String)object);
                throw object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long skip(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block18: {
                block13: {
                    block14: {
                        block17: {
                            long l3;
                            int n3;
                            InputStream inputStream;
                            long l4;
                            block15: {
                                int n4;
                                Object object;
                                int n7;
                                long l7;
                                block16: {
                                    long l8;
                                    byte[] byArray;
                                    l7 = 1L;
                                    l4 = 0L;
                                    long l12 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                                    if (l12 < 0) {
                                        return l4;
                                    }
                                    try {
                                        byArray = this.a;
                                        n7 = 0;
                                        if (byArray == null) break block13;
                                        inputStream = this.in;
                                        if (inputStream == null) break block14;
                                    }
                                    catch (Throwable throwable2) {}
                                    n7 = this.b;
                                    n3 = this.e;
                                    int n8 = n7 - n3;
                                    l3 = n8;
                                    long l14 = l3 - l2;
                                    object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                    if (object >= 0) {
                                        l7 = (long)n3 + l2;
                                        n7 = (int)l7;
                                        this.e = n7;
                                        return l2;
                                    }
                                    l3 = n7;
                                    long l15 = n3;
                                    l3 -= l15;
                                    this.e = n7;
                                    n7 = this.d;
                                    n3 = -1;
                                    if (n7 == n3 || (n7 = (int)((l8 = l2 - (l15 = (long)this.c)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) > 0) break block15;
                                    n4 = this.a(inputStream, byArray);
                                    if (n4 != n3) break block16;
                                    return l3;
                                }
                                n4 = this.b;
                                n7 = this.e;
                                int n10 = n4 - n7;
                                l4 = n10;
                                long l16 = l2 - l3;
                                object = l4 == l16 ? 0 : (l4 < l16 ? -1 : 1);
                                if (object >= 0) {
                                    l7 = (long)n7 + l2 - l3;
                                    n7 = (int)l7;
                                    this.e = n7;
                                    return l2;
                                }
                                l2 = n4;
                                l3 += l2;
                                l2 = n7;
                                l3 -= l2;
                                this.e = n4;
                                return l3;
                            }
                            l2 -= l3;
                            l2 = inputStream.skip(l2);
                            long l17 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                            if (l17 <= 0) break block17;
                            this.d = n3;
                        }
                        return l3 += l2;
                    }
                    hG2.b();
                    throw null;
                    break block18;
                }
                hG2.b();
                throw null;
            }
            throw throwable2;
        }
    }
}

