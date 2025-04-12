/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RadioGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentSlpFeedbackBinding
implements BC3 {
    public final RadioGroup fsfRgOptions;
    public final TextView fsfTvDismiss;
    public final TextView fsfTvHeader;
    public final TextView fsfTvSubmit;
    public final View fsfVSep;
    private final ConstraintLayout rootView;

    private FragmentSlpFeedbackBinding(ConstraintLayout constraintLayout, RadioGroup radioGroup, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = constraintLayout;
        this.fsfRgOptions = radioGroup;
        this.fsfTvDismiss = textView;
        this.fsfTvHeader = textView2;
        this.fsfTvSubmit = textView3;
        this.fsfVSep = view;
    }

    public static FragmentSlpFeedbackBinding bind(View object) {
        View view;
        int n3 = R$id.fsf_rg_options;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RadioGroup)view;
        if (view2 != null) {
            n3 = R$id.fsf_tv_dismiss;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.fsf_tv_header;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    View view5;
                    n3 = R$id.fsf_tv_submit;
                    View view6 = view = dd2_2.a(n3, object);
                    view6 = (TextView)view;
                    if (view6 != null && (view5 = dd2_2.a(n3 = R$id.fsf_v_sep, object)) != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        FragmentSlpFeedbackBinding fragmentSlpFeedbackBinding = new FragmentSlpFeedbackBinding((ConstraintLayout)((Object)object2), (RadioGroup)view2, (TextView)view3, (TextView)view4, (TextView)view6, view5);
                        return fragmentSlpFeedbackBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentSlpFeedbackBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSlpFeedbackBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSlpFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_slp_feedback;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSlpFeedbackBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

