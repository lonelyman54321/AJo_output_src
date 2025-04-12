/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RatingBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.willy.ratingbar.ScaleRatingBar;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from Y52
 */
public final class y52_0
extends Uk2 {
    public final ArrayList c;
    public final g71_0 d;
    public final Z52$b e;
    public View f;
    public CardView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public ImageView n;
    public ImageView o;
    public TextView p;

    public y52_0(ArrayList arrayList, g71_0 g71_02, String string2, Z52$b z52$b) {
        Intrinsics.checkNotNullParameter(arrayList, "orderList");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(string2, "parentPosition");
        Intrinsics.checkNotNullParameter(z52$b, "heightUpdateCallback");
        this.c = arrayList;
        this.d = g71_02;
        this.e = z52$b;
    }

    public final void a(ViewGroup viewGroup, int n3, Object object) {
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Intrinsics.checkNotNullParameter(object, "view");
        object = (View)object;
        viewGroup.removeView((View)object);
    }

    public final int c() {
        int n3;
        ArrayList arrayList = this.c;
        int n4 = arrayList.size();
        int n7 = n4 > (n3 = 1) ? -1 >>> 1 : arrayList.size();
        return n7;
    }

    public final void d(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object f(int var1_1, ViewGroup var2_2) {
        block57: {
            block56: {
                block55: {
                    var3_3 = 2;
                    Intrinsics.checkNotNullParameter(var2_2 /* !! */ , "collection");
                    var4_4 = this.c;
                    var5_5 = var4_4.size();
                    var1_1 %= var5_5;
                    var6_6 = LayoutInflater.from((Context)var2_2 /* !! */ .getContext());
                    var7_7 = R$layout.row_return_order_card;
                    var6_6 = var6_6.inflate(var7_7, var2_2 /* !! */ , false);
                    var2_2 /* !! */ .addView((View)var6_6);
                    var8_8 = R$id.row_order_layout_click;
                    var2_2 /* !! */  = var6_6.findViewById(var8_8);
                    this.f = var2_2 /* !! */ ;
                    var8_8 = R$id.cv_container;
                    var2_2 /* !! */  = (CardView)var6_6.findViewById(var8_8);
                    this.g = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_lbl_refund_new;
                    var2_2 /* !! */  = (TextView)var6_6.findViewById(var8_8);
                    this.h = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_tv_refund_amount_new;
                    var2_2 /* !! */  = (TextView)var6_6.findViewById(var8_8);
                    this.i = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_tv_headerinfo;
                    var2_2 /* !! */  = (TextView)var6_6.findViewById(var8_8);
                    this.j = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_tv_info;
                    var2_2 /* !! */  = (TextView)var6_6.findViewById(var8_8);
                    this.k = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_tv_status;
                    var2_2 /* !! */  = (TextView)var6_6.findViewById(var8_8);
                    this.l = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_tv_exchange;
                    var2_2 /* !! */  = (TextView)var6_6.findViewById(var8_8);
                    this.m = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_imv_product;
                    var2_2 /* !! */  = (ImageView)var6_6.findViewById(var8_8);
                    this.n = var2_2 /* !! */ ;
                    var8_8 = R$id.row_order_product_imv_arrow;
                    var2_2 /* !! */  = (ImageView)var6_6.findViewById(var8_8);
                    this.o = var2_2 /* !! */ ;
                    var8_8 = R$id.rated_item_rating_bar;
                    var2_2 /* !! */  = (ScaleRatingBar)var6_6.findViewById(var8_8);
                    var8_8 = R$id.rate_this_product_rating_bar;
                    var2_2 /* !! */  = (RatingBar)var6_6.findViewById(var8_8);
                    var8_8 = R$id.your_rating_ll;
                    var2_2 /* !! */  = (LinearLayout)var6_6.findViewById(var8_8);
                    var8_8 = R$id.rate_this_product_ll;
                    var2_2 /* !! */  = (LinearLayout)var6_6.findViewById(var8_8);
                    var8_8 = R$id.row_order_imps_failed_info;
                    var2_2 /* !! */  = (TextView)var6_6.findViewById(var8_8);
                    this.p = var2_2 /* !! */ ;
                    var9_9 = var4_4.get(var1_1);
                    Intrinsics.checkNotNullExpressionValue(var9_9, "get(...)");
                    var9_9 = (OrderItemLine)var9_9;
                    var2_2 /* !! */  = var9_9.getImageUrl();
                    var8_8 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
                    var10_10 = 1;
                    var7_7 = 0;
                    var11_11 /* !! */  = null;
                    if (var8_8 == 0) {
                        var2_2 /* !! */  = new da$a();
                        var2_2 /* !! */ .k = var10_10;
                        var2_2 /* !! */ .r = var10_10;
                        var12_12 = R$string.product_image;
                        var13_13 = hv3_0.K(var12_12);
                        var2_2 /* !! */ .b(var13_13);
                        var13_13 = var9_9.getImageUrl();
                        var14_14 = this.n;
                        var15_15 = "productImv";
                        if (var14_14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                            var16_16 = 0;
                            var14_14 = null;
                        }
                        var2_2 /* !! */ .n = var13_13;
                        var2_2 /* !! */ .u = var14_14;
                        var2_2 /* !! */ .a();
                        var2_2 /* !! */  = this.n;
                        if (var2_2 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                            var8_8 = 0;
                            var2_2 /* !! */  = null;
                            var17_17 = 0.0f;
                        }
                        var12_12 = R$drawable.ic_placeholder_revamp;
                        var2_2 /* !! */ .setImageResource(var12_12);
                        var2_2 /* !! */  = this.n;
                        if (var2_2 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                            var8_8 = 0;
                            var2_2 /* !! */  = null;
                            var17_17 = 0.0f;
                        }
                        var12_12 = R$string.product_image;
                        var13_13 = hv3_0.K(var12_12);
                        var2_2 /* !! */ .setContentDescription((CharSequence)var13_13);
                    }
                    var2_2 /* !! */  = no_2.d((OrderItemLine)var9_9);
                    var8_8 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
                    var13_13 = "RETURN CANCELLED";
                    var14_14 = "toUpperCase(...)";
                    var18_18 = 8;
                    var19_19 = "cancelledTv";
                    if (var8_8 != 0) break block55;
                    var2_2 /* !! */  = no_2.d((OrderItemLine)var9_9).toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , (String)var14_14);
                    var8_8 = (int)Intrinsics.areEqual(var2_2 /* !! */ , var13_13);
                    if (var8_8 == 0) break block55;
                    var2_2 /* !! */  = this.m;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    var2_2 /* !! */ .setVisibility(0);
                    var2_2 /* !! */  = this.m;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    var20_20 = R$string.cancelled;
                    var19_19 = hv3_0.K(var20_20);
                    var2_2 /* !! */ .setText((CharSequence)var19_19);
                    break block56;
                }
                if ((var8_8 = (int)TextUtils.isEmpty((CharSequence)(var2_2 /* !! */  = var9_9.getOrderId()))) != 0) ** GOTO lbl-1000
                var2_2 /* !! */  = var9_9.getOrderId();
                Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , "getOrderId(...)");
                var21_21 = "EX";
                var8_8 = (int)kotlin.text.b.s((String)var2_2 /* !! */ , (String)var21_21, false);
                if (var8_8 != 0) {
                    var2_2 /* !! */  = this.m;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    ai0_2.B((View)var2_2 /* !! */ );
                    var2_2 /* !! */  = this.m;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    var20_20 = R$string.exchange;
                    var19_19 = hv3_0.K(var20_20);
                    var2_2 /* !! */ .setText((CharSequence)var19_19);
                } else lbl-1000:
                // 2 sources

                {
                    if ((var2_2 /* !! */  = this.m) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    var2_2 /* !! */ .setVisibility(var18_18);
                }
            }
            var2_2 /* !! */  = no_2.d((OrderItemLine)var9_9);
            var8_8 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
            var19_19 = "arrowImv";
            var21_21 = "productStatusTv";
            if (var8_8 != 0) {
                var2_2 /* !! */  = this.l;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                ai0_2.i((View)var2_2 /* !! */ );
                var2_2 /* !! */  = this.o;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                ai0_2.i((View)var2_2 /* !! */ );
            } else {
                var2_2 /* !! */  = no_2.a((OrderItemLine)var9_9);
                var8_8 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
                if (var8_8 == 0) {
                    var2_2 /* !! */  = this.l;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    var2_2 /* !! */ .setVisibility(0);
                    var2_2 /* !! */  = hv3_0.u(no_2.a((OrderItemLine)var9_9));
                    var19_19 = this.l;
                    if (var19_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                        var20_20 = 0;
                        var19_19 = null;
                        var22_22 = 0.0f;
                    }
                    var19_19.setText((CharSequence)var2_2 /* !! */ );
                } else {
                    var2_2 /* !! */  = this.l;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    ai0_2.i((View)var2_2 /* !! */ );
                    var2_2 /* !! */  = this.o;
                    if (var2_2 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var8_8 = 0;
                        var2_2 /* !! */  = null;
                        var17_17 = 0.0f;
                    }
                    ai0_2.i((View)var2_2 /* !! */ );
                }
            }
            no_2.g((OrderItemLine)var9_9);
            var2_2 /* !! */  = no_2.g((OrderItemLine)var9_9);
            var20_20 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
            var21_21 = "refundLbl";
            var23_23 = "refundAmountTv";
            var24_24 = "headerInfoTv";
            if (var20_20 != 0) {
                var2_2 /* !! */  = this.j;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(var18_18);
                var2_2 /* !! */  = this.i;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var23_23);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(var18_18);
                var2_2 /* !! */  = this.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(var18_18);
            } else {
                var19_19 = this.j;
                if (var19_19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                    var20_20 = 0;
                    var19_19 = null;
                    var22_22 = 0.0f;
                }
                var19_19.setVisibility(0);
                var19_19 = this.j;
                if (var19_19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                    var20_20 = 0;
                    var19_19 = null;
                    var22_22 = 0.0f;
                }
                var19_19.setText((CharSequence)var2_2 /* !! */ );
            }
            var2_2 /* !! */  = no_2.e((OrderItemLine)var9_9);
            var8_8 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
            var19_19 = "productInfoTv";
            if (var8_8 == 0) {
                var2_2 /* !! */  = this.k;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(0);
                var2_2 /* !! */  = this.k;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var15_15 = no_2.e((OrderItemLine)var9_9);
                var2_2 /* !! */ .setText((CharSequence)var15_15);
                var2_2 /* !! */  = hv3_0.u(no_2.a((OrderItemLine)var9_9));
                var8_8 = (int)kotlin.text.b.i((String)var2_2 /* !! */ , var13_13, (boolean)var10_10);
                var13_13 = "getTypefaceWithFont(...)";
                if (var8_8 != 0 && (var8_8 = (int)no_2.i((OrderItemLine)var9_9)) != 0) {
                    var2_2 /* !! */  = FontsManager.getInstance();
                    AJIOApplication.Companion.getClass();
                    var15_15 = AJIOApplication$a.a();
                    var25_25 = 10;
                    var2_2 /* !! */  = var2_2 /* !! */ .getTypefaceWithFont((Context)var15_15, var25_25);
                    Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , var13_13);
                    var13_13 = this.k;
                    if (var13_13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var12_12 = 0;
                        var13_13 = null;
                    }
                    var18_18 = hv3_0.m(R$color.accent_color_1);
                    ai0_2.w((TextView)var13_13, (Typeface)var2_2 /* !! */ , var18_18, var3_3);
                } else {
                    var2_2 /* !! */  = FontsManager.getInstance();
                    AJIOApplication.Companion.getClass();
                    var15_15 = AJIOApplication$a.a();
                    var25_26 = 9;
                    var2_2 /* !! */  = var2_2 /* !! */ .getTypefaceWithFont((Context)var15_15, var25_26);
                    Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , var13_13);
                    var13_13 = this.k;
                    if (var13_13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                        var12_12 = 0;
                        var13_13 = null;
                    }
                    var18_18 = 6;
                    ai0_2.w((TextView)var13_13, (Typeface)var2_2 /* !! */ , 0, var18_18);
                }
            } else {
                var2_2 /* !! */  = this.k;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(var18_18);
            }
            var2_2 /* !! */  = no_2.d((OrderItemLine)var9_9);
            var8_8 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
            var13_13 = "format(...)";
            var15_15 = "%s%s";
            if (var8_8 != 0) break block57;
            var2_2 /* !! */  = no_2.d((OrderItemLine)var9_9).toUpperCase();
            Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , (String)var14_14);
            var19_19 = "REFUND INITIATED";
            var8_8 = (int)Intrinsics.areEqual(var2_2 /* !! */ , var19_19);
            if (var8_8 != 0) ** GOTO lbl-1000
        }
        if ((var8_8 = (int)TextUtils.isEmpty((CharSequence)(var2_2 /* !! */  = no_2.d((OrderItemLine)var9_9)))) == 0) {
            var2_2 /* !! */  = no_2.d((OrderItemLine)var9_9).toUpperCase();
            Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , (String)var14_14);
            var14_14 = "REFUNDED";
            var8_8 = (int)Intrinsics.areEqual(var2_2 /* !! */ , var14_14);
            ** if (var8_8 == 0) goto lbl-1000
        }
        ** GOTO lbl-1000
