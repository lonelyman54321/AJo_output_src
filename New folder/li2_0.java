/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/*
 * Renamed from LI2
 */
public final class li2_0 {
    public static final li2_0 a;
    public static Boolean b;

    static {
        li2_0 li2_02;
        a = li2_02 = new li2_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent a(Context context) {
        Throwable throwable2;
        block6: {
            block5: {
                boolean bl2;
                PackageManager packageManager;
                String string2 = "com.facebook.wakizashi";
                String string3 = "com.facebook.katana";
                String string4 = "ReceiverService";
                boolean bl3 = td0.b(this);
                if (bl3) {
                    return null;
                }
                try {
                    boolean bl4;
                    packageManager = context.getPackageManager();
                    if (packageManager == null) break block5;
                    Intent intent = new Intent(string4);
                    intent.setPackage(string3);
                    ResolveInfo resolveInfo = packageManager.resolveService(intent, 0);
                    if (resolveInfo != null && (bl4 = bi0_1.a(context, string3))) {
                        return intent;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                string3 = new Intent(string4);
                string3.setPackage(string2);
                string4 = packageManager.resolveService((Intent)string3, 0);
                if (string4 != null && (bl2 = bi0_1.a(context, string2))) {
                    return string3;
                }
            }
            return null;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Exception decompiling
     */
    public final LI2$c b(LI2$a var1_1, String var2_4, List var3_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [36, 35, 34 : 152->155)] java.lang.Throwable
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

