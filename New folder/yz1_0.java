/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
import android.os.Bundle;
import android.view.View;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.OTPData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from Yz1
 */
public final class yz1_0
implements F62 {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ yz1_0(da1_1 da1_12) {
        this.a = da1_12;
    }

    /*
     * Unable to fully structure code
     */
    public final void onChanged(Object var1_1) {
        block51: {
            block52: {
                block53: {
                    var2_2 = null;
                    var3_3 = 1;
                    var4_4 = var1_1;
                    var4_4 = (DataCallback)var1_1;
                    var5_5 = this.a;
                    Intrinsics.checkNotNullParameter(var5_5, "this$0");
                    var6_6 = cp_1.Companion;
                    var7_7 = nn_2.b((cp$a)var6_6, (DataCallback)var4_4);
                    if (!var7_7) break block51;
                    var6_6 = var5_5.A;
                    if (var6_6 != null) {
                        var6_6.stopLoader();
                    }
                    var6_6 = "Glad your're back";
                    var8_8 = "Start shopping - Failure";
                    var9_9 = 32;
                    var10_10 = "gaScreenName";
                    var11_11 = 0;
                    var12_12 = null;
                    if (var4_4 == null || (var13_13 = var4_4.getStatus()) != 0) break block52;
                    if ((var4_4 = (OTPData)var4_4.getData()) != null) {
                        var14_14 = var4_4.getMessage();
                    } else {
                        var13_13 = 0;
                        var14_14 = null;
                    }
                    if (var14_14 == null) break block53;
                    var14_14 = var4_4.getMessage();
                    var15_16 = "getMessage(...)";
                    Intrinsics.checkNotNullExpressionValue(var14_14, (String)var15_16);
                    var13_13 = var14_14.length();
                    if (var13_13 == 0) break block53;
                    var14_14 = var5_5.k;
                    Intrinsics.checkNotNull(var14_14);
                    var4_4 = var4_4.getMessage();
                    Intrinsics.checkNotNullExpressionValue(var4_4, (String)var15_16);
                    var14_14.setVisibility(0);
                    ai0_2.a((View)var14_14);
                    var14_14.setText(var4_4);
                    var5_5.Ua();
                    var16_17 = var5_5.y;
                    if (var16_17) {
                        var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var6_6 = var5_5.l;
                        Intrinsics.checkNotNull(var6_6);
                        var6_6 = var6_6.getText().toString();
                        var13_13 = var6_6.length() - var3_3;
                        var17_19 = 0;
                        var15_16 = null;
                        var18_22 = false;
                        var19_25 = null;
                        while (var17_19 <= var13_13) {
                            var20_28 = var18_22 == false ? var17_19 : var13_13;
                            if ((var20_28 = Intrinsics.compare(var6_6.charAt(var20_28), var9_9)) <= 0) {
                                var20_28 = 1;
                            } else {
                                var20_28 = 0;
                                var21_31 = null;
                            }
                            if (!var18_22) {
                                if (var20_28 == 0) {
                                    var18_22 = true;
                                    continue;
                                }
                                var17_19 += var3_3;
                                continue;
                            }
                            if (var20_28 == 0) break;
                            var13_13 += -1;
                        }
                        var2_2 = com.jio.jioads.adinterfaces.a.a(var13_13, var3_3, var17_19, (String)var6_6);
                        var22_34 = var5_5.F;
                        if (var22_34 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        } else {
                            var12_12 = var22_34;
                        }
                        var4_4.pushButtonTapEvent((String)var2_2, var8_8, (String)var12_12);
                    } else {
                        var2_2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var22_35 = var5_5.F;
                        if (var22_35 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        } else {
                            var12_12 = var22_35;
                        }
                        var2_2.pushButtonTapEvent((String)var6_6, var8_8, (String)var12_12);
                    }
                    break block51;
                }
                var16_18 = var5_5.y;
                var8_8 = "";
                var14_14 = "Start shopping - Success";
                if (var16_18) {
                    var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var6_6 = var5_5.l;
                    Intrinsics.checkNotNull(var6_6);
                    var6_6 = var6_6.getText().toString();
                    var17_20 = var6_6.length() - var3_3;
                    var18_23 = 0;
                    var19_26 = null;
                    var20_29 = false;
                    var21_32 = null;
                    while (var18_23 <= var17_20) {
                        var23_36 = var20_29 == false ? var18_23 : var17_20;
                        if ((var23_36 = Intrinsics.compare(var6_6.charAt(var23_36), var9_9)) <= 0) {
                            var23_36 = 1;
                        } else {
                            var23_36 = 0;
                            var24_38 = null;
                        }
                        if (!var20_29) {
                            if (var23_36 == 0) {
                                var20_29 = true;
                                continue;
                            }
                            var18_23 += var3_3;
                            continue;
                        }
                        if (var23_36 == 0) break;
                        var17_20 += -1;
                    }
                    var6_6 = com.jio.jioads.adinterfaces.a.a(var17_20, var3_3, var18_23, (String)var6_6);
                    var15_16 = var5_5.F;
                    if (var15_16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var17_20 = 0;
                        var15_16 = null;
                    }
                    var4_4.pushButtonTapEvent((String)var6_6, var14_14, (String)var15_16);
                } else {
                    var4_4 = AnalyticsManager.Companion;
                    var15_16 = var4_4.getInstance().getGtmEvents();
                    var19_26 = var5_5.F;
                    if (var19_26 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var18_23 = 0;
                        var19_26 = null;
                    }
                    var15_16.pushButtonTapEvent((String)var6_6, var14_14, var19_26);
                    var7_7 = var5_5.x;
                    var6_6 = var7_7 != false ? "Manual" : "Social";
                    var4_4.getInstance().getFb().completeRegistrationEvent((String)var6_6);
                    var4_4 = new Bundle();
                    var14_14 = var5_5.J;
                    var6_6 = var14_14.getLOGIN_SIGNUP_SRC();
                    var15_16 = var5_5.u;
                    var4_4.putString((String)var6_6, (String)var15_16);
                    var15_16 = var14_14.getEC_USER_ACCOUNTS();
                    var6_6 = var5_5.E;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventBundle");
                        var7_7 = false;
                        var6_6 = null;
                    }
                    var19_26 = "login_type";
                    var21_32 = var6_6.getString(var19_26, (String)var8_8);
                    Intrinsics.checkNotNullExpressionValue(var21_32, "getString(...)");
                    var6_6 = var5_5.F;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var25_40 = null;
                    } else {
                        var25_40 = var6_6;
                    }
                    var19_26 = "register - success";
                    var24_38 = "register_success";
                    var26_41 = "user account screen";
                    var6_6 = var5_5.K;
                    var10_10 = var5_5.L;
                    var27_42 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var14_14, (String)var15_16, var19_26, var21_32, var24_38, (String)var25_40, var26_41, (String)var6_6, (Bundle)var4_4, var10_10, false, null, var27_42, null);
                }
                var16_18 = var5_5.x;
                var4_4 = var16_18 != false ? "OTP" : ((var16_18 = b.i((String)(var4_4 = var5_5.u), (String)(var6_6 = "SIGIN_SOURCE_FACEBOOK"), (boolean)var3_3)) != false ? "Social media - fb" : ((var16_18 = b.i((String)(var4_4 = var5_5.u), (String)(var6_6 = "SIGIN_SOURCE_GOOGLE"), (boolean)var3_3)) != false ? "Social media - google" : "Social media"));
                var6_6 = var5_5.A;
                if (var6_6 != null) {
                    var28_43 = var5_5.y;
                    var6_6.H0((String)var4_4, var28_43);
                }
                var6_6 = var5_5.s;
                var4_4 = var5_5.o;
                if (var4_4 != null) {
                    var4_4 = var4_4.getLogin();
                } else {
                    var16_18 = false;
                    var4_4 = null;
                }
                var10_10 = var5_5.f;
                Intrinsics.checkNotNull(var10_10);
                var10_10 = var10_10.getText();
                if (var10_10 == null || (var10_10 = var10_10.toString()) == null) ** GOTO lbl-1000
                var11_11 = var10_10.length() - var3_3;
                var13_13 = 0;
                var14_14 = null;
                var17_20 = 0;
                var15_16 = null;
                while (var13_13 <= var11_11) {
                    var18_23 = var17_20 == 0 ? var13_13 : var11_11;
                    if ((var18_23 = Intrinsics.compare(var10_10.charAt(var18_23), var9_9)) <= 0) {
                        var18_23 = 1;
                    } else {
                        var18_23 = 0;
                        var19_26 = null;
                    }
                    if (var17_20 == 0) {
                        if (var18_23 == 0) {
                            var17_20 = 1;
                            continue;
                        }
                        var13_13 += var3_3;
                        continue;
                    }
                    if (var18_23 == 0) break;
                    var11_11 += -1;
                }
                if ((var2_2 = com.jio.jioads.adinterfaces.a.a(var11_11, var3_3, var13_13, var10_10)) != null) {
                    var29_44 = var2_2;
                } else lbl-1000:
                // 2 sources

                {
                    var29_44 = var8_8;
                }
                var11_11 = var5_5.w;
                var13_13 = 1;
                var28_43 = false;
                var10_10 = null;
                var8_8 = var4_4;
                var5_5.Ta((String)var6_6, (String)var4_4, (String)var29_44, false, (boolean)var11_11, (boolean)var13_13);
                break block51;
            }
            var13_13 = var4_4.getStatus();
            if (var13_13 == var3_3) {
                var4_4 = var4_4.getError();
                var13_13 = (int)var5_5.y;
                if (var13_13 != 0) {
                    var6_6 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var14_15 = var5_5.l;
                    Intrinsics.checkNotNull(var14_15);
                    var14_15 = var14_15.getText().toString();
                    var17_21 = var14_15.length() - var3_3;
                    var18_24 = 0;
                    var19_27 = null;
                    var20_30 = false;
                    var21_33 = null;
                    while (var18_24 <= var17_21) {
                        var23_37 = var20_30 == false ? var18_24 : var17_21;
                        if ((var23_37 = Intrinsics.compare(var14_15.charAt(var23_37), var9_9)) <= 0) {
                            var23_37 = 1;
                        } else {
                            var23_37 = 0;
                            var24_39 = null;
                        }
                        if (!var20_30) {
                            if (var23_37 == 0) {
                                var20_30 = true;
                                continue;
                            }
                            var18_24 += var3_3;
                            continue;
                        }
                        if (var23_37 == 0) break;
                        var17_21 += -1;
                    }
                    var29_45 = com.jio.jioads.adinterfaces.a.a(var17_21, var3_3, var18_24, (String)var14_15);
                    var14_15 = var5_5.F;
                    if (var14_15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var13_13 = 0;
                        var14_15 = null;
                    }
                    var6_6.pushButtonTapEvent((String)var29_45, var8_8, (String)var14_15);
                } else {
                    var29_45 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var14_15 = var5_5.F;
                    if (var14_15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var13_13 = 0;
                        var14_15 = null;
                    }
                    var29_45.pushButtonTapEvent((String)var6_6, var8_8, (String)var14_15);
                }
                var5_5.Ua();
                if (var4_4 != null) {
                    var12_12 = var4_4.getErrors();
                }
                if (var12_12 != null) {
                    var4_4 = var4_4.getErrors().iterator();
                    while (var7_7 = var4_4.hasNext()) {
                        var6_6 = (DataError$ErrorMessage)var4_4.next();
                        var8_8 = var6_6.getSubject();
                        if (var8_8 != null) {
                            var8_8 = var6_6.getSubject();
                            var29_45 = "getSubject(...)";
                            Intrinsics.checkNotNullExpressionValue(var8_8, (String)var29_45);
                            var30_46 = var8_8.length();
                            if (var30_46 != 0) {
                                var7_7 = b.i((String)(var6_6 = var6_6.getSubject()), (String)(var8_8 = "mobileNumber"), (boolean)var3_3);
                                if (!var7_7) continue;
                                var5_5.Qa();
                                continue;
                            }
                        }
                        var6_6 = var6_6.getMessage();
                        var6_6 = kp1_0.c("Error has occurred for registering customer, ", (String)var6_6);
                        var8_8 = StringCompanionObject.INSTANCE;
                        var30_46 = R$string.acc_error_message;
                        var8_8 = hv3_0.K(var30_46);
                        var29_45 = new Object[var3_3];
                        var29_45[0] = var6_6;
                        var10_10 = "format(...)";
                        var8_8 = xh2_0.a(var29_45, var3_3, (String)var8_8, var10_10);
                        hv3_0.o0(0, (String)var6_6, (String)var8_8);
                    }
                }
            }
        }
    }
}

