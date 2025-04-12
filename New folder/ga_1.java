/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from gA
 */
public final class ga_1
implements Function1 {
    public final /* synthetic */ ia_1 a;

    public /* synthetic */ ga_1(ia_1 ia_12) {
        this.a = ia_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block55: {
            block56: {
                block57: {
                    block58: {
                        var2_2 = 0;
                        var3_3 = null;
                        var4_4 = 1;
                        var5_5 = var1_1;
                        var5_5 = (DataCallback)var1_1;
                        var6_6 = this.a;
                        Intrinsics.checkNotNullParameter(var6_6, "this$0");
                        Intrinsics.checkNotNullParameter(var5_5, "incentiviseHighReturnDataCallback");
                        var7_7 /* !! */  = cp_1.Companion;
                        var8_8 = nn_2.b((cp$a)var7_7 /* !! */ , (DataCallback)var5_5);
                        if (var8_8 == 0) break block55;
                        var8_8 = var5_5.getStatus();
                        var9_9 = "shimmerView";
                        var10_10 = "";
                        var11_11 = "clSeekBarLayout";
                        var12_12 = "binding";
                        var13_13 = null;
                        if (var8_8 != 0) break block56;
                        var7_7 /* !! */  = (IncentiviseHighReturnData)var5_5.getData();
                        if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getResult()) != null) {
                            var7_7 /* !! */  = var7_7 /* !! */ .getEXCHANGE_NUDGE();
                        } else {
                            var8_8 = 0;
                            var7_7 /* !! */  = null;
                        }
                        if (var7_7 /* !! */  == null) break block57;
                        var7_7 /* !! */  = (IncentiviseHighReturnData)var5_5.getData();
                        if (var7_7 /* !! */  == null || (var7_7 /* !! */  = var7_7 /* !! */ .getResult()) == null || (var7_7 /* !! */  = var7_7 /* !! */ .getEXCHANGE_NUDGE()) == null) break block55;
                        if ((var5_5 = (IncentiviseHighReturnData)var5_5.getData()) != null && (var5_5 = var5_5.getResult()) != null && (var5_5 = var5_5.getPOST_ORDER_RETURN_FEE()) != null) {
                            var5_5 = var5_5.getActionContent();
                        } else {
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var15_16 /* !! */  = var6_6.f;
                        if (var15_16 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var16_17 = 0;
                            var15_16 /* !! */  = null;
                        }
                        var15_16 /* !! */  = var15_16 /* !! */ .clSeekBarLayout;
                        Intrinsics.checkNotNullExpressionValue(var15_16 /* !! */ , var11_11);
                        ai0_2.B((View)var15_16 /* !! */ );
                        var15_16 /* !! */  = var6_6.f;
                        if (var15_16 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var16_17 = 0;
                            var15_16 /* !! */  = null;
                        }
                        hv3_0.s0(var15_16 /* !! */ .shimmerView);
                        var15_16 /* !! */  = var6_6.f;
                        if (var15_16 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var16_17 = 0;
                            var15_16 /* !! */  = null;
                        }
                        var15_16 /* !! */  = var15_16 /* !! */ .shimmerView;
                        Intrinsics.checkNotNullExpressionValue(var15_16 /* !! */ , (String)var9_9);
                        ai0_2.i((View)var15_16 /* !! */ );
                        if (var5_5 == null || (var9_9 = var5_5.getReturn_fee_section_title()) == null) {
                            var9_9 = var10_10;
                        }
                        var17_18 = var5_5 != null && (var15_16 /* !! */  = var5_5.getReturn_fee_section_desc()) != null ? var15_16 /* !! */  : var10_10;
                        var16_17 = var6_6.o;
                        var18_19 = "clReturnFeeLayout";
                        if (var16_17 <= 0 || (var16_17 = var9_9.length()) <= 0 || (var16_17 = var17_18.length()) <= 0) break block58;
                        var3_3 = var6_6.f;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var2_2 = 0;
                            var3_3 = null;
                        }
                        var3_3 = var3_3.clSeekBarLayout;
                        Intrinsics.checkNotNullExpressionValue(var3_3, var11_11);
                        ai0_2.i((View)var3_3);
                        var3_3 = var6_6.f;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var2_2 = 0;
                            var3_3 = null;
                        }
                        var3_3 = var3_3.clReturnFeeLayout;
                        Intrinsics.checkNotNullExpressionValue(var3_3, var18_19);
                        ai0_2.B((View)var3_3);
                        var3_3 = var6_6.f;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var2_2 = 0;
                            var3_3 = null;
                        }
                        var3_3.tvReturnFeeTitle.setText((CharSequence)var9_9);
                        var3_3 = hv3_0.a;
                        var19_20 = var6_6.o;
                        if (var5_5 != null) {
                            var20_22 = var5_5.getReturn_fee_cta();
                            var21_24 = var20_22;
                        } else {
                            var21_24 = null;
                        }
                        var20_22 = var6_6.f;
                        if (var20_22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                        } else {
                            var13_13 = var20_22;
                        }
                        var22_25 = var13_13.tvReturnFeeDesc;
                        Intrinsics.checkNotNullExpressionValue(var22_25, "tvReturnFeeDesc");
                        var23_26 = R$color.option_blue;
                        var20_22 = new ca_0((ActionContent)var5_5, var6_6);
                        var3_3.getClass();
                        hv3_0.d0(var19_20, (String)var17_18, var21_24, var22_25, var23_26, (Function0)var20_22);
                        break block55;
                    }
                    var5_5 = var7_7 /* !! */ .getActionContent();
                    if (var5_5 == null) ** GOTO lbl-1000
                    var5_5 = var7_7 /* !! */ .getActionContent();
                    if (var5_5 != null) {
                        var5_5 = var5_5.getAjio_avg_perc();
                    } else {
                        var14_14 = 0;
                        var5_5 = null;
                    }
                    if (var5_5 == null) ** GOTO lbl-1000
                    var5_5 = var7_7 /* !! */ .getActionContent();
                    if (var5_5 != null && (var5_5 = var5_5.getAjio_avg_perc()) != null) {
                        var14_14 = var5_5.intValue();
                    } else {
                        var14_14 = 0;
                        var5_5 = null;
                    }
                    if (var14_14 < 0) ** GOTO lbl-1000
                    var5_5 = var7_7 /* !! */ .getExtra();
                    if (var5_5 != null) {
                        var14_14 = var5_5.getRvpPercent();
                        var5_5 = var14_14;
                    } else {
                        var14_14 = 0;
                        var5_5 = null;
                    }
                    if (var5_5 == null) ** GOTO lbl-1000
                    var5_5 = var7_7 /* !! */ .getExtra();
                    if (var5_5 != null) {
                        var14_14 = var5_5.getRvpPercent();
                    } else {
                        var14_14 = 0;
                        var5_5 = null;
                    }
                    if (var14_14 >= 0) {
                        var5_5 = var6_6.f;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var5_5 = var5_5.clReturnFeeLayout;
                        Intrinsics.checkNotNullExpressionValue(var5_5, var18_19);
                        ai0_2.i((View)var5_5);
                        var5_5 = var6_6.f;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var5_5 = var5_5.rvpSeekBarLayoutView.clSeekBar;
                        var9_9 = "clSeekBar";
                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var9_9);
                        ai0_2.B((View)var5_5);
                        var5_5 = var6_6.f;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var5_5 = var5_5.rvpSeekBarLayoutView.tvTitle;
                        var9_9 = var7_7 /* !! */ .getActionContent();
                        if (var9_9 != null && (var9_9 = var9_9.getPO_section_title()) != null) {
                            var10_10 = var9_9;
                        }
                        var5_5.setText((CharSequence)var10_10);
                        var5_5 = var7_7 /* !! */ .getActionContent();
                        if (var5_5 != null) {
                            var5_5 = var5_5.getPO_section_desc();
                        } else {
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var24_27 = R$string.know_more_refresh;
                        var9_9 = var6_6.getString(var24_27);
                        var10_10 = "getString(...)";
                        Intrinsics.checkNotNullExpressionValue(var9_9, (String)var10_10);
                        if (var5_5 == null) {
                            var5_5 = var9_9;
                        }
                        var25_28 = var5_5.length() + var4_4;
                        var5_5 = n1.a((String)var5_5, " ", (String)var9_9);
                        var20_23 = new SpannableString((CharSequence)var5_5);
                        var5_5 = new ja_1(var6_6);
                        var15_16 /* !! */  = var6_6.f;
                        if (var15_16 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var16_17 = 0;
                            var15_16 /* !! */  = null;
                        }
                        var15_16 /* !! */  = var15_16 /* !! */ .rvpSeekBarLayoutView.tvKnowMore.getContext();
                        var19_21 = R$color.option_blue;
                        var16_17 = t70.getColor((Context)var15_16 /* !! */ , var19_21);
                        var11_11 = new ForegroundColorSpan(var16_17);
                        var16_17 = var9_9.length() + var25_28;
                        var19_21 = 33;
                        var20_23.setSpan((Object)var11_11, var25_28, var16_17, var19_21);
                        var24_27 = var9_9.length() + var25_28;
                        var20_23.setSpan(var5_5, var25_28, var24_27, var19_21);
                        var5_5 = var6_6.f;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var5_5 = var5_5.rvpSeekBarLayoutView.tvKnowMore;
                        var9_9 = LinkMovementMethod.getInstance();
                        var5_5.setMovementMethod((MovementMethod)var9_9);
                        var5_5 = var6_6.f;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var5_5.rvpSeekBarLayoutView.tvKnowMore.setText((CharSequence)var20_23);
                        var5_5 = var6_6.f;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var14_14 = 0;
                            var5_5 = null;
                        }
                        var5_5 = var5_5.rvpSeekBarLayoutView.tvKnowMore;
                        var5_5.setContentDescription((CharSequence)var20_23);
                        var20_23 = var7_7 /* !! */ .getExtra();
                        if (var20_23 != null) {
                            var4_4 = var20_23.getRvpPercent();
                            var20_23 = var4_4;
                        } else {
                            var4_4 = 0;
                            var20_23 = null;
                        }
                        var6_6.m = var20_23 = String.valueOf(var20_23);
                        var20_23 = var7_7 /* !! */ .getExtra();
                        if (var20_23 != null) {
                            var4_4 = var20_23.getRvpPercent();
                        } else {
                            var4_4 = 0;
                            var20_23 = null;
                        }
                        var5_5 = var7_7 /* !! */ .getActionContent();
                        if (var5_5 != null && (var5_5 = var5_5.getAjio_avg_perc()) != null) {
                            var2_2 = var5_5.intValue();
                        }
                        if ((var5_5 = var6_6.f) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                        } else {
                            var13_13 = var5_5;
                        }
                        var5_5 = var13_13.rvpSeekBarLayoutView.seekBarll.getViewTreeObserver();
                        var7_7 /* !! */  = new da_1(var6_6, var2_2, var4_4);
                        var5_5.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)var7_7 /* !! */ );
                    } else lbl-1000:
                    // 5 sources

                    {
                        if ((var3_3 = var6_6.f) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                            var2_2 = 0;
                            var3_3 = null;
                        }
                        var3_3 = var3_3.clSeekBarLayout;
                        Intrinsics.checkNotNullExpressionValue(var3_3, var11_11);
                        ai0_2.i((View)var3_3);
                        var3_3 = var6_6.f;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                        } else {
                            var13_13 = var3_3;
                        }
                        var3_3 = var13_13.clReturnFeeLayout;
                        Intrinsics.checkNotNullExpressionValue(var3_3, var18_19);
                        ai0_2.i((View)var3_3);
                    }
                    break block55;
                }
                var3_3 = var6_6.f;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                    var2_2 = 0;
                    var3_3 = null;
                }
                hv3_0.s0(var3_3.shimmerView);
                var3_3 = var6_6.f;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                } else {
                    var13_13 = var3_3;
                }
                var3_3 = var13_13.shimmerView;
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var9_9);
                ai0_2.i((View)var3_3);
                break block55;
            }
            var8_8 = var5_5.getStatus();
            if (var8_8 == var4_4) {
                var7_7 /* !! */  = var6_6.f;
                if (var7_7 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                    var8_8 = 0;
                    var7_7 /* !! */  = null;
                }
                hv3_0.s0(var7_7 /* !! */ .shimmerView);
                var7_7 /* !! */  = var6_6.f;
                if (var7_7 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                    var8_8 = 0;
                    var7_7 /* !! */  = null;
                }
                var7_7 /* !! */  = var7_7 /* !! */ .shimmerView;
                Intrinsics.checkNotNullExpressionValue(var7_7 /* !! */ , (String)var9_9);
                ai0_2.i((View)var7_7 /* !! */ );
                var7_7 /* !! */  = var6_6.f;
                if (var7_7 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                } else {
                    var13_13 = var7_7 /* !! */ ;
                }
                var7_7 /* !! */  = var13_13.clSeekBarLayout;
                Intrinsics.checkNotNullExpressionValue(var7_7 /* !! */ , var11_11);
                ai0_2.i((View)var7_7 /* !! */ );
                var5_5 = var5_5.getError();
                if (var5_5 != null && (var5_5 = var5_5.getErrorMessage()) != null && (var5_5 = var5_5.getMessage()) != null) {
                    var10_10 = var5_5;
                }
                var5_5 = StringCompanionObject.INSTANCE;
                var14_15 = R$string.acc_error_message;
                var5_5 = hv3_0.K(var14_15);
                var7_7 /* !! */  = new Object[var4_4];
                var7_7 /* !! */ [0] = var10_10;
                var3_3 = "format(...)";
                ZK1.e(var7_7 /* !! */ , var4_4, (String)var5_5, (String)var3_3, (String)var10_10);
            }
        }
        var3_3 = AnalyticsManager.Companion;
        var7_7 /* !! */  = var3_3.getInstance().getNewCustomEventsRevamp();
        var21_24 = cv_0.a((AnalyticsManager$Companion)var3_3);
        var18_19 = bv_0.a((AnalyticsManager$Companion)var3_3);
        var17_18 = var6_6.Pa();
        var4_4 = var6_6.o;
        var17_18.putInt("return_fee", var4_4);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_7 /* !! */ , "", "", null, "screen_view", "return and exchange nudge bottom card", null, var18_19, (Bundle)var17_18, var21_24, false, null, 1572, null);
        return Unit.a;
    }
}

