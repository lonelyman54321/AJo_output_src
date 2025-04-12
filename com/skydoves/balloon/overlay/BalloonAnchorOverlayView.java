/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Point
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.skydoves.balloon.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class BalloonAnchorOverlayView
extends View {
    public static final /* synthetic */ gn1_2[] l;
    public final dd3_1 a;
    public final dd3_1 b;
    public final dd3_1 c;
    public final dd3_1 d;
    public final dd3_1 e;
    public final dd3_1 f;
    public final dd3_1 g;
    public Bitmap h;
    public final Paint i;
    public final Paint j;
    public boolean k;

    static {
        Object object = BalloonAnchorOverlayView.class;
        en1_2 en1_22 = OY2.a(object, "anchorView", "getAnchorView()Landroid/view/View;", 0);
        en1_2 en1_23 = OY2.a(object, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0);
        en1_2 en1_24 = OY2.a(object, "overlayColor", "getOverlayColor()I", 0);
        en1_2 en1_25 = OY2.a(object, "overlayPaddingColor", "getOverlayPaddingColor()I", 0);
        en1_2 en1_26 = OY2.a(object, "overlayPadding", "getOverlayPadding()F", 0);
        en1_2 en1_27 = OY2.a(object, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0);
        object = OY2.a(object, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{en1_22, en1_23, en1_24, en1_25, en1_26, en1_27, object};
        l = gn1_2Array;
    }

    public BalloonAnchorOverlayView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 6, 0);
    }

    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 4, 0);
    }

    public BalloonAnchorOverlayView(Context object, AttributeSet object2, int n3) {
        dd3_1 dd3_12;
        Intrinsics.checkNotNullParameter(object, "context");
        super(object, object2, n3);
        object2 = ed3_1.a(this, null);
        this.a = object2;
        object2 = ed3_1.a(this, null);
        this.b = object2;
        object2 = 0;
        this.c = dd3_12 = ed3_1.a(this, object2);
        object2 = ed3_1.a(this, object2);
        this.d = object2;
        object2 = Float.valueOf(0.0f);
        object2 = ed3_1.a(this, object2);
        this.e = object2;
        object = ed3_1.a(this, null);
        this.f = object;
        object = cv_2.a;
        object = ed3_1.a(this, object);
        this.g = object;
        boolean bl2 = true;
        super((int)(bl2 ? 1 : 0));
        this.i = object;
        super((int)(bl2 ? 1 : 0));
        this.j = dd3_12;
        object.setAntiAlias(bl2);
        object.setFilterBitmap(bl2);
        object.setDither(bl2);
        dd3_12.setAntiAlias(bl2);
        dd3_12.setFilterBitmap(bl2);
        dd3_12.setDither(bl2);
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int n3, int n4) {
        if ((n3 &= 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, 0);
    }

    private final int getStatusBarHeight() {
        int n3;
        Rect rect = new Rect();
        Context context = this.getContext();
        boolean bl2 = context instanceof Activity;
        if (bl2) {
            context = ((Activity)context).getWindow().getDecorView();
            context.getWindowVisibleDisplayFrame(rect);
            n3 = rect.top;
        } else {
            n3 = 0;
            rect = null;
        }
        return n3;
    }

    public final void a(View object, Canvas canvas) {
        if (object != null) {
            float f5;
            float f6;
            int n3;
            int n4;
            Rect rect = new Rect();
            object.getGlobalVisibleRect(rect);
            Point point = this.getOverlayPosition();
            if (point != null) {
                n4 = point.x;
                float f7 = n4;
                float f8 = this.getOverlayPadding();
                f7 -= f8;
                int n7 = point.y;
                f8 = n7;
                float f11 = this.getOverlayPadding();
                f8 -= f11;
                f11 = this.getStatusBarHeight();
                f8 += f11;
                int n8 = point.x;
                int n10 = object.getWidth() + n8;
                f11 = n10;
                float f12 = this.getOverlayPadding() + f11;
                n3 = point.y;
                f6 = object.getHeight() + n3;
                f5 = this.getOverlayPadding() + f6;
                int n14 = this.getStatusBarHeight();
                f6 = n14;
                rect = new RectF(f7, f8, f12, f5 += f6);
            } else {
                n3 = rect.left;
                f5 = n3;
                float f14 = this.getOverlayPadding();
                f5 -= f14;
                n4 = rect.top;
                f14 = n4;
                float f15 = this.getOverlayPadding();
                f14 -= f15;
                int n15 = rect.right;
                f15 = n15;
                float f16 = this.getOverlayPadding() + f15;
                int n16 = rect.bottom;
                float f17 = n16;
                f15 = this.getOverlayPadding() + f17;
                object = new RectF(f5, f14, f16, f15);
                rect = object;
            }
            f6 = this.getOverlayPadding();
            n3 = 2;
            f5 = n3;
            point = new RectF((RectF)rect);
            point.inset(f6 /= f5, f6);
            object = this.getBalloonOverlayShape();
            n4 = object instanceof cv_2;
            if (n4 != 0) {
                object = this.i;
                canvas.drawOval((RectF)rect, (Paint)object);
                object = this.j;
                canvas.drawOval((RectF)point, (Paint)object);
            } else {
                boolean bl2 = object instanceof bv_2;
                if (bl2) {
                    object = (bv_2)object;
                    object.getClass();
                } else {
                    bl2 = object instanceof dv_2;
                    if (bl2) {
                        object = (dv_2)object;
                        object.getClass();
                    } else {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                }
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        float f5;
        int n3;
        PorterDuffXfermode porterDuffXfermode;
        Bitmap.Config config;
        int n4;
        Object object;
        int n7 = this.k;
        if (!(n7 == 0 && (object = this.h) != null && (object == null || (n7 = (int)(object.isRecycled() ? 1 : 0)) != (n4 = 1)) || (n7 = this.getWidth()) == 0 || (n7 = this.getHeight()) == 0 || (object = this.getAnchorView()) != null && (n7 = object.getWidth()) == 0 || (object = this.getAnchorView()) != null && (n7 = object.getHeight()) == 0)) {
            object = this.h;
            if (object != null && (n4 = (int)(object.isRecycled() ? 1 : 0)) == 0) {
                object.recycle();
            }
            n7 = this.getWidth();
            n4 = this.getHeight();
            config = Bitmap.Config.ARGB_8888;
            object = Bitmap.createBitmap((int)n7, (int)n4, (Bitmap.Config)config);
            this.h = object;
            Canvas canvas2 = new Canvas((Bitmap)object);
            object = this.i;
            config = PorterDuff.Mode.SRC_OUT;
            porterDuffXfermode = new PorterDuffXfermode((PorterDuff.Mode)config);
            object.setXfermode((Xfermode)porterDuffXfermode);
            n4 = this.getOverlayColor();
            object.setColor(n4);
            float f6 = this.getWidth();
            float f7 = this.getHeight();
            porterDuffXfermode = canvas2;
            canvas2.drawRect(0.0f, 0.0f, f6, f7, (Paint)object);
            config = PorterDuff.Mode.CLEAR;
            porterDuffXfermode = new PorterDuffXfermode((PorterDuff.Mode)config);
            object.setXfermode((Xfermode)porterDuffXfermode);
            n4 = 0;
            porterDuffXfermode = null;
            object.setColor(0);
            object = this.j;
            n3 = this.getOverlayPaddingColor();
            object.setColor(n3);
            config = Paint.Style.STROKE;
            object.setStyle((Paint.Style)config);
            f5 = this.getOverlayPadding();
            object.setStrokeWidth(f5);
            object = this.getAnchorViewList();
            if (object != null && (n7 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                object = this.getAnchorViewList();
                if (object != null) {
                    object = ((Iterable)object).iterator();
                    while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        config = (View)object.next();
                        this.a((View)config, canvas2);
                    }
                }
            } else {
                object = this.getAnchorView();
                this.a((View)object, canvas2);
            }
            this.k = false;
        }
        if ((object = this.h) != null && (n4 = object.isRecycled()) == 0 && canvas != null) {
            n4 = 0;
            porterDuffXfermode = null;
            n3 = 0;
            f5 = 0.0f;
            config = null;
            canvas.drawBitmap((Bitmap)object, 0.0f, 0.0f, null);
        }
    }

    public final View getAnchorView() {
        gn1_2 gn1_22 = l[0];
        return (View)this.a.b(gn1_22, (Object)this);
    }

    public final List getAnchorViewList() {
        gn1_2 gn1_22 = l[1];
        return (List)this.b.b(gn1_22, (Object)this);
    }

    public final ev_2 getBalloonOverlayShape() {
        gn1_2 gn1_22 = l[6];
        return (ev_2)this.g.b(gn1_22, (Object)this);
    }

    public final int getOverlayColor() {
        gn1_2 gn1_22 = l[2];
        return ((Number)this.c.b(gn1_22, (Object)this)).intValue();
    }

    public final float getOverlayPadding() {
        gn1_2 gn1_22 = l[4];
        return ((Number)this.e.b(gn1_22, (Object)this)).floatValue();
    }

    public final int getOverlayPaddingColor() {
        gn1_2 gn1_22 = l[3];
        return ((Number)this.d.b(gn1_22, (Object)this)).intValue();
    }

    public final Point getOverlayPosition() {
        gn1_2 gn1_22 = l[5];
        return (Point)this.f.b(gn1_22, (Object)this);
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        this.k = true;
    }

    public final void setAnchorView(View view) {
        gn1_2 gn1_22 = l[0];
        this.a.a(gn1_22, view);
    }

    public final void setAnchorViewList(List list) {
        gn1_2 gn1_22 = l[1];
        this.b.a(gn1_22, list);
    }

    public final void setBalloonOverlayShape(ev_2 ev_22) {
        Intrinsics.checkNotNullParameter(ev_22, "<set-?>");
        gn1_2 gn1_22 = l[6];
        this.g.a(gn1_22, ev_22);
    }

    public final void setOverlayColor(int n3) {
        gn1_2 gn1_22 = l[2];
        Integer n4 = n3;
        this.c.a(gn1_22, n4);
    }

    public final void setOverlayPadding(float f5) {
        gn1_2 gn1_22 = l[4];
        Float f6 = Float.valueOf(f5);
        this.e.a(gn1_22, f6);
    }

    public final void setOverlayPaddingColor(int n3) {
        gn1_2 gn1_22 = l[3];
        Integer n4 = n3;
        this.d.a(gn1_22, n4);
    }

    public final void setOverlayPosition(Point point) {
        gn1_2 gn1_22 = l[5];
        this.f.a(gn1_22, point);
    }
}

