/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.ItemRatingsViewReturnOrderBinding;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.Rating;
import com.willy.ratingbar.BaseRatingBar$a;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.b;

/*
 * Renamed from aI2
 */
public final class ai2_1
extends RecyclerView$f {
    public final List a;
    public final CartOrder b;
    public final hE2 c;
    public final wx0_0 d;
    public final OT2 e;

    public ai2_1(ArrayList arrayList, CartOrder cartOrder, hE2 hE22, wx0_0 wx0_02, OT2 oT2) {
        Intrinsics.checkNotNullParameter(hE22, "ratingsClickListener");
        Intrinsics.checkNotNullParameter(wx0_02, "editFeedbackClickListener");
        Intrinsics.checkNotNullParameter(oT2, "scrollListener");
        this.a = arrayList;
        this.b = cartOrder;
        this.c = hE22;
        this.d = wx0_02;
        this.e = oT2;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block37: {
            var1_1 = (aI2$a)var1_1;
            Intrinsics.checkNotNullParameter(var1_1, "holder");
            var3_3 = null;
            var4_4 = this.a;
            if (var4_4 != null) {
                var5_5 = (OrderDetailLineItem)var4_4.get(var2_2);
                var6_6 = var5_5;
            } else {
                var6_6 = null;
            }
            var5_5 = this.b;
            if (var5_5 != null) {
                var5_5 = var5_5.ratings;
            } else {
                var2_2 = 0;
                var5_5 = null;
                var7_7 = 0.0f;
            }
            var1_1.getClass();
            if (var6_6 == null) break block37;
            var4_4 = UH2.a((OrderDetailLineItem)var6_6);
            var8_8 = var4_4.a;
            var9_9 = true;
            var10_10 = var1_1.a;
            if (var8_8 != null && (var11_11 = kotlin.text.b.k((CharSequence)var8_8)) == 0) {
                var8_8 = new da$a();
                var8_8.k = var9_9;
                var8_8.a = var12_12 = R$drawable.component_placeholder;
                var8_8.b = var12_12;
                var8_8.c = var12_12;
                var8_8.s = var9_9;
                var12_12 = R$string.acc_icon_product_placeholder;
                var13_13 = hv3_0.K(var12_12);
                var8_8.b((String)var13_13);
                var13_13 = var4_4.a;
                var14_14 /* !! */  = var10_10.productIV;
                var8_8.n = var13_13;
                var8_8.u = var14_14 /* !! */ ;
                var8_8.i = var9_9;
                var8_8.a();
            } else {
                var8_8 = var10_10.productIV;
                var12_12 = R$drawable.item_dummy_noimg;
                var8_8.setImageResource(var12_12);
            }
            var8_8 = var6_6.getAmount();
            var15_15 = 0.0f;
            var16_16 = 0;
            if (var8_8 == null || (var11_11 = var8_8.length()) == 0) ** GOTO lbl-1000
            var8_8 = var6_6.getAmount();
            if (var8_8 != null) {
                var17_17 = Float.parseFloat((String)var8_8);
            } else {
                var11_11 = 0;
                var17_17 = 0.0f;
                var8_8 = null;
            }
            var11_11 = (int)((cfr_temp_0 = var17_17 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var11_11 > 0) {
                var8_8 = var10_10.priceTV;
                var13_13 = var4_4.b;
                var8_8.setText((CharSequence)var13_13);
                var8_8 = var10_10.priceTV;
                var8_8.setVisibility(0);
            } else lbl-1000:
            // 2 sources

            {
                var8_8 = var10_10.priceTV;
                var12_12 = 4;
                var8_8.setVisibility(var12_12);
            }
            var8_8 = var10_10.infoTV;
            var13_13 = var4_4.d;
            var8_8.setText((CharSequence)var13_13);
            var8_8 = var10_10.sizeTV;
            var13_13 = var4_4.f;
            var8_8.setText((CharSequence)var13_13);
            var8_8 = var10_10.brandTV;
            var4_4 = var4_4.c;
            var8_8.setText((CharSequence)var4_4);
            var4_4 = var6_6.getEntry();
            if (var4_4 != null && (var4_4 = var4_4.getProduct()) != null) {
                var4_4 = var4_4.getCode();
            } else {
                var18_18 = 0;
                var4_4 = null;
                var19_19 = 0.0f;
            }
            var8_8 = h40_0.a;
            var11_11 = (int)h40_0.Z1();
            if (var11_11 != 0) {
                if (var5_5 != null) {
                    block34: {
                        var8_8 = var5_5.iterator();
                        while ((var12_12 = (int)var8_8.hasNext()) != 0) {
                            var13_13 = var8_8.next();
                            var14_14 /* !! */  = var13_13;
                            var14_14 /* !! */  = ((Rating)var13_13).skuId;
                            var20_20 = Intrinsics.areEqual(var14_14 /* !! */ , var4_4);
                            if (!var20_20) continue;
                            break block34;
                        }
                        var12_12 = 0;
                        var13_13 = null;
                    }
                    var13_13 = (Rating)var13_13;
                } else {
                    var12_12 = 0;
                    var13_13 = null;
                }
                if (var13_13 != null) {
                    var17_17 = var13_13.rating;
                    var8_8 = Float.valueOf(var17_17);
                } else {
                    var11_11 = 0;
                    var8_8 = null;
                    var17_17 = 0.0f;
                }
                if (var8_8 != null) {
                    if (var5_5 != null) {
                        block35: {
                            var8_8 = var5_5.iterator();
                            while ((var12_12 = (int)var8_8.hasNext()) != 0) {
                                var13_13 = var8_8.next();
                                var14_14 /* !! */  = var13_13;
                                var14_14 /* !! */  = ((Rating)var13_13).skuId;
                                var20_20 = Intrinsics.areEqual(var14_14 /* !! */ , var4_4);
                                if (!var20_20) continue;
                                break block35;
                            }
                            var12_12 = 0;
                            var13_13 = null;
                        }
                        var13_13 = (Rating)var13_13;
                        var21_21 = var13_13;
                    } else {
                        var21_21 = null;
                    }
                    if (var5_5 != null) {
                        block36: {
                            var5_5 = var5_5.iterator();
                            while ((var11_11 = (int)var5_5.hasNext()) != 0) {
                                var13_13 = var8_8 = var5_5.next();
                                var13_13 = ((Rating)var8_8).skuId;
                                var12_12 = (int)Intrinsics.areEqual(var13_13, var4_4);
                                if (var12_12 == 0) continue;
                                break block36;
                            }
                            var11_11 = 0;
                            var8_8 = null;
                            var17_17 = 0.0f;
                        }
                        var8_8 = (Rating)var8_8;
                    } else {
                        var11_11 = 0;
                        var8_8 = null;
                        var17_17 = 0.0f;
                    }
                    if (var8_8 != null) {
                        var7_7 = var8_8.rating;
                    } else {
                        var2_2 = 0;
                        var7_7 = 0.0f;
                        var5_5 = null;
                    }
                    var4_4 = "rateThisProductRatingBar";
                    var8_8 = "returnViewRatingsTitle";
                    var12_12 = 8;
                    cfr_temp_1 = var7_7 - 0.0f;
                    var2_2 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                    if (var2_2 == 0) {
                        var10_10.odEditFeedback.setVisibility(var12_12);
                        var10_10.odOrderDown.setVisibility(var12_12);
                        var10_10.odItemRatingCl.setVisibility(var12_12);
                        var10_10.odRatingCl.setVisibility(var12_12);
                        var5_5 = var10_10.returnViewRatingsTitle;
                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var8_8);
                        var5_5.setVisibility(0);
                        var5_5 = var10_10.rateThisProductRatingBar;
                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var4_4);
                        var5_5.setVisibility(0);
                        var5_5 = var10_10.rateThisProductRatingBar;
                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var4_4);
                        ai0_2.b((ScaleRatingBar)var5_5);
                        var5_5 = var10_10.rateThisProductRatingBar;
                        var8_8 = var1_1.g;
                        var4_4 = new YH2((aI2$a)var1_1, (OrderDetailLineItem)var6_6, (Rating)var21_21, (ai2_1)var8_8);
                        var5_5.setOnRatingChangeListener((BaseRatingBar$a)var4_4);
                    } else {
                        var5_5 = var10_10.returnViewRatingsTitle;
                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var8_8);
                        var5_5.setVisibility(var12_12);
                        var5_5 = var10_10.rateThisProductRatingBar;
                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var4_4);
                        var5_5.setVisibility(var12_12);
                        var22_22 = var1_1.g;
                        var5_5 = new WH2((aI2$a)var1_1, (OrderDetailLineItem)var6_6, (Rating)var21_21, var22_22);
                        var1_1.c.setOnClickListener((View.OnClickListener)var5_5);
                        var10_10.odOrderDown.setVisibility(0);
                        var10_10.odItemRatingCl.setVisibility(0);
                        var10_10.odRatingCl.setVisibility(0);
                        var8_8 = new Ref$BooleanRef();
                        var5_5 = var10_10.odOrderDown;
                        var4_4 = var23_23;
                        var13_13 = var1_1;
                        var14_14 /* !! */  = var21_21;
                        var23_23 = new XH2((Ref$BooleanRef)var8_8, var10_10, (aI2$a)var1_1, (Rating)var21_21, (OrderDetailLineItem)var6_6, var22_22);
                        var5_5.setOnClickListener((View.OnClickListener)var23_23);
                        if (var21_21 != null) {
                            var15_15 = var21_21.rating;
                        }
                        var5_5 = var1_1.b;
                        var5_5.setRating(var15_15);
                        if (var21_21 != null) {
                            var19_19 = var21_21.rating;
                            var16_16 = (int)var19_19;
                        }
                        var18_18 = -1;
                        var19_19 = 0.0f / 0.0f;
                        var4_4 = var18_18;
                        ai0_2.c((ScaleRatingBar)var5_5, var16_16, (Integer)var4_4);
                        if (var21_21 != null && (var5_5 = var21_21.review) != null) {
                            var19_19 = var21_21.rating;
                            var4_4 = Float.valueOf(var19_19);
                            var5_5.setRating((Float)var4_4);
                        }
                        if (var21_21 != null) {
                            var3_3 = var21_21.review;
                        }
                        if ((var2_2 = (int)h40_0.l2()) != 0 && var3_3 != null) {
                            var5_5 = new zh2_1(var3_3);
                            var11_11 = 728437353;
                            var17_17 = 8.351432E-13f;
                            var4_4 = new u10(var11_11, var5_5, var9_9);
                            var1_1 = var1_1.f;
                            var1_1.setContent((Function2)var4_4);
                        }
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        object = ItemRatingsViewReturnOrderBinding.inflate(LayoutInflater.from((Context)object.getContext()), object, false);
        Intrinsics.checkNotNullExpressionValue(object, "inflate(...)");
        aI2$a aI2$a = new aI2$a(this, (ItemRatingsViewReturnOrderBinding)object);
        return aI2$a;
    }
}

