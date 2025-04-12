/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowFlashPdpSizeBinding
implements BC3 {
    public final ImageButton pdpImvNextSize;
    public final ImageButton pdpImvPrevSize;
    public final RelativeLayout pdpSizeContainer;
    public final View pdpSizeDivider;
    public final AjioTextView pdpSizeInfoTvHeader;
    public final AjioTextView pdpSizeInfoTvText;
    public final AjioTextView pdpSizeInfoUnit;
    public final LinearLayout pdpSizeLayout;
    public final AjioTextView pdpSizeText;
    public final AjioTextView pdpSizeToolTip;
    public final RecyclerView productDetailSizeRv;
    private final LinearLayout rootView;
    public final AjioTextView xItemLeft;

    private RowFlashPdpSizeBinding(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, RelativeLayout relativeLayout, View view, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, LinearLayout linearLayout2, AjioTextView ajioTextView4, AjioTextView ajioTextView5, RecyclerView recyclerView, AjioTextView ajioTextView6) {
        this.rootView = linearLayout;
        this.pdpImvNextSize = imageButton;
        this.pdpImvPrevSize = imageButton2;
        this.pdpSizeContainer = relativeLayout;
        this.pdpSizeDivider = view;
        this.pdpSizeInfoTvHeader = ajioTextView;
        this.pdpSizeInfoTvText = ajioTextView2;
        this.pdpSizeInfoUnit = ajioTextView3;
        this.pdpSizeLayout = linearLayout2;
        this.pdpSizeText = ajioTextView4;
        this.pdpSizeToolTip = ajioTextView5;
        this.productDetailSizeRv = recyclerView;
        this.xItemLeft = ajioTextView6;
    }

    public static RowFlashPdpSizeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.pdp_Imv_next_size;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageButton)view2;
        if (view3 != null) {
            n3 = R$id.pdp_Imv_prev_size;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (ImageButton)view2;
            if (view4 != null) {
                View view5;
                n3 = R$id.pdp_size_container;
                View view6 = view2 = dd2_2.a(n3, view);
                view6 = (RelativeLayout)view2;
                if (view6 != null && (view5 = dd2_2.a(n3 = R$id.pdp_size_divider, view)) != null) {
                    n3 = R$id.pdp_size_info_tv_header;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (AjioTextView)view2;
                    if (object2 != null) {
                        n3 = R$id.pdp_size_info_tv_text;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.pdp_size_info_unit;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (AjioTextView)view2;
                            if (object4 != null) {
                                View view7 = view;
                                view7 = (LinearLayout)view;
                                n3 = R$id.pdp_size_text;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AjioTextView)view2;
                                if (object5 != null) {
                                    n3 = R$id.pdp_size_tool_tip;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (AjioTextView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.product_detail_size_rv;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (RecyclerView)view2;
                                        if (object7 != null) {
                                            n3 = R$id.x_item_left;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (AjioTextView)view2;
                                            if (object8 != null) {
                                                object = new RowFlashPdpSizeBinding((LinearLayout)view7, (ImageButton)view3, (ImageButton)view4, (RelativeLayout)view6, view5, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (LinearLayout)view7, (AjioTextView)object5, (AjioTextView)object6, (RecyclerView)object7, (AjioTextView)object8);
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
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowFlashPdpSizeBinding inflate(LayoutInflater layoutInflater) {
        return RowFlashPdpSizeBinding.inflate(layoutInflater, null, false);
    }

    public static RowFlashPdpSizeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_flash_pdp_size;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowFlashPdpSizeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

