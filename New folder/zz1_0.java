/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.User;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from Zz1
 */
public final class zz1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zz1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block55: {
            block56: {
                block57: {
                    var2_2 = this.b;
                    var3_3 /* !! */  = "this$0";
                    var4_4 = 1;
                    var5_5 = this.a;
                    switch (var5_5) {
                        default: {
                            var6_6 = var1_1;
                            var6_6 = (DataCallback)var1_1;
                            var2_2 = (hy3_0)var2_2;
                            Intrinsics.checkNotNullParameter(var2_2, (String)var3_3 /* !! */ );
                            var2_2.u.k(var6_6);
                            return Unit.a;
                        }
                        case 1: {
                            var6_7 = var1_1;
                            var6_7 = (DataCallback)var1_1;
                            var2_2 = (ky1_0)var2_2;
                            Intrinsics.checkNotNullParameter(var2_2, (String)var3_3 /* !! */ );
                            var2_2.m.k(var6_7);
                            return Unit.a;
                        }
                        case 0: 
                    }
                    var7_11 = var1_1;
                    var7_11 = (DataCallback)var1_1;
                    var2_2 = (da1_1)var2_2;
                    Intrinsics.checkNotNullParameter(var2_2, (String)var3_3 /* !! */ );
                    var3_3 /* !! */  = cp_1.Companion;
                    var8_12 = nn_2.b((cp$a)var3_3 /* !! */ , (DataCallback)var7_11);
                    if (var8_12 == 0) break block55;
                    var3_3 /* !! */  = var2_2.A;
                    if (var3_3 /* !! */  != null) {
                        var3_3 /* !! */ .stopLoader();
                    }
                    var8_12 = var7_11.getStatus();
                    var9_13 /* !! */  = null;
                    var10_14 /* !! */  = "Glad your're back";
                    var11_15 = "format(...)";
                    var12_16 = 32;
                    var13_17 = "gaScreenName";
                    var14_18 = "Start shopping - Failure";
                    if (var8_12 != 0) break block56;
                    var3_3 /* !! */  = var7_11.getData();
                    var15_19 /* !! */  = var3_3 /* !! */ ;
                    var15_19 /* !! */  = (User)var3_3 /* !! */ ;
                    if (var15_19 /* !! */  != null) {
                        var3_3 /* !! */  = var15_19 /* !! */ .getMessage();
                    } else {
                        var8_12 = 0;
                        var3_3 /* !! */  = null;
                    }
                    if (var3_3 /* !! */  == null) break block57;
                    var3_3 /* !! */  = var15_19 /* !! */ .getMessage();
                    var7_11 = "getMessage(...)";
                    Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , (String)var7_11);
                    var8_12 = var3_3 /* !! */ .length();
                    if (var8_12 <= 0) break block57;
                    var6_8 = var2_2.k;
                    Intrinsics.checkNotNull(var6_8);
                    var3_3 /* !! */  = var15_19 /* !! */ .getMessage();
                    Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , (String)var7_11);
                    var6_8.setVisibility(0);
                    ai0_2.a((View)var6_8);
                    var6_8.setText((CharSequence)var3_3 /* !! */ );
                    var2_2.Ua();
                    var16_21 = var2_2.y;
                    if (var16_21) {
                        var6_8 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var3_3 /* !! */  = var2_2.l;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */  = var3_3 /* !! */ .getText().toString();
                        var5_5 = var3_3 /* !! */ .length() - var4_4;
                        var17_24 = 0;
                        var10_14 /* !! */  = null;
                        var18_27 = false;
                        var11_15 = null;
                        while (var17_24 <= var5_5) {
                            var19_28 = var18_27 == false ? var17_24 : var5_5;
                            if ((var19_28 = Intrinsics.compare(var3_3 /* !! */ .charAt(var19_28), var12_16)) <= 0) {
                                var19_28 = 1;
                            } else {
                                var19_28 = 0;
                                var20_30 = null;
                            }
                            if (!var18_27) {
                                if (var19_28 == 0) {
                                    var18_27 = true;
                                    continue;
                                }
                                var17_24 += var4_4;
                                continue;
                            }
                            if (var19_28 == 0) break;
                            var5_5 += -1;
                        }
                        var3_3 /* !! */  = com.jio.jioads.adinterfaces.a.a(var5_5, var4_4, var17_24, (String)var3_3 /* !! */ );
                        var2_2 = var2_2.F;
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var13_17);
                        } else {
                            var9_13 /* !! */  = var2_2;
                        }
                        var6_8.pushButtonTapEvent((String)var3_3 /* !! */ , var14_18, (String)var9_13 /* !! */ );
                    } else {
                        var6_8 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var2_2 = var2_2.F;
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var13_17);
                        } else {
                            var9_13 /* !! */  = var2_2;
                        }
                        var6_8.pushButtonTapEvent((String)var10_14 /* !! */ , var14_18, (String)var9_13 /* !! */ );
                    }
                    break block55;
                }
                var3_3 /* !! */  = var2_2.A;
                var7_11 = "OTP";
                if (var3_3 /* !! */  != null) {
                    var17_25 = var2_2.y;
                    var3_3 /* !! */ .H0((String)var7_11, (boolean)var17_25);
                }
                var3_3 /* !! */  = new HashMap();
                var10_14 /* !! */  = AnalyticsManager.Companion.getInstance().getCt();
                var13_17 = new AnalyticsData$Builder();
                var3_3 /* !! */  = var13_17.eventMap((HashMap)var3_3 /* !! */ ).build();
                var10_14 /* !! */ .loginComplete((AnalyticsData)var3_3 /* !! */ );
                var3_3 /* !! */  = var2_2.A;
                Intrinsics.checkNotNull(var3_3 /* !! */ );
                var17_25 = var2_2.y;
                var21_33 = var2_2.v;
                var14_18 = var2_2.u;
                var3_3 /* !! */ .f0(var14_18, (boolean)var17_25, (boolean)var21_33);
                var3_3 /* !! */  = var2_2.Ra();
                var17_25 = var2_2.z;
                var13_17 = "IS_INPUT_MOBILENUMBER";
                var3_3 /* !! */ .putPreference((String)var13_17, (boolean)var17_25);
                var8_12 = (int)var2_2.z;
                if (var8_12 != 0) {
                    var3_3 /* !! */  = var2_2.Ra();
                    var10_14 /* !! */  = var2_2.t;
                    if (var10_14 /* !! */  != null) {
                        var13_17 = "INPUT_MOBILE_NUMBER";
                        var3_3 /* !! */ .putPreference((String)var13_17, (String)var10_14 /* !! */ );
                    } else {
                        var3_3 /* !! */ .getClass();
                    }
                } else {
                    var3_3 /* !! */  = var2_2.Ra();
                    var10_14 /* !! */  = var2_2.t;
                    if (var10_14 /* !! */  != null) {
                        var13_17 = "INPUT_EMAIL_ID";
                        var3_3 /* !! */ .putPreference((String)var13_17, (String)var10_14 /* !! */ );
                    } else {
                        var3_3 /* !! */ .getClass();
                    }
                }
                if (var15_19 /* !! */  == null) break block55;
                var3_3 /* !! */  = bv1_0.f;
                if (var3_3 /* !! */  == null || (var8_12 = var3_3 /* !! */ .length()) == 0) {
                    bv1_0.f = var7_11;
                }
                var20_31 = var2_2.A;
                Intrinsics.checkNotNull(var20_31);
                var3_3 /* !! */  = var2_2.p;
                Intrinsics.checkNotNull(var3_3 /* !! */ );
                var22_34 = var3_3 /* !! */ .A;
                var3_3 /* !! */  = var2_2.f;
                Intrinsics.checkNotNull(var3_3 /* !! */ );
                var3_3 /* !! */  = var3_3 /* !! */ .getText();
                var7_11 = "";
                if (var3_3 /* !! */  == null || (var3_3 /* !! */  = var3_3 /* !! */ .toString()) == null) ** GOTO lbl-1000
                var17_25 = var3_3 /* !! */ .length() - var4_4;
                var21_33 = 0;
                var13_17 = null;
                var23_36 = false;
                var14_18 = null;
                while (var21_33 <= var17_25) {
                    var16_22 = var23_36 == false ? var21_33 : var17_25;
                    if ((var16_22 = Intrinsics.compare(var3_3 /* !! */ .charAt(var16_22), var12_16)) <= 0) {
                        var16_22 = 1;
                    } else {
                        var16_22 = 0;
                        var6_9 = null;
                    }
                    if (!var23_36) {
                        if (var16_22 == 0) {
                            var23_36 = true;
                            continue;
                        }
                        var21_33 += var4_4;
                        continue;
                    }
                    if (var16_22 == 0) break;
                    var17_25 += -1;
                }
                if ((var6_9 = com.jio.jioads.adinterfaces.a.a(var17_25, var4_4, var21_33, (String)var3_3 /* !! */ )) != null) {
                    var24_37 = var6_9;
                } else lbl-1000:
                // 2 sources

                {
                    var24_37 = var7_11;
                }
                var25_38 = "";
                var16_22 = var20_31.Q0((User)var15_19 /* !! */ , var22_34, (String)var24_37, false, var25_38);
                if (var16_22 == 0) {
                    var6_9 = var2_2.A;
                    if (var6_9 != null) {
                        var6_9.stopLoader();
                    }
                    var6_9 = StringCompanionObject.INSTANCE;
                    var16_22 = R$string.acc_error_message;
                    var6_9 = hv3_0.K(var16_22);
                    var2_2 = hv3_0.K(R$string.cannot_login);
                    var3_3 /* !! */  = new Object[var4_4];
                    var3_3 /* !! */ [0] = var2_2;
                    var6_9 = xh2_0.a(var3_3 /* !! */ , var4_4, (String)var6_9, var11_15);
                    var26_39 = R$string.cannot_login;
                    var2_2 = hv3_0.K(var26_39);
                    hv3_0.o0(0, (String)var2_2, (String)var6_9);
                } else {
                    var6_9 = var2_2.o;
                    if (var6_9 != null) {
                        var6_9 = var6_9.getFirstName();
                    } else {
                        var16_22 = 0;
                        var6_9 = null;
                    }
                    if (var6_9 == null) {
                        var16_22 = R$string.registration_success_noname;
                        var6_9 = hv3_0.K(var16_22);
                        hv3_0.o0(0, (String)var6_9, null);
                    } else {
                        var6_9 = StringCompanionObject.INSTANCE;
                        var16_22 = R$string.registration_success;
                        var6_9 = hv3_0.K(var16_22);
                        var2_2 = var2_2.o;
                        if (var2_2 != null) {
                            var2_2 = var2_2.getFirstName();
                        } else {
                            var26_40 = false;
                            var2_2 = null;
                        }
                        var2_2 = mz3_0.P((String)var2_2);
                        var8_12 = 2;
                        var10_14 /* !! */  = new Object[var8_12];
                        var10_14 /* !! */ [0] = var2_2;
                        var10_14 /* !! */ [var4_4] = var7_11;
                        var6_9 = xh2_0.a(var10_14 /* !! */ , var8_12, (String)var6_9, var11_15);
                        hv3_0.o0(0, (String)var6_9, null);
                    }
                }
                break block55;
            }
            var16_23 = var7_11.getStatus();
            if (var16_23 == var4_4) {
                var6_10 = var7_11.getError();
                var8_12 = (int)var2_2.y;
                if (var8_12 != 0) {
                    var3_3 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var7_11 = var2_2.l;
                    Intrinsics.checkNotNull(var7_11);
                    var7_11 = var7_11.getText().toString();
                    var17_26 = var7_11.length() - var4_4;
                    var19_29 = 0;
                    var20_32 = null;
                    var27_41 = false;
                    var15_20 = null;
                    while (var19_29 <= var17_26) {
                        var22_35 = var27_41 == false ? var19_29 : var17_26;
                        var22_35 = Intrinsics.compare(var7_11.charAt(var22_35), var12_16);
                        var22_35 = var22_35 <= 0 ? 1 : 0;
                        if (!var27_41) {
                            if (var22_35 == 0) {
                                var27_41 = true;
                                continue;
                            }
                            var19_29 += var4_4;
                            continue;
                        }
                        if (var22_35 == 0) break;
                        var17_26 += -1;
                    }
                    var7_11 = com.jio.jioads.adinterfaces.a.a(var17_26, var4_4, var19_29, (String)var7_11);
                    var10_14 /* !! */  = var2_2.F;
                    if (var10_14 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var13_17);
                        var17_26 = 0;
                        var10_14 /* !! */  = null;
                    }
                    var3_3 /* !! */ .pushButtonTapEvent((String)var7_11, var14_18, (String)var10_14 /* !! */ );
                } else {
                    var3_3 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var7_11 = var2_2.F;
                    if (var7_11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var13_17);
                        var5_5 = 0;
                        var7_11 = null;
                    }
                    var3_3 /* !! */ .pushButtonTapEvent((String)var10_14 /* !! */ , var14_18, (String)var7_11);
                }
                var2_2.Ua();
                if (var6_10 != null) {
                    var9_13 /* !! */  = var6_10.getErrors();
                }
                if (var9_13 /* !! */  != null) {
                    var6_10 = var6_10.getErrors().iterator();
                    while ((var8_12 = (int)var6_10.hasNext()) != 0) {
                        var3_3 /* !! */  = (DataError$ErrorMessage)var6_10.next();
                        var7_11 = var3_3 /* !! */ .getSubject();
                        if (var7_11 != null) {
                            var7_11 = var3_3 /* !! */ .getSubject();
                            var9_13 /* !! */  = "getSubject(...)";
                            Intrinsics.checkNotNullExpressionValue(var7_11, (String)var9_13 /* !! */ );
                            var5_5 = var7_11.length();
                            if (var5_5 != 0) {
                                var8_12 = (int)kotlin.text.b.i((String)(var3_3 /* !! */  = var3_3 /* !! */ .getSubject()), (String)(var7_11 = "mobileNumber"), (boolean)var4_4);
                                if (var8_12 == 0) continue;
                                var2_2.Qa();
                                continue;
                            }
                        }
                        var3_3 /* !! */  = var3_3 /* !! */ .getMessage();
                        var3_3 /* !! */  = kp1_0.c("Error has occurred for registering customer, ", (String)var3_3 /* !! */ );
                        var7_11 = StringCompanionObject.INSTANCE;
                        var5_5 = R$string.acc_error_message;
                        var7_11 = hv3_0.K(var5_5);
                        var9_13 /* !! */  = new Object[var4_4];
                        var9_13 /* !! */ [0] = var3_3 /* !! */ ;
                        var7_11 = xh2_0.a(var9_13 /* !! */ , var4_4, (String)var7_11, var11_15);
                        hv3_0.o0(0, (String)var3_3 /* !! */ , (String)var7_11);
                    }
                }
            }
        }
        return Unit.a;
    }
}

