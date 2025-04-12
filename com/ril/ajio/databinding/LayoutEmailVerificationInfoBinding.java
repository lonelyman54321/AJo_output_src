/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$layout;

public final class LayoutEmailVerificationInfoBinding
implements BC3 {
    private final ConstraintLayout rootView;

    private LayoutEmailVerificationInfoBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    public static LayoutEmailVerificationInfoBinding bind(View object) {
        if (object != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutEmailVerificationInfoBinding layoutEmailVerificationInfoBinding = new LayoutEmailVerificationInfoBinding((ConstraintLayout)((Object)object));
            return layoutEmailVerificationInfoBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutEmailVerificationInfoBinding inflate(LayoutInflater layoutInflater) {
        return LayoutEmailVerificationInfoBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutEmailVerificationInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_email_verification_info;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutEmailVerificationInfoBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

