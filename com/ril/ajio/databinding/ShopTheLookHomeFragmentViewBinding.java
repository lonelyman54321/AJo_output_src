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
 *  android.widget.SeekBar
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
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ExoPlayerShopTheLookViewBinding;
import com.ril.ajio.databinding.ShopTheLookSwipeViewLayoutBinding;

public final class ShopTheLookHomeFragmentViewBinding
implements BC3 {
    public final RelativeLayout bgRV;
    public final ImageView imgVolume;
    public final ExoPlayerShopTheLookViewBinding layoutVideo;
    private final RelativeLayout rootView;
    public final SeekBar seekBar;
    public final LinearLayout shimmerLlAjio;
    public final LinearLayout shimmerLlLuxe;
    public final ShimmerFrameLayout shimmerStlProducts;
    public final FrameLayout stlBottomFl;
    public final RecyclerView stlHRv;
    public final ImageView stlMainIv;
    public final TextView stlSubTitleTv;
    public final ShopTheLookSwipeViewLayoutBinding stlSwipeLayout;
    public final TextView stlTitleTv;
    public final RelativeLayout stlTopRl;
    public final View topGradientView;

    private ShopTheLookHomeFragmentViewBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, ExoPlayerShopTheLookViewBinding exoPlayerShopTheLookViewBinding, SeekBar seekBar, LinearLayout linearLayout, LinearLayout linearLayout2, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, RecyclerView recyclerView, ImageView imageView2, TextView textView, ShopTheLookSwipeViewLayoutBinding shopTheLookSwipeViewLayoutBinding, TextView textView2, RelativeLayout relativeLayout3, View view) {
        this.rootView = relativeLayout;
        this.bgRV = relativeLayout2;
        this.imgVolume = imageView;
        this.layoutVideo = exoPlayerShopTheLookViewBinding;
        this.seekBar = seekBar;
        this.shimmerLlAjio = linearLayout;
        this.shimmerLlLuxe = linearLayout2;
        this.shimmerStlProducts = shimmerFrameLayout;
        this.stlBottomFl = frameLayout;
        this.stlHRv = recyclerView;
        this.stlMainIv = imageView2;
        this.stlSubTitleTv = textView;
        this.stlSwipeLayout = shopTheLookSwipeViewLayoutBinding;
        this.stlTitleTv = textView2;
        this.stlTopRl = relativeLayout3;
        this.topGradientView = view;
    }

    public static ShopTheLookHomeFragmentViewBinding bind(View view) {
        Object object;
        Object object2 = view;
        View view2 = view;
        view2 = (RelativeLayout)view;
        int n3 = R$id.imgVolume;
        ImageView imageView = (ImageView)dd2_2.a(n3, view);
        if (imageView != null && (object = dd2_2.a(n3 = R$id.layoutVideo, view)) != null) {
            Object object3;
            TextView textView;
            ImageView imageView2;
            RecyclerView recyclerView;
            FrameLayout frameLayout;
            ShimmerFrameLayout shimmerFrameLayout;
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            object = ExoPlayerShopTheLookViewBinding.bind(object);
            n3 = R$id.seekBar;
            SeekBar seekBar = (SeekBar)dd2_2.a(n3, view);
            if (seekBar != null && (linearLayout2 = (LinearLayout)dd2_2.a(n3 = R$id.shimmerLlAjio, view)) != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.shimmerLlLuxe, view)) != null && (shimmerFrameLayout = (ShimmerFrameLayout)dd2_2.a(n3 = R$id.shimmer_stl_products, view)) != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.stlBottomFl, view)) != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.stlHRv, view)) != null && (imageView2 = (ImageView)dd2_2.a(n3 = R$id.stlMainIv, view)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.stlSubTitleTv, view)) != null && (object3 = dd2_2.a(n3 = R$id.stlSwipeLayout, view)) != null) {
                View view3;
                RelativeLayout relativeLayout;
                object3 = ShopTheLookSwipeViewLayoutBinding.bind(object3);
                n3 = R$id.stlTitleTv;
                TextView textView2 = (TextView)dd2_2.a(n3, view);
                if (textView2 != null && (relativeLayout = (RelativeLayout)dd2_2.a(n3 = R$id.stlTopRl, view)) != null && (view3 = dd2_2.a(n3 = R$id.topGradientView, view)) != null) {
                    ShopTheLookHomeFragmentViewBinding shopTheLookHomeFragmentViewBinding;
                    object2 = shopTheLookHomeFragmentViewBinding;
                    View view4 = view2;
                    shopTheLookHomeFragmentViewBinding = new ShopTheLookHomeFragmentViewBinding((RelativeLayout)view2, (RelativeLayout)view2, imageView, (ExoPlayerShopTheLookViewBinding)object, seekBar, linearLayout2, linearLayout, shimmerFrameLayout, frameLayout, recyclerView, imageView2, textView, (ShopTheLookSwipeViewLayoutBinding)object3, textView2, relativeLayout, view3);
                    return shopTheLookHomeFragmentViewBinding;
                }
            }
        }
        object2 = view.getResources().getResourceName(n3);
        object2 = "Missing required view with ID: ".concat((String)object2);
        NullPointerException nullPointerException = new NullPointerException((String)object2);
        throw nullPointerException;
    }

    public static ShopTheLookHomeFragmentViewBinding inflate(LayoutInflater layoutInflater) {
        return ShopTheLookHomeFragmentViewBinding.inflate(layoutInflater, null, false);
    }

    public static ShopTheLookHomeFragmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shop_the_look_home_fragment_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShopTheLookHomeFragmentViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

