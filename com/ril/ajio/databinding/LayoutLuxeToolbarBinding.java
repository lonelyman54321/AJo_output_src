/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutLuxeToolbarBinding
implements BC3 {
    public final ImageView lltIvLuxeBack;
    public final ImageView lltIvLuxeDropdown;
    public final ImageView lltIvLuxeHamburger;
    public final ImageView lltIvLuxeLogo;
    public final ImageView lltIvLuxeSearch;
    public final Toolbar lltLuxeToolbar;
    private final Toolbar rootView;

    private LayoutLuxeToolbarBinding(Toolbar toolbar, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, Toolbar toolbar2) {
        this.rootView = toolbar;
        this.lltIvLuxeBack = imageView;
        this.lltIvLuxeDropdown = imageView2;
        this.lltIvLuxeHamburger = imageView3;
        this.lltIvLuxeLogo = imageView4;
        this.lltIvLuxeSearch = imageView5;
        this.lltLuxeToolbar = toolbar2;
    }

    public static LayoutLuxeToolbarBinding bind(View object) {
        View view;
        int n3 = R$id.lltIvLuxeBack;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.lltIvLuxeDropdown;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.lltIvLuxeHamburger;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.lltIvLuxeLogo;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n3 = R$id.lltIvLuxeSearch;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            Object object2 = object;
                            object2 = (Toolbar)object;
                            object = new LayoutLuxeToolbarBinding((Toolbar)object2, (ImageView)view2, (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (Toolbar)object2);
                            return object;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutLuxeToolbarBinding inflate(LayoutInflater layoutInflater) {
        return LayoutLuxeToolbarBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutLuxeToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_luxe_toolbar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutLuxeToolbarBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

