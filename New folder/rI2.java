/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class rI2
extends qg3_2
implements Function2 {
    public Throwable a;
    public int b;
    public int c;
    public final /* synthetic */ gx0_2 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ fc1_0 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ tr1_0 k;

    public rI2(gx0_2 gx0_22, Context context, fc1_0 fc1_02, String string2, String string3, String string4, String string5, tr1_0 tr1_02, f80_0 f80_02) {
        this.d = gx0_22;
        this.e = context;
        this.f = fc1_02;
        this.g = string2;
        this.h = string3;
        this.i = string4;
        this.j = string5;
        this.k = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.j;
        tr1_0 tr1_02 = this.k;
        gx0_2 gx0_22 = this.d;
        Context context = this.e;
        fc1_0 fc1_02 = this.f;
        String string3 = this.g;
        String string4 = this.h;
        String string5 = this.i;
        object = new rI2(gx0_22, context, fc1_02, string3, string4, string5, string2, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rI2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rI2)object).invokeSuspend(object2);
    }

    /*
     * Exception decompiling
     */
    public final Object invokeSuspend(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 205->209)] java.lang.Throwable
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

