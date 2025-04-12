/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeClosetSizeLayoutBinding
implements BC3 {
    public final AjioTextView addBagTv;
    public final TextView brandSizeTv;
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final ImageView closetAddBagImg;
    public final LinearLayout closetSizeDialogAddToBag;
    public final AjioTextView closetSizeDialogCancelTv;
    public final AjioTextView closetSizeDialogHeaderTv;
    public final RecyclerView closetSizeDialogSizeRv;
    public final AjioTextView closetSizeDialogStdSizeTv;
    public final AjioLoaderView closetSizeProgressBar;
    public final AjioTextView closetSizeStockLeftTv;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;

    private LuxeClosetSizeLayoutBinding(LinearLayout linearLayout, AjioTextView ajioTextView, TextView textView, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, LinearLayout linearLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, RecyclerView recyclerView, AjioTextView ajioTextView4, AjioLoaderView ajioLoaderView, AjioTextView ajioTextView5, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.addBagTv = ajioTextView;
        this.brandSizeTv = textView;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.closetAddBagImg = imageView2;
        this.closetSizeDialogAddToBag = linearLayout2;
        this.closetSizeDialogCancelTv = ajioTextView2;
        this.closetSizeDialogHeaderTv = ajioTextView3;
        this.closetSizeDialogSizeRv = recyclerView;
        this.closetSizeDialogStdSizeTv = ajioTextView4;
        this.closetSizeProgressBar = ajioLoaderView;
        this.closetSizeStockLeftTv = ajioTextView5;
        this.parentLayout = linearLayout3;
    }

    public static LuxeClosetSizeLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.addBagTv;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.brand_size_tv;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.cancelBtn;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (ImageView)view2;
                if (view4 != null) {
                    n3 = R$id.cancelContainer;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (FrameLayout)view2;
                    if (view5 != null) {
                        n3 = R$id.closetAddBagImg;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (ImageView)view2;
                        if (view6 != null) {
                            n3 = R$id.closet_size_dialog_addToBag;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                n3 = R$id.closet_size_dialog_cancel_tv;
                                Object object3 = view2 = dd2_2.a(n3, view);
                                object3 = (AjioTextView)view2;
                                if (object3 != null) {
                                    n3 = R$id.closet_size_dialog_header_tv;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (AjioTextView)view2;
                                    if (object4 != null) {
                                        n3 = R$id.closet_size_dialog_sizeRv;
                                        Object object5 = view2 = dd2_2.a(n3, view);
                                        object5 = (RecyclerView)view2;
                                        if (object5 != null) {
                                            n3 = R$id.closet_size_dialog_std_size_tv;
                                            Object object6 = view2 = dd2_2.a(n3, view);
                                            object6 = (AjioTextView)view2;
                                            if (object6 != null) {
                                                n3 = R$id.closet_size_progress_bar;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (AjioLoaderView)view2;
                                                if (object7 != null) {
                                                    n3 = R$id.closet_size_stock_left_tv;
                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                    object8 = (AjioTextView)view2;
                                                    if (object8 != null) {
                                                        View view8 = view;
                                                        view8 = (LinearLayout)view;
                                                        object = new LuxeClosetSizeLayoutBinding((LinearLayout)view8, (AjioTextView)object2, (TextView)view3, (ImageView)view4, (FrameLayout)view5, (ImageView)view6, (LinearLayout)view7, (AjioTextView)object3, (AjioTextView)object4, (RecyclerView)object5, (AjioTextView)object6, (AjioLoaderView)((Object)object7), (AjioTextView)object8, (LinearLayout)view8);
                                                        return object;
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

    public static LuxeClosetSizeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxeClosetSizeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeClosetSizeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_closet_size_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeClosetSizeLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

