/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.et;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

final class er {
    private static final o a;
    private final bm b;
    private final et c;

    static {
        o o3;
        a = o3 = new o("PackMetadataManager");
    }

    public er(bm bm3, et et2) {
        this.b = bm3;
        this.c = et2;
    }

    /*
     * Exception decompiling
     */
    public final String a(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public final void b(String object, int n3, long l2, String object2) {
        boolean bl2;
        if (object2 == null || (bl2 = ((String)object2).isEmpty())) {
            object2 = String.valueOf(n3);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", object2);
        object2 = this.b;
        object = ((bm)object2).k((String)object, n3, l2);
        File file = ((File)object).getParentFile();
        file.mkdirs();
        ((File)object).createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream((File)object);
        object = null;
        try {
            properties.store(fileOutputStream, null);
            return;
        }
        finally {
            ((OutputStream)fileOutputStream).close();
        }
    }
}

