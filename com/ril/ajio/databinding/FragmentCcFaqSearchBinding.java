/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCcFaqSearchBinding
implements BC3 {
    public final ImageButton backArrow;
    public final ImageView crossImg;
    public final View dividerFaqSearch;
    public final RecyclerView faqSearchList;
    public final AjioProgressView fragmentSearchProgressView;
    public final AjioTextView noResultTv;
    private final RelativeLayout rootView;
    public final AjioEditText searchBox;
    public final RelativeLayout topBar;

    private FragmentCcFaqSearchBinding(RelativeLayout relativeLayout, ImageButton imageButton, ImageView imageView, View view, RecyclerView recyclerView, AjioProgressView ajioProgressView, AjioTextView ajioTextView, AjioEditText ajioEditText, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.backArrow = imageButton;
        this.crossImg = imageView;
        this.dividerFaqSearch = view;
        this.faqSearchList = recyclerView;
        this.fragmentSearchProgressView = ajioProgressView;
        this.noResultTv = ajioTextView;
        this.searchBox = ajioEditText;
        this.topBar = relativeLayout2;
    }

    public static FragmentCcFaqSearchBinding bind(View object) {
        View view;
        int n3 = R$id.back_arrow;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageButton)view;
        if (view2 != null) {
            View view3;
            n3 = R$id.cross_img;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (ImageView)view;
            if (view4 != null && (view3 = dd2_2.a(n3 = R$id.divider_faq_search, object)) != null) {
                n3 = R$id.faqSearchList;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (RecyclerView)view;
                if (object2 != null) {
                    n3 = R$id.fragment_search_progressView;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioProgressView)view;
                    if (object3 != null) {
                        n3 = R$id.no_result_tv;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.search_box;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioEditText)view;
                            if (object5 != null) {
                                n3 = R$id.top_bar;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (RelativeLayout)view;
                                if (view5 != null) {
                                    Object object6 = object;
                                    object6 = (RelativeLayout)object;
                                    FragmentCcFaqSearchBinding fragmentCcFaqSearchBinding = new FragmentCcFaqSearchBinding((RelativeLayout)object6, (ImageButton)view2, (ImageView)view4, view3, (RecyclerView)object2, (AjioProgressView)((Object)object3), (AjioTextView)object4, (AjioEditText)object5, (RelativeLayout)view5);
                                    return fragmentCcFaqSearchBinding;
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

    public static FragmentCcFaqSearchBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCcFaqSearchBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCcFaqSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cc_faq_search;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCcFaqSearchBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

