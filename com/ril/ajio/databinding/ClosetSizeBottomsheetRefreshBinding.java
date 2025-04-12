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
import com.ril.ajio.customviews.widgets.AjioButton;

public final class ClosetSizeBottomsheetRefreshBinding
implements BC3 {
    public final TextView addBagTv;
    public final LinearLayout addToBag;
    public final TextView brandSizeTv;
    public final TextView cancel;
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final AjioButton cartSizeChartTvHeader;
    public final TextView cartSizeInfoTvHeader;
    public final ImageView closetAddBagImg;
    public final AjioLoaderView closetSizeProgressBar;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;
    public final RecyclerView sizeRv;
    public final TextView sizeUnitTv;

    private ClosetSizeBottomsheetRefreshBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, ImageView imageView, FrameLayout frameLayout, AjioButton ajioButton, TextView textView4, ImageView imageView2, AjioLoaderView ajioLoaderView, LinearLayout linearLayout3, RecyclerView recyclerView, TextView textView5) {
        this.rootView = linearLayout;
        this.addBagTv = textView;
        this.addToBag = linearLayout2;
        this.brandSizeTv = textView2;
        this.cancel = textView3;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.cartSizeChartTvHeader = ajioButton;
        this.cartSizeInfoTvHeader = textView4;
        this.closetAddBagImg = imageView2;
        this.closetSizeProgressBar = ajioLoaderView;
        this.parentLayout = linearLayout3;
        this.sizeRv = recyclerView;
        this.sizeUnitTv = textView5;
    }

    public static ClosetSizeBottomsheetRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.addBagTv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.addToBag;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n3 = R$id.brand_size_tv;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.cancel;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.cancelBtn;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n3 = R$id.cancelContainer;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (FrameLayout)view2;
                            if (view8 != null) {
                                n3 = R$id.cart_size_chart_tv_header;
                                Object object2 = view2 = dd2_2.a(n3, view);
                                object2 = (AjioButton)view2;
                                if (object2 != null) {
                                    n3 = R$id.cart_size_info_tv_header;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (TextView)view2;
                                    if (view9 != null) {
                                        n3 = R$id.closetAddBagImg;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (ImageView)view2;
                                        if (view10 != null) {
                                            n3 = R$id.closet_size_progress_bar;
                                            Object object3 = view2 = dd2_2.a(n3, view);
                                            object3 = (AjioLoaderView)view2;
                                            if (object3 != null) {
                                                View view11 = view;
                                                view11 = (LinearLayout)view;
                                                n3 = R$id.sizeRv;
                                                Object object4 = view2 = dd2_2.a(n3, view);
                                                object4 = (RecyclerView)view2;
                                                if (object4 != null) {
                                                    n3 = R$id.size_unit_tv;
                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                    view12 = (TextView)view2;
                                                    if (view12 != null) {
                                                        object = new ClosetSizeBottomsheetRefreshBinding((LinearLayout)view11, (TextView)view3, (LinearLayout)view4, (TextView)view5, (TextView)view6, (ImageView)view7, (FrameLayout)view8, (AjioButton)object2, (TextView)view9, (ImageView)view10, (AjioLoaderView)((Object)object3), (LinearLayout)view11, (RecyclerView)object4, (TextView)view12);
                                                        return object;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ClosetSizeBottomsheetRefreshBinding inflate(LayoutInflater layoutInflater) {
        return ClosetSizeBottomsheetRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static ClosetSizeBottomsheetRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.closet_size_bottomsheet_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ClosetSizeBottomsheetRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

