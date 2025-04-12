/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class SearchSuggestionLuxeBinding
implements BC3 {
    private final LinearLayout rootView;
    public final ConstraintLayout searchSuggestStoreContainer;
    public final TextView searchSuggestStoreText;
    public final TextView searchSuggestStoreTv;
    public final TextView sorryMsg;
    public final ImageView suggestStoreLogo;
    public final TextView suggestVisitStore;

    private SearchSuggestionLuxeBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4) {
        this.rootView = linearLayout;
        this.searchSuggestStoreContainer = constraintLayout;
        this.searchSuggestStoreText = textView;
        this.searchSuggestStoreTv = textView2;
        this.sorryMsg = textView3;
        this.suggestStoreLogo = imageView;
        this.suggestVisitStore = textView4;
    }

    public static SearchSuggestionLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.search_suggest_store_container;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.search_suggest_store_text;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.search_suggest_store_tv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.sorry_msg;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.suggest_store_logo;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ImageView)view;
                        if (view5 != null) {
                            n3 = R$id.suggest_visit_store;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                Object object3 = object;
                                object3 = (LinearLayout)object;
                                SearchSuggestionLuxeBinding searchSuggestionLuxeBinding = new SearchSuggestionLuxeBinding((LinearLayout)object3, (ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (ImageView)view5, (TextView)view6);
                                return searchSuggestionLuxeBinding;
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

    public static SearchSuggestionLuxeBinding inflate(LayoutInflater layoutInflater) {
        return SearchSuggestionLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static SearchSuggestionLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_suggestion_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchSuggestionLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

