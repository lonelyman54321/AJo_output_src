/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;

public final class ActivityClosetAddToBagBinding
implements BC3 {
    public final Button addToBag;
    public final Button cancel;
    public final AjioImageView decrementProductButton;
    public final RelativeLayout dialogLayout;
    public final AjioProgressView fragmentCartListProgressBar;
    public final AjioImageView incrementProductButton;
    public final TextView quantity;
    public final LinearLayout quantityLayout;
    private final FrameLayout rootView;
    public final RecyclerView sizeContainer;
    public final ImageButton sizeDecrement;
    public final ImageButton sizeIncrement;

    private ActivityClosetAddToBagBinding(FrameLayout frameLayout, Button button, Button button2, AjioImageView ajioImageView, RelativeLayout relativeLayout, AjioProgressView ajioProgressView, AjioImageView ajioImageView2, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, ImageButton imageButton, ImageButton imageButton2) {
        this.rootView = frameLayout;
        this.addToBag = button;
        this.cancel = button2;
        this.decrementProductButton = ajioImageView;
        this.dialogLayout = relativeLayout;
        this.fragmentCartListProgressBar = ajioProgressView;
        this.incrementProductButton = ajioImageView2;
        this.quantity = textView;
        this.quantityLayout = linearLayout;
        this.sizeContainer = recyclerView;
        this.sizeDecrement = imageButton;
        this.sizeIncrement = imageButton2;
    }

    public static ActivityClosetAddToBagBinding bind(View object) {
        View view;
        int n3 = R$id.addToBag;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Button)view;
        if (view2 != null) {
            n3 = R$id.cancel;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (Button)view;
            if (view3 != null) {
                n3 = R$id.decrement_product_button;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioImageView)view;
                if (object2 != null) {
                    n3 = R$id.dialog_layout;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (RelativeLayout)view;
                    if (view4 != null) {
                        n3 = R$id.fragment_cart_list_progress_bar;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioProgressView)view;
                        if (object3 != null) {
                            n3 = R$id.increment_product_button;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioImageView)view;
                            if (object4 != null) {
                                n3 = R$id.quantity;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (TextView)view;
                                if (view5 != null) {
                                    n3 = R$id.quantity_layout;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (LinearLayout)view;
                                    if (view6 != null) {
                                        n3 = R$id.size_container;
                                        Object object5 = view = dd2_2.a(n3, object);
                                        object5 = (RecyclerView)view;
                                        if (object5 != null) {
                                            n3 = R$id.size_decrement;
                                            View view7 = view = dd2_2.a(n3, object);
                                            view7 = (ImageButton)view;
                                            if (view7 != null) {
                                                n3 = R$id.size_increment;
                                                View view8 = view = dd2_2.a(n3, object);
                                                view8 = (ImageButton)view;
                                                if (view8 != null) {
                                                    Object object6 = object;
                                                    object6 = (FrameLayout)object;
                                                    ActivityClosetAddToBagBinding activityClosetAddToBagBinding = new ActivityClosetAddToBagBinding((FrameLayout)object6, (Button)view2, (Button)view3, (AjioImageView)((Object)object2), (RelativeLayout)view4, (AjioProgressView)((Object)object3), (AjioImageView)((Object)object4), (TextView)view5, (LinearLayout)view6, (RecyclerView)object5, (ImageButton)view7, (ImageButton)view8);
                                                    return activityClosetAddToBagBinding;
                                                }
                                            }
                                        }
                                    }
                                }
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

    public static ActivityClosetAddToBagBinding inflate(LayoutInflater layoutInflater) {
        return ActivityClosetAddToBagBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityClosetAddToBagBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_closet_add_to_bag;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityClosetAddToBagBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

