/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONArray
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;

/*
 * Renamed from Bc3
 */
public final class bc3_1 {
    public static final bc3_1 a;
    public static boolean b;
    public static final HashMap c;
    public static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        c = hashMap = new HashMap();
        d = hashMap = new HashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void c(Bundle var0) {
        block19: {
            block18: {
                block16: {
                    block20: {
                        block21: {
                            block17: {
                                var1_2 = bc3_1.a;
                                var2_3 = bc3_1.class;
                                var3_4 = td0.b(var2_3);
                                if (var3_4) {
                                    return;
                                }
                                try {
                                    var3_4 = bc3_1.b;
                                    if (var3_4 == false) return;
                                    if (var0 == null) {
                                        return;
                                    }
                                    var4_5 = new ArrayList();
                                    var5_6 = var0.keySet();
                                    var5_6 = var5_6.iterator();
lbl14:
                                    // 4 sources

                                    while (var6_7 = var5_6.hasNext()) {
                                        var7_8 /* !! */  = var5_6.next();
                                        var7_8 /* !! */  = (String)var7_8 /* !! */ ;
                                        var8_9 = var0.get(var7_8 /* !! */ );
                                        var8_9 = String.valueOf(var8_9);
                                        var9_10 = bc3_1.c;
                                        var10_12 /* !! */  = var9_10.get(var7_8 /* !! */ );
                                        var11_13 = false;
                                        if (var10_12 /* !! */  != null) {
                                            var12_14 = true;
                                        } else {
                                            var12_14 = false;
                                            var10_12 /* !! */  = null;
                                        }
                                        var13_15 = bc3_1.d;
                                        var14_16 = var13_15.get(var7_8 /* !! */ );
                                        if (var14_16 != null) {
                                            var15_17 = true;
                                        } else {
                                            var15_17 = false;
                                            var14_16 = null;
                                        }
                                        if (!var12_14 && !var15_17) continue;
                                        var9_10 = var9_10.get(var7_8 /* !! */ );
                                        var9_10 = (Set)var9_10;
                                        var1_2.getClass();
                                        var12_14 = td0.b(var1_2);
                                        if (var12_14 || var9_10 == null) break block16;
                                        break block17;
                                    }
                                    break block18;
                                }
                                catch (Throwable var0_1) {
                                    break block19;
                                }
                            }
                            try {
                                var9_10 = (Iterable)var9_10;
                            }
                            catch (Throwable var9_11) {
                                break block20;
                            }
                            var12_14 = var9_10 instanceof Collection;
                            if (!var12_14) break block21;
                            var10_12 /* !! */  = var9_10;
                            var10_12 /* !! */  = (Collection)var9_10;
                            var12_14 = var10_12 /* !! */ .isEmpty();
                            if (var12_14) break block16;
                        }
                        var9_10 = ((Iterable)var9_10).iterator();
                        while (var12_14 = var9_10.hasNext()) {
                            var10_12 /* !! */  = var9_10.next();
                            var14_16 = new Regex((String)(var10_12 /* !! */  = (String)var10_12 /* !! */ ));
                            var12_14 = var14_16.c((CharSequence)var8_9);
                            if (!var12_14) continue;
                            var11_13 = true;
                            break block16;
                        }
                        break block16;
                    }
                    td0.a(var1_2, var9_11);
                }
                var9_10 = var13_15.get(var7_8 /* !! */ );
                var9_10 = (Set)var9_10;
                var16_18 = var1_2.b((String)var8_9, (Set)var9_10);
                if (var11_13 || var16_18) ** GOTO lbl14
                var8_9 = "key";
                Intrinsics.checkNotNullExpressionValue(var7_8 /* !! */ , (String)var8_9);
                var4_5.add(var7_8 /* !! */ );
                ** GOTO lbl14
            }
            var1_2 = var4_5.iterator();
            while ((var3_4 = var1_2.hasNext()) != false) {
                var4_5 = var1_2.next();
                var4_5 = (String)var4_5;
                var0.remove((String)var4_5);
            }
            return;
        }
        td0.a(var2_3, var0_1);
    }

    /*
     * Exception decompiling
     */
    public final void a(JSONArray var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 15[TRYBLOCK] [25 : 223->226)] java.lang.Throwable
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
    public final boolean b(String string2, Set object) {
        Throwable throwable2;
        boolean bl2;
        block7: {
            Object object2;
            Object object3;
            String string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
            boolean bl3 = td0.b(this);
            bl2 = false;
            if (bl3) {
                return false;
            }
            if (object == null) return bl2;
            try {
                object = (Iterable)object;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            bl3 = object instanceof Collection;
            if (bl3) {
                object3 = object;
                object3 = (Collection)object;
                bl3 = object3.isEmpty();
                if (bl3) {
                    return bl2;
                }
            }
            object = ((Iterable)object).iterator();
            do {
                if (!(bl3 = object.hasNext())) return bl2;
                object3 = object.next();
                object3 = (String)object3;
                object2 = Locale.ROOT;
                object3 = ((String)object3).toLowerCase((Locale)object2);
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                object2 = string2.toLowerCase((Locale)object2);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
            } while (!(bl3 = Intrinsics.areEqual(object3, object2)));
            return true;
        }
        td0.a(this, throwable2);
        return bl2;
    }
}

