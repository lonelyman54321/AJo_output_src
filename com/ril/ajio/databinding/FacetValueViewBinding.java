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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.AddressBarUiBinding;

public final class FacetValueViewBinding
implements BC3 {
    public final AddressBarUiBinding addressBarUi;
    public final Barrier barrier;
    public final AjioTextView categorySelectionTv;
    public final AjioTextView enterLocation;
    public final AjioTextView errorLocation;
    public final RecyclerView facetValueRv;
    public final AjioTextView filterMessage;
    public final ImageView includeUnratedProductSelectedIv;
    public final LinearLayout includeUnratedProductSelectedLl;
    public final ConstraintLayout rootView;
    private final ConstraintLayout rootView_;

    private FacetValueViewBinding(ConstraintLayout constraintLayout, AddressBarUiBinding addressBarUiBinding, Barrier barrier, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, RecyclerView recyclerView, AjioTextView ajioTextView4, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2) {
        this.rootView_ = constraintLayout;
        this.addressBarUi = addressBarUiBinding;
        this.barrier = barrier;
        this.categorySelectionTv = ajioTextView;
        this.enterLocation = ajioTextView2;
        this.errorLocation = ajioTextView3;
        this.facetValueRv = recyclerView;
        this.filterMessage = ajioTextView4;
        this.includeUnratedProductSelectedIv = imageView;
        this.includeUnratedProductSelectedLl = linearLayout;
        this.rootView = constraintLayout2;
    }

    public static FacetValueViewBinding bind(View object) {
        int n3 = R$id.address_bar_ui;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            AddressBarUiBinding addressBarUiBinding = AddressBarUiBinding.bind(view);
            n3 = R$id.barrier;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (Barrier)view;
            if (view2 != null) {
                n3 = R$id.category_selection_tv;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.enter_location;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.error_location;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.facet_value_rv;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (RecyclerView)view;
                            if (object5 != null) {
                                n3 = R$id.filter_message;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (AjioTextView)view;
                                if (object6 != null) {
                                    n3 = R$id.include_unrated_product_selected_iv;
                                    View view3 = view = dd2_2.a(n3, object);
                                    view3 = (ImageView)view;
                                    if (view3 != null) {
                                        n3 = R$id.include_unrated_product_selected_ll;
                                        View view4 = view = dd2_2.a(n3, object);
                                        view4 = (LinearLayout)view;
                                        if (view4 != null) {
                                            Object object7 = object;
                                            object7 = (ConstraintLayout)((Object)object);
                                            object = new FacetValueViewBinding((ConstraintLayout)((Object)object7), addressBarUiBinding, (Barrier)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (RecyclerView)object5, (AjioTextView)object6, (ImageView)view3, (LinearLayout)view4, (ConstraintLayout)((Object)object7));
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FacetValueViewBinding inflate(LayoutInflater layoutInflater) {
        return FacetValueViewBinding.inflate(layoutInflater, null, false);
    }

    public static FacetValueViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.facet_value_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FacetValueViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView_;
    }
}

