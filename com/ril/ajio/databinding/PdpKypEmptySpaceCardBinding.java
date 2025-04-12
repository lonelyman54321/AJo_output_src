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

public final class PdpKypEmptySpaceCardBinding
implements BC3 {
    public final ConstraintLayout clEmptySpaceKyp;
    private final ConstraintLayout rootView;

    private PdpKypEmptySpaceCardBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.clEmptySpaceKyp = constraintLayout2;
    }

    public static PdpKypEmptySpaceCardBinding bind(View object) {
        if (object != null) {
            object = (ConstraintLayout)((Object)object);
            PdpKypEmptySpaceCardBinding pdpKypEmptySpaceCardBinding = new PdpKypEmptySpaceCardBinding((ConstraintLayout)((Object)object), (ConstraintLayout)((Object)object));
            return pdpKypEmptySpaceCardBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PdpKypEmptySpaceCardBinding inflate(LayoutInflater layoutInflater) {
        return PdpKypEmptySpaceCardBinding.inflate(layoutInflater, null, false);
    }

    public static PdpKypEmptySpaceCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_kyp_empty_space_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpKypEmptySpaceCardBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

