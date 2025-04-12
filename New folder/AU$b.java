/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class AU$b
implements IJ2$a {
    public final cl2_2 a;
    public final HttpTransaction b;
    public final /* synthetic */ au_0 c;

    public AU$b(au_0 au_02, cl2_2 cl2_22, HttpTransaction httpTransaction) {
        Intrinsics.checkNotNullParameter(au_02, "this$0");
        Intrinsics.checkNotNullParameter(cl2_22, "response");
        Intrinsics.checkNotNullParameter(httpTransaction, "transaction");
        this.c = au_02;
        this.a = cl2_22;
        this.b = httpTransaction;
    }

    public final void a(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "exception");
    }

    /*
     * Exception decompiling
     */
    public final void b(File var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 114->117)] java.io.IOException
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

