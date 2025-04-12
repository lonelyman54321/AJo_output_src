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

public final class FragmentResetAddressConfirmationLuxeBinding
implements BC3 {
    public final ImageView fracrIvClose;
    public final LinearLayout fracrLayoutContent;
    public final TextView fracrTvCancel;
    public final TextView fracrTvReset;
    public final View fracrVClose;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;

    private FragmentResetAddressConfirmationLuxeBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, View view, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.fracrIvClose = imageView;
        this.fracrLayoutContent = linearLayout;
        this.fracrTvCancel = textView;
        this.fracrTvReset = textView2;
        this.fracrVClose = view;
        this.parentLayout = constraintLayout2;
    }

    public static FragmentResetAddressConfirmationLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.fracrIvClose;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.fracrLayoutContent;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.fracrTvCancel;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    View view5;
                    n3 = R$id.fracrTvReset;
                    View view6 = view = dd2_2.a(n3, object);
                    view6 = (TextView)view;
                    if (view6 != null && (view5 = dd2_2.a(n3 = R$id.fracrVClose, object)) != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        object = new FragmentResetAddressConfirmationLuxeBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (LinearLayout)view3, (TextView)view4, (TextView)view6, view5, (ConstraintLayout)((Object)object2));
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

    public static FragmentResetAddressConfirmationLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentResetAddressConfirmationLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentResetAddressConfirmationLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_reset_address_confirmation_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentResetAddressConfirmationLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

