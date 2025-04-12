/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.i;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from lg1
 */
public final class lg1_0 {
    public static final lg1_0 a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static String d;
    public static final AtomicBoolean e;

    static {
        Serializable serializable = new Serializable();
        a = serializable;
        b = serializable = new Serializable();
        c = serializable = new Serializable();
        serializable = new Serializable(false);
        e = serializable;
    }

    /*
     * Exception decompiling
     */
    public static final Bundle c(List var0, long var1_1, boolean var3_2, List var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 30[TRYBLOCK] [32 : 333->336)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d() {
        Throwable throwable2;
        Class<lg1_0> clazz;
        block8: {
            int n3;
            Object object;
            Object object2;
            clazz = lg1_0.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return;
            }
            try {
                object2 = e;
                bl2 = ((AtomicBoolean)object2).get();
                if (!bl2) {
                    return;
                }
                object2 = a;
                object2 = ((lg1_0)object2).a();
                object = lg1$a.$EnumSwitchMapping$0;
                int n4 = ((Enum)object2).ordinal();
                n3 = object[n4];
                if (n3 == (n4 = 2)) {
                    object2 = ng1$a.V1;
                    wf1_0.b((ng1$a)((Object)object2));
                    return;
                }
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        return;
                    }
                    object = (Object)kJ0$b.IapLoggingLib5To7;
                    n3 = (int)(kj0_0.b((kJ0$b)((Object)object)) ? 1 : 0);
                    if (n3 == 0) return;
                    object = FacebookSdk.a();
                    ag1_0.b((ng1$a)((Object)object2), (Context)object);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            object = (Object)kJ0$b.IapLoggingLib2;
            n3 = (int)(kj0_0.b((kJ0$b)((Object)object)) ? 1 : 0);
            if (n3 != 0) {
                object = FacebookSdk.a();
                ag1_0.b((ng1$a)((Object)object2), (Context)object);
                return;
            }
            object2 = ng1$a.V2_V4;
            wf1_0.b((ng1$a)((Object)object2));
            return;
        }
        td0.a(clazz, throwable2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ng1$a a() {
        block11: {
            var1_1 /* !! */  = "GPBL.";
            var2_4 = td0.b(this);
            if (var2_4 != 0) {
                return null;
            }
            var3_5 = FacebookSdk.a();
            var4_6 = var3_5.getPackageManager();
            var3_5 = var3_5.getPackageName();
            var5_7 = 128;
            var3_5 = var4_6.getApplicationInfo((String)var3_5, var5_7);
            var4_6 = "context.packageManager.g\u2026TA_DATA\n                )";
            Intrinsics.checkNotNullExpressionValue(var3_5, (String)var4_6);
            var3_5 = var3_5.metaData;
            var4_6 = "com.google.android.play.billingclient.version";
            var3_5 = var3_5.getString((String)var4_6);
            if (var3_5 == null) {
                return ng1$a.NONE;
            }
            var4_6 = ".";
            var4_6 = new String[]{var4_6};
            var5_7 = 2;
            var6_8 = 3;
            var4_6 = StringsKt.a0((CharSequence)var3_5, (String[])var4_6, false, var6_8, var5_7);
            var5_7 = var3_5.length();
            if (var5_7 == 0) {
                return ng1$a.V5_V7;
            }
            var1_1 /* !! */  = var1_1 /* !! */ .concat((String)var3_5);
            var3_5 = lg1_0.class;
            var5_7 = (int)td0.b(var3_5);
            if (var5_7 != 0) ** GOTO lbl36
            try {
                lg1_0.d = var1_1 /* !! */ ;
                ** GOTO lbl36
            }
            catch (Throwable var1_3) {
                td0.a(var3_5, var1_3);
lbl36:
                // 3 sources

                var1_1 /* !! */  = var4_6.get(0);
                var1_1 /* !! */  = StringsKt.toIntOrNull((String)var1_1 /* !! */ );
                if (var1_1 /* !! */  == null) return ng1$a.V5_V7;
                var7_9 = var1_1 /* !! */ .intValue();
                if (var7_9 == (var2_4 = 1)) {
                    return ng1$a.V1;
                }
                var2_4 = 5;
                if (var7_9 >= var2_4) return ng1$a.V5_V7;
                return ng1$a.V2_V4;
                {
                    catch (Throwable var1_2) {
                        break block11;
                    }
                    catch (Exception v0) {}
                    return ng1$a.V5_V7;
                }
            }
        }
        td0.a(this, var1_2);
        return null;
    }

    /*
     * Exception decompiling
     */
    public final String b(Bundle var1_1, i var2_3, Bundle var3_4, i var4_5, boolean var5_6, boolean var6_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 32->37)] java.lang.Throwable
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