lbl-1000:
        // 2 sources

        {
            var17_17 = var9_9.getRefundTotal();
            var16_16 = 0;
            var14_14 = null;
            cfr_temp_0 = var17_17 - 0.0f;
            var8_8 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var8_8 > 0) {
                var2_2 /* !! */  = this.i;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var23_23);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(0);
                var2_2 /* !! */  = this.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(0);
                var2_2 /* !! */  = this.i;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var23_23);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var14_14 = StringCompanionObject.INSTANCE;
                var16_16 = R$string.rs_symbol;
                var14_14 = hv3_0.K(var16_16);
                var22_22 = var9_9.getRefundTotal();
                var19_19 = qz2_0.p(var22_22);
                var21_21 = new Object[var3_3];
                var21_21[0] = var14_14;
                var21_21[var10_10] = var19_19;
                zn0_1.b(var21_21, var3_3, (String)var15_15, var13_13, (TextView)var2_2 /* !! */ );
            } else {
                this.n();
            }
            ** GOTO lbl398
        }
lbl-1000:
        // 2 sources

        {
            if ((var8_8 = (int)(var17_17 = var9_9.getEstimatedRefundAmount())) > 0) {
                var2_2 /* !! */  = this.i;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var23_23);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(0);
                var2_2 /* !! */  = this.h;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var2_2 /* !! */ .setVisibility(0);
                var2_2 /* !! */  = this.i;
                if (var2_2 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var23_23);
                    var8_8 = 0;
                    var2_2 /* !! */  = null;
                    var17_17 = 0.0f;
                }
                var14_14 = StringCompanionObject.INSTANCE;
                var16_16 = R$string.rs_symbol;
                var14_14 = hv3_0.K(var16_16);
                var22_22 = var9_9.getEstimatedRefundAmount();
                var19_19 = qz2_0.p(var22_22);
                var21_21 = new Object[var3_3];
                var21_21[0] = var14_14;
                var21_21[var10_10] = var19_19;
                zn0_1.b(var21_21, var3_3, (String)var15_15, var13_13, (TextView)var2_2 /* !! */ );
            } else {
                this.n();
            }
        }
