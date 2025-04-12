/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout$LayoutParams
 */
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from bb
 */
public final class bb_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bb_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this;
        var3_3 = "this$0";
        var4_4 = this.b;
        var5_5 = 1;
        var6_6 = this.a;
        switch (var6_6) {
            default: {
                var7_7 = var1_1;
                var7_7 = (String)var1_1;
                var4_4 = (vv2_2)var4_4;
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                Intrinsics.checkNotNullParameter(var7_7, "it");
                var4_4.F0 = var5_5;
                var4_4.G0 = var7_7;
                return Unit.a;
            }
            case 2: {
                var7_8 = var1_1;
                var7_8 = (DataCallback)var1_1;
                var8_9 = com.ril.ajio.myaccount.order.fragment.b.Companion;
                var4_4 = (b)var4_4;
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                var3_3 = cp_1.Companion;
                var9_10 = nn_2.b((cp$a)var3_3, (DataCallback)var7_8);
                if (var9_10 == 0) ** GOTO lbl459
                var3_3 = var4_4.s;
                var10_11 = 0;
                var11_12 = 0.0f;
                var8_9 = null;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    var9_10 = 0;
                    var3_3 = null;
                }
                var3_3.stopLoader();
                var9_10 = var7_8.getStatus();
                if (var9_10 != 0) ** GOTO lbl459
                var3_3 = (ProductsList)var7_8.getData();
                var12_13 = 0;
                var13_14 = null;
                if (var3_3 != null && (var3_3 = var3_3.getProducts()) != null) {
                    var9_10 = var3_3.size();
                } else {
                    var9_10 = 0;
                    var3_3 = null;
                }
                if (var9_10 <= 0) ** GOTO lbl459
                var3_3 = (ProductsList)var7_8.getData();
                if (var3_3 == null) ** GOTO lbl366
                var6_6 = (int)DW.b();
                var14_15 = 1001;
                var15_16 = 1000;
                if (var6_6 != 0) ** GOTO lbl59
                var7_8 = g62_0.c;
                var7_8.b(null, var15_16);
                var16_17 = 0;
                var7_8.b(var16_17, var14_15);
                var17_19 = Boolean.FALSE;
                var15_16 = 1002;
                var7_8.b(var17_19, var15_16);
                ** GOTO lbl367
lbl59:
                // 1 sources

                var7_8 = g62_0.c;
                var18_21 = var7_8.a;
                var19_23 = Integer.valueOf(var15_16);
                if ((var18_21 = (ProductsList)var18_21.get(var19_23)) != null) ** GOTO lbl65
                var7_8.b(var3_3, var15_16);
                ** GOTO lbl347
lbl65:
                // 1 sources

                var7_8 = var3_3.getPagination();
                var18_21.setPagination((Pagination)var7_8);
                var7_8 = var18_21.getProducts();
                if (var7_8 == null || (var7_8 = var3_3.getProducts()) == null) ** GOTO lbl347
                var7_8 = var18_21.getProducts();
                Intrinsics.checkNotNull(var7_8);
                var16_18 /* !! */  = var3_3.getProducts();
                Intrinsics.checkNotNull(var16_18 /* !! */ );
                var19_23 = new ArrayList();
                var20_24 = var7_8.iterator();
                block5: while (var21_25 = var20_24.hasNext()) {
                    var22_26 = (Product)var20_24.next();
                    var23_27 = var16_18 /* !! */ .iterator();
                    while ((var24_28 = var23_27.hasNext()) != 0) {
                        var25_29 = var23_27.next();
                        Intrinsics.checkNotNull(var25_29, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.Product");
                        var25_29 = (Product)var25_29;
                        var26_30 = var22_26.getFnlColorVariantData();
                        var10_11 = 32;
                        var11_12 = 4.5E-44f;
                        if (var26_30 == null) ** GOTO lbl176
                        var26_30 = var22_26.getFnlColorVariantData();
                        if (var26_30 != null) {
                            var26_30 = var26_30.getColorGroup();
                        } else {
                            var27_31 = 0;
                            var26_30 = null;
                        }
                        if (var26_30 == null) ** GOTO lbl176
                        var26_30 = var22_26.getFnlColorVariantData();
                        if (var26_30 != null) {
                            var26_30 = var26_30.getColorGroup();
                        } else {
                            var27_31 = 0;
                            var26_30 = null;
                        }
                        if (var26_30 == null) ** GOTO lbl131
                        var14_15 = var28_32 = var26_30.length() + -1;
                        var29_33 = false;
                        var30_34 = null;
                        while (var12_13 <= var14_15) {
                            var5_5 = var29_33 == false ? var12_13 : var14_15;
                            if ((var5_5 = Intrinsics.compare(var26_30.charAt(var5_5), var10_11)) <= 0) {
                                var5_5 = 1;
                            } else {
                                var5_5 = 0;
                                var31_35 = null;
                            }
                            if (!var29_33) {
                                if (var5_5 == 0) {
                                    var5_5 = 1;
                                    var29_33 = true;
                                    continue;
                                }
                                var5_5 = 1;
                                var12_13 += var5_5;
                                continue;
                            }
                            var10_11 = 1;
                            var11_12 = 1.4E-45f;
                            if (var5_5 != 0) {
                                var14_15 += -1;
                                var5_5 = 1;
                                var10_11 = 32;
                                var11_12 = 4.5E-44f;
                                continue;
                            }
                            ** GOTO lbl129
                        }
                        var10_11 = 1;
                        var11_12 = 1.4E-45f;
lbl129:
                        // 2 sources

                        var31_35 = com.jio.jioads.adinterfaces.a.a(var14_15, var10_11, var12_13, (String)var26_30);
                        ** GOTO lbl135
lbl131:
                        // 1 sources

                        var10_11 = 1;
                        var11_12 = 1.4E-45f;
                        var5_5 = 0;
                        var31_35 = null;
lbl135:
                        // 2 sources

                        var13_14 = var25_29.getCode();
                        if (var13_14 == null) ** GOTO lbl169
                        var14_15 = var13_14.length() - var10_11;
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                        var24_28 = 0;
                        var25_29 = null;
                        block8: while (var10_11 <= var14_15) {
                            var27_31 = var24_28 == 0 ? var10_11 : var14_15;
                            var27_31 = var13_14.charAt(var27_31);
                            var32_37 = 32;
                            if ((var27_31 = Intrinsics.compare(var27_31, var32_37)) <= 0) {
                                var32_37 = 1;
                            } else {
                                var32_37 = 0;
                                var2_2 = null;
                            }
                            if (var24_28 != 0) ** GOTO lbl161
                            if (var32_37 == 0) {
                                var24_28 = 1;
lbl155:
                                // 3 sources

                                while (true) {
                                    var2_2 = this;
                                    continue block8;
                                    break;
                                }
                            }
                            var27_31 = 1;
                            var10_11 += var27_31;
                            ** GOTO lbl155
lbl161:
                            // 1 sources

                            var27_31 = 1;
                            if (var32_37 != 0) {
                                var14_15 += -1;
                                ** continue;
                            }
                            ** GOTO lbl167
                        }
                        var27_31 = 1;
lbl167:
                        // 2 sources

                        var2_2 = com.jio.jioads.adinterfaces.a.a(var14_15, var27_31, var10_11, (String)var13_14);
                        ** GOTO lbl172
lbl169:
                        // 1 sources

                        var27_31 = 1;
                        var32_37 = 0;
                        var2_2 = null;
lbl172:
                        // 2 sources

                        var32_37 = kotlin.text.b.i(var31_35, (String)var2_2, (boolean)var27_31);
                        var30_34 = var20_24;
                        if (var32_37 == 0) ** GOTO lbl327
                        ** GOTO lbl316
lbl176:
                        // 2 sources

                        var27_31 = 1;
                        var2_2 = var22_26.getCode();
                        if (var2_2 == null) ** GOTO lbl209
                        var5_5 = var2_2.length() - var27_31;
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                        var12_13 = 0;
                        var13_14 = null;
                        while (var10_11 <= var5_5) {
                            var14_15 = var12_13 == 0 ? var10_11 : var5_5;
                            var14_15 = var2_2.charAt(var14_15);
                            var27_31 = 32;
                            if ((var14_15 = Intrinsics.compare(var14_15, var27_31)) <= 0) {
                                var14_15 = 1;
                            } else {
                                var14_15 = 0;
                                var17_20 = null;
                            }
                            if (var12_13 == 0) {
                                if (var14_15 == 0) {
                                    var12_13 = 1;
                                    continue;
                                }
                                var27_31 = 1;
                                var10_11 += var27_31;
                                continue;
                            }
                            var27_31 = 1;
                            if (var14_15 != 0) {
                                var5_5 += -1;
                                continue;
                            }
                            ** GOTO lbl207
                        }
                        var27_31 = 1;
lbl207:
                        // 2 sources

                        var2_2 = com.jio.jioads.adinterfaces.a.a(var5_5, var27_31, var10_11, (String)var2_2);
                        ** GOTO lbl211
lbl209:
                        // 1 sources

                        var32_37 = 0;
                        var2_2 = null;
lbl211:
                        // 2 sources

                        var31_35 = var25_29.getCode();
                        if (var31_35 == null) ** GOTO lbl247
                        var10_11 = var31_35.length() - var27_31;
                        var12_13 = 0;
                        var13_14 = null;
                        var14_15 = 0;
                        var17_20 = null;
                        block11: while (var12_13 <= var10_11) {
                            var27_31 = var14_15 == 0 ? var12_13 : var10_11;
                            var27_31 = var31_35.charAt(var27_31);
                            var30_34 = var20_24;
                            var33_38 = 32;
                            if ((var27_31 = Intrinsics.compare(var27_31, var33_38)) <= 0) {
                                var33_38 = 1;
                            } else {
                                var33_38 = 0;
                                var20_24 = null;
                            }
                            if (var14_15 == 0) {
                                if (var33_38 == 0) {
                                    var20_24 = var30_34;
                                    var14_15 = 1;
                                    continue;
                                }
                                var27_31 = 1;
                                var12_13 += var27_31;
lbl235:
                                // 2 sources

                                while (true) {
                                    var20_24 = var30_34;
                                    continue block11;
                                    break;
                                }
                            }
                            var27_31 = 1;
                            if (var33_38 != 0) {
                                var10_11 += -1;
                                ** continue;
                            }
                            ** GOTO lbl245
                        }
                        var30_34 = var20_24;
                        var27_31 = 1;
lbl245:
                        // 2 sources

                        var31_35 = com.jio.jioads.adinterfaces.a.a(var10_11, var27_31, var12_13, var31_35);
                        ** GOTO lbl250
lbl247:
                        // 1 sources

                        var30_34 = var20_24;
                        var5_5 = 0;
                        var31_35 = null;
lbl250:
                        // 2 sources

                        var32_37 = kotlin.text.b.i((String)var2_2, var31_35, (boolean)var27_31);
                        if (var32_37 != 0) ** GOTO lbl316
                        var2_2 = var25_29.getBaseProduct();
                        if (var2_2 == null || (var31_35 = var22_26.getCode()) == null) ** GOTO lbl327
                        var10_11 = var31_35.length() - var27_31;
                        var12_13 = 0;
                        var13_14 = null;
                        var14_15 = 0;
                        var17_20 = null;
                        while (var12_13 <= var10_11) {
                            var33_38 = var14_15 == 0 ? var12_13 : var10_11;
                            var33_38 = var31_35.charAt(var33_38);
                            var24_28 = 32;
                            if ((var33_38 = Intrinsics.compare(var33_38, var24_28)) <= 0) {
                                var33_38 = 1;
                            } else {
                                var33_38 = 0;
                                var20_24 = null;
                            }
                            if (var14_15 == 0) {
                                if (var33_38 == 0) {
                                    var14_15 = 1;
                                    continue;
                                }
                                var24_28 = 1;
                                var12_13 += var24_28;
                                continue;
                            }
                            var24_28 = 1;
                            if (var33_38 != 0) {
                                var10_11 += -1;
                                continue;
                            }
                            ** GOTO lbl281
                        }
                        var24_28 = 1;
lbl281:
                        // 2 sources

                        var31_35 = com.jio.jioads.adinterfaces.a.a(var10_11, var24_28, var12_13, var31_35);
                        if (var31_35 == null) ** GOTO lbl327
                        var10_11 = var2_2.length() - var24_28;
                        var12_13 = 0;
                        var13_14 = null;
                        var14_15 = 0;
                        var17_20 = null;
                        while (var12_13 <= var10_11) {
                            var33_38 = var14_15 == 0 ? var12_13 : var10_11;
                            var33_38 = var2_2.charAt(var33_38);
                            var24_28 = 32;
                            if ((var33_38 = Intrinsics.compare(var33_38, var24_28)) <= 0) {
                                var33_38 = 1;
                            } else {
                                var33_38 = 0;
                                var20_24 = null;
                            }
                            if (var14_15 == 0) {
                                if (var33_38 == 0) {
                                    var14_15 = 1;
                                    continue;
                                }
                                var27_31 = 1;
                                var12_13 += var27_31;
                                continue;
                            }
                            var27_31 = 1;
                            if (var33_38 != 0) {
                                var10_11 += -1;
                                continue;
                            }
                            ** GOTO lbl310
                        }
                        var27_31 = 1;
lbl310:
                        // 2 sources

                        var2_2 = com.jio.jioads.adinterfaces.a.a(var10_11, var27_31, var12_13, (String)var2_2);
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                        var32_37 = (int)StringsKt.F(var31_35, (CharSequence)var2_2, false);
                        if (var32_37 != var27_31) ** GOTO lbl327
lbl316:
                        // 3 sources

                        var23_27.remove();
                        var2_2 = this;
                        var20_24 = var30_34;
                        var5_5 = 1;
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                        var12_13 = 0;
                        var13_14 = null;
                        var14_15 = 1001;
                        continue block5;
lbl327:
                        // 4 sources

                        var2_2 = this;
                        var20_24 = var30_34;
                        var5_5 = 1;
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                        var12_13 = 0;
                        var13_14 = null;
                        var14_15 = 1001;
                    }
                    var2_2 = this;
                }
                var7_8 = (Collection)var7_8;
                var19_23.addAll(var7_8);
                var16_18 /* !! */  = var16_18 /* !! */ ;
                var19_23.addAll(var16_18 /* !! */ );
                var3_3.setProducts((List)var19_23);
                var18_21.setProducts((List)var19_23);
lbl347:
                // 3 sources

                var2_2 = g62_0.c;
                var5_5 = 0;
                var31_35 = null;
                var7_8 = 0;
                var10_11 = 1001;
                var11_12 = 1.403E-42f;
                var2_2.b(var7_8, var10_11);
                var2_2 = DW.b;
                if (var2_2 != null) {
                    var7_8 = DW.a;
                    var7_8.removeCallbacks((Runnable)var2_2);
                    var34_39 = DW.a();
                    var7_8.postDelayed((Runnable)var2_2, var34_39);
                    var2_2 = yn3_0.a;
                    var7_8 = "Closet Cache clearing scheduled";
                    var8_9 = new Object[]{};
                    var2_2.a((String)var7_8, (Object[])var8_9);
                }
                ** GOTO lbl367
lbl366:
                // 1 sources

                var2_2 = DW.a;
lbl367:
                // 3 sources

                if (var3_3 != null && (var2_2 = var3_3.getProducts()) != null) {
                    var10_11 = var2_2.size();
                } else {
                    var10_11 = 0;
                    var11_12 = 0.0f;
                    var8_9 = null;
                }
                var2_2 = "mOlderOrderBtn";
                var31_35 = "closetRv";
                if (var10_11 == 0) {
                    var3_3 = var4_4.y;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLblCloset");
                        var9_10 = 0;
                        var3_3 = null;
                    }
                    var6_6 = 8;
                    var3_3.setVisibility(var6_6);
                    var3_3 = var4_4.A;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var31_35);
                        var9_10 = 0;
                        var3_3 = null;
                    }
                    var3_3.setVisibility(var6_6);
                    var3_3 = var4_4.j;
                    var31_35 = "mShoppingBtn";
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var31_35);
                        var9_10 = 0;
                        var3_3 = null;
                    }
                    var3_3 = var3_3.getLayoutParams();
                    Intrinsics.checkNotNull(var3_3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    var3_3 = (LinearLayout.LayoutParams)var3_3;
                    var10_11 = 0x40800000;
                    var3_3.weight = var11_12 = 4.0f;
                    var8_9 = var4_4.j;
                    if (var8_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var31_35);
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                    }
                    var8_9.setLayoutParams((ViewGroup.LayoutParams)var3_3);
                    var3_3 = var4_4.k;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                    } else {
                        var8_9 = var3_3;
                    }
                    var8_9.setVisibility(var6_6);
                } else {
                    var7_8 = var4_4.k;
                    if (var7_8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                        var32_37 = 0;
                        var2_2 = null;
                        var6_6 = 0;
                        var7_8 = null;
                    } else {
                        var32_37 = 0;
                        var2_2 = null;
                    }
                    var7_8.setVisibility(0);
                    var7_8 = var4_4.A;
                    if (var7_8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var31_35);
                        var6_6 = 0;
                        var7_8 = null;
                    }
                    var13_14 = var4_4.getActivity();
                    var8_9 = new WrapperLinearLayoutManager((Context)var13_14, 0);
                    var7_8.setLayoutManager((RecyclerView$o)var8_9);
                    var2_2 = var4_4.A;
                    if (var2_2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var31_35);
                        var32_37 = 0;
                        var2_2 = null;
                    }
                    var6_6 = 1;
                    var2_2.setHasFixedSize((boolean)var6_6);
                    if (var3_3 != null) {
                        var3_3 = var3_3.getProducts();
                    } else {
                        var9_10 = 0;
                        var3_3 = null;
                    }
                    var2_2 = new RecyclerView$f();
                    var2_2.a = var3_3;
                    var3_3 = var4_4.A;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var31_35);
                        var10_11 = 0;
                        var11_12 = 0.0f;
                        var8_9 = null;
                    } else {
                        var8_9 = var3_3;
                    }
                    var8_9.setAdapter((RecyclerView$f)var2_2);
                }
lbl459:
                // 5 sources

                return Unit.a;
            }
            case 1: {
                var2_2 = var1_1;
                var2_2 = (Throwable)var1_1;
                var31_36 = dr0_0.Companion;
                var4_4 = (dr0_0)var4_4;
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                var18_22 = var4_4.E0;
                var3_3 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(var2_2);
                var4_4 = var2_2;
                var2_2 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)var3_3, (Throwable)var2_2, "BackGround_GET_GPS_DATA", false, null, null, 28, null);
                var18_22.k(var2_2);
                return Unit.a;
            }
            case 0: 
        }
        var2_2 = var1_1;
        var2_2 = (UY2)var1_1;
        var4_4 = (CMSNavigation)var4_4;
        Intrinsics.checkNotNullParameter(var4_4, "$ajioSubCategory");
        Intrinsics.checkNotNullParameter(var2_2, "$this$semantics");
        var3_3 = var4_4.getInactiveAltText();
        if (var3_3 == null && (var3_3 = var4_4.getName()) == null) {
            var3_3 = "category";
        }
        RY2.e((UY2)var2_2, (String)var3_3);
        return Unit.a;
    }
}

