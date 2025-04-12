/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Cart.CartStockCheck;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.TransactionGetStatusResponse;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from tT
 */
public final class tt_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ tt_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block80: {
            block81: {
                block83: {
                    block82: {
                        var2_2 = "<set-?>";
                        var3_3 /* !! */  = "";
                        var4_4 = null;
                        var5_5 = "this$0";
                        var6_6 = this.b;
                        var7_7 = 1;
                        var8_8 = null;
                        var9_9 = this.a;
                        var1_1 /* !! */  = (DataCallback)var1_1 /* !! */ ;
                        switch (var9_9) {
                            default: {
                                var6_6 = (zt3_0)var6_6;
                                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                                var10_10 = var1_1 /* !! */ .getStatus();
                                if (var10_10 != 0) ** GOTO lbl46
                                if ((var1_1 /* !! */  = (TransactionGetStatusResponse)var1_1 /* !! */ .getData()) == null) ** GOTO lbl44
                                var2_2 = "FAILED";
                                var10_10 = (int)var2_2.equalsIgnoreCase((String)(var1_1 /* !! */  = var1_1 /* !! */ .getTransactionStatus()));
                                if (var10_10 != 0 || (var10_10 = (int)(var2_2 = "SUCCESS").equalsIgnoreCase((String)var1_1 /* !! */ )) != 0) ** GOTO lbl27
                                var2_2 = "PENDING";
                                var11_12 = var2_2.equalsIgnoreCase((String)var1_1 /* !! */ );
                                if (var11_12) {
                                    var1_1 /* !! */  = yn3_0.a;
                                    var2_2 = new Object[]{};
                                    var1_1 /* !! */ .d((String)var3_3 /* !! */ , (Object[])var2_2);
                                }
                                ** GOTO lbl49
lbl27:
                                // 1 sources

                                var1_1 /* !! */  = var6_6.f;
                                if (var1_1 /* !! */  != null) {
                                    var1_1 /* !! */ .cancel();
                                }
                                var6_6.f = null;
                                var1_1 /* !! */  = var6_6.e;
                                if (var1_1 /* !! */  == null) {
                                    var1_1 /* !! */  = "progressView";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var1_1 /* !! */ );
                                } else {
                                    var4_4 = var1_1 /* !! */ ;
                                }
                                var4_4.show();
                                var1_1 /* !! */  = var6_6.Ra().q;
                                if (var1_1 /* !! */  != null && (var1_1 /* !! */  = var1_1 /* !! */ .a) != null && (var1_1 /* !! */  = var1_1 /* !! */ .getTransactionInformation()) != null && (var1_1 /* !! */  = var1_1 /* !! */ .getPaymentEngineTransactionId()) != null) {
                                    var2_2 = var6_6.Qa();
                                    var2_2.n((String)var1_1 /* !! */ );
                                }
                                var1_1 /* !! */  = Unit.a;
                                ** GOTO lbl50
lbl44:
                                // 1 sources

                                var6_6.Pa(null);
                                ** GOTO lbl49
lbl46:
                                // 1 sources

                                var11_13 = var1_1 /* !! */ .getStatus();
                                if (var11_13 == var7_7) {
                                    var6_6.Pa(null);
                                }
lbl49:
                                // 5 sources

                                var1_1 /* !! */  = Unit.a;
lbl50:
                                // 2 sources

                                return var1_1 /* !! */ ;
                            }
                            case 1: {
                                var6_6 = (NewProductDetailsFragment)var6_6;
                                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                                Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "productUserSizeRecomResponseDataCallback");
                                var3_3 /* !! */  = cp_1.Companion;
                                var12_18 = nn_2.b((cp$a)var3_3 /* !! */ , (DataCallback)var1_1 /* !! */ );
                                if (var12_18 == 0) ** GOTO lbl177
                                var12_18 = var1_1 /* !! */ .getStatus();
                                if (var12_18 != 0) ** GOTO lbl170
                                var6_6.k0 = var1_1 /* !! */  = (ProductUserSizeRecomResponse)var1_1 /* !! */ .getData();
                                if (var1_1 /* !! */  == null) ** GOTO lbl166
                                var1_1 /* !! */  = var6_6.cb().o();
                                var3_3 /* !! */  = var6_6.k0;
                                var1_1 /* !! */  = mz3_0.q((String)var1_1 /* !! */ , (ProductUserSizeRecomResponse)var3_3 /* !! */ );
                                var3_3 /* !! */  = var6_6.cb().q;
                                if (var3_3 /* !! */  != null) {
                                    var3_3 /* !! */  = var3_3 /* !! */ .getBrickCategory();
                                } else {
                                    var12_18 = 0;
                                    var3_3 /* !! */  = null;
                                }
                                var5_5 = var6_6.cb().q;
                                if (var5_5 != null) {
                                    var5_5 = var5_5.getBrickSubCategory();
                                } else {
                                    var13_21 = false;
                                    var5_5 = null;
                                }
                                var14_23 = var6_6.cb().q;
                                if (var14_23 != null) {
                                    var4_4 = var14_23.getBrickName();
                                }
                                var14_23 = h40_0.a;
                                var14_23 = h40_0.C0();
                                var15_25 = "sizeConfig";
                                if ((var14_23 = var14_23.optJSONArray(var15_25)) == null || (var16_27 = var14_23.length()) <= 0) ** GOTO lbl121
                                var16_27 = var14_23.length();
                                var18_30 = null;
                                for (var17_29 = 0; var17_29 < var16_27; var17_29 += var7_7) {
                                    var19_32 = var14_23.getJSONObject(var17_29);
                                    var20_34 = var19_32.optString("segment");
                                    Intrinsics.checkNotNull(var20_34);
                                    var21_36 = var20_34.length();
                                    if (var21_36 <= 0 || var3_3 /* !! */  == null || (var21_36 = (int)kotlin.text.b.k((CharSequence)var3_3 /* !! */ )) != 0 || (var22_38 = var20_34.equalsIgnoreCase((String)var3_3 /* !! */ )) == 0) continue;
                                    var20_34 = var19_32.optString("vertical");
                                    var23_40 = "brick";
                                    var19_32 = var19_32.optString(var23_40);
                                    Intrinsics.checkNotNull(var20_34);
                                    var21_36 = var20_34.length();
                                    if (var21_36 <= 0 || var5_5 == null || (var21_36 = (int)kotlin.text.b.k((CharSequence)var5_5)) != 0) ** GOTO lbl-1000
                                    Intrinsics.checkNotNull(var19_32);
                                    var21_36 = var19_32.length();
                                    if (var21_36 > 0 && var4_4 != null && (var21_36 = (int)kotlin.text.b.k((CharSequence)var4_4)) == 0) {
                                        var22_38 = (int)var20_34.equalsIgnoreCase((String)var5_5);
                                        if (var22_38 == 0 || (var24_41 = (int)var19_32.equalsIgnoreCase((String)var4_4)) == 0) continue;
                                        var11_14 /* !! */  = var6_6.tb((String)var1_1 /* !! */ );
                                    } else if ((var21_36 = var20_34.length()) > 0 && var5_5 != null && (var21_36 = (int)kotlin.text.b.k((CharSequence)var5_5)) == 0) {
                                        var24_41 = var20_34.equalsIgnoreCase((String)var5_5);
                                        if (var24_41 == 0) continue;
                                        var11_14 /* !! */  = var6_6.tb((String)var1_1 /* !! */ );
                                    } else {
                                        Intrinsics.checkNotNull(var19_32);
                                        var21_36 = var19_32.length();
                                        if (var21_36 > 0 && var4_4 != null && (var21_36 = (int)kotlin.text.b.k((CharSequence)var4_4)) == 0) {
                                            var24_41 = (int)var19_32.equalsIgnoreCase((String)var4_4);
                                            if (var24_41 == 0) continue;
                                            var11_14 /* !! */  = var6_6.tb((String)var1_1 /* !! */ );
                                        } else {
                                            var22_38 = var20_34.length();
                                            if (var22_38 != 0 && (var24_41 = var19_32.length()) != 0) continue;
                                            var11_14 /* !! */  = var6_6.tb((String)var1_1 /* !! */ );
                                        }
                                    }
                                    ** GOTO lbl123
                                }
lbl121:
                                // 2 sources

                                var11_14 /* !! */  = 0;
                                var1_1 /* !! */  = null;
lbl123:
                                // 5 sources

                                if (var11_14 /* !! */  == 0) ** GOTO lbl166
                                var1_1 /* !! */  = la0_0.SIZE_RECOMMENDATION;
                                var6_6.y1 = var1_1 /* !! */ ;
                                var3_3 /* !! */  = var6_6.cb();
                                var3_3 /* !! */ .getClass();
                                Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)var2_2);
                                var3_3 /* !! */ .h1 = var1_1 /* !! */ ;
                                var1_1 /* !! */  = var6_6.cb();
                                var1_1 /* !! */ .g1 = var2_2 = var6_6.k0;
                                var6_6.cb().D();
                                var1_1 /* !! */  = var6_6.mb();
                                var11_14 /* !! */  = var1_1 /* !! */ .p();
                                if (var11_14 /* !! */  == var7_7) {
                                    var1_1 /* !! */  = z40_0.Companion;
                                    var1_1 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var1_1 /* !! */ ).a;
                                    var2_2 = "SizeRecommendation";
                                    var25_42 = var1_1 /* !! */ .h((String)var2_2);
                                    cfr_temp_0 = var25_42 - (var27_43 = 1L);
                                    var11_14 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var11_14 /* !! */  == 0 && (var1_1 /* !! */  = var6_6.k0) != null) {
                                        var1_1 /* !! */  = var6_6.cb().o();
                                        var2_2 = var6_6.k0;
                                        var11_14 /* !! */  = mz3_0.R((String)(var1_1 /* !! */  = mz3_0.q((String)var1_1 /* !! */ , (ProductUserSizeRecomResponse)var2_2)));
                                        if (var11_14 /* !! */  != 0 && (var1_1 /* !! */  = var6_6.cb().q) != null) {
                                            var1_1 /* !! */  = AnalyticsManager.Companion.getInstance().getGa();
                                            var2_2 = ((UserInformation)var6_6.w.getValue()).getCustomerUUID();
                                            var3_3 /* !! */  = var6_6.cb().q;
                                            Intrinsics.checkNotNull(var3_3 /* !! */ );
                                            var3_3 /* !! */  = var3_3 /* !! */ .getCode();
                                            var4_4 = var6_6.cb().r();
                                            var5_5 = var6_6.k0;
                                            var4_4 = mz3_0.q((String)var4_4, (ProductUserSizeRecomResponse)var5_5);
                                            var5_5 = "Size_Reco_";
                                            var8_8 = "_";
                                            var2_2 = og_1.a((String)var5_5, (String)var2_2, var8_8, (String)var3_3 /* !! */ , var8_8);
                                            var2_2.append((String)var4_4);
                                            var2_2 = var2_2.toString();
                                            var3_3 /* !! */  = "PDP Size recommendations call";
                                            var1_1 /* !! */ .trackBannerImpressionEvent((String)var3_3 /* !! */ , (String)var2_2);
                                            ** GOTO lbl173
                                        }
                                    }
                                }
                                ** GOTO lbl173
