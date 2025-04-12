/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from sq1
 */
public final class sq1_2
extends qg3_2
implements Function2 {
    public Ref$BooleanRef a;
    public Ref$ObjectRef b;
    public Ref$IntRef c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Vo0 k;
    public final /* synthetic */ zr1 l;
    public final /* synthetic */ int m;

    public sq1_2(int n3, Vo0 vo0, zr1 zr12, int n4, f80_0 f80_02) {
        this.j = n3;
        this.k = vo0;
        this.l = zr12;
        this.m = n4;
        super(2, f80_02);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final boolean c(boolean n3, zr1 zr12, int n4, int n7) {
        boolean bl2 = false;
        if (n3 != 0) {
            n3 = zr12.e();
            if (n3 > n4) return true;
            n3 = zr12.e();
            if (n3 != n4) return bl2;
            n3 = zr12.d();
            if (n3 <= n7) return bl2;
            return true;
        } else {
            n3 = zr12.e();
            if (n3 < n4) return true;
            n3 = zr12.e();
            if (n3 != n4) return bl2;
            n3 = zr12.d();
            if (n3 >= n7) return bl2;
        }
        return true;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Vo0 vo0 = this.k;
        zr1 zr12 = this.l;
        int n3 = this.j;
        int n4 = this.m;
        sq1_2 sq1_22 = new sq1_2(n3, vo0, zr12, n4, f80_02);
        sq1_22.i = object;
        return sq1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (sq1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sq1_2)object).invokeSuspend(object2);
    }

    /*
     * Exception decompiling
     */
    public final Object invokeSuspend(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 280->283)] tk1_0
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

