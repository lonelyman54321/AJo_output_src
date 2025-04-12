/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.options.CuratedWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from CZ
 */
public final class cz_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cz_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = 1;
        var3_3 = null;
        var4_4 = this.c;
        var5_5 /* !! */  = "this$0";
        var6_6 = this.b;
        var7_7 = 0;
        var8_8 = this.a;
        switch (var8_8) {
            default: {
                var1_1 = (Boolean)var1_1;
                var6_6 = (ex1_0)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5 /* !! */ );
                var9_9 = var1_1.booleanValue();
                if (var9_9 == 0) ** GOTO lbl83
                var1_1 = ((fc0_2)var6_6.O0.getValue()).a;
                var5_5 /* !! */  = Boolean.FALSE;
                var1_1.k(var5_5 /* !! */ );
                var4_4 = (Cart)var4_4;
                if (var4_4 != null && (var1_1 = var4_4.getAppliedVouchers()) != null) {
                    var9_9 = var1_1.size();
                } else {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var1_1 = null;
                }
                if (var9_9 <= 0) ** GOTO lbl-1000
                if (var4_4 != null && (var1_1 = var4_4.getAppliedVouchers()) != null && (var1_1 = (CartAppliedVoucher)var1_1.get(0)) != null) {
                    var1_1 = var1_1.getVoucherCode();
                } else {
                    var9_9 = 0;
                    var1_1 = null;
                    var10_10 = 0.0f;
                }
                var9_9 = (int)TextUtils.isEmpty((CharSequence)var1_1);
                if (var9_9 != 0) ** GOTO lbl-1000
                if (var4_4 != null && (var1_1 = var4_4.getVoucherAmount()) != null && (var1_1 = var1_1.getValue()) != null) {
                    var10_10 = Float.parseFloat((String)var1_1);
                } else {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var1_1 = null;
                }
                var11_11 = 1065353216;
                var12_12 = 1.0f;
                var9_9 = (int)(var10_10 == var12_12 ? 0 : (var10_10 > var12_12 ? 1 : -1));
                if (var9_9 >= 0) {
                    Y90.Companion.getClass();
                    var1_1 = new Y90();
                    if (var4_4 != null && (var13_13 = var4_4.getAppliedVouchers()) != null && (var13_13 = (CartAppliedVoucher)var13_13.get(0)) != null) {
                        var13_13 = var13_13.getVoucherCode();
                    } else {
                        var2_2 = 0;
                        var13_13 = null;
                    }
                    var1_1.f = var13_13;
                    if (var4_4 != null && (var13_13 = var4_4.getVoucherAmount()) != null) {
                        var3_3 = var13_13.getValue();
                    }
                    var1_1.g = var3_3;
                    var13_13 = var6_6.requireActivity().getSupportFragmentManager();
                    var3_3 = "CouponAppliedDialog";
                    var1_1.show((FragmentManager)var13_13, (String)var3_3);
                } else lbl-1000:
                // 3 sources

                {
                    var1_1 = StringCompanionObject.INSTANCE;
                    var9_9 = R$string.acc_alert_message;
                    var1_1 = hv3_0.K(var9_9);
                    var14_15 = R$string.coupon_applied_success_refresh;
                    var4_4 = hv3_0.K(var14_15);
                    var5_5 /* !! */  = new Object[var2_2];
                    var5_5 /* !! */ [0] = var4_4;
                    var1_1 = xh2_0.a(var5_5 /* !! */ , var2_2, (String)var1_1, "format(...)");
                    var4_4 = var6_6.m;
                    if (var4_4 == null) {
                        var4_4 = "activityFragmentListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    } else {
                        var3_3 = var4_4;
                    }
                    AJIOApplication.Companion.getClass();
                    var4_4 = AJIOApplication$a.a();
                    var11_11 = R$string.coupon_applied_success_refresh;
                    var5_5 /* !! */  = hv3_0.K(var11_11);
                    var3_3.showToastNotification((Context)var4_4, (String)var5_5 /* !! */ , var2_2, (String)var1_1);
                }
                var9_9 = (int)h40_0.Q1();
                if (var9_9 != 0) {
                    var6_6.Gb();
                }
lbl83:
                // 4 sources

                return Unit.a;
            }
            case 0: 
        }
        var1_1 = (DataCallback)var1_1;
        var6_6 = (WidgetRecord)var6_6;
        Intrinsics.checkNotNullParameter(var6_6, "$widgetRecord");
        var4_4 = (oz_2)var4_4;
        Intrinsics.checkNotNullParameter(var4_4, (String)var5_5 /* !! */ );
        var13_14 = var6_6.getAdapterPositionOfWidget();
        var1_1.setExtraErrorData(var13_14);
        var13_14 = cp_1.Companion;
        var2_2 = nn_2.b((cp$a)var13_14, (DataCallback)var1_1);
        if (var2_2 != 0) {
            Intrinsics.checkNotNull(var1_1);
            var2_2 = var1_1.getStatus();
            if (var2_2 == 0) {
                var1_1 = (CuratedWidget)var1_1.getData();
                var13_14 = var6_6.getAdapterPositionOfWidget();
                if (var13_14 != null) {
                    var7_7 = var13_14.intValue();
                }
                var4_4.d((CuratedWidget)var1_1, var7_7);
            } else {
                var1_1 = var6_6.getAdapterPositionOfWidget();
                if (var1_1 != null) {
                    var7_7 = var1_1.intValue();
                }
                var4_4.d(null, var7_7);
            }
        }
        return Unit.a;
    }
}

