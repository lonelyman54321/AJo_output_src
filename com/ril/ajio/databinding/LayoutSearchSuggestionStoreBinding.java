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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutSearchSuggestionStoreBinding
implements BC3 {
    public final ConstraintLayout clStore;
    public final AjioImageView imvArrow;
    public final AjioImageView imvStore;
    private final ConstraintLayout rootView;
    public final AjioTextView searchSuggestion;
    public final AjioTextView searchTyoe;

    private LayoutSearchSuggestionStoreBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.clStore = constraintLayout2;
        this.imvArrow = ajioImageView;
        this.imvStore = ajioImageView2;
        this.searchSuggestion = ajioTextView;
        this.searchTyoe = ajioTextView2;
    }

    public static LayoutSearchSuggestionStoreBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.imvArrow;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (AjioImageView)view;
        if (object3 != null) {
            n3 = R$id.imvStore;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioImageView)view;
            if (object4 != null) {
                n3 = R$id.searchSuggestion;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    n3 = R$id.searchTyoe;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        Object object7 = object;
                        view = object2;
                        object = new LayoutSearchSuggestionStoreBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSearchSuggestionStoreBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSearchSuggestionStoreBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSearchSuggestionStoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_search_suggestion_store;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSearchSuggestionStoreBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

