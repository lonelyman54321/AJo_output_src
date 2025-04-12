/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from qF
 */
public final class qf_1
extends qg3_2
implements Function2 {
    public Object a;
    public gf_2 b;
    public gf_2 c;
    public uf_1 d;
    public b93_0 e;
    public int f;
    public final /* synthetic */ uf_1 g;
    public final /* synthetic */ gf_2 h;
    public final /* synthetic */ gf_2 i;

    public qf_1(uf_1 uf_12, if_1 if_12, if_1 if_13, f80_0 f80_02) {
        this.g = uf_12;
        this.h = if_12;
        this.i = if_13;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        if_1 if_12 = (if_1)this.h;
        if_1 if_13 = (if_1)this.i;
        uf_1 uf_12 = this.g;
        object = new qf_1(uf_12, if_12, if_13, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qf_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qf_1)object).invokeSuspend(object2);
    }

    /*
     * Exception decompiling
     */
    public final Object invokeSuspend(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 264->271)] java.lang.Throwable
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