lbl398:
        // 4 sources

        var2_2 /* !! */  = var9_9.getImpsFailureRefundText();
        var8_8 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
        if (var8_8 == 0) {
            var2_2 /* !! */  = this.p;
            var26_27 = "impsRefundFailedInfoText";
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var26_27);
                var8_8 = 0;
                var2_2 /* !! */  = null;
                var17_17 = 0.0f;
            }
            ai0_2.B((View)var2_2 /* !! */ );
            var2_2 /* !! */  = this.p;
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var26_27);
                var8_8 = 0;
                var2_2 /* !! */  = null;
                var17_17 = 0.0f;
            }
            var26_27 = var9_9.getImpsFailureRefundText();
            var2_2 /* !! */ .setText((CharSequence)var26_27);
        }
        if ((var2_2 /* !! */  = this.g) == null) {
            var2_2 /* !! */  = "cvContainer";
            Intrinsics.throwUninitializedPropertyAccessException((String)var2_2 /* !! */ );
        } else {
            var11_11 /* !! */  = var2_2 /* !! */ ;
        }
        var2_2 /* !! */  = new ht_0(this, (Serializable)var9_9, var10_10);
        var11_11 /* !! */ .setOnClickListener((View.OnClickListener)var2_2 /* !! */ );
        Intrinsics.checkNotNull(var6_6);
        return var6_6;
    }

    public final boolean g(View view, Object object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "object";
        Intrinsics.checkNotNullParameter(object, string2);
        if (view == object) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void n() {
        Object object = this.i;
        TextView textView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refundAmountTv");
            object = null;
        }
        int n3 = 8;
        object.setVisibility(n3);
        object = this.h;
        if (object == null) {
            object = "refundLbl";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            textView = object;
        }
        textView.setVisibility(n3);
    }
}

