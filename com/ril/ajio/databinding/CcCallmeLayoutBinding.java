/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;

public final class CcCallmeLayoutBinding
implements BC3 {
    public final AjioButton ccCallmeBtnDone;
    private final FrameLayout rootView;

    private CcCallmeLayoutBinding(FrameLayout frameLayout, AjioButton ajioButton) {
        this.rootView = frameLayout;
        this.ccCallmeBtnDone = ajioButton;
    }

    public static CcCallmeLayoutBinding bind(View object) {
        int n3 = R$id.cc_callme_btn_done;
        AjioButton ajioButton = (AjioButton)dd2_2.a(n3, object);
        if (ajioButton != null) {
            object = (FrameLayout)object;
            CcCallmeLayoutBinding ccCallmeLayoutBinding = new CcCallmeLayoutBinding((FrameLayout)object, ajioButton);
            return ccCallmeLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CcCallmeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CcCallmeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static CcCallmeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cc_callme_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CcCallmeLayoutBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

