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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PdpFreebieItemBinding
implements BC3 {
    public final ImageView freebieImage;
    public final ConstraintLayout freebieItemLyt;
    public final RecyclerView productsRecyclerView;
    private final ConstraintLayout rootView;
    public final AjioTextView subTitleTextView;
    public final AjioTextView tcTextView;
    public final AjioTextView titleTextView;

    private PdpFreebieItemBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.freebieImage = imageView;
        this.freebieItemLyt = constraintLayout2;
        this.productsRecyclerView = recyclerView;
        this.subTitleTextView = ajioTextView;
        this.tcTextView = ajioTextView2;
        this.titleTextView = ajioTextView3;
    }

    public static PdpFreebieItemBinding bind(View object) {
        View view;
        int n3 = R$id.freebieImage;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            n3 = R$id.productsRecyclerView;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null) {
                n3 = R$id.subTitleTextView;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.tcTextView;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.titleTextView;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            object = new PdpFreebieItemBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (ConstraintLayout)((Object)object2), (RecyclerView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
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

    public static PdpFreebieItemBinding inflate(LayoutInflater layoutInflater) {
        return PdpFreebieItemBinding.inflate(layoutInflater, null, false);
    }

    public static PdpFreebieItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_freebie_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpFreebieItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

