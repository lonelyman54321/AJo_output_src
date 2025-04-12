/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;

public final class LayoutLandingPageSearchBinding
implements BC3 {
    public final AjioImageView llpsIvCamera;
    public final ImageView llpsIvSearch;
    public final CardView llpsSearchCardView;
    public final LinearLayout llpsSearchLayout;
    public final TextView llpsTvSearch;
    private final CardView rootView;

    private LayoutLandingPageSearchBinding(CardView cardView, AjioImageView ajioImageView, ImageView imageView, CardView cardView2, LinearLayout linearLayout, TextView textView) {
        this.rootView = cardView;
        this.llpsIvCamera = ajioImageView;
        this.llpsIvSearch = imageView;
        this.llpsSearchCardView = cardView2;
        this.llpsSearchLayout = linearLayout;
        this.llpsTvSearch = textView;
    }

    public static LayoutLandingPageSearchBinding bind(View object) {
        View view;
        int n3 = R$id.llpsIvCamera;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
        if (object2 != null) {
            n3 = R$id.llpsIvSearch;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                Object object3 = object;
                object3 = (CardView)((Object)object);
                n3 = R$id.llpsSearchLayout;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.llpsTvSearch;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        object = new LayoutLandingPageSearchBinding((CardView)((Object)object3), (AjioImageView)((Object)object2), (ImageView)view2, (CardView)((Object)object3), (LinearLayout)view3, (TextView)view4);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutLandingPageSearchBinding inflate(LayoutInflater layoutInflater) {
        return LayoutLandingPageSearchBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutLandingPageSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_landing_page_search;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutLandingPageSearchBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

