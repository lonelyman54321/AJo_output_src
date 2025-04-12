/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.CancellableContinuationImpl;

public final class lE$a
implements rr_2,
me3_2 {
    public Object a;
    public CancellableContinuationImpl b;
    public final /* synthetic */ le_2 c;

    public lE$a(le_2 object) {
        this.c = object;
        this.a = object = pe_2.p;
    }

    public final void a(wx2_2 wx2_22, int n3) {
        CancellableContinuationImpl cancellableContinuationImpl = this.b;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.a(wx2_22, n3);
        }
    }

    /*
     * Exception decompiling
     */
    public final Object b(f80_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 375->378)] java.lang.Throwable
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

    public final Object next() {
        Object object = this.a;
        Object object2 = pe_2.p;
        if (object != object2) {
            this.a = object2;
            object2 = pe_2.l;
            if (object != object2) {
                return object;
            }
            object = le_2.d;
            object = this.c.v();
            throw object;
        }
        object2 = "`hasNext()` has not been invoked".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

