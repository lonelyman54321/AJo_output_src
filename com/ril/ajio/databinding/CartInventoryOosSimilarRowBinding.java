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
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartInventoryOosSimilarRowBinding
implements BC3 {
    public final TextView cartS1S2Info;
    public final TextView moveToWishlistBtn;
    public final ShimmerFrameLayout oosSimilarShimmer1;
    public final ShimmerFrameLayout oosSimilarShimmer2;
    public final LinearLayout oosSimilarShimmerContainer1;
    public final LinearLayout oosSimilarShimmerContainer2;
    public final TextView price;
    public final TextView productBrandTv;
    public final ImageView productImg;
    public final CardView productImgContainer;
    public final RelativeLayout productInfoContainer;
    public final TextView productTitle;
    public final LinearLayout qtyContainer;
    public final TextView qtyInfo;
    public final TextView qtyText;
    public final TextView removeBtn;
    private final FrameLayout rootView;
    public final TextView shopSimilar;
    public final ImageView similarImg1;
    public final ImageView similarImg2;
    public final ImageView similarImg3;
    public final ImageView similarImg4;
    public final CardView similarImgContainer1;
    public final CardView similarImgContainer2;
    public final CardView similarImgContainer3;
    public final CardView similarImgContainer4;
    public final View similarSpace;
    public final LinearLayout sizeContainer;
    public final TextView sizeInfo;
    public final ConstraintLayout sizeQtyContainer;
    public final TextView sizeText;

    private CartInventoryOosSimilarRowBinding(FrameLayout frameLayout, TextView textView, TextView textView2, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView3, TextView textView4, ImageView imageView, CardView cardView, RelativeLayout relativeLayout, TextView textView5, LinearLayout linearLayout3, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, View view, LinearLayout linearLayout4, TextView textView10, ConstraintLayout constraintLayout, TextView textView11) {
        this.rootView = frameLayout;
        this.cartS1S2Info = textView;
        this.moveToWishlistBtn = textView2;
        this.oosSimilarShimmer1 = shimmerFrameLayout;
        this.oosSimilarShimmer2 = shimmerFrameLayout2;
        this.oosSimilarShimmerContainer1 = linearLayout;
        this.oosSimilarShimmerContainer2 = linearLayout2;
        this.price = textView3;
        this.productBrandTv = textView4;
        this.productImg = imageView;
        this.productImgContainer = cardView;
        this.productInfoContainer = relativeLayout;
        this.productTitle = textView5;
        this.qtyContainer = linearLayout3;
        this.qtyInfo = textView6;
        this.qtyText = textView7;
        this.removeBtn = textView8;
        this.shopSimilar = textView9;
        this.similarImg1 = imageView2;
        this.similarImg2 = imageView3;
        this.similarImg3 = imageView4;
        this.similarImg4 = imageView5;
        this.similarImgContainer1 = cardView2;
        this.similarImgContainer2 = cardView3;
        this.similarImgContainer3 = cardView4;
        this.similarImgContainer4 = cardView5;
        this.similarSpace = view;
        this.sizeContainer = linearLayout4;
        this.sizeInfo = textView10;
        this.sizeQtyContainer = constraintLayout;
        this.sizeText = textView11;
    }

    public static CartInventoryOosSimilarRowBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cartS1S2Info;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.moveToWishlistBtn;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.oosSimilarShimmer1;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (ShimmerFrameLayout)view2;
                if (object2 != null) {
                    n3 = R$id.oosSimilarShimmer2;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (ShimmerFrameLayout)view2;
                    if (object3 != null) {
                        n3 = R$id.oosSimilarShimmerContainer1;
                        View view5 = view2 = dd2_2.a(n3, view);
                        view5 = (LinearLayout)view2;
                        if (view5 != null) {
                            n3 = R$id.oosSimilarShimmerContainer2;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (LinearLayout)view2;
                            if (view6 != null) {
                                n3 = R$id.price;
                                View view7 = view2 = dd2_2.a(n3, view);
                                view7 = (TextView)view2;
                                if (view7 != null) {
                                    n3 = R$id.productBrandTv;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (TextView)view2;
                                    if (view8 != null) {
                                        n3 = R$id.productImg;
                                        View view9 = view2 = dd2_2.a(n3, view);
                                        view9 = (ImageView)view2;
                                        if (view9 != null) {
                                            n3 = R$id.productImgContainer;
                                            Object object4 = view2 = dd2_2.a(n3, view);
                                            object4 = (CardView)view2;
                                            if (object4 != null) {
                                                n3 = R$id.productInfoContainer;
                                                View view10 = view2 = dd2_2.a(n3, view);
                                                view10 = (RelativeLayout)view2;
                                                if (view10 != null) {
                                                    n3 = R$id.productTitle;
                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                    view11 = (TextView)view2;
                                                    if (view11 != null) {
                                                        n3 = R$id.qtyContainer;
                                                        View view12 = view2 = dd2_2.a(n3, view);
                                                        view12 = (LinearLayout)view2;
                                                        if (view12 != null) {
                                                            n3 = R$id.qtyInfo;
                                                            View view13 = view2 = dd2_2.a(n3, view);
                                                            view13 = (TextView)view2;
                                                            if (view13 != null) {
                                                                n3 = R$id.qtyText;
                                                                View view14 = view2 = dd2_2.a(n3, view);
                                                                view14 = (TextView)view2;
                                                                if (view14 != null) {
                                                                    n3 = R$id.removeBtn;
                                                                    View view15 = view2 = dd2_2.a(n3, view);
                                                                    view15 = (TextView)view2;
                                                                    if (view15 != null) {
                                                                        n3 = R$id.shopSimilar;
                                                                        View view16 = view2 = dd2_2.a(n3, view);
                                                                        view16 = (TextView)view2;
                                                                        if (view16 != null) {
                                                                            n3 = R$id.similarImg1;
                                                                            View view17 = view2 = dd2_2.a(n3, view);
                                                                            view17 = (ImageView)view2;
                                                                            if (view17 != null) {
                                                                                n3 = R$id.similarImg2;
                                                                                View view18 = view2 = dd2_2.a(n3, view);
                                                                                view18 = (ImageView)view2;
                                                                                if (view18 != null) {
                                                                                    n3 = R$id.similarImg3;
                                                                                    View view19 = view2 = dd2_2.a(n3, view);
                                                                                    view19 = (ImageView)view2;
                                                                                    if (view19 != null) {
                                                                                        n3 = R$id.similarImg4;
                                                                                        View view20 = view2 = dd2_2.a(n3, view);
                                                                                        view20 = (ImageView)view2;
                                                                                        if (view20 != null) {
                                                                                            n3 = R$id.similarImgContainer1;
                                                                                            Object object5 = view2 = dd2_2.a(n3, view);
                                                                                            object5 = (CardView)view2;
                                                                                            if (object5 != null) {
                                                                                                n3 = R$id.similarImgContainer2;
                                                                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                                                                object6 = (CardView)view2;
                                                                                                if (object6 != null) {
                                                                                                    n3 = R$id.similarImgContainer3;
                                                                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                                                                    object7 = (CardView)view2;
                                                                                                    if (object7 != null) {
                                                                                                        View view21;
                                                                                                        n3 = R$id.similarImgContainer4;
                                                                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                                                                        object8 = (CardView)view2;
                                                                                                        if (object8 != null && (view21 = dd2_2.a(n3 = R$id.similarSpace, view)) != null) {
                                                                                                            n3 = R$id.sizeContainer;
                                                                                                            View view22 = view2 = dd2_2.a(n3, view);
                                                                                                            view22 = (LinearLayout)view2;
                                                                                                            if (view22 != null) {
                                                                                                                n3 = R$id.sizeInfo;
                                                                                                                View view23 = view2 = dd2_2.a(n3, view);
                                                                                                                view23 = (TextView)view2;
                                                                                                                if (view23 != null) {
                                                                                                                    n3 = R$id.sizeQtyContainer;
                                                                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                                                                    object9 = (ConstraintLayout)view2;
                                                                                                                    if (object9 != null) {
                                                                                                                        n3 = R$id.sizeText;
                                                                                                                        View view24 = view2 = dd2_2.a(n3, view);
                                                                                                                        view24 = (TextView)view2;
                                                                                                                        if (view24 != null) {
                                                                                                                            View view25 = view;
                                                                                                                            view25 = (FrameLayout)view;
                                                                                                                            CartInventoryOosSimilarRowBinding cartInventoryOosSimilarRowBinding = new CartInventoryOosSimilarRowBinding((FrameLayout)view25, (TextView)view3, (TextView)view4, (ShimmerFrameLayout)((Object)object2), (ShimmerFrameLayout)((Object)object3), (LinearLayout)view5, (LinearLayout)view6, (TextView)view7, (TextView)view8, (ImageView)view9, (CardView)((Object)object4), (RelativeLayout)view10, (TextView)view11, (LinearLayout)view12, (TextView)view13, (TextView)view14, (TextView)view15, (TextView)view16, (ImageView)view17, (ImageView)view18, (ImageView)view19, (ImageView)view20, (CardView)((Object)object5), (CardView)((Object)object6), (CardView)((Object)object7), (CardView)((Object)object8), view21, (LinearLayout)view22, (TextView)view23, (ConstraintLayout)((Object)object9), (TextView)view24);
                                                                                                                            return cartInventoryOosSimilarRowBinding;
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

    public static CartInventoryOosSimilarRowBinding inflate(LayoutInflater layoutInflater) {
        return CartInventoryOosSimilarRowBinding.inflate(layoutInflater, null, false);
    }

    public static CartInventoryOosSimilarRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_inventory_oos_similar_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartInventoryOosSimilarRowBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

