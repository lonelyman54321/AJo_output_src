/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.SearchInfoLuxeBinding;
import com.ril.ajio.databinding.SearchSuggestionLuxeBinding;

public final class FragmentSearchLuxeBinding
implements BC3 {
    public final ImageView cancelImg;
    private final ConstraintLayout rootView;
    public final ImageView searchCancel;
    public final ConstraintLayout searchContainer;
    public final EditText searchETV;
    public final ConstraintLayout searchEditContainer;
    public final ImageView searchImage;
    public final SearchInfoLuxeBinding searchInfoContainer;
    public final SearchSuggestionLuxeBinding searchSuggestionContainer;

    private FragmentSearchLuxeBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, EditText editText, ConstraintLayout constraintLayout3, ImageView imageView3, SearchInfoLuxeBinding searchInfoLuxeBinding, SearchSuggestionLuxeBinding searchSuggestionLuxeBinding) {
        this.rootView = constraintLayout;
        this.cancelImg = imageView;
        this.searchCancel = imageView2;
        this.searchContainer = constraintLayout2;
        this.searchETV = editText;
        this.searchEditContainer = constraintLayout3;
        this.searchImage = imageView3;
        this.searchInfoContainer = searchInfoLuxeBinding;
        this.searchSuggestionContainer = searchSuggestionLuxeBinding;
    }

    public static FragmentSearchLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.cancel_img;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.search_cancel;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.search_container;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (ConstraintLayout)view;
                if (object2 != null) {
                    n3 = R$id.searchETV;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (EditText)view;
                    if (view4 != null) {
                        n3 = R$id.searchEditContainer;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (ConstraintLayout)view;
                        if (object3 != null) {
                            n3 = R$id.search_image;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (ImageView)view;
                            if (view5 != null && (view = dd2_2.a(n3 = R$id.searchInfoContainer, object)) != null) {
                                SearchInfoLuxeBinding searchInfoLuxeBinding = SearchInfoLuxeBinding.bind(view);
                                n3 = R$id.searchSuggestionContainer;
                                view = dd2_2.a(n3, object);
                                if (view != null) {
                                    SearchSuggestionLuxeBinding searchSuggestionLuxeBinding = SearchSuggestionLuxeBinding.bind(view);
                                    Object object4 = object;
                                    object4 = (ConstraintLayout)((Object)object);
                                    FragmentSearchLuxeBinding fragmentSearchLuxeBinding = new FragmentSearchLuxeBinding((ConstraintLayout)((Object)object4), (ImageView)view2, (ImageView)view3, (ConstraintLayout)((Object)object2), (EditText)view4, (ConstraintLayout)((Object)object3), (ImageView)view5, searchInfoLuxeBinding, searchSuggestionLuxeBinding);
                                    return fragmentSearchLuxeBinding;
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

    public static FragmentSearchLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSearchLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSearchLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_search_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSearchLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

