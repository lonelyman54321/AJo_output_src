/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Wp3
 */
public final class wp3_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(qz1_2 var0, SelectedOrderItem var1_1, String var2_2, b30_0 var3_3, int var4_4) {
        block8: {
            block9: {
                block10: {
                    block7: {
                        var5_5 = var0;
                        var6_6 = var1_1;
                        var7_7 = var2_2;
                        var8_8 = "viewModel";
                        Intrinsics.checkNotNullParameter(var0, (String)var8_8);
                        var9_9 = 540505560;
                        var10_10 = var3_3;
                        var11_11 = var3_3.g(var9_9);
                        if (var2_2 != null && (var9_9 = var2_2.length()) != 0) break block7;
                        var8_8 = var11_11;
                        break block8;
                    }
                    var8_8 = LP1$a.b;
                    var12_12 = 5 != 0;
                    var13_13 = 7.0E-45f;
                    var14_14 = (float)var12_12;
                    var15_15 = null;
                    var16_16 = 14 != 0;
                    var17_17 = var8_8;
                    var10_10 = j.o(h.i((LP1)var8_8, var14_14, 0.0f, 0.0f, 0.0f, (int)var16_16));
                    var18_18 = Nc$a.k;
                    var19_19 = zp.a;
                    var20_20 = 48;
                    var18_18 = iQ2.a((zp$e)var19_19, (Gx$b)var18_18, var11_11, var20_20);
                    var21_21 = var11_11.P;
                    var22_22 = var11_11.P();
                    var10_10 = a30_0.c(var11_11, (LP1)var10_10);
                    N20.W.getClass();
                    var23_23 = N20$a.b;
                    var17_17 = var11_11.a;
                    var24_24 = var17_17 instanceof mp;
                    if (!var24_24) break block9;
                    var11_11.A();
                    var24_24 = var11_11.O;
                    if (var24_24) {
                        var11_11.C((Function0)var23_23);
                    } else {
                        var11_11.n();
                    }
                    var23_23 = N20$a.e;
                    Ow3.a(var11_11, var18_18, (Function2)var23_23);
                    var18_18 = N20$a.d;
                    Ow3.a(var11_11, var22_22, (Function2)var18_18);
                    var18_18 = N20$a.f;
                    var20_20 = (int)var11_11.O;
                    if (var20_20 != 0 || (var20_20 = (int)Intrinsics.areEqual(var22_22 = var11_11.v(), var23_23 = Integer.valueOf(var21_21))) == 0) {
                        rk_0.a(var21_21, var11_11, var21_21, (N20$a$a)var18_18);
                    }
                    var18_18 = N20$a.c;
                    Ow3.a(var11_11, var10_10, (Function2)var18_18);
                    var0.getClass();
                    var10_10 = Locale.ROOT;
                    var18_18 = "CANCELLED".toLowerCase((Locale)var10_10);
                    var19_19 = "toLowerCase(...)";
                    Intrinsics.checkNotNullExpressionValue(var18_18, (String)var19_19);
                    var22_22 = "";
                    var23_23 = var6_6 != null && (var23_23 = var1_1.getOrderDetailLineItem()) != null && (var23_23 = var23_23.getEntry()) != null ? no_2.b((CartEntry)var23_23) : var22_22;
                    var16_16 = true;
                    var25_25 = b.i((String)var18_18, (String)var23_23, var16_16);
                    var23_23 = null;
                    if (var25_25 != 0) break block10;
                    var18_18 = "CANCELLATION_REQUESTED";
                    var10_10 = var18_18.toLowerCase((Locale)var10_10);
                    Intrinsics.checkNotNullExpressionValue(var10_10, (String)var19_19);
                    if (var6_6 != null && (var18_18 = var1_1.getOrderDetailLineItem()) != null && (var18_18 = var18_18.getEntry()) != null) {
                        var22_22 = no_2.b((CartEntry)var18_18);
                    }
                    if (var12_12 = (boolean)b.i((String)var10_10, (String)var22_22, var16_16)) break block10;
                    var12_12 = qz1_2.I(var1_1);
                    if (var12_12) {
                        var13_13 = -1.2086431E8f;
                        var11_11.K(-857307193);
                        var12_12 = R$drawable.ic_status_exchange_order_detail;
                        var10_10 = km2.a((int)var12_12, var11_11, 0);
                        var11_11.T(false);
lbl75:
                        // 3 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var13_13 = -1.2167403E8f;
                    var11_11.K(-857205978);
                    var12_12 = R$drawable.ic_status_delivered_order_detail;
                    var10_10 = km2.a((int)var12_12, var11_11, 0);
                    var11_11.T(false);
                    ** GOTO lbl75
                }
                var13_13 = -1.1963448E8f;
                var11_11.K(-857460922);
                var12_12 = R$drawable.ic_status_cancelled_order_detail;
                var10_10 = km2.a((int)var12_12, var11_11, 0);
                var11_11.T(false);
                ** while (true)
                var17_17 = var10_10;
                var10_10 = new Object();
                var10_10 = CY2.a((LP1)var8_8, (Function1)var10_10);
                var26_26 = 24;
                var10_10 = j.k(j.d((LP1)var10_10, var26_26), var26_26);
                var27_27 = OX.k;
                var22_22 = fg2_1.a;
                var15_15 = a.b((LP1)var10_10, var27_27, (i13)var22_22);
                var29_28 = "";
                var20_20 = 1;
                var16_16 = false;
                Pd1.a((im2)var17_17, var29_28, var15_15, null, null, 0.0f, null, var11_11, 56, 120);
                Intrinsics.checkNotNull(var2_2);
                var30_29 = j.m((LP1)var8_8);
                var9_9 = 16;
                var13_13 = var9_9;
                var25_25 = 4;
                var26_26 = var25_25;
                var10_10 = h.i(var30_29, var26_26, var13_13, 0.0f, var13_13, 4);
                var31_30 = Em3.f(var9_9);
                var9_9 = R$color.accent_color_10;
                var27_27 = oy_0.a(var11_11, var9_9);
                var33_31 = tv0_0.o;
                var34_32 = 199680;
                var23_23 = null;
                var24_24 = false;
                var17_17 = null;
                var35_33 = 0L;
                var37_34 = 0L;
                var30_29 = null;
                var39_35 = 131024;
                var8_8 = var2_2;
                var3_3 = var11_11;
                var7_7 = var33_31;
                var33_31 = var11_11;
                Ll3.b(var2_2, (LP1)var10_10, var27_27, var31_30, null, (tv0_0)var7_7, null, var35_33, null, null, var37_34, 0, false, 0, 0, null, null, var11_11, var34_32, 0, var39_35);
                var8_8 = var11_11;
                var12_12 = true;
                var13_13 = 1.4E-45f;
                var11_11.T(var12_12);
                break block8;
            }
            s20.a();
            throw null;
        }
        var8_8 = var8_8.X();
        if (var8_8 != null) {
            var18_18 = var2_2;
            var21_21 = var4_4;
            var8_8.d = var10_10 = new vp3_0(var4_4, var5_5, var6_6, var2_2);
        }
    }
}

