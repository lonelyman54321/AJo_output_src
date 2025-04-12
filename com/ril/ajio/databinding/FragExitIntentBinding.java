/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragExitIntentBinding
implements BC3 {
    public final RelativeLayout errorContainerExitIntent;
    public final AjioTextView errorDesc;
    public final AjioTextView errorTitle;
    public final RecyclerView exitIntentItemsList;
    public final LinearLayout exitIntentRootView;
    public final AjioTextView refreshButton;
    public final NestedScrollView rootContainerScroll;
    private final FrameLayout rootView;
    public final RelativeLayout shimmerContainerExitIntentRoot;
    public final NestedScrollView shimmerContainerScroll;
    public final ShimmerFrameLayout shimmerFrameExitIntent;
    public final RecyclerView shimmerRecyclerviewFirst;
    public final RecyclerView shimmerRecyclerviewSecond;
    public final RecyclerView shimmerRecyclerviewThird;
    public final AjioTextView subTitleTv;
    public final AjioTextView titleTv;

    private FragExitIntentBinding(FrameLayout frameLayout, RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RecyclerView recyclerView, LinearLayout linearLayout, AjioTextView ajioTextView3, NestedScrollView nestedScrollView, RelativeLayout relativeLayout2, NestedScrollView nestedScrollView2, ShimmerFrameLayout shimmerFrameLayout, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = frameLayout;
        this.errorContainerExitIntent = relativeLayout;
        this.errorDesc = ajioTextView;
        this.errorTitle = ajioTextView2;
        this.exitIntentItemsList = recyclerView;
        this.exitIntentRootView = linearLayout;
        this.refreshButton = ajioTextView3;
        this.rootContainerScroll = nestedScrollView;
        this.shimmerContainerExitIntentRoot = relativeLayout2;
        this.shimmerContainerScroll = nestedScrollView2;
        this.shimmerFrameExitIntent = shimmerFrameLayout;
        this.shimmerRecyclerviewFirst = recyclerView2;
        this.shimmerRecyclerviewSecond = recyclerView3;
        this.shimmerRecyclerviewThird = recyclerView4;
        this.subTitleTv = ajioTextView4;
        this.titleTv = ajioTextView5;
    }

    public static FragExitIntentBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.error_container_exit_intent;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (RelativeLayout)view2;
        if (view3 != null) {
            n3 = R$id.error_desc;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioTextView)view2;
            if (object2 != null) {
                n3 = R$id.error_title;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.exit_intent_items_list;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (RecyclerView)view2;
                    if (object4 != null) {
                        n3 = R$id.exit_intent_root_view;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (LinearLayout)view2;
                        if (view4 != null) {
                            n3 = R$id.refreshButton;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.root_container_scroll;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (NestedScrollView)view2;
                                if (object6 != null) {
                                    n3 = R$id.shimmer_container_exit_intent_root;
                                    View view5 = view2 = dd2_2.a(n3, view);
                                    view5 = (RelativeLayout)view2;
                                    if (view5 != null) {
                                        n3 = R$id.shimmer_container_scroll;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (NestedScrollView)view2;
                                        if (object7 != null) {
                                            n3 = R$id.shimmer_frame_exit_intent;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (ShimmerFrameLayout)view2;
                                            if (object8 != null) {
                                                n3 = R$id.shimmer_recyclerview_first;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (RecyclerView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.shimmer_recyclerview_second;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (RecyclerView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.shimmer_recyclerview_third;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (RecyclerView)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.sub_title_tv;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                n3 = R$id.title_tv;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null) {
                                                                    View view6 = view;
                                                                    view6 = (FrameLayout)view;
                                                                    FragExitIntentBinding fragExitIntentBinding = new FragExitIntentBinding((FrameLayout)view6, (RelativeLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (RecyclerView)object4, (LinearLayout)view4, (AjioTextView)object5, (NestedScrollView)object6, (RelativeLayout)view5, (NestedScrollView)object7, (ShimmerFrameLayout)((Object)object8), (RecyclerView)object9, (RecyclerView)object10, (RecyclerView)object11, (AjioTextView)object12, (AjioTextView)object13);
                                                                    return fragExitIntentBinding;
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

    public static FragExitIntentBinding inflate(LayoutInflater layoutInflater) {
        return FragExitIntentBinding.inflate(layoutInflater, null, false);
    }

    public static FragExitIntentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.frag_exit_intent;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragExitIntentBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

