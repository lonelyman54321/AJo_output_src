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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PdpOfferRowBinding
implements BC3 {
    public final LinearLayout benefitLayout;
    public final CardView cvNewUserOffer;
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
    public final AjioTextView tvOffersItemTermsconditions;

    private PdpOfferRowBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, CardView cardView, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, AjioTextView ajioTextView, ImageView imageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7) {
        this.rootView = constraintLayout;
        this.benefitLayout = linearLayout;
        this.cvNewUserOffer = cardView;
        this.promoParentLayout = constraintLayout2;
        this.salePriceLayout = linearLayoutCompat;
        this.salePriceTv = ajioTextView;
        this.saleStarImv = imageView;
        this.saleTitleTv = ajioTextView2;
        this.timerTv = ajioTextView3;
        this.tvOfferItemBenefitBestpriceMessage = ajioTextView4;
        this.tvOffersItemBenefitCallout = ajioTextView5;
        this.tvOffersItemDescription = ajioTextView6;
        this.tvOffersItemTermsconditions = ajioTextView7;
    }

    public static PdpOfferRowBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.benefit_layout;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n3 = R$id.cv_new_user_offer;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (CardView)view2;
            if (object2 != null) {
                Object object3 = view;
                object3 = (ConstraintLayout)view;
                n3 = R$id.sale_price_layout;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (LinearLayoutCompat)view2;
                if (object4 != null) {
                    n3 = R$id.sale_price_tv;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.sale_star_imv;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (ImageView)view2;
                        if (view4 != null) {
                            n3 = R$id.sale_title_tv;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.timer_tv;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.tv_offer_item_benefit_bestprice_message;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.tv_offers_item_benefit_callout;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioTextView)view2;
                                        if (object9 != null) {
                                            n3 = R$id.tv_offers_item_description;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.tv_offers_item_termsconditions;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    object = new PdpOfferRowBinding((ConstraintLayout)((Object)object3), (LinearLayout)view3, (CardView)((Object)object2), (ConstraintLayout)((Object)object3), (LinearLayoutCompat)((Object)object4), (AjioTextView)object5, (ImageView)view4, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11);
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpOfferRowBinding inflate(LayoutInflater layoutInflater) {
        return PdpOfferRowBinding.inflate(layoutInflater, null, false);
    }

    public static PdpOfferRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_offer_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpOfferRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

