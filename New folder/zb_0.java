/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.closet.activity.ClosetAddToBagActivity;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.ajiocash.AjioCashNew;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform$Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from Zb
 */
public final class zb_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb_0(Object object, int n3) {
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
        var5_5 = this.b;
        var6_6 = 1;
        var7_7 = this.a;
        switch (var7_7) {
            default: {
                var1_1 = (Throwable)var1_1;
                var5_5 = (jH2)var5_5;
                Intrinsics.checkNotNullParameter(var5_5, (String)var4_4);
                Intrinsics.checkNotNullParameter(var1_1, "it");
                var3_3 = var5_5.b.getUserId();
                var4_4 = "optionalemailiduser";
                var2_2 = kotlin.text.b.i((String)var3_3, (String)var4_4, (boolean)var6_6);
                if (var2_2 != 0) {
                    var3_3 = var5_5.b;
                    var4_4 = "";
                    var3_3.setUserId((String)var4_4);
                }
                return g53_0.c((Throwable)var1_1);
            }
            case 2: {
                var1_1 = (DataCallback)var1_1;
                var5_5 = (h91)var5_5;
                Intrinsics.checkNotNullParameter(var5_5, (String)var4_4);
                var5_5.h.k(var1_1);
                return Unit.a;
            }
            case 1: {
                var1_1 = (DataCallback)var1_1;
                var8_8 /* !! */  = ClosetAddToBagActivity.Companion;
                var5_5 = (ClosetAddToBagActivity)var5_5;
                Intrinsics.checkNotNullParameter(var5_5, (String)var4_4);
                var4_4 = cp_1.Companion;
                var9_10 = nn_2.b((cp$a)var4_4, (DataCallback)var1_1);
                if (var9_10 == 0) ** GOTO lbl283
                var4_4 = var5_5.s0;
                var7_7 = 0;
                var8_8 /* !! */  = null;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    var9_10 = 0;
                    var4_4 = null;
                }
                var10_11 = 8;
                var4_4.setVisibility(var10_11);
                Intrinsics.checkNotNull(var1_1);
                var9_10 = var1_1.getStatus();
                if (var9_10 != 0) ** GOTO lbl269
                if ((var1_1 = (Product)var1_1.getData()) != null) ** GOTO lbl51
                var5_5.setResult(0);
                var5_5.finish();
                ** GOTO lbl283
lbl51:
                // 1 sources

                var4_4 = var1_1.getBaseOptions();
                var11_13 /* !! */  = var5_5.t0;
                if (var11_13 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialogLayout");
                    var10_11 = 0;
                    var11_13 /* !! */  = null;
                }
                var11_13 /* !! */ .setVisibility(0);
                var11_13 /* !! */  = new ArrayList();
                var5_5.w0 = var11_13 /* !! */ ;
                var11_13 /* !! */  = new ArrayList();
                var5_5.x0 = var11_13 /* !! */ ;
                var11_13 /* !! */  = "size";
                if (var4_4 != null) {
                    var4_4 = var4_4.iterator();
                    while (var12_15 = var4_4.hasNext()) {
                        var13_17 = (ProductOption)var4_4.next();
                        var14_18 = var13_17.getVariantType();
                        var16_22 = Intrinsics.areEqual(var14_18, var15_20 = "FnlSizeVariant");
                        if (var16_22 == 0 || (var13_17 = var13_17.getOptions()) == null) continue;
                        var13_17 = var13_17.iterator();
                        while ((var16_22 = var13_17.hasNext()) != 0) {
                            var14_18 = (ProductOptionItem)var13_17.next();
                            var15_20 = var14_18.getVariantOptionQualifiers();
                            if (var15_20 == null) continue;
                            var17_24 = var15_20;
                            var17_24 = (Collection)var15_20;
                            var18_25 = var17_24.size();
                            var20_27 = null;
                            for (var19_26 = false; var19_26 < var18_25; var19_26 += var6_6) {
                                var21_28 = (ProductOptionVariant)var15_20.get((int)var19_26);
                                var22_29 = var21_28.getQualifier();
                                var23_30 = kotlin.text.b.i((String)var22_29, (String)var11_13 /* !! */ , (boolean)var6_6);
                                if (!var23_30) continue;
                                var22_29 = var14_18.getStock();
                                if (var22_29 != null && (var22_29 = var22_29.getStockLevel()) != null) {
                                    var23_30 = var22_29.intValue();
                                } else {
                                    var23_30 = 0;
                                    var22_29 = null;
                                }
                                if (var23_30 > 0) {
                                    var23_30 = 1;
                                } else {
                                    var23_30 = 0;
                                    var22_29 = null;
                                }
                                var21_28.setStockAvailable((boolean)var23_30);
                                var22_29 = var5_5.w0;
                                if (var22_29 != null) {
                                    var22_29.add(var21_28);
                                }
                                if ((var21_28 = var5_5.x0) == null) continue;
                                var21_28.add(var14_18);
                            }
                        }
                    }
                }
                var1_1 = var1_1.getVariantOptions();
                var4_4 = var5_5.w0;
                if (var4_4 != null) {
                    var9_10 = (int)var4_4.isEmpty();
                    var4_4 = (boolean)var9_10;
                } else {
                    var9_10 = 0;
                    var4_4 = null;
                }
                Intrinsics.checkNotNull(var4_4);
                var9_10 = var4_4.booleanValue();
                if (var9_10 == 0) ** GOTO lbl166
                var4_4 = var5_5.x0;
                if (var4_4 != null) {
                    var9_10 = var4_4.isEmpty();
                    var4_4 = (boolean)var9_10;
                } else {
                    var9_10 = 0;
                    var4_4 = null;
                }
                Intrinsics.checkNotNull(var4_4);
                var9_10 = var4_4.booleanValue();
                if (var9_10 == 0) ** GOTO lbl166
                if (var1_1 == null) {
                    var5_5.setResult(0);
                    var5_5.finish();
                } else {
                    var1_1 = var1_1.iterator();
                    while ((var9_10 = var1_1.hasNext()) != 0) {
                        var4_4 = (ProductOptionItem)var1_1.next();
                        var13_17 = var4_4.getVariantOptionQualifiers();
                        if (var13_17 == null) continue;
                        var14_18 = var13_17;
                        var14_18 = (Collection)var13_17;
                        var16_22 = var14_18.size();
                        var15_20 = null;
                        for (var24_31 = 0; var24_31 < var16_22; var24_31 += var6_6) {
                            var17_24 = (ProductOptionVariant)var13_17.get(var24_31);
                            var20_27 = var17_24.getQualifier();
                            var19_26 = kotlin.text.b.i((String)var20_27, (String)var11_13 /* !! */ , (boolean)var6_6);
                            if (!var19_26) continue;
                            var20_27 = var4_4.getStock();
                            if (var20_27 != null && (var20_27 = var20_27.getStockLevel()) != null) {
                                var19_26 = var20_27.intValue();
                            } else {
                                var19_26 = false;
                                var20_27 = null;
                            }
                            if (var19_26 > false) {
                                var19_26 = true;
                            } else {
                                var19_26 = false;
                                var20_27 = null;
                            }
                            var17_24.setStockAvailable(var19_26);
                            var20_27 = var5_5.w0;
                            if (var20_27 != null) {
                                var20_27.add(var17_24);
                            }
                            if ((var17_24 = var5_5.x0) == null) continue;
                            var17_24.add(var4_4);
                        }
                    }
lbl166:
                    // 3 sources

                    var5_5.y0 = var1_1 = new LinearLayoutManager((Context)var5_5, 0, false);
                    var1_1 = var5_5.r0;
                    var4_4 = "recyclerViewSize";
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var25_32 = 0;
                        var1_1 = null;
                    }
                    var26_34 = var5_5.y0;
                    var1_1.setLayoutManager((RecyclerView$o)var26_34);
                    var6_6 = hv3_0.q(R$dimen.closet_size_spacing_end);
                    var10_11 = hv3_0.q(R$dimen.closet_size_spacing);
                    var1_1 = new ew_0(var6_6, var10_11);
                    var26_34 = var5_5.r0;
                    if (var26_34 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var6_6 = 0;
                        var26_34 = null;
                    }
                    var26_34.addItemDecoration((RecyclerView$n)var1_1);
                    var26_34 = var5_5.w0;
                    var5_5.v0 = var1_1 = new fa2_1((c92)var5_5, (List)var26_34);
                    var1_1 = var5_5.r0;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var25_32 = 0;
                        var1_1 = null;
                    }
                    var26_34 = var5_5.v0;
                    var1_1.setAdapter((RecyclerView$f)var26_34);
                    var1_1 = var5_5.r0;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var25_32 = 0;
                        var1_1 = null;
                    }
                    var4_4 = new fw_1((ClosetAddToBagActivity)var5_5);
                    var1_1.addOnScrollListener((RecyclerView$s)var4_4);
                    var1_1 = var5_5.w0;
                    if (var1_1 != null) {
                        var25_32 = var1_1.size();
                    } else {
                        var25_32 = 0;
                        var1_1 = null;
                    }
                    if (var25_32 > 0) {
                        var1_1 = var5_5.q0;
                        var4_4 = "sizeDecrementTv";
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                            var25_32 = 0;
                            var1_1 = null;
                        }
                        var1_1.setVisibility(0);
                        var1_1 = var5_5.p0;
                        var26_34 = "sizeIncrementTv";
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var26_34);
                            var25_32 = 0;
                            var1_1 = null;
                        }
                        var1_1.setVisibility(0);
                        var1_1 = var5_5.q0;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                            var25_32 = 0;
                            var1_1 = null;
                        }
                        var10_11 = R$drawable.quantity_disable_dec;
                        var1_1.setBackgroundResource(var10_11);
                        var1_1 = var5_5.q0;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                            var25_32 = 0;
                            var1_1 = null;
                        }
                        var10_11 = R$string.acc_quantity_decrease_icon;
                        var11_13 /* !! */  = hv3_0.K(var10_11);
                        var1_1.setContentDescription((CharSequence)var11_13 /* !! */ );
                        var1_1 = var5_5.q0;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                            var25_32 = 0;
                            var1_1 = null;
                        }
                        var1_1.setClickable(false);
                        var1_1 = var5_5.p0;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var26_34);
                            var25_32 = 0;
                            var1_1 = null;
                        }
                        var9_10 = R$drawable.quantity_disable_inc;
                        var1_1.setBackgroundResource(var9_10);
                        var1_1 = var5_5.p0;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var26_34);
                            var25_32 = 0;
                            var1_1 = null;
                        }
                        var9_10 = R$string.acc_quantity_increase_icon;
                        var4_4 = hv3_0.K(var9_10);
                        var1_1.setContentDescription((CharSequence)var4_4);
                        var1_1 = var5_5.p0;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var26_34);
                        } else {
                            var8_8 /* !! */  = var1_1;
                        }
                        var8_8 /* !! */ .setClickable(false);
                        var1_1 = new Handler();
                        var4_4 = new eW(var5_5, 0);
                        var27_35 = 200L;
                        var1_1.postDelayed((Runnable)var4_4, var27_35);
                    }
                }
                ** GOTO lbl283
