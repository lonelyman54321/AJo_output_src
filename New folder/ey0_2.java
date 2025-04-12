/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductStockLevelStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Ey0
 */
public final class ey0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ey0_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 /* !! */  = "this$0";
        var3_3 = this.b;
        var4_4 = 0;
        var5_5 /* !! */  = null;
        var6_6 = 1;
        var7_7 = this.a;
        switch (var7_7) {
            default: {
                var8_8 = var1_1;
                var8_8 = (DataCallback)var1_1;
                var3_3 = (t21_0)var3_3;
                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2 /* !! */ );
                var2_2 /* !! */  = cp_1.Companion;
                var9_9 = nn_2.b((cp$a)var2_2 /* !! */ , (DataCallback)var8_8);
                if (var9_9 == 0) ** GOTO lbl254
                var9_9 = var8_8.getStatus();
                var10_10 = "format(...)";
                var11_11 = null;
                if (var9_9 == 0) ** GOTO lbl59
                if (var9_9 != var6_6) {
                    var4_4 = 3;
                    if (var9_9 == var4_4) {
                        var3_3.Pa();
                    }
                } else {
                    var3_3.Pa();
                    var2_2 /* !! */  = var8_8.getError();
                    if (var2_2 /* !! */  != null && (var8_8 = var2_2 /* !! */ .getErrorMessage()) != null) {
                        var11_11 = var8_8.getMessage();
                    }
                    if (var11_11 != null && (var7_7 = var11_11.length()) != 0) {
                        var8_8 = StringCompanionObject.INSTANCE;
                        var7_7 = R$string.acc_error_message;
                        var8_8 = hv3_0.K(var7_7);
                        Intrinsics.checkNotNull(var2_2 /* !! */ );
                        var11_11 = var2_2 /* !! */ .getErrorMessage();
                        Intrinsics.checkNotNull(var11_11);
                        var11_11 = var11_11.getMessage();
                        var12_12 = new Object[var6_6];
                        var12_12[0] = var11_11;
                        var5_5 /* !! */  = xh2_0.a(var12_12, var6_6, (String)var8_8, var10_10);
                        var2_2 /* !! */  = var2_2 /* !! */ .getErrorMessage();
                        Intrinsics.checkNotNull(var2_2 /* !! */ );
                        var2_2 /* !! */  = var2_2 /* !! */ .getMessage();
                        var13_14 = "getMessage(...)";
                        Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , var13_14);
                        var3_3.Ra((String)var2_2 /* !! */ , (String)var5_5 /* !! */ );
                    } else {
                        var2_2 /* !! */  = StringCompanionObject.INSTANCE;
                        var9_9 = R$string.acc_error_message;
                        var2_2 /* !! */  = hv3_0.K(var9_9);
                        var7_7 = R$string.something_wrong_msg;
                        var8_8 = hv3_0.K(var7_7);
                        var11_11 = new Object[var6_6];
                        var11_11[0] = var8_8;
                        var2_2 /* !! */  = xh2_0.a((Object[])var11_11, var6_6, (String)var2_2 /* !! */ , var10_10);
                        var4_4 = R$string.something_wrong_msg;
                        var5_5 /* !! */  = hv3_0.K(var4_4);
                        var3_3.Ra((String)var5_5 /* !! */ , (String)var2_2 /* !! */ );
                    }
                }
                ** GOTO lbl254
