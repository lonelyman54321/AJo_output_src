/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class SearchViewRowBinding
implements BC3 {
    public final LinearLayout recentHistoryContainer;
    public final TextView recentOption;
    public final TextView recentSearchTv;
    private final FrameLayout rootView;
    public final RecyclerView rvSearchHistory;

    private SearchViewRowBinding(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, TextView textView2, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.recentHistoryContainer = linearLayout;
        this.recentOption = textView;
        this.recentSearchTv = textView2;
        this.rvSearchHistory = recyclerView;
    }

    public static SearchViewRowBinding bind(View object) {
        View view;
        int n3 = R$id.recent_history_container;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.recent_option;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.recent_search_tv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.rv_search_history;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (RecyclerView)view;
                    if (object2 != null) {
                        Object object3 = object;
                        object3 = (FrameLayout)object;
                        SearchViewRowBinding searchViewRowBinding = new SearchViewRowBinding((FrameLayout)object3, (LinearLayout)view2, (TextView)view3, (TextView)view4, (RecyclerView)object2);
                        return searchViewRowBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SearchViewRowBinding inflate(LayoutInflater layoutInflater) {
        return SearchViewRowBinding.inflate(layoutInflater, null, false);
    }

    public static SearchViewRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_view_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchViewRowBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

