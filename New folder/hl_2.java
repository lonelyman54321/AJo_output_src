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
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from HL
 */
public final class hl_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block41: {
            block43: {
                block42: {
                    var2_2 = this.a;
                    switch (var2_2) {
                        default: {
                            var1_1 = (String)var1_1;
                            var3_3 = (e00)this.b;
                            var4_5 = "this$0";
                            Intrinsics.checkNotNullParameter(var3_3, (String)var4_5);
                            if (var1_1 != null && (var5_7 = var1_1.length()) != 0) {
                                var4_5 = ",";
                                var6_9 = new String[]{var4_5};
                                var7_11 = 0.0f;
                                var8_13 = null;
                                var9_15 = (var1_1 = StringsKt.a0((CharSequence)var1_1, (String[])var6_9, false, 0, 6)).size();
                                if (var9_15 < (var10_17 = CMSConfigInitializer.getRvMin())) {
                                    var1_1 = var3_3.g().d;
                                    var3_3.n((ArrayList)var1_1);
                                } else {
                                    var9_15 = var1_1.size();
                                    if (var9_15 > (var10_17 = CMSConfigInitializer.getRvMax())) {
                                        var9_15 = var1_1.size();
                                        var10_17 = CMSConfigInitializer.getRvMax();
                                        var9_15 -= var10_17;
                                        var10_17 = CMSConfigInitializer.getRvMax() + var9_15;
                                        var1_1 = var1_1.subList(var9_15, var10_17);
                                    }
                                    var1_1 = ((Iterable)var1_1).iterator();
                                    var6_9 = "";
                                    while ((var10_17 = (int)var1_1.hasNext()) != 0) {
                                        var11_19 = (String)var1_1.next();
                                        var6_9 = nb0_0.a((String)var6_9, (String)var11_19, (String)var4_5);
                                    }
                                    var12_21 = var6_9.length();
                                    if (var12_21 > 0) {
                                        StringsKt.V((String)var6_9, (String)var4_5);
                                    }
                                    if ((var12_21 = (var1_1 = var3_3.g().c).length()) == 0 || (var12_21 = (int)Intrinsics.areEqual(var1_1 = var3_3.g().c, var6_9)) == 0) {
                                        var1_1 = var3_3.g().d;
                                        var5_7 = var1_1.isEmpty() ^ 1;
                                        if (var5_7 != 0) {
                                            var1_1 = var1_1.iterator();
                                            while ((var5_7 = (int)var1_1.hasNext()) != 0) {
                                                var5_7 = ((Number)var1_1.next()).intValue();
                                                var11_19 = var3_3.f().b;
                                                var4_5 = var5_7;
                                                var11_19.remove(var4_5);
                                            }
                                        }
                                        var1_1 = var3_3.g();
                                        var1_1.getClass();
                                        Intrinsics.checkNotNullParameter(var6_9, "<set-?>");
                                        var1_1.c = var6_9;
                                        var1_1 = var3_3.f();
                                        var1_1.getClass();
                                        var3_3 = "HOME_RV_WIDGET";
                                        Intrinsics.checkNotNullParameter(var3_3, "requestID");
                                        n9_0.a.getClass();
                                        var3_3 = n9_0.b((String)var6_9, (String)var3_3);
                                        var4_5 = new lz_2((oz_2)var1_1);
                                        var6_9 = new mz_2(var4_5);
                                        var4_5 = new Object();
                                        var11_19 = new ez_2(var4_5);
                                        var3_3 = var3_3.f((o60_0)var6_9, (o60_0)var11_19);
                                        var1_1 = var1_1.g;
                                        var1_1.b((yr0_2)var3_3);
                                    } else {
                                        var1_1 = var3_3.g().d;
                                        var3_3.j((ArrayList)var1_1);
                                    }
                                }
                            } else {
                                var1_1 = var3_3.g().d;
                                var3_3.n((ArrayList)var1_1);
                            }
                            return Unit.a;
                        }
                        case 0: 
                    }
                    var1_1 = (rz2_0)var1_1;
                    var3_4 = (il_2)this.b;
                    Intrinsics.checkNotNullParameter(var3_4, "this$0");
                    var4_6 = var1_1.a;
                    var6_10 = hj_1.EXISTING_CARD;
                    if (var4_6 != var6_10) break block41;
                    cp_1.Companion.getClass();
                    var4_6 = cp$a.e();
                    var4_6.getClass();
                    var1_1 = var1_1.b;
                    var5_8 = cp_1.J((DataCallback)var1_1);
                    if (var5_8 == 0) break block41;
                    var5_8 = var1_1.getStatus();
                    var9_16 = 1;
                    if (var5_8 != 0) break block42;
                    var1_1 = (PriceValidation)var1_1.getData();
                    var5_8 = 0;
                    var4_6 = null;
                    if (var1_1 != null) {
                        var11_20 = var1_1.getError();
                    } else {
                        var10_18 = false;
                        var11_20 = null;
                    }
                    if (var11_20 == null) ** GOTO lbl-1000
                    var11_20 = var1_1.getError();
                    if (var11_20 != null) {
                        var11_20 = var11_20.getCode();
                    } else {
                        var10_18 = false;
                        var11_20 = null;
                    }
                    var10_18 = TextUtils.isEmpty((CharSequence)var11_20);
                    if (!var10_18) {
                        var4_6 = var3_4.a;
                        if (var4_6 != null) {
                            var11_20 = var1_1.getError();
                            var8_14 = var3_4.d;
                            var13_23 = var8_14.n8();
                            var7_12 = var8_14.D();
                            var4_6.b((Error)var11_20, var13_23, var7_12);
                        }
                        var4_6 = new Intent();
                        var11_20 = new Bundle();
                        var1_1 = JsonUtils.toJson(var1_1.getError());
                        var8_14 = "transactionresponse";
                        var11_20.putString((String)var8_14, (String)var1_1);
                        var11_20.putBoolean("backendCartError", (boolean)var9_16);
                        var4_6.putExtras((Bundle)var11_20);
                        var1_1 = var3_4.c;
                        if (var1_1 != null) {
                            var1_1.M5((Intent)var4_6);
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (var1_1 != null) {
                            var6_10 = var1_1.getPriceSplitup();
                        } else {
                            var9_16 = 0;
                            var6_10 = null;
                        }
                        if (var6_10 != null && (var6_10 = var3_4.e) != null) {
                            var6_10 = var1_1.getPriceSplitup();
                            if (var6_10 != null) {
                                var6_10 = var6_10.getOfferDetails();
                            } else {
                                var9_16 = 0;
                                var6_10 = null;
                            }
                            if (var6_10 != null && (var6_10 = var3_4.e) != null) {
                                var11_20 = var1_1.getPriceSplitup();
                                if (var11_20 != null) {
                                    var11_20 = var11_20.getOfferDetails();
                                } else {
                                    var10_18 = false;
                                    var11_20 = null;
                                }
                                var6_10.setOfferDetails((OfferDetails)var11_20);
                            }
                            if ((var6_10 = var1_1.getPriceSplitup()) != null) {
                                var6_10 = var6_10.getLoyalty();
                            } else {
                                var9_16 = 0;
                                var6_10 = null;
                            }
                            if (var6_10 != null) {
                                var6_10 = var3_4.e;
                                if (var6_10 != null) {
                                    var11_20 = var1_1.getPriceSplitup();
                                    if (var11_20 != null) {
                                        var4_6 = var11_20.getLoyalty();
                                    }
                                    var6_10.setLoyalty((Loyalty)var4_6);
                                }
                            } else {
                                var6_10 = var3_4.e;
                                if (var6_10 != null) {
                                    var6_10.setLoyalty(null);
                                }
                            }
                            if ((var4_6 = var3_4.e) != null) {
                                var4_6.setPriceValidation((PriceValidation)var1_1);
                            }
                            if ((var4_6 = var3_4.c) != null) {
                                var6_10 = Boolean.TRUE;
                                var4_6.Ka((PriceValidation)var1_1, (Boolean)var6_10);
                            }
                        }
                        if ((var1_1 = var3_4.c) != null) {
                            var1_1.hideProgressView();
                        }
                    }
                    break block43;
                }
                var12_22 = var1_1.getStatus();
                if (var12_22 == var9_16 && (var1_1 = var3_4.c) != null) {
                    var1_1.hideProgressView();
                }
            }
            var1_1 = var3_4.i;
            var1_1.notifyDataSetChanged();
        }
        return Unit.a;
    }
}

