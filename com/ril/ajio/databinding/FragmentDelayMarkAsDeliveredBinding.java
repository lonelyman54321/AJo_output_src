/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentDelayMarkAsDeliveredBinding
implements BC3 {
    public final ImageView fdmadIvClose;
    public final TextView fdmadTvMsg;
    public final TextView fdmadTvOk;
    public final TextView fdmadTvTitle;
    private final ConstraintLayout rootView;

    private FragmentDelayMarkAsDeliveredBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.fdmadIvClose = imageView;
        this.fdmadTvMsg = textView;
        this.fdmadTvOk = textView2;
        this.fdmadTvTitle = textView3;
    }

    public static FragmentDelayMarkAsDeliveredBinding bind(View object) {
        View view;
        int n3 = R$id.fdmadIvClose;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.fdmadTvMsg;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.fdmadTvOk;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.fdmadTvTitle;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        FragmentDelayMarkAsDeliveredBinding fragmentDelayMarkAsDeliveredBinding = new FragmentDelayMarkAsDeliveredBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return fragmentDelayMarkAsDeliveredBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentDelayMarkAsDeliveredBinding inflate(LayoutInflater layoutInflater) {
        return FragmentDelayMarkAsDeliveredBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentDelayMarkAsDeliveredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_delay_mark_as_delivered;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentDelayMarkAsDeliveredBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

