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
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ExoPlayerStoryDisplayBinding;
import com.ril.ajio.databinding.ShopTheLookSwipeViewLayoutBinding;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;

public final class StoryDisplayItemBinding
implements BC3 {
    public final LinearLayoutCompat compTitleSubTitle;
    public final LinearLayoutCompat compTitleSubTitle2;
    public final ComposeView composeError;
    public final ImageView icCross;
    public final ImageView icCross2;
    public final ImageView imgVolume;
    public final ImageView imgVolume2;
    public final View layerBottomShadow;
    public final ExoPlayerStoryDisplayBinding layoutVideo;
    public final View next;
    public final View previous;
    private final ConstraintLayout rootView;
    public final LinearLayout shimmerLlAjio;
    public final LinearLayout shimmerLlLuxe;
    public final ShimmerFrameLayout shimmerStlProducts;
    public final FrameLayout stlBottomFl;
    public final RecyclerView stlHRv;
    public final ShopTheLookSwipeViewLayoutBinding stlSwipeLayout;
    public final AppCompatTextView stlTitleTv;
    public final ConstraintLayout stlTopRl;
    public final ConstraintLayout stlTopRlTest;
    public final StoriesProgressView storiesProgressView;
    public final AppCompatTextView storyDisplayDesc;
    public final AppCompatTextView storyDisplayDesc2;
    public final AppCompatTextView storyDisplayNick;
    public final AppCompatTextView storyDisplayNick2;
    public final AppCompatImageView storyDisplayProfilePicture;
    public final AppCompatImageView storyDisplayProfilePicture2;
    public final RelativeLayout storyOverlay;
    public final View topGradientView;

    private StoryDisplayItemBinding(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, ComposeView composeView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, View view, ExoPlayerStoryDisplayBinding exoPlayerStoryDisplayBinding, View view2, View view3, LinearLayout linearLayout, LinearLayout linearLayout2, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, RecyclerView recyclerView, ShopTheLookSwipeViewLayoutBinding shopTheLookSwipeViewLayoutBinding, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, StoriesProgressView storiesProgressView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout, View view4) {
        this.rootView = constraintLayout;
        this.compTitleSubTitle = linearLayoutCompat;
        this.compTitleSubTitle2 = linearLayoutCompat2;
        this.composeError = composeView;
        this.icCross = imageView;
        this.icCross2 = imageView2;
        this.imgVolume = imageView3;
        this.imgVolume2 = imageView4;
        this.layerBottomShadow = view;
        this.layoutVideo = exoPlayerStoryDisplayBinding;
        this.next = view2;
        this.previous = view3;
        this.shimmerLlAjio = linearLayout;
        this.shimmerLlLuxe = linearLayout2;
        this.shimmerStlProducts = shimmerFrameLayout;
        this.stlBottomFl = frameLayout;
        this.stlHRv = recyclerView;
        this.stlSwipeLayout = shopTheLookSwipeViewLayoutBinding;
        this.stlTitleTv = appCompatTextView;
        this.stlTopRl = constraintLayout2;
        this.stlTopRlTest = constraintLayout3;
        this.storiesProgressView = storiesProgressView;
        this.storyDisplayDesc = appCompatTextView2;
        this.storyDisplayDesc2 = appCompatTextView3;
        this.storyDisplayNick = appCompatTextView4;
        this.storyDisplayNick2 = appCompatTextView5;
        this.storyDisplayProfilePicture = appCompatImageView;
        this.storyDisplayProfilePicture2 = appCompatImageView2;
        this.storyOverlay = relativeLayout;
        this.topGradientView = view4;
    }

    public static StoryDisplayItemBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.compTitleSubTitle;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (LinearLayoutCompat)view2;
        if (object2 != null) {
            n3 = R$id.compTitleSubTitle2;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (LinearLayoutCompat)view2;
            if (object3 != null) {
                n3 = R$id.composeError;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (ComposeView)view2;
                if (object4 != null) {
                    n3 = R$id.icCross;
                    View view3 = view2 = dd2_2.a(n3, view);
                    view3 = (ImageView)view2;
                    if (view3 != null) {
                        n3 = R$id.icCross2;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (ImageView)view2;
                        if (view4 != null) {
                            n3 = R$id.imgVolume;
                            View view5 = view2 = dd2_2.a(n3, view);
                            view5 = (ImageView)view2;
                            if (view5 != null) {
                                View view6;
                                n3 = R$id.imgVolume2;
                                View view7 = view2 = dd2_2.a(n3, view);
                                view7 = (ImageView)view2;
                                if (view7 != null && (view6 = dd2_2.a(n3 = R$id.layerBottomShadow, view)) != null && (view2 = dd2_2.a(n3 = R$id.layoutVideo, view)) != null) {
                                    View view8;
                                    ExoPlayerStoryDisplayBinding exoPlayerStoryDisplayBinding = ExoPlayerStoryDisplayBinding.bind(view2);
                                    n3 = R$id.next;
                                    View view9 = dd2_2.a(n3, view);
                                    if (view9 != null && (view8 = dd2_2.a(n3 = R$id.previous, view)) != null) {
                                        n3 = R$id.shimmerLlAjio;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (LinearLayout)view2;
                                        if (view10 != null) {
                                            n3 = R$id.shimmerLlLuxe;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (LinearLayout)view2;
                                            if (view11 != null) {
                                                n3 = R$id.shimmer_stl_products;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (ShimmerFrameLayout)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.stlBottomFl;
                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                    view12 = (FrameLayout)view2;
                                                    if (view12 != null) {
                                                        n3 = R$id.stlHRv;
                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                        object6 = (RecyclerView)view2;
                                                        if (object6 != null && (view2 = dd2_2.a(n3 = R$id.stlSwipeLayout, view)) != null) {
                                                            ShopTheLookSwipeViewLayoutBinding shopTheLookSwipeViewLayoutBinding = ShopTheLookSwipeViewLayoutBinding.bind(view2);
                                                            n3 = R$id.stlTitleTv;
                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                            object7 = (AppCompatTextView)view2;
                                                            if (object7 != null) {
                                                                n3 = R$id.stlTopRl;
                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                object8 = (ConstraintLayout)view2;
                                                                if (object8 != null) {
                                                                    n3 = R$id.stlTopRlTest;
                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                    object9 = (ConstraintLayout)view2;
                                                                    if (object9 != null) {
                                                                        n3 = R$id.storiesProgressView;
                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                        object10 = (StoriesProgressView)view2;
                                                                        if (object10 != null) {
                                                                            n3 = R$id.storyDisplayDesc;
                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                            object11 = (AppCompatTextView)view2;
                                                                            if (object11 != null) {
                                                                                n3 = R$id.storyDisplayDesc2;
                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                object12 = (AppCompatTextView)view2;
                                                                                if (object12 != null) {
                                                                                    n3 = R$id.storyDisplayNick;
                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                    object13 = (AppCompatTextView)view2;
                                                                                    if (object13 != null) {
                                                                                        n3 = R$id.storyDisplayNick2;
                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                        object14 = (AppCompatTextView)view2;
                                                                                        if (object14 != null) {
                                                                                            n3 = R$id.storyDisplayProfilePicture;
                                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                                            object15 = (AppCompatImageView)view2;
                                                                                            if (object15 != null) {
                                                                                                n3 = R$id.storyDisplayProfilePicture2;
                                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                                object16 = (AppCompatImageView)view2;
                                                                                                if (object16 != null) {
                                                                                                    View view13;
                                                                                                    n3 = R$id.storyOverlay;
                                                                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                                                                    view14 = (RelativeLayout)view2;
                                                                                                    if (view14 != null && (view13 = dd2_2.a(n3 = R$id.topGradientView, view)) != null) {
                                                                                                        Object object17 = view;
                                                                                                        object17 = (ConstraintLayout)view;
                                                                                                        StoryDisplayItemBinding storyDisplayItemBinding = new StoryDisplayItemBinding((ConstraintLayout)((Object)object17), (LinearLayoutCompat)((Object)object2), (LinearLayoutCompat)((Object)object3), (ComposeView)((Object)object4), (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view7, view6, exoPlayerStoryDisplayBinding, view9, view8, (LinearLayout)view10, (LinearLayout)view11, (ShimmerFrameLayout)((Object)object5), (FrameLayout)view12, (RecyclerView)object6, shopTheLookSwipeViewLayoutBinding, (AppCompatTextView)object7, (ConstraintLayout)((Object)object8), (ConstraintLayout)((Object)object9), (StoriesProgressView)((Object)object10), (AppCompatTextView)object11, (AppCompatTextView)object12, (AppCompatTextView)object13, (AppCompatTextView)object14, (AppCompatImageView)((Object)object15), (AppCompatImageView)((Object)object16), (RelativeLayout)view14, view13);
                                                                                                        return storyDisplayItemBinding;
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

    public static StoryDisplayItemBinding inflate(LayoutInflater layoutInflater) {
        return StoryDisplayItemBinding.inflate(layoutInflater, null, false);
    }

    public static StoryDisplayItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.story_display_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return StoryDisplayItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

