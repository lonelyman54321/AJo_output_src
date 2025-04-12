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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentShoppingAssistnatBottomSheetBinding
implements BC3 {
    public final AppCompatImageView appCompatImageView;
    public final ImageView helplineCancelIv;
    public final FrameLayout helplineCancelView;
    public final TextView helplineNo1;
    public final TextView helplineNo2;
    private final ConstraintLayout rootView;
    public final TextView textView5;
    public final TextView textView6;
    public final TextView textView7;
    public final TextView timeText;
    public final View view;
    public final View view15;

    private FragmentShoppingAssistnatBottomSheetBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view, View view2) {
        this.rootView = constraintLayout;
        this.appCompatImageView = appCompatImageView;
        this.helplineCancelIv = imageView;
        this.helplineCancelView = frameLayout;
        this.helplineNo1 = textView;
        this.helplineNo2 = textView2;
        this.textView5 = textView3;
        this.textView6 = textView4;
        this.textView7 = textView5;
        this.timeText = textView6;
        this.view = view;
        this.view15 = view2;
    }

    public static FragmentShoppingAssistnatBottomSheetBinding bind(View object) {
        View view;
        int n3 = R$id.appCompatImageView;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.helpline_cancel_iv;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.helpline_cancel_view;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (FrameLayout)view;
                if (view3 != null) {
                    n3 = R$id.helpline_no_1;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.helpline_no_2;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            n3 = R$id.textView5;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                n3 = R$id.textView6;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (TextView)view;
                                if (view7 != null) {
                                    n3 = R$id.textView7;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (TextView)view;
                                    if (view8 != null) {
                                        View view9;
                                        View view10;
                                        n3 = R$id.time_text;
                                        View view11 = view = dd2_2.a(n3, object);
                                        view11 = (TextView)view;
                                        if (view11 != null && (view10 = dd2_2.a(n3 = R$id.view, object)) != null && (view9 = dd2_2.a(n3 = R$id.view15, object)) != null) {
                                            Object object3 = object;
                                            object3 = (ConstraintLayout)((Object)object);
                                            FragmentShoppingAssistnatBottomSheetBinding fragmentShoppingAssistnatBottomSheetBinding = new FragmentShoppingAssistnatBottomSheetBinding((ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object2), (ImageView)view2, (FrameLayout)view3, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (TextView)view11, view10, view9);
                                            return fragmentShoppingAssistnatBottomSheetBinding;
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

    public static FragmentShoppingAssistnatBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentShoppingAssistnatBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentShoppingAssistnatBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_shopping_assistnat_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentShoppingAssistnatBottomSheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

