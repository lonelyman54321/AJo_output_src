/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ArgbEvaluator
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.app.Activity
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.DecelerateInterpolator
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.orderhistory.tracking;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackStepDot;
import com.ril.ajio.services.data.Order.orderhistory.StatusHistory;
import java.util.ArrayList;

public class TrackOrderLayout
extends FrameLayout {
    public final int a;
    public final RelativeLayout b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final ProgressBar e;
    public final int f;
    public final int g;
    public final int h;
    public int i;
    public int j;
    public final int k;
    public final int l;
    public ArrayList m;
    public int n;
    public int o;

    public TrackOrderLayout(Context context) {
        this(context, null);
    }

    public TrackOrderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackOrderLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        int n7;
        this.a = 800;
        this.f = 0;
        this.h = 96;
        this.i = n7 = 1;
        this.j = 2;
        this.n = -1;
        this.o = 3;
        attributeSet = this.getContext();
        n3 = R$layout.track_order_layout;
        View.inflate((Context)attributeSet, (int)n3, (ViewGroup)this);
        attributeSet = this.getResources();
        n3 = R$dimen.trackstep_dot_width;
        this.f = n4 = attributeSet.getDimensionPixelOffset(n3);
        attributeSet = this.getResources();
        n3 = R$dimen.tracklayout_view_padding;
        this.g = n4 = attributeSet.getDimensionPixelOffset(n3);
        this.l = n4 = hv3_0.m(R$color.white);
        this.k = n4 = hv3_0.m(R$color.color_939393);
        n4 = R$id.dotsWrapper;
        attributeSet = (RelativeLayout)this.findViewById(n4);
        this.b = attributeSet;
        n4 = R$id.progressbar;
        attributeSet = (ProgressBar)this.findViewById(n4);
        this.e = attributeSet;
        n4 = R$id.topTitleWrapper;
        attributeSet = (LinearLayout)this.findViewById(n4);
        this.c = attributeSet;
        n4 = R$id.bottomTitleWrapper;
        attributeSet = (LinearLayout)this.findViewById(n4);
        this.d = attributeSet;
        this.e.setLayerType(n7, null);
    }

    private void setStepPercent(int n3) {
        int n4 = 1;
        if (n3 == n4) {
            return;
        }
        int n7 = this.o;
        int n8 = 3;
        if (n7 == 0) {
            this.i = n8;
        } else {
            n3 -= n4;
            n4 = this.h;
            this.i = n3 = n4 / n3 * n7;
            if (n3 > n4) {
                this.i = n4;
            } else if (n3 < n4) {
                this.i = n3 += n8;
            }
        }
    }

    public final void a(TextView textView) {
        int n3;
        int n4;
        if (textView != null && (n4 = textView.getVisibility()) != (n3 = 4)) {
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object object = this.l;
            int n7 = this.k;
            Integer n8 = n7;
            int n10 = 2;
            Object[] objectArray = new Object[n10];
            objectArray[0] = object;
            n3 = 1;
            objectArray[n3] = n8;
            object = "textColor";
            textView = ObjectAnimator.ofObject((Object)textView, (String)object, (TypeEvaluator)argbEvaluator, (Object[])objectArray);
            long l2 = 350L;
            textView.setDuration(l2);
            argbEvaluator = new DecelerateInterpolator();
            textView.setInterpolator((TimeInterpolator)argbEvaluator);
            textView.start();
        }
    }

    public final void b() {
        int n3;
        Object object;
        int n4;
        int n7;
        this.n = -1;
        ProgressBar progressBar = this.e;
        int n8 = 0;
        progressBar.setProgress(0);
        progressBar = null;
        for (n7 = 0; n7 < (n4 = (object = this.b).getChildCount()); ++n7) {
            object = (TrackStepDot)this.b.getChildAt(n7);
            ((TrackStepDot)((Object)object)).setActivated(false, false);
            ((TrackStepDot)((Object)object)).setEnabled(false, false);
        }
        n7 = 0;
        progressBar = null;
        while (true) {
            object = this.d;
            n4 = object.getChildCount();
            n3 = this.l;
            if (n7 >= n4) break;
            object = (TextView)this.d.getChildAt(n7);
            object.setTextColor(n3);
            ++n7;
        }
        while (n8 < (n7 = (progressBar = this.c).getChildCount())) {
            progressBar = (TextView)this.c.getChildAt(n8);
            progressBar.setTextColor(n3);
            ++n8;
        }
    }

    public int getDeviceWidth() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity)this.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public void setActivePosition(int n3) {
        this.o = n3;
    }

    public void setStatusHistoryList(ArrayList arrayList) {
        int n3;
        ArrayList arrayList2;
        TrackOrderLayout trackOrderLayout = this;
        this.m = arrayList2 = new ArrayList();
        Object object = arrayList;
        arrayList2.addAll(arrayList);
        this.b.removeAllViews();
        this.c.removeAllViews();
        this.d.removeAllViews();
        arrayList2 = this.m;
        if (arrayList2 != null && (n3 = arrayList2.size()) != 0) {
            AjioTextView ajioTextView;
            LayoutInflater layoutInflater;
            Object object2;
            float f5;
            int n4;
            int n7;
            String string2;
            Object object3;
            Object object4;
            int n8;
            arrayList2 = this.m;
            this.j = n3 = arrayList2.size();
            this.setStepPercent(n3);
            n3 = this.getDeviceWidth();
            int n10 = this.g * 2;
            n3 -= n10;
            n10 = this.j;
            int n14 = this.f;
            int n15 = n10 * n14;
            n3 -= n15;
            n15 = 1;
            n3 /= (n10 -= n15);
            n10 = 0;
            object = null;
            int n16 = 0;
            String string3 = null;
            while (true) {
                int n17 = trackOrderLayout.j;
                n8 = -2;
                if (n16 >= n17) break;
                object4 = this.getContext();
                object3 = new TrackStepDot((Context)object4);
                object4 = new RelativeLayout.LayoutParams(n8, n8);
                if (n16 != 0) {
                    object4.leftMargin = n8 = (n3 + n14) * n16;
                }
                n8 = 15;
                int n18 = -1;
                object4.addRule(n8, n18);
                RelativeLayout relativeLayout = trackOrderLayout.b;
                relativeLayout.addView((View)object3, (ViewGroup.LayoutParams)object4);
                ++n16;
            }
            arrayList2 = trackOrderLayout.c;
            float f6 = n17 *= 2;
            arrayList2.setWeightSum(f6);
            n3 = 0;
            arrayList2 = null;
            while (true) {
                String string4;
                n14 = trackOrderLayout.j;
                string3 = "\n";
                object3 = "yyyy-MM-dd'T'HH:mm:ss";
                object4 = "dd MMM";
                string2 = "";
                LinearLayout.LayoutParams layoutParams = null;
                n7 = 0x800005;
                n4 = 0x800003;
                f5 = 2.0f;
                if (n3 >= n14) break;
                object2 = (StatusHistory)trackOrderLayout.m.get(n3);
                layoutInflater = LayoutInflater.from((Context)this.getContext());
                int n19 = R$layout.track_step_text;
                ajioTextView = (AjioTextView)layoutInflater.inflate(n19, null, false);
                layoutParams = new LinearLayout.LayoutParams(0, n8);
                if (n3 == 0) {
                    layoutParams.gravity = n4;
                    ajioTextView.setGravity(n4);
                    layoutParams.weight = f5;
                } else {
                    n4 = trackOrderLayout.j - n15;
                    if (n3 == n4) {
                        layoutParams.gravity = n7;
                        ajioTextView.setGravity(n7);
                        layoutParams.weight = f5;
                    } else {
                        layoutParams.gravity = n15;
                        ajioTextView.setGravity(n15);
                        layoutParams.weight = f5;
                    }
                }
                n7 = trackOrderLayout.o;
                if (n7 != n3) {
                    n7 = 4;
                    ajioTextView.setVisibility(n7);
                }
                if ((n7 = (int)(TextUtils.isEmpty((CharSequence)(string4 = ((StatusHistory)object2).getUpdateDate())) ? 1 : 0)) == 0) {
                    string2 = k7.c(((StatusHistory)object2).getUpdateDate(), (String)object4, (String)object3);
                }
                object3 = new StringBuilder();
                object2 = hv3_0.u(((StatusHistory)object2).getStatus());
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(string3);
                ((StringBuilder)object3).append(string2);
                object2 = ((StringBuilder)object3).toString();
                ajioTextView.setText((CharSequence)object2);
                object2 = trackOrderLayout.c;
                object2.addView((View)ajioTextView, (ViewGroup.LayoutParams)layoutParams);
                ++n3;
            }
            arrayList2 = trackOrderLayout.d;
            f6 = n14 *= 2;
            arrayList2.setWeightSum(f6);
            arrayList2 = null;
            for (n3 = 0; n3 < (n14 = trackOrderLayout.j); ++n3) {
                object2 = (StatusHistory)trackOrderLayout.m.get(n3);
                ajioTextView = LayoutInflater.from((Context)this.getContext());
                int n20 = R$layout.track_step_text;
                ajioTextView = (AjioTextView)ajioTextView.inflate(n20, null, false);
                layoutInflater = new LinearLayout.LayoutParams(0, n8);
                if (n3 == 0) {
                    layoutInflater.gravity = n4;
                    ajioTextView.setGravity(n4);
                    layoutInflater.weight = f5;
                } else {
                    n10 = trackOrderLayout.j - n15;
                    if (n3 == n10) {
                        layoutInflater.gravity = n7;
                        ajioTextView.setGravity(n7);
                        layoutInflater.weight = f5;
                    } else {
                        layoutInflater.gravity = n15;
                        ajioTextView.setGravity(n15);
                        layoutInflater.weight = f5;
                    }
                }
                n10 = trackOrderLayout.o;
                if (n10 == n3) {
                    n10 = 4;
                    ajioTextView.setVisibility(n10);
                } else {
                    n10 = 4;
                }
                String string5 = ((StatusHistory)object2).getUpdateDate();
                boolean bl2 = TextUtils.isEmpty((CharSequence)string5);
                object = !bl2 ? k7.c(((StatusHistory)object2).getUpdateDate(), (String)object4, (String)object3) : string2;
                StringBuilder stringBuilder = new StringBuilder();
                object2 = hv3_0.u(((StatusHistory)object2).getStatus());
                stringBuilder.append((String)object2);
                stringBuilder.append(string3);
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
                ajioTextView.setText((CharSequence)object);
                trackOrderLayout.d.addView((View)ajioTextView, (ViewGroup.LayoutParams)layoutInflater);
                n10 = 0;
                object = null;
                n15 = 1;
            }
        }
    }
}

