/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.OTPData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from Gz1
 */
public final class gz1_2
implements F62 {
    public final /* synthetic */ lz1_2 a;

    public /* synthetic */ gz1_2(lz1_2 lz1_22) {
        this.a = lz1_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        block28: {
            block29: {
                var2_2 = 1;
                var3_3 = false;
                var4_4 = null;
                var5_5 /* !! */  = var1_1;
                var5_5 /* !! */  = (DataCallback)var1_1;
                var6_6 = this;
                var7_7 = this.a;
                Intrinsics.checkNotNullParameter(var7_7, "this$0");
                var8_8 = var7_7.i;
                if (var8_8 != null) {
                    var8_8.stopLoader();
                }
                if (!(var9_9 = nn_2.b((cp$a)(var8_8 = cp_1.Companion), (DataCallback)var5_5 /* !! */ ))) break block28;
                var9_9 = false;
                var8_8 = null;
                var10_10 = var7_7.K;
                var11_11 = "referralCodeETV";
                var12_12 = "Send OTP - Failure";
                var13_13 /* !! */  = "getMessage(...)";
                var14_14 = "Error - ";
                var15_15 = "signup screen";
                var16_16 /* !! */  = "Welcome to Ajio";
                if (var5_5 /* !! */  == null || (var17_17 = var5_5 /* !! */ .getStatus()) != 0) break block29;
                if ((var5_5 /* !! */  = (OTPData)var5_5 /* !! */ .getData()) != null) {
                    var18_18 = var5_5 /* !! */ .getMessage();
                } else {
                    var17_17 = 0;
                    var18_18 = null;
                }
                if (var18_18 == null) ** GOTO lbl-1000
                var18_18 = var5_5 /* !! */ .getMessage();
                Intrinsics.checkNotNullExpressionValue(var18_18, (String)var13_13 /* !! */ );
                var17_17 = var18_18.length();
                if (var17_17 != 0) {
                    var19_20 = var5_5 /* !! */ .getMessage();
                    Intrinsics.checkNotNullExpressionValue(var19_20, (String)var13_13 /* !! */ );
                    hv3_0.o0(0, (String)var19_20, null);
                    var19_20 = AnalyticsManager.Companion;
                    var19_20.getInstance().getGtmEvents().pushButtonTapEvent((String)var16_16 /* !! */ , var12_12, (String)var15_15);
                    var19_20 = var19_20.getInstance().getGtmEvents();
                    var4_4 = var5_5 /* !! */ .getMessage();
                    cP.b((String)var14_14, (String)var4_4, (GTMEvents)var19_20, (String)var16_16 /* !! */ , (String)var15_15);
                    var18_18 = var10_10.getEC_ERRORS();
                    var20_24 = var10_10.getEA_BUSINESS_ERROR();
                    var19_20 = var5_5 /* !! */ .getMessage();
                    var4_4 = "Send OTP - Failure ";
                    var21_26 = kp1_0.c((String)var4_4, (String)var19_20);
                    var22_29 = "business_error";
                    var16_16 /* !! */  = "signup screen";
                    var15_15 = "user account screen";
                    var14_14 = var7_7.L;
                    var13_13 /* !! */  = null;
                    var19_20 = var7_7.M;
                    var23_31 = 1536;
                    var12_12 = var10_10;
                    var10_10 = var19_20;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, var18_18, var20_24, var21_26, var22_29, (String)var16_16 /* !! */ , (String)var15_15, (String)var14_14, null, (String)var19_20, false, null, var23_31, null);
                } else lbl-1000:
                // 2 sources

                {
                    var5_5 /* !! */  = AnalyticsManager.Companion;
                    var12_12 = "Send OTP - Success";
                    tj2_0.e((AnalyticsManager$Companion)var5_5 /* !! */ , (String)var16_16 /* !! */ , (String)var12_12, (String)var15_15);
                    var5_5 /* !! */  = var7_7.F;
                    if (var5_5 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                        var5_5 /* !! */  = null;
                    }
                    if ((var5_5 /* !! */  = var5_5 /* !! */ .getText()) != null) {
                        var8_8 = var5_5 /* !! */ .toString();
                    }
                    bv1_0.a = var8_8;
                    var5_5 /* !! */  = new Bundle();
                    var5_5 /* !! */ .putBoolean("ISFROMSOCIALLOGIN", false);
                    var8_8 = "ISMANUALSIGNUP";
                    var5_5 /* !! */ .putBoolean((String)var8_8, (boolean)var2_2);
                    var5_5 /* !! */ .putBoolean("ISEXISTINGUSER", false);
                    var4_4 = var7_7.g;
                    var5_5 /* !! */ .putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)var4_4);
                    var19_21 = var7_7.C;
                    Intrinsics.checkNotNull(var19_21);
                    var19_21 = var19_21.f();
                    var5_5 /* !! */ .putParcelable("QUERYCUSTOMER_DATA", (Parcelable)var19_21);
                    var3_3 = var7_7.h;
                    var5_5 /* !! */ .putBoolean("ISINPUTMOBILENUMBER", var3_3);
                    da1_1.Companion.getClass();
                    var19_21 = da1$a_0.a((Bundle)var5_5 /* !! */ );
                    var4_4 = var7_7.i;
                    if (var4_4 != null) {
                        var5_5 /* !! */  = "SignInOTPFragment";
                        var4_4.Z0((Fragment)var19_21, (String)var5_5 /* !! */ );
                    }
                }
                break block28;
            }
            var17_17 = var5_5 /* !! */ .getStatus();
            if (var17_17 == var2_2) {
                var5_5 /* !! */  = var5_5 /* !! */ .getError();
                var18_19 = AnalyticsManager.Companion;
                tj2_0.e((AnalyticsManager$Companion)var18_19, (String)var16_16 /* !! */ , (String)var12_12, (String)var15_15);
                if (var5_5 /* !! */  != null) {
                    var12_12 = var5_5 /* !! */ .getErrors();
                } else {
                    var24_33 = 0;
                    var12_12 = null;
                }
                var22_30 = "format(...)";
                if (var12_12 != null) {
                    var5_5 /* !! */  = var5_5 /* !! */ .getErrors().iterator();
                    block0: while ((var24_33 = var5_5 /* !! */ .hasNext()) != 0) {
                        var25_34 = var12_12 = var5_5 /* !! */ .next();
                        var25_34 = (DataError$ErrorMessage)var12_12;
                        var12_12 = var25_34.getSubject();
                        var18_19 = "error_status_code";
                        if (var12_12 != null) {
                            var12_12 = var25_34.getSubject();
                            var20_25 /* !! */  = "getSubject(...)";
                            Intrinsics.checkNotNullExpressionValue(var12_12, (String)var20_25 /* !! */ );
                            var24_33 = var12_12.length();
                            if (var24_33 == 0) {
                            } else {
                                var12_12 = var25_34.getSubject();
                                var24_33 = (int)b.i((String)var12_12, (String)(var20_25 /* !! */  = "uid"), (boolean)var2_2);
                                if (var24_33 != 0) {
                                    var7_7.Pa();
                                    var12_12 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var20_25 /* !! */  = var25_34.getMessage();
                                    cP.b((String)var14_14, (String)var20_25 /* !! */ , (GTMEvents)var12_12, (String)var16_16 /* !! */ , (String)var15_15);
                                }
                                if ((var24_33 = (int)b.i((String)(var12_12 = var25_34.getSubject()), (String)(var20_25 /* !! */  = "mobileNumber"), (boolean)var2_2)) != 0) {
                                    var7_7.Pa();
                                    var12_12 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var20_25 /* !! */  = var25_34.getMessage();
                                    cP.b((String)var14_14, (String)var20_25 /* !! */ , (GTMEvents)var12_12, (String)var16_16 /* !! */ , (String)var15_15);
                                }
                                if ((var24_33 = (int)b.i((String)(var12_12 = var25_34.getSubject()), (String)(var20_25 /* !! */  = "password"), (boolean)var2_2)) != 0) {
                                    var12_12 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var20_25 /* !! */  = var25_34.getMessage();
                                    cP.b((String)var14_14, (String)var20_25 /* !! */ , (GTMEvents)var12_12, (String)var16_16 /* !! */ , (String)var15_15);
                                    var12_12 = StringCompanionObject.INSTANCE;
                                    var24_33 = R$string.acc_error_message;
                                    var12_12 = hv3_0.K(var24_33);
                                    var20_25 /* !! */  = var25_34.getMessage();
                                    var21_27 /* !! */  = new Object[var2_2];
                                    var21_27 /* !! */ [0] = var20_25 /* !! */ ;
                                    var12_12 = xh2_0.a(var21_27 /* !! */ , var2_2, (String)var12_12, (String)var22_30);
                                    var20_25 /* !! */  = var25_34.getMessage();
                                    Intrinsics.checkNotNullExpressionValue(var20_25 /* !! */ , (String)var13_13 /* !! */ );
                                    hv3_0.o0(0, (String)var20_25 /* !! */ , (String)var12_12);
                                }
                                var21_27 /* !! */  = new Bundle();
                                var12_12 = var25_34.getCode();
                                var21_27 /* !! */ .putString((String)var18_19, (String)var12_12);
                                var18_19 = var10_10.getEC_ERRORS();
                                var20_25 /* !! */  = var10_10.getEA_BUSINESS_ERROR();
                                var12_12 = var25_34.getMessage();
                                var8_8 = kp1_0.c("send otp - failure ", (String)var12_12);
                                var31_40 = "business_error";
                                var12_12 = var7_7.L;
                                var19_22 = var7_7.M;
                                var32_41 = 1536;
                                var33_42 = null;
                                var30_39 = var12_12;
                                var12_12 = var10_10;
                                var34_43 /* !! */  = var21_27 /* !! */ ;
                                var21_27 /* !! */  = var8_8;
                                var8_8 = var22_30;
                                var22_30 = var31_40;
                                var26_35 = var16_16 /* !! */ ;
                                var16_16 /* !! */  = "signup screen";
                                var27_36 = var15_15;
                                var15_15 = "user account screen";
                                var28_37 = var14_14;
                                var14_14 = var30_39;
                                var29_38 = var13_13 /* !! */ ;
                                var13_13 /* !! */  = var34_43 /* !! */ ;
                                var30_39 = var10_10;
                                var10_10 = var19_22;
                                var23_32 = var32_41;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, (String)var18_19, (String)var20_25 /* !! */ , (String)var21_27 /* !! */ , var31_40, (String)var16_16 /* !! */ , (String)var15_15, (String)var14_14, (Bundle)var34_43 /* !! */ , (String)var19_22, false, null, var32_41, null);
                                var19_22 = var25_34.getSubject();
                                var12_12 = "rilFnlRegisterReferralCode";
                                var2_2 = (int)var12_12.equalsIgnoreCase((String)var19_22);
                                if (var2_2 != 0) {
                                    var19_22 = var7_7.F;
                                    if (var19_22 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                        var2_2 = 0;
                                        var19_22 = null;
                                    }
                                    var19_22.setText((CharSequence)"");
                                    var19_22 = var7_7.G;
                                    var12_12 = "invalidReferralTV";
                                    if (var19_22 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                                        var2_2 = 0;
                                        var19_22 = null;
                                    }
                                    var18_19 = var25_34.getMessage();
                                    var19_22.setText((CharSequence)var18_19);
                                    var19_22 = var7_7.G;
                                    if (var19_22 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                                        var2_2 = 0;
                                        var19_22 = null;
                                    }
                                    var19_22.setVisibility(0);
                                }
                                var12_12 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                var21_27 /* !! */  = var25_34.getMessage();
                                GTMEvents.gtmEventsToGa$default((GTMEvents)var12_12, "formErrorEvent", "Registration form", (String)var21_27 /* !! */ , "signup screen", null, null, null, 112, null);
                                var18_19 = var30_39.getEC_FORM();
                                var19_22 = var25_34.getMessage();
                                var21_27 /* !! */  = kp1_0.c("Registration form - ", (String)var19_22);
                                var20_25 /* !! */  = "error";
                                var22_30 = "form_error";
                                var16_16 /* !! */  = "signup screen";
                                var15_15 = "user account screen";
                                var14_14 = var7_7.L;
                                var13_13 /* !! */  = null;
                                var10_10 = var7_7.M;
                                var23_32 = 1536;
                                var12_12 = var30_39;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var30_39, (String)var18_19, (String)var20_25 /* !! */ , (String)var21_27 /* !! */ , (String)var22_30, (String)var16_16 /* !! */ , (String)var15_15, (String)var14_14, null, (String)var10_10, false, null, var23_32, null);
lbl210:
                                // 2 sources

                                while (true) {
                                    var22_30 = var8_8;
                                    var13_13 /* !! */  = var29_38;
                                    var10_10 = var30_39;
                                    var16_16 /* !! */  = var26_35;
                                    var15_15 = var27_36;
                                    var14_14 = var28_37;
                                    var2_2 = 1;
                                    var9_9 = false;
                                    var8_8 = null;
                                    continue block0;
                                    break;
                                }
                            }
                        }
                        var8_8 = var22_30;
                        var26_35 = var16_16 /* !! */ ;
                        var27_36 = var15_15;
                        var28_37 = var14_14;
                        var29_38 = var13_13 /* !! */ ;
                        var30_39 = var10_10;
                        var19_22 = var25_34.getType();
                        var12_12 = "error - ";
                        if (var19_22 != null) {
                            var19_22 = var25_34.getType();
                            var2_2 = b.i((String)var19_22, (String)(var20_25 /* !! */  = "DuplicateUidError"), var35_44 = true);
                            if (var2_2 != 0) {
                                var19_22 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                var20_25 /* !! */  = var25_34.getMessage();
                                var10_10 = var14_14;
                                var21_27 /* !! */  = new StringBuilder((String)var14_14);
                                var21_27 /* !! */ .append((String)var20_25 /* !! */ );
                                var20_25 /* !! */  = var21_27 /* !! */ .toString();
                                var14_14 = var16_16 /* !! */ ;
                                var13_13 /* !! */  = var15_15;
                                var19_22.pushButtonTapEvent((String)var16_16 /* !! */ , var20_25 /* !! */ , (String)var15_15);
                                var19_22 = new Bundle();
                                var20_25 /* !! */  = var25_34.getCode();
                                var19_22.putString((String)var18_19, (String)var20_25 /* !! */ );
                                var18_19 = var30_39.getEC_ERRORS();
                                var20_25 /* !! */  = var30_39.getEA_BUSINESS_ERROR();
                                var21_27 /* !! */  = var25_34.getMessage();
                                var21_27 /* !! */  = kp1_0.c((String)var12_12, (String)var21_27 /* !! */ );
                                var22_30 = "business_error";
                                var16_16 /* !! */  = "signup screen";
                                var15_15 = "user account screen";
                                var12_12 = var7_7.L;
                                var4_4 = var7_7.M;
                                var23_32 = 1536;
                                var25_34 = var12_12;
                                var12_12 = var30_39;
                                var33_42 = var5_5 /* !! */ ;
                                var5_5 /* !! */  = var26_35;
                                var14_14 = var25_34;
                                var6_6 = var27_36;
                                var13_13 /* !! */  = var19_22;
                                var19_22 = var28_37;
                                var10_10 = var4_4;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var30_39, (String)var18_19, (String)var20_25 /* !! */ , (String)var21_27 /* !! */ , (String)var22_30, (String)var16_16 /* !! */ , (String)var15_15, (String)var25_34, (Bundle)var13_13 /* !! */ , (String)var4_4, false, null, var23_32, null);
                                var7_7.Pa();
lbl267:
                                // 2 sources

                                while (true) {
                                    var14_14 = var19_22;
                                    var16_16 /* !! */  = var5_5 /* !! */ ;
                                    var15_15 = var6_6;
                                    var22_30 = var8_8;
                                    var13_13 /* !! */  = var29_38;
                                    var5_5 /* !! */  = var33_42;
                                    var10_10 = var30_39;
                                    var2_2 = 1;
                                    var3_3 = false;
                                    var4_4 = null;
                                    var9_9 = false;
                                    var8_8 = null;
                                    var6_6 = this;
                                    continue block0;
                                    break;
                                }
                            }
                            var6_6 = this;
                            ** continue;
                        }
                        var33_42 = var5_5 /* !! */ ;
                        var5_5 /* !! */  = var16_16 /* !! */ ;
                        var6_6 = var15_15;
                        var19_22 = var14_14;
                        var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var20_25 /* !! */  = var25_34.getMessage();
                        var21_27 /* !! */  = new StringBuilder((String)var14_14);
                        var21_27 /* !! */ .append((String)var20_25 /* !! */ );
                        var20_25 /* !! */  = var21_27 /* !! */ .toString();
                        var4_4.pushButtonTapEvent((String)var16_16 /* !! */ , var20_25 /* !! */ , (String)var15_15);
                        var13_13 /* !! */  = new Bundle();
                        var4_4 = var25_34.getCode();
                        var13_13 /* !! */ .putString((String)var18_19, (String)var4_4);
                        var18_19 = var10_10.getEC_ERRORS();
                        var20_25 /* !! */  = var10_10.getEA_BUSINESS_ERROR();
                        var4_4 = var25_34.getMessage();
                        var21_27 /* !! */  = kp1_0.c((String)var12_12, (String)var4_4);
                        var22_30 = "business_error";
                        var16_16 /* !! */  = "signup screen";
                        var15_15 = "user account screen";
                        var14_14 = var7_7.L;
                        var10_10 = var7_7.M;
                        var23_32 = 1536;
                        var12_12 = var30_39;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var30_39, (String)var18_19, (String)var20_25 /* !! */ , (String)var21_27 /* !! */ , (String)var22_30, (String)var16_16 /* !! */ , (String)var15_15, (String)var14_14, (Bundle)var13_13 /* !! */ , (String)var10_10, false, null, var23_32, null);
                        var4_4 = var25_34.getMessage();
                        var4_4 = kp1_0.c("Error has occurred for registering customer, ", (String)var4_4);
                        var12_12 = StringCompanionObject.INSTANCE;
                        var24_33 = R$string.acc_error_message;
                        var12_12 = hv3_0.K(var24_33);
                        var17_17 = 1;
                        var20_25 /* !! */  = new Object[var17_17];
                        var35_44 = false;
                        var21_27 /* !! */  = null;
                        var20_25 /* !! */ [0] = var4_4;
                        var12_12 = xh2_0.a(var20_25 /* !! */ , var17_17, (String)var12_12, (String)var8_8);
                        hv3_0.o0(0, (String)var4_4, (String)var12_12);
                        ** continue;
                    }
                } else {
                    var8_8 = var22_30;
                    var17_17 = 1;
                    var35_45 = false;
                    var21_28 = null;
                    var19_23 = StringCompanionObject.INSTANCE;
                    var2_2 = R$string.acc_error_message;
                    var19_23 = hv3_0.K(var2_2);
                    var4_4 = hv3_0.K(R$string.something_wrong_msg);
                    var5_5 /* !! */  = new Object[var17_17];
                    var5_5 /* !! */ [0] = var4_4;
                    var19_23 = xh2_0.a(var5_5 /* !! */ , var17_17, (String)var19_23, (String)var22_30);
                    var3_3 = R$string.something_wrong_msg;
                    var4_4 = hv3_0.K((int)var3_3);
                    hv3_0.o0(0, (String)var4_4, (String)var19_23);
                }
            }
        }
    }
}

