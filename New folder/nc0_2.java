/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.RecyclerViewUtil;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import com.ril.ajio.services.data.Offers.BankOffer;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from nc0
 */
public final class nc0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ nc0_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 /* !! */  = "this$0";
        var3_3 = 0;
        var4_4 /* !! */  = null;
        var5_5 = 0;
        var6_6 = null;
        var7_7 = this.b;
        var8_8 = 1;
        var9_9 /* !! */  = this.a;
        switch (var9_9 /* !! */ ) {
            default: {
                var2_2 /* !! */  = var1_1;
                var2_2 /* !! */  = (BaseResponse)var1_1;
                cp_1.Companion.getClass();
                var4_4 /* !! */  = cp$a.e();
                var4_4 /* !! */ .getClass();
                var3_3 = cp_1.I((BaseResponse)var2_2 /* !! */ );
                if (var3_3 == 0) ** GOTO lbl191
                var7_7 = (vv2_2)var7_7;
                var7_7.getClass();
                var4_4 /* !! */  = var2_2 /* !! */ .getResponseStatusType();
                var10_10 = ResponseStatusType.API_LOADING;
                if (var4_4 /* !! */  == var10_10 || (var3_3 = var7_7.isAdded()) == 0) ** GOTO lbl191
                var4_4 /* !! */  = var2_2 /* !! */ .getResponseStatusType();
                var10_10 = ResponseStatusType.API_SUCCESS;
                var11_13 = "searchShimmerParent";
                var12_14 = "searchCmsShimmerParent";
                if (var4_4 /* !! */  != var10_10) ** GOTO lbl167
                var4_4 /* !! */  = (HomeData)var2_2 /* !! */ .getData();
                if (var4_4 /* !! */  == null || (var10_10 = var4_4 /* !! */ .getHomeRowData()) == null) ** GOTO lbl191
                yx0_0.a = var4_4 /* !! */ .getPageTitle();
                var4_4 /* !! */  = var7_7.s;
                var4_4 /* !! */ .clear();
                var10_10 = (Collection)var10_10;
                var4_4 /* !! */ .addAll(var10_10);
                var10_10 = var7_7.C;
                var13_15 = "trendingCategoriesListViewNew";
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var13_15);
                    var9_9 /* !! */  = 0;
                    var10_10 = null;
                }
                var14_16 = R$drawable.rv_divider_search;
                RecyclerViewUtil.setDivider((RecyclerView)var10_10, var14_16);
                var10_10 = var7_7.C;
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var13_15);
                    var9_9 /* !! */  = 0;
                    var10_10 = null;
                }
                var15_17 /* !! */  = var7_7.getContext();
                var16_20 = new WrapperLinearLayoutManager(var15_17 /* !! */ );
                var10_10.setLayoutManager((RecyclerView$o)var16_20);
                var10_10 = var7_7.C;
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var13_15);
                    var9_9 /* !! */  = 0;
                    var10_10 = null;
                }
                ai0_2.B((View)var10_10);
                var17_22 = var7_7.D0;
                var9_9 /* !! */  = (int)var7_7.isAdded();
                if (var9_9 /* !! */  == 0) ** GOTO lbl156
                var10_10 = var2_2 /* !! */ .getResponseStatusType();
                var15_17 /* !! */  = (Context)vV2$b.$EnumSwitchMapping$0;
                var9_9 /* !! */  = var10_10.ordinal();
                if ((var9_9 /* !! */  = (int)var15_17 /* !! */ [var9_9 /* !! */ ]) == var8_8 || var9_9 /* !! */  == (var8_8 = 2)) ** GOTO lbl146
                var8_8 = 3;
                if (var9_9 /* !! */  == var8_8) ** GOTO lbl135
                var8_8 = 4;
                if (var9_9 /* !! */  == var8_8) {
                    var18_24 /* !! */  = var7_7.E;
                    if (var18_24 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_13);
                        var8_8 = 0;
                        var18_24 /* !! */  = null;
                    }
                    if ((var10_10 = var7_7.F) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var12_14);
                        var9_9 /* !! */  = 0;
                        var10_10 = null;
                    }
                    hv3_0.t0(var18_24 /* !! */ , (View)var10_10);
                    var18_24 /* !! */  = (HomeData)var2_2 /* !! */ .getData();
                    if (var18_24 /* !! */  != null) {
                        var18_24 /* !! */  = var18_24 /* !! */ .getHomeRowData();
                    } else {
                        var8_8 = 0;
                        var18_24 /* !! */  = null;
                    }
                    var18_24 /* !! */  = (Collection)var18_24 /* !! */ ;
                    if (var18_24 /* !! */  != null && (var8_8 = (int)var18_24 /* !! */ .isEmpty()) == 0) {
                        var4_4 /* !! */ .clear();
                        var2_2 /* !! */  = (HomeData)var2_2 /* !! */ .getData();
                        if (var2_2 /* !! */  != null && (var2_2 /* !! */  = var2_2 /* !! */ .getHomeRowData()) != null) {
                            var2_2 /* !! */  = (Collection)var2_2 /* !! */ ;
                            var4_4 /* !! */ .addAll(var2_2 /* !! */ );
                        }
                        var19_29 = e00$a.Home;
                        var20_31 = var2_2 /* !! */  = var7_7.L0.getValue();
                        var20_31 = (F12)var2_2 /* !! */ ;
                        var15_17 /* !! */  = var7_7.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(var15_17 /* !! */ , "requireActivity(...)");
                        var16_20 = var2_2 /* !! */  = var7_7.J0.getValue();
                        var16_20 = (ky1_0)var2_2 /* !! */ ;
                        var10_10 = var2_2 /* !! */ ;
                        var21_32 = 5244;
                        var22_33 = null;
                        var23_35 = null;
                        var24_37 = false;
                        var25_39 = null;
                        var26_41 = null;
                        var27_43 = var7_7.O0;
                        var28_44 = var7_7.N0;
                        var18_24 /* !! */  = var17_22;
                        var17_22 = var7_7;
                        var7_7.I0 = var2_2 /* !! */  = new e00((FragmentActivity)var15_17 /* !! */ , (ky1_0)var16_20, null, null, null, null, var27_43, var7_7, var7_7, false, (F12)var20_31, null, var28_44, var19_29, null, (ArrayList)var18_24 /* !! */ , (FV2)var7_7, (AV2)var7_7, var21_32);
                        var2_2 /* !! */ .q((ArrayList)var4_4 /* !! */ );
                        var2_2 /* !! */  = var7_7.C;
                        if (var2_2 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var13_15);
                            var29_46 = false;
                            var2_2 /* !! */  = null;
                        }
                        var18_24 /* !! */  = var7_7.getContext();
                        var4_4 /* !! */  = new WrapperLinearLayoutManager((Context)var18_24 /* !! */ );
                        var2_2 /* !! */ .setLayoutManager((RecyclerView$o)var4_4 /* !! */ );
                        var2_2 /* !! */  = var7_7.C;
                        if (var2_2 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var13_15);
                            var29_46 = false;
                            var2_2 /* !! */  = null;
                        }
                        var4_4 /* !! */  = var7_7.H0;
                        var18_24 /* !! */  = new lv2_2((vv2_2)var7_7);
                        var2_2 /* !! */  = (Unit)ai0_2.r((Function2)var18_24 /* !! */ , var2_2 /* !! */ , var4_4 /* !! */ );
                    }
                } else {
                    var2_2 /* !! */  = new NoWhenBranchMatchedException();
                    throw var2_2 /* !! */ ;
lbl135:
                    // 1 sources

                    var2_2 /* !! */  = var7_7.E;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_13);
                        var29_46 = false;
                        var2_2 /* !! */  = null;
                    }
                    if ((var4_4 /* !! */  = var7_7.F) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var12_14);
                        var3_3 = 0;
                        var4_4 /* !! */  = null;
                    }
                    hv3_0.r0((ShimmerFrameLayout)var2_2 /* !! */ , (View)var4_4 /* !! */ );
                }
                ** GOTO lbl156
