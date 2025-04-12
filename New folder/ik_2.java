/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.widget.Toast
 */
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Order.CancelReturnRequestResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IK
 */
public final class ik_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ik_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.a;
        var1_1 = (DataCallback)var1_1;
        switch (var2_2) {
            default: {
                var3_3 = (ex1_0)this.b;
                Intrinsics.checkNotNullParameter(var3_3, "this$0");
                var4_5 = nn_2.b(cp_1.Companion, (DataCallback)var1_1);
                var5_6 = false;
                var6_8 = null;
                var7_10 = 0;
                var8_12 = null;
                var9_14 = 1;
                if (var4_5 != 0) {
                    var3_3.Xa();
                    var1_1 = var3_3.Z;
                    if (var1_1 != null && (var4_5 = var3_3.nb()) != 0) {
                        var1_1 = var3_3.Z;
                        if (var1_1 != null) {
                            var1_1.setEnabled((boolean)var9_14);
                        }
                        if ((var1_1 = var3_3.Z) != null) {
                            var1_1.setVisible((boolean)var9_14);
                        }
                    }
                    var1_1 = var3_3.getActivity();
                    var10_16 = 3;
                    var11_17 = "cartViewModel";
                    if (var1_1 != null && (var4_5 = var1_1.isFinishing()) == 0) {
                        var1_1 = var3_3.t;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_17);
                            var4_5 = 0;
                            var1_1 = null;
                        }
                        if ((var1_1 = var1_1.S0) != null) {
                            var1_1 = var3_3.t;
                            if (var1_1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_17);
                                var4_5 = 0;
                                var1_1 = null;
                            }
                            if ((var1_1 = var1_1.S0) != null) {
                                var4_5 = var1_1.getTotalUnitCount();
                            } else {
                                var4_5 = 0;
                                var1_1 = null;
                            }
                            var12_18 = var3_3.a;
                            var12_18.p(var4_5);
                            var1_1 = var3_3.p;
                            if (var1_1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("cartClosetListener");
                                var4_5 = 0;
                                var1_1 = null;
                            }
                            var1_1.updateCartWishCount();
                            var4_5 = (int)var3_3.ob();
                            if (var4_5 == 0 && (var4_5 = (int)var3_3.nb()) != 0) {
                                var1_1 = var3_3.n;
                                var12_18 = "toolbarListener";
                                if (var1_1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_18);
                                    var4_5 = 0;
                                    var1_1 = null;
                                }
                                if ((var1_1 = var1_1.getToolbar()) != null) {
                                    var13_19 = var3_3.ab();
                                    var1_1.setTitle(var13_19);
                                }
                                if ((var4_5 = (int)og1_1.b()) != 0) {
                                    var3_3.Fb();
                                } else {
                                    var3_3.Hb();
                                }
                                var1_1 = var3_3.n;
                                if (var1_1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_18);
                                    var4_5 = 0;
                                    var1_1 = null;
                                }
                                var14_20 = R$drawable.ic_close;
                                var13_19 = var3_3.ab();
                                var1_1.showUpButton((boolean)var9_14, var10_16, var14_20, var13_19);
                            }
                        }
                    }
                    if ((var1_1 = var3_3.v) != null) {
                        var14_20 = var3_3.Nb();
                        var1_1 = var1_1.a((boolean)var14_20);
                    } else {
                        var4_5 = 0;
                        var1_1 = null;
                    }
                    Intrinsics.checkNotNull(var1_1);
                    var3_3.Bb((ArrayList)var1_1);
                    var4_5 = var3_3.F4();
                    if (var4_5 == 0 && (var4_5 = (var1_1 = CartRepo.INSTANCE).isOOSimilarEnabled()) != 0) {
                        var1_1 = var3_3.t;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var11_17);
                            var4_5 = 0;
                            var1_1 = null;
                        }
                        if ((var4_5 = (var1_1 = var1_1.T0).isEmpty() ^ var9_14) != 0) {
                            var1_1 = var3_3.t;
                            if (var1_1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_17);
                                var4_5 = 0;
                                var1_1 = null;
                            }
                            var1_1.getClass();
                            var11_17 = md3_0.c((jD3)var1_1);
                            var12_18 = new lx1_1((wx1_1)var1_1, null);
                            Ae3.d((i90_0)var11_17, null, null, (Function2)var12_18, var10_16);
                        }
                    }
                }
                if ((var1_1 = var3_3.w) == null) ** GOTO lbl188
                var15_21 = new Bundle();
                var3_3 = var1_1.a;
                var16_22 = var3_3.T0;
                var10_16 = var16_22.isEmpty() ^ var9_14;
                var17_23 = var10_16 == 0 && (var9_14 ^= (var10_16 = (int)(var16_22 = var3_3.U0).isEmpty())) == 0 && (var9_14 = (int)var3_3.i1) == 0 ? "" : "OutOfStock";
                var16_22 = var1_1.b;
                var11_17 = var16_22.getSV_EP_CTA_DISABLE();
                var15_21.putString((String)var11_17, (String)var17_23);
                var17_23 = var3_3.S0;
                if (var17_23 != null) {
                    var17_23 = var17_23.getAppliedProductPromotions();
                } else {
                    var9_14 = 0;
                    var17_23 = null;
                }
                if (var17_23 == null) ** GOTO lbl-1000
                var17_23 = var3_3.S0;
                if (var17_23 != null && (var17_23 = var17_23.getAppliedProductPromotions()) != null && (var17_23 = (CartPromotion)var17_23.get(0)) != null) {
                    var17_23 = var17_23.getVoucherMessages();
                } else {
                    var9_14 = 0;
                    var17_23 = null;
                }
                if (var17_23 != null) {
                    var17_23 = var16_22.getSV_EP_PROMO_PRE_APLD();
                    var11_17 = var3_3.S0;
                    if (var11_17 != null && (var11_17 = var11_17.getAppliedProductPromotions()) != null && (var11_17 = (CartPromotion)var11_17.get(0)) != null) {
                        var11_17 = var11_17.getDescription();
                    } else {
                        var18_25 = 0;
                        var11_17 = null;
                    }
                    var15_21.putString((String)var17_23, (String)var11_17);
                    var17_23 = var16_22.getSV_EP_PROMO_MSG();
                    var11_17 = var3_3.S0;
                    if (var11_17 != null && (var11_17 = var11_17.getAppliedProductPromotions()) != null && (var11_17 = (CartPromotion)var11_17.get(0)) != null) {
                        var11_17 = var11_17.getVoucherMessages();
                    } else {
                        var18_25 = 0;
                        var11_17 = null;
                    }
                    var15_21.putString((String)var17_23, (String)var11_17);
                } else lbl-1000:
                // 2 sources

                {
                    var17_23 = var16_22.getSV_EP_PROMO_PRE_APLD();
                    var11_17 = "NA";
                    var15_21.putString((String)var17_23, (String)var11_17);
                    var17_23 = var16_22.getSV_EP_PROMO_MSG();
                    var15_21.putString((String)var17_23, (String)var11_17);
                }
                var17_23 = var16_22.getSV_EP_PRDT_AVL();
                var11_17 = var3_3.S0;
                if (var11_17 != null && (var11_17 = var11_17.getEntries()) != null) {
                    var18_25 = var11_17.size();
                } else {
                    var18_25 = 0;
                    var11_17 = null;
                }
                var12_18 = var3_3.T0;
                var19_26 = var12_18.size() + var18_25;
                var15_21.putInt((String)var17_23, var19_26);
                var17_23 = var16_22.getNUMBER_OF_ITEMS();
                var11_17 = var3_3.S0;
                if (var11_17 != null && (var11_17 = var11_17.getEntries()) != null) {
                    var18_25 = var11_17.size();
                } else {
                    var18_25 = 0;
                    var11_17 = null;
                }
                var19_26 = var12_18.size() + var18_25;
                var15_21.putInt((String)var17_23, var19_26);
                var17_23 = var16_22.getNUMBER_OF_SIZE_OOS();
                var18_25 = var12_18.size();
                var15_21.putInt((String)var17_23, var18_25);
                var17_23 = var16_22.getSHIPPING_CHARGES();
                var11_17 = var3_3.S0;
                if (var11_17 != null && (var11_17 = var11_17.getDeliveryCost()) != null) {
                    var6_8 = var11_17.getValue();
                }
                var15_21.putString((String)var17_23, var6_8);
                var6_8 = var16_22.getNUMBER_OF_PRODUCTS();
                var3_3 = var3_3.S0;
                if (var3_3 != null && (var3_3 = var3_3.getEntries()) != null) {
                    var7_10 = var3_3.size();
                }
                var15_21.putInt(var6_8, var7_10);
                var3_3 = "contains_store";
                var6_8 = od3_2.a();
                var15_21.putString((String)var3_3, var6_8);
                var13_19 = var1_1.d;
                var20_27 = var1_1.e;
                var16_22 = var1_1.b;
                var11_17 = "bag screen";
                var12_18 = "bag screen";
                var16_22.newPushCustomScreenView((String)var11_17, (String)var12_18, var13_19, var15_21, var20_27);
