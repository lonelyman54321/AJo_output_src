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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CategoryFacetSubtitleRowViewBinding
implements BC3 {
    public final AjioTextView categoryFacetSubtitleNoResultTv;
    public final ImageView categoryFacetSubtitleRowBackIv;
    public final AjioTextView categoryFacetSubtitleRowClearTv;
    public final RecyclerView categoryFacetSubtitleRowRv;
    public final AjioEditText categoryFacetSubtitleRowSearchEt;
    public final ImageView categoryFacetSubtitleRowSearchIv;
    public final LinearLayout categoryFacetSubtitleRowSearchLayout;
    public final LinearLayout categoryFacetSubtitleRowTitleLayout;
    public final AjioTextView categoryFacetSubtitleRowTitleTv;
    private final LinearLayout rootView;

    private CategoryFacetSubtitleRowViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView, ImageView imageView, AjioTextView ajioTextView2, RecyclerView recyclerView, AjioEditText ajioEditText, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.categoryFacetSubtitleNoResultTv = ajioTextView;
        this.categoryFacetSubtitleRowBackIv = imageView;
        this.categoryFacetSubtitleRowClearTv = ajioTextView2;
        this.categoryFacetSubtitleRowRv = recyclerView;
        this.categoryFacetSubtitleRowSearchEt = ajioEditText;
        this.categoryFacetSubtitleRowSearchIv = imageView2;
        this.categoryFacetSubtitleRowSearchLayout = linearLayout2;
        this.categoryFacetSubtitleRowTitleLayout = linearLayout3;
        this.categoryFacetSubtitleRowTitleTv = ajioTextView3;
    }

    public static CategoryFacetSubtitleRowViewBinding bind(View object) {
        View view;
        int n3 = R$id.category_facet_subtitle_no_result_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.category_facet_subtitle_row_back_iv;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.category_facet_subtitle_row_clear_tv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.category_facet_subtitle_row_rv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (RecyclerView)view;
                    if (object4 != null) {
                        n3 = R$id.category_facet_subtitle_row_search_et;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioEditText)view;
                        if (object5 != null) {
                            n3 = R$id.category_facet_subtitle_row_search_iv;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (ImageView)view;
                            if (view3 != null) {
                                n3 = R$id.category_facet_subtitle_row_search_layout;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (LinearLayout)view;
                                if (view4 != null) {
                                    n3 = R$id.category_facet_subtitle_row_title_layout;
                                    View view5 = view = dd2_2.a(n3, object);
                                    view5 = (LinearLayout)view;
                                    if (view5 != null) {
                                        n3 = R$id.category_facet_subtitle_row_title_tv;
                                        Object object6 = view = dd2_2.a(n3, object);
                                        object6 = (AjioTextView)view;
                                        if (object6 != null) {
                                            Object object7 = object;
                                            object7 = (LinearLayout)object;
                                            CategoryFacetSubtitleRowViewBinding categoryFacetSubtitleRowViewBinding = new CategoryFacetSubtitleRowViewBinding((LinearLayout)object7, (AjioTextView)object2, (ImageView)view2, (AjioTextView)object3, (RecyclerView)object4, (AjioEditText)object5, (ImageView)view3, (LinearLayout)view4, (LinearLayout)view5, (AjioTextView)object6);
                                            return categoryFacetSubtitleRowViewBinding;
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

    public static CategoryFacetSubtitleRowViewBinding inflate(LayoutInflater layoutInflater) {
        return CategoryFacetSubtitleRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static CategoryFacetSubtitleRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.category_facet_subtitle_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CategoryFacetSubtitleRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

