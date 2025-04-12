/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.cart.ConvenienceFeeConfig;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import com.ril.ajio.services.data.Payment.InternalWalletAmount;
import com.ril.ajio.services.data.Price;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class iP
extends RecyclerView$B
implements View.OnClickListener {
    public final j82_0 a;
    public final ConstraintLayout b;
    public final View c;
    public final View d;
    public final View e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final ConstraintLayout l;
    public final TextView m;
    public final TextView n;
    public final LinearLayout o;
    public final LinearLayout p;

    public iP(View object, j82_0 object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "mOnCartClickListener");
        super((View)object);
        this.a = object2;
        object = this.itemView;
        int n3 = R$id.row_cart_layout_summary;
        object = (ConstraintLayout)object.findViewById(n3);
        this.b = object;
        object = this.itemView;
        n3 = R$id.row_cart_summary_layout_bag_saving;
        object = object.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.c = object;
        object = this.itemView;
        int n4 = R$id.row_cart_summary_layout_gst;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.d = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_layout_promo_saving;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.e = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_tv_bag_total;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.f = object;
        object = this.itemView;
        n4 = R$id.bagTotalTv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.g = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_tv_bag_saving;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.h = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_tv_promo_saving;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.i = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_tv_coupon_saving;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.j = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_tv_gst;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.k = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_layout_delivery;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ConstraintLayout)((Object)object);
        this.l = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_tv_delivery;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.m = object;
        object = this.itemView;
        n4 = R$id.row_cart_summary_tv_total;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.n = object;
        object = this.itemView;
        n4 = R$id.backgroundIv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ImageView)object;
        object = this.itemView;
        n4 = R$id.checkout_layout_credit;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.o = object;
        object = this.itemView;
        n4 = R$id.convenience_fee_cart_summary_view;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.p = object;
        object = this.itemView;
        n4 = R$id.orderSummaryTv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
    }

    public final void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.row_cart_summary_tv_coupon_saving;
        if (n3 == n4) {
            object = this.a;
            object.t1();
        }
    }

    public final void w(Cart cart, dn_1 dn_12, ArrayList arrayList) {
        Object object;
        Object object2;
        Object object3;
        int n3;
        Object object4;
        float f5;
        Object object5;
        Object object6;
        Object object7;
        float f6;
        int n4;
        float f7;
        float f8;
        int n7;
        Object object8;
        int n8;
        float f11;
        iP iP2 = this;
        Object object9 = dn_12;
        int n10 = 1;
        float f12 = Float.MIN_VALUE;
        String string2 = "cartInfoProvider";
        Intrinsics.checkNotNullParameter(dn_12, string2);
        LinearLayout linearLayout = null;
        if (cart != null) {
            f11 = cart.getBagTotal();
        } else {
            n8 = 0;
            f11 = 0.0f;
            object8 = null;
        }
        Object object10 = iP2.f;
        float f14 = f11 - 0.0f;
        n8 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (n8 > 0) {
            if (cart != null) {
                f11 = cart.getBagTotal();
            } else {
                n8 = 0;
                f11 = 0.0f;
                object8 = null;
            }
            object8 = qz2_0.u(f11);
            object10.setText((CharSequence)object8);
        } else {
            object8 = qz2_0.z();
            object10.setText((CharSequence)object8);
        }
        if (arrayList != null && (n8 = (int)(arrayList.isEmpty() ? 1 : 0)) == 0 && (n8 = (int)(((h40_0)(object8 = h40_0.a)).f1() ? 1 : 0)) != 0) {
            n8 = R$string.bag_total_including_freebies;
            object8 = hv3_0.K(n8);
            object10 = iP2.g;
            object10.setText((CharSequence)object8);
        }
        if (cart != null) {
            f11 = cart.getTotalBagSaving();
        } else {
            n8 = 0;
            f11 = 0.0f;
            object8 = null;
        }
        object10 = iP2.c;
        Object object11 = iP2.h;
        int n14 = 8;
        float f15 = 1.1E-44f;
        Object object12 = null;
        float f16 = f11 - 0.0f;
        n8 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
        if (n8 > 0) {
            if (cart != null) {
                f11 = cart.getTotalBagSaving();
            } else {
                n8 = 0;
                f11 = 0.0f;
                object8 = null;
            }
            object8 = qz2_0.q(f11);
            object11.setText((CharSequence)object8);
            object10.setVisibility(0);
        } else {
            object8 = qz2_0.z();
            object11.setText((CharSequence)object8);
            object10.setVisibility(n14);
        }
        n8 = 0;
        f11 = 0.0f;
        object8 = null;
        if (cart != null) {
            object10 = cart.getEntries();
        } else {
            n7 = 0;
            object10 = null;
            f8 = 0.0f;
        }
        if (object10 != null && (n7 = object10.isEmpty()) == 0) {
            if (cart != null) {
                object10 = cart.getEntries();
            } else {
                n7 = 0;
                object10 = null;
                f8 = 0.0f;
            }
            Intrinsics.checkNotNull(object10);
            n7 = object10.size();
            f7 = 0.0f;
            object11 = null;
            n4 = 0;
            f6 = 0.0f;
            object7 = null;
            for (object6 = (Object)false; object6 < n7; object6 += n10) {
                object5 = cart.getEntries().get((int)object6);
                if (object5 == null) continue;
                object5 = ((CartEntry)cart.getEntries().get((int)object6)).getMultiItemPromoAmt();
                f5 = mz3_0.J(object5);
                f6 += f5;
            }
        } else {
            n4 = 0;
            f6 = 0.0f;
            object7 = null;
        }
        object10 = iP2.e;
        float f17 = f6 - 0.0f;
        object6 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        if (object6 > 0) {
            object10.setVisibility(0);
            object10 = iP2.i;
            object11 = qz2_0.q(f6);
            object10.setText((CharSequence)object11);
        } else {
            object10.setVisibility(n14);
        }
        if (cart != null) {
            object10 = cart.getVoucherAmount();
        } else {
            n7 = 0;
            object10 = null;
            f8 = 0.0f;
        }
        if (object10 != null) {
            object10 = cart.getVoucherAmount().getValue();
            f8 = mz3_0.J((String)object10) + 0.0f;
        } else {
            n7 = 0;
            f8 = 0.0f;
            object10 = null;
        }
        object11 = iP2.j;
        n4 = 10;
        f6 = 1.4E-44f;
        float f18 = f8 - 0.0f;
        float f19 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (f19 > 0) {
            object11.setClickable(false);
            n10 = og1_1.b();
            if (n10 != 0) {
                n10 = object11.getPaintFlags() & 0xFFFFFFF7;
                object11.setPaintFlags(n10);
            } else {
                object4 = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                object5 = AJIOApplication$a.a();
                n3 = 9;
                object4 = ((FontsManager)object4).getTypefaceWithFont((Context)object5, n3);
                object11.setTypeface((Typeface)object4);
                n10 = hv3_0.m(R$color.accent_color_2);
                object11.setTextColor(n10);
            }
            object4 = qz2_0.q(f8);
            object11.setText((CharSequence)object4);
            object4 = qz2_0.q(f8);
            object11.setContentDescription((CharSequence)object4);
        } else {
            n7 = (int)(og1_1.b() ? 1 : 0);
            if (n7 != 0) {
                n7 = object11.getPaintFlags() | n14;
                object11.setPaintFlags(n7);
            } else {
                object10 = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                object5 = AJIOApplication$a.a();
                object10 = object10.getTypefaceWithFont((Context)object5, n4);
                object11.setTypeface((Typeface)object10);
                n7 = hv3_0.m(R$color.accent_color_4);
                object11.setTextColor(n7);
            }
            object11.setOnClickListener((View.OnClickListener)iP2);
            object11.setClickable(n10 != 0);
            object4 = hv3_0.K(R$string.apply_coupon);
            object11.setText((CharSequence)object4);
            n10 = R$string.apply_coupon_order_cart;
            object4 = hv3_0.K(n10);
            object11.setContentDescription((CharSequence)object4);
        }
        if (cart != null) {
            object4 = cart.getExclusiveGST();
        } else {
            n10 = 0;
            object4 = null;
            f12 = 0.0f;
        }
        if (object4 != null) {
            object4 = cart.getExclusiveGST().getValue();
            f12 = mz3_0.J((String)object4);
        } else {
            n10 = 0;
            f12 = 0.0f;
            object4 = null;
        }
        object10 = iP2.d;
        object11 = iP2.k;
        float f20 = f12 - 0.0f;
        f19 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        if (f19 > 0) {
            object4 = qz2_0.u(f12);
            object11.setText((CharSequence)object4);
            object10.setVisibility(0);
        } else {
            object4 = qz2_0.z();
            object11.setText((CharSequence)object4);
            object10.setVisibility(n14);
        }
        if (cart != null) {
            object4 = cart.getDeliveryCost();
        } else {
            n10 = 0;
            object4 = null;
            f12 = 0.0f;
        }
        if (object4 != null) {
            object4 = cart.getDeliveryCost().getValue();
            f12 = mz3_0.J((String)object4);
        } else {
            n10 = 0;
            f12 = 0.0f;
            object4 = null;
        }
        object10 = iP2.m;
        float f22 = f12 - 0.0f;
        object6 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
        if (object6 > 0) {
            object4 = qz2_0.u(f12);
            object10.setText((CharSequence)object4);
        } else {
            n10 = R$string.free;
            object4 = hv3_0.K(n10);
            object10.setText((CharSequence)object4);
        }
        f12 = dn_12.D();
        object4 = qz2_0.u(f12);
        object10 = iP2.n;
        object10.setText((CharSequence)object4);
        object4 = cp_1.Companion;
        object4.getClass();
        n10 = (int)(cp$a.i() ? 1 : 0);
        if (n10 != 0 && cart != null && (n10 = (int)(cart.isOtpValidationRequired() ? 1 : 0)) == 0) {
            Intrinsics.checkNotNullParameter(object9, string2);
            object4 = iP2.o;
            object4.setVisibility(n14);
            object4.removeAllViews();
            object10 = dn_12.g4();
            if (object10 != null) {
                object10 = object10.iterator();
                while ((object6 = (Object)object10.hasNext()) != false) {
                    object11 = (InternalWalletAmount)object10.next();
                    f15 = ((InternalWalletAmount)object11).getAmount();
                    float f23 = f15 - 0.0f;
                    n14 = (int)(f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1));
                    if (n14 <= 0) continue;
                    object4.setVisibility(0);
                    AJIOApplication.Companion.getClass();
                    object3 = LayoutInflater.from((Context)AJIOApplication$a.a());
                    f19 = R$layout.row_order_summary_internal_wallet;
                    object3 = object3.inflate((int)f19, null);
                    f19 = R$id.credit_text;
                    object5 = object3.findViewById((int)f19);
                    n3 = R$id.checkout_tv_credit;
                    object2 = object3.findViewById(n3);
                    object5 = (TextView)object5;
                    object = ((InternalWalletAmount)object11).getName();
                    object5.setText((CharSequence)object);
                    object2 = (TextView)object2;
                    f7 = ((InternalWalletAmount)object11).getAmount();
                    object11 = qz2_0.q(f7);
                    object2.setText((CharSequence)object11);
                    object6 = hv3_0.m(R$color.accent_color_2);
                    object2.setTextColor((int)object6);
                    object4.addView((View)object3);
                    object11 = object3.getLayoutParams();
                    object5 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
                    Intrinsics.checkNotNull(object11, object5);
                    object11 = (LinearLayout.LayoutParams)object11;
                    f19 = mz3_0.d(n4);
                    ((LinearLayout.LayoutParams)object11).topMargin = (int)f19;
                    object3.setLayoutParams((ViewGroup.LayoutParams)object11);
                }
            }
        }
        object4 = dn_12.A();
        n10 = (int)(((m80_0)object4).e() ? 1 : 0);
        linearLayout = iP2.p;
        if (n10 != 0) {
            Intrinsics.checkNotNullParameter(object9, string2);
            if (cart != null) {
                object4 = cart.getConvenienceFee();
            } else {
                n10 = 0;
                object4 = null;
                f12 = 0.0f;
            }
            if (object4 != null && ((object4 = cart.getConvenienceFee().getDelivery()) != null || (object4 = cart.getConvenienceFee().getCOD()) != null || (object4 = cart.getConvenienceFee().getRVP()) != null)) {
                ai0_2.B((View)linearLayout);
                object4 = cart.getConvenienceFee();
                if (object4 != null) {
                    boolean bl2;
                    int n15;
                    int n16;
                    object9 = dn_12.A();
                    boolean bl3 = og1_1.c();
                    if (bl3) {
                        AJIOApplication.Companion.getClass();
                        string2 = LayoutInflater.from((Context)AJIOApplication$a.a());
                        n7 = R$layout.row_order_summary_convenience_fee_luxe;
                        string2 = string2.inflate(n7, null);
                    } else {
                        AJIOApplication.Companion.getClass();
                        string2 = LayoutInflater.from((Context)AJIOApplication$a.a());
                        n7 = R$layout.row_order_summary_convenience_fee_ajio;
                        string2 = string2.inflate(n7, null);
                    }
                    n7 = R$id.convenience_fee_title_tv;
                    object10 = (AjioTextView)string2.findViewById(n7);
                    object11 = ((m80_0)object9).b;
                    if (object11 != null) {
                        object11 = ((ConvenienceFeeConfig)object11).getConvenienceFeeTitle();
                    } else {
                        object6 = false;
                        object11 = null;
                        f7 = 0.0f;
                    }
                    object10.setText((CharSequence)object11);
                    n7 = R$id.convenience_fee_info_tv;
                    object10 = (AjioTextView)string2.findViewById(n7);
                    object6 = og1_1.c();
                    if (object6 != false) {
                        object11 = hv3_0.a;
                        Intrinsics.checkNotNull(object10);
                        object3 = ((m80_0)object9).a();
                        object11.getClass();
                        hv3_0.a0((AjioTextView)object10, (String)object3);
                    } else {
                        object11 = ((m80_0)object9).a();
                        object10.setText((CharSequence)object11);
                    }
                    object11 = new hP(iP2, (ConvenienceFee)object4);
                    object10.setOnClickListener((View.OnClickListener)object11);
                    object10 = ((ConvenienceFee)object4).getDelivery();
                    if (object10 != null) {
                        object6 = R$id.delivery_fee_layout;
                        object12 = string2.findViewById((int)object6);
                        Intrinsics.checkNotNull(object12);
                        ai0_2.B(object12);
                        object3 = hv3_0.a;
                        object11 = ((m80_0)object9).b;
                        if (object11 != null) {
                            object7 = object11 = ((ConvenienceFeeConfig)object11).getDeliveryFeeLabel();
                        } else {
                            n4 = 0;
                            object7 = null;
                            f6 = 0.0f;
                        }
                        object11 = object10.getNetAmount();
                        if (object11 != null) {
                            object11 = ((Price)object11).getValue();
                        } else {
                            object6 = false;
                            object11 = null;
                            f7 = 0.0f;
                        }
                        object5 = mz3_0.K((String)object11);
                        object10 = object10.getAmount();
                        if (object10 != null) {
                            object10 = object10.getValue();
                        } else {
                            n7 = 0;
                            object10 = null;
                            f8 = 0.0f;
                        }
                        object2 = mz3_0.K((String)object10);
                        object = null;
                        n16 = 112;
                        n15 = 0;
                        hv3_0.n0((hv3_0)object3, object12, (String)object7, object5, (Float)object2, null, null, null, n16);
                        object10 = iP2.l;
                        ai0_2.i((View)object10);
                    }
                    if ((object10 = ((ConvenienceFee)object4).getRVP()) != null) {
                        object11 = object10.getNetAmount();
                        object10.setAmount((Price)object11);
                        object6 = R$id.platform_fee_layout;
                        object12 = string2.findViewById((int)object6);
                        Intrinsics.checkNotNull(object12);
                        ai0_2.B(object12);
                        object3 = hv3_0.a;
                        object11 = ((m80_0)object9).b;
                        if (object11 != null) {
                            object7 = object11 = ((ConvenienceFeeConfig)object11).getPlatformConvenienceFeeLabel();
                        } else {
                            n4 = 0;
                            object7 = null;
                            f6 = 0.0f;
                        }
                        object11 = object10.getNetAmount();
                        if (object11 != null) {
                            object11 = ((Price)object11).getValue();
                        } else {
                            object6 = false;
                            object11 = null;
                            f7 = 0.0f;
                        }
                        object5 = mz3_0.K((String)object11);
                        object10 = object10.getAmount();
                        if (object10 != null) {
                            object10 = object10.getValue();
                        } else {
                            n7 = 0;
                            object10 = null;
                            f8 = 0.0f;
                        }
                        object2 = mz3_0.K((String)object10);
                        object = null;
                        n16 = 112;
                        n15 = 0;
                        hv3_0.n0((hv3_0)object3, object12, (String)object7, object5, (Float)object2, null, null, null, n16);
                    }
                    if ((object10 = ((ConvenienceFee)object4).getCOD()) != null) {
                        object6 = R$id.cod_fee_layout;
                        object12 = string2.findViewById((int)object6);
                        Intrinsics.checkNotNull(object12);
                        ai0_2.B(object12);
                        object3 = hv3_0.a;
                        object9 = ((m80_0)object9).b;
                        if (object9 != null) {
                            object7 = object9 = ((ConvenienceFeeConfig)object9).getCashOnDeliveryFeeLabel();
                        } else {
                            n4 = 0;
                            object7 = null;
                            f6 = 0.0f;
                        }
                        object9 = object10.getNetAmount();
                        if (object9 != null) {
                            object9 = ((Price)object9).getValue();
                        } else {
                            bl2 = false;
                            object9 = null;
                        }
                        object5 = mz3_0.K((String)object9);
                        object9 = object10.getAmount();
                        if (object9 != null) {
                            object9 = ((Price)object9).getValue();
                        } else {
                            bl2 = false;
                            object9 = null;
                        }
                        object2 = mz3_0.K((String)object9);
                        object = null;
                        n16 = 112;
                        n15 = 0;
                        hv3_0.n0((hv3_0)object3, object12, (String)object7, object5, (Float)object2, null, null, null, n16);
                    }
                    object9 = h40_0.a;
                    bl2 = h40_0.O1();
                    if (bl2 && (object9 = ((ConvenienceFee)object4).getPriorityDelivery()) != null) {
                        n10 = R$id.priority_delivery_fee_layout;
                        object11 = string2.findViewById(n10);
                        Intrinsics.checkNotNull(object11);
                        ai0_2.B((View)object11);
                        object10 = hv3_0.a;
                        object3 = h40_0.j0().getPriorityDeliveryFeeLabel();
                        object4 = ((AmountData)object9).getNetAmount();
                        if (object4 != null) {
                            object4 = ((Price)object4).getValue();
                        } else {
                            n10 = 0;
                            object4 = null;
                            f12 = 0.0f;
                        }
                        object12 = mz3_0.K((String)object4);
                        object9 = ((AmountData)object9).getAmount();
                        if (object9 != null) {
                            object8 = ((Price)object9).getValue();
                        }
                        object7 = mz3_0.K((String)object8);
                        object = Boolean.FALSE;
                        n3 = 0;
                        object2 = null;
                        n15 = 48;
                        f19 = 0.0f;
                        f5 = 0.0f;
                        object5 = null;
                        hv3_0.n0((hv3_0)object10, (View)object11, (String)object3, (Float)object12, (Float)object7, null, null, (Boolean)object, n15);
                    }
                    linearLayout.removeAllViews();
                    linearLayout.addView((View)string2);
                }
            } else {
                ai0_2.i((View)linearLayout);
            }
        } else {
            ai0_2.i((View)linearLayout);
        }
    }
}

