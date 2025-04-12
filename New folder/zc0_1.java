/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zc0
 */
public final class zc0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zc0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.a;
        switch (var2_2) {
            default: {
                var1_1 = (DataCallback)var1_1;
                var3_3 = (ys2_1)this.b;
                Intrinsics.checkNotNullParameter(var3_3, "this$0");
                var3_3.c.k(var1_1);
                return Unit.a;
            }
            case 1: {
                var1_1 = (rz2_0)var1_1;
                var3_4 = (zu1_1)this.b;
                Intrinsics.checkNotNullParameter(var3_4, "this$0");
                Intrinsics.checkNotNull(var1_1);
                var3_4.getClass();
                var4_6 = var1_1.a;
                var5_8 = hj_1.NET_BANKING;
                if (var4_6 != var5_8) ** GOTO lbl72
                var1_1 = var1_1.b;
                var2_2 = var1_1.getStatus();
                if (var2_2 != 0) ** GOTO lbl67
                var1_1 = (PriceValidation)var1_1.getData();
                var2_2 = 0;
                var4_6 = null;
                if (var1_1 != null) {
                    var5_8 = var1_1.getError();
                } else {
                    var6_9 = false;
                    var5_8 = null;
                }
                if (var5_8 == null) ** GOTO lbl-1000
                var5_8 = var1_1.getError();
                if (var5_8 != null) {
                    var5_8 = var5_8.getCode();
                } else {
                    var6_9 = false;
                    var5_8 = null;
                }
                var6_9 = TextUtils.isEmpty((CharSequence)var5_8);
                if (!var6_9) {
                    var1_1 = var3_4.d;
                    if (var1_1 != null) {
                        var1_1.h();
                    }
                } else lbl-1000:
                // 2 sources

                {
                    if (var1_1 != null && (var5_8 = var1_1.getLuxeDetails()) != null && (var7_10 = var3_4.b) != null) {
                        var7_10.g = var5_8;
                    }
                    if (var1_1 != null) {
                        var5_8 = var1_1.getPriceSplitup();
                    } else {
                        var6_9 = false;
                        var5_8 = null;
                    }
                    if (var5_8 != null && (var5_8 = var3_4.c) != null) {
                        var5_8 = var1_1.getPriceSplitup();
                        if (var5_8 != null) {
                            var5_8 = var5_8.getOfferDetails();
                        } else {
                            var6_9 = false;
                            var5_8 = null;
                        }
                        if (var5_8 != null && (var5_8 = var3_4.c) != null) {
                            var7_10 = var1_1.getPriceSplitup();
                            if (var7_10 != null) {
                                var4_6 = var7_10.getOfferDetails();
                            }
                            var5_8.setOfferDetails((OfferDetails)var4_6);
                        }
                        if ((var4_6 = var3_4.c) != null) {
                            var4_6.setPriceValidation((PriceValidation)var1_1);
                        }
                    }
                    if ((var1_1 = var3_4.d) != null) {
                        var1_1.h();
                    }
                }
                ** GOTO lbl70
lbl67:
                // 1 sources

                var8_11 = var1_1.getStatus();
                if (var8_11 == (var2_2 = 1) && (var1_1 = var3_4.d) != null) {
                    var1_1.h();
                }
lbl70:
                // 5 sources

                if ((var1_1 = var3_4.d) != null) {
                    var1_1.o();
                }
lbl72:
                // 4 sources

                return Unit.a;
            }
            case 0: 
        }
        var3_5 = var1_1;
        var3_5 = (Throwable)var1_1;
        var4_7 = (fd0_2)this.b;
        Intrinsics.checkNotNullParameter(var4_7, "this$0");
        var1_1 = var4_7.c;
        var4_7 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(var3_5);
        var4_7 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)var4_7, (Throwable)var3_5, "OFFER_COUPON_LIST", false, null, null, 28, null);
        var1_1.k(var4_7);
        return Unit.a;
    }
}

