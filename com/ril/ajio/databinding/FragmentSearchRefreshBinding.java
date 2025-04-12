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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.SearchInfoRefreshBinding;

public final class FragmentSearchRefreshBinding
implements BC3 {
    public final ImageView cancelImg;
    public final ImageView clearButton;
    public final ImageView ivCamera;
    private final ConstraintLayout rootView;
    public final ConstraintLayout searchContainer;
    public final EditText searchETV;
    public final ConstraintLayout searchEditContainer;
    public final ImageView searchImage;
    public final SearchInfoRefreshBinding searchInfoContainer;
    public final RecyclerView searchList;
    public final View searchSuggestionContainer;

    private FragmentSearchRefreshBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, EditText editText, ConstraintLayout constraintLayout3, ImageView imageView4, SearchInfoRefreshBinding searchInfoRefreshBinding, RecyclerView recyclerView, View view) {
        this.rootView = constraintLayout;
        this.cancelImg = imageView;
        this.clearButton = imageView2;
        this.ivCamera = imageView3;
        this.searchContainer = constraintLayout2;
        this.searchETV = editText;
        this.searchEditContainer = constraintLayout3;
        this.searchImage = imageView4;
        this.searchInfoContainer = searchInfoRefreshBinding;
        this.searchList = recyclerView;
        this.searchSuggestionContainer = view;
    }

    public static FragmentSearchRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cancel_img;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.clear_button;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.iv_camera;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.search_container;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (ConstraintLayout)view;
                    if (object2 != null) {
                        n3 = R$id.searchETV;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (EditText)view;
                        if (view5 != null) {
                            n3 = R$id.searchEditContainer;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (ConstraintLayout)view;
                            if (object3 != null) {
                                n3 = R$id.search_image;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (ImageView)view;
                                if (view6 != null && (view = dd2_2.a(n3 = R$id.searchInfoContainer, object)) != null) {
                                    View view7;
                                    SearchInfoRefreshBinding searchInfoRefreshBinding = SearchInfoRefreshBinding.bind(view);
                                    n3 = R$id.searchList;
                                    Object object4 = view = dd2_2.a(n3, object);
                                    object4 = (RecyclerView)view;
                                    if (object4 != null && (view7 = dd2_2.a(n3 = R$id.searchSuggestionContainer, object)) != null) {
                                        Object object5 = object;
                                        object5 = (ConstraintLayout)((Object)object);
                                        FragmentSearchRefreshBinding fragmentSearchRefreshBinding = new FragmentSearchRefreshBinding((ConstraintLayout)((Object)object5), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ConstraintLayout)((Object)object2), (EditText)view5, (ConstraintLayout)((Object)object3), (ImageView)view6, searchInfoRefreshBinding, (RecyclerView)object4, view7);
                                        return fragmentSearchRefreshBinding;
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

    public static FragmentSearchRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSearchRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSearchRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_search_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSearchRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

