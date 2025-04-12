/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.View
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from hY1
 */
public final class hy1_1
implements F62 {
    public final /* synthetic */ oy1_1 a;

    public /* synthetic */ hy1_1(oy1_1 oy1_12) {
        this.a = oy1_12;
    }

    /*
     * Unable to fully structure code
     */
    public final void onChanged(Object var1_1) {
        block20: {
            block21: {
                block22: {
                    block24: {
                        block23: {
                            var2_2 = 0;
                            var3_3 = null;
                            var4_4 = 1;
                            var1_1 = (DataCallback)var1_1;
                            var5_5 = this.a;
                            Intrinsics.checkNotNullParameter(var5_5, "this$0");
                            var6_6 = cp_1.Companion;
                            var7_7 = nn_2.b((cp$a)var6_6, (DataCallback)var1_1);
                            if (var7_7 == 0) break block20;
                            var5_5.p0 = false;
                            var5_5.Wa();
                            var6_6 = var5_5.u;
                            var8_8 = var5_5.v;
                            hv3_0.t0((ShimmerFrameLayout)var6_6, (View)var8_8);
                            Intrinsics.checkNotNull(var1_1);
                            var7_7 = var1_1.getStatus();
                            var8_8 = null;
                            if (var7_7 != 0) break block21;
                            var7_7 = (int)var5_5.isAdded();
                            if (var7_7 == 0) break block20;
                            var1_1 = (ProductsList)var1_1.getData();
                            var5_5.Qa().p((ProductsList)var1_1, false);
                            var6_6 = var5_5.G;
                            if (var6_6 != null) {
                                var6_6.setLoadingSate(false);
                            }
                            if (var1_1 == null || (var3_3 = var1_1.getPagination()) == null || (var2_2 = var3_3.getCurrentPage()) != 0) break block22;
                            var3_3 = tr2_2.a;
                            var7_7 = (int)tr2_2.y(var5_5.J);
                            if (var7_7 != 0 && (var6_6 = var1_1.getSaleStartTime()) != null) {
                                var9_9 = var6_6.longValue();
                                if ((var1_1 = var1_1.getSaleEndTime()) != null) {
                                    var11_10 = var1_1.longValue();
                                    var1_1 = var9_9;
                                    var6_6 = var11_10;
                                    tr2_2.B((Long)var1_1, (Long)var6_6);
                                }
                            }
                            var1_1 = new Bundle();
                            var7_7 = (int)og1_1.c();
                            var2_2 = (int)var3_3.x((boolean)var7_7);
                            var6_6 = "bbs_widget";
                            if (var2_2 == 0) break block23;
                            var3_3 = "visible";
                            var1_1.putString((String)var6_6, (String)var3_3);
                            var2_2 = (int)og1_1.c();
                            var7_7 = (int)tr2_2.y((boolean)var2_2);
                            var13_11 = "sale price revealed";
                            var14_12 = "bbs_widget_state";
                            if (var7_7 == 0 || (var7_7 = (int)tr2_2.o()) == 0) ** GOTO lbl-1000
                            if (var2_2 == 0) ** GOTO lbl-1000
                            var3_3 = tr2_2.d();
                            var2_2 = (int)var3_3.b;
                            if (var2_2 != 0) lbl-1000:
                            // 2 sources

                            {
                                if ((var2_2 = (int)(var3_3 = tr2_2.b).n()) != 0) {
                                    var1_1.putString(var14_12, var13_11);
                                } else {
                                    var3_3 = "sale price not revealed";
                                    var1_1.putString(var14_12, (String)var3_3);
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                var1_1.putString(var14_12, var13_11);
                            }
                            break block24;
                        }
                        var2_2 = (int)tr2_2.y(og1_1.c());
                        if (var2_2 != 0) {
                            var3_3 = "not visible";
                            var1_1.putString((String)var6_6, (String)var3_3);
                        }
                    }
                    var2_2 = ((jo_2)var5_5.I.getValue()).d();
                    var1_1.putInt("number_of_items_on_cart", var2_2);
                    var3_3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var6_6 = "closet screen";
                    var3_3.pushOpenScreenEvent((String)var6_6, (Bundle)var1_1);
                    var3_3 = Looper.getMainLooper();
                    var1_1 = new Handler((Looper)var3_3);
                    var3_3 = new wm_1(var5_5, var4_4);
                    var9_9 = 500L;
                    var1_1.postDelayed((Runnable)var3_3, var9_9);
                    var15_13 = new Bundle();
                    var1_1 = var5_5.z.getNUMBER_OF_ITEMS();
                    var3_3 = var5_5.Qa();
                    var2_2 = var3_3.B;
                    var15_13.putInt((String)var1_1, var2_2);
                    var1_1 = var5_5.y;
                    var16_14 = var1_1.getPrevScreen();
                    var17_15 = var1_1.getPrevScreenType();
                    var18_16 = var5_5.z;
                    var19_17 = "closet screen";
                    var20_18 = "closet screen";
                    var18_16.newPushCustomScreenView(var19_17, var20_18, var16_14, var15_13, var17_15);
                }
                kx3_0.c = var4_4;
                var1_1 = var5_5.Qa().y;
                var21_19 = var1_1.isEmpty() ^ var4_4;
                if (var21_19 != 0) {
                    var1_1 = var5_5.Qa().y;
                    var3_3 = var5_5.Qa().z;
                    var5_5.cb((ArrayList)var1_1, (ArrayList)var3_3);
                    var5_5.bb();
                } else {
                    var1_1 = var5_5.Qa().A;
                    var21_19 = var1_1.size();
                    if (var21_19 > 0) {
                        var5_5.Qa().y.clear();
                        var1_1 = var5_5.Qa().y;
                        var3_3 = var5_5.Qa().A;
                        var1_1.addAll(var3_3);
                        var1_1 = var5_5.Qa().y;
                        var3_3 = var5_5.Qa().z;
                        var5_5.cb((ArrayList)var1_1, (ArrayList)var3_3);
                        var5_5.bb();
                    } else {
                        var5_5.fb();
                    }
                }
                var1_1 = var5_5.Qa();
                var3_3 = var5_5.Qa().y;
                var1_1.getClass();
                Intrinsics.checkNotNullParameter(var3_3, "products");
                var1_1 = md3_0.c((jD3)var1_1);
                var22_21 = new qy1_2((ArrayList)var3_3, null);
                var2_2 = 3;
                Ae3.d((i90_0)var1_1, null, null, var22_21, var2_2);
                break block20;
            }
            var7_7 = var1_1.getStatus();
            if (var7_7 == var4_4) {
                var1_1 = var1_1.getError();
                var6_6 = var5_5.G;
                if (var6_6 != null) {
                    var6_6.setLoadingSate(false);
                }
                if (var1_1 != null && (var6_6 = var1_1.getErrorMessage()) != null) {
                    var6_6 = var6_6.getMessage();
                } else {
                    var7_7 = 0;
                    var6_6 = null;
                }
                var7_7 = (int)TextUtils.isEmpty((CharSequence)var6_6);
                if (var7_7 == 0) {
                    if (var1_1 != null && (var1_1 = var1_1.getErrorMessage()) != null && (var1_1 = var1_1.getMessage()) != null) {
                        hv3_0.o0(0, (String)var1_1, null);
                    }
                } else {
                    var1_1 = var5_5.G;
                    if (var1_1 != null) {
                        var1_1.setLoadingSate(false);
                    }
                    var1_1 = StringCompanionObject.INSTANCE;
                    var21_20 = R$string.acc_error_message;
                    var1_1 = hv3_0.K(var21_20);
                    var7_7 = R$string.wish_list_alert;
                    var6_6 = hv3_0.K(var7_7);
                    var8_8 = new Object[var4_4];
                    var8_8[0] = var6_6;
                    var1_1 = xh2_0.a(var8_8, var4_4, (String)var1_1, "format(...)");
                    var2_2 = R$string.wish_list_alert;
                    var3_3 = hv3_0.K(var2_2);
                    var5_5.gb((String)var3_3, (String)var1_1);
                }
            }
        }
    }
}

