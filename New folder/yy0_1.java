/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yy0
 */
public final class yy0_1
implements Function1 {
    public final /* synthetic */ zy0_1 a;

    public /* synthetic */ yy0_1(zy0_1 zy0_12) {
        this.a = zy0_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block19: {
            block21: {
                block20: {
                    var1_1 = (rz2_0)var1_1;
                    var2_2 = this.a;
                    Intrinsics.checkNotNullParameter(var2_2, "this$0");
                    Intrinsics.checkNotNull(var1_1);
                    var2_2.getClass();
                    var3_3 = var1_1.a;
                    var4_4 = hj_1.EMI;
                    if (var3_3 != var4_4) break block19;
                    var1_1 = var1_1.b;
                    var5_5 = var1_1.getStatus();
                    if (var5_5 != 0) break block20;
                    var1_1 = (PriceValidation)var1_1.getData();
                    var5_5 = 0;
                    var3_3 = null;
                    if (var1_1 != null) {
                        var4_4 = var1_1.getError();
                    } else {
                        var6_6 = false;
                        var4_4 = null;
                    }
                    if (var4_4 == null) ** GOTO lbl-1000
                    var4_4 = var1_1.getError();
                    if (var4_4 != null) {
                        var4_4 = var4_4.getCode();
                    } else {
                        var6_6 = false;
                        var4_4 = null;
                    }
                    var6_6 = TextUtils.isEmpty((CharSequence)var4_4);
                    if (!var6_6) {
                        var1_1 = var2_2.d;
                        if (var1_1 != null) {
                            var1_1.h();
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (var1_1 != null && (var4_4 = var1_1.getLuxeDetails()) != null && (var7_7 = var2_2.b) != null) {
                            var7_7.g = var4_4;
                        }
                        if (var1_1 != null) {
                            var4_4 = var1_1.getPriceSplitup();
                        } else {
                            var6_6 = false;
                            var4_4 = null;
                        }
                        if (var4_4 != null && (var4_4 = var2_2.c) != null) {
                            var4_4 = var1_1.getPriceSplitup();
                            if (var4_4 != null) {
                                var4_4 = var4_4.getOfferDetails();
                            } else {
                                var6_6 = false;
                                var4_4 = null;
                            }
                            if (var4_4 != null && (var4_4 = var2_2.c) != null) {
                                var7_7 = var1_1.getPriceSplitup();
                                if (var7_7 != null) {
                                    var3_3 = var7_7.getOfferDetails();
                                }
                                var4_4.setOfferDetails((OfferDetails)var3_3);
                            }
                            if ((var3_3 = var2_2.c) != null) {
                                var3_3.setPriceValidation((PriceValidation)var1_1);
                            }
                        }
                        if ((var1_1 = var2_2.d) != null) {
                            var1_1.h();
                        }
                    }
                    break block21;
                }
                var8_8 = var1_1.getStatus();
                if (var8_8 == (var5_5 = 1) && (var1_1 = var2_2.d) != null) {
                    var1_1.h();
                }
            }
            if ((var1_1 = var2_2.d) != null) {
                var1_1.o();
            }
        }
        return Unit.a;
    }
}

