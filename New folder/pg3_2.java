/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pg3
 */
public final class pg3_2
extends is2_2 {
    public final List b;
    public final pg3$a_0 c;
    public Object d;
    public final f80_0[] e;
    public int f;
    public int g;

    public pg3_2(Object f80_0Array, Object object, List list) {
        Intrinsics.checkNotNullParameter(f80_0Array, "initial");
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(list, "blocks");
        super(object);
        this.b = list;
        this.c = object = new pg3$a_0(this);
        this.d = f80_0Array;
        f80_0Array = new f80_0[list.size()];
        this.e = f80_0Array;
        this.f = -1;
    }

    public final Object a(f80_0 object, Object object2) {
        this.g = 0;
        Object object3 = this.b;
        int n3 = object3.size();
        if (n3 == 0) {
            return object2;
        }
        object3 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.d = object2;
        int n4 = this.f;
        if (n4 < 0) {
            return this.c((f80_0)object);
        }
        object = new IllegalStateException("Already started");
        throw object;
    }

    public final Object b() {
        return this.d;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object c(f80_0 object) {
        void var5_14;
        int n3 = this.g;
        List list = this.b;
        int n4 = list.size();
        if (n3 == n4) {
            Object object2 = this.d;
        } else {
            f80_0 f80_02 = zj1_2.b((f80_0)object);
            String string2 = "continuation";
            Intrinsics.checkNotNullParameter(f80_02, string2);
            n4 = this.f;
            int n7 = 1;
            this.f = n4 += n7;
            f80_0[] f80_0Array = this.e;
            f80_0Array[n4] = f80_02;
            n3 = (int)(this.e(n7 != 0) ? 1 : 0);
            if (n3 != 0) {
                n3 = this.f;
                if (n3 < 0) {
                    object = new IllegalStateException("No more continuations to resume");
                    throw object;
                }
                this.f = n4 = n3 + -1;
                n4 = 0;
                Object var3_5 = null;
                f80_0Array[n3] = null;
                Object object3 = this.d;
            } else {
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
            }
        }
        j90_0 j90_03 = j90_0.COROUTINE_SUSPENDED;
        if (var5_14 == j90_03) {
            String string3 = "frame";
            Intrinsics.checkNotNullParameter(object, string3);
        }
        return var5_14;
    }

    public final Object d(f80_0 f80_02, Object object) {
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.d = object;
        return this.c(f80_02);
    }

    /*
     * Exception decompiling
     */
    public final boolean e(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[DOLOOP]], but top level block is 9[TRYBLOCK]
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(Object object) {
        int n3;
        int n4 = this.f;
        if (n4 < 0) {
            String string2 = "No more continuations to resume".toString();
            object = new IllegalStateException(string2);
            throw object;
        }
        Object object2 = this.e;
        f80_0 f80_02 = object2[n4];
        Intrinsics.checkNotNull(f80_02);
        int n7 = this.f;
        this.f = n3 = n7 + -1;
        n3 = 0;
        object2[n7] = null;
        object2 = tl2_2.b;
        boolean bl2 = object instanceof tL2$b;
        if (!bl2) {
            f80_02.resumeWith(object);
            return;
        }
        object = tl2_2.a(object);
        Intrinsics.checkNotNull(object);
        Intrinsics.checkNotNullParameter(object, "exception");
        object2 = "continuation";
        Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        try {
            ((Throwable)object).getCause();
            object2 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object2);
        }
        catch (Throwable throwable) {}
        object2 = tl2_2.b;
        object = vl2_2.a((Throwable)object);
        f80_02.resumeWith(object);
    }

    public final CoroutineContext getCoroutineContext() {
        return this.c.getContext();
    }
}

