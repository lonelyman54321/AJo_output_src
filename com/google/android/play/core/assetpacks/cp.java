/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.co;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dv;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;

final class cp {
    private static final o a;
    private final byte[] b;
    private final bm c;
    private final dd d;
    private final er e;
    private final aq f;
    private final aq g;

    static {
        o o3;
        a = o3 = new o("ExtractChunkTaskHandler");
    }

    public cp(bm bm3, aq aq2, aq aq4, dd dd2, er er2) {
        byte[] byArray = new byte[8192];
        this.b = byArray;
        this.c = bm3;
        this.f = aq2;
        this.g = aq4;
        this.d = dd2;
        this.e = er2;
    }

    private final File b(co object) {
        bm bm3 = this.c;
        String string2 = ((dv)object).l;
        int n3 = ((co)object).a;
        long l2 = ((co)object).b;
        String string3 = ((co)object).d;
        object = bm3.p(string2, n3, l2, string3);
        boolean bl2 = ((File)object).exists();
        if (!bl2) {
            ((File)object).mkdirs();
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public final void a(co var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [19 : 396->399)] java.lang.Throwable
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

