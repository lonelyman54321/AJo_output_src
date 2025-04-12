/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkFrgmentSavedCardBinding
implements BC3 {
    public final AjioTextView noSavedCard;
    private final LinearLayout rootView;
    public final RecyclerView savedcardList;

    private PesdkFrgmentSavedCardBinding(LinearLayout linearLayout, AjioTextView ajioTextView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.noSavedCard = ajioTextView;
        this.savedcardList = recyclerView;
    }

    public static PesdkFrgmentSavedCardBinding bind(View object) {
        RecyclerView recyclerView;
        int n3 = R$id.no_saved_card;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.savedcard_list, object)) != null) {
            object = (LinearLayout)object;
            PesdkFrgmentSavedCardBinding pesdkFrgmentSavedCardBinding = new PesdkFrgmentSavedCardBinding((LinearLayout)object, ajioTextView, recyclerView);
            return pesdkFrgmentSavedCardBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkFrgmentSavedCardBinding inflate(LayoutInflater layoutInflater) {
        return PesdkFrgmentSavedCardBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkFrgmentSavedCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_frgment_saved_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkFrgmentSavedCardBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

