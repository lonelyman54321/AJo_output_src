/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZE3
 */
public final class ze3_1
implements Function1 {
    public final /* synthetic */ af3_1 a;
    public final /* synthetic */ op2_2 b;

    public /* synthetic */ ze3_1(af3_1 af3_12, op2_2 op2_22) {
        this.a = af3_12;
        this.b = op2_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block20: {
            block22: {
                block21: {
                    var1_1 = (rz2_0)var1_1;
                    var2_2 = this.a;
                    Intrinsics.checkNotNullParameter(var2_2, "this$0");
                    Intrinsics.checkNotNull(var1_1);
                    var2_2.getClass();
                    var3_3 = var1_1.a;
                    var4_4 = hj_1.WALLET;
                    if (var3_3 != var4_4) break block20;
                    var1_1 = var1_1.b;
                    var5_5 = var1_1.getStatus();
                    var6_6 = 1;
                    var7_7 = var2_2.b;
                    if (var5_5 != 0) break block21;
                    var1_1 = (PriceValidation)var1_1.getData();
                    var5_5 = 0;
                    var3_3 = null;
                    if (var1_1 != null) {
                        var8_8 = var1_1.getError();
                    } else {
                        var9_9 = false;
                        var8_8 = null;
                    }
                    if (var8_8 == null) ** GOTO lbl-1000
                    var8_8 = var1_1.getError();
                    if (var8_8 != null) {
                        var8_8 = var8_8.getCode();
                    } else {
                        var9_9 = false;
                        var8_8 = null;
                    }
                    var9_9 = TextUtils.isEmpty((CharSequence)var8_8);
                    if (!var9_9) {
                        var3_3 = this.b;
                        if (var3_3 != null) {
                            var8_8 = var1_1.getError();
                            var10_10 = var2_2.d;
                            var11_11 = var10_10.n8();
                            var12_12 = var10_10.D();
                            var3_3.b((Error)var8_8, var11_11, var12_12);
                        }
                        var3_3 = new Intent();
                        var8_8 = new Bundle();
                        var1_1 = JsonUtils.toJson(var1_1.getError());
                        var10_10 = "transactionresponse";
                        var8_8.putString((String)var10_10, (String)var1_1);
                        var1_1 = "backendCartError";
                        var8_8.putBoolean((String)var1_1, (boolean)var6_6);
                        var3_3.putExtras((Bundle)var8_8);
                        if (var7_7 != null) {
                            var7_7.M5((Intent)var3_3);
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (var1_1 != null) {
                            var4_4 = var1_1.getPriceSplitup();
                        } else {
                            var6_6 = 0;
                            var4_4 = null;
                        }
                        if (var4_4 != null && (var4_4 = var2_2.j) != null) {
                            var4_4 = var1_1.getPriceSplitup();
                            if (var4_4 != null) {
                                var4_4 = var4_4.getOfferDetails();
                            } else {
                                var6_6 = 0;
                                var4_4 = null;
                            }
                            if (var4_4 != null && (var4_4 = var2_2.j) != null) {
                                var8_8 = var1_1.getPriceSplitup();
                                if (var8_8 != null) {
                                    var3_3 = var8_8.getOfferDetails();
                                }
                                var4_4.setOfferDetails((OfferDetails)var3_3);
                            }
                            if ((var3_3 = var2_2.j) != null) {
                                var3_3.setPriceValidation((PriceValidation)var1_1);
                            }
                            if (var7_7 != null) {
                                var3_3 = Boolean.TRUE;
                                var7_7.Ka((PriceValidation)var1_1, (Boolean)var3_3);
                            }
                        }
                        if (var7_7 != null) {
                            var7_7.hideProgressView();
                        }
                    }
                    break block22;
                }
                var13_13 = var1_1.getStatus();
                if (var13_13 == var6_6 && var7_7 != null) {
                    var7_7.hideProgressView();
                }
            }
            if ((var1_1 = var2_2.g) != null) {
                var1_1.notifyDataSetChanged();
            }
        }
        return Unit.a;
    }
}

