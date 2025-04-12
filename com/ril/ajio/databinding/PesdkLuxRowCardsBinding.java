/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.databinding.PesdkLuxViewAddCardBinding;
import com.ril.ajio.databinding.PesdkRbiGuidelineLuxBinding;

public final class PesdkLuxRowCardsBinding
implements BC3 {
    public final LinearLayout cardContentContainer;
    public final PENonScrollableListView cardListView;
    public final PEToggleButton cardToggleExpand;
    public final AjioTextView creditCardAddCard;
    public final AjioCustomExpandablePanel expandablePaymentCard;
    public final RelativeLayout noCardContainer;
    private final LinearLayout rootView;
    public final PesdkLuxViewAddCardBinding viewAddCreditCard;
    public final PesdkRbiGuidelineLuxBinding viewRbiGuideline;

    private PesdkLuxRowCardsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, PENonScrollableListView pENonScrollableListView, PEToggleButton pEToggleButton, AjioTextView ajioTextView, AjioCustomExpandablePanel ajioCustomExpandablePanel, RelativeLayout relativeLayout, PesdkLuxViewAddCardBinding pesdkLuxViewAddCardBinding, PesdkRbiGuidelineLuxBinding pesdkRbiGuidelineLuxBinding) {
        this.rootView = linearLayout;
        this.cardContentContainer = linearLayout2;
        this.cardListView = pENonScrollableListView;
        this.cardToggleExpand = pEToggleButton;
        this.creditCardAddCard = ajioTextView;
        this.expandablePaymentCard = ajioCustomExpandablePanel;
        this.noCardContainer = relativeLayout;
        this.viewAddCreditCard = pesdkLuxViewAddCardBinding;
        this.viewRbiGuideline = pesdkRbiGuidelineLuxBinding;
    }

    public static PesdkLuxRowCardsBinding bind(View object) {
        View view;
        int n3 = R$id.card_contentContainer;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.card_listView;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (PENonScrollableListView)view;
            if (object2 != null) {
                n3 = R$id.card_toggle_expand;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (PEToggleButton)view;
                if (object3 != null) {
                    n3 = R$id.credit_card_addCard;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.expandable_payment_card;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioCustomExpandablePanel)view;
                        if (object5 != null) {
                            n3 = R$id.no_card_container;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (RelativeLayout)view;
                            if (view3 != null && (view = dd2_2.a(n3 = R$id.view_add_credit_card, object)) != null) {
                                PesdkLuxViewAddCardBinding pesdkLuxViewAddCardBinding = PesdkLuxViewAddCardBinding.bind(view);
                                n3 = R$id.view_rbi_guideline;
                                view = dd2_2.a(n3, object);
                                if (view != null) {
                                    PesdkRbiGuidelineLuxBinding pesdkRbiGuidelineLuxBinding = PesdkRbiGuidelineLuxBinding.bind(view);
                                    Object object6 = object;
                                    object6 = (LinearLayout)object;
                                    PesdkLuxRowCardsBinding pesdkLuxRowCardsBinding = new PesdkLuxRowCardsBinding((LinearLayout)object6, (LinearLayout)view2, (PENonScrollableListView)((Object)object2), (PEToggleButton)object3, (AjioTextView)object4, (AjioCustomExpandablePanel)((Object)object5), (RelativeLayout)view3, pesdkLuxViewAddCardBinding, pesdkRbiGuidelineLuxBinding);
                                    return pesdkLuxRowCardsBinding;
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

    public static PesdkLuxRowCardsBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowCardsBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowCardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_cards;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowCardsBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

