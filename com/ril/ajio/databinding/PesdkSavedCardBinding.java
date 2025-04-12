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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkSavedCardBinding
implements BC3 {
    public final ImageView cardImg;
    public final AjioTextView cardNum1;
    public final AjioTextView cardNum2;
    public final AjioTextView removeCard;
    private final CardView rootView;

    private PesdkSavedCardBinding(CardView cardView, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = cardView;
        this.cardImg = imageView;
        this.cardNum1 = ajioTextView;
        this.cardNum2 = ajioTextView2;
        this.removeCard = ajioTextView3;
    }

    public static PesdkSavedCardBinding bind(View object) {
        View view;
        int n3 = R$id.card_img;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.card_num_1;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.card_num_2;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.remove_card;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (CardView)((Object)object);
                        PesdkSavedCardBinding pesdkSavedCardBinding = new PesdkSavedCardBinding((CardView)((Object)object5), (ImageView)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4);
                        return pesdkSavedCardBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkSavedCardBinding inflate(LayoutInflater layoutInflater) {
        return PesdkSavedCardBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkSavedCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_saved_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkSavedCardBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

