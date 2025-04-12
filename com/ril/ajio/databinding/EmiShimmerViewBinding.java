/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class EmiShimmerViewBinding
implements BC3 {
    public final LinearLayout fifthView;
    public final LinearLayout firstView;
    public final LinearLayout fourthView;
    private final LinearLayout rootView;
    public final LinearLayout secondView;
    public final LinearLayout thirdView;

    private EmiShimmerViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6) {
        this.rootView = linearLayout;
        this.fifthView = linearLayout2;
        this.firstView = linearLayout3;
        this.fourthView = linearLayout4;
        this.secondView = linearLayout5;
        this.thirdView = linearLayout6;
    }

    public static EmiShimmerViewBinding bind(View object) {
        View view;
        int n3 = R$id.fifth_view;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.first_view;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.fourth_view;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n3 = R$id.second_view;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (LinearLayout)view;
                    if (view5 != null) {
                        n3 = R$id.third_view;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (LinearLayout)view;
                        if (view6 != null) {
                            Object object2 = object;
                            object2 = (LinearLayout)object;
                            EmiShimmerViewBinding emiShimmerViewBinding = new EmiShimmerViewBinding((LinearLayout)object2, (LinearLayout)view2, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (LinearLayout)view6);
                            return emiShimmerViewBinding;
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

    public static EmiShimmerViewBinding inflate(LayoutInflater layoutInflater) {
        return EmiShimmerViewBinding.inflate(layoutInflater, null, false);
    }

    public static EmiShimmerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.emi_shimmer_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmiShimmerViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

