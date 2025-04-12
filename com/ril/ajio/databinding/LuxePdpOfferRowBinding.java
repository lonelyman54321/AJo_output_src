/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.LuxeUnderLineTextView;

public final class LuxePdpOfferRowBinding
implements BC3 {
    public final LinearLayout benefitLayout;
    public final ConstraintLayout promoParentLayout;
    private final ConstraintLayout rootView;
    public final LinearLayoutCompat salePriceLayout;
    public final AjioTextView salePriceTv;
    public final ImageView saleStarImv;
    public final AjioTextView saleTitleTv;
    public final AjioTextView timerTv;
    public final AjioTextView tvOfferItemBenefitBestpriceMessage;
    public final AjioTextView tvOffersItemBenefitCallout;
    public final AjioTextView tvOffersItemDescription;
    public final LuxeUnderLineTextView tvOffersItemTermsconditions;

    private LuxePdpOfferRowBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, AjioTextView ajioTextView, ImageView imageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, LuxeUnderLineTextView luxeUnderLineTextView) {
        this.rootView = constraintLayout;
        this.benefitLayout = linearLayout;
        this.promoParentLayout = constraintLayout2;
        this.salePriceLayout = linearLayoutCompat;
        this.salePriceTv = ajioTextView;
        this.saleStarImv = imageView;
        this.saleTitleTv = ajioTextView2;
        this.timerTv = ajioTextView3;
        this.tvOfferItemBenefitBestpriceMessage = ajioTextView4;
        this.tvOffersItemBenefitCallout = ajioTextView5;
        this.tvOffersItemDescription = ajioTextView6;
        this.tvOffersItemTermsconditions = luxeUnderLineTextView;
    }

    public static LuxePdpOfferRowBinding bind(View object) {
        View view;
        int n3 = R$id.benefit_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            n3 = R$id.sale_price_layout;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (LinearLayoutCompat)view;
            if (object3 != null) {
                n3 = R$id.sale_price_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.sale_star_imv;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (ImageView)view;
                    if (view3 != null) {
                        n3 = R$id.sale_title_tv;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.timer_tv;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.tv_offer_item_benefit_bestprice_message;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.tv_offers_item_benefit_callout;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        n3 = R$id.tv_offers_item_description;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioTextView)view;
                                        if (object9 != null) {
                                            n3 = R$id.tv_offers_item_termsconditions;
                                            Object object10 = view = dd2_2.a(n3, object);
                                            object10 = (LuxeUnderLineTextView)view;
                                            if (object10 != null) {
                                                object = new LuxePdpOfferRowBinding((ConstraintLayout)((Object)object2), (LinearLayout)view2, (ConstraintLayout)((Object)object2), (LinearLayoutCompat)((Object)object3), (AjioTextView)object4, (ImageView)view3, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (LuxeUnderLineTextView)object10);
                                                return object;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePdpOfferRowBinding inflate(LayoutInflater layoutInflater) {
        return LuxePdpOfferRowBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePdpOfferRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_pdp_offer_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePdpOfferRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

