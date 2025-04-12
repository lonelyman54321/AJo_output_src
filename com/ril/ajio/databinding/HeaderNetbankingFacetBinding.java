/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;

public final class HeaderNetbankingFacetBinding
implements BC3 {
    private final LinearLayout rootView;
    public final EditText searchText;
    public final AjioAspectRatioImageView tvSearchTextClear;

    private HeaderNetbankingFacetBinding(LinearLayout linearLayout, EditText editText, AjioAspectRatioImageView ajioAspectRatioImageView) {
        this.rootView = linearLayout;
        this.searchText = editText;
        this.tvSearchTextClear = ajioAspectRatioImageView;
    }

    public static HeaderNetbankingFacetBinding bind(View object) {
        AjioAspectRatioImageView ajioAspectRatioImageView;
        int n3 = R$id.search_text;
        EditText editText = (EditText)dd2_2.a(n3, object);
        if (editText != null && (ajioAspectRatioImageView = (AjioAspectRatioImageView)dd2_2.a(n3 = R$id.tv_search_text_clear, object)) != null) {
            object = (LinearLayout)object;
            HeaderNetbankingFacetBinding headerNetbankingFacetBinding = new HeaderNetbankingFacetBinding((LinearLayout)object, editText, ajioAspectRatioImageView);
            return headerNetbankingFacetBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HeaderNetbankingFacetBinding inflate(LayoutInflater layoutInflater) {
        return HeaderNetbankingFacetBinding.inflate(layoutInflater, null, false);
    }

    public static HeaderNetbankingFacetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.header_netbanking_facet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HeaderNetbankingFacetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

