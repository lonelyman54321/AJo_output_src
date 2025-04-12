/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShBreakupBottomsheetBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView cash;
    public final TextView cashTxt;
    public final LinearLayout parentLayout;
    public final TextView point;
    public final TextView pointTxt;
    private final LinearLayout rootView;
    public final TextView totalSpent;

    private ShBreakupBottomsheetBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.cash = textView;
        this.cashTxt = textView2;
        this.parentLayout = linearLayout2;
        this.point = textView3;
        this.pointTxt = textView4;
        this.totalSpent = textView5;
    }

    public static ShBreakupBottomsheetBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.cash;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.cash_txt;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        n3 = R$id.point;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.point_txt;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.totalSpent;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (TextView)view;
                                if (view8 != null) {
                                    object = new ShBreakupBottomsheetBinding((LinearLayout)object2, (ImageView)view2, (FrameLayout)view3, (TextView)view4, (TextView)view5, (LinearLayout)object2, (TextView)view6, (TextView)view7, (TextView)view8);
                                    return object;
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

    public static ShBreakupBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return ShBreakupBottomsheetBinding.inflate(layoutInflater, null, false);
    }

    public static ShBreakupBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.sh_breakup_bottomsheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShBreakupBottomsheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

