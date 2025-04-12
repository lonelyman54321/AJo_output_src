/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class LF2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ FF2 c;
    public final /* synthetic */ pr1_1 d;
    public final /* synthetic */ pr1_1 e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ pr1_1 h;
    public final /* synthetic */ List i;
    public final /* synthetic */ pr1_1 j;
    public final /* synthetic */ Set k;

    public LF2$a(FF2 fF2, pr1_1 pr1_12, pr1_1 pr1_13, List list, List list2, pr1_1 pr1_14, List list3, pr1_1 pr1_15, Set set) {
        this.c = fF2;
        this.d = pr1_12;
        this.e = pr1_13;
        this.f = list;
        this.g = list2;
        this.h = pr1_14;
        this.i = list3;
        this.j = pr1_15;
        this.k = set;
        super(1);
    }

    /*
     * Exception decompiling
     */
    public final Object invoke(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [14 : 240->245)] java.lang.Throwable
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

