/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class BottomsheetCartDeleteLuxeBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final ConstraintLayout constraintButtons;
    public final RecyclerView idCartGwpList;
    public final AjioTextView idCartGwpTitle;
    public final ConstraintLayout idGwpLayout;
    public final ImageView imgThumbnail;
    public final TextView moveClosetBtn;
    public final ConstraintLayout parentLayout;
    public final TextView removeBtn;
    public final TextView removeHeader;
    private final ConstraintLayout rootView;

    private BottomsheetCartDeleteLuxeBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AjioTextView ajioTextView, ConstraintLayout constraintLayout3, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout4, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.constraintButtons = constraintLayout2;
        this.idCartGwpList = recyclerView;
        this.idCartGwpTitle = ajioTextView;
        this.idGwpLayout = constraintLayout3;
        this.imgThumbnail = imageView2;
        this.moveClosetBtn = textView;
        this.parentLayout = constraintLayout4;
        this.removeBtn = textView2;
        this.removeHeader = textView3;
    }

    public static BottomsheetCartDeleteLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.constraint_buttons;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (ConstraintLayout)view;
                if (object2 != null) {
                    n3 = R$id.id_cart_gwp_list;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (RecyclerView)view;
                    if (object3 != null) {
                        n3 = R$id.id_cart_gwp_title;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.id_gwp_layout;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (ConstraintLayout)view;
                            if (object5 != null) {
                                n3 = R$id.imgThumbnail;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (ImageView)view;
                                if (view4 != null) {
                                    n3 = R$id.moveClosetBtn;
                                    View view5 = view = dd2_2.a(n3, object);
                                    view5 = (TextView)view;
                                    if (view5 != null) {
                                        n3 = R$id.parent_layout;
                                        Object object6 = view = dd2_2.a(n3, object);
                                        object6 = (ConstraintLayout)view;
                                        if (object6 != null) {
                                            n3 = R$id.removeBtn;
                                            View view6 = view = dd2_2.a(n3, object);
                                            view6 = (TextView)view;
                                            if (view6 != null) {
                                                n3 = R$id.removeHeader;
                                                View view7 = view = dd2_2.a(n3, object);
                                                view7 = (TextView)view;
                                                if (view7 != null) {
                                                    Object object7 = object;
                                                    object7 = (ConstraintLayout)((Object)object);
                                                    BottomsheetCartDeleteLuxeBinding bottomsheetCartDeleteLuxeBinding = new BottomsheetCartDeleteLuxeBinding((ConstraintLayout)((Object)object7), (ImageView)view2, (FrameLayout)view3, (ConstraintLayout)((Object)object2), (RecyclerView)object3, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (ImageView)view4, (TextView)view5, (ConstraintLayout)((Object)object6), (TextView)view6, (TextView)view7);
                                                    return bottomsheetCartDeleteLuxeBinding;
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

    public static BottomsheetCartDeleteLuxeBinding inflate(LayoutInflater layoutInflater) {
        return BottomsheetCartDeleteLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static BottomsheetCartDeleteLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.bottomsheet_cart_delete_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BottomsheetCartDeleteLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

