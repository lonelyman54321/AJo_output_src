/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.databinding.NewRowSimilarToPdpBinding;
import com.ril.ajio.databinding.NewRowSimilarToTitleBinding;

public final class StlPopupFragmentLayoutBinding
implements BC3 {
    public final AjioAspectRatioImageView closeStl;
    public final LinearLayoutCompat parentLayout;
    private final LinearLayoutCompat rootView;
    public final NewRowSimilarToPdpBinding similarProductsLayout;
    public final NewRowSimilarToTitleBinding similarToTitleView;

    private StlPopupFragmentLayoutBinding(LinearLayoutCompat linearLayoutCompat, AjioAspectRatioImageView ajioAspectRatioImageView, LinearLayoutCompat linearLayoutCompat2, NewRowSimilarToPdpBinding newRowSimilarToPdpBinding, NewRowSimilarToTitleBinding newRowSimilarToTitleBinding) {
        this.rootView = linearLayoutCompat;
        this.closeStl = ajioAspectRatioImageView;
        this.parentLayout = linearLayoutCompat2;
        this.similarProductsLayout = newRowSimilarToPdpBinding;
        this.similarToTitleView = newRowSimilarToTitleBinding;
    }

    public static StlPopupFragmentLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.close_stl;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.parent_layout;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (LinearLayoutCompat)view;
            if (object3 != null && (view = dd2_2.a(n3 = R$id.similar_products_layout, object)) != null) {
                NewRowSimilarToPdpBinding newRowSimilarToPdpBinding = NewRowSimilarToPdpBinding.bind(view);
                n3 = R$id.similar_to_title_view;
                view = dd2_2.a(n3, object);
                if (view != null) {
                    NewRowSimilarToTitleBinding newRowSimilarToTitleBinding = NewRowSimilarToTitleBinding.bind(view);
                    Object object4 = object;
                    object4 = (LinearLayoutCompat)((Object)object);
                    StlPopupFragmentLayoutBinding stlPopupFragmentLayoutBinding = new StlPopupFragmentLayoutBinding((LinearLayoutCompat)((Object)object4), (AjioAspectRatioImageView)((Object)object2), (LinearLayoutCompat)((Object)object3), newRowSimilarToPdpBinding, newRowSimilarToTitleBinding);
                    return stlPopupFragmentLayoutBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static StlPopupFragmentLayoutBinding inflate(LayoutInflater layoutInflater) {
        return StlPopupFragmentLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static StlPopupFragmentLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.stl_popup_fragment_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return StlPopupFragmentLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}

