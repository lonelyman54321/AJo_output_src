/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder$1;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CTInboxBaseMessageViewHolder
extends RecyclerView$B {
    public Context a;
    public LinearLayout b;
    public LinearLayout c;
    public FrameLayout d;
    public ImageView e;
    public ImageView f;
    public RelativeLayout g;
    public FrameLayout h;
    public RelativeLayout i;
    public CTInboxMessageContent j;
    public CTInboxMessage k;
    public ImageView l;
    public WeakReference m;
    public boolean n;
    public final ImageView o;

    public CTInboxBaseMessageViewHolder(View view) {
        super(view);
        int n3 = R$id.read_circle;
        view = (ImageView)view.findViewById(n3);
        this.o = view;
    }

    public static void B(ImageView[] imageViewArray, int n3, Context context, LinearLayout linearLayout) {
        for (int i3 = 0; i3 < n3; ++i3) {
            ImageView imageView;
            imageViewArray[i3] = imageView = new ImageView(context);
            imageView.setVisibility(0);
            imageView = imageViewArray[i3];
            Resources resources = context.getResources();
            int n4 = R$drawable.ct_unselected_dot;
            resources = resources.getDrawable(n4, null);
            imageView.setImageDrawable((Drawable)resources);
            int n7 = -2;
            imageView = new LinearLayout.LayoutParams(n7, n7);
            n4 = 6;
            int n8 = 8;
            imageView.setMargins(n8, n4, 4, n4);
            imageView.gravity = 17;
            n7 = linearLayout.getChildCount();
            if (n7 >= n3) continue;
            resources = imageViewArray[i3];
            linearLayout.addView((View)resources, (ViewGroup.LayoutParams)imageView);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String w(long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        long l14 = System.currentTimeMillis();
        long l15 = 1000L;
        long l16 = 60;
        long l17 = (l14 = l14 / l15 - l2) - l16;
        Object object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object < 0) {
            return "Just Now";
        }
        long l18 = 3540L;
        if (object > 0 && (l12 = l14 == l18 ? 0 : (l14 < l18 ? -1 : 1)) < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            return jl0_0.b(stringBuilder, l14 /= l16, " mins ago");
        }
        Object object2 = l14 == l18 ? 0 : (l14 < l18 ? -1 : 1);
        if (object2 > 0 && (l8 = (l7 = l14 - (l16 = 81420L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
            String string2;
            l2 = 1L;
            long l19 = (l14 /= 3600L) - l2;
            Object object3 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
            if (object3 > 0) {
                string2 = " hours ago";
                return UX.b(l14, string2);
            }
            string2 = " hour ago";
            return UX.b(l14, string2);
        }
        l16 = 86400L;
        long l20 = l14 - l16;
        Object object4 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
        if (object4 > 0 && (l4 = (l3 = l14 - (l16 = 172800L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            return "Yesterday";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM");
        Date date = new Date(l2 *= l15);
        return simpleDateFormat.format(date);
    }

    public static void y(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        int n3 = -1;
        float f5 = 3.0f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, n3, f5);
        button.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        button = new LinearLayout.LayoutParams(0, n3, f5);
        button2.setLayoutParams((ViewGroup.LayoutParams)button);
        button = new LinearLayout.LayoutParams(0, n3, 0.0f);
        button3.setLayoutParams((ViewGroup.LayoutParams)button);
    }

    public static void z(Button button, Button button2, Button button3) {
        int n3 = 8;
        button2.setVisibility(n3);
        button3.setVisibility(n3);
        int n4 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, n4, 6.0f);
        button.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        button = new LinearLayout.LayoutParams(0, n4, 0.0f);
        button2.setLayoutParams((ViewGroup.LayoutParams)button);
        button = new LinearLayout.LayoutParams(0, n4, 0.0f);
        button3.setLayoutParams((ViewGroup.LayoutParams)button);
    }

    public final void A(CTInboxMessage cTInboxMessage, int n3) {
        CTInboxBaseMessageViewHolder$1 cTInboxBaseMessageViewHolder$1 = new CTInboxBaseMessageViewHolder$1(this, n3, cTInboxMessage);
        cTInboxMessage = new Handler();
        cTInboxMessage.postDelayed(cTInboxBaseMessageViewHolder$1, 2000L);
    }

    public void x(CTInboxMessage object, CTInboxListViewFragment cTInboxListViewFragment, int n3) {
        boolean bl2;
        Object object2;
        this.a = object2 = cTInboxListViewFragment.getContext();
        object2 = new WeakReference(cTInboxListViewFragment);
        this.m = object2;
        this.k = object;
        object = ((CTInboxMessage)object).j;
        boolean bl3 = false;
        cTInboxListViewFragment = null;
        this.j = object = (CTInboxMessageContent)((ArrayList)object).get(0);
        n3 = (int)(((CTInboxMessageContent)object).i() ? 1 : 0);
        if (n3 != 0 || (bl2 = ((CTInboxMessageContent)object).l())) {
            bl3 = true;
        }
        this.n = bl3;
    }
}

