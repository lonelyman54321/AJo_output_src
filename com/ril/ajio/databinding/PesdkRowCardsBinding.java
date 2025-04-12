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
import com.ril.ajio.databinding.PesdkLayoutInstantDiscBinding;
import com.ril.ajio.databinding.PesdkRbiGuidelineBinding;
import com.ril.ajio.databinding.PesdkViewAddCardBinding;

public final class PesdkRowCardsBinding
implements BC3 {
    public final LinearLayout cardContentContainer;
    public final PENonScrollableListView cardListView;
    public final PEToggleButton cardToggleExpand;
    public final AjioTextView creditCardAddCard;
    public final AjioCustomExpandablePanel expandablePaymentCard;
    public final PesdkLayoutInstantDiscBinding instantDiscountContainer1;
    public final PesdkLayoutInstantDiscBinding instantDiscountContainer2;
    public final RelativeLayout noCardContainer;
    private final LinearLayout rootView;
    public final PesdkViewAddCardBinding viewAddCreditCard;
    public final PesdkRbiGuidelineBinding viewRbiGuideline;

    private PesdkRowCardsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, PENonScrollableListView pENonScrollableListView, PEToggleButton pEToggleButton, AjioTextView ajioTextView, AjioCustomExpandablePanel ajioCustomExpandablePanel, PesdkLayoutInstantDiscBinding pesdkLayoutInstantDiscBinding, PesdkLayoutInstantDiscBinding pesdkLayoutInstantDiscBinding2, RelativeLayout relativeLayout, PesdkViewAddCardBinding pesdkViewAddCardBinding, PesdkRbiGuidelineBinding pesdkRbiGuidelineBinding) {
        this.rootView = linearLayout;
        this.cardContentContainer = linearLayout2;
        this.cardListView = pENonScrollableListView;
        this.cardToggleExpand = pEToggleButton;
        this.creditCardAddCard = ajioTextView;
        this.expandablePaymentCard = ajioCustomExpandablePanel;
        this.instantDiscountContainer1 = pesdkLayoutInstantDiscBinding;
        this.instantDiscountContainer2 = pesdkLayoutInstantDiscBinding2;
        this.noCardContainer = relativeLayout;
        this.viewAddCreditCard = pesdkViewAddCardBinding;
        this.viewRbiGuideline = pesdkRbiGuidelineBinding;
    }

    public static PesdkRowCardsBinding bind(View object) {
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
                        if (object5 != null && (view = dd2_2.a(n3 = R$id.instantDiscountContainer1, object)) != null) {
                            PesdkLayoutInstantDiscBinding pesdkLayoutInstantDiscBinding = PesdkLayoutInstantDiscBinding.bind(view);
                            n3 = R$id.instantDiscountContainer2;
                            view = dd2_2.a(n3, object);
                            if (view != null) {
                                PesdkLayoutInstantDiscBinding pesdkLayoutInstantDiscBinding2 = PesdkLayoutInstantDiscBinding.bind(view);
                                n3 = R$id.no_card_container;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (RelativeLayout)view;
                                if (view3 != null && (view = dd2_2.a(n3 = R$id.view_add_credit_card, object)) != null) {
                                    PesdkViewAddCardBinding pesdkViewAddCardBinding = PesdkViewAddCardBinding.bind(view);
                                    n3 = R$id.view_rbi_guideline;
                                    view = dd2_2.a(n3, object);
                                    if (view != null) {
                                        PesdkRbiGuidelineBinding pesdkRbiGuidelineBinding = PesdkRbiGuidelineBinding.bind(view);
                                        Object object6 = object;
                                        object6 = (LinearLayout)object;
                                        PesdkRowCardsBinding pesdkRowCardsBinding = new PesdkRowCardsBinding((LinearLayout)object6, (LinearLayout)view2, (PENonScrollableListView)((Object)object2), (PEToggleButton)object3, (AjioTextView)object4, (AjioCustomExpandablePanel)((Object)object5), pesdkLayoutInstantDiscBinding, pesdkLayoutInstantDiscBinding2, (RelativeLayout)view3, pesdkViewAddCardBinding, pesdkRbiGuidelineBinding);
                                        return pesdkRowCardsBinding;
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

    public static PesdkRowCardsBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowCardsBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowCardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_cards;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowCardsBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

