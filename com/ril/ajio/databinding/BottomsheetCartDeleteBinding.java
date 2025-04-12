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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class BottomsheetCartDeleteBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final ConstraintLayout constraintButtons;
    public final RecyclerView idCartGwpList;
    public final AjioTextView idCartGwpTitle;
    public final ConstraintLayout idGwpLayout;
    public final CardView imgContainer;
    public final ImageView imgThumbnail;
    public final TextView moveClosetBtn;
    public final TextView removeBtn;
    public final TextView removeHeader;
    public final TextView removeSubText;
    private final ConstraintLayout rootView;

    private BottomsheetCartDeleteBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AjioTextView ajioTextView, ConstraintLayout constraintLayout3, CardView cardView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.constraintButtons = constraintLayout2;
        this.idCartGwpList = recyclerView;
        this.idCartGwpTitle = ajioTextView;
        this.idGwpLayout = constraintLayout3;
        this.imgContainer = cardView;
        this.imgThumbnail = imageView2;
        this.moveClosetBtn = textView;
        this.removeBtn = textView2;
        this.removeHeader = textView3;
        this.removeSubText = textView4;
    }

    public static BottomsheetCartDeleteBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cancelBtn;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.cancelContainer;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (FrameLayout)view2;
            if (view4 != null) {
                n3 = R$id.constraint_buttons;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (ConstraintLayout)view2;
                if (object2 != null) {
                    n3 = R$id.id_cart_gwp_list;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (RecyclerView)view2;
                    if (object3 != null) {
                        n3 = R$id.id_cart_gwp_title;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioTextView)view2;
                        if (object4 != null) {
                            n3 = R$id.id_gwp_layout;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (ConstraintLayout)view2;
                            if (object5 != null) {
                                n3 = R$id.imgContainer;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (CardView)view2;
                                if (object6 != null) {
                                    n3 = R$id.imgThumbnail;
                                    View view5 = view2 = dd2_2.a(n3, view);
                                    view5 = (ImageView)view2;
                                    if (view5 != null) {
                                        n3 = R$id.moveClosetBtn;
                                        View view6 = view2 = dd2_2.a(n3, view);
                                        view6 = (TextView)view2;
                                        if (view6 != null) {
                                            n3 = R$id.removeBtn;
                                            View view7 = view2 = dd2_2.a(n3, view);
                                            view7 = (TextView)view2;
                                            if (view7 != null) {
                                                n3 = R$id.removeHeader;
                                                View view8 = view2 = dd2_2.a(n3, view);
                                                view8 = (TextView)view2;
                                                if (view8 != null) {
                                                    n3 = R$id.remove_sub_text;
                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                    view9 = (TextView)view2;
                                                    if (view9 != null) {
                                                        Object object7 = view;
                                                        object7 = (ConstraintLayout)view;
                                                        BottomsheetCartDeleteBinding bottomsheetCartDeleteBinding = new BottomsheetCartDeleteBinding((ConstraintLayout)((Object)object7), (ImageView)view3, (FrameLayout)view4, (ConstraintLayout)((Object)object2), (RecyclerView)object3, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (CardView)((Object)object6), (ImageView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (TextView)view9);
                                                        return bottomsheetCartDeleteBinding;
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static BottomsheetCartDeleteBinding inflate(LayoutInflater layoutInflater) {
        return BottomsheetCartDeleteBinding.inflate(layoutInflater, null, false);
    }

    public static BottomsheetCartDeleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.bottomsheet_cart_delete;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BottomsheetCartDeleteBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

