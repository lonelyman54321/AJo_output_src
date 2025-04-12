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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentEligibleReturnBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView okayBtn;
    private final ConstraintLayout rootView;
    public final AjioTextView tvCreateReturn;
    public final AjioTextView tvDescription1;
    public final AjioTextView tvDescription2;
    public final AjioTextView tvHeading1;
    public final AjioTextView tvHeading2;

    private FragmentEligibleReturnBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.okayBtn = textView;
        this.tvCreateReturn = ajioTextView;
        this.tvDescription1 = ajioTextView2;
        this.tvDescription2 = ajioTextView3;
        this.tvHeading1 = ajioTextView4;
        this.tvHeading2 = ajioTextView5;
    }

    public static FragmentEligibleReturnBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.okayBtn;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.tvCreateReturn;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioTextView)view;
                    if (object2 != null) {
                        n3 = R$id.tvDescription1;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.tvDescription2;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                n3 = R$id.tvHeading1;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.tvHeading2;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (AjioTextView)view;
                                    if (object6 != null) {
                                        Object object7 = object;
                                        object7 = (ConstraintLayout)((Object)object);
                                        FragmentEligibleReturnBinding fragmentEligibleReturnBinding = new FragmentEligibleReturnBinding((ConstraintLayout)((Object)object7), (ImageView)view2, (FrameLayout)view3, (TextView)view4, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                                        return fragmentEligibleReturnBinding;
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

    public static FragmentEligibleReturnBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEligibleReturnBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEligibleReturnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_eligible_return;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEligibleReturnBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

