/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 */
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from iD0
 */
public final class id0_2
implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ gd0_0 a;
    public final /* synthetic */ gD0$a b;
    public final /* synthetic */ CartEntry c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ NestedScrollView e;

    public id0_2(gd0_0 gd0_02, gD0$a gD0$a, CartEntry cartEntry, FragmentActivity fragmentActivity, NestedScrollView nestedScrollView) {
        this.a = gd0_02;
        this.b = gD0$a;
        this.c = cartEntry;
        this.d = fragmentActivity;
        this.e = nestedScrollView;
    }

    /*
     * Unable to fully structure code
     */
    public final void onItemSelected(AdapterView var1_1, View var2_2, int var3_3, long var4_4) {
        block32: {
            block31: {
                Intrinsics.checkNotNullParameter(var1_1, "parent");
                Intrinsics.checkNotNullParameter(var2_2, "view");
                var2_2 = this.a;
                hv3_0.S(var2_2.j);
                gd0_0.o(var2_2.f, 4, var3_3);
                var1_1 = var1_1.getItemAtPosition(var3_3);
                var6_5 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(var1_1, (String)var6_5);
                var1_1 = (String)var1_1;
                var7_6 = var1_1.length();
                var8_7 = 1;
                var7_6 -= var8_7;
                var9_8 = 0;
                var10_9 = null;
                var11_10 = false;
                var12_11 = null;
                while (var9_8 <= var7_6) {
                    var13_12 = var11_10 == false ? var9_8 : var7_6;
                    var13_12 = var1_1.charAt(var13_12);
                    var14_13 = 32;
                    if ((var13_12 = Intrinsics.compare(var13_12, var14_13)) <= 0) {
                        var13_12 = 1;
                    } else {
                        var13_12 = 0;
                        var15_14 = null;
                    }
                    if (!var11_10) {
                        if (var13_12 == 0) {
                            var11_10 = true;
                            continue;
                        }
                        ++var9_8;
                        continue;
                    }
                    if (var13_12 == 0) break;
                    var7_6 += -1;
                }
                var1_1 = com.jio.jioads.adinterfaces.a.a(var7_6, var8_7, var9_8, (String)var1_1);
                var6_5 = var2_2.k;
                var7_6 = (int)ce0_2.a((String)var6_5, (String)var1_1);
                var9_8 = (int)var2_2.a;
                var12_11 = var2_2.b;
                if (var9_8 != 0 && var3_3 > 0 && var7_6 == 0) {
                    if (var12_11 != null) {
                        var16_15 = Boolean.TRUE;
                        var17_16 = Boolean.FALSE;
                        var15_14 = new Pair(var16_15, var17_16);
                        var12_11.E((Pair)var15_14);
                    }
                } else if (var12_11 != null) {
                    var16_15 = Boolean.FALSE;
                    var15_14 = new Pair(var16_15, var16_15);
                    var12_11.E((Pair)var15_14);
                }
                var15_14 = "";
                var16_15 = this.b;
                if (var3_3 != 0) {
                    var17_16 = var16_15.v;
                    if (var17_16 != null) {
                        var17_16.setText((CharSequence)var1_1);
                    }
                } else {
                    var17_16 = var16_15.v;
                    if (var17_16 != null) {
                        var17_16.setText((CharSequence)var15_14);
                    }
                }
                if (var9_8 == 0) break block31;
                var10_9 = this.c;
                var13_12 = (int)var10_9.isExchangeEligible();
                if (var13_12 == 0 || (var13_12 = gd0_0.a((gd0_0)var2_2, (String)var1_1)) == 0) ** GOTO lbl-1000
                var15_14 = var2_2.k;
                var18_17 = var10_9.isExchangeable();
                if (var18_17 != 0 || (var13_12 = kotlin.text.b.i((String)var15_14, (String)(var17_16 = hv3_0.K(var18_17 = R$string.size_colour_issue)), (boolean)var8_7)) == 0) {
                    var15_14 = var16_15.a;
                    if (var15_14 != null) {
                        var15_14.setVisibility(0);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    if ((var15_14 = var16_15.a) != null) {
                        var14_13 = 8;
                        var15_14.setVisibility(var14_13);
                    }
                    gd0_0.b((gd0_0)var2_2, (String)var1_1, (boolean)var7_6);
                }
                if (var12_11 != null) {
                    if (var7_6 != 0) {
                        var2_2.f(false);
                        var12_11.h4((boolean)var8_7);
                    } else {
                        var12_11.h4(false);
                        var7_6 = var10_9.getIsReturnItem();
                        if (var7_6 != 0 && (var6_5 = var2_2.l) != null && (var7_6 = var6_5.length()) != 0) {
                            var6_5 = var2_2.f;
                            var13_12 = 0;
                            var15_14 = null;
                            if (var6_5 != null) {
                                var6_5 = var6_5.h;
                            } else {
                                var7_6 = 0;
                                var6_5 = null;
                            }
                            Intrinsics.checkNotNull(var6_5);
                            var16_15 = var2_2.l;
                            var6_5.setText((CharSequence)var16_15);
                            var2_2.l = null;
                        }
                    }
                }
                if ((var7_6 = var10_9.isExchangeEligible()) == 0 || (var7_6 = gd0_0.a((gd0_0)var2_2, (String)var1_1)) == 0) ** GOTO lbl-1000
                var6_5 = var2_2.k;
                var9_8 = var10_9.isExchangeable();
                if (var9_8 != 0 || (var7_6 = (int)kotlin.text.b.i((String)var6_5, (String)(var10_9 = hv3_0.K(var9_8 = R$string.size_colour_issue)), (boolean)var8_7)) == 0) {
                    if (var12_11 != null) {
                        var12_11.B((boolean)var8_7);
                    }
                } else if (var12_11 != null) {
                    var12_11.B(false);
                }
                break block32;
            }
            if (var7_6 != 0) {
                var19_18 = var2_2.k;
                gd0_0.b((gd0_0)var2_2, var19_18, (boolean)var7_6);
                if (var12_11 != null) {
                    var12_11.B(false);
                }
            } else {
                gd0_0.b((gd0_0)var2_2, (String)var15_14, (boolean)var7_6);
                if (var12_11 != null) {
                    var12_11.B(false);
                }
            }
        }
        var6_5 = this.e;
        var2_2.i((String)var1_1, var3_3, (NestedScrollView)var6_5);
        var1_1 = this.d;
        var2_2.j((Activity)var1_1);
    }

    public final void onNothingSelected(AdapterView object) {
        object = this.a;
        gd0_0.o(((gd0_0)object).f, 3, -1);
        Activity activity = this.d;
        ((gd0_0)object).j(activity);
    }
}