lbl269:
                // 1 sources

                var25_33 = var1_1.getStatus();
                if (var25_33 == var6_6) {
                    var1_1 = StringCompanionObject.INSTANCE;
                    var25_33 = R$string.acc_error_message;
                    var1_1 = hv3_0.K(var25_33);
                    var9_10 = R$string.something_wrong_msg;
                    var4_4 = hv3_0.K(var9_10);
                    var8_8 /* !! */  = new Object[var6_6];
                    var8_8 /* !! */ [0] = var4_4;
                    var3_3 = "format(...)";
                    var1_1 = xh2_0.a(var8_8 /* !! */ , var6_6, (String)var1_1, (String)var3_3);
                    var2_2 = R$string.product_not_added_to_cart;
                    mq0_2.a(var2_2, (String)var1_1);
                    var5_5.finish();
                }
lbl283:
                // 7 sources

                return Unit.a;
            }
            case 0: 
        }
        var4_4 = var1_1;
        var4_4 = (dl2_2)var1_1;
        var1_1 = var5_5;
        var1_1 = (zr1_1)var5_5;
        Intrinsics.checkNotNullParameter(var1_1, "$ajioWalletMLD");
        Intrinsics.checkNotNullParameter(var4_4, "ajioWalletResp");
        var3_3 = (AjioCashNew)var4_4.b;
        var5_5 = var4_4.a;
        var29_36 = var5_5.d();
        if (var29_36 && var3_3 != null) {
            var4_4 = new AjioWalletTransform$Builder();
            var3_3 = var4_4.transform((AjioCashNew)var3_3);
            var4_4 = DataCallback.Companion;
            var3_3 = var4_4.onSuccess(var3_3);
            var1_1.i(var3_3);
            var1_1 = g53_0.d(Boolean.TRUE);
        } else {
            var15_21 = DataCallback.Companion;
            var3_3 = ApiErrorRepo.INSTANCE;
            var12_16 = 24;
            var16_23 = false;
            var14_19 = null;
            var5_5 = "AJIOCashBonus";
            var6_6 = 1;
            var7_7 = 0;
            var8_9 = null;
            var10_12 = false;
            var11_14 = null;
            var3_3 = ApiErrorRepo.getApiError$default((ApiErrorRepo)var3_3, (dl2_2)var4_4, (String)var5_5, (boolean)var6_6, null, null, var12_16, null);
            var3_3 = var15_21.onFailed((DataError)var3_3);
            var1_1.i(var3_3);
            var1_1 = g53_0.d(Boolean.FALSE);
        }
        return var1_1;
    }
}

