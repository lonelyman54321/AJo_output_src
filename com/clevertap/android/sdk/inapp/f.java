/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialFragment$1;
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialFragment$2;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.b;
import java.util.ArrayList;
import kotlin.Pair;

public class f
extends b {
    public boolean j = false;
    public di_2 k;
    public ImageView l;
    public GifImageView m;
    public tg1_0 n;
    public RelativeLayout o;
    public CloseImageView p;
    public FrameLayout q;
    public FrameLayout r;
    public ViewGroup.LayoutParams s;

    public final void Oa() {
        GifImageView gifImageView = this.m;
        if (gifImageView != null) {
            gifImageView.d();
        }
        this.n.pause();
    }

    public final void db() {
        View view = this.n.a();
        this.n.d(false);
        ImageView imageView = this.l;
        ViewGroup.LayoutParams layoutParams = this.s;
        imageView.setLayoutParams(layoutParams);
        this.r.removeAllViews();
        this.q.addView(view);
        view = this.q;
        imageView = this.l;
        view.addView((View)imageView);
        this.j = false;
        this.k.dismiss();
        view = this.l;
        imageView = this.c;
        int n3 = R$drawable.ct_ic_fullscreen_expand;
        imageView = t70.getDrawable((Context)imageView, n3);
        view.setImageDrawable((Drawable)imageView);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void eb() {
        float f5;
        ImageView imageView;
        Context context = this.c;
        this.l = imageView = new ImageView(context);
        Resources resources = this.c.getResources();
        int n3 = R$drawable.ct_ic_fullscreen_expand;
        int n4 = 0;
        Drawable drawable2 = resources.getDrawable(n3, null);
        imageView.setImageDrawable(drawable2);
        imageView = this.l;
        f0 f02 = new f0(this, 2);
        imageView.setOnClickListener((View.OnClickListener)f02);
        imageView = this.getResources().getDisplayMetrics();
        CTInAppNotification cTInAppNotification = this.e;
        int n7 = cTInAppNotification.t;
        n3 = 1;
        if (n7 != 0 && (n7 = (int)(this.Va() ? 1 : 0)) != 0) {
            n7 = 1106247680;
            f5 = TypedValue.applyDimension((int)n3, (float)30.0f, (DisplayMetrics)imageView);
        } else {
            n7 = 1101004800;
            f5 = TypedValue.applyDimension((int)n3, (float)20.0f, (DisplayMetrics)imageView);
        }
        n7 = (int)f5;
        n4 = (int)TypedValue.applyDimension((int)n3, (float)4.0f, (DisplayMetrics)imageView);
        int n8 = (int)TypedValue.applyDimension((int)n3, (float)2.0f, (DisplayMetrics)imageView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n7, n7);
        layoutParams.gravity = 0x800005;
        layoutParams.setMargins(0, n4, n8, 0);
        this.l.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }

    public final void fb() {
        tg1_0 tg1_02 = this.n;
        Context context = this.c;
        Object object = this.e;
        boolean bl2 = ((CTInAppNotification)object).t;
        if (bl2 && (bl2 = this.Va())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        tg1_02.e(context, bl2);
        this.q.setVisibility(0);
        tg1_02 = this.n.a();
        context = this.q;
        int n3 = context.getChildCount();
        if (n3 == 0) {
            this.q.addView((View)tg1_02);
            tg1_02 = this.q;
            context = this.l;
            tg1_02.addView((View)context);
        } else {
            com.clevertap.android.sdk.b.c();
        }
        tg1_02 = this.n;
        context = this.c;
        object = ((CTInAppNotificationMedia)this.e.y.get((int)0)).d;
        tg1_02.c(context, (String)object);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = qb3_2.c;
        rb3_1 rb3_12 = rb3_1.MEDIA3;
        int n3 = -1;
        if (object == rb3_12) {
            object = new Object();
            rb3_12 = new FrameLayout.LayoutParams(n3, n3);
            object.d = rb3_12;
            this.n = object;
        } else {
            object = new Object();
            rb3_12 = new FrameLayout.LayoutParams(n3, n3);
            object.d = rb3_12;
            this.n = object;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        Object object3;
        int n3;
        Object object4;
        object2 = this.e;
        int n4 = object2.t;
        int n7 = 0;
        if (n4 != 0 && (n4 = (int)(this.Va() ? 1 : 0)) != 0) {
            n4 = R$layout.tab_inapp_interstitial;
            layoutInflater = layoutInflater.inflate(n4, object, false);
        } else {
            n4 = R$layout.inapp_interstitial;
            layoutInflater = layoutInflater.inflate(n4, object, false);
        }
        int n8 = R$id.inapp_interstitial_frame_layout;
        object = (FrameLayout)layoutInflater.findViewById(n8);
        object2 = (CloseImageView)object.findViewById(199272);
        this.p = object2;
        n4 = R$id.interstitial_relative_layout;
        object2 = (RelativeLayout)object.findViewById(n4);
        this.o = object2;
        int n10 = R$id.video_frame;
        object2 = (FrameLayout)object2.findViewById(n10);
        this.q = object2;
        object2 = this.o;
        Object object5 = this.e.c;
        n10 = Color.parseColor((String)object5);
        object2.setBackgroundColor(n10);
        object2 = new ColorDrawable(-1157627904);
        object.setBackground((Drawable)object2);
        object2 = this.p;
        n10 = this.d;
        int n14 = 1;
        int n15 = 2;
        if (n10 != n14) {
            if (n10 == n15) {
                object5 = this.o.getViewTreeObserver();
                object4 = new CTInAppNativeInterstitialFragment$2(this, (FrameLayout)object, (CloseImageView)((Object)object2));
                object5.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object4);
            }
        } else {
            object5 = this.o.getViewTreeObserver();
            object4 = new CTInAppNativeInterstitialFragment$1(this, (FrameLayout)object, (CloseImageView)((Object)object2));
            object5.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object4);
        }
        object = this.e.y;
        n8 = (int)(object.isEmpty() ? 1 : 0);
        n4 = 8;
        if (n8 == 0) {
            object = (CTInAppNotificationMedia)this.e.y.get(0);
            n10 = (int)(object.e() ? 1 : 0);
            if (n10 != 0) {
                object5 = this.i;
                object = object.d;
                if ((object = ((ol0_1)object5).b((String)object)) != null) {
                    object5 = this.o;
                    n3 = R$id.backgroundImage;
                    object5 = (ImageView)object5.findViewById(n3);
                    object5.setVisibility(0);
                    object5.setImageBitmap((Bitmap)object);
                }
            } else {
                n10 = (int)(object.c() ? 1 : 0);
                if (n10 != 0) {
                    object5 = this.i;
                    object = object.d;
                    object5.getClass();
                    object3 = ie0_0.GIF;
                    object4 = new Pair(object, object3);
                    object = SN1$b.a;
                    object = (byte[])((ol0_1)object5).c((Pair)object4, (sn1_1)object);
                    if (object != null) {
                        object5 = this.o;
                        n3 = R$id.gifImage;
                        this.m = object5 = (GifImageView)object5.findViewById(n3);
                        object5.setVisibility(0);
                        object5 = this.m;
                        ((GifImageView)object5).setBytes((byte[])object);
                        object = this.m;
                        object.a = n14;
                        object.e();
                    }
                } else {
                    n10 = (int)(object.f() ? 1 : 0);
                    if (n10 != 0) {
                        this.eb();
                        this.fb();
                        object = this.n;
                        object.play();
                    } else {
                        n8 = (int)(object.b() ? 1 : 0);
                        if (n8 != 0) {
                            this.eb();
                            this.fb();
                            this.n.play();
                            object = this.l;
                            object.setVisibility(n4);
                        }
                    }
                }
            }
        }
        object = this.o;
        n10 = R$id.interstitial_title;
        object = (TextView)object.findViewById(n10);
        object5 = this.e.E;
        object.setText((CharSequence)object5);
        n10 = Color.parseColor((String)this.e.F);
        object.setTextColor(n10);
        object = this.o;
        n10 = R$id.interstitial_message;
        object = (TextView)object.findViewById(n10);
        object5 = this.e.z;
        object.setText((CharSequence)object5);
        n10 = Color.parseColor((String)this.e.A);
        object.setTextColor(n10);
        object = new ArrayList();
        object5 = this.o;
        n3 = R$id.interstitial_linear_layout;
        object5 = (LinearLayout)object5.findViewById(n3);
        n3 = R$id.interstitial_button1;
        object4 = (Button)object5.findViewById(n3);
        object.add(object4);
        int n16 = R$id.interstitial_button2;
        object5 = (Button)object5.findViewById(n16);
        object.add(object5);
        object3 = this.e.e;
        int n17 = ((ArrayList)object3).size();
        if (n17 == n14) {
            n8 = this.d;
            if (n8 == n15) {
                object4.setVisibility(n4);
            } else if (n8 == n14) {
                n8 = 4;
                object4.setVisibility(n8);
            }
            object = (CTInAppNotificationButton)((ArrayList)object3).get(0);
            this.cb((Button)object5, (CTInAppNotificationButton)object, 0);
        } else {
            n10 = (int)(((ArrayList)object3).isEmpty() ? 1 : 0);
            if (n10 == 0) {
                object5 = null;
                for (n10 = 0; n10 < (n14 = ((ArrayList)object3).size()); ++n10) {
                    if (n10 >= n15) continue;
                    CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton)((ArrayList)object3).get(n10);
                    object4 = (Button)object.get(n10);
                    this.cb((Button)object4, cTInAppNotificationButton, n10);
                }
            }
        }
        object = this.e;
        n8 = (int)(object.n ? 1 : 0);
        if (n8 == 0) {
            object = this.p;
            n7 = 0;
            object.setOnClickListener(null);
            object = this.p;
            object.setVisibility(n4);
        } else {
            this.p.setVisibility(0);
            object = this.p;
            n7 = 1;
            object2 = new Bc(this, n7);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        return layoutInflater;
    }

    public final void onPause() {
        boolean bl2;
        super.onPause();
        GifImageView gifImageView = this.m;
        if (gifImageView != null) {
            gifImageView.d();
        }
        if (bl2 = this.j) {
            this.db();
        }
        this.n.b();
        this.n.pause();
    }

    public final void onResume() {
        boolean bl2;
        super.onResume();
        Object object = this.e.y;
        boolean bl3 = ((ArrayList)object).isEmpty();
        if (!bl3 && ((bl3 = ((CTInAppNotificationMedia)(object = (CTInAppNotificationMedia)((ArrayList)object).get(0))).f()) || (bl2 = ((CTInAppNotificationMedia)object).b()))) {
            this.fb();
            object = this.n;
            object.play();
        }
    }

    public final void onStart() {
        super.onStart();
        Object object = this.m;
        if (object != null) {
            boolean bl2;
            object = (CTInAppNotificationMedia)this.e.y.get(0);
            GifImageView gifImageView = this.m;
            ol0_1 ol0_12 = this.i;
            object = ((CTInAppNotificationMedia)object).d;
            ol0_12.getClass();
            ie0_0 ie0_02 = ie0_0.GIF;
            Pair pair = new Pair(object, (Object)ie0_02);
            object = SN1$b.a;
            object = (byte[])ol0_12.c(pair, (sn1_1)object);
            gifImageView.setBytes((byte[])object);
            object = this.m;
            ((GifImageView)object).a = bl2 = true;
            ((GifImageView)object).e();
        }
    }

    public final void onStop() {
        super.onStop();
        GifImageView gifImageView = this.m;
        if (gifImageView != null) {
            gifImageView.d();
        }
        this.n.pause();
    }
}

