/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.User;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Xz1
 */
public final class xz1_0
implements F62 {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ xz1_0(da1_1 da1_12) {
        this.a = da1_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        block72: {
            block73: {
                var2_2 = 1;
                var3_3 = var1_1;
                var3_3 = (DataCallback)var1_1;
                var4_4 = this.a;
                Intrinsics.checkNotNullParameter(var4_4, "this$0");
                var5_5 = cp_1.Companion;
                var6_6 = nn_2.b((cp$a)var5_5, (DataCallback)var3_3);
                if (var6_6 == 0) break block72;
                var7_7 = "Glad your're back";
                var8_8 = 32;
                var9_9 = "gaScreenName";
                if (var3_3 == null || (var10_10 = var3_3.getStatus()) != 0) break block73;
                var10_10 = (int)var4_4.y;
                var11_11 = var4_4.J;
                var12_13 = "getString(...)";
                var13_15 = "login_type";
                var14_17 = "eventBundle";
                var15_18 = "";
                if (var10_10 != 0) {
                    var7_7 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var16_20 = var4_4.l;
                    Intrinsics.checkNotNull(var16_20);
                    var16_20 = var16_20.getText().toString();
                    var17_22 = var16_20.length() - var2_2;
                    var18_24 = 0;
                    var19_26 = null;
                    var20_28 = false;
                    var21_30 = null;
                    while (var18_24 <= var17_22) {
                        var6_6 = var20_28 == false ? var18_24 : var17_22;
                        if ((var6_6 = Intrinsics.compare(var16_20.charAt(var6_6), var8_8)) <= 0) {
                            var6_6 = 1;
                        } else {
                            var6_6 = 0;
                            var5_5 = null;
                        }
                        if (!var20_28) {
                            if (var6_6 == 0) {
                                var20_28 = true;
                                continue;
                            }
                            var18_24 += var2_2;
                            continue;
                        }
                        if (var6_6 == 0) break;
                        var17_22 += -1;
                    }
                    var19_26 = com.jio.jioads.adinterfaces.a.a(var17_22, var2_2, var18_24, var16_20);
                    var5_5 = var4_4.F;
                    if (var5_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                        var6_6 = 0;
                        var5_5 = null;
                    }
                    var16_20 = "Continue - Success";
                    var7_7.pushButtonTapEvent((String)var19_26, var16_20, (String)var5_5);
                    var19_26 = new Bundle();
                    var5_5 = var11_11.getLOGIN_SIGNUP_SRC();
                    var7_7 = var4_4.u;
                    var19_26.putString((String)var5_5, (String)var7_7);
                    var5_5 = var11_11.getEC_USER_ACCOUNTS();
                    var7_7 = var4_4.E;
                    if (var7_7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                        var22_32 = 0;
                        var7_7 = null;
                    }
                    var7_7 = var7_7.getString(var13_15, (String)var15_18);
                    Intrinsics.checkNotNullExpressionValue(var7_7, (String)var12_13);
                    var16_20 = var4_4.F;
                    if (var16_20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                        var20_28 = false;
                        var21_30 = null;
                    } else {
                        var21_30 = var16_20;
                    }
                    var23_34 = false;
                    var24_36 /* !! */  = var4_4.K;
                    var25_38 = var4_4.L;
                    var26_40 = 1536;
                    var27_42 = var24_36 /* !! */ ;
                    var24_36 /* !! */  = var11_11;
                    var28_44 = var15_18;
                    var15_18 = var5_5;
                    var5_5 = var13_15;
                    var13_15 = "login - success";
                    var16_20 = var12_13;
                    var12_13 = var7_7;
                    var29_46 = var11_11;
                    var11_11 = "login_success";
                    var30_47 = "user account screen";
                    var31_49 = var27_42;
                    var27_42 = var19_26;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var24_36 /* !! */ , (String)var15_18, var13_15, (String)var7_7, (String)var11_11, var21_30, var30_47, (String)var31_49, (Bundle)var19_26, (String)var25_38, false, null, var26_40, null);
                } else {
                    var28_44 = var15_18;
                    var5_5 = var13_15;
                    var16_20 = var12_13;
                    var29_46 = var11_11;
                    var19_26 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var25_38 = var4_4.F;
                    if (var25_38 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                        var32_51 = 0;
                        var25_38 = null;
                    }
                    var24_36 /* !! */  = "Start shopping - Success";
                    var19_26.pushButtonTapEvent((String)var7_7, var24_36 /* !! */ , (String)var25_38);
                    var19_26 = new Bundle();
                    var25_38 = var29_46.getLOGIN_SIGNUP_SRC();
                    var7_7 = var4_4.u;
                    var19_26.putString((String)var25_38, (String)var7_7);
                    var15_18 = var29_46.getEC_USER_ACCOUNTS();
                    var25_38 = var4_4.E;
                    if (var25_38 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                        var32_51 = 0;
                        var25_38 = null;
                    }
                    var12_13 = var25_38.getString((String)var5_5, var28_44);
                    Intrinsics.checkNotNullExpressionValue(var12_13, var16_20);
                    var25_38 = var4_4.F;
                    if (var25_38 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                        var20_28 = false;
                        var21_30 = null;
                    } else {
                        var21_30 = var25_38;
                    }
                    var23_34 = false;
                    var13_15 = "register - success";
                    var11_11 = "register_success";
                    var30_47 = "user account screen";
                    var25_38 = var4_4.K;
                    var7_7 = var4_4.L;
                    var26_40 = 1536;
                    var24_36 /* !! */  = var29_46;
                    var31_49 = var25_38;
                    var27_42 = var19_26;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var29_46, (String)var15_18, var13_15, (String)var12_13, (String)var11_11, var21_30, var30_47, (String)var25_38, (Bundle)var19_26, (String)var7_7, false, null, var26_40, null);
                }
                var19_26 = new HashMap();
                var25_38 = AnalyticsManager.Companion.getInstance().getCt();
                var7_7 = new AnalyticsData$Builder();
                var19_26 = var7_7.eventMap((HashMap)var19_26).build();
                var25_38.loginComplete((AnalyticsData)var19_26);
                var19_26 = var4_4.A;
                Intrinsics.checkNotNull(var19_26);
                var32_51 = var4_4.y;
                var22_32 = var4_4.v;
                var24_36 /* !! */  = var4_4.u;
                var19_26.f0((String)var24_36 /* !! */ , (boolean)var32_51, (boolean)var22_32);
                var19_26 = var4_4.Ra();
                var32_51 = var4_4.z;
                var7_7 = "IS_INPUT_MOBILENUMBER";
                var19_26.putPreference((String)var7_7, (boolean)var32_51);
                var18_24 = (int)var4_4.z;
                if (var18_24 != 0) {
                    var19_26 = var4_4.Ra();
                    var25_38 = var4_4.t;
                    if (var25_38 != null) {
                        var7_7 = "INPUT_MOBILE_NUMBER";
                        var19_26.putPreference((String)var7_7, (String)var25_38);
                    } else {
                        var19_26.getClass();
                    }
                } else {
                    var19_26 = var4_4.Ra();
                    var25_38 = var4_4.t;
                    if (var25_38 != null) {
                        var7_7 = "INPUT_EMAIL_ID";
                        var19_26.putPreference((String)var7_7, (String)var25_38);
                    } else {
                        var19_26.getClass();
                    }
                }
                var19_26 = var3_3.getData();
                if (var19_26 == null) break block72;
                var19_26 = bv1_0.f;
                if (var19_26 == null || (var18_24 = var19_26.length()) == 0) {
                    bv1_0.f = var19_26 = "OTP";
                }
                var24_36 /* !! */  = var4_4.A;
                Intrinsics.checkNotNull(var24_36 /* !! */ );
                var19_26 = var3_3.getData();
                Intrinsics.checkNotNull(var19_26);
                var15_18 = var19_26;
                var15_18 = (User)var19_26;
                var19_26 = var4_4.p;
                Intrinsics.checkNotNull(var19_26);
                var33_53 = var19_26.A;
                var19_26 = var4_4.f;
                Intrinsics.checkNotNull(var19_26);
                var19_26 = var19_26.getText();
                if (var19_26 == null || (var19_26 = var19_26.toString()) == null) ** GOTO lbl-1000
                var32_51 = var19_26.length() - var2_2;
                var34_55 = 0;
                var3_3 = null;
                var22_32 = 0;
                var7_7 = null;
                while (var34_55 <= var32_51) {
                    var35_56 = var22_32 == 0 ? var34_55 : var32_51;
                    var35_56 = var19_26.charAt(var35_56);
                    var36_58 = 32;
                    if ((var35_56 = Intrinsics.compare(var35_56, var36_58)) <= 0) {
                        var35_56 = 1;
                    } else {
                        var35_56 = 0;
                        var12_13 = null;
                    }
                    if (var22_32 == 0) {
                        if (var35_56 == 0) {
                            var22_32 = 1;
                            continue;
                        }
                        var34_55 += var2_2;
                        continue;
                    }
                    if (var35_56 == 0) break;
                    var32_51 += -1;
                }
                if ((var19_26 = com.jio.jioads.adinterfaces.a.a(var32_51, var2_2, var34_55, (String)var19_26)) != null) {
                    var12_13 = var19_26;
                } else lbl-1000:
                // 2 sources

                {
                    var12_13 = var28_44;
                }
                var36_58 = 0;
                var11_11 = null;
                var21_30 = "";
                var18_24 = (int)var24_36 /* !! */ .Q0((User)var15_18, var33_53, (String)var12_13, false, var21_30);
                var25_38 = "format(...)";
                if (var18_24 == 0) {
                    var19_26 = var4_4.A;
                    if (var19_26 != null) {
                        var19_26.stopLoader();
                        var19_26 = Unit.a;
                    }
                    var19_26 = StringCompanionObject.INSTANCE;
                    var18_24 = R$string.acc_error_message;
                    var19_26 = hv3_0.K(var18_24);
                    var34_55 = R$string.cannot_login;
                    var3_3 = hv3_0.K(var34_55);
                    var4_4 = new Object[var2_2];
                    var22_32 = 0;
                    var7_7 = null;
                    var4_4[0] = var3_3;
                    var19_26 = xh2_0.a(var4_4, var2_2, (String)var19_26, (String)var25_38);
                    var32_51 = R$string.cannot_login;
                    var25_38 = hv3_0.K(var32_51);
                    hv3_0.o0(0, (String)var25_38, (String)var19_26);
                } else {
                    var22_32 = 0;
                    var7_7 = null;
                    var19_26 = var4_4.o;
                    if (var19_26 != null) {
                        var19_26 = var19_26.getFirstName();
                    } else {
                        var18_24 = 0;
                        var19_26 = null;
                    }
                    if (var19_26 == null) {
                        var18_24 = R$string.registration_success_noname;
                        var19_26 = hv3_0.K(var18_24);
                        hv3_0.o0(0, (String)var19_26, null);
                        var32_51 = 0;
                        var25_38 = null;
                    } else {
                        var19_26 = StringCompanionObject.INSTANCE;
                        var18_24 = R$string.registration_success;
                        var19_26 = hv3_0.K(var18_24);
                        var3_3 = var4_4.o;
                        if (var3_3 != null) {
                            var3_3 = var3_3.getFirstName();
                        } else {
                            var34_55 = 0;
                            var3_3 = null;
                        }
                        var3_3 = mz3_0.P((String)var3_3);
                        var22_32 = 2;
                        var24_36 /* !! */  = new Object[var22_32];
                        var37_60 = false;
                        var15_18 = null;
                        var24_36 /* !! */ [0] = var3_3;
                        var24_36 /* !! */ [var2_2] = var28_44;
                        var19_26 = xh2_0.a(var24_36 /* !! */ , var22_32, (String)var19_26, (String)var25_38);
                        var32_51 = 0;
                        var25_38 = null;
                        hv3_0.o0(0, (String)var19_26, null);
                    }
                    var19_26 = new Bundle();
                    var38_62 = var29_46.getLOGIN_SIGNUP_SRC();
                    var3_3 = var4_4.u;
                    var19_26.putString(var38_62, (String)var3_3);
                    var15_18 = var29_46.getEC_USER_ACCOUNTS();
                    var38_62 = var4_4.E;
                    if (var38_62 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                        var2_2 = 0;
                        var38_62 = null;
                    }
                    var12_13 = var38_62.getString((String)var5_5, var28_44);
                    Intrinsics.checkNotNullExpressionValue(var12_13, var16_20);
                    var38_62 = var4_4.F;
                    if (var38_62 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                        var20_28 = false;
                        var21_30 = null;
                    } else {
                        var21_30 = var38_62;
                    }
                    var23_34 = false;
                    var13_15 = "login - success";
                    var11_11 = "login_success";
                    var30_47 = "user account screen";
                    var25_38 = var4_4.K;
                    var38_62 = var4_4.L;
                    var26_40 = 1536;
                    var24_36 /* !! */  = var29_46;
                    var31_49 = var25_38;
                    var27_42 = var19_26;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var29_46, (String)var15_18, var13_15, (String)var12_13, (String)var11_11, var21_30, var30_47, (String)var25_38, (Bundle)var19_26, var38_62, false, null, var26_40, null);
                }
                break block72;
            }
            var32_52 = 0;
            var25_39 = null;
            var18_25 = var3_3.getStatus();
            if (var18_25 == var2_2) {
                var19_27 = var4_4.A;
                if (var19_27 != null) {
                    var19_27.stopLoader();
                    var19_27 = Unit.a;
                }
                if ((var18_25 = (int)var4_4.y) != 0) {
                    var19_27 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var5_5 = var4_4.l;
                    Intrinsics.checkNotNull(var5_5);
                    var5_5 = var5_5.getText().toString();
                    var8_8 = var5_5.length() - var2_2;
                    var10_10 = 0;
                    var16_21 = null;
                    var17_23 = false;
                    var24_37 = null;
                    while (var10_10 <= var8_8) {
                        var37_61 = var17_23 == false ? var10_10 : var8_8;
                        var37_61 = var5_5.charAt(var37_61);
                        var33_54 = 32;
                        if ((var37_61 = Intrinsics.compare(var37_61, var33_54)) <= 0) {
                            var37_61 = 1;
                        } else {
                            var37_61 = 0;
                            var15_19 = null;
                        }
                        if (!var17_23) {
                            if (var37_61 == 0) {
                                var17_23 = true;
                                continue;
                            }
                            var10_10 += var2_2;
                            continue;
                        }
                        if (var37_61 == 0) break;
                        var8_8 += -1;
                    }
                    var5_5 = com.jio.jioads.adinterfaces.a.a(var8_8, var2_2, var10_10, (String)var5_5);
                    var28_45 = var4_4.F;
                    if (var28_45 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                        var8_8 = 0;
                        var28_45 = null;
                    }
                    var16_21 = "Continue - Failure";
                    var19_27.pushButtonTapEvent((String)var5_5, var16_21, (String)var28_45);
                } else {
                    var19_27 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var5_5 = var4_4.F;
                    if (var5_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                        var6_6 = 0;
                        var5_5 = null;
                    }
                    var28_45 = "Start shopping - Failure";
                    var19_27.pushButtonTapEvent((String)var7_7, var28_45, (String)var5_5);
                }
                var4_4.Ua();
                var19_27 = var3_3.getError();
                if (var19_27 != null) {
                    var19_27 = var19_27.getErrors();
                } else {
                    var18_25 = 0;
                    var19_27 = null;
                }
                if (var19_27 != null) {
                    var19_27 = var3_3.getError();
                    Intrinsics.checkNotNull(var19_27);
                    var19_27 = var19_27.getErrors();
                    var18_25 = var19_27.size();
                    if (var18_25 > 0) {
                        var19_27 = var4_4.k;
                        Intrinsics.checkNotNull(var19_27);
                        var6_6 = 0;
                        var19_27.setVisibility(0);
                        var19_27 = var4_4.k;
                        Intrinsics.checkNotNull(var19_27);
                        var28_45 = var3_3.getError();
                        Intrinsics.checkNotNull(var28_45);
                        var5_5 = ((DataError$ErrorMessage)var28_45.getErrors().get(0)).getMessage();
                        var19_27.setText((CharSequence)var5_5);
                        var18_25 = (int)var4_4.y;
                        var5_5 = var4_4.J;
                        var28_45 = "error - ";
                        var16_21 = "error_status_code";
                        var24_37 = "Error - ";
                        if (var18_25 != 0) {
                            var19_27 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            var7_7 = var4_4.l;
                            Intrinsics.checkNotNull(var7_7);
                            var7_7 = var7_7.getText().toString();
                            var37_61 = var7_7.length() - var2_2;
                            var33_54 = 0;
                            var13_16 = null;
                            var35_57 = false;
                            var12_14 = null;
                            block3: while (var33_54 <= var37_61) {
                                var36_59 = var35_57 == false ? var33_54 : var37_61;
                                var36_59 = var7_7.charAt(var36_59);
                                var32_52 = 32;
                                if ((var36_59 = Intrinsics.compare(var36_59, var32_52)) <= 0) {
                                    var36_59 = 1;
                                } else {
                                    var36_59 = 0;
                                    var11_12 = null;
                                }
                                if (!var35_57) {
                                    if (var36_59 == 0) {
                                        var32_52 = 0;
                                        var25_39 = null;
                                        var35_57 = true;
                                        continue;
                                    }
                                    var33_54 += var2_2;
lbl410:
                                    // 2 sources

                                    while (true) {
                                        var32_52 = 0;
                                        var25_39 = null;
                                        continue block3;
                                        break;
                                    }
                                }
                                if (var36_59 == 0) break;
                                var37_61 += -1;
                                ** continue;
                            }
                            var25_39 = com.jio.jioads.adinterfaces.a.a(var37_61, var2_2, var33_54, (String)var7_7);
                            var38_63 = var3_3.getError();
                            Intrinsics.checkNotNull(var38_63);
                            var38_63 = var38_63.getErrors();
                            var22_33 = false;
                            var38_63 = ((DataError$ErrorMessage)var38_63.get(0)).getMessage();
                            var38_63 = kp1_0.c(var24_37, (String)var38_63);
                            var7_7 = var4_4.F;
                            if (var7_7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                var22_33 = false;
                                var7_7 = null;
                            }
                            var19_27.pushButtonTapEvent((String)var25_39, var38_63, (String)var7_7);
                            var19_27 = new Bundle();
                            var25_39 = var3_3.getError();
                            Intrinsics.checkNotNull(var25_39);
                            var25_39 = var25_39.getErrors();
                            var2_2 = 0;
                            var38_63 = null;
                            var25_39 = ((DataError$ErrorMessage)var25_39.get(0)).getCode();
                            var19_27.putString((String)var16_21, (String)var25_39);
                            var24_37 = var5_5.getEC_ERRORS();
                            var15_19 = var5_5.getEA_BUSINESS_ERROR();
                            var25_39 = var3_3.getError();
                            Intrinsics.checkNotNull(var25_39);
                            var25_39 = ((DataError$ErrorMessage)var25_39.getErrors().get(0)).getMessage();
                            var13_16 = kp1_0.c((String)var28_45, (String)var25_39);
                            var25_39 = var4_4.F;
                            if (var25_39 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                var36_59 = 0;
                                var11_12 = null;
                            } else {
                                var11_12 = var25_39;
                            }
                            var12_14 = "business_error";
                            var21_31 = "user account screen";
                            var25_39 = var4_4.K;
                            var38_63 = var4_4.L;
                            var23_35 = 1536;
                            var26_41 = false;
                            var16_21 = var5_5;
                            var30_48 = var25_39;
                            var31_50 = var19_27;
                            var27_43 = var38_63;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var5_5, var24_37, var15_19, var13_16, (String)var12_14, (String)var11_12, var21_31, (String)var25_39, (Bundle)var19_27, (String)var38_63, false, null, var23_35, null);
                        } else {
                            var19_27 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            var25_39 = var3_3.getError();
                            Intrinsics.checkNotNull(var25_39);
                            var25_39 = var25_39.getErrors();
                            var2_2 = 0;
                            var25_39 = ((DataError$ErrorMessage)var25_39.get(0)).getMessage();
                            var25_39 = kp1_0.c(var24_37, (String)var25_39);
                            var38_64 = var4_4.F;
                            if (var38_64 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                var2_2 = 0;
                                var38_64 = null;
                            }
                            var19_27.pushButtonTapEvent((String)var7_7, var25_39, var38_64);
                            var19_27 = new Bundle();
                            var25_39 = var3_3.getError();
                            Intrinsics.checkNotNull(var25_39);
                            var25_39 = var25_39.getErrors();
                            var2_2 = 0;
                            var38_64 = null;
                            var25_39 = ((DataError$ErrorMessage)var25_39.get(0)).getCode();
                            var19_27.putString((String)var16_21, (String)var25_39);
                            var24_37 = var5_5.getEC_ERRORS();
                            var15_19 = var5_5.getEA_BUSINESS_ERROR();
                            var25_39 = var3_3.getError();
                            Intrinsics.checkNotNull(var25_39);
                            var25_39 = ((DataError$ErrorMessage)var25_39.getErrors().get(0)).getMessage();
                            var13_16 = kp1_0.c((String)var28_45, (String)var25_39);
                            var25_39 = var4_4.F;
                            if (var25_39 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                var36_59 = 0;
                                var11_12 = null;
                            } else {
                                var11_12 = var25_39;
                            }
                            var12_14 = "business_error";
                            var21_31 = "user account screen";
                            var25_39 = var4_4.K;
                            var38_64 = var4_4.L;
                            var23_35 = 1536;
                            var26_41 = false;
                            var16_21 = var5_5;
                            var30_48 = var25_39;
                            var31_50 = var19_27;
                            var27_43 = var38_64;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var5_5, var24_37, var15_19, var13_16, (String)var12_14, (String)var11_12, var21_31, (String)var25_39, (Bundle)var19_27, var38_64, false, null, var23_35, null);
                        }
                        var16_21 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var19_27 = var3_3.getError();
                        Intrinsics.checkNotNull(var19_27);
                        var19_27 = var19_27.getErrors();
                        var32_52 = 0;
                        var25_39 = null;
                        var13_16 = ((DataError$ErrorMessage)var19_27.get(0)).getMessage();
                        var19_27 = var4_4.F;
                        if (var19_27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                            var35_57 = false;
                            var12_14 = null;
                        } else {
                            var12_14 = var19_27;
                        }
                        var20_29 = false;
                        var36_59 = 0;
                        GTMEvents.gtmEventsToGa$default((GTMEvents)var16_21, "formErrorEvent", "Login Form", var13_16, (String)var12_14, null, null, null, 112, null);
                        var24_37 = var5_5.getEC_FORM();
                        var19_27 = var3_3.getError();
                        Intrinsics.checkNotNull(var19_27);
                        var19_27 = var19_27.getErrors();
                        var32_52 = 0;
                        var19_27 = ((DataError$ErrorMessage)var19_27.get(0)).getMessage();
                        var13_16 = kp1_0.c("Login Form - ", (String)var19_27);
                        var15_19 = "error";
                        var12_14 = "form_error";
                        var11_12 = "signup screen";
                        var21_31 = "user account screen";
                        var19_27 = var4_4.K;
                        var31_50 = null;
                        var25_39 = var4_4.L;
                        var23_35 = 1536;
                        var26_41 = false;
                        var16_21 = var5_5;
                        var30_48 = var19_27;
                        var27_43 = var25_39;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var5_5, var24_37, var15_19, var13_16, (String)var12_14, (String)var11_12, var21_31, (String)var19_27, null, (String)var25_39, false, null, var23_35, null);
                    }
                }
            }
        }
    }
}

