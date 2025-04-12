/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vZ2
 */
public final class vz2_0 {
    public static final void a(List object, Object object2, Wq3 object3, Wq3 object4, int n3, int n4) {
        block9: {
            String string2;
            block7: {
                Object object5;
                block8: {
                    block6: {
                        string2 = "<this>";
                        Intrinsics.checkNotNullParameter(object, string2);
                        int n7 = 0;
                        object5 = null;
                        object3 = object3 != null ? (Object)((Wq3)object3).a : null;
                        if (object4 != null) {
                            object5 = ((Wq3)object4).a;
                        }
                        if (object3 == null || object5 == null) break block6;
                        object3 = rp_1.r((int[])object3, object5);
                        Intrinsics.checkNotNullParameter(object3, string2);
                        Intrinsics.checkNotNullParameter(object3, string2);
                        n7 = eh1_2.c(((Object)object3).length);
                        object4 = new LinkedHashSet(n7);
                        Intrinsics.checkNotNullParameter(object3, string2);
                        object5 = "destination";
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        for (Object object6 : object3) {
                            Integer n8 = (int)object6;
                            object4.add(n8);
                        }
                        object3 = CollectionsKt.j0(CollectionsKt.d0(CollectionsKt.k0((Iterable)object4)));
                        break block7;
                    }
                    if (object3 != null || object5 == null) break block8;
                    object3 = object5;
                    break block7;
                }
                if (object3 == null || object5 != null) break block9;
            }
            Intrinsics.checkNotNullParameter(object, string2);
            object4 = "originalPageOffsets";
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            if (object2 != null) {
                string2 = "separator";
                Intrinsics.checkNotNullParameter(object2, string2);
                Intrinsics.checkNotNullParameter(object3, object4);
                object2 = a.b(object2);
                List list = a.b(n4);
                object4 = new Wq3((int[])object3, (List)object2, n3, list);
                object.add(object4);
            }
            return;
        }
        object = new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        throw object;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object b(Wq3 var0, tZ2 var1_1, f80_0 var2_2) {
        block10: {
            block11: {
                var3_3 = var2_2 instanceof uZ2;
                if (!var3_3) ** GOTO lbl-1000
                var4_4 = var2_2;
                var4_4 = (uZ2)var2_2;
                var5_5 = var4_4.i;
                var6_6 = -1 << -1;
                var7_7 = var5_5 & var6_6;
                if (var7_7 != 0) {
                    var4_4.i = var5_5 -= var6_6;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = new h80_0((f80_0)var2_2);
                }
                var2_2 = var4_4.h;
                var8_8 = j90_0.COROUTINE_SUSPENDED;
                var6_6 = var4_4.i;
                var7_7 = 1;
                var9_9 = "null cannot be cast to non-null type androidx.paging.TransformablePage<R of androidx.paging.SeparatorsKt.insertInternalSeparators>";
                if (var6_6 == 0) break block10;
                if (var6_6 != var7_7) break block11;
                var10_10 = var4_4.g;
                var11_11 = var4_4.f;
                var12_12 = var4_4.e;
                var13_13 = var4_4.d;
                var14_14 = var4_4.c;
                var15_15 = var4_4.b;
                var16_16 = var4_4.a;
                vl2_2.b(var2_2);
                var17_17 = var13_13;
                var13_13 = var4_4;
                var4_4 = var15_15;
                var15_15 = var14_14;
                var14_14 = var17_17;
                ** GOTO lbl93
            }
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
        }
        vl2_2.b(var2_2);
        var2_2 = var0.b;
        var18_18 = var2_2.isEmpty();
        if (var18_18 != 0) {
            Intrinsics.checkNotNull(var0, var9_9);
            return var0;
        }
        var2_2 = var0.b;
        var6_6 = var2_2.size() + 4;
        var13_13 = new ArrayList(var6_6);
        var14_14 = new ArrayList(var6_6);
        var12_12 = CollectionsKt.L((List)var2_2);
        var13_13.add(var12_12);
        var12_12 = var0.d;
        if (var12_12 != null) {
            var12_12 = (Number)CollectionsKt.L((List)var12_12);
            var6_6 = var12_12.intValue();
        } else {
            var6_6 = 0;
            var12_12 = null;
        }
        var15_15 = new ArrayList<Object>(var6_6);
        var14_14.add(var15_15);
        var18_18 = var2_2.size();
        var12_12 = var4_4;
        var4_4 = var1_1;
        var1_1 = var0;
        var10_10 = var18_18;
        var18_18 = 1;
        var17_17 = var14_14;
        var14_14 = var13_13;
        var13_13 = var17_17;
        while (var18_18 < var10_10) {
            var15_15 = var1_1.b.get(var18_18);
            var19_19 = var18_18 + -1;
            var20_20 = var1_1.b;
            var16_16 = var20_20.get(var19_19);
            var12_12.a = var1_1;
            var12_12.b = var4_4;
            var12_12.c = var14_14;
            var12_12.d = var13_13;
            var12_12.e = var15_15;
            var12_12.f = var18_18;
            var12_12.g = var10_10;
            var12_12.i = var7_7;
            if ((var16_16 = var4_4.invoke(var16_16, var15_15, var12_12)) == var8_8) {
                return var8_8;
            }
            var17_17 = var16_16;
            var16_16 = var1_1;
            var11_11 = var18_18;
            var2_2 = var17_17;
            var21_21 = var13_13;
            var13_13 = var12_12;
            var12_12 = var15_15;
            var15_15 = var14_14;
            var14_14 = var21_21;
lbl93:
            // 2 sources

            if (var2_2 != null) {
                var15_15.add(var2_2);
                var2_2 = new Integer(var11_11);
                var14_14.add(var2_2);
            }
            var15_15.add(var12_12);
            var2_2 = new Integer(var11_11);
            var14_14.add(var2_2);
            var18_18 = var11_11 + 1;
            var12_12 = var13_13;
            var13_13 = var14_14;
            var14_14 = var15_15;
            var1_1 = var16_16;
        }
        var10_10 = var14_14.size();
        if (var10_10 == (var18_18 = (var2_2 = var1_1.b).size())) {
            Intrinsics.checkNotNull(var1_1, var9_9);
        } else {
            var2_2 = var1_1.a;
            var11_11 = var1_1.c;
            var1_1 = var0 = new Wq3((int[])var2_2, (List)var14_14, var11_11, (List)var13_13);
        }
        return var1_1;
    }
}

