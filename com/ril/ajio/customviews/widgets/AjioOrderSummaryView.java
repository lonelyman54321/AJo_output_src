/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Price;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class AjioOrderSummaryView
extends LinearLayout
implements View.OnClickListener {
    public static final int $stable = 8;
    private TextView actualAmtPaid;
    private TextView actualAmtPaidTxt;
    private float amtPaid;
    private TextView bagTotalTv;
    private TextView bankOfferLabel;
    private TextView bankOfferTv;
    private TextView couponTv;
    private TextView creditLabel;
    private TextView creditTv;
    private TextView deliveryTv;
    private TextView giftWrapTv;
    private TextView gstTv;
    private TextView loyaltyTv;
    private TextView promoTv;
    private View rowActualAmtpaid;
    private View rowCoupon;
    private View rowCredit;
    private View rowGiftWrap;
    private View rowGst;
    private View rowLoyalty;
    private View rowPromo;
    private View rowSaving;
    private View rowbankOffer;
    private TextView savingTv;
    private TextView totalTv;

    public AjioOrderSummaryView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.init(context);
    }

    public AjioOrderSummaryView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.init(context);
    }

    public AjioOrderSummaryView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.init(context);
    }

    public AjioOrderSummaryView(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.init(context);
    }

    private final void init(Context context) {
        View view;
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.row_ordersummary_layout;
        context = context.inflate(n3, (ViewGroup)this, true);
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.widget.LinearLayout");
        context = (LinearLayout)context;
        n3 = R$id.row_cart_summary_layout_gst;
        this.rowGst = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_layout_credit;
        this.rowCredit = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_layout_bankOffer;
        this.rowbankOffer = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_layout_promo_saving;
        this.rowPromo = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_layout_bag_saving;
        this.rowSaving = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_layout_coupon_saving;
        this.rowCoupon = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_layout_giftwrap;
        this.rowGiftWrap = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_layout_actual_paid;
        this.rowActualAmtpaid = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_tv_bag_total;
        view = (TextView)context.findViewById(n3);
        this.bagTotalTv = view;
        n3 = R$id.row_cart_summary_tv_promo_saving;
        view = (TextView)context.findViewById(n3);
        this.promoTv = view;
        n3 = R$id.row_cart_summary_tv_bag_saving;
        view = (TextView)context.findViewById(n3);
        this.savingTv = view;
        n3 = R$id.row_cart_summary_tv_coupon_saving;
        view = (TextView)context.findViewById(n3);
        this.couponTv = view;
        n3 = R$id.row_cart_summary_tv_gst;
        view = (TextView)context.findViewById(n3);
        this.gstTv = view;
        n3 = R$id.credit_text;
        view = (TextView)context.findViewById(n3);
        this.creditLabel = view;
        n3 = R$id.bankOffer_text;
        view = (TextView)context.findViewById(n3);
        this.bankOfferLabel = view;
        n3 = R$id.row_cart_summary_tv_credit;
        view = (TextView)context.findViewById(n3);
        this.creditTv = view;
        n3 = R$id.row_cart_summary_tv_bankOffer;
        view = (TextView)context.findViewById(n3);
        this.bankOfferTv = view;
        n3 = R$id.row_cart_summary_tv_giftwrap;
        view = (TextView)context.findViewById(n3);
        this.giftWrapTv = view;
        n3 = R$id.row_cart_summary_tv_delivery;
        view = (TextView)context.findViewById(n3);
        this.deliveryTv = view;
        n3 = R$id.row_cart_summary_tv_total;
        view = (TextView)context.findViewById(n3);
        this.totalTv = view;
        n3 = R$id.row_cart_summary_tv_actual;
        view = (TextView)context.findViewById(n3);
        this.actualAmtPaid = view;
        n3 = R$id.row_cart_summary_tv_actual_txt;
        view = (TextView)context.findViewById(n3);
        this.actualAmtPaidTxt = view;
        n3 = R$id.row_cart_summary_layout_loyalty;
        this.rowLoyalty = view = context.findViewById(n3);
        n3 = R$id.row_cart_summary_tv_loyalty;
        view = (TextView)context.findViewById(n3);
        this.loyaltyTv = view;
        n3 = R$id.row_cart_summary_imv_delivery_info;
        context.findViewById(n3).setOnClickListener((View.OnClickListener)this);
    }

    public final void configure(Cart cart) {
        if (cart != null) {
            float f5;
            float f6;
            float f7;
            float f8;
            float f11;
            float f12;
            int n3;
            float f14;
            String string2;
            float f15;
            String string3;
            float f16;
            Object object;
            float f17 = cart.getBagTotal();
            int n4 = 0;
            View view = null;
            float f18 = f17 - 0.0f;
            Object object2 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                object = this.bagTotalTv;
                Intrinsics.checkNotNull(object);
                f16 = cart.getBagTotal();
                string3 = qz2_0.u(f16);
                object.setText((CharSequence)string3);
            } else {
                object = this.bagTotalTv;
                Intrinsics.checkNotNull(object);
                string3 = qz2_0.z();
                object.setText((CharSequence)string3);
            }
            f17 = cart.getTotalBagSaving();
            int n7 = 8;
            f16 = 1.1E-44f;
            float f19 = f17 - 0.0f;
            object2 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                object = this.savingTv;
                Intrinsics.checkNotNull(object);
                f15 = cart.getTotalBagSaving();
                string2 = qz2_0.q(f15);
                object.setText((CharSequence)string2);
                object = this.rowSaving;
                Intrinsics.checkNotNull(object);
                object.setVisibility(0);
            } else {
                object = this.savingTv;
                Intrinsics.checkNotNull(object);
                string2 = qz2_0.z();
                object.setText((CharSequence)string2);
                object = this.rowSaving;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n7);
            }
            object = cart.getEntries();
            if (object != null) {
                object = cart.getEntries();
                object2 = object.size();
                f15 = 0.0f;
                string2 = null;
                f14 = 0.0f;
                for (n3 = 0; n3 < object2; ++n3) {
                    Object object3 = cart.getEntries().get(n3);
                    if (object3 == null) continue;
                    object3 = ((CartEntry)cart.getEntries().get(n3)).getMultiItemPromoAmt();
                    float f20 = mz3_0.J(object3);
                    f14 += f20;
                }
            } else {
                f14 = 0.0f;
            }
            if ((object2 = (f12 = f14 - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) > 0) {
                object = this.rowPromo;
                Intrinsics.checkNotNull(object);
                object.setVisibility(0);
                object = this.promoTv;
                Intrinsics.checkNotNull(object);
                string2 = qz2_0.q(f14);
                object.setText((CharSequence)string2);
            } else {
                object = this.rowPromo;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n7);
            }
            object = cart.getVoucherAmount();
            if (object != null) {
                object = cart.getVoucherAmount().getValue();
                f17 = mz3_0.J((String)object) + 0.0f;
            } else {
                object2 = false;
                f17 = 0.0f;
                object = null;
            }
            n3 = (int)((f11 = f17 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                string2 = this.rowCoupon;
                Intrinsics.checkNotNull(string2);
                string2.setVisibility(0);
                string2 = this.couponTv;
                Intrinsics.checkNotNull(string2);
                object = qz2_0.q(f17);
                string2.setText((CharSequence)object);
            } else {
                object = this.rowCoupon;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n7);
            }
            object = cart.getGiftWrapCharges();
            if (object != null) {
                object = cart.getGiftWrapCharges().getValue();
                f17 = mz3_0.J((String)object);
            } else {
                object2 = false;
                f17 = 0.0f;
                object = null;
            }
            n3 = (int)((f8 = f17 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                string2 = this.rowGiftWrap;
                Intrinsics.checkNotNull(string2);
                string2.setVisibility(0);
                string2 = this.giftWrapTv;
                Intrinsics.checkNotNull(string2);
                object = qz2_0.u(f17);
                string2.setText((CharSequence)object);
            } else {
                object = this.rowGiftWrap;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n7);
            }
            object = cart.getExclusiveGST();
            if (object != null) {
                object = cart.getExclusiveGST().getValue();
                f17 = mz3_0.J((String)object);
            } else {
                object2 = false;
                f17 = 0.0f;
                object = null;
            }
            n3 = (int)((f7 = f17 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                string2 = this.gstTv;
                Intrinsics.checkNotNull(string2);
                object = qz2_0.u(f17);
                string2.setText((CharSequence)object);
                object = this.rowGst;
                Intrinsics.checkNotNull(object);
                object.setVisibility(0);
            } else {
                object = this.gstTv;
                Intrinsics.checkNotNull(object);
                string2 = qz2_0.z();
                object.setText((CharSequence)string2);
                object = this.rowGst;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n7);
            }
            object = cart.getDeliveryCost();
            if (object != null) {
                object = cart.getDeliveryCost().getValue();
                f17 = mz3_0.J((String)object);
            } else {
                object2 = false;
                f17 = 0.0f;
                object = null;
            }
            n3 = (int)((f6 = f17 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                string2 = this.deliveryTv;
                Intrinsics.checkNotNull(string2);
                object = qz2_0.u(f17);
                string2.setText((CharSequence)object);
            } else {
                object = this.deliveryTv;
                Intrinsics.checkNotNull(object);
                n3 = R$string.free;
                string2 = hv3_0.K(n3);
                object.setText((CharSequence)string2);
            }
            f17 = cart.getLoyaltyBurnedPoints();
            float f22 = f17 - 0.0f;
            object2 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                object = this.rowLoyalty;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = this.loyaltyTv) != null) {
                    f15 = cart.getLoyaltyBurnedPoints();
                    string2 = qz2_0.q(f15);
                    object.setText((CharSequence)string2);
                }
            } else {
                object = this.rowLoyalty;
                if (object != null) {
                    object.setVisibility(n7);
                }
            }
            if ((object = cart.getTotalPriceWithTax()) != null && (object2 = (Object)TextUtils.isEmpty((CharSequence)(object = cart.getTotalPriceWithTax().getFormattedValue()))) == false) {
                object = this.totalTv;
                Intrinsics.checkNotNull(object);
                f15 = mz3_0.J(cart.getTotalPriceWithTax().getValue());
                string2 = qz2_0.u(f15);
                object.setText((CharSequence)string2);
            } else {
                object = this.totalTv;
                Intrinsics.checkNotNull(object);
                string2 = qz2_0.z();
                object.setText((CharSequence)string2);
            }
            object = cart.getCreditsUsedAmount();
            if (object != null) {
                object = this.creditLabel;
                Intrinsics.checkNotNull(object);
                string2 = "AJIO Wallet";
                object.setText((CharSequence)string2);
                object = cart.getCreditsUsedAmount().getValue();
                f17 = mz3_0.J((String)object);
            } else {
                object2 = false;
                f17 = 0.0f;
                object = null;
            }
            n4 = (f5 = f17 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
            if (n4 > 0) {
                float f23;
                view = this.rowCredit;
                Intrinsics.checkNotNull(view);
                view.setVisibility(0);
                view = this.creditTv;
                Intrinsics.checkNotNull(view);
                string3 = qz2_0.q(f17);
                view.setText((CharSequence)string3);
                this.amtPaid = f23 = mz3_0.J(cart.getTotalPriceWithTax().getValue()) - f17;
                cart = this.actualAmtPaid;
                Intrinsics.checkNotNull(cart);
                f17 = this.amtPaid;
                object = qz2_0.u(f17);
                cart.setText((CharSequence)object);
                cart = this.rowActualAmtpaid;
                Intrinsics.checkNotNull(cart);
                cart.setVisibility(0);
            } else {
                cart = this.creditTv;
                Intrinsics.checkNotNull(cart);
                object = qz2_0.z();
                cart.setText((CharSequence)object);
                cart = this.rowCredit;
                Intrinsics.checkNotNull(cart);
                cart.setVisibility(n7);
                cart = this.rowActualAmtpaid;
                Intrinsics.checkNotNull(cart);
                cart.setVisibility(n7);
            }
        }
    }

    public final void configureOrder(CartOrder object) {
        block40: {
            Object object2;
            block41: {
                Object object3;
                int n3;
                String string2;
                float f5;
                block42: {
                    float f6;
                    float f7;
                    Object object4;
                    float f8;
                    float f11;
                    float f12;
                    float f14;
                    float f15;
                    float f16;
                    Object object5;
                    int n4;
                    String string3;
                    float f17;
                    Object object6;
                    float f18;
                    Object object7;
                    Object object8;
                    f5 = 0.0f;
                    string2 = null;
                    n3 = 1;
                    float f19 = Float.MIN_VALUE;
                    if (object == null) break block40;
                    float f20 = ((CartOrder)object).getTotalBag();
                    float f22 = f20 - 0.0f;
                    object2 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                    if (object2 > 0) {
                        object8 = this.bagTotalTv;
                        Intrinsics.checkNotNull(object8);
                        object7 = qz2_0.u(f20);
                        object8.setText((CharSequence)object7);
                    } else {
                        object7 = this.bagTotalTv;
                        Intrinsics.checkNotNull(object7);
                        object8 = qz2_0.z();
                        object7.setText((CharSequence)object8);
                    }
                    f20 = ((CartOrder)object).getTotalBagSaving();
                    object2 = 8;
                    float f23 = f20 - 0.0f;
                    float f24 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                    if (f24 > 0) {
                        object7 = this.savingTv;
                        Intrinsics.checkNotNull(object7);
                        f18 = ((CartOrder)object).getTotalBagSaving();
                        object6 = qz2_0.q(f18);
                        object7.setText((CharSequence)object6);
                        object7 = this.rowSaving;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility(0);
                    } else {
                        object7 = this.savingTv;
                        Intrinsics.checkNotNull(object7);
                        object6 = qz2_0.z();
                        object7.setText((CharSequence)object6);
                        object7 = this.rowSaving;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility((int)object2);
                    }
                    object7 = ((CartOrder)object).getEntries();
                    if (object7 != null) {
                        object7 = ((CartOrder)object).getEntries();
                        f24 = object7.size();
                        f18 = 0.0f;
                        object6 = null;
                        f17 = 0.0f;
                        string3 = null;
                        for (n4 = 0; n4 < f24; n4 += n3) {
                            object5 = ((CartOrder)object).getEntries().get(n4);
                            if (object5 == null) continue;
                            object5 = ((CartEntry)((CartOrder)object).getEntries().get(n4)).getMultiItemPromoAmt();
                            float f25 = mz3_0.J(object5);
                            f17 += f25;
                        }
                    } else {
                        f17 = 0.0f;
                        string3 = null;
                    }
                    if ((f24 = (f16 = f17 - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1)) > 0) {
                        object7 = this.rowPromo;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility(0);
                        object7 = this.promoTv;
                        Intrinsics.checkNotNull(object7);
                        object6 = qz2_0.q(f17);
                        object7.setText((CharSequence)object6);
                    } else {
                        object7 = this.rowPromo;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility((int)object2);
                    }
                    object7 = ((CartOrder)object).getVoucherAmount();
                    if (object7 != null) {
                        object7 = ((CartOrder)object).getVoucherAmount().getValue();
                        f20 = mz3_0.J((String)object7) + 0.0f;
                    } else {
                        f24 = 0.0f;
                        f20 = 0.0f;
                        object7 = null;
                    }
                    n4 = (int)((f15 = f20 - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
                    if (n4 > 0) {
                        object6 = this.rowCoupon;
                        Intrinsics.checkNotNull(object6);
                        object6.setVisibility(0);
                        object6 = this.couponTv;
                        Intrinsics.checkNotNull(object6);
                        object7 = qz2_0.q(f20);
                        object6.setText((CharSequence)object7);
                    } else {
                        object7 = this.rowCoupon;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility((int)object2);
                    }
                    object7 = ((CartOrder)object).getGiftWrapCharges();
                    if (object7 != null) {
                        object7 = ((CartOrder)object).getGiftWrapCharges().getValue();
                        f20 = mz3_0.J((String)object7);
                    } else {
                        f24 = 0.0f;
                        f20 = 0.0f;
                        object7 = null;
                    }
                    n4 = (int)((f14 = f20 - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
                    if (n4 > 0) {
                        object6 = this.rowGiftWrap;
                        Intrinsics.checkNotNull(object6);
                        object6.setVisibility(0);
                        object6 = this.giftWrapTv;
                        Intrinsics.checkNotNull(object6);
                        object7 = qz2_0.u(f20);
                        object6.setText((CharSequence)object7);
                    } else {
                        object7 = this.rowGiftWrap;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility((int)object2);
                    }
                    object7 = ((CartOrder)object).getExclusiveGST();
                    if (object7 != null) {
                        object7 = ((CartOrder)object).getExclusiveGST().getValue();
                        f20 = mz3_0.J((String)object7);
                    } else {
                        f24 = 0.0f;
                        f20 = 0.0f;
                        object7 = null;
                    }
                    n4 = (int)((f12 = f20 - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                    if (n4 > 0) {
                        object6 = this.gstTv;
                        Intrinsics.checkNotNull(object6);
                        object7 = qz2_0.u(f20);
                        object6.setText((CharSequence)object7);
                        object7 = this.rowGst;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility(0);
                    } else {
                        object7 = this.gstTv;
                        Intrinsics.checkNotNull(object7);
                        object6 = qz2_0.z();
                        object7.setText((CharSequence)object6);
                        object7 = this.rowGst;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility((int)object2);
                    }
                    f20 = ((CartOrder)object).getLoyaltyBurnedPoints();
                    float f26 = f20 - 0.0f;
                    f24 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
                    if (f24 > 0) {
                        object7 = this.rowLoyalty;
                        if (object7 != null) {
                            object7.setVisibility(0);
                        }
                        if ((object7 = this.loyaltyTv) != null) {
                            f18 = ((CartOrder)object).getLoyaltyBurnedPoints();
                            object6 = qz2_0.q(f18);
                            object7.setText((CharSequence)object6);
                        }
                    } else {
                        object7 = this.rowLoyalty;
                        if (object7 != null) {
                            object7.setVisibility((int)object2);
                        }
                    }
                    if ((object7 = ((CartOrder)object).getDeliveryCost()) != null) {
                        object7 = ((CartOrder)object).getDeliveryCost().getValue();
                        f20 = mz3_0.J((String)object7);
                    } else {
                        f24 = 0.0f;
                        f20 = 0.0f;
                        object7 = null;
                    }
                    n4 = (int)((f11 = f20 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                    if (n4 > 0) {
                        object6 = this.deliveryTv;
                        Intrinsics.checkNotNull(object6);
                        object7 = qz2_0.u(f20);
                        object6.setText((CharSequence)object7);
                    } else {
                        object7 = this.deliveryTv;
                        Intrinsics.checkNotNull(object7);
                        n4 = R$string.free;
                        object6 = hv3_0.K(n4);
                        object7.setText((CharSequence)object6);
                    }
                    object7 = ((CartOrder)object).getTotalPriceWithTax();
                    if (object7 != null && (f24 = (float)TextUtils.isEmpty((CharSequence)(object7 = ((CartOrder)object).getTotalPriceWithTax().getFormattedValue()))) == false) {
                        object7 = this.totalTv;
                        Intrinsics.checkNotNull(object7);
                        object6 = ((CartOrder)object).getTotalPriceWithTax();
                        if (object6 != null && (object6 = ((Price)object6).getValue()) != null) {
                            f18 = Float.parseFloat((String)object6);
                        } else {
                            n4 = 0;
                            f18 = 0.0f;
                            object6 = null;
                        }
                        object6 = qz2_0.u(f18);
                        object7.setText((CharSequence)object6);
                    } else {
                        object7 = this.totalTv;
                        Intrinsics.checkNotNull(object7);
                        object6 = qz2_0.z();
                        object7.setText((CharSequence)object6);
                    }
                    object7 = ((CartOrder)object).getCreditsUsedAmount();
                    if (object7 != null) {
                        object7 = this.creditLabel;
                        Intrinsics.checkNotNull(object7);
                        object6 = "AJIO Wallet";
                        object7.setText((CharSequence)object6);
                        object7 = ((CartOrder)object).getCreditsUsedAmount().getValue();
                        f20 = mz3_0.J((String)object7);
                    } else {
                        f24 = 0.0f;
                        f20 = 0.0f;
                        object7 = null;
                    }
                    n4 = (int)((f8 = f20 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                    if (n4 > 0) {
                        object6 = this.creditTv;
                        Intrinsics.checkNotNull(object6);
                        string3 = qz2_0.q(f20);
                        object6.setText((CharSequence)string3);
                        object6 = this.rowCredit;
                        Intrinsics.checkNotNull(object6);
                        object6.setVisibility(0);
                    } else {
                        object7 = this.rowCredit;
                        Intrinsics.checkNotNull(object7);
                        object7.setVisibility((int)object2);
                        f24 = 0.0f;
                        f20 = 0.0f;
                        object7 = null;
                    }
                    object6 = ((CartOrder)object).getBankOfferAmt();
                    if (object6 != null) {
                        object6 = this.bankOfferLabel;
                        Intrinsics.checkNotNull(object6);
                        object6.setText((CharSequence)"Bank Discount");
                        object6 = ((CartOrder)object).getBankOfferAmt().getValue();
                        f18 = mz3_0.J((String)object6);
                        string3 = this.bankOfferTv;
                        Intrinsics.checkNotNull(string3);
                        object5 = StringCompanionObject.INSTANCE;
                        object5 = Float.valueOf(f18);
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object5;
                        object5 = "-%s";
                        String string4 = "format(...)";
                        zn0_1.b(objectArray, n3, object5, string4, (TextView)string3);
                        float f27 = f18 - 0.0f;
                        n3 = (int)(f27 == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1));
                        if (n3 > 0) {
                            f20 += f18;
                            object3 = this.bankOfferTv;
                            Intrinsics.checkNotNull(object3);
                            object6 = qz2_0.q(f18);
                            object3.setText((CharSequence)object6);
                            object3 = this.rowbankOffer;
                            Intrinsics.checkNotNull(object3);
                            object3.setVisibility(0);
                        }
                    }
                    if ((object3 = ((CartOrder)object).getTotalPriceWithTax()) == null) break block41;
                    this.amtPaid = f19 = mz3_0.J(((CartOrder)object).getTotalPriceWithTax().getValue()) - f20;
                    object6 = "cod";
                    object3 = ((CartOrder)object).getPaymentMode();
                    n3 = (int)(((String)object6).equalsIgnoreCase((String)object3) ? 1 : 0);
                    if (n3 != 0 || (object4 = ((String)(object3 = "cash on delivery")).equalsIgnoreCase((String)(object = ((CartOrder)object).getPaymentMode()))) != 0) break block42;
                    float f28 = f20 - 0.0f;
                    object4 = f28 == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1);
                    if (object4 <= 0 || (object4 = (Object)((f7 = (f6 = this.amtPaid) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) <= 0) break block41;
                    object = this.actualAmtPaidTxt;
                    Intrinsics.checkNotNull(object);
                    n3 = R$string.order_total_paid_already;
                    object3 = hv3_0.K(n3);
                    object.setText((CharSequence)object3);
                    object = this.rowActualAmtpaid;
                    Intrinsics.checkNotNull(object);
                    object.setVisibility(0);
                    object = this.actualAmtPaid;
                    Intrinsics.checkNotNull(object);
                    f5 = this.amtPaid;
                    string2 = qz2_0.u(f5);
                    object.setText((CharSequence)string2);
                    break block40;
                }
                object = this.actualAmtPaidTxt;
                Intrinsics.checkNotNull(object);
                n3 = R$string.order_total_paid;
                object3 = hv3_0.K(n3);
                object.setText((CharSequence)object3);
                object = this.rowActualAmtpaid;
                Intrinsics.checkNotNull(object);
                object.setVisibility(0);
                object = this.actualAmtPaid;
                Intrinsics.checkNotNull(object);
                f5 = this.amtPaid;
                string2 = qz2_0.u(f5);
                object.setText((CharSequence)string2);
                break block40;
            }
            object = this.rowActualAmtpaid;
            Intrinsics.checkNotNull(object);
            object.setVisibility((int)object2);
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void setOrderAmtPaidViewVisible(boolean n3) {
        View view = this.rowActualAmtpaid;
        Intrinsics.checkNotNull(view);
        n3 = n3 != 0 ? 0 : 8;
        view.setVisibility(n3);
    }
}

