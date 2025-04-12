/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.Intrinsics;

public final class G13$e
extends qI0$a {
    public final /* synthetic */ g13_0 b;

    public G13$e(g13_0 object) {
        this.b = object;
        object = G13$d.NATIVE;
    }

    /*
     * Exception decompiling
     */
    public final boolean a(ShareContent var1_1, boolean var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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

    public final pm_0 b(ShareContent shareContent) {
        Intrinsics.checkNotNullParameter(shareContent, "content");
        g13_0 g13_02 = this.b;
        Object object = g13_02.b();
        Object object2 = G13$d.NATIVE;
        g13_0.e(g13_02, object, shareContent, object2);
        object = f13_0.b;
        f13_0.b(shareContent, (F13$c)object);
        object = g13_02.a();
        boolean bl2 = g13_02.f();
        object2 = G13$b.a(shareContent.getClass());
        if (object2 == null) {
            object = null;
        } else {
            G13$e$a g13$e$a = new G13$e$a((pm_0)object, shareContent, bl2);
            hq0_0.c((pm_0)object, g13$e$a, (Up0)object2);
        }
        return object;
    }
}

