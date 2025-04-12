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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeEmptyWishistBinding
implements BC3 {
    public final ImageView emptyWishlistIcon;
    public final AjioTextView gotoBag;
    private final ConstraintLayout rootView;
    public final AjioTextView wishListEmptyMsg;
    public final AjioTextView wishlistEmptyTv;

    private LuxeEmptyWishistBinding(ConstraintLayout constraintLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.emptyWishlistIcon = imageView;
        this.gotoBag = ajioTextView;
        this.wishListEmptyMsg = ajioTextView2;
        this.wishlistEmptyTv = ajioTextView3;
    }

    public static LuxeEmptyWishistBinding bind(View object) {
        View view;
        int n3 = R$id.emptyWishlistIcon;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.gotoBag;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.wishListEmptyMsg;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.wishlistEmptyTv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        LuxeEmptyWishistBinding luxeEmptyWishistBinding = new LuxeEmptyWishistBinding((ConstraintLayout)((Object)object5), (ImageView)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4);
                        return luxeEmptyWishistBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeEmptyWishistBinding inflate(LayoutInflater layoutInflater) {
        return LuxeEmptyWishistBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeEmptyWishistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_empty_wishist;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeEmptyWishistBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

