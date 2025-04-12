/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutSharedWithMeListItemBinding
implements BC3 {
    public final FrameLayout lswmliParentLayout;
    public final TextView lswmliTvDate;
    public final TextView lswmliTvSharedOn;
    public final TextView lswmliTvTitle;
    public final TextView lswmliTvView;
    private final FrameLayout rootView;

    private LayoutSharedWithMeListItemBinding(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.lswmliParentLayout = frameLayout2;
        this.lswmliTvDate = textView;
        this.lswmliTvSharedOn = textView2;
        this.lswmliTvTitle = textView3;
        this.lswmliTvView = textView4;
    }

    public static LayoutSharedWithMeListItemBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (FrameLayout)object;
        int n3 = R$id.lswmliTvDate;
        View view3 = view = dd2_2.a(n3, object);
        view3 = (TextView)view;
        if (view3 != null) {
            n3 = R$id.lswmliTvSharedOn;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (TextView)view;
            if (view4 != null) {
                n3 = R$id.lswmliTvTitle;
                View view5 = view = dd2_2.a(n3, object);
                view5 = (TextView)view;
                if (view5 != null) {
                    n3 = R$id.lswmliTvView;
                    View view6 = view = dd2_2.a(n3, object);
                    view6 = (TextView)view;
                    if (view6 != null) {
                        Object object2 = object;
                        view = view2;
                        object = new LayoutSharedWithMeListItemBinding((FrameLayout)view2, (FrameLayout)view2, (TextView)view3, (TextView)view4, (TextView)view5, (TextView)view6);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSharedWithMeListItemBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSharedWithMeListItemBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSharedWithMeListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_shared_with_me_list_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSharedWithMeListItemBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

