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
import com.ril.ajio.customviews.widgets.LuxeUnderLineTextView;

public final class LuxeLayoutAddressBlockBinding
implements BC3 {
    public final Guideline labBarrier;
    public final Space labDeleteSpace;
    public final LinearLayout labLayout;
    public final RadioButton labRbSelection;
    public final TextView labTvAddress;
    public final TextView labTvDefault;
    public final LuxeUnderLineTextView labTvDelete;
    public final LuxeUnderLineTextView labTvEdit;
    public final LuxeUnderLineTextView labTvMarkDefault;
    public final TextView labTvName;
    public final TextView labTvPhone;
    public final TextView labTvPhoneHeader;
    public final TextView labTvSectionHeader;
    public final View labVSep;
    private final LinearLayout rootView;

    private LuxeLayoutAddressBlockBinding(LinearLayout linearLayout, Guideline guideline, Space space, LinearLayout linearLayout2, RadioButton radioButton, TextView textView, TextView textView2, LuxeUnderLineTextView luxeUnderLineTextView, LuxeUnderLineTextView luxeUnderLineTextView2, LuxeUnderLineTextView luxeUnderLineTextView3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.rootView = linearLayout;
        this.labBarrier = guideline;
        this.labDeleteSpace = space;
        this.labLayout = linearLayout2;
        this.labRbSelection = radioButton;
        this.labTvAddress = textView;
        this.labTvDefault = textView2;
        this.labTvDelete = luxeUnderLineTextView;
        this.labTvEdit = luxeUnderLineTextView2;
        this.labTvMarkDefault = luxeUnderLineTextView3;
        this.labTvName = textView3;
        this.labTvPhone = textView4;
        this.labTvPhoneHeader = textView5;
        this.labTvSectionHeader = textView6;
        this.labVSep = view;
    }

    public static LuxeLayoutAddressBlockBinding bind(View view) {
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
                            Object object2 = view2 = dd2_2.a(n3, view);
                            object2 = (LuxeUnderLineTextView)view2;
                            if (object2 != null) {
                                n3 = R$id.labTvEdit;
                                Object object3 = view2 = dd2_2.a(n3, view);
                                object3 = (LuxeUnderLineTextView)view2;
                                if (object3 != null) {
                                    n3 = R$id.labTvMarkDefault;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (LuxeUnderLineTextView)view2;
                                    if (object4 != null) {
                                        n3 = R$id.labTvName;
                                        View view9 = view2 = dd2_2.a(n3, view);
                                        view9 = (TextView)view2;
                                        if (view9 != null) {
                                            n3 = R$id.labTvPhone;
                                            View view10 = view2 = dd2_2.a(n3, view);
                                            view10 = (TextView)view2;
                                            if (view10 != null) {
                                                n3 = R$id.labTvPhoneHeader;
                                                View view11 = view2 = dd2_2.a(n3, view);
                                                view11 = (TextView)view2;
                                                if (view11 != null) {
                                                    View view12;
                                                    n3 = R$id.labTvSectionHeader;
                                                    View view13 = view2 = dd2_2.a(n3, view);
                                                    view13 = (TextView)view2;
                                                    if (view13 != null && (view12 = dd2_2.a(n3 = R$id.labVSep, view)) != null) {
                                                        object = new LuxeLayoutAddressBlockBinding((LinearLayout)view5, (Guideline)view3, (Space)view4, (LinearLayout)view5, (RadioButton)view6, (TextView)view7, (TextView)view8, (LuxeUnderLineTextView)object2, (LuxeUnderLineTextView)object3, (LuxeUnderLineTextView)object4, (TextView)view9, (TextView)view10, (TextView)view11, (TextView)view13, view12);
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

    public static LuxeLayoutAddressBlockBinding inflate(LayoutInflater layoutInflater) {
        return LuxeLayoutAddressBlockBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeLayoutAddressBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_layout_address_block;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeLayoutAddressBlockBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

