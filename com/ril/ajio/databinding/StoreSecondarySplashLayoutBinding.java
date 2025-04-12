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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class StoreSecondarySplashLayoutBinding
implements BC3 {
    public final ImageView coachIcon;
    public final View coachMarkDownArrow;
    public final ConstraintLayout coachMarkLyt;
    public final TextView coachMarkSubTitleTxt;
    public final TextView coachMarkTitleTxt;
    public final LinearLayout coachMarkView;
    public final CircularProgressIndicator progressBar;
    public final ConstraintLayout progressLyt;
    public final TextView progressTxt;
    private final ConstraintLayout rootView;
    public final ImageView splashImg;
    public final ConstraintLayout splashLayout;

    private StoreSecondarySplashLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, ConstraintLayout constraintLayout3, TextView textView3, ImageView imageView2, ConstraintLayout constraintLayout4) {
        this.rootView = constraintLayout;
        this.coachIcon = imageView;
        this.coachMarkDownArrow = view;
        this.coachMarkLyt = constraintLayout2;
        this.coachMarkSubTitleTxt = textView;
        this.coachMarkTitleTxt = textView2;
        this.coachMarkView = linearLayout;
        this.progressBar = circularProgressIndicator;
        this.progressLyt = constraintLayout3;
        this.progressTxt = textView3;
        this.splashImg = imageView2;
        this.splashLayout = constraintLayout4;
    }

    public static StoreSecondarySplashLayoutBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.coach_icon;
        View view3 = view2 = dd2_2.a(n3, object);
        view3 = (ImageView)view2;
        if (view3 != null && (view = dd2_2.a(n3 = R$id.coach_mark_down_arrow, object)) != null) {
            n3 = R$id.coach_mark_lyt;
            Object object2 = view2 = dd2_2.a(n3, object);
            object2 = (ConstraintLayout)view2;
            if (object2 != null) {
                n3 = R$id.coach_mark_sub_title_txt;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (TextView)view2;
                if (view4 != null) {
                    n3 = R$id.coach_mark_title_txt;
                    View view5 = view2 = dd2_2.a(n3, object);
                    view5 = (TextView)view2;
                    if (view5 != null) {
                        n3 = R$id.coach_mark_view;
                        View view6 = view2 = dd2_2.a(n3, object);
                        view6 = (LinearLayout)view2;
                        if (view6 != null) {
                            n3 = R$id.progress_bar;
                            Object object3 = view2 = dd2_2.a(n3, object);
                            object3 = (CircularProgressIndicator)view2;
                            if (object3 != null) {
                                n3 = R$id.progress_lyt;
                                Object object4 = view2 = dd2_2.a(n3, object);
                                object4 = (ConstraintLayout)view2;
                                if (object4 != null) {
                                    n3 = R$id.progress_txt;
                                    View view7 = view2 = dd2_2.a(n3, object);
                                    view7 = (TextView)view2;
                                    if (view7 != null) {
                                        n3 = R$id.splash_img;
                                        View view8 = view2 = dd2_2.a(n3, object);
                                        view8 = (ImageView)view2;
                                        if (view8 != null) {
                                            n3 = R$id.splash_layout;
                                            Object object5 = view2 = dd2_2.a(n3, object);
                                            object5 = (ConstraintLayout)view2;
                                            if (object5 != null) {
                                                Object object6 = object;
                                                object6 = (ConstraintLayout)((Object)object);
                                                StoreSecondarySplashLayoutBinding storeSecondarySplashLayoutBinding = new StoreSecondarySplashLayoutBinding((ConstraintLayout)((Object)object6), (ImageView)view3, view, (ConstraintLayout)((Object)object2), (TextView)view4, (TextView)view5, (LinearLayout)view6, (CircularProgressIndicator)((Object)object3), (ConstraintLayout)((Object)object4), (TextView)view7, (ImageView)view8, (ConstraintLayout)((Object)object5));
                                                return storeSecondarySplashLayoutBinding;
                                            }
                                        }
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

    public static StoreSecondarySplashLayoutBinding inflate(LayoutInflater layoutInflater) {
        return StoreSecondarySplashLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static StoreSecondarySplashLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.store_secondary_splash_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return StoreSecondarySplashLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

