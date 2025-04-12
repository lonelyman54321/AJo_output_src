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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class SearchHistoryNewRowRefreshBinding
implements BC3 {
    public final AjioImageView deleteButton;
    public final AjioTextView historyText;
    public final CardView imgContainer;
    public final ConstraintLayout recentContainer;
    private final ConstraintLayout rootView;
    public final ImageView searchImg;

    private SearchHistoryNewRowRefreshBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, AjioTextView ajioTextView, CardView cardView, ConstraintLayout constraintLayout2, ImageView imageView) {
        this.rootView = constraintLayout;
        this.deleteButton = ajioImageView;
        this.historyText = ajioTextView;
        this.imgContainer = cardView;
        this.recentContainer = constraintLayout2;
        this.searchImg = imageView;
    }

    public static SearchHistoryNewRowRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.delete_button;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
        if (object2 != null) {
            n3 = R$id.history_text;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.img_container;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (CardView)view;
                if (object4 != null) {
                    Object object5 = object;
                    object5 = (ConstraintLayout)((Object)object);
                    n3 = R$id.search_img;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (ImageView)view;
                    if (view2 != null) {
                        object = new SearchHistoryNewRowRefreshBinding((ConstraintLayout)((Object)object5), (AjioImageView)((Object)object2), (AjioTextView)object3, (CardView)((Object)object4), (ConstraintLayout)((Object)object5), (ImageView)view2);
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

    public static SearchHistoryNewRowRefreshBinding inflate(LayoutInflater layoutInflater) {
        return SearchHistoryNewRowRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static SearchHistoryNewRowRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_history_new_row_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchHistoryNewRowRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

