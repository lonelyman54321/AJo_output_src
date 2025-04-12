/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 * Renamed from fe3
 */
public final class fe3_0
implements Closeable {
    public final InputStream a;
    public final Charset b;
    public byte[] c;
    public int d;
    public int e;

    public fe3_0(FileInputStream object) {
        Charset charset = cz3.a;
        if (charset != null) {
            boolean bl2 = charset.equals(charset);
            if (bl2) {
                this.a = object;
                this.b = charset;
                object = new byte[8192];
                this.c = (byte[])object;
                return;
            }
            object = new IllegalArgumentException("Unsupported encoding");
            throw object;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    public final String a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [17 : 178->181)] java.lang.Throwable
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
    public final void close() {
        InputStream inputStream = this.a;
        synchronized (inputStream) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object = this.c;
                        if (object == null) break block3;
                        object = null;
                        this.c = null;
                        object = this.a;
                        ((InputStream)object).close();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

