/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class TabHomeCategoryLuxeBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final TextView tvTabTitle;

    private TabHomeCategoryLuxeBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.tvTabTitle = textView;
    }

    public static TabHomeCategoryLuxeBinding bind(View object) {
        int n3 = R$id.tvTabTitle;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (ConstraintLayout)((Object)object);
            TabHomeCategoryLuxeBinding tabHomeCategoryLuxeBinding = new TabHomeCategoryLuxeBinding((ConstraintLayout)((Object)object), textView);
            return tabHomeCategoryLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TabHomeCategoryLuxeBinding inflate(LayoutInflater layoutInflater) {
        return TabHomeCategoryLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static TabHomeCategoryLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.tab_home_category_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TabHomeCategoryLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

