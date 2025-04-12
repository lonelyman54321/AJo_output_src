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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.databinding.LayoutSharedWithMeStateBinding;

public final class FragmentSharedWithMeDetailBinding
implements BC3 {
    public final ImageView fswmdIvDelete;
    public final ImageView fswmdIvSaveToCloset;
    public final ImageView fswmdIvShare;
    public final CardView fswmdLayoutCabOptions;
    public final LinearLayout fswmdMenuDelete;
    public final LinearLayout fswmdMenuSaveToCloset;
    public final LinearLayout fswmdMenuShare;
    public final AjioProgressView fswmdProgressView;
    public final RecyclerView fswmdRvList;
    public final TextView fswmdTvDelete;
    public final TextView fswmdTvSaveToCloset;
    public final TextView fswmdTvShare;
    private final FrameLayout rootView;
    public final LayoutSharedWithMeStateBinding sharedStateLayout;

    private FragmentSharedWithMeDetailBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioProgressView ajioProgressView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, LayoutSharedWithMeStateBinding layoutSharedWithMeStateBinding) {
        this.rootView = frameLayout;
        this.fswmdIvDelete = imageView;
        this.fswmdIvSaveToCloset = imageView2;
        this.fswmdIvShare = imageView3;
        this.fswmdLayoutCabOptions = cardView;
        this.fswmdMenuDelete = linearLayout;
        this.fswmdMenuSaveToCloset = linearLayout2;
        this.fswmdMenuShare = linearLayout3;
        this.fswmdProgressView = ajioProgressView;
        this.fswmdRvList = recyclerView;
        this.fswmdTvDelete = textView;
        this.fswmdTvSaveToCloset = textView2;
        this.fswmdTvShare = textView3;
        this.sharedStateLayout = layoutSharedWithMeStateBinding;
    }

    public static FragmentSharedWithMeDetailBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.fswmdIvDelete;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.fswmdIvSaveToCloset;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (ImageView)view2;
            if (view4 != null) {
                n3 = R$id.fswmdIvShare;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (ImageView)view2;
                if (view5 != null) {
                    n3 = R$id.fswmdLayoutCabOptions;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (CardView)view2;
                    if (object2 != null) {
                        n3 = R$id.fswmdMenuDelete;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (LinearLayout)view2;
                        if (view6 != null) {
                            n3 = R$id.fswmdMenuSaveToCloset;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                n3 = R$id.fswmdMenuShare;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (LinearLayout)view2;
                                if (view8 != null) {
                                    n3 = R$id.fswmdProgressView;
                                    Object object3 = view2 = dd2_2.a(n3, view);
                                    object3 = (AjioProgressView)view2;
                                    if (object3 != null) {
                                        n3 = R$id.fswmdRvList;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (RecyclerView)view2;
                                        if (object4 != null) {
                                            n3 = R$id.fswmdTvDelete;
                                            View view9 = view2 = dd2_2.a(n3, view);
                                            view9 = (TextView)view2;
                                            if (view9 != null) {
                                                n3 = R$id.fswmdTvSaveToCloset;
                                                View view10 = view2 = dd2_2.a(n3, view);
                                                view10 = (TextView)view2;
                                                if (view10 != null) {
                                                    n3 = R$id.fswmdTvShare;
                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                    view11 = (TextView)view2;
                                                    if (view11 != null && (view2 = dd2_2.a(n3 = R$id.sharedStateLayout, view)) != null) {
                                                        LayoutSharedWithMeStateBinding layoutSharedWithMeStateBinding = LayoutSharedWithMeStateBinding.bind(view2);
                                                        View view12 = view;
                                                        view12 = (FrameLayout)view;
                                                        FragmentSharedWithMeDetailBinding fragmentSharedWithMeDetailBinding = new FragmentSharedWithMeDetailBinding((FrameLayout)view12, (ImageView)view3, (ImageView)view4, (ImageView)view5, (CardView)((Object)object2), (LinearLayout)view6, (LinearLayout)view7, (LinearLayout)view8, (AjioProgressView)((Object)object3), (RecyclerView)object4, (TextView)view9, (TextView)view10, (TextView)view11, layoutSharedWithMeStateBinding);
                                                        return fragmentSharedWithMeDetailBinding;
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

    public static FragmentSharedWithMeDetailBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSharedWithMeDetailBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSharedWithMeDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_shared_with_me_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSharedWithMeDetailBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

