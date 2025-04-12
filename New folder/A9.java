/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.payment.juspay.JuspayActivity;
import com.ril.ajio.services.data.Payment.EmiSdkInformation;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class A9
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = 1;
        var3_3 = null;
        var4_4 = "this$0";
        var5_6 = this.b;
        var6_7 = this.a;
        switch (var6_7) {
            default: {
                var1_1 = (qu3)var1_1;
                var7_8 = SplashScreenActivity.Companion;
                var5_6 = (SplashScreenActivity)var5_6;
                Intrinsics.checkNotNullParameter(var5_6, (String)var4_4);
                if (var1_1 != null) ** GOTO lbl22
                var7_8 = "state";
                var4_4 = "failed";
                Intrinsics.checkNotNullParameter(var4_4, (String)var7_8);
                var5_6.getClass();
lbl18:
                // 3 sources

                while (true) {
                    var2_2 = 0;
                    var7_8 = null;
                    ** GOTO lbl41
                    break;
                }
lbl22:
                // 1 sources

                var7_8 = "<set-?>";
                var4_4 = "install";
                Intrinsics.checkNotNullParameter(var4_4, (String)var7_8);
                var1_1.f = var4_4;
                var5_6.getClass();
                var2_2 = var1_1.c;
                if (!var2_2) ** GOTO lbl33
                var3_3 = var1_1.a;
                var7_8 = var1_1.b;
                ** GOTO lbl41
lbl33:
                // 1 sources

                var7_8 = null;
                var8_13 = var1_1.e;
                cfr_temp_0 = var8_13 - 0.0f;
                var2_2 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var2_2 <= 0) ** GOTO lbl18
                var7_8 = var5_6.z2();
                var7_8.c((qu3)var1_1);
                ** continue;
lbl41:
                // 2 sources

                var4_4 = var1_1.g;
                if (var4_4 != null && (var9_15 = var4_4.length()) != 0) {
                    var7_8 = new Intent();
                    var1_1 = Uri.parse((String)var1_1.g);
                    var7_8.setData((Uri)var1_1);
                    var1_1 = new Bundle();
                    var5_6.p0 = var1_1;
                    var3_3 = "deeplinkData";
                    var1_1.putParcelable((String)var3_3, (Parcelable)var7_8);
                    var5_6.D2();
                } else {
                    var5_6.E2((String)var3_3, (String)var7_8);
                    var5_6.A2();
                }
                return Unit.a;
            }
            case 3: {
                var1_1 = (DataCallback)var1_1;
                var5_6 = (g)var5_6;
                Intrinsics.checkNotNullParameter(var5_6, (String)var4_4);
                Intrinsics.checkNotNullParameter(var1_1, "payNowCallback");
                var4_4 = cp_1.Companion;
                var9_16 = nn_2.b((cp$a)var4_4, (DataCallback)var1_1);
                if (var9_16 != 0) {
                    var4_4 = var5_6.c;
                    if (var4_4 != null) {
                        var4_4.h();
                    }
                    if ((var9_16 = var1_1.getStatus()) == 0) {
                        var1_1 = (EmiSdkInformation)var1_1.getData();
                        Objects.toString(var1_1);
                        var4_4 = var5_6.Wa();
                        var4_4 = var4_4.E;
                        try {
                            var3_3 = JsonUtils.toJson(var4_4);
                        }
                        catch (Exception var4_5) {
                            var10_18 = yn3_0.a;
                            var10_18.e(var4_5);
                        }
                        if (var3_3 != null && (var9_16 = var3_3.length()) != 0) {
                            var10_18 = var5_6.getActivity();
                            var11_21 = JuspayActivity.class;
                            var4_4 = new Intent((Context)var10_18, var11_21);
                            var10_18 = "data_emi_json";
                            var4_4.putExtra((String)var10_18, (Serializable)var1_1);
                            var4_4.putExtra("IS_EMI_FLOW", (boolean)var2_2);
                            var12_22 = var5_6.Wa().o;
                            var7_9 = "NET_PAYABLE";
                            var4_4.putExtra(var7_9, var12_22);
                            var1_1 = "TENANT_RESPONSE";
                            var4_4.putExtra((String)var1_1, (String)var3_3);
                            var13_24 = 1004;
                            var12_22 = 1.407E-42f;
                            var5_6.startActivityForResult((Intent)var4_4, var13_24);
                        } else {
                            Bo2.a();
                        }
                    }
                }
                return Unit.a;
            }
            case 2: {
                var1_1 = (DataCallback)var1_1;
                var10_19 = JuspayActivity.Companion;
                var5_6 = (JuspayActivity)var5_6;
                Intrinsics.checkNotNullParameter(var5_6, (String)var4_4);
                var4_4 = var5_6.Y;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    var9_17 = 0;
                    var4_4 = null;
                    var8_14 = 0.0f;
                }
                var4_4.dismiss();
                var9_17 = var1_1.getStatus();
                if (var9_17 == 0) {
                    var1_1 = JsonUtils.toJson((JsonObject)var1_1.getData());
                    var7_10 = PayNowResponse.class;
                    if ((var1_1 = (PayNowResponse)JsonUtils.fromJson((String)var1_1, var7_10)) != null && (var7_10 = var1_1.getError()) != null) {
                        var7_10 = var7_10.getDescription();
                    } else {
                        var2_2 = 0;
                        var7_10 = null;
                    }
                    if (var7_10 != null) {
                        var5_6.r2();
                    }
                    if (var1_1 != null) {
                        var3_3 = var1_1.getTransactionInformation();
                    }
                    if (var3_3 != null) {
                        var7_10 = new Intent();
                        var3_3 = "transactionresponse";
                        var1_1 = var7_10.putExtra((String)var3_3, (Serializable)var1_1);
                        var2_2 = -1;
                        var5_6.setResult(var2_2, (Intent)var1_1);
                        var5_6.finish();
                    }
                } else {
                    var13_25 = var1_1.getStatus();
                    if (var13_25 == var2_2) {
                        var5_6.r2();
                    }
                }
                return Unit.a;
            }
            case 1: {
                var3_3 = var1_1;
                var3_3 = (Throwable)var1_1;
                var5_6 = (ps_0)var5_6;
                Intrinsics.checkNotNullParameter(var5_6, (String)var4_4);
                var1_1 = var5_6.b;
                var7_11 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(var3_3);
                var7_11 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)var7_11, (Throwable)var3_3, "CartCheckout", false, null, null, 28, null);
                var1_1.k(var7_11);
                return Unit.a;
            }
            case 0: 
        }
        var1_1 = (BaseResponse)var1_1;
        var5_6 = (q9_0)var5_6;
        var5_6.E0 = var1_1;
        var7_12 = var5_6.X;
        var4_4 = "ajiohomeViewModel";
        if (var7_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
            var2_2 = 0;
            var7_12 = null;
        }
        if (var2_2 = var7_12.w) {
            var7_12 = var5_6.X;
            if (var7_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                var2_2 = 0;
                var7_12 = null;
            }
            var7_12 = var7_12.r;
            var10_20 = var5_6.E0;
            if (var10_20 != null && (var10_20 = (HomeData)var10_20.getData()) != null) {
                var10_20 = var10_20.getPageUrl();
            } else {
                var6_7 = 0;
                var10_20 = null;
            }
            var2_2 = (int)Intrinsics.areEqual(var7_12, var10_20);
            if (var2_2) {
                var5_6.D0 = var7_12 = Boolean.FALSE;
            }
        }
        if ((var7_12 = var5_6.D0) != null) {
            cp_1.Companion.getClass();
            var7_12 = cp$a.e();
            var7_12.getClass();
            var2_2 = (int)cp_1.I((BaseResponse)var1_1);
            if (var2_2) {
                var5_6.jb((BaseResponse)var1_1);
                var1_1 = var5_6.X;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var13_26 = false;
                    var1_1 = null;
                    var12_23 = 0.0f;
                }
                var1_1 = var1_1.r;
                var7_12 = var5_6.E0;
                if (var7_12 != null && (var7_12 = (HomeData)var7_12.getData()) != null) {
                    var7_12 = var7_12.getPageUrl();
                } else {
                    var2_2 = 0;
                    var7_12 = null;
                }
                var13_26 = Intrinsics.areEqual(var1_1, var7_12);
                if (var13_26) {
                    var1_1 = var5_6.X;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    } else {
                        var3_3 = var1_1;
                    }
                    var13_26 = false;
                    var12_23 = 0.0f;
                    var1_1 = null;
                    var3_3.w = false;
                }
            }
        }
        return Unit.a;
    }
}

