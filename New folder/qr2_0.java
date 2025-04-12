/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ToggleButton
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qr2
 */
public final class qr2_0
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ rr2_1 a;

    public /* synthetic */ qr2_0(rr2_1 rr2_12) {
        this.a = rr2_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onCheckedChanged(CompoundButton var1_1, boolean var2_2) {
        block15: {
            block14: {
                var1_1 = this.a;
                Intrinsics.checkNotNullParameter(var1_1, "this$0");
                var3_3 = "EMI";
                var4_4 = 0;
                var5_5 /* !! */  = null;
                if (!var2_2) break block14;
                var6_6 = var1_1.h;
                var7_7 = var6_6.b.j0();
                if (var7_7 == null) ** GOTO lbl-1000
                if ((var7_7 = var7_7.getPaymentInstrumentDetails()) != null) {
                    var7_7 = ((Iterable)var7_7).iterator();
                    while (var8_9 = var7_7.hasNext()) {
                        var9_10 /* !! */  = var7_7.next();
                        var10_12 = var9_10 /* !! */ ;
                        var10_12 = (PaymentInstrumentType)var9_10 /* !! */ ;
                        if (var10_12 != null) {
                            var10_12 = var10_12.getPaymentInstrumentCode();
                        } else {
                            var11_14 = false;
                            var10_12 = null;
                        }
                        if (!(var11_14 = Intrinsics.areEqual(var10_12, var3_3))) continue;
                        var5_5 /* !! */  = var9_10 /* !! */ ;
                        break;
                    }
                    var5_5 /* !! */  = (PaymentInstrumentType)var5_5 /* !! */ ;
                }
                if (var5_5 /* !! */  != null && ((var4_4 = Intrinsics.areEqual((Object)(var5_5 /* !! */  = var5_5 /* !! */ .getEmiDataSent()), var7_7 = Boolean.FALSE)) != 0 || (var4_4 = Intrinsics.areEqual((Float)(var5_5 /* !! */  = no2_0.e), (Float)(var7_7 = no2_0.d))) == 0)) {
                    var5_5 /* !! */  = var1_1.d;
                    var6_6.a((op2_2)var5_5 /* !! */ );
                } else lbl-1000:
                // 2 sources

                {
                    var5_5 /* !! */  = var6_6.i;
                    ai0_2.i((View)var5_5 /* !! */ );
                    var5_5 /* !! */ .stopShimmer();
                    var5_5 /* !! */  = var6_6.k;
                    ai0_2.i((View)var5_5 /* !! */ );
                    var6_6 = var6_6.j;
                    ai0_2.B((View)var6_6);
                }
                uh_1.Companion.getClass();
                Intrinsics.checkNotNullParameter(var3_3, "<set-?>");
                uh_1.e = var3_3;
                var6_6 = var1_1.b;
                if (var6_6 != null) {
                    var3_3 = var1_1.g.getEC_CHECKOUT_INTERACTIONS();
                    var5_5 /* !! */  = "EMI clicked";
                    var7_7 = "payment_accordian_open";
                    var9_10 /* !! */  = "payment accordian open";
                    var6_6.x1((String)var3_3, (String)var9_10 /* !! */ , (String)var5_5 /* !! */ , (String)var7_7);
                }
                var3_3 = AnalyticsManager.Companion;
                var5_5 /* !! */  = var3_3.getInstance().getGtmEvents();
                var7_7 = "EMI_clicked";
                var9_10 /* !! */  = "EMI selected";
                ak0_0.a((AnalyticsManager$Companion)var3_3, (GTMEvents)var5_5 /* !! */ , (String)var7_7, var9_10 /* !! */ );
                uh_1.d = var12_15 = true;
                var3_3 = var1_1.f;
                var3_3.showContentContainer();
                if (var6_6 != null) {
                    var3_3 = var1_1.e;
                    var4_4 = var1_1.a;
                    var6_6.k((ToggleButton)var3_3, var4_4);
                }
                break block15;
            }
            var6_6 = uh_1.Companion;
            var6_6.getClass();
            var2_2 = uh_1.c;
            var13_16 = -1;
            if ((var2_2 && (var2_2 = (var6_6 = var1_1.c.A()).d()) || !(var2_2 = uh_1.d)) && !(var2_2 = Intrinsics.areEqual(var6_6 = uh_1.e, var3_3))) {
                var1_1.w(var13_16);
                var6_6 = var1_1.h;
                var6_6.c();
            } else {
                var1_1.w(var13_16);
                var6_6 = var1_1.h;
                var7_8 = var6_6.a;
                if (var7_8 != null) {
                    var7_8.a();
                }
                if ((var7_8 = var1_1.d) != null) {
                    var9_11 = var6_6.b;
                    var10_13 = var9_11.j0();
                    var14_17 = var9_11.n8();
                    var15_18 = hj_1.EMI;
                    var9_11 = var9_11.H();
                    op2_2.d((op2_2)var7_8, var10_13, var14_17, var15_18, (HashSet)var9_11);
                }
                var6_6.c();
            }
            var6_6 = var1_1.b;
            if (var6_6 != null) {
                var6_6.i4(null);
            }
            if ((var6_6 = var1_1.b) != null) {
                var5_5 /* !! */  = var1_1.g.getEC_CHECKOUT_INTERACTIONS();
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var3_3);
                var7_8 = "payment accordian close";
                var9_11 = "payment_accordian_close";
                var6_6.x1((String)var5_5 /* !! */ , (String)var7_8, (String)var3_3, (String)var9_11);
            }
            var6_6 = var1_1.f;
            var6_6.hideContentContainer();
        }
        var3_3 = Looper.getMainLooper();
        var6_6 = new Handler((Looper)var3_3);
        var3_3 = new tb_2(var1_1, 1);
        var6_6.postDelayed((Runnable)var3_3, 1000L);
    }
}

