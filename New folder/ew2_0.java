/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ew2
 */
public final class ew2_0 {
    public final xp1_0 a;
    public final B61 b;
    public final bw2 c;
    public final C61 d;
    public boolean e;

    public ew2_0(xp1_0 object) {
        B61 b61;
        this.a = object;
        object = ((xp1_0)object).y.b;
        this.b = b61 = new B61((zp1)object);
        this.c = object = new bw2();
        this.d = object = new C61();
    }

    /*
     * Exception decompiling
     */
    public final int a(cw2_0 var1_1, Ow2 var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [8 : 143->148)] java.lang.Throwable
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

    public final void b() {
        boolean bl2 = this.e;
        if (!bl2) {
            this.c.a.d();
            Object object = this.b;
            Object[] objectArray = ((B61)object).b.a;
            int n3 = objectArray.c;
            if (n3 > 0) {
                objectArray = objectArray.a;
                int n4 = 0;
                do {
                    S32 s32 = (S32)objectArray[n4];
                    s32.d();
                } while (++n4 < n3);
            }
            object = ((B61)object).b.a;
            ((WR1)object).g();
        }
    }
}

