/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class LF2
extends qg3_2
implements gx0_2 {
    public List a;
    public List b;
    public List c;
    public pr1_1 d;
    public pr1_1 e;
    public pr1_1 f;
    public Set g;
    public pr1_1 h;
    public int i;
    public /* synthetic */ yp1_2 j;
    public final /* synthetic */ FF2 k;

    public LF2(FF2 fF2, f80_0 f80_02) {
        this.k = fF2;
        super(3, f80_02);
    }

    /*
     * Exception decompiling
     */
    public static final void c(FF2 var0, List var1_1, List var2_2, List var3_3, pr1_1 var4_4, pr1_1 var5_5, pr1_1 var6_6, pr1_1 var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [7 : 102->113)] java.lang.Throwable
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
    public static final void f(List object, FF2 fF2) {
        object.clear();
        Object object2 = fF2.b;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    ArrayList arrayList = fF2.j;
                    int n3 = arrayList.size();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Object object3 = arrayList.get(i3);
                        object3 = (vQ1)object3;
                        Object object4 = object;
                        object4 = (Collection)object;
                        object4.add(object3);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = fF2.j;
                ((ArrayList)object).clear();
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (i90_0)object;
        object2 = (yp1_2)object2;
        object3 = (f80_0)object3;
        FF2 fF2 = this.k;
        object = new LF2(fF2, (f80_0)object3);
        ((LF2)object).j = object2;
        object2 = Unit.a;
        return ((LF2)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block5: {
            block6: {
                block7: {
                    var2_2 = this;
                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var4_4 = this.i;
                    var5_5 = 2;
                    var6_6 = 1;
                    if (var4_4 == 0) break block5;
                    if (var4_4 == var6_6) break block6;
                    if (var4_4 != var5_5) break block7;
                    var7_7 = this.h;
                    var8_8 /* !! */  = this.g;
                    var9_9 = this.f;
                    var10_10 = this.e;
                    var11_11 /* !! */  = this.d;
                    var12_12 = this.c;
                    var13_13 /* !! */  = this.b;
                    var14_14 /* !! */  = this.a;
                    var15_15 = this.j;
                    vl2_2.b(var1_1);
                    var16_16 = var11_11 /* !! */ ;
                    var17_17 = var14_14 /* !! */ ;
                    var11_11 /* !! */  = var3_3 /* !! */ ;
                    var14_14 /* !! */  = var8_8 /* !! */ ;
                    var18_18 = 2;
                    var19_19 = var15_15;
                    var15_15 = var7_7;
                    var7_7 = var19_19;
                    var20_20 = var13_13 /* !! */ ;
                    var13_13 /* !! */  = var9_9;
                    var9_9 = var20_20;
                    var21_21 = var12_12;
                    var12_12 = var10_10;
                    var10_10 = var21_21;
                    ** GOTO lbl153
                }
                var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var3_3 /* !! */ ;
            }
            var7_7 = this.h;
            var8_8 /* !! */  = this.g;
            var9_9 = this.f;
            var10_10 = this.e;
            var11_11 /* !! */  = this.d;
            var12_12 = this.c;
            var13_13 /* !! */  = this.b;
            var14_14 /* !! */  = this.a;
            var15_15 = this.j;
            vl2_2.b(var1_1);
            var22_22 /* !! */  = var8_8 /* !! */ ;
            var23_23 = var9_9;
            var24_24 /* !! */  = var11_11 /* !! */ ;
            var25_25 = var12_12;
            var26_26 = var13_13 /* !! */ ;
            var17_17 = var14_14 /* !! */ ;
            var14_14 /* !! */  = var7_7;
            var7_7 = var15_15;
            var15_15 = var10_10;
            ** GOTO lbl102
        }
        vl2_2.b(var1_1);
        var7_7 = this.j;
        var8_8 /* !! */  = new ArrayList<E>();
        var9_9 = new ArrayList();
        var10_10 = new ArrayList();
        var11_11 /* !! */  = gt2_1.a();
        var12_12 = gt2_1.a();
        var13_13 /* !! */  = new pr1_1(null);
        var14_14 /* !! */  = new ArrayList<E>((ft2_0)var13_13 /* !! */ );
        var15_15 = gt2_1.a();
        block1: while (true) {
            var23_23 = var2_2.k.b;
            ** synchronized (var23_23)
lbl72:
            // 1 sources

            var23_23 = var2_2.k;
            var2_2.j = var7_7;
            var24_24 /* !! */  = var8_8 /* !! */ ;
            var24_24 /* !! */  = var8_8 /* !! */ ;
            var2_2.a = var24_24 /* !! */ ;
            var24_24 /* !! */  = var9_9;
            var24_24 /* !! */  = (List)var9_9;
            var2_2.b = var24_24 /* !! */ ;
            var24_24 /* !! */  = var10_10;
            var24_24 /* !! */  = (List)var10_10;
            var2_2.c = var24_24 /* !! */ ;
            var2_2.d = var11_11 /* !! */ ;
            var2_2.e = var12_12;
            var2_2.f = var13_13 /* !! */ ;
            var24_24 /* !! */  = var14_14 /* !! */ ;
            var24_24 /* !! */  = (Set)var14_14 /* !! */ ;
            var2_2.g = var24_24 /* !! */ ;
            var2_2.h = var15_15;
            var2_2.i = var6_6;
            var23_23 = FF2.s((FF2)var23_23, var2_2);
            if (var23_23 == var3_3 /* !! */ ) {
                return var3_3 /* !! */ ;
            }
            var17_17 = var8_8 /* !! */ ;
            var26_26 = var9_9;
            var25_25 = var10_10;
            var24_24 /* !! */  = var11_11 /* !! */ ;
            var23_23 = var13_13 /* !! */ ;
            var22_22 /* !! */  = var14_14 /* !! */ ;
            var14_14 /* !! */  = var15_15;
            var15_15 = var12_12;
lbl102:
            // 2 sources

            var8_8 /* !! */  = var2_2.k;
            var18_18 = (int)FF2.w((FF2)var8_8 /* !! */ );
            if (var18_18 == 0) break;
            var9_9 = var2_2.k;
            var8_8 /* !! */  = var13_13 /* !! */ ;
            var10_10 = var23_23;
            var11_11 /* !! */  = var14_14 /* !! */ ;
            var12_12 = var17_17;
            var16_16 = var13_13 /* !! */ ;
            var13_13 /* !! */  = var26_26;
            var27_27 = var14_14 /* !! */ ;
            var14_14 /* !! */  = var24_24 /* !! */ ;
            var1_1 = var15_15;
            var15_15 = var25_25;
            var28_28 /* !! */  = var3_3 /* !! */ ;
            var3_3 /* !! */  = var23_23;
            var23_23 = var1_1;
            var29_29 = var8_8 /* !! */ ;
            var16_16 = var24_24 /* !! */ ;
            var24_24 /* !! */  = var22_22 /* !! */ ;
            var8_8 /* !! */  = new ArrayList<E>((FF2)var9_9, (pr1_1)var10_10, var11_11 /* !! */ , (List)var17_17, (List)var26_26, var14_14 /* !! */ , (List)var25_25, (pr1_1)var1_1, var22_22 /* !! */ );
            var2_2.j = var7_7;
            var8_8 /* !! */  = var17_17;
            var8_8 /* !! */  = (List)var17_17;
            var2_2.a = var8_8 /* !! */ ;
            var8_8 /* !! */  = var26_26;
            var8_8 /* !! */  = (List)var26_26;
            var2_2.b = var8_8 /* !! */ ;
            var8_8 /* !! */  = var25_25;
            var8_8 /* !! */  = (List)var25_25;
            var2_2.c = var8_8 /* !! */ ;
            var2_2.d = var14_14 /* !! */ ;
            var10_10 = var1_1;
            var2_2.e = var1_1;
            var2_2.f = var3_3 /* !! */ ;
            var8_8 /* !! */  = var22_22 /* !! */ ;
            var8_8 /* !! */  = (Set)var22_22 /* !! */ ;
            var2_2.g = var8_8 /* !! */ ;
            var2_2.h = var11_11 /* !! */ ;
            var2_2.i = var18_18 = 2;
            var9_9 = var29_29;
            var9_9 = var7_7.R((Function1)var29_29, var2_2);
            var11_11 /* !! */  = var28_28 /* !! */ ;
            if (var9_9 == var28_28 /* !! */ ) {
                return var28_28 /* !! */ ;
            }
            var13_13 /* !! */  = var3_3 /* !! */ ;
            var15_15 = var27_27;
            var12_12 = var1_1;
            var9_9 = var26_26;
            var10_10 = var25_25;
            var14_14 /* !! */  = var22_22 /* !! */ ;
lbl153:
            // 2 sources

            FF2.t(var2_2.k);
            var3_3 /* !! */  = var11_11 /* !! */ ;
            var8_8 /* !! */  = var17_17;
lbl156:
            // 2 sources

            while (true) {
                var5_5 = 2;
                var11_11 /* !! */  = var16_16;
                var6_6 = 1;
                continue block1;
                break;
            }
            break;
        }
        var11_11 /* !! */  = var3_3 /* !! */ ;
        var27_27 = var14_14 /* !! */ ;
        var10_10 = var15_15;
        var3_3 /* !! */  = var23_23;
        var16_16 = var24_24 /* !! */ ;
        var18_18 = 2;
        var13_13 /* !! */  = var23_23;
        var15_15 = var14_14 /* !! */ ;
        var12_12 = var10_10;
        var3_3 /* !! */  = var11_11 /* !! */ ;
        var8_8 /* !! */  = var17_17;
        var9_9 = var26_26;
        var10_10 = var25_25;
        var14_14 /* !! */  = var22_22 /* !! */ ;
        ** while (true)
    }
}

