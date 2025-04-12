/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogNotificationPermissionBinding
implements BC3 {
    public final View dlprClose;
    public final ImageView dlprIvClose;
    public final LinearLayout dlprLayoutContent;
    public final TextView laAccessInfo;
    public final TextView laAccessSubtitle;
    public final TextView laTitle;
    public final TextView laTvAllow;
    public final TextView laTvNotNow;
    private final ConstraintLayout rootView;

    private DialogNotificationPermissionBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.dlprClose = view;
        this.dlprIvClose = imageView;
        this.dlprLayoutContent = linearLayout;
        this.laAccessInfo = textView;
        this.laAccessSubtitle = textView2;
        this.laTitle = textView3;
        this.laTvAllow = textView4;
        this.laTvNotNow = textView5;
    }

    public static DialogNotificationPermissionBinding bind(View object) {
        int n3 = R$id.dlprClose;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.dlprIvClose;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (ImageView)object2;
            if (view2 != null) {
                n3 = R$id.dlprLayoutContent;
                View view3 = object2 = dd2_2.a(n3, object);
                view3 = (LinearLayout)object2;
                if (view3 != null) {
                    n3 = R$id.la_access_info;
                    View view4 = object2 = dd2_2.a(n3, object);
                    view4 = (TextView)object2;
                    if (view4 != null) {
                        n3 = R$id.la_access_subtitle;
                        View view5 = object2 = dd2_2.a(n3, object);
                        view5 = (TextView)object2;
                        if (view5 != null) {
                            n3 = R$id.la_title;
                            View view6 = object2 = dd2_2.a(n3, object);
                            view6 = (TextView)object2;
                            if (view6 != null) {
                                n3 = R$id.laTvAllow;
                                View view7 = object2 = dd2_2.a(n3, object);
                                view7 = (TextView)object2;
                                if (view7 != null) {
                                    n3 = R$id.laTvNotNow;
                                    View view8 = object2 = dd2_2.a(n3, object);
                                    view8 = (TextView)object2;
                                    if (view8 != null) {
                                        DialogNotificationPermissionBinding dialogNotificationPermissionBinding;
                                        Object object3 = object;
                                        object3 = (ConstraintLayout)((Object)object);
                                        object2 = dialogNotificationPermissionBinding;
                                        dialogNotificationPermissionBinding = new DialogNotificationPermissionBinding((ConstraintLayout)((Object)object3), view, (ImageView)view2, (LinearLayout)view3, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8);
                                        return dialogNotificationPermissionBinding;
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

    public static DialogNotificationPermissionBinding inflate(LayoutInflater layoutInflater) {
        return DialogNotificationPermissionBinding.inflate(layoutInflater, null, false);
    }

    public static DialogNotificationPermissionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_notification_permission;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogNotificationPermissionBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

