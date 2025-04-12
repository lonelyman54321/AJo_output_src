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
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.EmptyWishlistLuxeBinding;
import com.ril.ajio.databinding.LayoutSaleHeaderWishlistWidgetLuxeBinding;

public final class FragmentClosetBottomListLuxeBinding
implements BC3 {
    public final View accPageNameLyt;
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final RecyclerView closetRv;
    public final EmptyWishlistLuxeBinding emptyWishlistContainer;
    public final AjioLoaderView halfClosetProgress;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;
    public final LayoutSaleHeaderWishlistWidgetLuxeBinding saleHeader;
    public final TextView viewAll;
    public final TextView wishlistTv;

    private FragmentClosetBottomListLuxeBinding(LinearLayout linearLayout, View view, ImageView imageView, FrameLayout frameLayout, RecyclerView recyclerView, EmptyWishlistLuxeBinding emptyWishlistLuxeBinding, AjioLoaderView ajioLoaderView, LinearLayout linearLayout2, LayoutSaleHeaderWishlistWidgetLuxeBinding layoutSaleHeaderWishlistWidgetLuxeBinding, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.accPageNameLyt = view;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.closetRv = recyclerView;
        this.emptyWishlistContainer = emptyWishlistLuxeBinding;
        this.halfClosetProgress = ajioLoaderView;
        this.parentLayout = linearLayout2;
        this.saleHeader = layoutSaleHeaderWishlistWidgetLuxeBinding;
        this.viewAll = textView;
        this.wishlistTv = textView2;
    }

    public static FragmentClosetBottomListLuxeBinding bind(View object) {
        int n3 = R$id.acc_page_name_lyt;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            n3 = R$id.cancelBtn;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.cancelContainer;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (FrameLayout)view2;
                if (view4 != null) {
                    n3 = R$id.closetRv;
                    Object object2 = view2 = dd2_2.a(n3, object);
                    object2 = (RecyclerView)view2;
                    if (object2 != null && (view2 = dd2_2.a(n3 = R$id.emptyWishlistContainer, object)) != null) {
                        EmptyWishlistLuxeBinding emptyWishlistLuxeBinding = EmptyWishlistLuxeBinding.bind(view2);
                        n3 = R$id.halfClosetProgress;
                        Object object3 = view2 = dd2_2.a(n3, object);
                        object3 = (AjioLoaderView)view2;
                        if (object3 != null) {
                            Object object4 = object;
                            object4 = (LinearLayout)object;
                            n3 = R$id.saleHeader;
                            view2 = dd2_2.a(n3, object);
                            if (view2 != null) {
                                LayoutSaleHeaderWishlistWidgetLuxeBinding layoutSaleHeaderWishlistWidgetLuxeBinding = LayoutSaleHeaderWishlistWidgetLuxeBinding.bind(view2);
                                n3 = R$id.viewAll;
                                View view5 = view2 = dd2_2.a(n3, object);
                                view5 = (TextView)view2;
                                if (view5 != null) {
                                    n3 = R$id.wishlistTv;
                                    View view6 = view2 = dd2_2.a(n3, object);
                                    view6 = (TextView)view2;
                                    if (view6 != null) {
                                        view2 = object;
                                        object = new FragmentClosetBottomListLuxeBinding((LinearLayout)object4, view, (ImageView)view3, (FrameLayout)view4, (RecyclerView)object2, emptyWishlistLuxeBinding, (AjioLoaderView)((Object)object3), (LinearLayout)object4, layoutSaleHeaderWishlistWidgetLuxeBinding, (TextView)view5, (TextView)view6);
                                        return object;
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

    public static FragmentClosetBottomListLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentClosetBottomListLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentClosetBottomListLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_closet_bottom_list_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentClosetBottomListLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

