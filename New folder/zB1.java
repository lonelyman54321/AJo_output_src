/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class zB1 {
    /*
     * Exception decompiling
     */
    public static da3_1 a(String[] var0, int var1_1,  /* corrupt varargs signature?! */ intint var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [130[CASE]], but top level block is 136[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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

    public static final xb1_0 b(xb1_0 object) {
        object = ((xb1_0)object).m.m;
        while (true) {
            xp1_0 xp1_02 = ((xp1_0)object).A();
            xp1_0 xp1_03 = null;
            if ((xp1_02 = xp1_02 != null ? xp1_02.c : null) == null) break;
            xp1_02 = ((xp1_0)object).A();
            if (xp1_02 != null) {
                xp1_03 = xp1_02.c;
            }
            Intrinsics.checkNotNull(xp1_03);
            xp1_03.getClass();
            object = ((xp1_0)object).A();
            Intrinsics.checkNotNull(object);
            object = ((xp1_0)object).c;
            Intrinsics.checkNotNull(object);
        }
        object = ((xp1_0)object).y.c.h1();
        Intrinsics.checkNotNull(object);
        return object;
    }
}

