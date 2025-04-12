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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewSpcAssuredGiftBinding
implements BC3 {
    public final AppCompatImageView icSpcAssuredGift;
    public final ConstraintLayout idAjioSpcAssuredGift;
    public final AjioTextView idSpcGiftDetails;
    public final AjioTextView idSpcGiftTitle;
    public final View idViewLine;
    private final ConstraintLayout rootView;

    private ViewSpcAssuredGiftBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, View view) {
        this.rootView = constraintLayout;
        this.icSpcAssuredGift = appCompatImageView;
        this.idAjioSpcAssuredGift = constraintLayout2;
        this.idSpcGiftDetails = ajioTextView;
        this.idSpcGiftTitle = ajioTextView2;
        this.idViewLine = view;
    }

    public static ViewSpcAssuredGiftBinding bind(View object) {
        View view;
        int n3 = R$id.ic_spc_assured_gift;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            Object object3 = object;
            object3 = (ConstraintLayout)((Object)object);
            n3 = R$id.id_spc_gift_details;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                View view2;
                n3 = R$id.id_spc_gift_title;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null && (view2 = dd2_2.a(n3 = R$id.id_view_line, object)) != null) {
                    object = new ViewSpcAssuredGiftBinding((ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, view2);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewSpcAssuredGiftBinding inflate(LayoutInflater layoutInflater) {
        return ViewSpcAssuredGiftBinding.inflate(layoutInflater, null, false);
    }

    public static ViewSpcAssuredGiftBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_spc_assured_gift;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewSpcAssuredGiftBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

