/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutLandingPageSearchWithMenuBinding
implements BC3 {
    public final CardView fslpNewSearchCardView;
    public final FrameLayout llpsCatColLayout;
    public final ImageView llpsIvCatMenu;
    public final ImageView llpsIvSearch;
    public final FrameLayout llpsLayoutMenu;
    public final View llpsTransView;
    public final TextView llpsTvSearch;
    private final CardView rootView;

    private LayoutLandingPageSearchWithMenuBinding(CardView cardView, CardView cardView2, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, FrameLayout frameLayout2, View view, TextView textView) {
        this.rootView = cardView;
        this.fslpNewSearchCardView = cardView2;
        this.llpsCatColLayout = frameLayout;
        this.llpsIvCatMenu = imageView;
        this.llpsIvSearch = imageView2;
        this.llpsLayoutMenu = frameLayout2;
        this.llpsTransView = view;
        this.llpsTvSearch = textView;
    }

    public static LayoutLandingPageSearchWithMenuBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (CardView)((Object)object);
        int n3 = R$id.llpsCatColLayout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (FrameLayout)view;
        if (view2 != null) {
            n3 = R$id.llpsIvCatMenu;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.llpsIvSearch;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    View view5;
                    n3 = R$id.llpsLayoutMenu;
                    View view6 = view = dd2_2.a(n3, object);
                    view6 = (FrameLayout)view;
                    if (view6 != null && (view5 = dd2_2.a(n3 = R$id.llpsTransView, object)) != null) {
                        n3 = R$id.llpsTvSearch;
                        View view7 = view = dd2_2.a(n3, object);
                        view7 = (TextView)view;
                        if (view7 != null) {
                            Object object3 = object;
                            view = object2;
                            object = new LayoutLandingPageSearchWithMenuBinding((CardView)((Object)object2), (CardView)((Object)object2), (FrameLayout)view2, (ImageView)view3, (ImageView)view4, (FrameLayout)view6, view5, (TextView)view7);
                            return object;
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

    public static LayoutLandingPageSearchWithMenuBinding inflate(LayoutInflater layoutInflater) {
        return LayoutLandingPageSearchWithMenuBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutLandingPageSearchWithMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_landing_page_search_with_menu;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutLandingPageSearchWithMenuBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

