/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class mp0$a
extends Rb3 {
    public static final Object h;
    public int c;
    public int d;
    public i62 e;
    public Object f;
    public int g;

    static {
        Object object;
        h = object = new Object();
    }

    public mp0$a() {
        Object object = j62.a;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.e = object;
        this.f = object = h;
    }

    public final void a(Rb3 rb3) {
        int n3;
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        rb3 = (mp0$a)rb3;
        Object object = ((mp0$a)rb3).e;
        this.e = object;
        this.f = object = ((mp0$a)rb3).f;
        this.g = n3 = ((mp0$a)rb3).g;
    }

    public final Rb3 b() {
        mp0$a mp0$a = new mp0$a();
        return mp0$a;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean c(np0_0 object, v83_0 v83_02) {
        int n3;
        boolean bl2;
        int n4;
        void var2_3;
        int n7;
        block7: {
            block6: {
                Object object2 = A83.c;
                // MONITORENTER : object2
                n7 = this.c;
                n4 = var2_3.d();
                bl2 = true;
                if (n7 != n4 || (n7 = this.d) != (n4 = var2_3.h())) break block6;
                n7 = 0;
                break block7;
            }
            n7 = 1;
        }
        // MONITOREXIT : object2
        Object object3 = this.f;
        Object object4 = h;
        if (object3 == object4 || n7 != 0 && (n4 = this.g) != (n3 = this.d((np0_0)object, (v83_0)var2_3))) {
            bl2 = false;
        }
        if (!bl2) return bl2;
        if (n7 == 0) return bl2;
        // MONITORENTER : object2
        this.c = n3 = var2_3.d();
        this.d = n3 = var2_3.h();
        object = Unit.a;
        // MONITOREXIT : object2
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public final int d(np0_0 var1_1, v83_0 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 19[TRYBLOCK] [19 : 556->559)] java.lang.Throwable
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