lbl59:
                // 1 sources

                var3_3.w = var6_6;
                var3_3.Pa();
                var2_2 /* !! */  = var3_3.b;
                var12_13 = (jo_2)var2_2 /* !! */ .getValue();
                var9_9 = ((jo_2)var2_2 /* !! */ .getValue()).d() + var6_6;
                var12_13.p(var9_9);
                var2_2 /* !! */  = StringCompanionObject.INSTANCE;
                var9_9 = R$string.acc_alert_message;
                var2_2 /* !! */  = hv3_0.K(var9_9);
                var14_16 = R$string.add_to_bag_msg_refresh;
                var12_13 = hv3_0.K(var14_16);
                var15_17 /* !! */  = new Object[var6_6];
                var15_17 /* !! */ [0] = var12_13;
                var2_2 /* !! */  = xh2_0.a(var15_17 /* !! */ , var6_6, (String)var2_2 /* !! */ , var10_10);
                var16_18 = R$string.add_to_bag_msg_refresh;
                var10_10 = hv3_0.K(var16_18);
                var3_3.Ra(var10_10, (String)var2_2 /* !! */ );
                var2_2 /* !! */  = var3_3.h;
                var10_10 = "closetViewModel";
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var2_2 /* !! */ .r.setAddedToCart((boolean)var6_6);
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var2_2 /* !! */ .r.setShowSizeLayout(false);
                var2_2 /* !! */  = var3_3.j;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("closetListAdaptor");
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var2_2 /* !! */ .notifyDataSetChanged();
                var2_2 /* !! */  = var3_3.x;
                var9_9 = TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
                if (var9_9 == 0) {
                    var2_2 /* !! */  = var3_3.h;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var9_9 = 0;
                        var2_2 /* !! */  = null;
                    }
                    var5_5 /* !! */  = var3_3.x;
                    var13_15 = var3_3.h;
                    if (var13_15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var6_6 = 0;
                        var13_15 = null;
                    }
                    if ((var13_15 = var13_15.r.getPrice()) != null) {
                        var13_15 = var13_15.getValue();
                    } else {
                        var6_6 = 0;
                        var13_15 = null;
                    }
                    var2_2 /* !! */ .b((String)var5_5 /* !! */ , (String)var13_15);
                    var3_3.x = null;
                }
                if ((var2_2 /* !! */  = var3_3.h) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                if ((var2_2 /* !! */  = var2_2 /* !! */ .r.getPrice()) != null) {
                    var2_2 /* !! */  = var2_2 /* !! */ .getValue();
                } else {
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                if (var2_2 /* !! */  == null || (var9_9 = var2_2 /* !! */ .length()) == 0) ** GOTO lbl247
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                if ((var5_5 /* !! */  = var3_3.h) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var4_4 = 0;
                    var5_5 /* !! */  = null;
                }
                var5_5 /* !! */  = var5_5 /* !! */ .r;
                var2_2 /* !! */ .c((Product)var5_5 /* !! */ );
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var2_2 /* !! */  = var2_2 /* !! */ .r.getSourceStoreId();
                var5_5 /* !! */  = "";
                if (var2_2 /* !! */  == null || (var9_9 = var2_2 /* !! */ .length()) == 0) ** GOTO lbl156
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                if ((var2_2 /* !! */  = var2_2 /* !! */ .r.getSourceStoreId()) != null) ** GOTO lbl153
                var17_19 = var5_5 /* !! */ ;
                ** GOTO lbl175
lbl153:
                // 2 sources

                while (true) {
                    var17_19 = var2_2 /* !! */ ;
                    ** GOTO lbl175
                    break;
                }
lbl156:
                // 1 sources

                var2_2 /* !! */  = GAEcommerceEvents.INSTANCE;
                var13_15 = var3_3.h;
                if (var13_15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var6_6 = 0;
                    var13_15 = null;
                }
                if ((var13_15 = var13_15.r) == null || (var13_15 = var13_15.getCatalogName()) == null) {
                    var13_15 = var3_3.h;
                    if (var13_15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var6_6 = 0;
                        var13_15 = null;
                    }
                    if ((var13_15 = var13_15.r) != null) {
                        var13_15 = var13_15.getCatalog();
                    } else {
                        var6_6 = 0;
                        var13_15 = null;
                    }
                }
                var2_2 /* !! */  = var2_2 /* !! */ .getStoreTypeFromCatalog((String)var13_15);
                ** continue;
lbl175:
                // 2 sources

                var12_13 = GAEcommerceEvents.INSTANCE;
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var15_17 /* !! */  = var2_2 /* !! */ .r;
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var18_20 = var2_2 /* !! */ .r.getCode();
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var19_21 = var2_2 /* !! */ .r.getName();
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var20_22 = (var2_2 /* !! */  = var2_2 /* !! */ .r.getPrice()) != null ? (var2_2 /* !! */  = var2_2 /* !! */ .getValue()) : null;
                Intrinsics.checkNotNull(var20_22);
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var21_23 = var2_2 /* !! */ .r.getBrandName();
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                if ((var2_2 /* !! */  = var2_2 /* !! */ .r.getFnlProductData()) == null) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var22_24 = var5_5 /* !! */ ;
                        break;
                    }
                } else {
                    var2_2 /* !! */  = var3_3.h;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var9_9 = 0;
                        var2_2 /* !! */  = null;
                    }
                    if ((var2_2 /* !! */  = var2_2 /* !! */ .r.getFnlProductData()) != null) {
                        var5_5 /* !! */  = var2_2 /* !! */ .getPlanningCategory();
                        ** continue;
                    }
                    var22_24 = null;
                }
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var9_9 = 0;
                    var2_2 /* !! */  = null;
                }
                var23_25 = var2_2 /* !! */ .r.getSelectedSize();
                var24_26 = "Enhance E-commerce";
                var25_27 = 1;
                var26_28 = true;
                var27_29 = "bag screen - wishlist halfcut screen";
                var28_30 = 4096;
                GAEcommerceEvents.pushAddRemoveCartItem$default((GAEcommerceEvents)var12_13, (Product)var15_17 /* !! */ , var18_20, var19_21, var25_27, (String)var20_22, var21_23, var26_28, var27_29, (String)var22_24, var24_26, var23_25, (String)var17_19, false, var28_30, null);
                var2_2 /* !! */  = var3_3.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                } else {
                    var11_11 = var2_2 /* !! */ ;
                }
                var2_2 /* !! */  = var11_11.r;
                if (var2_2 /* !! */  != null) {
                    var5_5 /* !! */  = el1_2.a;
                    var5_5 /* !! */  = yt2_2.CART;
                    el1_2.b((yt2_2)var5_5 /* !! */ , (Product)var2_2 /* !! */ );
                }
lbl247:
                // 4 sources

                if ((var2_2 /* !! */  = (ProductStockLevelStatus)var8_8.getData()) != null) {
                    var9_9 = (int)var2_2 /* !! */ .isResponseFromPE();
                }
                var2_2 /* !! */  = var3_3.t;
                var5_5 /* !! */  = "closet screen";
                var13_15 = "halfcard screen";
                var2_2 /* !! */ .setPreviousScreenData((String)var5_5 /* !! */ , (String)var13_15);
                var3_3.dismiss();
lbl254:
                // 5 sources

                return Unit.a;
            }
            case 0: 
        }
        var5_5 /* !! */  = var1_1;
        var5_5 /* !! */  = (Boolean)var1_1;
        var4_4 = var5_5 /* !! */ .booleanValue();
        var3_3 = (hy0_2)var3_3;
        Intrinsics.checkNotNullParameter(var3_3, (String)var2_2 /* !! */ );
        if (var4_4 != 0) {
            var2_2 /* !! */  = var3_3.a;
            if (var2_2 /* !! */  != null) {
                var2_2 /* !! */ .show();
            }
        } else {
            var2_2 /* !! */  = var3_3.a;
            if (var2_2 /* !! */  != null) {
                var2_2 /* !! */ .dismiss();
            }
        }
        return Unit.a;
    }
}

