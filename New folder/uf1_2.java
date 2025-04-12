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
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.f;
import com.ril.ajio.services.data.Login.OTPData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.entity.Component;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from uf1
 */
public final class uf1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uf1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this;
        var3_3 = 0;
        var4_4 = null;
        var5_5 = 1;
        var6_6 = this.b;
        var7_7 = "this$0";
        var8_8 = this.a;
        switch (var8_8) {
            default: {
                var9_9 = var1_1;
                var9_9 = (Throwable)var1_1;
                var6_6 = (hy3_0)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var7_7);
                var4_4 = var6_6.j;
                var10_13 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(var9_9);
                var11_15 = ApiErrorRepo.handleApiException$default(var10_13, (Throwable)var9_9, "UpdateUserProfile", false, null, null, 28, null);
                var4_4.k(var11_15);
                return Unit.a;
            }
            case 3: {
                var4_4 = var1_1;
                var4_4 = (Component)var1_1;
                var6_6 = (f)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var7_7);
                if (var4_4 != null && (var7_7 = var4_4.getBanners()) != null && (var12_22 = var7_7.isEmpty() ^ var5_5) == var5_5 || var4_4 != null && (var12_22 = var4_4.isDynamicAdsFlowEnabled()) == var5_5) {
                    var6_6.G = var4_4;
                    var7_7 = var6_6.p;
                    if (var7_7 != null) {
                        var14_26 = 9;
                        var15_28 = false;
                        var9_10 = null;
                        var16_30 = 2;
                        var13_24 = new pa2_1(var14_26, 0.0f, (Component)var4_4, var16_30);
                        var7_7.add(var5_5, var13_24);
                    }
                    if ((var4_4 = var6_6.v) != null) {
                        var4_4.notifyDataSetChanged();
                    }
                }
                return Unit.a;
            }
            case 2: {
                var4_4 = var1_1;
                var4_4 = (DataCallback)var1_1;
                var6_6 = (oy1_1)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var7_7);
                var11_16 = cp_1.Companion;
                var5_5 = nn_2.b(var11_16, (DataCallback)var4_4);
                if (var5_5) {
                    Intrinsics.checkNotNull(var4_4);
                    var3_3 = var4_4.getStatus();
                    if (var3_3 == 0) {
                        var4_4 = var6_6.Qa().s;
                        var6_6.Oa((ProductOptionItem)var4_4);
                    }
                    var6_6.Wa();
                }
                return Unit.a;
            }
            case 1: {
                var13_25 = var1_1;
                var13_25 = (DataCallback)var1_1;
                var6_6 = (az1_2)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var7_7);
                var7_7 = var6_6.j;
                if (var7_7 != null) {
                    var7_7.stopLoader();
                }
                if (!(var12_23 = nn_2.b((cp$a)(var7_7 = cp_1.Companion), (DataCallback)var13_25))) ** GOTO lbl362
                var7_7 = var6_6.X;
                var17_31 = "referralCodeETV";
                var10_14 = "Send OTP - Failure";
                var18_32 = "format(...)";
                var19_33 = "Error - ";
                var20_34 = null;
                var21_35 = "signup screen";
                var22_36 = "Welcome to Ajio";
                if (var13_25 == null || (var15_29 = var13_25.getStatus()) != 0) ** GOTO lbl142
                if ((var13_25 = (OTPData)var13_25.getData()) != null) {
                    var9_11 = var13_25.getMessage();
                } else {
                    var15_29 = 0;
                    var9_11 = null;
                }
                if (var9_11 == null) ** GOTO lbl-1000
                var9_11 = var13_25.getMessage();
                var23_37 = "getMessage(...)";
                Intrinsics.checkNotNullExpressionValue(var9_11, var23_37);
                var15_29 = var9_11.length();
                if (var15_29 != 0) {
                    var9_11 = StringCompanionObject.INSTANCE;
                    var15_29 = R$string.acc_alert_message;
                    var9_11 = hv3_0.K(var15_29);
                    var24_39 = var13_25.getMessage();
                    var25_42 /* !! */  = new Object[var5_5];
                    var25_42 /* !! */ [0] = var24_39;
                    var11_17 = xh2_0.a(var25_42 /* !! */ , var5_5, (String)var9_11, (String)var18_32);
                    var9_11 = var13_25.getMessage();
                    Intrinsics.checkNotNullExpressionValue(var9_11, var23_37);
                    hv3_0.o0(0, (String)var9_11, var11_17);
                    var4_4 = AnalyticsManager.Companion;
                    var4_4.getInstance().getGtmEvents().pushButtonTapEvent(var22_36, var10_14, (String)var21_35);
                    var4_4 = var4_4.getInstance().getGtmEvents();
                    var11_17 = var13_25.getMessage();
                    cP.b((String)var19_33, var11_17, (GTMEvents)var4_4, var22_36, (String)var21_35);
                    var9_11 = var7_7.getEC_ERRORS();
                    var23_37 = var7_7.getEA_BUSINESS_ERROR();
                    var4_4 = var13_25.getMessage();
                    var11_17 = "Send OTP - Failure ";
                    var24_39 = kp1_0.c(var11_17, (String)var4_4);
                    var25_42 /* !! */  = "business_error";
                    var26_45 = "signup screen";
                    var22_36 = "user account screen";
                    var21_35 = var6_6.Y;
                    var19_33 = null;
                    var18_32 = var6_6.Z;
                    var27_47 = 1536;
                    var10_14 = var7_7;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_7, (String)var9_11, var23_37, var24_39, (String)var25_42 /* !! */ , var26_45, var22_36, (String)var21_35, null, (String)var18_32, false, null, var27_47, null);
                } else lbl-1000:
                // 2 sources

                {
                    var7_7 = AnalyticsManager.Companion;
                    var13_25 = "Send OTP - Success";
                    tj2_0.e((AnalyticsManager$Companion)var7_7, var22_36, (String)var13_25, (String)var21_35);
                    var7_7 = var6_6.x;
                    if (var7_7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var17_31);
                        var12_23 = false;
                        var7_7 = null;
                    }
                    if ((var7_7 = var7_7.getText()) != null) {
                        var20_34 = var7_7.toString();
                    }
                    bv1_0.a = var20_34;
                    var7_7 = new Bundle();
                    var7_7.putBoolean("ISFROMSOCIALLOGIN", false);
                    var13_25 = "ISMANUALSIGNUP";
                    var7_7.putBoolean((String)var13_25, (boolean)var5_5);
                    var7_7.putBoolean("ISEXISTINGUSER", false);
                    var11_18 = var6_6.h;
                    var7_7.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)var11_18);
                    var4_4 = var6_6.Ra().f();
                    var7_7.putParcelable("QUERYCUSTOMER_DATA", (Parcelable)var4_4);
                    var5_5 = var6_6.i;
                    var7_7.putBoolean("ISINPUTMOBILENUMBER", (boolean)var5_5);
                    da1_1.Companion.getClass();
                    var4_4 = da1$a_0.a((Bundle)var7_7);
                    var11_18 = var6_6.j;
                    if (var11_18 != null) {
                        var6_6 = "SignInOTPFragment";
                        var11_18.Z0((Fragment)var4_4, (String)var6_6);
                    }
                }
                ** GOTO lbl362
