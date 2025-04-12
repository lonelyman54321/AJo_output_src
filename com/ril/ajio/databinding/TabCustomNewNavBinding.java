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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class TabCustomNewNavBinding
implements BC3 {
    public final View bottomIndicator;
    public final ConstraintLayout customTab;
    private final ConstraintLayout rootView;
    public final AjioTextView tabCountTv;
    public final AjioAspectRatioImageView tabIcon;
    public final AjioTextView tabTitle;

    private TabCustomNewNavBinding(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.bottomIndicator = view;
        this.customTab = constraintLayout2;
        this.tabCountTv = ajioTextView;
        this.tabIcon = ajioAspectRatioImageView;
        this.tabTitle = ajioTextView2;
    }

    public static TabCustomNewNavBinding bind(View object) {
        int n3 = R$id.bottom_indicator;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            n3 = R$id.tab_count_tv;
            Object object3 = view2 = dd2_2.a(n3, object);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.tab_icon;
                Object object4 = view2 = dd2_2.a(n3, object);
                object4 = (AjioAspectRatioImageView)view2;
                if (object4 != null) {
                    n3 = R$id.tab_title;
                    Object object5 = view2 = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        view2 = object;
                        object = new TabCustomNewNavBinding((ConstraintLayout)((Object)object2), view, (ConstraintLayout)((Object)object2), (AjioTextView)object3, (AjioAspectRatioImageView)((Object)object4), (AjioTextView)object5);
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

    public static TabCustomNewNavBinding inflate(LayoutInflater layoutInflater) {
        return TabCustomNewNavBinding.inflate(layoutInflater, null, false);
    }

    public static TabCustomNewNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.tab_custom_new_nav;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TabCustomNewNavBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

