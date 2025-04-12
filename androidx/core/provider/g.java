/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.core.provider;

import android.content.Context;
import androidx.core.provider.RequestExecutor$DefaultThreadFactory;
import androidx.core.provider.g$a;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g {
    public static final WC1 a;
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final a53 d;

    static {
        Object object = new WC1(16);
        a = object;
        RequestExecutor$DefaultThreadFactory requestExecutor$DefaultThreadFactory = new Object();
        requestExecutor$DefaultThreadFactory.a = "fonts-androidx";
        requestExecutor$DefaultThreadFactory.b = 10;
        long l2 = 10000;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<Runnable>();
        object = new ThreadPoolExecutor(0, 1, l2, timeUnit, linkedBlockingDeque, requestExecutor$DefaultThreadFactory);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(true);
        b = object;
        c = object = new Object();
        d = object = new a53();
    }

    public static String a(int n3, List list) {
        int n4;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            String string2 = ((gV0)list.get((int)i3)).e;
            stringBuilder.append(string2);
            string2 = "-";
            stringBuilder.append(string2);
            stringBuilder.append(n3);
            n4 = list.size() + -1;
            if (i3 >= n4) continue;
            string2 = ";";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    public static g$a b(int var0, Context var1_1, String var2_2, List var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [5, 4 : 60->64)] java.lang.Throwable
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

