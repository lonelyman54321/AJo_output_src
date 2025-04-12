/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Ro1
 */
public final class ro1_2
implements oo1_2 {
    public final ml1_2 a;
    public final LinkedHashMap b;

    public ro1_2(ml1_2 linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "format");
        this.a = linkedHashMap;
        this.b = linkedHashMap = new LinkedHashMap();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object c(ro1_2 var0, es0_2 var1_1, KSerializer var2_2, Charset var3_3, gf_2 var4_4, f80_0 var5_5) {
        block13: {
            block10: {
                block11: {
                    block12: {
                        block6: {
                            block7: {
                                block8: {
                                    block9: {
                                        var6_6 = var0;
                                        var7_7 = var3_3;
                                        var8_8 = var4_4;
                                        var9_9 = var5_5;
                                        var0.getClass();
                                        var10_10 = var5_5 instanceof uo1_2;
                                        if (!var10_10) ** GOTO lbl-1000
                                        var11_11 = var5_5;
                                        var11_11 = (uo1_2)var5_5;
                                        var12_12 = var11_11.i;
                                        var13_13 = -1 << -1;
                                        var14_14 = var12_12 & var13_13;
                                        if (var14_14 != 0) {
                                            var11_11.i = var12_12 -= var13_13;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var11_11 = new uo1_2((ro1_2)var6_6, (f80_0)var9_9);
                                        }
                                        var9_9 = var11_11.g;
                                        var15_15 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                        var13_13 = var11_11.i;
                                        var14_14 = 0;
                                        var16_16 = 3;
                                        var17_17 = 2;
                                        var18_18 = 1;
                                        if (var13_13 == 0) break block6;
                                        if (var13_13 == var18_18) break block7;
                                        if (var13_13 == var17_17) break block8;
                                        if (var13_13 != var16_16) break block9;
                                        vl2_2.b(var9_9);
                                        break block10;
                                    }
                                    var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var6_6;
                                }
                                var6_6 = (pl1_2)var11_11.b;
                                var7_7 = (gf_2)var11_11.a;
                                vl2_2.b(var9_9);
                                break block11;
                            }
                            var6_6 = var11_11.f;
                            var7_7 = var11_11.e;
                            var8_8 = var11_11.d;
                            var19_19 /* !! */  = var11_11.c;
                            var20_20 = (es0_2)var11_11.b;
                            var21_21 = (ro1_2)var11_11.a;
                            vl2_2.b(var9_9);
                            break block12;
                        }
                        vl2_2.b(var9_9);
                        var9_9 = var6_6.b;
                        var19_19 /* !! */  = var9_9.get(var7_7);
                        if (var19_19 /* !! */  == null) {
                            var19_19 /* !! */  = new V((Charset)var7_7);
                            var9_9.put(var7_7, var19_19 /* !! */ );
                        }
                        var19_19 /* !! */  = (pl1_2)var19_19 /* !! */ ;
                        var11_11.a = var6_6;
                        var9_9 = var1_1;
                        var11_11.b = var1_1;
                        var21_21 = var2_2;
                        var11_11.c = var2_2;
                        var11_11.d = var7_7;
                        var11_11.e = var8_8;
                        var11_11.f = var19_19 /* !! */ ;
                        var11_11.i = var18_18;
                        var20_20 = kf_1.a;
                        var20_20 = var19_19 /* !! */ .a;
                        var22_22 = ((Object)var20_20).length;
                        if ((var20_20 = kf_1.b((gf_2)var8_8, (byte[])var20_20, 0, var22_22, var11_11)) == var15_15 /* !! */ ) break block13;
                        var20_20 = var1_1;
                        var21_21 = var6_6;
                        var6_6 = var19_19 /* !! */ ;
                        var19_19 /* !! */  = var2_2;
                        var23_23 = var8_8;
                        var8_8 = var7_7;
                        var7_7 = var23_23;
                    }
                    var0 = var9_9;
                    var1_1 = var7_7;
                    var2_2 = var6_6;
                    var3_3 = var21_21;
                    var4_4 = var19_19 /* !! */ ;
                    var5_5 = var8_8;
                    var9_9 = new so1_1((gf_2)var7_7, (pl1_2)var6_6, (ro1_2)var21_21, (KSerializer)var19_19 /* !! */ , (Charset)var8_8);
                    var11_11.a = var7_7;
                    var11_11.b = var6_6;
                    var11_11.c = null;
                    var11_11.d = null;
                    var11_11.e = null;
                    var11_11.f = null;
                    var11_11.i = var17_17;
                    var8_8 = var20_20.collect((fs0_2)var9_9, var11_11);
                    if (var8_8 == var15_15 /* !! */ ) break block13;
                }
                var6_6 = var6_6.b;
                var11_11.a = null;
                var11_11.b = null;
                var11_11.i = var16_16;
                var8_8 = kf_1.a;
                var24_24 = ((Object)var6_6).length;
                var6_6 = kf_1.b((gf_2)var7_7, (byte[])var6_6, 0, var24_24, var11_11);
                if (var6_6 == var15_15 /* !! */ ) break block13;
            }
            var15_15 /* !! */  = Unit.a;
        }
        return var15_15 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public final Object a(Charset var1_1, at3_0 var2_3, uf_1 var3_4, f80_0 var4_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 192->196)] java.lang.Throwable
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

    public final xr_2 b(k70_0 k70_02, Charset charset, at3_0 object, Object object2) {
        Object object3;
        Object object4 = Charsets.UTF_8;
        boolean bl2 = Intrinsics.areEqual(charset, object4);
        if (bl2 && (bl2 = Intrinsics.areEqual(object4 = ((at3_0)object).a, object3 = Reflection.getOrCreateKotlinClass(es0_2.class)))) {
            object = vo1_1.a((at3_0)object);
            KSerializer kSerializer = h03_0.c(this.a.b, (at3_0)object);
            object3 = object4;
            object4 = new to1_2(this, object2, kSerializer, charset, null);
            k70_02 = m70_0.b(k70_02, charset);
            object = new xr_2((to1_2)object4, k70_02);
            return object;
        }
        return null;
    }
}

