/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.home.category.revamp.fastscroll.AlphabetIndexRecyclerView;

public final class FragmentLuxBrandBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final AppCompatImageView brandPageSearchIv;
    public final ImageView luxBrandImvBack;
    public final ConstraintLayout luxBrandPageHeaderView;
    public final AjioTextView luxBrandPgTitleTv;
    public final AlphabetIndexRecyclerView luxBrandRv;
    public final AjioTextView luxBrandTv;
    public final AjioTextView luxDivider;
    public final ConstraintLayout luxNavPageHeaderView;
    public final ConstraintLayout parentLyt;
    private final ConstraintLayout rootView;

    private FragmentLuxBrandBinding(ConstraintLayout constraintLayout, AjioLoaderView ajioLoaderView, AppCompatImageView appCompatImageView, ImageView imageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AlphabetIndexRecyclerView alphabetIndexRecyclerView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4) {
        this.rootView = constraintLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.brandPageSearchIv = appCompatImageView;
        this.luxBrandImvBack = imageView;
        this.luxBrandPageHeaderView = constraintLayout2;
        this.luxBrandPgTitleTv = ajioTextView;
        this.luxBrandRv = alphabetIndexRecyclerView;
        this.luxBrandTv = ajioTextView2;
        this.luxDivider = ajioTextView3;
        this.luxNavPageHeaderView = constraintLayout3;
        this.parentLyt = constraintLayout4;
    }

    public static FragmentLuxBrandBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioLoaderView)view;
        if (object2 != null) {
            n3 = R$id.brand_page_search_iv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppCompatImageView)view;
            if (object3 != null) {
                n3 = R$id.lux_brand_imv_back;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageView)view;
                if (view2 != null) {
                    n3 = R$id.lux_brand_page_header_view;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (ConstraintLayout)view;
                    if (object4 != null) {
                        n3 = R$id.lux_brand_pg_title_tv;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.lux_brand_rv;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AlphabetIndexRecyclerView)view;
                            if (object6 != null) {
                                n3 = R$id.lux_brand_tv;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.lux_divider;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        n3 = R$id.lux_nav_page_header_view;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (ConstraintLayout)view;
                                        if (object9 != null) {
                                            Object object10 = object;
                                            object10 = (ConstraintLayout)((Object)object);
                                            object = new FragmentLuxBrandBinding((ConstraintLayout)((Object)object10), (AjioLoaderView)((Object)object2), (AppCompatImageView)((Object)object3), (ImageView)view2, (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AlphabetIndexRecyclerView)object6, (AjioTextView)object7, (AjioTextView)object8, (ConstraintLayout)((Object)object9), (ConstraintLayout)((Object)object10));
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

    public static FragmentLuxBrandBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLuxBrandBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLuxBrandBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_lux_brand;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLuxBrandBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

