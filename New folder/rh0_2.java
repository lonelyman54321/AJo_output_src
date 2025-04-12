/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 */
import android.text.TextUtils;
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductStockLevelStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from RH0
 */
public final class rh0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rh0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = 0;
        var3_3 = null;
        var4_4 = "this$0";
        var5_5 /* !! */  = null;
        var6_6 = 1;
        var7_7 = this.b;
        var8_8 = this.a;
        switch (var8_8) {
            default: {
                var5_5 /* !! */  = var1_1;
                var5_5 /* !! */  = (Long)var1_1;
                var7_7 = (PDPVideoKYPHolder)var7_7;
                Intrinsics.checkNotNullParameter(var7_7, (String)var4_4);
                var4_4 = var7_7.p;
                if (var4_4 == null) {
                    var4_4 = "txtDuration";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                } else {
                    var3_3 = var4_4;
                }
                var4_4 = eb_2.a;
                Intrinsics.checkNotNull(var5_5 /* !! */ );
                var4_4 = eb_2.a(var5_5 /* !! */ .longValue());
                var3_3.setText((CharSequence)var4_4);
                return Unit.a;
            }
            case 2: {
                var9_9 = var1_1;
                var9_9 = (DataCallback)var1_1;
                var7_7 = (ex1_0)var7_7;
                Intrinsics.checkNotNullParameter(var7_7, (String)var4_4);
                var4_4 = cp_1.Companion;
                var10_10 = nn_2.b((cp$a)var4_4, (DataCallback)var9_9);
                if (var10_10 == 0) ** GOTO lbl247
                var10_10 = var9_9.getStatus();
                var11_11 = "format(...)";
                if (var10_10 == 0) ** GOTO lbl67
                if (var10_10 == var6_6) {
                    var4_4 = var9_9.getError();
                    if (var4_4 != null && (var9_9 = var4_4.getErrorMessage()) != null) {
                        var3_3 = var9_9.getMessage();
                    }
                    if (var3_3 != null && (var2_2 = var3_3.length()) != 0) {
                        var3_3 = StringCompanionObject.INSTANCE;
                        var2_2 = R$string.acc_error_message;
                        var3_3 = hv3_0.K(var2_2);
                        Intrinsics.checkNotNull(var4_4);
                        var9_9 = var4_4.getErrorMessage();
                        Intrinsics.checkNotNull(var9_9);
                        var9_9 = var9_9.getMessage();
                        var12_12 = new Object[var6_6];
                        var12_12[0] = var9_9;
                        var3_3 = xh2_0.a(var12_12, var6_6, (String)var3_3, var11_11);
                        var4_4 = var4_4.getErrorMessage();
                        Intrinsics.checkNotNull(var4_4);
                        var4_4 = var4_4.getMessage();
                        var7_7.kb((String)var4_4, (String)var3_3);
                    } else {
                        var3_3 = StringCompanionObject.INSTANCE;
                        var2_2 = R$string.acc_error_message;
                        var3_3 = hv3_0.K(var2_2);
                        var4_4 = hv3_0.K(R$string.something_wrong_msg);
                        var9_9 = new Object[var6_6];
                        var9_9[0] = var4_4;
                        var3_3 = xh2_0.a((Object[])var9_9, var6_6, (String)var3_3, var11_11);
                        var10_10 = R$string.something_wrong_msg;
                        var4_4 = hv3_0.K(var10_10);
                        var7_7.kb((String)var4_4, (String)var3_3);
                    }
                }
                ** GOTO lbl247
lbl67:
                // 1 sources

                var4_4 = var7_7.a;
                var13_14 = var4_4.d() + var6_6;
                var4_4.p(var13_14);
                var4_4 = StringCompanionObject.INSTANCE;
                var10_10 = R$string.acc_alert_message;
                var4_4 = hv3_0.K(var10_10);
                var13_14 = R$string.add_to_bag_msg_refresh;
                var12_13 = hv3_0.K(var13_14);
                var14_15 /* !! */  = new Object[var6_6];
                var14_15 /* !! */ [0] = var12_13;
                var4_4 = xh2_0.a(var14_15 /* !! */ , var6_6, (String)var4_4, var11_11);
                var15_16 = R$string.add_to_bag_msg_refresh;
                var11_11 = hv3_0.K(var15_16);
                var7_7.kb(var11_11, (String)var4_4);
                var4_4 = var7_7.u;
                var11_11 = "closetViewModel";
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var4_4.r.setAddedToCart((boolean)var6_6);
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var4_4.r.setShowSizeLayout(false);
                var7_7.sb(false);
                var4_4 = var7_7.z0;
                var10_10 = TextUtils.isEmpty((CharSequence)var4_4);
                if (var10_10 == 0) {
                    var4_4 = var7_7.u;
                    if (var4_4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                        var10_10 = 0;
                        var4_4 = null;
                    }
                    var5_5 /* !! */  = var7_7.z0;
                    var16_17 = var7_7.u;
                    if (var16_17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                        var6_6 = 0;
                        var16_17 = null;
                    }
                    if ((var16_17 = var16_17.r.getPrice()) != null) {
                        var16_17 = var16_17.getValue();
                    } else {
                        var6_6 = 0;
                        var16_17 = null;
                    }
                    var4_4.b((String)var5_5 /* !! */ , (String)var16_17);
                    var7_7.z0 = null;
                }
                if ((var4_4 = var7_7.u) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                if ((var4_4 = var4_4.r.getPrice()) != null) {
                    var4_4 = var4_4.getValue();
                } else {
                    var10_10 = 0;
                    var4_4 = null;
                }
                if (var4_4 == null || (var10_10 = var4_4.length()) == 0) ** GOTO lbl245
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                if ((var5_5 /* !! */  = var7_7.u) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var5_5 /* !! */  = null;
                }
                var5_5 /* !! */  = var5_5 /* !! */ .r;
                var4_4.c((Product)var5_5 /* !! */ );
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var4_4 = var4_4.r.getSourceStoreId();
                var5_5 /* !! */  = "";
                if (var4_4 == null || (var10_10 = var4_4.length()) == 0) ** GOTO lbl155
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                if ((var4_4 = var4_4.r.getSourceStoreId()) != null) ** GOTO lbl152
                var17_18 /* !! */  = var5_5 /* !! */ ;
                ** GOTO lbl174
lbl152:
                // 2 sources

                while (true) {
                    var17_18 /* !! */  = var4_4;
                    ** GOTO lbl174
                    break;
                }
lbl155:
                // 1 sources

                var4_4 = GAEcommerceEvents.INSTANCE;
                var16_17 = var7_7.u;
                if (var16_17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var6_6 = 0;
                    var16_17 = null;
                }
                if ((var16_17 = var16_17.r) == null || (var16_17 = var16_17.getCatalogName()) == null) {
                    var16_17 = var7_7.u;
                    if (var16_17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                        var6_6 = 0;
                        var16_17 = null;
                    }
                    if ((var16_17 = var16_17.r) != null) {
                        var16_17 = var16_17.getCatalog();
                    } else {
                        var6_6 = 0;
                        var16_17 = null;
                    }
                }
                var4_4 = var4_4.getStoreTypeFromCatalog((String)var16_17);
                ** continue;
lbl174:
                // 2 sources

                var12_13 = GAEcommerceEvents.INSTANCE;
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var14_15 /* !! */  = var4_4.r;
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var18_19 = var4_4.r.getCode();
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var19_20 = var4_4.r.getName();
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var20_21 = (var4_4 = var4_4.r.getPrice()) != null ? (var4_4 = var4_4.getValue()) : null;
                Intrinsics.checkNotNull(var20_21);
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var21_22 = var4_4.r.getBrandName();
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                if ((var4_4 = var4_4.r.getFnlProductData()) == null) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var22_23 /* !! */  = var5_5 /* !! */ ;
                        break;
                    }
                } else {
                    var4_4 = var7_7.u;
                    if (var4_4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                        var10_10 = 0;
                        var4_4 = null;
                    }
                    if ((var4_4 = var4_4.r.getFnlProductData()) != null) {
                        var5_5 /* !! */  = var4_4.getPlanningCategory();
                        ** continue;
                    }
                    var22_23 /* !! */  = null;
                }
                var4_4 = var7_7.u;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                    var10_10 = 0;
                    var4_4 = null;
                }
                var23_24 = var4_4.r.getSelectedSize();
                var24_25 = "Enhance E-commerce";
                var25_26 = 1;
                var26_27 = true;
                var27_28 = "bag screen";
                var28_29 = 4096;
                GAEcommerceEvents.pushAddRemoveCartItem$default((GAEcommerceEvents)var12_13, (Product)var14_15 /* !! */ , var18_19, var19_20, var25_26, (String)var20_21, var21_22, var26_27, var27_28, (String)var22_23 /* !! */ , var24_25, var23_24, (String)var17_18 /* !! */ , false, var28_29, null);
                var4_4 = el1_2.a;
                var4_4 = yt2_2.CART;
                var5_5 /* !! */  = var7_7.u;
                if (var5_5 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                } else {
                    var3_3 = var5_5 /* !! */ ;
                }
                var3_3 = var3_3.r;
                el1_2.b((yt2_2)var4_4, (Product)var3_3);
lbl245:
                // 2 sources

                if ((var3_3 = (ProductStockLevelStatus)var9_9.getData()) != null) {
                    var2_2 = (int)var3_3.isResponseFromPE();
                }
lbl247:
                // 6 sources

                return Unit.a;
            }
            case 1: {
                var3_3 = var1_1;
                var3_3 = (nl2_2)var1_1;
                Intrinsics.checkNotNullParameter(var3_3, "$this$prepare");
                var3_3.getClass();
                var7_7 = (Function2)var7_7;
                Intrinsics.checkNotNullParameter(var7_7, "block");
                var3_3.a = var7_7;
                return Unit.a;
            }
            case 0: 
        }
        var3_3 = var1_1;
        var3_3 = (View)var1_1;
        var7_7 = (Function1)var7_7;
        Intrinsics.checkNotNullParameter(var7_7, "$onSafeClick");
        Intrinsics.checkNotNullParameter(var3_3, "it");
        var7_7.invoke(var3_3);
        return Unit.a;
    }
}

