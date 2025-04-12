/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class rF$a
extends qg3_2
implements Function2 {
    public byte[] a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uf_1 d;
    public final /* synthetic */ if_1 e;
    public final /* synthetic */ if_1 f;

    public rF$a(uf_1 uf_12, if_1 if_12, if_1 if_13, f80_0 f80_02) {
        this.d = uf_12;
        this.e = if_12;
        this.f = if_13;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        if_1 if_12 = this.e;
        if_1 if_13 = this.f;
        uf_1 uf_12 = this.d;
        rF$a rF$a = new rF$a(uf_12, if_12, if_13, f80_02);
        rF$a.c = object;
        return rF$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rF$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rF$a)object).invokeSuspend(object2);
    }

    /*
     * Exception decompiling
     */
    public final Object invokeSuspend(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 103->110)] java.lang.Throwable
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

