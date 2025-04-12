/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Xe2
implements gx0_2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ CartEntry f;

    public Xe2(String string2, Ref$ObjectRef ref$ObjectRef, boolean bl2, boolean bl3, boolean bl4, CartEntry cartEntry) {
        this.a = string2;
        this.b = ref$ObjectRef;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = cartEntry;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        block15: {
            block18: {
                block16: {
                    block17: {
                        block14: {
                            var4_4 = this;
                            var5_5 = var1_1;
                            var5_5 = (PA)var1_1;
                            var6_6 = var2_2;
                            var6_6 = (b30_0)var2_2;
                            var7_7 = var3_3;
                            var7_7 = (Number)var3_3;
                            var8_8 = var7_7.intValue();
                            var9_9 = "$this$BoxWithConstraints";
                            Intrinsics.checkNotNullParameter(var5_5, (String)var9_9);
                            var10_10 = var8_8 & 14;
                            var11_11 = 2;
                            var12_12 = 4;
                            if (var10_10 == 0) {
                                var10_10 = (int)var6_6.J(var5_5);
                                if (var10_10 != 0) {
                                    var10_10 = 4;
                                    var13_13 = 5.6E-45f;
                                } else {
                                    var10_10 = 2;
                                    var13_13 = 2.8E-45f;
                                }
                                var8_8 |= var10_10;
                            }
                            var10_10 = 18;
                            var13_13 = 2.5E-44f;
                            if ((var8_8 &= 91) != var10_10 || (var8_8 = (int)var6_6.h()) == 0) break block14;
                            var6_6.D();
                            break block15;
                        }
                        var6_6.u(1998134191);
                        var7_7 = var4_4.a;
                        var13_13 = 1.1E-44f;
                        var7_7 = u63.a(var7_7, (b30_0)var6_6, 8);
                        var6_6.I();
                        var10_10 = R$string.product_image;
                        var9_9 = hv3_0.K(var10_10);
                        var14_14 = (LP1)var4_4.b.element;
                        var15_15 = 0;
                        var16_16 = null;
                        var17_17 = 120;
                        var18_18 = 0;
                        var19_19 = null;
                        var20_20 = false;
                        var21_21 = null;
                        var22_22 /* !! */  = null;
                        var23_23 = false;
                        var24_24 = null;
                        var25_25 = var6_6;
                        Pd1.a((im2)var7_7, (String)var9_9, (LP1)var14_14, null, null, 0.0f, null, (b30_0)var6_6, 0, var17_17);
                        var8_8 = (int)var4_4.c;
                        if (var8_8 != 0) break block15;
                        var8_8 = (int)var4_4.e;
                        var10_10 = (int)var4_4.d;
                        if (var10_10 == 0 && var8_8 == 0) break block15;
                        var14_14 = "";
                        if (var10_10 == 0) break block16;
                        var6_6.K(-1840594332);
                        var8_8 = R$string.od_cancelled;
                        var7_7 = nk_0.f((b30_0)var6_6, var8_8);
                        var9_9 = var4_4.f;
                        var19_19 = var9_9 != null ? no_2.b((CartEntry)var9_9) : var14_14;
                        var21_21 = "CANCELLED";
                        var18_18 = var21_21.equalsIgnoreCase((String)var19_19);
                        if (var18_18 != 0) {
                            var6_6.K(-1840292082);
                            var8_8 = R$string.od_cancelled;
                            var7_7 = nk_0.f((b30_0)var6_6, var8_8);
                            var6_6.E();
lbl68:
                            // 3 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var21_21 = "CANCELLATION_REQUESTED";
                        var19_19 = var9_9 != null ? no_2.b((CartEntry)var9_9) : var14_14;
                        var18_18 = var21_21.equalsIgnoreCase((String)var19_19);
                        if (var18_18 != 0) break block17;
                        if (var9_9 != null) {
                            var14_14 = no_2.b((CartEntry)var9_9);
                        }
                        if ((var10_10 = (int)(var9_9 = "CANCELLATION REQUESTED").equalsIgnoreCase((String)var14_14)) != 0) break block17;
                        var10_10 = -1839522786;
                        var13_13 = -6.913887E-28f;
                        var6_6.K(var10_10);
                        var6_6.E();
                        ** GOTO lbl68
                    }
                    var6_6.K(-1839673663);
                    var8_8 = R$string.od_cancellation_requested;
                    var7_7 = nk_0.f((b30_0)var6_6, var8_8);
                    var6_6.E();
                    ** while (true)
                    var14_14 = var7_7;
                    var6_6.E();
                    break block18;
                }
                if (var8_8 != 0) {
                    var6_6.K(-1839376342);
                    var8_8 = R$string.exchange;
                    var14_14 = nk_0.f((b30_0)var6_6, var8_8);
                    var6_6.E();
                } else {
                    var8_8 = -1839216692;
                    var6_6.K(var8_8);
                    var6_6.E();
                }
            }
            var8_8 = (int)TextUtils.isEmpty((CharSequence)var14_14);
            if (var8_8 == 0) {
                var7_7 = LP1$a.b;
                var9_9 = Nc$a.h;
                var19_19 = var5_5.a((LP1)var7_7, (Nc)var9_9);
                var26_26 = 16;
                var27_27 = var26_26;
                var20_20 = false;
                var15_15 = 7;
                var5_5 = h.i((LP1)var19_19, 0.0f, 0.0f, 0.0f, var27_27, var15_15);
                var9_9 = Nc$a.a;
                var19_19 = null;
                var9_9 = HA.e((Nc)var9_9, false);
                var18_18 = var6_6.F();
                var21_21 = var6_6.m();
                var5_5 = a30_0.c((b30_0)var6_6, (LP1)var5_5);
                N20.W.getClass();
                var22_22 /* !! */  = N20$a.b;
                var24_24 = var6_6.i();
                var23_23 = var24_24 instanceof mp;
                if (var23_23) {
                    var6_6.A();
                    var23_23 = var6_6.e();
                    if (var23_23) {
                        var6_6.C(var22_22 /* !! */ );
                    } else {
                        var6_6.n();
                    }
                    var22_22 /* !! */  = N20$a.e;
                    Ow3.a((b30_0)var6_6, var9_9, (Function2)var22_22 /* !! */ );
                    var9_9 = N20$a.d;
                    Ow3.a((b30_0)var6_6, var21_21, (Function2)var9_9);
                    var9_9 = N20$a.f;
                    var20_20 = var6_6.e();
                    if (var20_20 || !(var20_20 = Intrinsics.areEqual(var21_21 = var6_6.v(), var22_22 /* !! */  = Integer.valueOf(var18_18)))) {
                        re0_0.a(var18_18, (b30_0)var6_6, var18_18, (N20$a$a)var9_9);
                    }
                    var9_9 = N20$a.c;
                    Ow3.a((b30_0)var6_6, var5_5, (Function2)var9_9);
                    var5_5 = Locale.ROOT;
                    var5_5 = var14_14.toUpperCase((Locale)var5_5);
                    Intrinsics.checkNotNullExpressionValue(var5_5, "toUpperCase(...)");
                    var10_10 = 10;
                    var28_28 = Em3.f(var10_10);
                    var30_29 = OX.f;
                    var16_16 = y20_0.a;
                    var32_30 = xx_1.z;
                    var9_9 = SP2.a(var11_11);
                    var7_7 = androidx.compose.foundation.a.b((LP1)var7_7, var32_30, (i13)var9_9);
                    var13_13 = var12_12;
                    var9_9 = h.e((LP1)var7_7, var13_13);
                    var25_25 = tv0_0.o;
                    var34_31 = 130960;
                    var23_23 = false;
                    var24_24 = null;
                    var35_32 = 0L;
                    var12_12 = 0;
                    var37_33 = 0L;
                    var39_34 = 1772928;
                    var7_7 = var5_5;
                    Ll3.b((String)var5_5, (LP1)var9_9, var30_29, var28_28, null, (tv0_0)var25_25, var16_16, var35_32, null, null, var37_33, 0, false, 0, 0, null, null, (b30_0)var6_6, var39_34, 0, var34_31);
                    var6_6.p();
                } else {
                    s20.a();
                    throw null;
                }
            }
        }
        return Unit.a;
    }
}

