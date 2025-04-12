/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentChooseStoreBinding
implements BC3 {
    public final ImageView closeIcon;
    public final ConstraintLayout contentLyt;
    public final ConstraintLayout parentLyt;
    private final ConstraintLayout rootView;
    public final RecyclerView rvStoreList;
    public final ConstraintLayout subParentLyt;
    public final TextView subtitleTv;
    public final ConstraintLayout titleSubLyt;
    public final TextView titleTv;

    private FragmentChooseStoreBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RecyclerView recyclerView, ConstraintLayout constraintLayout4, TextView textView, ConstraintLayout constraintLayout5, TextView textView2) {
        this.rootView = constraintLayout;
        this.closeIcon = imageView;
        this.contentLyt = constraintLayout2;
        this.parentLyt = constraintLayout3;
        this.rvStoreList = recyclerView;
        this.subParentLyt = constraintLayout4;
        this.subtitleTv = textView;
        this.titleSubLyt = constraintLayout5;
        this.titleTv = textView2;
    }

    public static FragmentChooseStoreBinding bind(View object) {
        View view;
        int n3 = R$id.closeIcon;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.content_lyt;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (ConstraintLayout)view;
            if (object2 != null) {
                Object object3 = object;
                object3 = (ConstraintLayout)((Object)object);
                n3 = R$id.rvStoreList;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.sub_parent_lyt;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (ConstraintLayout)view;
                    if (object5 != null) {
                        n3 = R$id.subtitle_tv;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (TextView)view;
                        if (view3 != null) {
                            n3 = R$id.title_sub_lyt;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (ConstraintLayout)view;
                            if (object6 != null) {
                                n3 = R$id.title_tv;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (TextView)view;
                                if (view4 != null) {
                                    object = new FragmentChooseStoreBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (RecyclerView)object4, (ConstraintLayout)((Object)object5), (TextView)view3, (ConstraintLayout)((Object)object6), (TextView)view4);
                                    return object;
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

    public static FragmentChooseStoreBinding inflate(LayoutInflater layoutInflater) {
        return FragmentChooseStoreBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentChooseStoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_choose_store;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentChooseStoreBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

