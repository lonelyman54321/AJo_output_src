/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.LuxeUnderlineButton;

public final class LuxeNewRowPdpSizeBinding
implements BC3 {
    public final ImageView addToCartImv;
    public final LinearLayout addToCartLayout;
    public final AjioTextView addToCartTv;
    public final ImageButton closeButton;
    public final AjioTextView gotoSizeGuideButton;
    public final LinearLayout gotoSizeGuideLayout;
    public final LinearLayout newPdpSizeRowLayout;
    public final LinearLayout parentLayout;
    public final ImageView pdpImvNextSize;
    public final LinearLayout pdpSizeChartContainer;
    public final RelativeLayout pdpSizeContainer;
    public final LinearLayout pdpSizeContainerParent;
    public final ImageView pdpSizeGuide;
    public final ImageView pdpSizeImg;
    public final AjioTextView pdpSizeInfoTvHeader;
    public final AjioTextView pdpSizeInfoTvText;
    public final AjioTextView pdpSizeInfoUnit;
    public final RelativeLayout pdpSizeRecomContainer;
    public final AjioTextView pdpSizeText;
    public final AjioTextView pdpSizeToolTip;
    public final RecyclerView productDetailSizeRv;
    private final LinearLayout rootView;
    public final ImageView selectSizeTriangle;
    public final LuxeUnderlineButton sizeChart;
    public final ImageView sizeInfo;
    public final LinearLayout sizeInfoLayout;
    public final AjioTextView sizeInfoTv;
    public final View sizeTopDivider;
    public final AjioTextView xItemLeft;

    private LuxeNewRowPdpSizeBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, AjioTextView ajioTextView, ImageButton imageButton, AjioTextView ajioTextView2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView2, LinearLayout linearLayout6, RelativeLayout relativeLayout, LinearLayout linearLayout7, ImageView imageView3, ImageView imageView4, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, RelativeLayout relativeLayout2, AjioTextView ajioTextView6, AjioTextView ajioTextView7, RecyclerView recyclerView, ImageView imageView5, LuxeUnderlineButton luxeUnderlineButton, ImageView imageView6, LinearLayout linearLayout8, AjioTextView ajioTextView8, View view, AjioTextView ajioTextView9) {
        this.rootView = linearLayout;
        this.addToCartImv = imageView;
        this.addToCartLayout = linearLayout2;
        this.addToCartTv = ajioTextView;
        this.closeButton = imageButton;
        this.gotoSizeGuideButton = ajioTextView2;
        this.gotoSizeGuideLayout = linearLayout3;
        this.newPdpSizeRowLayout = linearLayout4;
        this.parentLayout = linearLayout5;
        this.pdpImvNextSize = imageView2;
        this.pdpSizeChartContainer = linearLayout6;
        this.pdpSizeContainer = relativeLayout;
        this.pdpSizeContainerParent = linearLayout7;
        this.pdpSizeGuide = imageView3;
        this.pdpSizeImg = imageView4;
        this.pdpSizeInfoTvHeader = ajioTextView3;
        this.pdpSizeInfoTvText = ajioTextView4;
        this.pdpSizeInfoUnit = ajioTextView5;
        this.pdpSizeRecomContainer = relativeLayout2;
        this.pdpSizeText = ajioTextView6;
        this.pdpSizeToolTip = ajioTextView7;
        this.productDetailSizeRv = recyclerView;
        this.selectSizeTriangle = imageView5;
        this.sizeChart = luxeUnderlineButton;
        this.sizeInfo = imageView6;
        this.sizeInfoLayout = linearLayout8;
        this.sizeInfoTv = ajioTextView8;
        this.sizeTopDivider = view;
        this.xItemLeft = ajioTextView9;
    }

    public static LuxeNewRowPdpSizeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.add_to_cart_imv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.add_to_cart_layout;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n3 = R$id.add_to_cart_tv;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (AjioTextView)view2;
                if (object2 != null) {
                    n3 = R$id.close_button;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (ImageButton)view2;
                    if (view5 != null) {
                        n3 = R$id.goto_size_guide_button;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.goto_size_guide_layout;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (LinearLayout)view2;
                            if (view6 != null) {
                                View view7 = view;
                                view7 = (LinearLayout)view;
                                n3 = R$id.parent_layout;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (LinearLayout)view2;
                                if (view8 != null) {
                                    n3 = R$id.pdp_Imv_next_size;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (ImageView)view2;
                                    if (view9 != null) {
                                        n3 = R$id.pdp_size_chart_container;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (LinearLayout)view2;
                                        if (view10 != null) {
                                            n3 = R$id.pdp_size_container;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (RelativeLayout)view2;
                                            if (view11 != null) {
                                                n3 = R$id.pdp_size_container_parent;
                                                View view12 = view2 = dd2_2.a(n3, view);
                                                view12 = (LinearLayout)view2;
                                                if (view12 != null) {
                                                    n3 = R$id.pdp_size_guide;
                                                    View view13 = view2 = dd2_2.a(n3, view);
                                                    view13 = (ImageView)view2;
                                                    if (view13 != null) {
                                                        n3 = R$id.pdp_size_img;
                                                        View view14 = view2 = dd2_2.a(n3, view);
                                                        view14 = (ImageView)view2;
                                                        if (view14 != null) {
                                                            n3 = R$id.pdp_size_info_tv_header;
                                                            Object object4 = view2 = dd2_2.a(n3, view);
                                                            object4 = (AjioTextView)view2;
                                                            if (object4 != null) {
                                                                n3 = R$id.pdp_size_info_tv_text;
                                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                                object5 = (AjioTextView)view2;
                                                                if (object5 != null) {
                                                                    n3 = R$id.pdp_size_info_unit;
                                                                    Object object6 = view2 = dd2_2.a(n3, view);
                                                                    object6 = (AjioTextView)view2;
                                                                    if (object6 != null) {
                                                                        n3 = R$id.pdp_size_recom_container;
                                                                        View view15 = view2 = dd2_2.a(n3, view);
                                                                        view15 = (RelativeLayout)view2;
                                                                        if (view15 != null) {
                                                                            n3 = R$id.pdp_size_text;
                                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                                            object7 = (AjioTextView)view2;
                                                                            if (object7 != null) {
                                                                                n3 = R$id.pdp_size_tool_tip;
                                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                                object8 = (AjioTextView)view2;
                                                                                if (object8 != null) {
                                                                                    n3 = R$id.product_detail_size_rv;
                                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                                    object9 = (RecyclerView)view2;
                                                                                    if (object9 != null) {
                                                                                        n3 = R$id.select_size_triangle;
                                                                                        View view16 = view2 = dd2_2.a(n3, view);
                                                                                        view16 = (ImageView)view2;
                                                                                        if (view16 != null) {
                                                                                            n3 = R$id.size_chart;
                                                                                            Object object10 = view2 = dd2_2.a(n3, view);
                                                                                            object10 = (LuxeUnderlineButton)view2;
                                                                                            if (object10 != null) {
                                                                                                n3 = R$id.size_info;
                                                                                                View view17 = view2 = dd2_2.a(n3, view);
                                                                                                view17 = (ImageView)view2;
                                                                                                if (view17 != null) {
                                                                                                    n3 = R$id.size_info_layout;
                                                                                                    View view18 = view2 = dd2_2.a(n3, view);
                                                                                                    view18 = (LinearLayout)view2;
                                                                                                    if (view18 != null) {
                                                                                                        View view19;
                                                                                                        n3 = R$id.size_info_tv;
                                                                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                                                                        object11 = (AjioTextView)view2;
                                                                                                        if (object11 != null && (view19 = dd2_2.a(n3 = R$id.size_top_divider, view)) != null) {
                                                                                                            n3 = R$id.x_item_left;
                                                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                                                            object12 = (AjioTextView)view2;
                                                                                                            if (object12 != null) {
                                                                                                                object = new LuxeNewRowPdpSizeBinding((LinearLayout)view7, (ImageView)view3, (LinearLayout)view4, (AjioTextView)object2, (ImageButton)view5, (AjioTextView)object3, (LinearLayout)view6, (LinearLayout)view7, (LinearLayout)view8, (ImageView)view9, (LinearLayout)view10, (RelativeLayout)view11, (LinearLayout)view12, (ImageView)view13, (ImageView)view14, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (RelativeLayout)view15, (AjioTextView)object7, (AjioTextView)object8, (RecyclerView)object9, (ImageView)view16, (LuxeUnderlineButton)object10, (ImageView)view17, (LinearLayout)view18, (AjioTextView)object11, view19, (AjioTextView)object12);
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
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeNewRowPdpSizeBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewRowPdpSizeBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewRowPdpSizeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_row_pdp_size;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewRowPdpSizeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

