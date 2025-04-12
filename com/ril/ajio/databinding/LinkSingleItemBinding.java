/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LinkSingleItemBinding
implements BC3 {
    public final AjioTextView linkText;
    public final AjioImageView rightArrow;
    private final CardView rootView;

    private LinkSingleItemBinding(CardView cardView, AjioTextView ajioTextView, AjioImageView ajioImageView) {
        this.rootView = cardView;
        this.linkText = ajioTextView;
        this.rightArrow = ajioImageView;
    }

    public static LinkSingleItemBinding bind(View object) {
        AjioImageView ajioImageView;
        int n3 = R$id.link_text;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (ajioImageView = (AjioImageView)dd2_2.a(n3 = R$id.right_arrow, object)) != null) {
            object = (CardView)((Object)object);
            LinkSingleItemBinding linkSingleItemBinding = new LinkSingleItemBinding((CardView)((Object)object), ajioTextView, ajioImageView);
            return linkSingleItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LinkSingleItemBinding inflate(LayoutInflater layoutInflater) {
        return LinkSingleItemBinding.inflate(layoutInflater, null, false);
    }

    public static LinkSingleItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.link_single_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LinkSingleItemBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

