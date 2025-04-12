/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxePlpToolbarLayoutBinding
implements BC3 {
    public final Toolbar luxeToolbar;
    public final RelativeLayout luxeToolbarCartView;
    public final AjioImageView luxeToolbarNavigationIv;
    public final AjioImageView luxeToolbarSearchIv;
    public final AjioImageView luxeToolbarWishlistIv;
    public final AjioTextView menuCartCountTv;
    public final AjioImageView menuCartIv;
    public final LinearLayout menuCartLayout;
    private final Toolbar rootView;

    private LuxePlpToolbarLayoutBinding(Toolbar toolbar, Toolbar toolbar2, RelativeLayout relativeLayout, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioImageView ajioImageView3, AjioTextView ajioTextView, AjioImageView ajioImageView4, LinearLayout linearLayout) {
        this.rootView = toolbar;
        this.luxeToolbar = toolbar2;
        this.luxeToolbarCartView = relativeLayout;
        this.luxeToolbarNavigationIv = ajioImageView;
        this.luxeToolbarSearchIv = ajioImageView2;
        this.luxeToolbarWishlistIv = ajioImageView3;
        this.menuCartCountTv = ajioTextView;
        this.menuCartIv = ajioImageView4;
        this.menuCartLayout = linearLayout;
    }

    public static LuxePlpToolbarLayoutBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (Toolbar)object;
        int n3 = R$id.luxe_toolbar_cart_view;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            n3 = R$id.luxe_toolbar_navigation_iv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioImageView)view;
            if (object3 != null) {
                n3 = R$id.luxe_toolbar_search_iv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioImageView)view;
                if (object4 != null) {
                    n3 = R$id.luxe_toolbar_wishlist_iv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioImageView)view;
                    if (object5 != null) {
                        n3 = R$id.menu_cart_count_tv;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.menu_cart_iv;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioImageView)view;
                            if (object7 != null) {
                                n3 = R$id.menu_cart_layout;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (LinearLayout)view;
                                if (view3 != null) {
                                    Object object8 = object;
                                    view = object2;
                                    object = new LuxePlpToolbarLayoutBinding((Toolbar)object2, (Toolbar)object2, (RelativeLayout)view2, (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (AjioImageView)((Object)object5), (AjioTextView)object6, (AjioImageView)((Object)object7), (LinearLayout)view3);
                                    return object;
                                }
                            }
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

    public static LuxePlpToolbarLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpToolbarLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_toolbar_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpToolbarLayoutBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

