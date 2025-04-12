/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LuxeEmptyWishistBinding;

public final class LuxeClosetLayoutBinding
implements BC3 {
    public final Toolbar closetToolbar;
    public final ImageView closetToolbarNavigationIv;
    public final AjioImageView closetViewBagImv;
    public final AjioTextView closetViewHeadingTv;
    public final AjioTextView closetViewSubheadingTv;
    public final LuxeEmptyWishistBinding emptyClosetLayout;
    public final AjioTextView luxeCartCountTv;
    public final FrameLayout luxeClosetCollapsedToolbar;
    public final RecyclerView luxeClosetProductRv;
    public final LinearLayout menuCartLayout;
    private final ConstraintLayout rootView;

    private LuxeClosetLayoutBinding(ConstraintLayout constraintLayout, Toolbar toolbar, ImageView imageView, AjioImageView ajioImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, LuxeEmptyWishistBinding luxeEmptyWishistBinding, AjioTextView ajioTextView3, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.closetToolbar = toolbar;
        this.closetToolbarNavigationIv = imageView;
        this.closetViewBagImv = ajioImageView;
        this.closetViewHeadingTv = ajioTextView;
        this.closetViewSubheadingTv = ajioTextView2;
        this.emptyClosetLayout = luxeEmptyWishistBinding;
        this.luxeCartCountTv = ajioTextView3;
        this.luxeClosetCollapsedToolbar = frameLayout;
        this.luxeClosetProductRv = recyclerView;
        this.menuCartLayout = linearLayout;
    }

    public static LuxeClosetLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.closet_toolbar;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (Toolbar)view;
        if (object2 != null) {
            n3 = R$id.closet_toolbar_navigation_iv;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.closet_view_bag_imv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioImageView)view;
                if (object3 != null) {
                    n3 = R$id.closet_view_heading_tv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.closet_view_subheading_tv;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null && (view = dd2_2.a(n3 = R$id.empty_closet_layout, object)) != null) {
                            LuxeEmptyWishistBinding luxeEmptyWishistBinding = LuxeEmptyWishistBinding.bind(view);
                            n3 = R$id.luxe_cart_count_tv;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.luxeClosetCollapsedToolbar;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (FrameLayout)view;
                                if (view3 != null) {
                                    n3 = R$id.luxe_closet_product_rv;
                                    Object object7 = view = dd2_2.a(n3, object);
                                    object7 = (RecyclerView)view;
                                    if (object7 != null) {
                                        n3 = R$id.menu_cart_layout;
                                        View view4 = view = dd2_2.a(n3, object);
                                        view4 = (LinearLayout)view;
                                        if (view4 != null) {
                                            Object object8 = object;
                                            object8 = (ConstraintLayout)((Object)object);
                                            LuxeClosetLayoutBinding luxeClosetLayoutBinding = new LuxeClosetLayoutBinding((ConstraintLayout)((Object)object8), (Toolbar)object2, (ImageView)view2, (AjioImageView)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, luxeEmptyWishistBinding, (AjioTextView)object6, (FrameLayout)view3, (RecyclerView)object7, (LinearLayout)view4);
                                            return luxeClosetLayoutBinding;
                                        }
                                    }
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

    public static LuxeClosetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxeClosetLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeClosetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_closet_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeClosetLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

