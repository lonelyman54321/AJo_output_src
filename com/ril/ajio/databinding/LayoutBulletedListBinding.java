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
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutBulletedListBinding
implements BC3 {
    private final LinearLayoutCompat rootView;
    public final AjioTextView tvDescription;

    private LayoutBulletedListBinding(LinearLayoutCompat linearLayoutCompat, AjioTextView ajioTextView) {
        this.rootView = linearLayoutCompat;
        this.tvDescription = ajioTextView;
    }

    public static LayoutBulletedListBinding bind(View object) {
        int n3 = R$id.tvDescription;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayoutCompat)((Object)object);
            LayoutBulletedListBinding layoutBulletedListBinding = new LayoutBulletedListBinding((LinearLayoutCompat)((Object)object), ajioTextView);
            return layoutBulletedListBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutBulletedListBinding inflate(LayoutInflater layoutInflater) {
        return LayoutBulletedListBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutBulletedListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_bulleted_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutBulletedListBinding.bind((View)layoutInflater);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}

