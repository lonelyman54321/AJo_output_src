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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkRbiGuidelineLuxBinding
implements BC3 {
    private final CardView rootView;
    public final AppCompatTextView tvRbiGuidelineSubtitle;
    public final AppCompatTextView tvRbiGuidelineTitle;

    private PesdkRbiGuidelineLuxBinding(CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = cardView;
        this.tvRbiGuidelineSubtitle = appCompatTextView;
        this.tvRbiGuidelineTitle = appCompatTextView2;
    }

    public static PesdkRbiGuidelineLuxBinding bind(View object) {
        AppCompatTextView appCompatTextView;
        int n3 = R$id.tv_rbi_guideline_subtitle;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView)dd2_2.a(n3, object);
        if (appCompatTextView2 != null && (appCompatTextView = (AppCompatTextView)dd2_2.a(n3 = R$id.tv_rbi_guideline_title, object)) != null) {
            object = (CardView)((Object)object);
            PesdkRbiGuidelineLuxBinding pesdkRbiGuidelineLuxBinding = new PesdkRbiGuidelineLuxBinding((CardView)((Object)object), appCompatTextView2, appCompatTextView);
            return pesdkRbiGuidelineLuxBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkRbiGuidelineLuxBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRbiGuidelineLuxBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRbiGuidelineLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_rbi_guideline_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRbiGuidelineLuxBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

