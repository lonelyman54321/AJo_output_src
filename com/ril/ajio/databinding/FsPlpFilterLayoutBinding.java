/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FsPlpFilterLayoutBinding
implements BC3 {
    public final ConstraintLayout fsFilterBtn1;
    public final Button fsFilterBtn11;
    public final ConstraintLayout fsFilterBtn2;
    public final Button fsFilterBtn21;
    public final ConstraintLayout fsFilterBtn3;
    public final Button fsFilterBtn31;
    public final View fsFilterDivider1;
    public final View fsFilterDivider2;
    public final Guideline fsFilterGuideline1;
    public final Guideline fsFilterGuideline2;
    public final View fsFilterIndicator1;
    public final View fsFilterIndicator2;
    public final View fsFilterIndicator3;
    private final ConstraintLayout rootView;

    private FsPlpFilterLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, ConstraintLayout constraintLayout3, Button button2, ConstraintLayout constraintLayout4, Button button3, View view, View view2, Guideline guideline, Guideline guideline2, View view3, View view4, View view5) {
        this.rootView = constraintLayout;
        this.fsFilterBtn1 = constraintLayout2;
        this.fsFilterBtn11 = button;
        this.fsFilterBtn2 = constraintLayout3;
        this.fsFilterBtn21 = button2;
        this.fsFilterBtn3 = constraintLayout4;
        this.fsFilterBtn31 = button3;
        this.fsFilterDivider1 = view;
        this.fsFilterDivider2 = view2;
        this.fsFilterGuideline1 = guideline;
        this.fsFilterGuideline2 = guideline2;
        this.fsFilterIndicator1 = view3;
        this.fsFilterIndicator2 = view4;
        this.fsFilterIndicator3 = view5;
    }

    public static FsPlpFilterLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.fs_filter_btn_1;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (ConstraintLayout)view2;
        if (object2 != null) {
            n3 = R$id.fsFilterBtn1;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (Button)view2;
            if (view3 != null) {
                n3 = R$id.fs_filter_btn_2;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (ConstraintLayout)view2;
                if (object3 != null) {
                    n3 = R$id.fsFilterBtn2;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (Button)view2;
                    if (view4 != null) {
                        n3 = R$id.fs_filter_btn_3;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (ConstraintLayout)view2;
                        if (object4 != null) {
                            View view5;
                            View view6;
                            n3 = R$id.fsFilterBtn3;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (Button)view2;
                            if (view7 != null && (view6 = dd2_2.a(n3 = R$id.fs_filter_divider_1, view)) != null && (view5 = dd2_2.a(n3 = R$id.fs_filter_divider_2, view)) != null) {
                                n3 = R$id.fs_filter_guideline_1;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (Guideline)view2;
                                if (view8 != null) {
                                    View view9;
                                    View view10;
                                    View view11;
                                    n3 = R$id.fs_filter_guideline_2;
                                    View view12 = view2 = dd2_2.a(n3, view);
                                    view12 = (Guideline)view2;
                                    if (view12 != null && (view11 = dd2_2.a(n3 = R$id.fsFilterIndicator1, view)) != null && (view10 = dd2_2.a(n3 = R$id.fsFilterIndicator2, view)) != null && (view9 = dd2_2.a(n3 = R$id.fsFilterIndicator3, view)) != null) {
                                        Object object5 = view;
                                        object5 = (ConstraintLayout)view;
                                        FsPlpFilterLayoutBinding fsPlpFilterLayoutBinding = new FsPlpFilterLayoutBinding((ConstraintLayout)((Object)object5), (ConstraintLayout)((Object)object2), (Button)view3, (ConstraintLayout)((Object)object3), (Button)view4, (ConstraintLayout)((Object)object4), (Button)view7, view6, view5, (Guideline)view8, (Guideline)view12, view11, view10, view9);
                                        return fsPlpFilterLayoutBinding;
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

    public static FsPlpFilterLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FsPlpFilterLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FsPlpFilterLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fs_plp_filter_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FsPlpFilterLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

