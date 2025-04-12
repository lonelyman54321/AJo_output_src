/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.internal.Reflection;

public final class ox3 {
    public static final String a;
    public static final String b;
    public static dl0_1 c;

    static {
        new ox3();
        String string2 = Reflection.getOrCreateKotlinClass(ox3.class).getSimpleName();
        if (string2 == null) {
            string2 = "UrlRedirectCache";
        }
        a = string2;
        b = string2.concat("_Redirect");
    }

    /*
     * Exception decompiling
     */
    public static final void a(Uri var0, Uri var1_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [22 : 98->101)] java.lang.Throwable
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
    public static final dl0_1 b() {
        Class<ox3> clazz = ox3.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                dl0_1 dl0_12;
                block3: {
                    try {
                        dl0_12 = c;
                        if (dl0_12 != null) break block3;
                        String string2 = a;
                        DL0$d dL0$d = new DL0$d();
                        dl0_12 = new dl0_1(string2, dL0$d);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                c = dl0_12;
                return dl0_12;
            }
            throw throwable2;
        }
    }
}

