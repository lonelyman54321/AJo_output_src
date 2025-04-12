/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkViewAddCardBinding
implements BC3 {
    public final AjioTextView creditCardTvAddCard;
    public final AjioTextView creditCardTvViewMore;
    private final RelativeLayout rootView;

    private PesdkViewAddCardBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = relativeLayout;
        this.creditCardTvAddCard = ajioTextView;
        this.creditCardTvViewMore = ajioTextView2;
    }

    public static PesdkViewAddCardBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.credit_card_tv_addCard;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.credit_card_tv_viewMore, object)) != null) {
            object = (RelativeLayout)object;
            PesdkViewAddCardBinding pesdkViewAddCardBinding = new PesdkViewAddCardBinding((RelativeLayout)object, ajioTextView2, ajioTextView);
            return pesdkViewAddCardBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkViewAddCardBinding inflate(LayoutInflater layoutInflater) {
        return PesdkViewAddCardBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkViewAddCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_view_add_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkViewAddCardBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

