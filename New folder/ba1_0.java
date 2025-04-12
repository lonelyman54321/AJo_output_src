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
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.OTPData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from BA1
 */
public final class ba1_0
implements F62 {
    public final /* synthetic */ ga1_0 a;

    public /* synthetic */ ba1_0(ga1_0 ga1_02) {
        this.a = ga1_02;
    }

    /*
     * Unable to fully structure code
     */
    public final void onChanged(Object var1_1) {
        block39: {
            block41: {
                block40: {
                    var2_2 = var1_1;
                    var2_2 = (DataCallback)var1_1;
                    var3_3 = this.a;
                    Intrinsics.checkNotNullParameter(var3_3, "this$0");
                    var4_4 = cp_1.Companion;
                    var5_5 = nn_2.b((cp$a)var4_4, (DataCallback)var2_2);
                    if (!var5_5) break block39;
                    var4_4 = var3_3.i;
                    if (var4_4 != null) {
                        var4_4.stopLoader();
                    }
                    var5_5 = false;
                    var4_4 = null;
                    var6_6 = 1;
                    var7_7 = "gaScreenName";
                    var8_8 = 32;
                    var9_9 = "getMessage(...)";
                    if (var2_2 == null || (var10_10 = var2_2.getStatus()) != 0) break block40;
                    if ((var2_2 = (OTPData)var2_2.getData()) != null) {
                        var11_11 = var2_2.getMessage();
                    } else {
                        var10_10 = 0;
                        var11_11 = null;
                    }
                    if (var11_11 == null) ** GOTO lbl-1000
                    var11_11 = var2_2.getMessage();
                    Intrinsics.checkNotNullExpressionValue(var11_11, (String)var9_9);
                    var10_10 = var11_11.length();
                    if (var10_10 != 0) {
                        var2_2 = var2_2.getMessage();
                        Intrinsics.checkNotNullExpressionValue(var2_2, (String)var9_9);
                        hv3_0.o0(0, (String)var2_2, null);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var9_9 = var3_3.m;
                        var9_9 = var9_9 != null ? var9_9.getText() : null;
                        var9_9 = String.valueOf(var9_9);
                        var10_10 = var9_9.length() - var6_6;
                        var12_13 = 0;
                        var13_15 = null;
                        var14_17 = false;
                        var15_19 = null;
                        while (var12_13 <= var10_10) {
                            var16_21 = var14_17 == false ? var12_13 : var10_10;
                            if ((var16_21 = Intrinsics.compare(var9_9.charAt(var16_21), var8_8)) <= 0) {
                                var16_21 = 1;
                            } else {
                                var16_21 = 0;
                                var17_23 = null;
                            }
                            if (!var14_17) {
                                if (var16_21 == 0) {
                                    var14_17 = true;
                                    continue;
                                }
                                ++var12_13;
                                continue;
                            }
                            if (var16_21 == 0) break;
                            var10_10 += -1;
                        }
                        var18_25 = com.jio.jioads.adinterfaces.a.a(var10_10, var6_6, var12_13, (String)var9_9);
                        var9_9 = var3_3.w;
                        if (var9_9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var9_9 = null;
                        }
                        var7_7 = "Continue - success";
                        var2_2.pushButtonTapEvent(var18_25, var7_7, (String)var9_9);
                        var2_2 = var3_3.p;
                        if (var2_2 != null && (var2_2 = var2_2.getText()) != null) {
                            var2_2 = var2_2.toString();
                        } else {
                            var19_26 = false;
                            var2_2 = null;
                        }
                        bv1_0.a = var2_2;
                        var2_2 = var3_3.f;
                        if (var2_2 != null) {
                            var7_7 = "SIGIN_SOURCE_FACEBOOK";
                            var20_28 = var2_2.equalsIgnoreCase(var7_7);
                            if (var20_28) {
                                bv1_0.f = var2_2 = "Social media - fb";
                            } else {
                                var7_7 = "SIGIN_SOURCE_GOOGLE";
                                var19_26 = var2_2.equalsIgnoreCase(var7_7);
                                if (var19_26) {
                                    bv1_0.f = var2_2 = "Social media - google";
                                }
                            }
                        }
                        var2_2 = new Bundle();
                        var7_7 = "ISFROMSOCIALLOGIN";
                        var2_2.putBoolean(var7_7, (boolean)var6_6);
                        var21_29 = var3_3.t;
                        if (var21_29 != null && (var21_29 = var21_29.f()) != null) {
                            var4_4 = var21_29.getLoginvia();
                        }
                        var2_2.putString("LOGIN_VIA", (String)var4_4);
                        var2_2.putBoolean("ISMANUALSIGNUP", false);
                        var2_2.putBoolean("ISEXISTINGUSER", false);
                        var4_4 = var3_3.t;
                        Intrinsics.checkNotNull(var4_4);
                        var4_4 = var4_4.f();
                        var2_2.putParcelable("QUERYCUSTOMER_DATA", (Parcelable)var4_4);
                        var21_29 = var3_3.f;
                        var2_2.putString("SIGIN_SOURCE", (String)var21_29);
                        var4_4 = da1_1.Companion;
                        var4_4.getClass();
                        var2_2 = da1$a_0.a((Bundle)var2_2);
                        var3_3 = var3_3.i;
                        if (var3_3 != null) {
                            var4_4 = "SignInOTPFragment";
                            var3_3.Z0((Fragment)var2_2, (String)var4_4);
                        }
                    }
                    break block39;
                }
                var10_10 = var2_2.getStatus();
                if (var10_10 != var6_6) break block39;
                if ((var2_2 = var2_2.getError()) != null) {
                    var11_12 = var2_2.errors;
                } else {
                    var10_10 = 0;
                    var11_12 = null;
                }
                if (var11_12 == null) break block41;
                var2_2 = var2_2.errors.iterator();
                block1: while ((var10_10 = (int)var2_2.hasNext()) != 0) {
                    block42: {
                        var11_12 = (DataError$ErrorMessage)var2_2.next();
                        var13_16 = var11_12.getSubject();
                        var15_20 = "Continue - failed";
                        if (var13_16 != null) {
                            var13_16 = var11_12.getSubject();
                            var17_24 = "getSubject(...)";
                            Intrinsics.checkNotNullExpressionValue(var13_16, (String)var17_24);
                            var12_14 = var13_16.length();
                            if (var12_14 != 0) {
                                var13_16 = var11_12.getSubject();
                                var12_14 = (int)b.i((String)var13_16, (String)(var17_24 = "uid"), (boolean)var6_6);
                                if (var12_14 != 0) {
                                    var13_16 = var11_12.getMessage();
                                    Intrinsics.checkNotNullExpressionValue(var13_16, (String)var9_9);
                                    var3_3.Pa((String)var13_16);
                                }
                                if ((var12_14 = (int)b.i((String)(var13_16 = var11_12.getSubject()), (String)(var17_24 = "mobileNumber"), (boolean)var6_6)) != 0) {
                                    var13_16 = var11_12.getMessage();
                                    Intrinsics.checkNotNullExpressionValue(var13_16, (String)var9_9);
                                    var3_3.Pa((String)var13_16);
                                }
                                if ((var12_14 = (int)b.i((String)(var13_16 = var11_12.getSubject()), (String)(var17_24 = "password"), (boolean)var6_6)) == 0) continue;
                                var13_16 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                var17_24 = var3_3.m;
                                Intrinsics.checkNotNull(var17_24);
                                var17_24 = var17_24.getText().toString();
                                var22_31 = var17_24.length() - var6_6;
                                var23_32 = 0;
                                var24_33 = 0;
                                block2: while (var23_32 <= var22_31) {
                                    var6_6 = var24_33 == 0 ? var23_32 : var22_31;
                                    if ((var6_6 = Intrinsics.compare(var17_24.charAt(var6_6), var8_8)) <= 0) {
                                        var6_6 = 1;
                                    } else {
                                        var6_6 = 0;
                                        var21_30 = null;
                                    }
                                    if (var24_33 == 0) {
                                        if (var6_6 == 0) {
                                            var6_6 = 1;
                                            var24_33 = 1;
                                            continue;
                                        }
                                        ++var23_32;
lbl157:
                                        // 2 sources

                                        while (true) {
                                            var6_6 = 1;
                                            continue block2;
                                            break;
                                        }
                                    }
                                    if (var6_6 == 0) break;
                                    var22_31 += -1;
                                    ** continue;
                                }
                                var6_6 = 1;
                                var21_30 = com.jio.jioads.adinterfaces.a.a(var22_31, var6_6, var23_32, (String)var17_24);
                                var17_24 = var3_3.w;
                                if (var17_24 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                                    var16_22 = 0;
                                    var17_24 = null;
                                }
                                var13_16.pushButtonTapEvent((String)var21_30, var15_20, (String)var17_24);
                                var21_30 = var11_12.getMessage();
                                Intrinsics.checkNotNullExpressionValue(var21_30, (String)var9_9);
                                hv3_0.o0(0, (String)var21_30, null);
lbl174:
                                // 3 sources

                                while (true) {
                                    var6_6 = 1;
                                    continue block1;
                                    break;
                                }
                            }
                        }
                        if ((var21_30 = var11_12.getType()) == null) break block42;
                        var21_30 = var11_12.getType();
                        var6_6 = (int)b.i((String)var21_30, (String)(var13_16 = "DuplicateUidError"), var14_18 = true);
                        if (var6_6 != 0) {
                            var21_30 = var11_12.getMessage();
                            Intrinsics.checkNotNullExpressionValue(var21_30, (String)var9_9);
                            var3_3.Pa((String)var21_30);
                        }
                        ** GOTO lbl174
                    }
                    var21_30 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var13_16 = var3_3.m;
                    Intrinsics.checkNotNull(var13_16);
                    var13_16 = var13_16.getText().toString();
                    var16_22 = var13_16.length();
                    var22_31 = 1;
                    var23_32 = var16_22 - var22_31;
                    var16_22 = 0;
                    var17_24 = null;
                    var24_33 = 0;
                    block5: while (var24_33 <= var23_32) {
                        block43: {
                            var22_31 = var16_22 == 0 ? var24_33 : var23_32;
                            var22_31 = Intrinsics.compare(var13_16.charAt(var22_31), var8_8);
                            var22_31 = var22_31 <= 0 ? 1 : 0;
                            if (var16_22 != 0) break block43;
                            if (var22_31 == 0) {
                                var16_22 = 1;
lbl203:
                                // 3 sources

                                while (true) {
                                    var22_31 = 1;
                                    continue block5;
                                    break;
                                }
                            }
                            ++var24_33;
                            ** GOTO lbl203
                        }
                        if (var22_31 == 0) break;
                        var23_32 += -1;
                        ** continue;
                    }
                    var16_22 = 1;
                    var13_16 = com.jio.jioads.adinterfaces.a.a(var23_32, var16_22, var24_33, (String)var13_16);
                    var17_24 = var3_3.w;
                    if (var17_24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var16_22 = 0;
                        var17_24 = null;
                    }
                    var21_30.pushButtonTapEvent((String)var13_16, var15_20, (String)var17_24);
                    var21_30 = var11_12.getMessage();
                    var13_16 = "Error has occurred for registering customer, ";
                    var11_12 = new StringBuilder((String)var13_16);
                    var11_12.append((String)var21_30);
                    var21_30 = var11_12.toString();
                    hv3_0.o0(0, (String)var21_30, null);
                    ** continue;
                }
                break block39;
            }
            var19_27 = R$string.something_wrong_msg;
            var2_2 = hv3_0.K(var19_27);
            hv3_0.o0(0, (String)var2_2, null);
        }
    }
}

