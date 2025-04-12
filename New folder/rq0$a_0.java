/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rq0$a
 */
public final class rq0$a_0 {
    public final rq0$b_0 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ rq0_2 d;

    public rq0$a_0(rq0_2 object, rq0$b_0 rq0$b_0) {
        String string2 = "entry";
        Intrinsics.checkNotNullParameter(rq0$b_0, string2);
        this.d = object;
        this.a = rq0$b_0;
        boolean bl2 = rq0$b_0.e;
        if (bl2) {
            boolean bl3 = false;
            object = null;
        } else {
            object.getClass();
            int n3 = 2;
            object = new boolean[n3];
        }
        this.b = (boolean[])object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        rq0_2 rq0_22 = this.d;
        synchronized (rq0_22) {
            Throwable throwable2;
            block7: {
                block6: {
                    boolean bl2;
                    boolean bl3;
                    try {
                        bl3 = this.c;
                        bl2 = true;
                        if (!(bl3 ^= bl2)) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    Object object = this.a;
                    object = ((rq0$b_0)object).g;
                    bl3 = Intrinsics.areEqual(object, this);
                    if (bl3) {
                        bl3 = false;
                        object = null;
                        rq0_22.b(this, false);
                    }
                    this.c = bl2;
                    object = Unit.a;
                    return;
                }
                String string2 = "Check failed.";
                {
                    string2 = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        rq0_2 rq0_22 = this.d;
        synchronized (rq0_22) {
            Throwable throwable2;
            block7: {
                block6: {
                    boolean bl2;
                    boolean bl3;
                    try {
                        bl3 = this.c;
                        bl2 = true;
                        if (!(bl3 ^= bl2)) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    Object object = this.a;
                    object = ((rq0$b_0)object).g;
                    bl3 = Intrinsics.areEqual(object, this);
                    if (bl3) {
                        rq0_22.b(this, bl2);
                    }
                    this.c = bl2;
                    object = Unit.a;
                    return;
                }
                String string2 = "Check failed.";
                {
                    string2 = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }

    public final void c() {
        rq0$b_0 rq0$b_0 = this.a;
        Object object = rq0$b_0.g;
        boolean bl2 = Intrinsics.areEqual(object, this);
        if (bl2) {
            object = this.d;
            boolean bl3 = ((rq0_2)object).l;
            if (bl3) {
                rq0$b_0 = null;
                ((rq0_2)object).b(this, false);
            } else {
                rq0$b_0.f = bl2 = true;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final y63_0 d(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [11 : 104->108)] java.lang.Throwable
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

