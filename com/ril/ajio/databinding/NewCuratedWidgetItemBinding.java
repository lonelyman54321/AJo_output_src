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
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewCuratedWidgetItemBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowShopTheLook;
    public final AjioRoundedCornerImageView widgetImage;
    public final ConstraintLayout widgetImageLayout;
    public final AjioImageView widgetImageLuxe;
    public final AjioTextView widgetSubTitle;
    public final AjioTextView widgetTitle;

    private NewCuratedWidgetItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView, ConstraintLayout constraintLayout3, AjioImageView ajioImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.rowShopTheLook = constraintLayout2;
        this.widgetImage = ajioRoundedCornerImageView;
        this.widgetImageLayout = constraintLayout3;
        this.widgetImageLuxe = ajioImageView;
        this.widgetSubTitle = ajioTextView;
        this.widgetTitle = ajioTextView2;
    }

    public static NewCuratedWidgetItemBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.widget_image;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (AjioRoundedCornerImageView)view;
        if (object3 != null) {
            n3 = R$id.widget_image_layout;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (ConstraintLayout)view;
            if (object4 != null) {
                n3 = R$id.widget_image_luxe;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioImageView)view;
                if (object5 != null) {
                    n3 = R$id.widget_sub_title;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        n3 = R$id.widget_title;
                        Object object7 = view = dd2_2.a(n3, object);
                        object7 = (AjioTextView)view;
                        if (object7 != null) {
                            Object object8 = object;
                            view = object2;
                            object = new NewCuratedWidgetItemBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (AjioRoundedCornerImageView)((Object)object3), (ConstraintLayout)((Object)object4), (AjioImageView)((Object)object5), (AjioTextView)object6, (AjioTextView)object7);
                            return object;
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

    public static NewCuratedWidgetItemBinding inflate(LayoutInflater layoutInflater) {
        return NewCuratedWidgetItemBinding.inflate(layoutInflater, null, false);
    }

    public static NewCuratedWidgetItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_curated_widget_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewCuratedWidgetItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

