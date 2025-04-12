/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.Space
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutAddressBlockBinding
implements BC3 {
    public final Guideline labBarrier;
    public final Space labDeleteSpace;
    public final LinearLayout labLayout;
    public final RadioButton labRbSelection;
    public final TextView labTvAddress;
    public final TextView labTvDefault;
    public final TextView labTvDelete;
    public final TextView labTvEdit;
    public final TextView labTvMarkDefault;
    public final TextView labTvName;
    public final TextView labTvPhone;
    public final TextView labTvPhoneHeader;
    public final TextView labTvSectionHeader;
    public final View labVSep;
    private final LinearLayout rootView;

    private LayoutAddressBlockBinding(LinearLayout linearLayout, Guideline guideline, Space space, LinearLayout linearLayout2, RadioButton radioButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, View view) {
        this.rootView = linearLayout;
        this.labBarrier = guideline;
        this.labDeleteSpace = space;
        this.labLayout = linearLayout2;
        this.labRbSelection = radioButton;
        this.labTvAddress = textView;
        this.labTvDefault = textView2;
        this.labTvDelete = textView3;
        this.labTvEdit = textView4;
        this.labTvMarkDefault = textView5;
        this.labTvName = textView6;
        this.labTvPhone = textView7;
        this.labTvPhoneHeader = textView8;
        this.labTvSectionHeader = textView9;
        this.labVSep = view;
    }

    public static LayoutAddressBlockBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.labBarrier;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Guideline)view2;
        if (view3 != null) {
            n3 = R$id.labDeleteSpace;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (Space)view2;
            if (view4 != null) {
                View view5 = view;
                view5 = (LinearLayout)view;
                n3 = R$id.labRbSelection;
                View view6 = view2 = dd2_2.a(n3, view);
                view6 = (RadioButton)view2;
                if (view6 != null) {
                    n3 = R$id.labTvAddress;
                    View view7 = view2 = dd2_2.a(n3, view);
                    view7 = (TextView)view2;
                    if (view7 != null) {
                        n3 = R$id.labTvDefault;
                        View view8 = view2 = dd2_2.a(n3, view);
                        view8 = (TextView)view2;
                        if (view8 != null) {
                            n3 = R$id.labTvDelete;
                            View view9 = view2 = dd2_2.a(n3, view);
                            view9 = (TextView)view2;
                            if (view9 != null) {
                                n3 = R$id.labTvEdit;
                                View view10 = view2 = dd2_2.a(n3, view);
                                view10 = (TextView)view2;
                                if (view10 != null) {
                                    n3 = R$id.labTvMarkDefault;
                                    View view11 = view2 = dd2_2.a(n3, view);
                                    view11 = (TextView)view2;
                                    if (view11 != null) {
                                        n3 = R$id.labTvName;
                                        View view12 = view2 = dd2_2.a(n3, view);
                                        view12 = (TextView)view2;
                                        if (view12 != null) {
                                            n3 = R$id.labTvPhone;
                                            View view13 = view2 = dd2_2.a(n3, view);
                                            view13 = (TextView)view2;
                                            if (view13 != null) {
                                                n3 = R$id.labTvPhoneHeader;
                                                View view14 = view2 = dd2_2.a(n3, view);
                                                view14 = (TextView)view2;
                                                if (view14 != null) {
                                                    View view15;
                                                    n3 = R$id.labTvSectionHeader;
                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                    view16 = (TextView)view2;
                                                    if (view16 != null && (view15 = dd2_2.a(n3 = R$id.labVSep, view)) != null) {
                                                        object = new LayoutAddressBlockBinding((LinearLayout)view5, (Guideline)view3, (Space)view4, (LinearLayout)view5, (RadioButton)view6, (TextView)view7, (TextView)view8, (TextView)view9, (TextView)view10, (TextView)view11, (TextView)view12, (TextView)view13, (TextView)view14, (TextView)view16, view15);
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
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutAddressBlockBinding inflate(LayoutInflater layoutInflater) {
        return LayoutAddressBlockBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutAddressBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_address_block;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutAddressBlockBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

