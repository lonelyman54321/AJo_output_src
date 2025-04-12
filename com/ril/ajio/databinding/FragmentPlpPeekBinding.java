/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentPlpPeekBinding
implements BC3 {
    public final CardView fppImageCardLayout;
    public final AppCompatImageView fppIvAddToCloset;
    public final AppCompatImageView fppIvAddToClosetSuccess;
    public final AppCompatImageView fppIvImage;
    public final AppCompatImageView fppIvShare;
    public final ConstraintLayout fppLayoutParent;
    public final CardView fppOptionsCardLayout;
    public final ProgressBar fppPbClosetLoading;
    public final TextView fppTvAddToCloset;
    public final TextView fppTvShare;
    public final View fppVOptionsSep;
    public final View fppVSep;
    private final ConstraintLayout rootView;

    private FragmentPlpPeekBinding(ConstraintLayout constraintLayout, CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, ConstraintLayout constraintLayout2, CardView cardView2, ProgressBar progressBar, TextView textView, TextView textView2, View view, View view2) {
        this.rootView = constraintLayout;
        this.fppImageCardLayout = cardView;
        this.fppIvAddToCloset = appCompatImageView;
        this.fppIvAddToClosetSuccess = appCompatImageView2;
        this.fppIvImage = appCompatImageView3;
        this.fppIvShare = appCompatImageView4;
        this.fppLayoutParent = constraintLayout2;
        this.fppOptionsCardLayout = cardView2;
        this.fppPbClosetLoading = progressBar;
        this.fppTvAddToCloset = textView;
        this.fppTvShare = textView2;
        this.fppVOptionsSep = view;
        this.fppVSep = view2;
    }

    public static FragmentPlpPeekBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.fppImageCardLayout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (CardView)view2;
        if (object2 != null) {
            n3 = R$id.fppIvAddToCloset;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppCompatImageView)view2;
            if (object3 != null) {
                n3 = R$id.fppIvAddToClosetSuccess;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AppCompatImageView)view2;
                if (object4 != null) {
                    n3 = R$id.fppIvImage;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AppCompatImageView)view2;
                    if (object5 != null) {
                        n3 = R$id.fppIvShare;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AppCompatImageView)view2;
                        if (object6 != null) {
                            Object object7 = view;
                            object7 = (ConstraintLayout)view;
                            n3 = R$id.fppOptionsCardLayout;
                            Object object8 = view2 = dd2_2.a(n3, view);
                            object8 = (CardView)view2;
                            if (object8 != null) {
                                n3 = R$id.fppPbClosetLoading;
                                View view3 = view2 = dd2_2.a(n3, view);
                                view3 = (ProgressBar)view2;
                                if (view3 != null) {
                                    n3 = R$id.fppTvAddToCloset;
                                    View view4 = view2 = dd2_2.a(n3, view);
                                    view4 = (TextView)view2;
                                    if (view4 != null) {
                                        View view5;
                                        View view6;
                                        n3 = R$id.fppTvShare;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (TextView)view2;
                                        if (view7 != null && (view6 = dd2_2.a(n3 = R$id.fppVOptionsSep, view)) != null && (view5 = dd2_2.a(n3 = R$id.fppVSep, view)) != null) {
                                            object = new FragmentPlpPeekBinding((ConstraintLayout)((Object)object7), (CardView)((Object)object2), (AppCompatImageView)((Object)object3), (AppCompatImageView)((Object)object4), (AppCompatImageView)((Object)object5), (AppCompatImageView)((Object)object6), (ConstraintLayout)((Object)object7), (CardView)((Object)object8), (ProgressBar)view3, (TextView)view4, (TextView)view7, view6, view5);
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
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentPlpPeekBinding inflate(LayoutInflater layoutInflater) {
        return FragmentPlpPeekBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentPlpPeekBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_plp_peek;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentPlpPeekBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

