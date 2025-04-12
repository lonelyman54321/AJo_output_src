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

public final class ItemDynamicWidgetExploreLuxeBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowShopTheLook;
    public final AjioTextView widgetCta;

    private ItemDynamicWidgetExploreLuxeBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.rowShopTheLook = constraintLayout2;
        this.widgetCta = ajioTextView;
    }

    public static ItemDynamicWidgetExploreLuxeBinding bind(View object) {
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.widgetCta;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = new ItemDynamicWidgetExploreLuxeBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ItemDynamicWidgetExploreLuxeBinding inflate(LayoutInflater layoutInflater) {
        return ItemDynamicWidgetExploreLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static ItemDynamicWidgetExploreLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_dynamic_widget_explore_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemDynamicWidgetExploreLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