lbl146:
                // 1 sources

                var2_2 /* !! */  = var7_7.E;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_13);
                    var29_46 = false;
                    var2_2 /* !! */  = null;
                }
                if ((var4_4 /* !! */  = var7_7.F) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var12_14);
                    var3_3 = 0;
                    var4_4 /* !! */  = null;
                }
                hv3_0.t0((ShimmerFrameLayout)var2_2 /* !! */ , (View)var4_4 /* !! */ );
lbl156:
                // 4 sources

                var2_2 /* !! */  = var7_7.E;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var11_13);
                    var29_46 = false;
                    var2_2 /* !! */  = null;
                }
                if ((var4_4 /* !! */  = var7_7.F) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var12_14);
                } else {
                    var6_6 = var4_4 /* !! */ ;
                }
                hv3_0.t0((ShimmerFrameLayout)var2_2 /* !! */ , (View)var6_6);
                ** GOTO lbl191
lbl167:
                // 1 sources

                var4_4 /* !! */  = var2_2 /* !! */ .getResponseStatusType();
                if (var4_4 /* !! */  == (var18_25 = ResponseStatusType.API_FAILURE)) {
                    var2_2 /* !! */  = var7_7.E;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_13);
                        var29_47 = false;
                        var2_2 /* !! */  = null;
                    }
                    if ((var4_4 /* !! */  = var7_7.F) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var12_14);
                    } else {
                        var6_6 = var4_4 /* !! */ ;
                    }
                    hv3_0.t0((ShimmerFrameLayout)var2_2 /* !! */ , (View)var6_6);
                } else if ((var2_2 /* !! */  = var2_2 /* !! */ .getResponseStatusType()) == (var4_4 /* !! */  = ResponseStatusType.API_EXCEPTION)) {
                    var2_2 /* !! */  = var7_7.E;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_13);
                        var29_48 = false;
                        var2_2 /* !! */  = null;
                    }
                    if ((var4_4 /* !! */  = var7_7.F) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var12_14);
                    } else {
                        var6_6 = var4_4 /* !! */ ;
                    }
                    hv3_0.t0((ShimmerFrameLayout)var2_2 /* !! */ , (View)var6_6);
                }
