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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentAttachBottomSheetBinding
implements BC3 {
    public final TextView cameraTv;
    public final TextView cancelTv;
    public final TextView photosTv;
    private final LinearLayout rootView;

    private FragmentAttachBottomSheetBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.cameraTv = textView;
        this.cancelTv = textView2;
        this.photosTv = textView3;
    }

    public static FragmentAttachBottomSheetBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.camera_tv;
        TextView textView3 = (TextView)dd2_2.a(n3, object);
        if (textView3 != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.cancel_tv, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.photos_tv, object)) != null) {
            object = (LinearLayout)object;
            FragmentAttachBottomSheetBinding fragmentAttachBottomSheetBinding = new FragmentAttachBottomSheetBinding((LinearLayout)object, textView3, textView2, textView);
            return fragmentAttachBottomSheetBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentAttachBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAttachBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAttachBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_attach_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAttachBottomSheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

