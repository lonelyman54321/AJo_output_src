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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ShoppingAssistantLuxeBinding
implements BC3 {
    public final View returnDivider;
    private final ConstraintLayout rootView;
    public final AjioTextView shoppingAssistantNewTag;
    public final AjioTextView textView2;
    public final TextView textView4;

    private ShoppingAssistantLuxeBinding(ConstraintLayout constraintLayout, View view, AjioTextView ajioTextView, AjioTextView ajioTextView2, TextView textView) {
        this.rootView = constraintLayout;
        this.returnDivider = view;
        this.shoppingAssistantNewTag = ajioTextView;
        this.textView2 = ajioTextView2;
        this.textView4 = textView;
    }

    public static ShoppingAssistantLuxeBinding bind(View object) {
        int n3 = R$id.return_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.shoppingAssistantNewTag;
            Object object3 = object2 = dd2_2.a(n3, object);
            object3 = (AjioTextView)object2;
            if (object3 != null) {
                n3 = R$id.textView2;
                Object object4 = object2 = dd2_2.a(n3, object);
                object4 = (AjioTextView)object2;
                if (object4 != null) {
                    n3 = R$id.textView4;
                    View view2 = object2 = dd2_2.a(n3, object);
                    view2 = (TextView)object2;
                    if (view2 != null) {
                        ShoppingAssistantLuxeBinding shoppingAssistantLuxeBinding;
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        object2 = shoppingAssistantLuxeBinding;
                        shoppingAssistantLuxeBinding = new ShoppingAssistantLuxeBinding((ConstraintLayout)((Object)object5), view, (AjioTextView)object3, (AjioTextView)object4, (TextView)view2);
                        return shoppingAssistantLuxeBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShoppingAssistantLuxeBinding inflate(LayoutInflater layoutInflater) {
        return ShoppingAssistantLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static ShoppingAssistantLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shopping_assistant_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShoppingAssistantLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

