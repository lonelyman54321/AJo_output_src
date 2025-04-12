/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewRowPdpSizeBinding
implements BC3 {
    public final ImageView addToCartImv;
    public final LinearLayout addToCartLayout;
    public final AjioTextView addToCartTv;
    public final LinearLayout brandSelectionContainer;
    public final SwitchCompat brandSizeSwitch;
    public final AjioTextView brandSizingTv;
    public final AppCompatImageButton closeButton;
    public final CardView cvSizeToggleContainer;
    public final AjioTextView gotoSizeGuideButton;
    public final LinearLayout gotoSizeGuideLayout;
    public final ImageView ivSizeInstructions;
    public final LinearLayout newPdpSizeRowLayout;
    public final LinearLayout parentLayout;
    public final ImageView pdpImvNextSize;
    public final LinearLayout pdpSizeChartContainer;
    public final RelativeLayout pdpSizeContainer;
    public final LinearLayout pdpSizeContainerParent;
    public final ImageView pdpSizeGuide;
    public final ImageView pdpSizeImg;
    public final AjioTextView pdpSizeInfoTvHeader;
    public final ConstraintLayout pdpSizeInfoTvHeaderLyt;
    public final AjioTextView pdpSizeInfoTvHeaderTemp;
    public final AjioTextView pdpSizeInfoTvText;
    public final AjioTextView pdpSizeInfoUnit;
    public final RelativeLayout pdpSizeRecomContainer;
    public final AjioTextView pdpSizeText;
    public final AjioTextView pdpSizeToolTip;
    public final RecyclerView productDetailSizeRv;
    private final LinearLayout rootView;
    public final RecyclerView rvSizeInstructions;
    public final ScrollView scrollParent;
    public final ImageView selectSizeTriangle;
    public final View shadowLayout;
    public final AjioButton sizeChart;
    public final ImageView sizeInfo;
    public final LinearLayout sizeInfoLayout;
    public final AjioTextView sizeInfoTv;
    public final View sizeTopDivider;
    public final TabItem tabMeasureCm;
    public final TabItem tabMeasureIn;
    public final TabLayout tlSizeUnit;
    public final AjioTextView xItemLeft;

    private NewRowPdpSizeBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, AjioTextView ajioTextView, LinearLayout linearLayout3, SwitchCompat switchCompat, AjioTextView ajioTextView2, AppCompatImageButton appCompatImageButton, CardView cardView, AjioTextView ajioTextView3, LinearLayout linearLayout4, ImageView imageView2, LinearLayout linearLayout5, LinearLayout linearLayout6, ImageView imageView3, LinearLayout linearLayout7, RelativeLayout relativeLayout, LinearLayout linearLayout8, ImageView imageView4, ImageView imageView5, AjioTextView ajioTextView4, ConstraintLayout constraintLayout, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, RelativeLayout relativeLayout2, AjioTextView ajioTextView8, AjioTextView ajioTextView9, RecyclerView recyclerView, RecyclerView recyclerView2, ScrollView scrollView, ImageView imageView6, View view, AjioButton ajioButton, ImageView imageView7, LinearLayout linearLayout9, AjioTextView ajioTextView10, View view2, TabItem tabItem, TabItem tabItem2, TabLayout tabLayout, AjioTextView ajioTextView11) {
        this.rootView = linearLayout;
        this.addToCartImv = imageView;
        this.addToCartLayout = linearLayout2;
        this.addToCartTv = ajioTextView;
        this.brandSelectionContainer = linearLayout3;
        this.brandSizeSwitch = switchCompat;
        this.brandSizingTv = ajioTextView2;
        this.closeButton = appCompatImageButton;
        this.cvSizeToggleContainer = cardView;
        this.gotoSizeGuideButton = ajioTextView3;
        this.gotoSizeGuideLayout = linearLayout4;
        this.ivSizeInstructions = imageView2;
        this.newPdpSizeRowLayout = linearLayout5;
        this.parentLayout = linearLayout6;
        this.pdpImvNextSize = imageView3;
        this.pdpSizeChartContainer = linearLayout7;
        this.pdpSizeContainer = relativeLayout;
        this.pdpSizeContainerParent = linearLayout8;
        this.pdpSizeGuide = imageView4;
        this.pdpSizeImg = imageView5;
        this.pdpSizeInfoTvHeader = ajioTextView4;
        this.pdpSizeInfoTvHeaderLyt = constraintLayout;
        this.pdpSizeInfoTvHeaderTemp = ajioTextView5;
        this.pdpSizeInfoTvText = ajioTextView6;
        this.pdpSizeInfoUnit = ajioTextView7;
        this.pdpSizeRecomContainer = relativeLayout2;
        this.pdpSizeText = ajioTextView8;
        this.pdpSizeToolTip = ajioTextView9;
        this.productDetailSizeRv = recyclerView;
        this.rvSizeInstructions = recyclerView2;
        this.scrollParent = scrollView;
        this.selectSizeTriangle = imageView6;
        this.shadowLayout = view;
        this.sizeChart = ajioButton;
        this.sizeInfo = imageView7;
        this.sizeInfoLayout = linearLayout9;
        this.sizeInfoTv = ajioTextView10;
        this.sizeTopDivider = view2;
        this.tabMeasureCm = tabItem;
        this.tabMeasureIn = tabItem2;
        this.tlSizeUnit = tabLayout;
        this.xItemLeft = ajioTextView11;
    }

    public static NewRowPdpSizeBinding bind(View view) {
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
                    n3 = R$id.brand_selection_container;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (LinearLayout)view2;
                    if (view5 != null) {
                        n3 = R$id.brandSize_switch;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (SwitchCompat)view2;
                        if (object3 != null) {
                            n3 = R$id.brand_sizing_tv;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (AjioTextView)view2;
                            if (object4 != null) {
                                n3 = R$id.close_button;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AppCompatImageButton)view2;
                                if (object5 != null) {
                                    n3 = R$id.cv_size_toggle_container;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (CardView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.goto_size_guide_button;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (AjioTextView)view2;
                                        if (object7 != null) {
                                            n3 = R$id.goto_size_guide_layout;
                                            View view6 = view2 = dd2_2.a(n3, view);
                                            view6 = (LinearLayout)view2;
                                            if (view6 != null) {
                                                n3 = R$id.iv_size_instructions;
                                                View view7 = view2 = dd2_2.a(n3, view);
                                                view7 = (ImageView)view2;
                                                if (view7 != null) {
                                                    View view8 = view;
                                                    view8 = (LinearLayout)view;
                                                    n3 = R$id.parent_layout;
                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                    view9 = (LinearLayout)view2;
                                                    if (view9 != null) {
                                                        n3 = R$id.pdp_Imv_next_size;
                                                        View view10 = view2 = dd2_2.a(n3, view);
                                                        view10 = (ImageView)view2;
                                                        if (view10 != null) {
                                                            n3 = R$id.pdp_size_chart_container;
                                                            View view11 = view2 = dd2_2.a(n3, view);
                                                            view11 = (LinearLayout)view2;
                                                            if (view11 != null) {
                                                                n3 = R$id.pdp_size_container;
                                                                View view12 = view2 = dd2_2.a(n3, view);
                                                                view12 = (RelativeLayout)view2;
                                                                if (view12 != null) {
                                                                    n3 = R$id.pdp_size_container_parent;
                                                                    View view13 = view2 = dd2_2.a(n3, view);
                                                                    view13 = (LinearLayout)view2;
                                                                    if (view13 != null) {
                                                                        n3 = R$id.pdp_size_guide;
                                                                        View view14 = view2 = dd2_2.a(n3, view);
                                                                        view14 = (ImageView)view2;
                                                                        if (view14 != null) {
                                                                            n3 = R$id.pdp_size_img;
                                                                            View view15 = view2 = dd2_2.a(n3, view);
                                                                            view15 = (ImageView)view2;
                                                                            if (view15 != null) {
                                                                                n3 = R$id.pdp_size_info_tv_header;
                                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                                object8 = (AjioTextView)view2;
                                                                                if (object8 != null) {
                                                                                    n3 = R$id.pdp_size_info_tv_header_lyt;
                                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                                    object9 = (ConstraintLayout)view2;
                                                                                    if (object9 != null) {
                                                                                        n3 = R$id.pdp_size_info_tv_header_temp;
                                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                                        object10 = (AjioTextView)view2;
                                                                                        if (object10 != null) {
                                                                                            n3 = R$id.pdp_size_info_tv_text;
                                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                                            object11 = (AjioTextView)view2;
                                                                                            if (object11 != null) {
                                                                                                n3 = R$id.pdp_size_info_unit;
                                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                                object12 = (AjioTextView)view2;
                                                                                                if (object12 != null) {
                                                                                                    n3 = R$id.pdp_size_recom_container;
                                                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                                                    view16 = (RelativeLayout)view2;
                                                                                                    if (view16 != null) {
                                                                                                        n3 = R$id.pdp_size_text;
                                                                                                        Object object13 = view2 = dd2_2.a(n3, view);
                                                                                                        object13 = (AjioTextView)view2;
                                                                                                        if (object13 != null) {
                                                                                                            n3 = R$id.pdp_size_tool_tip;
                                                                                                            Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                            object14 = (AjioTextView)view2;
                                                                                                            if (object14 != null) {
                                                                                                                n3 = R$id.product_detail_size_rv;
                                                                                                                Object object15 = view2 = dd2_2.a(n3, view);
                                                                                                                object15 = (RecyclerView)view2;
                                                                                                                if (object15 != null) {
                                                                                                                    n3 = R$id.rv_size_instructions;
                                                                                                                    Object object16 = view2 = dd2_2.a(n3, view);
                                                                                                                    object16 = (RecyclerView)view2;
                                                                                                                    if (object16 != null) {
                                                                                                                        n3 = R$id.scroll_parent;
                                                                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                                                                        view17 = (ScrollView)view2;
                                                                                                                        if (view17 != null) {
                                                                                                                            View view18;
                                                                                                                            n3 = R$id.select_size_triangle;
                                                                                                                            View view19 = view2 = dd2_2.a(n3, view);
                                                                                                                            view19 = (ImageView)view2;
                                                                                                                            if (view19 != null && (view18 = dd2_2.a(n3 = R$id.shadow_layout, view)) != null) {
                                                                                                                                n3 = R$id.size_chart;
                                                                                                                                Object object17 = view2 = dd2_2.a(n3, view);
                                                                                                                                object17 = (AjioButton)view2;
                                                                                                                                if (object17 != null) {
                                                                                                                                    n3 = R$id.size_info;
                                                                                                                                    View view20 = view2 = dd2_2.a(n3, view);
                                                                                                                                    view20 = (ImageView)view2;
                                                                                                                                    if (view20 != null) {
                                                                                                                                        n3 = R$id.size_info_layout;
                                                                                                                                        View view21 = view2 = dd2_2.a(n3, view);
                                                                                                                                        view21 = (LinearLayout)view2;
                                                                                                                                        if (view21 != null) {
                                                                                                                                            View view22;
                                                                                                                                            n3 = R$id.size_info_tv;
                                                                                                                                            Object object18 = view2 = dd2_2.a(n3, view);
                                                                                                                                            object18 = (AjioTextView)view2;
                                                                                                                                            if (object18 != null && (view22 = dd2_2.a(n3 = R$id.size_top_divider, view)) != null) {
                                                                                                                                                n3 = R$id.tab_measure_cm;
                                                                                                                                                View view23 = view2 = dd2_2.a(n3, view);
                                                                                                                                                view23 = (TabItem)view2;
                                                                                                                                                if (view23 != null) {
                                                                                                                                                    n3 = R$id.tab_measure_in;
                                                                                                                                                    View view24 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    view24 = (TabItem)view2;
                                                                                                                                                    if (view24 != null) {
                                                                                                                                                        n3 = R$id.tl_size_unit;
                                                                                                                                                        Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        object19 = (TabLayout)view2;
                                                                                                                                                        if (object19 != null) {
                                                                                                                                                            n3 = R$id.x_item_left;
                                                                                                                                                            Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                                                                            object20 = (AjioTextView)view2;
                                                                                                                                                            if (object20 != null) {
                                                                                                                                                                object = new NewRowPdpSizeBinding((LinearLayout)view8, (ImageView)view3, (LinearLayout)view4, (AjioTextView)object2, (LinearLayout)view5, (SwitchCompat)((Object)object3), (AjioTextView)object4, (AppCompatImageButton)((Object)object5), (CardView)((Object)object6), (AjioTextView)object7, (LinearLayout)view6, (ImageView)view7, (LinearLayout)view8, (LinearLayout)view9, (ImageView)view10, (LinearLayout)view11, (RelativeLayout)view12, (LinearLayout)view13, (ImageView)view14, (ImageView)view15, (AjioTextView)object8, (ConstraintLayout)((Object)object9), (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (RelativeLayout)view16, (AjioTextView)object13, (AjioTextView)object14, (RecyclerView)object15, (RecyclerView)object16, (ScrollView)view17, (ImageView)view19, view18, (AjioButton)object17, (ImageView)view20, (LinearLayout)view21, (AjioTextView)object18, view22, (TabItem)view23, (TabItem)view24, (TabLayout)((Object)object19), (AjioTextView)object20);
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

    public static NewRowPdpSizeBinding inflate(LayoutInflater layoutInflater) {
        return NewRowPdpSizeBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowPdpSizeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_pdp_size;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowPdpSizeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