lbl188:
                // 2 sources

                return Unit.a;
            }
            case 0: 
        }
        var3_4 /* !! */  = (jk_2)this.b;
        Intrinsics.checkNotNullParameter(var3_4 /* !! */ , "this$0");
        var6_9 = var3_4 /* !! */ .n;
        var7_11 = false;
        var8_13 = null;
        if (var6_9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            var5_7 = 0;
            var6_9 = null;
        }
        var6_9.stopLoader();
        var6_9 = cp_1.Companion;
        var5_7 = nn_2.b((cp$a)var6_9, (DataCallback)var1_1);
        if (var5_7 != 0) {
            var5_7 = var1_1.getStatus();
            if (var5_7 == 0 && (var6_9 = var1_1.getData()) != null) {
                var6_9 = var3_4 /* !! */ .p;
                if (var6_9 != null) {
                    var6_9.E5();
                }
                var3_4 /* !! */ .m = var6_9 = Boolean.TRUE;
                var6_9 = var3_4 /* !! */ .k;
                if (var6_9 != null) {
                    var9_15 = 8;
                    var6_9.setVisibility(var9_15);
                }
                if ((var6_9 = var3_4 /* !! */ .j) != null) {
                    var9_15 = 0;
                    var17_24 = null;
                    var6_9.setVisibility(0);
                }
                if ((var1_1 = (CancelReturnRequestResponse)var1_1.getData()) != null) {
                    var8_13 = var1_1.getContent();
                }
                if ((var1_1 = var3_4 /* !! */ .g) != null) {
                    var1_1.setText((CharSequence)var8_13);
                }
                if ((var1_1 = var3_4 /* !! */ .h) != null) {
                    var2_2 = R$string.cancel_return_success_btn_text;
                    var1_1.setText(var2_2);
                }
            } else {
                var6_9 = var3_4 /* !! */ .p;
                if (var6_9 != null) {
                    var6_9.da();
                }
                if ((var3_4 /* !! */  = var3_4 /* !! */ .getActivity()) != null && (var1_1 = (CancelReturnRequestResponse)var1_1.getData()) != null && (var1_1 = var1_1.getErrorResponse()) != null && (var1_1 = var1_1.getMessage()) != null) {
                    var5_7 = 1;
                    var1_1 = Toast.makeText((Context)var3_4 /* !! */ , (CharSequence)var1_1, (int)var5_7);
                    var1_1.show();
                }
            }
        }
        return Unit.a;
    }
}

