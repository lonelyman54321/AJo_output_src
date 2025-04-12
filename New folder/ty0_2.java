/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from tY0
 */
public final class ty0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ty0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = 0;
        var3_3 /* !! */  = null;
        var4_4 = "format(...)";
        var5_5 = "this$0";
        var6_6 = this.b;
        var7_7 = false;
        var8_8 = null;
        var9_9 = 1;
        var10_10 = this.a;
        switch (var10_10) {
            default: {
                var1_1 = (DataCallback)var1_1;
                var11_11 = nv2_2.Companion;
                var6_6 = (nv2_2)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                var5_5 = cp_1.Companion;
                var12_13 = nn_2.b((cp$a)var5_5, (DataCallback)var1_1);
                if (var12_13 != 0) {
                    var12_13 = var1_1.getStatus();
                    var10_10 = 8;
                    var13_15 = "requireContext(...)";
                    var14_17 = "activityFragmentListener";
                    if (var12_13 == 0) {
                        var5_5 = z40_0.Companion;
                        var5_5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var5_5).a;
                        var15_19 = "wishlist_state_enable";
                        var12_13 = (int)var5_5.a((String)var15_19);
                        if (var12_13 != 0) {
                            var5_5 = var6_6.Pa().e;
                            var15_19 = var6_6.b;
                            if (var15_19 != null) {
                                var16_21 = var15_19.c;
                                var15_19 = var16_21;
                            } else {
                                var16_22 = false;
                                var15_19 = null;
                            }
                            if (var15_19 != null) {
                                var5_5 = var5_5.h;
                                var17_23 = DataCallback.Companion;
                                var15_19 = var17_23.onSuccess(var15_19);
                                var5_5.k(var15_19);
                            } else {
                                var5_5.getClass();
                            }
                        }
                        var6_6.Oa().fppPbClosetLoading.setVisibility(var10_10);
                        var5_5 = var6_6.Oa().fppIvAddToClosetSuccess;
                        var5_5.setVisibility(0);
                        var1_1 = (SaveForLaterResponse)var1_1.getData();
                        if (var1_1 != null) {
                            if ((var1_1 = var1_1.getStatusCode()) != null && (var18_25 = var1_1.intValue()) == 0) {
                                var1_1 = StringCompanionObject.INSTANCE;
                                var18_25 = R$string.acc_alert_message;
                                var1_1 = hv3_0.K(var18_25);
                                var12_13 = R$string.wishlist_success;
                                var5_5 = hv3_0.K(var12_13);
                                var11_11 = new Object[var9_9];
                                var11_11[0] = var5_5;
                                var1_1 = xh2_0.a(var11_11, var9_9, (String)var1_1, (String)var4_4);
                                var4_4 = var6_6.g;
                                if (var4_4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                                } else {
                                    var3_3 /* !! */  = var4_4;
                                }
                                var4_4 = var6_6.requireContext();
                                Intrinsics.checkNotNullExpressionValue(var4_4, var13_15);
                                var12_13 = R$string.wishlist_success;
                                var5_5 = hv3_0.K(var12_13);
                                var3_3 /* !! */ .showToastNotification((Context)var4_4, (String)var5_5, 0, (String)var1_1);
                                var1_1 = var6_6.Pa().e.b;
                                if (var1_1 != null) {
                                    var3_3 /* !! */  = el1_2.a;
                                    var3_3 /* !! */  = yt2_2.PLP;
                                    el1_2.c((yt2_2)var3_3 /* !! */ , (Product)var1_1);
                                }
                            } else {
                                var1_1 = StringCompanionObject.INSTANCE;
                                var18_25 = R$string.acc_alert_message;
                                var1_1 = hv3_0.K(var18_25);
                                var12_13 = R$string.wishlist_already_part;
                                var5_5 = hv3_0.K(var12_13);
                                var11_11 = new Object[var9_9];
                                var11_11[0] = var5_5;
                                var1_1 = xh2_0.a(var11_11, var9_9, (String)var1_1, (String)var4_4);
                                var4_4 = var6_6.g;
                                if (var4_4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                                } else {
                                    var3_3 /* !! */  = var4_4;
                                }
                                var4_4 = var6_6.requireContext();
                                Intrinsics.checkNotNullExpressionValue(var4_4, var13_15);
                                var12_13 = R$string.wishlist_already_part;
                                var5_5 = hv3_0.K(var12_13);
                                var3_3 /* !! */ .showToastNotification((Context)var4_4, (String)var5_5, 0, (String)var1_1);
                            }
                        } else {
                            var1_1 = StringCompanionObject.INSTANCE;
                            var18_25 = R$string.acc_error_message;
                            var1_1 = hv3_0.K(var18_25);
                            var12_13 = R$string.wishlist_error;
                            var5_5 = hv3_0.K(var12_13);
                            var11_11 = new Object[var9_9];
                            var11_11[0] = var5_5;
                            var1_1 = xh2_0.a(var11_11, var9_9, (String)var1_1, (String)var4_4);
                            var4_4 = var6_6.g;
                            if (var4_4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                            } else {
                                var3_3 /* !! */  = var4_4;
                            }
                            var4_4 = var6_6.requireContext();
                            Intrinsics.checkNotNullExpressionValue(var4_4, var13_15);
                            var12_13 = R$string.wishlist_error;
                            var5_5 = hv3_0.K(var12_13);
                            var3_3 /* !! */ .showToastNotification((Context)var4_4, (String)var5_5, 0, (String)var1_1);
                        }
                    } else {
                        var6_6.Oa().fppIvAddToClosetSuccess.setVisibility(var10_10);
                        var6_6.Oa().fppPbClosetLoading.setVisibility(var10_10);
                        var6_6.Oa().fppIvAddToCloset.setVisibility(0);
                        var1_1 = StringCompanionObject.INSTANCE;
                        var18_25 = R$string.acc_error_message;
                        var1_1 = hv3_0.K(var18_25);
                        var12_13 = R$string.wishlist_error;
                        var5_5 = hv3_0.K(var12_13);
                        var11_11 = new Object[var9_9];
                        var11_11[0] = var5_5;
                        var1_1 = xh2_0.a(var11_11, var9_9, (String)var1_1, (String)var4_4);
                        var4_4 = var6_6.g;
                        if (var4_4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                        } else {
                            var3_3 /* !! */  = var4_4;
                        }
                        var4_4 = var6_6.requireContext();
                        Intrinsics.checkNotNullExpressionValue(var4_4, var13_15);
                        var12_13 = R$string.wishlist_error;
                        var5_5 = hv3_0.K(var12_13);
                        var3_3 /* !! */ .showToastNotification((Context)var4_4, (String)var5_5, 0, (String)var1_1);
                    }
                    if ((var18_25 = (int)var6_6.isAdded()) != 0 && (var18_25 = (int)var6_6.isRemoving()) == 0 && (var18_25 = (int)var6_6.isDetached()) == 0) {
                        var6_6.dismissAllowingStateLoss();
                    }
                }
                return Unit.a;
            }
            case 1: {
                var1_1 = (DataCallback)var1_1;
                var6_6 = (ex1_0)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                var5_5 = cp_1.Companion;
                var12_14 = nn_2.b((cp$a)var5_5, (DataCallback)var1_1);
                if (var12_14 == 0) ** GOTO lbl267
                var12_14 = var1_1.getStatus();
                if (var12_14 != 0) ** GOTO lbl255
                if ((var1_1 = (Product)var1_1.getData()) == null) ** GOTO lbl267
                var4_4 = var6_6.S;
                if (var4_4 != null) {
                    var4_4 = var4_4.g();
                } else {
                    var19_28 = 0;
                    var4_4 = null;
                }
                if (var4_4 == null || (var19_28 = var4_4.isEmpty()) != 0) ** GOTO lbl174
                var4_4 = var6_6.S;
                if (var4_4 != null) {
                    var4_4 = var4_4.g();
                } else {
                    var19_28 = 0;
                    var4_4 = null;
                }
                Intrinsics.checkNotNull(var4_4);
                var4_4 = var4_4.iterator();
                while ((var12_14 = (int)var4_4.hasNext()) != 0) {
                    var5_5 = (Product)var4_4.next();
                    var11_12 = var5_5.getCode();
                    if (var11_12 == null || (var10_10 = (int)var11_12.equalsIgnoreCase((String)(var13_16 = var1_1.getBaseProduct()))) != var9_9) continue;
                    var4_4 = var1_1.getProductOptionVariants();
                    var5_5.setProductOptionVariants((List)var4_4);
                    var4_4 = var1_1.getProductOptionVariants();
                    var19_28 = var4_4.size();
                    if (var19_28 != var9_9) ** GOTO lbl176
                    var4_4 = (ProductOptionVariant)var1_1.getProductOptionVariants().get(0);
                    var19_28 = (int)var4_4.isStockAvailable();
                    ** GOTO lbl178
                }
lbl174:
                // 2 sources

                var12_14 = 0;
                var5_5 = null;
lbl176:
                // 2 sources

                var19_28 = 0;
                var4_4 = null;
lbl178:
                // 2 sources

                var11_12 = var1_1.getProductOptionItems();
                if (var11_12 != null && (var10_10 = (int)var11_12.isEmpty()) == 0) {
                    var11_12 = var1_1.getProductOptionItems();
                    Intrinsics.checkNotNull(var11_12);
                    var11_12 = (ProductOptionItem)var11_12.get(0);
                    if (var11_12 != null) {
                        var13_16 = var11_12.getVariantOptionQualifiers();
                    } else {
                        var20_29 = 0;
                        var13_16 = null;
                    }
                    if (var13_16 != null) {
                        var11_12 = var11_12.getVariantOptionQualifiers();
                        Intrinsics.checkNotNull(var11_12);
                        var11_12 = var11_12.iterator();
                        while ((var20_29 = (int)var11_12.hasNext()) != 0) {
                            var13_16 = (ProductOptionVariant)var11_12.next();
                            var14_18 = var13_16.getQualifier();
                            var21_30 = "selection1".equalsIgnoreCase(var14_18);
                            var15_20 = "null";
                            if (var21_30 != 0 && (var14_18 = var13_16.getValue()) != null && (var21_30 = var14_18.length()) != 0 && (var21_30 = (int)kotlin.text.b.i(var14_18 = var13_16.getValue(), var15_20, (boolean)var9_9)) == 0) {
                                var6_6.j1 = var13_16 = var13_16.getValue();
                                continue;
                            }
                            var17_24 = "selection2";
                            var14_18 = var13_16.getQualifier();
                            var21_30 = (int)var17_24.equalsIgnoreCase(var14_18);
                            if (var21_30 == 0 || (var14_18 = var13_16.getValue()) == null || (var21_30 = var14_18.length()) == 0 || (var21_30 = (int)kotlin.text.b.i(var14_18 = var13_16.getValue(), var15_20, (boolean)var9_9)) != 0) continue;
                            var6_6.k1 = var13_16 = var13_16.getValue();
                        }
                    }
                }
                if (var5_5 != null) {
                    var11_12 = var5_5.getVariantOptions();
                } else {
                    var10_10 = 0;
                    var11_12 = null;
                }
                if (var5_5 == null || var11_12 == null || (var20_29 = var11_12.size()) != var9_9 || ((var22_31 = var6_6.k1) == null || (var9_9 = (int)kotlin.text.b.k(var22_31))) && ((var22_31 = var6_6.j1) == null || (var9_9 = (int)kotlin.text.b.k(var22_31)))) ** GOTO lbl225
                var22_31 = var6_6.k1;
                if (var22_31 == null || (var9_9 = (int)kotlin.text.b.k(var22_31))) {
                    if (var19_28 != 0) {
                        var1_1 = (ProductOptionItem)var11_12.get(0);
                        var6_6.t4((Product)var5_5, (ProductOptionItem)var1_1);
                    } else {
                        var18_26 = R$string.selected_product_out_of_stock;
                        var1_1 = hv3_0.K(var18_26);
                        hv3_0.o0(0, (String)var1_1, null);
                    }
                } else {
                    var4_4 = var6_6.j1;
                    if (var4_4 != null) {
                        var19_28 = (int)kotlin.text.b.k((CharSequence)var4_4);
                    }
lbl225:
                    // 4 sources

                    var1_1 = var1_1.getBaseOptions();
                    var4_4 = "closetViewModel";
                    if (var1_1 != null) {
                        var1_1 = var1_1.iterator();
                        while ((var12_14 = (int)var1_1.hasNext()) != 0) {
                            var5_5 = (ProductOption)var1_1.next();
                            var8_8 = var5_5.getVariantType();
                            if (var8_8 == null || !(var7_7 = Intrinsics.areEqual(var8_8 = var5_5.getVariantType(), var22_31 = "FnlSizeVariant")) || (var5_5 = var5_5.getOptions()) == null) continue;
                            var1_1 = var6_6.u;
                            if (var1_1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                            } else {
                                var3_3 /* !! */  = var1_1;
                            }
                            var3_3 /* !! */ .r.setVariantOptions((List)var5_5);
                            var1_1 = var6_6.S;
                            if (var1_1 != null) {
                                var1_1.h();
                            }
                            ** GOTO lbl267
                        }
                    } else if (var11_12 != null) {
                        var1_1 = var6_6.u;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        } else {
                            var3_3 /* !! */  = var1_1;
                        }
                        var3_3 /* !! */ .r.setVariantOptions((List)var11_12);
                        var1_1 = var6_6.S;
                        if (var1_1 != null) {
                            var1_1.h();
                            ** GOTO lbl267
                        }
                    }
                }
                ** GOTO lbl267
