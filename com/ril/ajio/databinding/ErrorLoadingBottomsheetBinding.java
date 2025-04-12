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

public final class ErrorLoadingBottomsheetBinding
implements BC3 {
    public final AjioTextView ctaButton;
    public final AjioImageView errorImageview;
    private final ConstraintLayout rootView;
    public final AjioTextView subtitleTextview;
    public final AjioTextView titleTextview;

    private ErrorLoadingBottomsheetBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioImageView ajioImageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.ctaButton = ajioTextView;
        this.errorImageview = ajioImageView;
        this.subtitleTextview = ajioTextView2;
        this.titleTextview = ajioTextView3;
    }

    public static ErrorLoadingBottomsheetBinding bind(View object) {
        View view;
        int n3 = R$id.cta_button;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.error_imageview;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioImageView)view;
            if (object3 != null) {
                n3 = R$id.subtitle_textview;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.title_textview;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (ConstraintLayout)((Object)object);
                        ErrorLoadingBottomsheetBinding errorLoadingBottomsheetBinding = new ErrorLoadingBottomsheetBinding((ConstraintLayout)((Object)object6), (AjioTextView)object2, (AjioImageView)((Object)object3), (AjioTextView)object4, (AjioTextView)object5);
                        return errorLoadingBottomsheetBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ErrorLoadingBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return ErrorLoadingBottomsheetBinding.inflate(layoutInflater, null, false);
    }

    public static ErrorLoadingBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.error_loading_bottomsheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ErrorLoadingBottomsheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

