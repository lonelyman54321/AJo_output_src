/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONArray
 */
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/*
 * Renamed from oZ2
 */
public final class oz2_0 {
    public static final oz2_0 a;
    public static boolean b;
    public static HashSet c;
    public static HashMap d;

    static {
        Cloneable cloneable = new Cloneable();
        a = cloneable;
        c = cloneable = new Cloneable();
        cloneable = new Cloneable();
        d = cloneable;
    }

    /*
     * Exception decompiling
     */
    public static final void b(Bundle var0, String var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [6 : 74->77)] java.lang.Throwable
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
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        block10: {
            block7: {
                var1_1 = "value";
                var2_3 = "key";
                var3_4 = td0.b(this);
                if (var3_4) {
                    return;
                }
                var4_5 = FacebookSdk.b();
                var5_6 = 0;
                var4_5 = dl0_2.k((String)var4_5, false);
                if (var4_5 == null) {
                    return;
                }
                try {
                    block8: {
                        block9: {
                            oz2_0.c = var6_7 /* !! */  = new HashSet<E>();
                            var6_7 /* !! */  = new HashSet<E>();
                            oz2_0.d = var6_7 /* !! */ ;
                            var4_5 = var4_5.u;
                            if (var4_5 == null || (var7_8 = var4_5.length()) == 0) break block7;
                            var7_8 = var4_5.length();
lbl19:
                            // 2 sources

                            while (var5_6 < var7_8) {
                                var8_9 /* !! */  = var4_5.getJSONObject(var5_6);
                                var9_10 = var8_9 /* !! */ .has(var2_3);
                                var10_11 = var8_9 /* !! */ .has(var1_1);
                                if (!var9_10 || !var10_11) break block8;
                                var11_12 = var8_9 /* !! */ .getString(var2_3);
                                if ((var8_9 /* !! */  = var8_9 /* !! */ .getJSONArray(var1_1)) == null || (var8_9 /* !! */  = lz3_0.g((JSONArray)var8_9 /* !! */ )) == null) break block8;
                                var12_13 = "_MTSDK_Default_";
                                var10_11 = var11_12.equals(var12_13);
                                if (!var10_11) break block9;
                                oz2_0.c = var8_9 /* !! */ ;
                                break block8;
                            }
                            break block7;
                            catch (Throwable var1_2) {
                                break block10;
                            }
                        }
                        var12_13 = oz2_0.d;
                        var13_14 = "sensitiveParamsScope";
                        Intrinsics.checkNotNullExpressionValue(var11_12, var13_14);
                        var12_13.put(var11_12, var8_9 /* !! */ );
                    }
                    ++var5_6;
                    ** GOTO lbl19
                }
                catch (Exception v0) {}
            }
            return;
        }
        td0.a(this, var1_2);
    }
}