lbl255:
                // 1 sources

                var18_27 = var1_1.getStatus();
                if (var18_27 == var9_9) {
                    var1_1 = StringCompanionObject.INSTANCE;
                    var18_27 = R$string.acc_error_message;
                    var1_1 = hv3_0.K(var18_27);
                    var3_3 /* !! */  = hv3_0.K(R$string.something_wrong_msg);
                    var5_5 = new Object[var9_9];
                    var5_5[0] = var3_3 /* !! */ ;
                    var1_1 = xh2_0.a((Object[])var5_5, var9_9, (String)var1_1, (String)var4_4);
                    var2_2 = R$string.something_wrong_msg;
                    var3_3 /* !! */  = hv3_0.K(var2_2);
                    var6_6.kb((String)var3_3 /* !! */ , (String)var1_1);
                }
lbl267:
                // 10 sources

                return Unit.a;
            }
            case 0: 
        }
        var4_4 = var1_1;
        var4_4 = (Throwable)var1_1;
        var6_6 = (vy0_1)var6_6;
        Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
        var1_1 = var6_6.c;
        var3_3 /* !! */  = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(var4_4);
        var3_3 /* !! */  = ApiErrorRepo.handleApiException$default((ApiErrorRepo)var3_3 /* !! */ , (Throwable)var4_4, "gameZoneRewards", false, null, null, 28, null);
        var1_1.k(var3_3 /* !! */ );
        return Unit.a;
    }
}

