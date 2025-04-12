/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.Product.ProductImage;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DynamicCirclePageIndicator
extends View {
    public static final int $stable = 8;
    private final Paint activeDotPaint;
    private int currentPageIndexCheck;
    private final Paint dotPaint;
    private ArrayList isVideoPage;
    private int pageCount;
    private Drawable videoIcon;

    public DynamicCirclePageIndicator(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 0, 6, null);
    }

    public DynamicCirclePageIndicator(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 0, 4, null);
    }

    public DynamicCirclePageIndicator(Context context, AttributeSet object, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, object, n3);
        n3 = 1;
        super(n3);
        int n4 = hv3_0.m(R$color.dot_color);
        object.setColor(n4);
        Paint.Style style2 = Paint.Style.FILL;
        object.setStyle(style2);
        this.dotPaint = object;
        super(n3);
        n3 = hv3_0.m(R$color.white);
        object.setColor(n3);
        object.setStyle(style2);
        this.activeDotPaint = object;
        super();
        this.isVideoPage = object;
        int n7 = R$drawable.video_icon;
        context = t70.getDrawable(context, n7);
        this.videoIcon = context;
    }

    public /* synthetic */ DynamicCirclePageIndicator(Context context, AttributeSet attributeSet, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            attributeSet = null;
        }
        if ((n4 &= 4) != 0) {
            n3 = 0;
        }
        this(context, attributeSet, n3);
    }

    public final int getCurrentPageIndexCheck() {
        return this.currentPageIndexCheck;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final ArrayList isVideoPage() {
        return this.isVideoPage;
    }

    public void onDraw(Canvas canvas) {
        String string2 = "canvas";
        Intrinsics.checkNotNullParameter(canvas, string2);
        super.onDraw(canvas);
        int n3 = this.getHeight();
        float f5 = n3;
        float f6 = this.getPaddingBottom();
        float f7 = 10.0f;
        f6 = f6 + f7 + 1.0f;
        f5 -= f6;
        int n4 = this.pageCount;
        for (int i3 = 0; i3 < n4; ++i3) {
            Boolean bl2;
            int n7 = this.getWidth();
            int n8 = 2;
            float f8 = n7 / n8;
            int n10 = this.pageCount;
            int n14 = 1;
            float f11 = Float.MIN_VALUE;
            float f12 = n10 -= n14;
            int n15 = 1108082688;
            float f14 = 35.0f;
            f12 *= f14;
            float f15 = n8;
            f8 -= (f12 /= f15);
            f15 = (float)i3 * f14 + f8;
            Boolean bl3 = ((ProductImage)this.isVideoPage.get(i3)).getFlagForImageAndVideo();
            n7 = (int)(Intrinsics.areEqual(bl3, bl2 = Boolean.TRUE) ? 1 : 0);
            if (n7 != 0) {
                n7 = this.currentPageIndexCheck;
                if (i3 == n7) {
                    bl3 = this.getContext();
                    n10 = R$drawable.selected_video_icon;
                    bl3 = t70.getDrawable((Context)bl3, n10);
                } else {
                    bl3 = this.videoIcon;
                }
                if (bl3 == null) continue;
                f12 = 16;
                f11 = f15 - f12;
                n14 = (int)f11;
                n15 = 12;
                f14 = n15;
                float f16 = f5 - f14;
                int n16 = (int)f16;
                n8 = (int)(f15 += f12);
                n10 = (int)(f14 += f5);
                bl3.setBounds(n14, n16, n8, n10);
                bl3.draw(canvas);
                continue;
            }
            n7 = this.currentPageIndexCheck;
            bl3 = i3 == n7 ? this.activeDotPaint : this.dotPaint;
            bl2 = new Paint();
            Paint.Style style2 = Paint.Style.STROKE;
            bl2.setStyle(style2);
            n15 = hv3_0.m(R$color.color_6d6d6d);
            bl2.setColor(n15);
            n15 = 0x40400000;
            f14 = 3.0f;
            bl2.setStrokeWidth(f14);
            bl2.setAntiAlias(n14 != 0);
            canvas.drawCircle(f15, f5, f7, (Paint)bl2);
            canvas.drawCircle(f15, f5, f7, (Paint)bl3);
        }
    }

    public final void setCurrentPageIndexChange(int n3) {
        this.currentPageIndexCheck = n3;
        this.invalidate();
    }

    public final void setCurrentPageIndexCheck(int n3) {
        this.currentPageIndexCheck = n3;
    }

    public final void setPageCount(int n3) {
        this.pageCount = n3;
    }

    public final void setPageType(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "pageTypes");
        this.isVideoPage = arrayList;
        this.invalidate();
    }

    public final void setVideoPage(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.isVideoPage = arrayList;
    }
}

