/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 */
package com.clevertap.android.sdk.customviews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$a;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$b;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$c;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$d;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$e;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class MediaPlayerRecyclerView
extends RecyclerView {
    public static final /* synthetic */ int f;
    public final yg1_1 a;
    public final Rect b;
    public final MediaPlayerRecyclerView$c c;
    public final MediaPlayerRecyclerView$b d;
    public CTInboxBaseMessageViewHolder e;

    public MediaPlayerRecyclerView(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super((Context)object);
        object = qb3_2.c;
        int[] nArray = MediaPlayerRecyclerView$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        object = n3 == n4 ? new Object() : new Object();
        this.a = object;
        object = new Rect();
        this.b = object;
        this.c = object = new MediaPlayerRecyclerView$c(this);
        this.d = object = new MediaPlayerRecyclerView$b(this);
        this.a();
    }

    public MediaPlayerRecyclerView(Context object, AttributeSet object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "attrs";
        Intrinsics.checkNotNullParameter(object2, string2);
        super((Context)object, (AttributeSet)object2);
        object = qb3_2.c;
        object2 = MediaPlayerRecyclerView$a.$EnumSwitchMapping$0;
        Object object3 = ((Enum)object).ordinal();
        object3 = object2[object3];
        Object object4 = 1;
        object = object3 == object4 ? new Object() : new Object();
        this.a = object;
        object = new Rect();
        this.b = object;
        this.c = object = new MediaPlayerRecyclerView$c(this);
        this.d = object = new MediaPlayerRecyclerView$b(this);
        this.a();
    }

    public MediaPlayerRecyclerView(Context object, AttributeSet object2, int n3) {
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "attrs";
        Intrinsics.checkNotNullParameter(object2, string2);
        super((Context)object, (AttributeSet)object2, n3);
        object = qb3_2.c;
        object2 = MediaPlayerRecyclerView$a.$EnumSwitchMapping$0;
        Object object3 = ((Enum)object).ordinal();
        object3 = object2[object3];
        Object object4 = 1;
        object = object3 == object4 ? new Object() : new Object();
        this.a = object;
        object = new Rect();
        this.b = object;
        this.c = object = new MediaPlayerRecyclerView$c(this);
        this.d = object = new MediaPlayerRecyclerView$b(this);
        this.a();
    }

    public final void a() {
        an1_0 an1_02;
        zm1_0 zm1_02;
        Context context = this.getContext().getApplicationContext();
        Object object = "context.applicationContext";
        Intrinsics.checkNotNullExpressionValue(context, (String)object);
        Object object2 = zm1_02;
        zm1_02 = new FunctionReferenceImpl(0, this, MediaPlayerRecyclerView.class, "bufferingStarted", "bufferingStarted()V", 0);
        object2 = an1_02;
        an1_02 = new FunctionReferenceImpl(0, this, MediaPlayerRecyclerView.class, "playerReady", "playerReady()V", 0);
        yg1_1 yg1_12 = this.a;
        yg1_12.b(context, zm1_02, an1_02);
        context = this.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, (String)object);
        object2 = object;
        object = new FunctionReferenceImpl(0, this, MediaPlayerRecyclerView.class, "artworkAsset", "artworkAsset()Landroid/graphics/drawable/Drawable;", 0);
        yg1_12.d(context, (bn1_0)object);
        object2 = this.c;
        this.removeOnScrollListener((RecyclerView$s)object2);
        MediaPlayerRecyclerView$b mediaPlayerRecyclerView$b = this.d;
        this.removeOnChildAttachStateChangeListener(mediaPlayerRecyclerView$b);
        this.addOnScrollListener((RecyclerView$s)object2);
        this.addOnChildAttachStateChangeListener(mediaPlayerRecyclerView$b);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b() {
        block33: {
            block34: {
                var1_1 = 1;
                var2_2 = (LinearLayoutManager)this.getLayoutManager();
                var3_3 = null;
                if (var2_2 != null) {
                    var4_4 = var2_2.findFirstVisibleItemPosition();
                } else {
                    var4_4 = 0;
                    var5_5 = 0.0f;
                    var2_2 = null;
                }
                var6_6 = (LinearLayoutManager)this.getLayoutManager();
                if (var6_6 != null) {
                    var7_7 = var6_6.findLastVisibleItemPosition();
                } else {
                    var7_7 = 0;
                    var8_8 = 0.0f;
                    var6_6 = null;
                }
                var9_9 = 0;
                var10_10 = null;
                var11_11 /* !! */  = this.b;
                if (var4_4 <= var7_7) {
                    var12_12 = var4_4;
                    var13_13 /* !! */  = null;
                    var14_14 = 0;
                    var15_15 = null;
                    while (true) {
                        if ((var17_17 /* !! */  = this.getChildAt(var16_16 = var12_12 - var4_4)) != null) {
                            var18_18 = (var17_17 /* !! */  = var17_17 /* !! */ .getTag()) instanceof CTInboxBaseMessageViewHolder;
                            if (var18_18 != 0) {
                                var17_17 /* !! */  = (CTInboxBaseMessageViewHolder)var17_17 /* !! */ ;
                            } else {
                                var16_16 = 0;
                                var17_17 /* !! */  = null;
                            }
                            if (var17_17 /* !! */  != null && (var18_18 = var17_17 /* !! */ .n) != 0) {
                                var19_19 = var17_17 /* !! */ .itemView;
                                var18_18 = var19_19.getGlobalVisibleRect(var11_11 /* !! */ );
                                if (var18_18 != 0) {
                                    var18_18 = var11_11 /* !! */ .height();
                                } else {
                                    var18_18 = 0;
                                    var20_20 = 0.0f;
                                    var19_19 = null;
                                }
                                if (var18_18 > var14_14) {
                                    var13_13 /* !! */  = var17_17 /* !! */ ;
                                    var14_14 = var18_18;
                                }
                            }
                        }
                        if (var12_12 != var7_7) {
                            var12_12 += var1_1;
                            continue;
                        }
                        break;
                    }
                } else {
                    var13_13 /* !! */  = null;
                }
                if (var13_13 /* !! */  == null) {
                    this.c();
                    return;
                }
                var2_2 = this.e;
                var6_6 = this.a;
                if (var2_2 != null && (var12_12 = (int)Intrinsics.areEqual(var21_21 = var2_2.itemView, var15_15 = var13_13 /* !! */ .itemView)) != 0) {
                    var10_10 = var2_2.itemView;
                    var9_9 = var10_10.getGlobalVisibleRect(var11_11 /* !! */ );
                    if (var9_9 != 0) {
                        var9_9 = var11_11 /* !! */ .height();
                    } else {
                        var9_9 = 0;
                        var10_10 = null;
                    }
                    var22_22 = 400;
                    if (var9_9 >= var22_22) {
                        var9_9 = 1;
                    } else {
                        var9_9 = 0;
                        var10_10 = null;
                    }
                    if (var9_9 != 0 && (var4_4 = (int)(var2_2 = var2_2.j).l()) != 0) {
                        var6_6.setPlayWhenReady((boolean)var1_1);
                    } else {
                        var6_6.setPlayWhenReady(false);
                    }
                    return;
                }
                this.c();
                this.a();
                var5_5 = var6_6.e();
                var11_11 /* !! */  = new MediaPlayerRecyclerView$d(this);
                var21_21 = new MediaPlayerRecyclerView$e(this);
                var6_6 = var6_6.a();
                var14_14 = var13_13 /* !! */ .n;
                if (var14_14 == 0) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 = 0;
                        break block33;
                        break;
                    }
                }
                ** while ((var15_15 = var13_13 /* !! */ .d) == null)
lbl86:
                // 1 sources

                var15_15.removeAllViews();
                var16_16 = 8;
                var15_15.setVisibility(var16_16);
                var19_19 = var13_13 /* !! */ .a.getResources();
                var23_23 = var19_19.getDisplayMetrics();
                var24_24 = CTInboxActivity.u0;
                var25_25 = 2;
                var26_26 = 2.8E-45f;
                var27_27 = "l";
                if (var24_24 != var25_25) ** GOTO lbl111
                var19_19 = var13_13 /* !! */ .k.m;
                var18_18 = (int)var19_19.equalsIgnoreCase(var27_27);
                if (var18_18 != 0) {
                    var19_19 = var13_13 /* !! */ .e;
                    var20_20 = var19_19.getMeasuredHeight();
                    var28_28 = 1.76f;
                    var18_18 = Math.round(var20_20 *= var28_28);
                    var29_30 = var13_13 /* !! */ .e;
                    var24_24 = var29_30.getMeasuredHeight();
                } else {
                    var19_19 = var13_13 /* !! */ .f;
                    var18_18 = var19_19.getMeasuredHeight();
                    while (true) {
                        var24_24 = var18_18;
                        break block34;
                        break;
                    }
lbl111:
                    // 1 sources

                    var19_19 = var19_19.getDisplayMetrics();
                    var18_18 = var19_19.widthPixels;
                    if ((var24_24 = (int)(var29_31 = var13_13 /* !! */ .k.m).equalsIgnoreCase(var27_27)) == 0) ** continue;
                    var28_29 = var18_18;
                    var25_25 = 1058013184;
                    var26_26 = 0.5625f;
                    var24_24 = Math.round(var28_29 *= var26_26);
                }
            }
            var30_32 = new FrameLayout.LayoutParams(var18_18, var24_24);
            var6_6.setLayoutParams((ViewGroup.LayoutParams)var30_32);
            var15_15.addView((View)var6_6);
            var7_7 = Color.parseColor((String)var13_13 /* !! */ .k.b);
            var15_15.setBackgroundColor(var7_7);
            var6_6 = var13_13 /* !! */ .h;
            if (var6_6 != null) {
                var6_6.setVisibility(0);
            }
            if ((var7_7 = (int)(var6_6 = var13_13 /* !! */ .j).l()) != 0) {
                var19_19 = var13_13 /* !! */ .a;
                var6_6 = new ImageView((Context)var19_19);
                var13_13 /* !! */ .l = var6_6;
                var6_6.setVisibility(var16_16);
                var7_7 = 0;
                var8_8 = 0.0f;
                var6_6 = null;
                cfr_temp_0 = var5_5 - 0.0f;
                var4_4 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var4_4 > 0) {
                    var2_2 = var13_13 /* !! */ .l;
                    var6_6 = var13_13 /* !! */ .a.getResources();
                    var16_16 = R$drawable.ct_volume_on;
                    var19_19 = WK2.a;
                    var6_6 = var6_6.getDrawable(var16_16, null);
                    var2_2.setImageDrawable((Drawable)var6_6);
                } else {
                    var2_2 = var13_13 /* !! */ .l;
                    var6_6 = var13_13 /* !! */ .a.getResources();
                    var16_16 = R$drawable.ct_volume_off;
                    var19_19 = WK2.a;
                    var6_6 = var6_6.getDrawable(var16_16, null);
                    var2_2.setImageDrawable((Drawable)var6_6);
                }
                var5_5 = 30.0f;
                var7_7 = (int)TypedValue.applyDimension((int)var1_1, (float)var5_5, (DisplayMetrics)var23_23);
                var4_4 = (int)TypedValue.applyDimension((int)var1_1, (float)var5_5, (DisplayMetrics)var23_23);
                var10_10 = new FrameLayout.LayoutParams(var7_7, var4_4);
                var4_4 = (int)TypedValue.applyDimension((int)var1_1, (float)4.0f, (DisplayMetrics)var23_23);
                var8_8 = TypedValue.applyDimension((int)var1_1, (float)2.0f, (DisplayMetrics)var23_23);
                var7_7 = (int)var8_8;
                var10_10.setMargins(0, var4_4, var7_7, 0);
                var4_4 = 0x800005;
                var5_5 = 1.175495E-38f;
                var10_10.gravity = var4_4;
                var13_13 /* !! */ .l.setLayoutParams((ViewGroup.LayoutParams)var10_10);
                var2_2 = var13_13 /* !! */ .l;
                var3_3 = new ii_1((CTInboxBaseMessageViewHolder)var13_13 /* !! */ , (MediaPlayerRecyclerView$d)var11_11 /* !! */ );
                var2_2.setOnClickListener((View.OnClickListener)var3_3);
                var2_2 = var13_13 /* !! */ .l;
                var15_15.addView((View)var2_2);
            }
            var2_2 = var13_13 /* !! */ .j;
            var3_3 = var2_2.g;
            var4_4 = (int)var2_2.i();
            var2_2 = (boolean)var4_4;
            var7_7 = (int)var13_13 /* !! */ .j.l();
            var6_6 = (boolean)var7_7;
            var21_21.invoke(var3_3, var2_2, var6_6);
        }
        if (var1_1 != 0) {
            this.e = var13_13 /* !! */ ;
        }
    }

    public final void c() {
        this.a.pause();
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = this.e;
        if (cTInboxBaseMessageViewHolder != null) {
            Runnable runnable2;
            FrameLayout frameLayout = cTInboxBaseMessageViewHolder.h;
            if (frameLayout != null) {
                runnable2 = new gi_2(cTInboxBaseMessageViewHolder);
                frameLayout.post(runnable2);
            }
            if ((frameLayout = cTInboxBaseMessageViewHolder.l) != null) {
                runnable2 = new hi_2(cTInboxBaseMessageViewHolder);
                frameLayout.post(runnable2);
            }
            if ((cTInboxBaseMessageViewHolder = cTInboxBaseMessageViewHolder.d) != null) {
                cTInboxBaseMessageViewHolder.removeAllViews();
            }
        }
    }
}