lbl166:
                                // 3 sources

                                while (true) {
                                    var7_7 = 0;
                                    var29_44 = null;
                                    ** GOTO lbl173
                                    break;
                                }
lbl170:
                                // 1 sources

                                var1_1 /* !! */ .getStatus();
                                ** continue;
lbl173:
                                // 3 sources

                                if (var7_7 == 0) {
                                    var6_6.pb();
                                }
                                var6_6.Jb();
                                ** GOTO lbl178
lbl177:
                                // 1 sources

                                var6_6.pb();
lbl178:
                                // 2 sources

                                return Unit.a;
                            }
                            case 0: 
                        }
                        var6_6 = (CheckoutFragment)var6_6;
                        Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                        var5_5 = cp_1.Companion;
                        var13_22 = nn_2.b((cp$a)var5_5, (DataCallback)var1_1 /* !! */ );
                        if (!var13_22) break block80;
                        if ((var1_1 /* !! */  = (hj2_0)var1_1 /* !! */ .getData()) == null) break block81;
                        var6_6.getClass();
                        var13_22 = var1_1 /* !! */ .c;
                        var14_24 = var1_1 /* !! */ .b;
                        if (!var13_22) break block82;
                        var1_1 /* !! */  = (Error)JsonUtils.fromJson(var14_24, Error.class);
                        var6_6.Sa((Error)var1_1 /* !! */ );
                        break block80;
                    }
                    var5_5 = (PayNowResponse)JsonUtils.fromJson(var14_24, PayNowResponse.class);
                    if (var5_5 != null && (var15_26 = var5_5.getError()) != null && (var15_26 = var15_26.getProductsOutOfStock()) != null && (var15_26 = var15_26.getCartModifications()) != null) {
                        var16_28 = var15_26.size();
                    } else {
                        var16_28 = 0;
                        var15_26 = null;
                    }
                    var18_31 = "checkOutViewModel";
                    if (var16_28 <= 0) break block83;
                    var1_1 /* !! */  = var6_6.q;
                    if (var1_1 /* !! */  != null) {
                        var1_1 /* !! */ .dismiss();
                    }
                    var1_1 /* !! */  = AnalyticsManager.Companion;
                    var3_3 /* !! */  = var1_1 /* !! */ .getInstance().getGtmEvents();
                    var29_45 = "Out of Stock";
                    var8_8 = "Products out of stock";
                    ak0_0.a((AnalyticsManager$Companion)var1_1 /* !! */ , (GTMEvents)var3_3 /* !! */ , (String)var29_45, var8_8);
                    var3_3 /* !! */  = var6_6.h;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var18_31);
                        var12_19 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .getClass();
                    Intrinsics.checkNotNullParameter("product oos", "errorMessage");
                    var18_31 = "spc errors - cta disable -product oos click ";
                    Intrinsics.checkNotNullExpressionValue(var18_31, "toString(...)");
                    var3_3 /* !! */  = var1_1 /* !! */ .getInstance();
                    var29_45 = var3_3 /* !! */ .getGtmEvents();
                    var19_33 = av_0.a((AnalyticsManager$Companion)var1_1 /* !! */ );
                    var15_26 = "business error";
                    var22_39 = false;
                    var20_35 = null;
                    var8_8 = "errors interactions";
                    var14_24 = "business_error";
                    var21_37 = 32;
                    GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)var29_45, var8_8, var14_24, (String)var15_26, (String)var18_31, var19_33, null, var21_37, null);
                    if (var5_5 != null && (var1_1 /* !! */  = var5_5.getError()) != null) {
                        var4_4 = var1_1 /* !! */ .getProductsOutOfStock();
                    }
                    var1_1 /* !! */  = JsonUtils.toJson(var4_4);
                    var3_3 /* !! */  = CartStockCheck.class;
                    if ((var1_1 /* !! */  = (CartStockCheck)JsonUtils.fromJson((String)var1_1 /* !! */ , var3_3 /* !! */ )) != null) {
                        if ((var1_1 /* !! */  = var1_1 /* !! */ .getCartModifications()) != null && (var12_19 = var1_1 /* !! */ .size()) > 0) {
                            var3_3 /* !! */  = var6_6.q;
                            if (var3_3 /* !! */  != null) {
                                var3_3 /* !! */ .dismiss();
                            }
                            var3_3 /* !! */  = new Gson();
                            var4_4 = new TypeToken();
                            var4_4 = var4_4.getType();
                            var1_1 /* !! */  = var3_3 /* !! */ .toJson(var1_1 /* !! */ , (Type)var4_4);
                            var3_3 /* !! */  = var6_6.y;
                            if (var3_3 /* !! */  != null) {
                                Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)var2_2);
                                var3_3 /* !! */ .r0 = var1_1 /* !! */ ;
                            }
                            if ((var1_1 /* !! */  = var6_6.y) != null) {
                                var1_1 /* !! */ .A2();
                            }
                        }
                    } else {
                        var1_1 /* !! */  = "cartStockCheck is null";
                        mz3_0.F((String)var1_1 /* !! */ );
                    }
                    break block80;
                }
                if (var5_5 != null && (var2_2 = var5_5.getError()) != null) {
                    var2_2 = var2_2.getCode();
                } else {
                    var10_11 = 0;
                    var2_2 = null;
                }
                var15_26 = "PRICE_CALCULATION_EXCEPTION";
                var10_11 = kotlin.text.b.i((String)var2_2, (String)var15_26, (boolean)var7_7);
                if (var10_11 != 0) ** GOTO lbl-1000
                if (var5_5 != null && (var2_2 = var5_5.getError()) != null) {
                    var2_2 = var2_2.getCode();
                } else {
                    var10_11 = 0;
                    var2_2 = null;
                }
                var15_26 = "PAYMENT_ENGINE_EXCEPTION";
                var10_11 = kotlin.text.b.i((String)var2_2, (String)var15_26, (boolean)var7_7);
                if (var10_11 != 0) ** GOTO lbl-1000
                if (var5_5 != null && (var2_2 = var5_5.getError()) != null) {
                    var2_2 = var2_2.getCode();
                } else {
                    var10_11 = 0;
                    var2_2 = null;
                }
                var15_26 = "CART_AMOUNT_MISS_MATCH_EXCEPTION";
                var10_11 = kotlin.text.b.i((String)var2_2, (String)var15_26, (boolean)var7_7);
                if (var10_11 != 0) ** GOTO lbl-1000
                if (var5_5 != null && (var2_2 = var5_5.getError()) != null) {
                    var2_2 = var2_2.getCode();
                } else {
                    var10_11 = 0;
                    var2_2 = null;
                }
                var15_26 = "CART_AMOUNT_NULL_EXCEPTION";
                var10_11 = kotlin.text.b.i((String)var2_2, (String)var15_26, (boolean)var7_7);
                if (var10_11 != 0) ** GOTO lbl-1000
                if (var5_5 != null && (var2_2 = var5_5.getError()) != null) {
                    var2_2 = var2_2.getCode();
                } else {
                    var10_11 = 0;
                    var2_2 = null;
                }
                var15_26 = "CART_EXCEPTION";
                var10_11 = kotlin.text.b.i((String)var2_2, (String)var15_26, (boolean)var7_7);
                if (var10_11 != 0) ** GOTO lbl-1000
                if (var5_5 != null && (var2_2 = var5_5.getError()) != null) {
                    var2_2 = var2_2.getCode();
                } else {
                    var10_11 = 0;
                    var2_2 = null;
                }
                var15_26 = "CART_NOT_FOUND_EXCEPTION";
                var10_11 = kotlin.text.b.i((String)var2_2, (String)var15_26, (boolean)var7_7);
                if (var10_11 != 0) ** GOTO lbl-1000
                if (var5_5 != null && (var2_2 = var5_5.getError()) != null) {
                    var2_2 = var2_2.getCode();
                } else {
                    var10_11 = 0;
                    var2_2 = null;
                }
                var15_26 = "CART_EMPTY_EXCEPTION";
                var10_11 = kotlin.text.b.i((String)var2_2, (String)var15_26, (boolean)var7_7);
                if (var10_11 == 0) {
                    if (var14_24 != null && (var10_11 = var14_24.length()) != 0 && (var10_11 = (int)var14_24.equalsIgnoreCase((String)(var2_2 = "null"))) == 0) {
                        Intrinsics.checkNotNull(var14_24);
                        var1_1 /* !! */  = (PaymentActivity)var6_6.getActivity();
                        if (var1_1 /* !! */  != null) {
                            var10_11 = R$string.order_confirmation;
                            var2_2 = hv3_0.K(var10_11);
                            var1_1 /* !! */ .b((String)var2_2);
                        }
                        var6_6.a();
                        var1_1 /* !! */  = var6_6.b;
                        var2_2 = ((jo_2)var1_1 /* !! */ .getValue()).a();
                        var10_11 = (int)TextUtils.isEmpty((CharSequence)var2_2);
                        if (var10_11 == 0 && (var1_1 /* !! */  = ((jo_2)var1_1 /* !! */ .getValue()).a()) != null) {
                            var3_3 /* !! */  = var1_1 /* !! */ ;
                        }
                        if ((var1_1 /* !! */  = var6_6.h) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_31);
                            var11_15 = false;
                            var1_1 /* !! */  = null;
                        }
                        var1_1 /* !! */ .getClass();
                        var2_2 = "single page checkout";
                        var5_5 = "screenName";
                        Intrinsics.checkNotNullParameter(var2_2, (String)var5_5);
                        var6_6 = "request";
                        Intrinsics.checkNotNullParameter(var14_24, (String)var6_6);
                        var15_26 = "adId";
                        Intrinsics.checkNotNullParameter(var3_3 /* !! */ , (String)var15_26);
                        var18_31 = var1_1 /* !! */ .a;
                        var18_31.getClass();
                        Intrinsics.checkNotNullParameter(var2_2, (String)var5_5);
                        Intrinsics.checkNotNullParameter(var14_24, (String)var6_6);
                        Intrinsics.checkNotNullParameter(var3_3 /* !! */ , (String)var15_26);
                        var2_2 = new HashMap();
                        var5_5 = var18_31.b.b();
                        var2_2.put("paymentTransactions", var14_24);
                        var6_6 = ap_0.c;
                        var14_24 = "cartId";
                        var2_2.put(var14_24, var6_6);
                        var2_2.put(var15_26, var3_3 /* !! */ );
                        if (var5_5 != null) {
                            var3_3 /* !! */  = var5_5.getUtmMedium();
                        } else {
                            var12_20 = false;
                            var3_3 /* !! */  = null;
                        }
                        var6_6 = "affiliate";
                        var12_20 = Intrinsics.areEqual(var3_3 /* !! */ , var6_6);
                        if (var12_20) {
                            if (var5_5 != null) {
                                var3_3 /* !! */  = var5_5.getUtmSource();
                            } else {
                                var12_20 = false;
                                var3_3 /* !! */  = null;
                            }
                            var6_6 = "affiliateData.utmSource";
                            var2_2.put(var6_6, var3_3 /* !! */ );
                            if (var5_5 != null) {
                                var3_3 /* !! */  = var5_5.getUtmMedium();
                            } else {
                                var12_20 = false;
                                var3_3 /* !! */  = null;
                            }
                            var6_6 = "affiliateData.utmMedium";
                            var2_2.put(var6_6, var3_3 /* !! */ );
                            if (var5_5 != null) {
                                var3_3 /* !! */  = var5_5.getClickId();
                            } else {
                                var12_20 = false;
                                var3_3 /* !! */  = null;
                            }
                            var6_6 = "affiliateData.clickId";
                            var2_2.put(var6_6, var3_3 /* !! */ );
                            if (var5_5 != null) {
                                var3_3 /* !! */  = var5_5.getOfferId();
                            } else {
                                var12_20 = false;
                                var3_3 /* !! */  = null;
                            }
                            var6_6 = "affiliateData.offerId";
                            var2_2.put(var6_6, var3_3 /* !! */ );
                            if (var5_5 != null) {
                                var3_3 /* !! */  = var5_5.getReturnCancellationWindow();
                            } else {
                                var12_20 = false;
                                var3_3 /* !! */  = null;
                            }
                            var6_6 = "affiliateData.returnCancellationWindow";
                            var2_2.put(var6_6, var3_3 /* !! */ );
                            if (var5_5 != null) {
                                var3_3 /* !! */  = var5_5.getUtmCampaign();
                            } else {
                                var12_20 = false;
                                var3_3 /* !! */  = null;
                            }
                            var6_6 = "affiliateData.utmCampaign";
                            var2_2.put(var6_6, var3_3 /* !! */ );
                            if (var5_5 != null) {
                                var3_3 /* !! */  = var5_5.getAttributionWindow();
                            } else {
                                var12_20 = false;
                                var3_3 /* !! */  = null;
                            }
                            var6_6 = "affiliateData.attributionWindow";
                            var2_2.put(var6_6, var3_3 /* !! */ );
                            if (var5_5 != null) {
                                var4_4 = var5_5.getAffiliateId();
                            }
                            var2_2.put("affiliateData.affiliateId", var4_4);
                            p5_0.a.getClass();
                            var3_3 /* !! */  = p5_0.e;
                            var4_4 = "affiliateData.conversionId";
                            var2_2.put(var4_4, var3_3 /* !! */ );
                        }
                        var3_3 /* !! */  = UrlHelper.Companion.getInstance();
                        var4_4 = new Object[var7_7];
                        var4_4[0] = var5_5 = ap_0.c;
                        var3_3 /* !! */  = var3_3 /* !! */ .getApiUrl("payment", "place_order", (Object[])var4_4);
                        var4_4 = var18_31.c;
                        Intrinsics.checkNotNullExpressionValue(var4_4, "userInformation");
                        var4_4 = ServiceUtil.getToken((UserInformation)var4_4);
                        var4_4 = kp1_0.c("Bearer ", (String)var4_4);
                        var6_6 = var18_31.a;
                        var2_2 = var6_6.placeOrder((String)var3_3 /* !! */ , (String)var4_4, (Map)var2_2, "PlaceOrderRequest");
                        var3_3 /* !! */  = qt2_2.c;
                        var2_2 = var2_2.h((Scheduler)var3_3 /* !! */ );
                        var3_3 /* !! */  = ti_2.a();
                        var2_2 = var2_2.e((Scheduler)var3_3 /* !! */ );
                        var3_3 /* !! */  = new wy1_1();
                        var4_4 = new n33((wy1_1)var3_3 /* !! */ );
                        var3_3 /* !! */  = new s53_0((q63_0)var2_2, (bx0_2)var4_4);
                        var2_2 = new o33();
                        var4_4 = new u53_0((q63_0)var3_3 /* !! */ , (bx0_2)var2_2);
                        Intrinsics.checkNotNullExpressionValue(var4_4, "onErrorReturn(...)");
                        var2_2 = new cs_0(var1_1 /* !! */ , 0);
                        var3_3 /* !! */  = new ES(0, (Function1)var2_2);
                        var2_2 = new t9_0(var1_1 /* !! */ , var7_7);
                        var5_5 = new fs_0(0, (Function1)var2_2);
                        var2_2 = var4_4.f((o60_0)var3_3 /* !! */ , (o60_0)var5_5);
                        var1_1 /* !! */  = var1_1 /* !! */ .r;
                        var1_1 /* !! */ .b((yr0_2)var2_2);
                    } else {
                        var11_16 = var1_1 /* !! */ .a;
                        if (!var11_16 && (var1_1 /* !! */  = var6_6.getActivity()) != null && !(var11_16 = var1_1 /* !! */ .isFinishing()) && (var1_1 /* !! */  = var6_6.getActivity()) != null) {
                            var1_1 /* !! */ .finish();
                        }
                        var6_6.Va();
                    }
                } else lbl-1000:
                // 7 sources

                {
                    if (var5_5 != null) {
                        var4_4 = var5_5.getError();
                    }
                    var6_6.Sa((Error)var4_4);
                }
                break block80;
            }
            var1_1 /* !! */  = var6_6.getActivity();
            if (var1_1 /* !! */  != null && !(var11_17 = var1_1 /* !! */ .isFinishing()) && (var1_1 /* !! */  = var6_6.getActivity()) != null) {
                var1_1 /* !! */ .finish();
            }
            var6_6.Va();
        }
        return Unit.a;
    }
}

