/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ActivityFsInitBinding
implements BC3 {
    public final TextView afiTvDesc;
    public final TextView afiTvTitle;
    public final View fsInitAlpha;
    public final TextView fsInitBtn;
    public final LinearLayout fsInitDialogContainer;
    private final ConstraintLayout rootView;

    private ActivityFsInitBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, TextView textView3, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.afiTvDesc = textView;
        this.afiTvTitle = textView2;
        this.fsInitAlpha = view;
        this.fsInitBtn = textView3;
        this.fsInitDialogContainer = linearLayout;
    }

    public static ActivityFsInitBinding bind(View object) {
        View view;
        int n3 = R$id.afiTvDesc;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            View view3;
            n3 = R$id.afiTvTitle;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (TextView)view;
            if (view4 != null && (view3 = dd2_2.a(n3 = R$id.fsInitAlpha, object)) != null) {
                n3 = R$id.fsInitBtn;
                View view5 = view = dd2_2.a(n3, object);
                view5 = (TextView)view;
                if (view5 != null) {
                    n3 = R$id.fsInitDialogContainer;
                    View view6 = view = dd2_2.a(n3, object);
                    view6 = (LinearLayout)view;
                    if (view6 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        ActivityFsInitBinding activityFsInitBinding = new ActivityFsInitBinding((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view4, view3, (TextView)view5, (LinearLayout)view6);
                        return activityFsInitBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityFsInitBinding inflate(LayoutInflater layoutInflater) {
        return ActivityFsInitBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityFsInitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_fs_init;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityFsInitBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

