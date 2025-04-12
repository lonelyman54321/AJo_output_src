/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZE1
 */
public final class ze1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ze1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.a;
        switch (var2_2) {
            default: {
                var1_1 = (rz2_0)var1_1;
                var3_3 = (h)this.b;
                Intrinsics.checkNotNullParameter(var3_3, "this$0");
                var4_5 = var1_1.a;
                var5_7 /* !! */  = hj_1.ADD_CARD;
                if (var4_5 != var5_7 /* !! */ ) ** GOTO lbl91
                var4_5 = var3_3.e;
                var5_7 /* !! */  = null;
                if (var4_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    var6_8 = 0;
                    var4_5 = null;
                }
                var4_5.dismiss();
                var1_1 = var1_1.b;
                var6_8 = var1_1.getStatus();
                var7_9 = 1;
                if (var6_8 != 0) ** GOTO lbl78
                var4_5 = var1_1.getData();
                if (var4_5 == null) ** GOTO lbl-1000
                var4_5 = (PriceValidation)var1_1.getData();
                if (var4_5 != null) {
                    var4_5 = var4_5.getError();
                } else {
                    var6_8 = 0;
                    var4_5 = null;
                }
                if (var4_5 == null) ** GOTO lbl-1000
                var4_5 = (PriceValidation)var1_1.getData();
                if (var4_5 != null && (var4_5 = var4_5.getError()) != null) {
                    var4_5 = var4_5.getCode();
                } else {
                    var6_8 = 0;
                    var4_5 = null;
                }
                var6_8 = (int)TextUtils.isEmpty((CharSequence)var4_5);
                if (var6_8 == 0) {
                    var4_5 = var3_3.Pa();
                    var8_10 = (PriceValidation)var1_1.getData();
                    var8_10 = var8_10 != null ? var8_10.getError() : null;
                    var9_11 = var3_3.Qa().E;
                    var10_12 = var3_3.Qa();
                    var11_13 = var10_12.o;
                    var4_5.b((Error)var8_10, var9_11, var11_13);
                    var1_1 = (PriceValidation)var1_1.getData();
                    if (var1_1 != null) {
                        var1_1 = var1_1.getError();
                    } else {
                        var12_14 = 0;
                        var1_1 = null;
                    }
                    var1_1 = JsonUtils.toJson(var1_1);
                    var4_5 = var3_3.Qa();
                    var13_15 = 9;
                    var11_13 = 0.0f;
                    var10_12 = null;
                    var8_10 = new hj2_0((String)var1_1, var13_15, false, (boolean)var7_9);
                    var4_5.c((hj2_0)var8_10);
                    var1_1 = var3_3.G;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationClickListener");
                        var12_14 = 0;
                        var1_1 = null;
                    }
                    var1_1.onNavigationClick();
                } else if ((var4_5 = var1_1.getData()) != null) {
                    var3_3.F = var4_5 = (PriceValidation)var1_1.getData();
                    var4_5 = (PriceValidation)var1_1.getData();
                    var3_3.Ua((PriceValidation)var4_5);
                    var4_5 = var3_3.Qa();
                    var1_1 = (PriceValidation)var1_1.getData();
                    if (var1_1 != null) {
                        var1_1 = var1_1.getLuxeDetails();
                    } else {
                        var12_14 = 0;
                        var1_1 = null;
                    }
                    var4_5.g = var1_1;
                }
                ** GOTO lbl81
lbl78:
                // 1 sources

                var12_14 = var1_1.getStatus();
                if (var12_14 == var7_9) {
                    var3_3.Va();
                }
lbl81:
                // 5 sources

                var12_14 = (int)var3_3.H;
                if (var12_14) {
                    var1_1 = var3_3.f;
                    if (var1_1 == null) {
                        var1_1 = "checkBox";
                        Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
                    } else {
                        var5_7 /* !! */  = var1_1;
                    }
                    var12_14 = (int)var5_7 /* !! */ .isChecked();
                    var3_3.Ta((boolean)var12_14);
                }
lbl91:
                // 4 sources

                return Unit.a;
            }
            case 0: 
        }
        var1_1 = (Throwable)var1_1;
        var4_6 = (bf1_2)this.b;
        Intrinsics.checkNotNullParameter(var4_6, "this$0");
        var3_4 = var4_6.f;
        Intrinsics.checkNotNull(var1_1);
        var1_1 = var4_6.d.handleApiException((Throwable)var1_1, "BackGround_AllCMSCategories");
        var3_4.k(var1_1);
        return Unit.a;
    }
}

