/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gz
 */
public final class gz_0
implements al1_1 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ float b;

    public gz_0(u10 u102, float f5) {
        this.a = u102;
        this.b = f5;
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    /*
     * Unable to fully structure code
     */
    public final bl1_0 c(dl1_1 var1_1, List var2_2, long var3_3) {
        var5_4 = this;
        var6_5 = var1_1;
        var7_6 = var2_2;
        var8_7 = var3_3;
        var10_8 = var2_2.size();
        var11_9 = 0;
        var12_10 = 0.0f;
        while (true) {
            var13_11 = "Collection contains no element matching the predicate.";
            if (var11_9 >= var10_8) break;
            var14_12 = (xk1_0)var7_6.get(var11_9);
            var15_13 = androidx.compose.ui.layout.a.a((xk1_0)var14_12);
            var17_15 = Intrinsics.areEqual(var15_13, var16_14 = "icon");
            if (var17_15) {
                var18_16 = var14_12.Q(var8_7);
                var19_17 = var5_4.a;
                if (var19_17 != null) {
                    var10_8 = var2_2.size();
                    var12_10 = 0.0f;
                    for (var11_9 = 0; var11_9 < var10_8; ++var11_9) {
                        var14_12 = var7_6.get(var11_9);
                        var20_18 = var14_12;
                        var20_18 = var14_12;
                        var21_19 = Intrinsics.areEqual(var14_12 = androidx.compose.ui.layout.a.a((xk1_0)var20_18), var15_13 = "label");
                        if (var21_19 == 0) continue;
                        var21_19 = 0;
                        var22_20 = 0.0f;
                        var14_12 = null;
                        var17_15 = false;
                        var15_13 = null;
                        var11_9 = 0;
                        var12_10 = 0.0f;
                        var23_21 = 0;
                        var24_22 = 0.0f;
                        var13_11 = null;
                        var25_23 = 11;
                        var26_24 = var3_3;
                        var26_24 = c60.b(var3_3, 0, 0, 0, 0, var25_23);
                        var7_6 = var20_18.Q(var26_24);
lbl40:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var6_5 = new NoSuchElementException((String)var13_11);
                    throw var6_5;
                }
                var29_25 = 0;
                var30_26 = 0.0f;
                var7_6 = null;
                ** continue;
                var28_27 = var7_6;
                if (var19_17 == null) {
                    var30_26 = Mz.b;
                    var29_25 = f60.g(var6_5.e0(var30_26), var8_7);
                    var10_8 = var18_16.b;
                    var10_8 = (var29_25 - var10_8) / 2;
                    var11_9 = var18_16.a;
                    var13_11 = new kz_0(var18_16, var10_8);
                    var6_5 = cl1_0.a((dl1_1)var6_5, var11_9, var29_25, (Function1)var13_11);
                } else {
                    Intrinsics.checkNotNull(var7_6);
                    var7_6 = Pc.a;
                    var29_25 = var28_27.U((Oc)var7_6);
                    var31_28 = Mz.d;
                    var10_8 = var6_5.e0(var31_28) - var29_25;
                    var29_25 = var18_16.b;
                    var11_9 = var28_27.b;
                    var29_25 = var29_25 + var11_9 + var10_8;
                    var12_10 = Mz.b;
                    var11_9 = var6_5.e0(var12_10);
                    var11_9 = f60.g(Math.max(var29_25, var11_9), var8_7);
                    var29_25 = (var11_9 - var29_25) / 2;
                    var32_29 = var29_25 < 0 ? 0 : var29_25;
                    var29_25 = var18_16.b;
                    var23_21 = (var11_9 - var29_25) / 2;
                    var33_30 = var32_29 + var29_25 + var10_8;
                    var29_25 = var28_27.a;
                    var10_8 = var18_16.a;
                    var29_25 = Math.max(var29_25, var10_8);
                    var10_8 = var28_27.a;
                    var10_8 = (var29_25 - var10_8) / 2;
                    var21_19 = var18_16.a;
                    var34_31 = (var29_25 - var21_19) / 2;
                    var24_22 = var23_21 -= var32_29;
                    var21_19 = 1;
                    var22_20 = var21_19;
                    var35_32 = var5_4.b;
                    var22_20 = (var22_20 - var35_32) * var24_22;
                    var36_33 = ok1_1.b(var22_20);
                    var19_17 = var13_11;
                    var14_12 = var18_16;
                    var13_11 = new lz_0(var35_32, (Ns2)var28_27, var10_8, var33_30, var36_33, var18_16, var34_31, var32_29);
                    var6_5 = cl1_0.a((dl1_1)var6_5, var29_25, var11_9, (Function1)var13_11);
                }
                return var6_5;
            }
            ++var11_9;
        }
        var6_5 = new NoSuchElementException((String)var13_11);
        throw var6_5;
    }

    public final /* synthetic */ int h(Rj1 rj1, List list, int n3) {
        return ZK1.d(this, rj1, list, n3);
    }

    public final /* synthetic */ int i(Rj1 rj1, List list, int n3) {
        return ZK1.a(this, rj1, list, n3);
    }

    public final /* synthetic */ int j(Rj1 rj1, List list, int n3) {
        return ZK1.c(this, rj1, list, n3);
    }
}