lbl191:
                // 8 sources

                return Unit.a;
            }
            case 1: {
                var10_11 = var1_1;
                var10_11 = (DataCallback)var1_1;
                var7_7 = (q22_0)var7_7;
                Intrinsics.checkNotNullParameter(var7_7, (String)var2_2 /* !! */ );
                var7_7.getClass();
                fq2_1.e.stop();
                var2_2 /* !! */  = var7_7.cb().d;
                var29_49 = var2_2 /* !! */ .O;
                if (var29_49 != 0 || (var29_49 = nn_2.b((cp$a)(var2_2 /* !! */  = cp_1.Companion), (DataCallback)var10_11)) == 0) ** GOTO lbl273
                var2_2 /* !! */  = var7_7.N;
                var15_18 /* !! */  = var7_7.O;
                hv3_0.t0((ShimmerFrameLayout)var2_2 /* !! */ , var15_18 /* !! */ );
                var29_49 = var10_11.getStatus();
                if (var29_49 != 0) ** GOTO lbl258
                var2_2 /* !! */  = var7_7.cb().d;
                var18_26 = (ProductsList)var10_11.getData();
                if (var18_26 == null || (var18_26 = var18_26.getLastSavedCohort()) == null) {
                    var18_26 = "";
                }
                var2_2 /* !! */ .getClass();
                var15_18 /* !! */  = "<set-?>";
                Intrinsics.checkNotNullParameter(var18_26, (String)var15_18 /* !! */ );
                var2_2 /* !! */ .J0 = var18_26;
                var2_2 /* !! */  = var7_7.cb().d;
                var18_26 = (ProductsList)var10_11.getData();
                if (var18_26 != null) {
                    var18_26 = var18_26.getUserGroup();
                } else {
                    var8_8 = 0;
                    var18_26 = null;
                }
                if (var18_26 != null) {
                    var2_2 /* !! */ .I0 = var18_26;
                } else {
                    var2_2 /* !! */ .getClass();
                }
                var2_2 /* !! */  = var7_7.cb();
                var18_26 = var10_11.getData();
                Intrinsics.checkNotNull(var18_26);
                var18_26 = (ProductsList)var18_26;
                var2_2 /* !! */ .n((ProductsList)var18_26, false);
                var7_7.yb();
                var29_49 = (int)var7_7.zb();
                if (var29_49 == 0) ** GOTO lbl239
                var2_2 /* !! */  = Unit.a;
                ** GOTO lbl274
lbl239:
                // 1 sources

                var29_49 = (int)var7_7.jb();
                if (var29_49 != 0) {
                    var2_2 /* !! */  = var7_7.cb().d;
                    var4_4 /* !! */  = (ProductsList)var10_11.getData();
                    if (var4_4 /* !! */  != null) {
                        var4_4 /* !! */  = var4_4 /* !! */ .getQuickFilters();
                    } else {
                        var3_3 = 0;
                        var4_4 /* !! */  = null;
                    }
                    var2_2 /* !! */ .E((List)var4_4 /* !! */ );
                    var7_7.o0();
                    var2_2 /* !! */  = (ProductsList)var10_11.getData();
                    if (var2_2 /* !! */  != null && (var2_2 /* !! */  = var2_2 /* !! */ .getPagination()) != null) {
                        var29_49 = var2_2 /* !! */ .getCurrentPage();
                        var6_6 = var29_49;
                    }
                    var7_7.kb((Integer)var6_6);
                }
                var2_2 /* !! */  = (ProductsList)var10_11.getData();
                var7_7.Ta((ProductsList)var2_2 /* !! */ );
                ** GOTO lbl273
lbl258:
                // 1 sources

                var29_49 = var10_11.getStatus();
                if (var29_49 == var8_8) {
                    var2_2 /* !! */  = StringCompanionObject.INSTANCE;
                    var29_49 = R$string.acc_error_message_page_load_fail;
                    var2_2 /* !! */  = hv3_0.K(var29_49);
                    var6_6 = hv3_0.K(R$string.something_wrong_msg);
                    var10_11 = new Object[var8_8];
                    var10_11[0] = var6_6;
                    var2_2 /* !! */  = xh2_0.a(var10_11, var8_8, (String)var2_2 /* !! */ , "format(...)");
                    var5_5 = R$string.something_wrong_msg;
                    var6_6 = hv3_0.K(var5_5);
                    hv3_0.o0(var8_8, (String)var6_6, (String)var2_2 /* !! */ );
                    var2_2 /* !! */  = var7_7.P;
                    Intrinsics.checkNotNull(var2_2 /* !! */ );
                    var2_2 /* !! */ .setLoadingSate(false);
                }
lbl273:
                // 5 sources

                var2_2 /* !! */  = Unit.a;
lbl274:
                // 2 sources

                return var2_2 /* !! */ ;
            }
            case 0: 
        }
        var10_12 /* !! */  = var1_1;
        var10_12 /* !! */  = (DataCallback)var1_1;
        var7_7 = (pc0_2)var7_7;
        Intrinsics.checkNotNullParameter(var7_7, (String)var2_2 /* !! */ );
        var2_2 /* !! */  = cp_1.Companion;
        var29_50 = nn_2.b((cp$a)var2_2 /* !! */ , (DataCallback)var10_12 /* !! */ );
        if (var29_50 != 0) {
            var29_50 = var10_12 /* !! */ .getStatus();
            if (var29_50 == 0) {
                var2_2 /* !! */  = (BankOffer)var10_12 /* !! */ .getData();
                var10_12 /* !! */  = var7_7.g;
                if (var10_12 /* !! */  != null) {
                    if (var2_2 /* !! */  != null) {
                        var6_6 = var2_2 /* !! */ .getAllBankOffer();
                    }
                    if (var6_6 != null) {
                        var2_2 /* !! */  = var6_6.iterator();
                        while ((var5_5 = var2_2 /* !! */ .hasNext()) != 0) {
                            var6_6 = (BankOfferItem)var2_2 /* !! */ .next();
                            var23_36 = var6_6.getDescription();
                            var25_40 = var6_6.getBankName();
                            var28_45 = var6_6.getType();
                            var30_51 = -1;
                            var19_30 = null;
                            var16_21 = "";
                            var22_34 = "";
                            var26_42 = "";
                            var32_52 = -1;
                            var34_53 = -1;
                            var15_19 = var17_23;
                            var18_27 = var17_23;
                            var17_23 = new AllOffersItem(var16_21, var22_34, var23_36, var25_40, var26_42, var30_51, var32_52, var34_53, var28_45, false);
                            var36_54 = var6_6.getEndDate();
                            cfr_temp_0 = var36_54 - (var38_55 = 0L);
                            var24_38 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var24_38 /* !! */  > 0) {
                                var36_54 = var6_6.getEndDate();
                                fd0_2.b(var36_54, var17_23);
                            }
                            var6_6 = var10_12 /* !! */ .g;
                            var6_6.add(var3_3, var18_27);
                            var8_8 = 1;
                            var3_3 += var8_8;
                        }
                    }
                }
            } else {
                var29_50 = var10_12 /* !! */ .getStatus();
                if (var29_50 == var8_8) {
                    var2_2 /* !! */  = var10_12 /* !! */ .getError();
                    var18_28 = yn3_0.a;
                    if (var2_2 /* !! */  != null && (var2_2 /* !! */  = var2_2 /* !! */ .getErrorMessage()) != null) {
                        var6_6 = var2_2 /* !! */ .getMessage();
                    }
                    var2_2 /* !! */  = new Object[]{};
                    var18_28.k((String)var6_6, (Object[])var2_2 /* !! */ );
                }
            }
            if ((var2_2 /* !! */  = var7_7.e) != null) {
                var4_4 /* !! */  = (Integer)var2_2 /* !! */ .d();
                Intrinsics.checkNotNull(var4_4 /* !! */ );
                var3_3 = var4_4 /* !! */ .intValue();
                var5_5 = 1;
                var4_4 /* !! */  = Integer.valueOf(var3_3 += var5_5);
                var2_2 /* !! */ .k(var4_4 /* !! */ );
            }
        }
        return Unit.a;
    }
}

