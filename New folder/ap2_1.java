/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 */
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ap2
 */
public final class ap2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ap2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = "this$0";
        var3_3 = this.b;
        var4_4 = this.a;
        switch (var4_4) {
            default: {
                var5_5 = var1_1;
                var5_5 = (DataCallback)var1_1;
                var3_3 = (wd2_0)var3_3;
                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                hv3_0.s0(var3_3.o);
                var2_2 = cp_1.Companion;
                var6_7 = nn_2.b((cp$a)var2_2, (DataCallback)var5_5);
                if (var6_7 == 0) ** GOTO lbl220
                var6_7 = 8;
                var7_8 = 1.1E-44f;
                var8_9 = null;
                if (var5_5 == null || (var9_10 = var5_5.getStatus()) != 0) ** GOTO lbl142
                var10_11 = var3_3.b;
                if (var10_11 != null) {
                    var10_11 = var10_11.getProductRating();
                } else {
                    var9_10 = 0;
                    var10_11 = null;
                }
                var3_3.q = var10_11;
                var5_5 = (RatingsResponse)var5_5.getData();
                if (var5_5 != null && (var5_5 = var5_5.getQuestionResponse()) != null) {
                    var5_5 = var5_5.getQuestions();
                } else {
                    var4_4 = 0;
                    var5_5 = null;
                    var11_12 = 0.0f;
                }
                var3_3.s = var5_5;
                var5_5 = var3_3.v;
                if (var5_5 != null) {
                    var5_5.setVisibility(var6_7);
                }
                if ((var2_2 = var3_3.h) != null) {
                    var2_2.setVisibility(0);
                }
                if ((var2_2 = var3_3.g) != null) {
                    var2_2.setVisibility(0);
                }
                if ((var2_2 = var3_3.g) != null) {
                    var7_8 = var2_2.getX();
                    var2_2 = Float.valueOf(var7_8);
                } else {
                    var6_7 = 0;
                    var2_2 = null;
                    var7_8 = 0.0f;
                }
                var5_5 = var3_3.g;
                if (var5_5 != null) {
                    var11_12 = var5_5.getY();
                    var5_5 = Float.valueOf(var11_12);
                } else {
                    var4_4 = 0;
                    var5_5 = null;
                    var11_12 = 0.0f;
                }
                var10_11 = new rd2_0((wd2_0)var3_3);
                ai0_2.r((Function2)var10_11, var2_2, var5_5);
                var2_2 = LD2.a;
                var2_2 = var3_3.q;
                if (var2_2 != null) {
                    var7_8 = var2_2.floatValue();
                    var6_7 = (int)var7_8;
                    var2_2 = var6_7;
                } else {
                    var6_7 = 0;
                    var2_2 = null;
                    var7_8 = 0.0f;
                }
                var12_13 = String.valueOf(var2_2);
                var2_2 = var3_3.b;
                if (var2_2 != null) {
                    var2_2 = var2_2.getOrderId();
                } else {
                    var6_7 = 0;
                    var2_2 = null;
                    var7_8 = 0.0f;
                }
                var5_5 = var3_3.b;
                if (var5_5 != null) {
                    var5_5 = var5_5.getSkuId();
                } else {
                    var4_4 = 0;
                    var5_5 = null;
                    var11_12 = 0.0f;
                }
                var10_11 = var3_3.b;
                if (var10_11 != null) {
                    var10_11 = var10_11.getBrandName();
                } else {
                    var9_10 = 0;
                    var10_11 = null;
                }
                var13_14 = var3_3.b;
                var13_14 = var13_14 != null ? var13_14.getProductBrick() : null;
                Intrinsics.checkNotNullParameter(var12_13, "rating");
                var14_16 = AnalyticsManager.Companion;
                var15_17 = av_0.a((AnalyticsManager$Companion)var14_16);
                var16_18 = av_0.a((AnalyticsManager$Companion)var14_16);
                var17_19 = bv_0.a((AnalyticsManager$Companion)var14_16);
                var18_20 = LD2.a((String)var2_2, (String)var5_5, (String)var10_11, (String)var13_14);
                var19_21 = cv_0.a((AnalyticsManager$Companion)var14_16);
                var10_11 = LD2.a;
                var13_14 = "reviews & ratings interactions";
                var14_16 = "overall rating";
                var20_22 = "reviews_rating_interactions";
                var21_24 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var10_11, (String)var13_14, (String)var14_16, var12_13, var20_22, var15_17, var16_18, var17_19, var18_20, var19_21, false, null, var21_24, null);
                var2_2 = var3_3.t;
                if (var2_2 == null) ** GOTO lbl215
                var4_4 = var2_2.hashCode();
                if (var4_4 == (var9_10 = -56403349)) ** GOTO lbl128
                var9_10 = 2123274;
                if (var4_4 == var9_10) ** GOTO lbl124
                var9_10 = 1996002556;
                if (var4_4 == var9_10 && (var6_7 = (int)var2_2.equals(var5_5 = "CREATE")) != 0) {
                    var6_7 = (int)var3_3.cb();
                    if (var6_7 != 0) {
                        var2_2 = var3_3.x;
                        if (var2_2 != null) {
                            var2_2.setVisibility(0);
                        }
                        if ((var2_2 = var3_3.y) != null) {
                            var2_2.setVisibility(0);
                        }
                        if ((var2_2 = var3_3.z) != null) {
                            var2_2.setVisibility(0);
                        }
                    } else {
                        var3_3.Wa();
                    }
                }
                ** GOTO lbl215
lbl124:
                // 1 sources

                var5_5 = "EDIT";
                var6_7 = (int)var2_2.equals(var5_5);
                if (var6_7 != 0) ** GOTO lbl131
                ** GOTO lbl215
lbl128:
                // 1 sources

                var5_5 = "EXPANDED_VIEW";
                var6_7 = (int)var2_2.equals(var5_5);
                if (var6_7 == 0) ** GOTO lbl215
lbl131:
                // 2 sources

                if ((var6_7 = (int)var3_3.cb()) != 0) {
                    var3_3.ab();
                    var3_3.Ya();
                    var3_3.Wa();
                    var2_2 = var3_3.p;
                    if (var2_2 != null) {
                        var2_2.setVisibility(0);
                    }
                } else {
                    var3_3.Wa();
                }
                ** GOTO lbl215
lbl142:
                // 1 sources

                var4_4 = var5_5.getStatus();
                if (var4_4 == (var9_10 = 1)) {
                    var3_3.q = null;
                    var3_3.Q = var9_10;
                    var4_4 = R$string.rating_submitted_fail;
                    var5_5 = var3_3.getString(var4_4);
                    Intrinsics.checkNotNullExpressionValue(var5_5, "getString(...)");
                    var13_15 = new SpannableStringBuilder();
                    var22_25 = var5_5.length();
                    var13_15.append((CharSequence)var5_5);
                    var5_5 = var3_3.getContext();
                    var23_26 = 18;
                    if (var5_5 != null) {
                        var24_27 = R$color.color_red_ratings;
                        var4_4 = t70.getColor((Context)var5_5, var24_27);
                        var20_23 = new ForegroundColorSpan(var4_4);
                        var13_15.setSpan((Object)var20_23, 0, var22_25, var23_26);
                    }
                    var5_5 = new StyleSpan(var9_10);
                    var13_15.setSpan(var5_5, 0, var22_25, var23_26);
                    var13_15.append((CharSequence)"\n");
                    var4_4 = R$string.rating_submitted_msg;
                    var5_5 = var3_3.getString(var4_4);
                    var13_15.append((CharSequence)var5_5);
                    var5_5 = var3_3.getContext();
                    if (var5_5 != null) {
                        var24_27 = R$color.accent_color_10;
                        var4_4 = t70.getColor((Context)var5_5, var24_27);
                        var20_23 = new ForegroundColorSpan(var4_4);
                        var4_4 = var13_15.length();
                        var13_15.setSpan((Object)var20_23, var22_25 += var9_10, var4_4, var23_26);
                    }
                    if ((var5_5 = var3_3.n) != null) {
                        var5_5.setText((CharSequence)var13_15);
                    }
                    if ((var5_5 = var3_3.m) != null) {
                        var5_5.setVisibility(0);
                    }
                    if ((var5_5 = var3_3.n) != null) {
                        var5_5.setVisibility(0);
                    }
                    if ((var5_5 = var3_3.o) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.p) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.i) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.h) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.v) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.g) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.y) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.z) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.x) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.I) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.G) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.L) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.C) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.H) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.T) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.U) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                    if ((var5_5 = var3_3.Y) != null) {
                        var5_5.setVisibility(var6_7);
                    }
                }
lbl215:
                // 12 sources

                if ((var2_2 = var3_3.b) != null) {
                    var8_9 = var2_2.getSourcePage();
                }
                if ((var6_7 = (int)Intrinsics.areEqual(var8_9, var2_2 = "PDP")) != 0 && (var2_2 = var3_3.a) != null && (var2_2 = var2_2.a) != null) {
                    var3_3 = var3_3.q;
                    var2_2.i(var3_3);
                }
lbl220:
                // 4 sources

                return Unit.a;
            }
            case 0: 
        }
        var5_6 = var1_1;
        var5_6 = (Throwable)var1_1;
        var3_3 = (op2_2)var3_3;
        Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
        var2_2 = var3_3.g;
        var3_3 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(var5_6);
        var3_3 = var3_3.handleApiException((Throwable)var5_6, "LP_RESEND_OTP", true, "single page checkout", "Forward");
        var2_2.k(var3_3);
        return Unit.a;
    }
}

