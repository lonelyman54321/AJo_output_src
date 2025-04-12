/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PdpLuxeSizeSelectionContainerLayoutBinding
implements BC3 {
    public final AjioTextView chooseSizeTitle;
    public final AjioTextView chooseSizeTitleSingleSize;
    public final ConstraintLayout pdpSizeContainer;
    private final ConstraintLayout rootView;
    public final ImageView selectSizeTriangle;
    public final ImageView sizeInfo;
    public final LinearLayout sizeInfoLayout;
    public final AjioTextView sizeInfoTv;
    public final AjioTextView sizeMeasurementsInfo;
    public final ImageView sizePdpDropDownArrow;
    public final View sizeViewClickContainer;

    private PdpLuxeSizeSelectionContainerLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, AjioTextView ajioTextView3, AjioTextView ajioTextView4, ImageView imageView3, View view) {
        this.rootView = constraintLayout;
        this.chooseSizeTitle = ajioTextView;
        this.chooseSizeTitleSingleSize = ajioTextView2;
        this.pdpSizeContainer = constraintLayout2;
        this.selectSizeTriangle = imageView;
        this.sizeInfo = imageView2;
        this.sizeInfoLayout = linearLayout;
        this.sizeInfoTv = ajioTextView3;
        this.sizeMeasurementsInfo = ajioTextView4;
        this.sizePdpDropDownArrow = imageView3;
        this.sizeViewClickContainer = view;
    }

    public static PdpLuxeSizeSelectionContainerLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.choose_size_title;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.choose_size_title_single_size;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.pdp_size_container;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (ConstraintLayout)view;
                if (object4 != null) {
                    n3 = R$id.select_size_triangle;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (ImageView)view;
                    if (view2 != null) {
                        n3 = R$id.size_info;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (ImageView)view;
                        if (view3 != null) {
                            n3 = R$id.size_info_layout;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (LinearLayout)view;
                            if (view4 != null) {
                                n3 = R$id.size_info_tv;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.size_measurements_info;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (AjioTextView)view;
                                    if (object6 != null) {
                                        View view5;
                                        n3 = R$id.size_pdp_drop_down_arrow;
                                        View view6 = view = dd2_2.a(n3, object);
                                        view6 = (ImageView)view;
                                        if (view6 != null && (view5 = dd2_2.a(n3 = R$id.size_view_click_container, object)) != null) {
                                            Object object7 = object;
                                            object7 = (ConstraintLayout)((Object)object);
                                            PdpLuxeSizeSelectionContainerLayoutBinding pdpLuxeSizeSelectionContainerLayoutBinding = new PdpLuxeSizeSelectionContainerLayoutBinding((ConstraintLayout)((Object)object7), (AjioTextView)object2, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (ImageView)view2, (ImageView)view3, (LinearLayout)view4, (AjioTextView)object5, (AjioTextView)object6, (ImageView)view6, view5);
                                            return pdpLuxeSizeSelectionContainerLayoutBinding;
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

    public static PdpLuxeSizeSelectionContainerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpLuxeSizeSelectionContainerLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpLuxeSizeSelectionContainerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_luxe_size_selection_container_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpLuxeSizeSelectionContainerLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

