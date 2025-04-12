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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeCategoryFilterLayoutBinding
implements BC3 {
    public final ImageView categoryCancelIv;
    public final FrameLayout categoryCancelView;
    public final AjioTextView categoryFacetTitleTv;
    public final AjioTextView categoryFacetViewAllTv;
    public final ConstraintLayout categoryFilterParentView;
    public final LinearLayout filterFooterLayout;
    public final AjioTextView filterViewApplyFilterTv;
    public final AjioTextView filterViewCancelTv;
    public final FrameLayout filterViewFacetValueFragContainer;
    private final ConstraintLayout rootView;
    public final ConstraintLayout titleView;

    private LuxeCategoryFilterLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2, LinearLayout linearLayout, AjioTextView ajioTextView3, AjioTextView ajioTextView4, FrameLayout frameLayout2, ConstraintLayout constraintLayout3) {
        this.rootView = constraintLayout;
        this.categoryCancelIv = imageView;
        this.categoryCancelView = frameLayout;
        this.categoryFacetTitleTv = ajioTextView;
        this.categoryFacetViewAllTv = ajioTextView2;
        this.categoryFilterParentView = constraintLayout2;
        this.filterFooterLayout = linearLayout;
        this.filterViewApplyFilterTv = ajioTextView3;
        this.filterViewCancelTv = ajioTextView4;
        this.filterViewFacetValueFragContainer = frameLayout2;
        this.titleView = constraintLayout3;
    }

    public static LuxeCategoryFilterLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.category_cancel_iv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.category_cancel_view;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.category_facet_title_tv;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.category_facet_view_all_tv;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (ConstraintLayout)((Object)object);
                        n3 = R$id.filter_footer_layout;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (LinearLayout)view;
                        if (view4 != null) {
                            n3 = R$id.filter_view_apply_filter_tv;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                n3 = R$id.filter_view_cancel_tv;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (AjioTextView)view;
                                if (object6 != null) {
                                    n3 = R$id.filter_view_facet_value_frag_container;
                                    View view5 = view = dd2_2.a(n3, object);
                                    view5 = (FrameLayout)view;
                                    if (view5 != null) {
                                        n3 = R$id.title_view;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (ConstraintLayout)view;
                                        if (object7 != null) {
                                            object = new LuxeCategoryFilterLayoutBinding((ConstraintLayout)((Object)object4), (ImageView)view2, (FrameLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (LinearLayout)view4, (AjioTextView)object5, (AjioTextView)object6, (FrameLayout)view5, (ConstraintLayout)((Object)object7));
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

    public static LuxeCategoryFilterLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxeCategoryFilterLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeCategoryFilterLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_category_filter_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeCategoryFilterLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

