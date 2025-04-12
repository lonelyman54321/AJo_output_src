/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentDeleteAddressBinding
implements BC3 {
    public final ImageView fdaIvClose;
    public final LinearLayout fdaLayoutContent;
    public final TextView fdaTvDeleteAddress;
    public final View fdaVClose;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;

    private FragmentDeleteAddressBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, View view, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.fdaIvClose = imageView;
        this.fdaLayoutContent = linearLayout;
        this.fdaTvDeleteAddress = textView;
        this.fdaVClose = view;
        this.parentLayout = constraintLayout2;
    }

    public static FragmentDeleteAddressBinding bind(View object) {
        View view;
        int n3 = R$id.fdaIvClose;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.fdaLayoutContent;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                View view4;
                n3 = R$id.fdaTvDeleteAddress;
                View view5 = view = dd2_2.a(n3, object);
                view5 = (TextView)view;
                if (view5 != null && (view4 = dd2_2.a(n3 = R$id.fdaVClose, object)) != null) {
                    Object object2 = object;
                    object2 = (ConstraintLayout)((Object)object);
                    object = new FragmentDeleteAddressBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (LinearLayout)view3, (TextView)view5, view4, (ConstraintLayout)((Object)object2));
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentDeleteAddressBinding inflate(LayoutInflater layoutInflater) {
        return FragmentDeleteAddressBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentDeleteAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_delete_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentDeleteAddressBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

