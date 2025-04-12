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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FreebieFreeTagBinding
implements BC3 {
    public final ConstraintLayout freeTagLyt;
    public final AjioTextView freeTagText;
    private final ConstraintLayout rootView;

    private FreebieFreeTagBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.freeTagLyt = constraintLayout2;
        this.freeTagText = ajioTextView;
    }

    public static FreebieFreeTagBinding bind(View object) {
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.freeTagText;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = new FreebieFreeTagBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static FreebieFreeTagBinding inflate(LayoutInflater layoutInflater) {
        return FreebieFreeTagBinding.inflate(layoutInflater, null, false);
    }

    public static FreebieFreeTagBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.freebie_free_tag;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FreebieFreeTagBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

