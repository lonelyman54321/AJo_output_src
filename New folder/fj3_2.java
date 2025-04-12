/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FJ3
 */
public final class fj3_2
extends hm0_2 {
    public static final hn2_2 e = hn2$a.a("/", false);
    public final hn2_2 b;
    public final hm0_2 c;
    public final Map d;

    public fj3_2(hn2_2 hn2_22, hm0_2 hm0_22, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(hn2_22, "zipPath");
        Intrinsics.checkNotNullParameter(hm0_22, "fileSystem");
        Intrinsics.checkNotNullParameter(linkedHashMap, "entries");
        this.b = hn2_22;
        this.c = hm0_22;
        this.d = linkedHashMap;
    }

    public final y63_0 a(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "file");
        object = new IOException("zip file systems are read-only");
        throw object;
    }

    public final void b(hn2_2 object, hn2_2 hn2_22) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(hn2_22, "target");
        object = new IOException("zip file systems are read-only");
        throw object;
    }

    public final void c(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "dir");
        object = new IOException("zip file systems are read-only");
        throw object;
    }

    public final void d(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "path");
        object = new IOException("zip file systems are read-only");
        throw object;
    }

    public final List g(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "dir");
        Object object2 = e;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "child");
        boolean bl2 = true;
        object2 = i_0.b((hn2_2)object2, (hn2_2)object, bl2);
        Object object3 = this.d;
        object2 = (ej3_2)object3.get(object2);
        if (object2 != null) {
            object = CollectionsKt.k0(((ej3_2)object2).h);
            Intrinsics.checkNotNull(object);
            return object;
        }
        object3 = new StringBuilder("not a directory: ");
        ((StringBuilder)object3).append(object);
        object = ((StringBuilder)object3).toString();
        object2 = new IOException((String)object);
        throw object2;
    }

    /*
     * Exception decompiling
     */
    public final hl0_1 i(hn2_2 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [11 : 276->278)] java.lang.Throwable
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

    public final ul0_1 j(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "file");
        object = new UnsupportedOperationException("not implemented yet!");
        throw object;
    }

    public final y63_0 k(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "file");
        object = new IOException("zip file systems are read-only");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a93_0 l(hn2_2 object) {
        int n3;
        a93_0 a93_02;
        Object object4;
        boolean bl2;
        Object object2;
        Object object3;
        block9: {
            Intrinsics.checkNotNullParameter(object, "file");
            object3 = e;
            object3.getClass();
            object2 = "child";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            bl2 = true;
            object3 = i_0.b((hn2_2)object3, (hn2_2)object, bl2);
            object4 = this.d;
            object3 = (ej3_2)object4.get(object3);
            if (object3 == null) {
                object2 = new StringBuilder("no such file: ");
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                object3 = new FileNotFoundException((String)object);
                throw object3;
            }
            object = this.c;
            object4 = this.b;
            object = ((hm0_2)object).j((hn2_2)object4);
            object4 = null;
            try {
                long l2 = ((ej3_2)object3).g;
                a93_02 = ((ul0_1)object).h(l2);
                a93_02 = o72_0.b(a93_02);
            }
            catch (Throwable throwable) {
                if (object != null) {
                    try {
                        ((ul0_1)object).close();
                    }
                    catch (Throwable throwable2) {
                        yc0_2.a(throwable, throwable2);
                    }
                }
                object = throwable;
                a93_02 = null;
                break block9;
            }
            try {
                ((ul0_1)object).close();
                n3 = 0;
                object = null;
            }
            catch (Throwable throwable) {}
        }
        if (object != null) throw object;
        Intrinsics.checkNotNull(a93_02);
        object = "<this>";
        Intrinsics.checkNotNullParameter(a93_02, (String)object);
        jj3_2.e((ie2_2)a93_02, null);
        n3 = ((ej3_2)object3).e;
        long l3 = ((ej3_2)object3).d;
        if (n3 == 0) {
            return new ro0_2(a93_02, l3, bl2);
        }
        long l4 = ((ej3_2)object3).c;
        object4 = new ro0_2(a93_02, l4, bl2);
        object3 = new Inflater(bl2);
        Intrinsics.checkNotNullParameter(object4, "source");
        Intrinsics.checkNotNullParameter(object3, "inflater");
        object2 = o72_0.b((a93_0)object4);
        object = new oh1_2((ie2_2)object2, (Inflater)object3);
        bl2 = false;
        object2 = null;
        object3 = new ro0_2((a93_0)object, l3, false);
        return object3;
    }
}

