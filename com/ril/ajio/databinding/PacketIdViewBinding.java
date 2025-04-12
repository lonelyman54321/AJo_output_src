/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PacketIdViewBinding
implements BC3 {
    public final TextView alertCtaTv;
    public final TextView alertDescTv;
    public final TextView alertTitleTv;
    public final ImageView anchorIv;
    public final TextView packageCodeTitleTv;
    public final TextView packageCodeTv;
    public final RelativeLayout packetCodeRl;
    private final RelativeLayout rootView;
    public final ImageView titleIv;
    public final RelativeLayout titleRl;

    private PacketIdViewBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, RelativeLayout relativeLayout2, ImageView imageView2, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.alertCtaTv = textView;
        this.alertDescTv = textView2;
        this.alertTitleTv = textView3;
        this.anchorIv = imageView;
        this.packageCodeTitleTv = textView4;
        this.packageCodeTv = textView5;
        this.packetCodeRl = relativeLayout2;
        this.titleIv = imageView2;
        this.titleRl = relativeLayout3;
    }

    public static PacketIdViewBinding bind(View object) {
        View view;
        int n3 = R$id.alert_cta_tv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.alert_desc_tv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.alert_title_tv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.anchor_iv;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n3 = R$id.package_code_title_tv;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.package_code_tv;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.packet_code_rl;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (RelativeLayout)view;
                                if (view8 != null) {
                                    n3 = R$id.title_iv;
                                    View view9 = view = dd2_2.a(n3, object);
                                    view9 = (ImageView)view;
                                    if (view9 != null) {
                                        n3 = R$id.title_rl;
                                        View view10 = view = dd2_2.a(n3, object);
                                        view10 = (RelativeLayout)view;
                                        if (view10 != null) {
                                            Object object2 = object;
                                            object2 = (RelativeLayout)object;
                                            PacketIdViewBinding packetIdViewBinding = new PacketIdViewBinding((RelativeLayout)object2, (TextView)view2, (TextView)view3, (TextView)view4, (ImageView)view5, (TextView)view6, (TextView)view7, (RelativeLayout)view8, (ImageView)view9, (RelativeLayout)view10);
                                            return packetIdViewBinding;
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

    public static PacketIdViewBinding inflate(LayoutInflater layoutInflater) {
        return PacketIdViewBinding.inflate(layoutInflater, null, false);
    }

    public static PacketIdViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.packet_id_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PacketIdViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

