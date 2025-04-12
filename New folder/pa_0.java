/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.ImageSearchResponse;
import com.ril.ajio.services.data.ProductType;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pa
 */
public final class pa_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa_0(Object object, int n3) {
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
                var1_1 /* !! */  = (L50)var1_1 /* !! */ ;
                Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "$this$ConstraintSet");
                var1_1 /* !! */ .getClass();
                var3_3 = new t50("tagsListComposable");
                var4_8 = new t50("brandDescriptionComposable");
                var5_12 = new t50("brandTitleComposable");
                var6_14 = new t50("brandImageComposable");
                var8_18 = (Subcomponent)this.b;
                var7_16 /* !! */  = new bt_1(var8_18, 2);
                var1_1 /* !! */ .b((t50)var3_3, var7_16 /* !! */ );
                var7_16 /* !! */  = new kf2_1((t50)var3_3, var8_18);
                var1_1 /* !! */ .b(var4_8, var7_16 /* !! */ );
                var3_3 = new je1_0(2, var4_8, var8_18);
                var1_1 /* !! */ .b(var5_12, (Function1)var3_3);
                var3_3 = new lf2_1(var5_12, var8_18);
                var1_1 /* !! */ .b(var6_14, (Function1)var3_3);
                return Unit.a;
            }
            case 3: {
                var1_1 /* !! */  = (Boolean)var1_1 /* !! */ ;
                var1_1 /* !! */ .getClass();
                var3_4 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(var3_4, "$viewModel");
                var3_4.C0.setValue(var1_1 /* !! */ );
                return Unit.a;
            }
            case 2: {
                var1_1 /* !! */  = (DataCallback)var1_1 /* !! */ ;
                var3_5 = (NewProductDetailsFragment)this.b;
                Intrinsics.checkNotNullParameter(var3_5, "this$0");
                var4_9 = cp_1.Companion;
                var9_20 = nn_2.b((cp$a)var4_9, (DataCallback)var1_1 /* !! */ );
                if (var9_20 == 0) ** GOTO lbl100
                var9_20 = var1_1 /* !! */ .getStatus();
                var10_21 = 27;
                var11_23 = false;
                var6_15 = null;
                if (var9_20 != 0) ** GOTO lbl77
                if ((var1_1 /* !! */  = (ReferralConfigCash)var1_1 /* !! */ .getData()) == null) ** GOTO lbl-1000
                var3_5.getClass();
                var4_9 = var1_1 /* !! */ .getReferee();
                if (var4_9 != null && (var4_9 = var4_9.getTotalBonus()) != null) {
                    var12_25 = var4_9.floatValue();
                } else lbl-1000:
                // 2 sources

                {
                    var9_20 = 0;
                    var12_25 = 0.0f;
                    var4_9 = null;
                }
                var3_5.i1 = var12_25;
                if (var1_1 /* !! */  != null && (var1_1 /* !! */  = var1_1 /* !! */ .getReferrer()) != null && (var1_1 /* !! */  = var1_1 /* !! */ .getTotalBonus()) != null) {
                    var3_5.h1 = var13_26 = var1_1 /* !! */ .floatValue();
                    var1_1 /* !! */  = var3_5.L;
                    if (var1_1 /* !! */  != null) {
                        var1_1 /* !! */  = var1_1 /* !! */ .getAdapter();
                    } else {
                        var14_28 = 0;
                        var1_1 /* !! */  = null;
                        var13_26 = 0.0f;
                    }
                    var9_20 = var1_1 /* !! */  instanceof yh2_1;
                    if (var9_20 != 0) {
                        var1_1 /* !! */  = (yh2_1)var1_1 /* !! */ ;
                    } else {
                        var14_28 = 0;
                        var1_1 /* !! */  = null;
                        var13_26 = 0.0f;
                    }
                    if (var1_1 /* !! */  != null) {
                        var6_15 = var1_1 /* !! */ .g(var10_21);
                    }
                    if (var6_15 != null) {
                        var14_28 = ((Number)var6_15).intValue();
                        var3_5 = var3_5.L;
                        if (var3_5 != null && (var3_5 = var3_5.getAdapter()) != null) {
                            var3_5.notifyItemChanged(var14_28);
                        }
                    }
                }
                ** GOTO lbl100
lbl77:
                // 1 sources

                var14_29 = -1082130432;
                var3_5.h1 = var13_27 = -1.0f;
                var1_1 /* !! */  = var3_5.L;
                if (var1_1 /* !! */  != null) {
                    var1_1 /* !! */  = var1_1 /* !! */ .getAdapter();
                } else {
                    var14_29 = 0;
                    var1_1 /* !! */  = null;
                    var13_27 = 0.0f;
                }
                var9_20 = var1_1 /* !! */  instanceof yh2_1;
                if (var9_20 != 0) {
                    var1_1 /* !! */  = (yh2_1)var1_1 /* !! */ ;
                } else {
                    var14_29 = 0;
                    var1_1 /* !! */  = null;
                    var13_27 = 0.0f;
                }
                if (var1_1 /* !! */  != null) {
                    var6_15 = var1_1 /* !! */ .g(var10_21);
                }
                if (var6_15 != null) {
                    var14_29 = ((Number)var6_15).intValue();
                    var3_5 = var3_5.L;
                    if (var3_5 != null && (var3_5 = var3_5.getAdapter()) != null) {
                        var3_5.notifyItemChanged(var14_29);
                    }
                }
lbl100:
                // 7 sources

                return Unit.a;
            }
            case 1: {
                var1_1 /* !! */  = (UY2)var1_1 /* !! */ ;
                var4_10 = (CMSNavigation)this.b;
                Intrinsics.checkNotNullParameter(var4_10, "$category");
                Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "$this$semantics");
                var3_6 = var4_10.getInactiveAltText();
                if (var3_6 == null && (var3_6 = var4_10.getName()) == null) {
                    var3_6 = "category";
                }
                RY2.e((UY2)var1_1 /* !! */ , var3_6);
                return Unit.a;
            }
            case 0: 
        }
        var1_1 /* !! */  = (ImageSearchResponse)var1_1 /* !! */ ;
        var4_11 = (ia_0)this.b;
        Intrinsics.checkNotNullParameter(var4_11, "this$0");
        var3_7 = var4_11.N1;
        var10_22 = false;
        var5_13 = null;
        hv3_0.t0((ShimmerFrameLayout)var3_7, null);
        var4_11.I1 = var1_1 /* !! */ ;
        if (var1_1 /* !! */  != null) {
            var4_11.Tb();
            var3_7 = var1_1 /* !! */ .getProduct_types();
            if (var3_7 != null) {
                var3_7 = (Collection)var3_7;
                var2_2 = (int)var3_7.isEmpty();
                var11_24 = 1;
                if ((var2_2 ^= var11_24) == var11_24 && (var3_7 = var1_1 /* !! */ .getProduct_types()) != null) {
                    var3_7 = ((Iterable)var3_7).iterator();
                    while ((var15_31 = var3_7.hasNext()) != 0) {
                        var7_17 = (ProductType)var3_7.next();
                        var15_31 = var7_17.getSelected();
                        if (var15_31 == 0) continue;
                        var7_17 = var1_1 /* !! */ .getPagination();
                        if (var7_17 != null) {
                            var15_31 = var7_17.getTotalResults();
                            var7_17 = var15_31;
                        } else {
                            var15_31 = 0;
                            var7_17 = null;
                        }
                        if (var7_17 != null && (var16_30 = var7_17.intValue()) == var11_24) {
                            var8_19 = new StringBuilder();
                            var8_19.append(var7_17);
                            var8_19.append(" Product");
                            var7_17 = var8_19.toString();
                        } else {
                            var8_19 = new StringBuilder();
                            var8_19.append(var7_17);
                            var8_19.append(" Products");
                            var7_17 = var8_19.toString();
                        }
                        var4_11.Eb(null, (String)var7_17);
                    }
                }
            }
        } else {
            var1_1 /* !! */  = var4_11.E1;
            if (var1_1 /* !! */  != null) {
                var1_1 /* !! */ .showTechError();
            }
        }
        return Unit.a;
    }
}