lbl142:
                // 1 sources

                var15_29 = var13_25.getStatus();
                if (var15_29 == var5_5) {
                    var13_25 = var13_25.getError();
                    var9_12 = AnalyticsManager.Companion;
                    tj2_0.e((AnalyticsManager$Companion)var9_12, var22_36, (String)var10_14, (String)var21_35);
                    if (var13_25 != null) {
                        var10_14 = var13_25.getErrors();
                    } else {
                        var14_27 = 0;
                        var10_14 = null;
                    }
                    if (var10_14 != null) {
                        var13_25 = var13_25.getErrors().iterator();
                        block6: while ((var14_27 = var13_25.hasNext()) != 0) {
                            var28_49 = var10_14 = var13_25.next();
                            var28_49 = (DataError$ErrorMessage)var10_14;
                            var10_14 = var28_49.getSubject();
                            var9_12 = "error_status_code";
                            if (var10_14 != null) {
                                var10_14 = var28_49.getSubject();
                                var23_38 /* !! */  = "getSubject(...)";
                                Intrinsics.checkNotNullExpressionValue(var10_14, (String)var23_38 /* !! */ );
                                var14_27 = var10_14.length();
                                if (var14_27 == 0) {
                                } else {
                                    var10_14 = var28_49.getSubject();
                                    var14_27 = (int)kotlin.text.b.i((String)var10_14, (String)(var23_38 /* !! */  = "uid"), (boolean)var5_5);
                                    if (var14_27 != 0 || (var14_27 = (int)kotlin.text.b.i((String)(var10_14 = var28_49.getSubject()), (String)(var23_38 /* !! */  = "email"), (boolean)var5_5)) != 0) {
                                        var6_6.Pa();
                                        var10_14 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                        var23_38 /* !! */  = var28_49.getMessage();
                                        cP.b((String)var19_33, (String)var23_38 /* !! */ , (GTMEvents)var10_14, var22_36, (String)var21_35);
                                    }
                                    if ((var14_27 = (int)kotlin.text.b.i((String)(var10_14 = var28_49.getSubject()), (String)(var23_38 /* !! */  = "mobileNumber"), (boolean)var5_5)) != 0) {
                                        var6_6.Pa();
                                        var10_14 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                        var23_38 /* !! */  = var28_49.getMessage();
                                        cP.b((String)var19_33, (String)var23_38 /* !! */ , (GTMEvents)var10_14, var22_36, (String)var21_35);
                                    }
                                    var26_46 /* !! */  = new Bundle();
                                    var10_14 = var28_49.getCode();
                                    var26_46 /* !! */ .putString((String)var9_12, (String)var10_14);
                                    var9_12 = var7_7.getEC_ERRORS();
                                    var23_38 /* !! */  = var7_7.getEA_BUSINESS_ERROR();
                                    var10_14 = var28_49.getMessage();
                                    var24_40 /* !! */  = kp1_0.c("send otp - failure ", (String)var10_14);
                                    var25_43 = "business_error";
                                    var33_54 = "signup screen";
                                    var10_14 = var6_6.Y;
                                    var11_19 = var6_6.Z;
                                    var34_55 = 1536;
                                    var35_56 = var10_14;
                                    var10_14 = var7_7;
                                    var36_57 /* !! */  = var26_46 /* !! */ ;
                                    var26_46 /* !! */  = var33_54;
                                    var29_50 = var22_36;
                                    var22_36 = "user account screen";
                                    var30_51 = var21_35;
                                    var21_35 = var35_56;
                                    var31_52 = var19_33;
                                    var19_33 = var36_57 /* !! */ ;
                                    var32_53 = var18_32;
                                    var18_32 = var11_19;
                                    var27_48 = var34_55;
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_7, (String)var9_12, (String)var23_38 /* !! */ , (String)var24_40 /* !! */ , var25_43, var33_54, var22_36, (String)var35_56, var36_57 /* !! */ , (String)var11_19, false, null, var34_55, null);
                                    var11_19 = var28_49.getSubject();
                                    var10_14 = "rilFnlRegisterReferralCode";
                                    var5_5 = var10_14.equalsIgnoreCase((String)var11_19);
                                    if (var5_5) {
                                        var11_19 = var6_6.x;
                                        if (var11_19 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var17_31);
                                            var5_5 = 0;
                                            var11_19 = null;
                                        }
                                        var11_19.setText((CharSequence)"");
                                        var11_19 = var6_6.B;
                                        var10_14 = "invalidReferralTV";
                                        if (var11_19 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_14);
                                            var5_5 = 0;
                                            var11_19 = null;
                                        }
                                        var9_12 = var28_49.getMessage();
                                        var11_19.setText((CharSequence)var9_12);
                                        var11_19 = var6_6.B;
                                        if (var11_19 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_14);
                                            var5_5 = 0;
                                            var11_19 = null;
                                        }
                                        var11_19.setVisibility(0);
                                    }
                                    var10_14 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var24_40 /* !! */  = var28_49.getMessage();
                                    GTMEvents.gtmEventsToGa$default((GTMEvents)var10_14, "formErrorEvent", "Registration form", (String)var24_40 /* !! */ , "signup screen", null, null, null, 112, null);
                                    var9_12 = var7_7.getEC_FORM();
                                    var11_19 = var28_49.getMessage();
                                    var24_40 /* !! */  = kp1_0.c("Registration form - ", (String)var11_19);
                                    var23_38 /* !! */  = "error";
                                    var25_43 = "form_error";
                                    var26_46 /* !! */  = "signup screen";
                                    var22_36 = "user account screen";
                                    var21_35 = var6_6.Y;
                                    var19_33 = null;
                                    var18_32 = var6_6.Z;
                                    var27_48 = 1536;
                                    var10_14 = var7_7;
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_7, (String)var9_12, (String)var23_38 /* !! */ , (String)var24_40 /* !! */ , var25_43, (String)var26_46 /* !! */ , var22_36, (String)var21_35, null, (String)var18_32, false, null, var27_48, null);
lbl244:
                                    // 2 sources

                                    while (true) {
                                        var22_36 = var29_50;
                                        var21_35 = var30_51;
                                        var19_33 = var31_52;
                                        var18_32 = var32_53;
                                        var5_5 = 1;
                                        continue block6;
                                        break;
                                    }
                                }
                            }
                            var29_50 = var22_36;
                            var30_51 = var21_35;
                            var31_52 = var19_33;
                            var32_53 = var18_32;
                            var11_19 = var28_49.getType();
                            var10_14 = "error - ";
                            if (var11_19 != null) {
                                var11_19 = var28_49.getType();
                                var5_5 = kotlin.text.b.i((String)var11_19, (String)(var23_38 /* !! */  = "DuplicateUidError"), var37_58 = true);
                                if (var5_5) {
                                    var11_19 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var23_38 /* !! */  = var28_49.getMessage();
                                    var18_32 = var19_33;
                                    var24_40 /* !! */  = new StringBuilder((String)var19_33);
                                    var24_40 /* !! */ .append((String)var23_38 /* !! */ );
                                    var23_38 /* !! */  = var24_40 /* !! */ .toString();
                                    var21_35 = var22_36;
                                    var19_33 = var30_51;
                                    var11_19.pushButtonTapEvent(var22_36, var23_38 /* !! */ , var30_51);
                                    var11_19 = new Bundle();
                                    var23_38 /* !! */  = var28_49.getCode();
                                    var11_19.putString((String)var9_12, (String)var23_38 /* !! */ );
                                    var9_12 = var7_7.getEC_ERRORS();
                                    var23_38 /* !! */  = var7_7.getEA_BUSINESS_ERROR();
                                    var24_40 /* !! */  = var28_49.getMessage();
                                    var24_40 /* !! */  = kp1_0.c((String)var10_14, (String)var24_40 /* !! */ );
                                    var25_43 = "business_error";
                                    var26_46 /* !! */  = "signup screen";
                                    var10_14 = var6_6.Y;
                                    var4_4 = var6_6.Z;
                                    var27_48 = 1536;
                                    var28_49 = var10_14;
                                    var10_14 = var7_7;
                                    var2_2 = var22_36;
                                    var21_35 = var28_49;
                                    var1_1 = var13_25;
                                    var13_25 = var30_51;
                                    var19_33 = var11_19;
                                    var11_19 = var31_52;
                                    var18_32 = var4_4;
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_7, (String)var9_12, (String)var23_38 /* !! */ , (String)var24_40 /* !! */ , var25_43, (String)var26_46 /* !! */ , "user account screen", (String)var28_49, (Bundle)var19_33, (String)var4_4, false, null, var27_48, null);
                                    var6_6.Pa();
                                    var19_33 = var31_52;
                                    var21_35 = var30_51;
                                    var18_32 = var32_53;
lbl297:
                                    // 2 sources

                                    while (true) {
                                        var3_3 = 0;
                                        var4_4 = null;
                                        var5_5 = 1;
                                        var2_2 = this;
                                        var13_25 = var1_1;
                                        continue block6;
                                        break;
                                    }
                                }
                                var2_2 = this;
                                ** continue;
                            }
                            var1_1 = var13_25;
                            var2_2 = var22_36;
                            var13_25 = var21_35;
                            var11_19 = var19_33;
                            var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            var23_38 /* !! */  = var28_49.getMessage();
                            var24_40 /* !! */  = new StringBuilder((String)var19_33);
                            var24_40 /* !! */ .append((String)var23_38 /* !! */ );
                            var23_38 /* !! */  = var24_40 /* !! */ .toString();
                            var4_4.pushButtonTapEvent(var22_36, var23_38 /* !! */ , (String)var21_35);
                            var19_33 = new Bundle();
                            var4_4 = var28_49.getCode();
                            var19_33.putString((String)var9_12, (String)var4_4);
                            var9_12 = var7_7.getEC_ERRORS();
                            var23_38 /* !! */  = var7_7.getEA_BUSINESS_ERROR();
                            var4_4 = var28_49.getMessage();
                            var24_40 /* !! */  = kp1_0.c((String)var10_14, (String)var4_4);
                            var26_46 /* !! */  = "signup screen";
                            var21_35 = var6_6.Y;
                            var18_32 = var6_6.Z;
                            var27_48 = 1536;
                            var10_14 = var7_7;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_7, (String)var9_12, (String)var23_38 /* !! */ , (String)var24_40 /* !! */ , "business_error", (String)var26_46 /* !! */ , "user account screen", (String)var21_35, (Bundle)var19_33, (String)var18_32, false, null, var27_48, null);
                            var4_4 = var28_49.getMessage();
                            var4_4 = kp1_0.c("Error has occurred for registering customer, ", (String)var4_4);
                            var10_14 = StringCompanionObject.INSTANCE;
                            var14_27 = R$string.acc_error_message;
                            var10_14 = hv3_0.K(var14_27);
                            var15_29 = 1;
                            var23_38 /* !! */  = new Object[var15_29];
                            var37_58 = false;
                            var24_40 /* !! */  = null;
                            var23_38 /* !! */ [0] = var4_4;
                            var25_43 = var32_53;
                            var10_14 = xh2_0.a(var23_38 /* !! */ , var15_29, (String)var10_14, var32_53);
                            hv3_0.o0(0, (String)var4_4, (String)var10_14);
                            var19_33 = var31_52;
                            var21_35 = var30_51;
                            var18_32 = var32_53;
                            ** continue;
                        }
                    } else {
                        var25_44 = var18_32;
                        var15_29 = 1;
                        var37_59 = false;
                        var24_41 = null;
                        var2_2 = StringCompanionObject.INSTANCE;
                        var38_60 = R$string.acc_error_message;
                        var2_2 = hv3_0.K(var38_60);
                        var4_4 = hv3_0.K(R$string.something_wrong_msg);
                        var11_20 = new Object[var15_29];
                        var11_20[0] = var4_4;
                        var2_2 = xh2_0.a(var11_20, var15_29, (String)var2_2, (String)var18_32);
                        var3_3 = R$string.something_wrong_msg;
                        var4_4 = hv3_0.K(var3_3);
                        hv3_0.o0(0, (String)var4_4, (String)var2_2);
                    }
                }
lbl362:
                // 7 sources

                return Unit.a;
            }
            case 0: 
        }
        var11_21 = var1_1;
        var11_21 = (Throwable)var1_1;
        var6_6 = (wf1_2)var6_6;
        Intrinsics.checkNotNullParameter(var6_6, (String)var7_7);
        var2_2 = var6_6.d;
        var4_4 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(var11_21);
        var4_4 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)var4_4, (Throwable)var11_21, "ifscDetail", false, null, null, 28, null);
        var2_2.k(var4_4);
        return Unit.a;
    }
}

