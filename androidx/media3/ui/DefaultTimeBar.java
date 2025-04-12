/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.R$styleable;
import androidx.media3.ui.b;
import androidx.media3.ui.b$a;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class DefaultTimeBar
extends View
implements b {
    public static final /* synthetic */ int P;
    public int A;
    public long B;
    public int C;
    public Rect D;
    public final ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Drawable k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final X90 w;
    public final CopyOnWriteArraySet x;
    public final Point y;
    public final float z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int n3) {
        this(context, attributeSet, n3, attributeSet, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int n3, AttributeSet attributeSet2, int n4) {
        long l2;
        int n7;
        int n8;
        Object object;
        Object object2;
        Object object3;
        DefaultTimeBar defaultTimeBar;
        block11: {
            int n10;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            Paint paint;
            Paint paint2;
            Paint paint3;
            Paint paint4;
            block10: {
                Throwable throwable2;
                block9: {
                    int n19;
                    int n20;
                    Paint paint5;
                    Paint paint6;
                    float f5;
                    block8: {
                        Point point;
                        defaultTimeBar = this;
                        object3 = attributeSet2;
                        super(context, attributeSet, n3);
                        this.a = object2 = new Rect();
                        this.b = object2 = new Rect();
                        this.c = object2 = new Rect();
                        this.d = object2 = new Rect();
                        super();
                        this.e = object2;
                        this.f = object = new Paint();
                        this.g = paint4 = new Paint();
                        this.h = paint3 = new Paint();
                        this.i = paint2 = new Paint();
                        this.j = paint = new Paint();
                        paint.setAntiAlias(true);
                        this.x = point = new CopyOnWriteArraySet();
                        this.y = point = new Point();
                        point = context.getResources().getDisplayMetrics();
                        this.z = f5 = point.density;
                        this.t = n18 = DefaultTimeBar.b(f5, -50);
                        n18 = 4;
                        n17 = DefaultTimeBar.b(f5, n18);
                        n16 = DefaultTimeBar.b(f5, 26);
                        n18 = DefaultTimeBar.b(f5, n18);
                        n15 = DefaultTimeBar.b(f5, 12);
                        int n21 = 0;
                        int[] nArray = null;
                        n14 = DefaultTimeBar.b(f5, 0);
                        n10 = DefaultTimeBar.b(f5, 16);
                        if (attributeSet2 == null) break block10;
                        point = context.getTheme();
                        nArray = R$styleable.DefaultTimeBar;
                        paint6 = paint3;
                        paint5 = paint2;
                        n20 = n3;
                        int n22 = n4;
                        paint3 = point.obtainStyledAttributes(attributeSet2, nArray, n3, n4);
                        try {
                            n8 = R$styleable.DefaultTimeBar_scrubber_drawable;
                            object3 = paint3.getDrawable(n8);
                            this.k = object3;
                            if (object3 == null) break block8;
                            n20 = gz3.a;
                            n19 = 23;
                            f5 = 3.2E-44f;
                            if (n20 >= n19) {
                                n21 = this.getLayoutDirection();
                                if (n20 >= n19 && (n20 = (int)(mn0_0.a((Drawable)object3, n21) ? 1 : 0)) != 0) {
                                    n20 = 1;
                                } else {
                                    n20 = 0;
                                    paint2 = null;
                                }
                            }
                            n8 = object3.getMinimumHeight();
                            n16 = Math.max(n8, n16);
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    n8 = R$styleable.DefaultTimeBar_bar_height;
                    defaultTimeBar.l = n8 = paint3.getDimensionPixelSize(n8, n17);
                    n8 = R$styleable.DefaultTimeBar_touch_target_height;
                    defaultTimeBar.m = n8 = paint3.getDimensionPixelSize(n8, n16);
                    n8 = R$styleable.DefaultTimeBar_bar_gravity;
                    n20 = 0;
                    paint2 = null;
                    defaultTimeBar.n = n8 = paint3.getInt(n8, 0);
                    n8 = R$styleable.DefaultTimeBar_ad_marker_width;
                    defaultTimeBar.o = n8 = paint3.getDimensionPixelSize(n8, n18);
                    n8 = R$styleable.DefaultTimeBar_scrubber_enabled_size;
                    defaultTimeBar.p = n8 = paint3.getDimensionPixelSize(n8, n15);
                    n8 = R$styleable.DefaultTimeBar_scrubber_disabled_size;
                    defaultTimeBar.q = n8 = paint3.getDimensionPixelSize(n8, n14);
                    n8 = R$styleable.DefaultTimeBar_scrubber_dragged_size;
                    defaultTimeBar.r = n8 = paint3.getDimensionPixelSize(n8, n10);
                    n8 = R$styleable.DefaultTimeBar_played_color;
                    n20 = -1;
                    n8 = paint3.getInt(n8, n20);
                    n10 = R$styleable.DefaultTimeBar_scrubber_color;
                    n20 = paint3.getInt(n10, n20);
                    n10 = R$styleable.DefaultTimeBar_buffered_color;
                    n19 = -855638017;
                    f5 = -1.3421772E8f;
                    n10 = paint3.getInt(n10, n19);
                    n19 = R$styleable.DefaultTimeBar_unplayed_color;
                    n18 = 0x33FFFFFF;
                    n19 = paint3.getInt(n19, n18);
                    n18 = R$styleable.DefaultTimeBar_ad_marker_color;
                    n17 = -1291845888;
                    n18 = paint3.getInt(n18, n17);
                    n17 = R$styleable.DefaultTimeBar_played_ad_marker_color;
                    n16 = 0x33FFFF00;
                    n17 = paint3.getInt(n17, n16);
                    object2.setColor(n8);
                    paint.setColor(n20);
                    object.setColor(n10);
                    paint4.setColor(n19);
                    object3 = paint6;
                    paint6.setColor(n18);
                    paint2 = paint5;
                    paint5.setColor(n17);
                    paint3.recycle();
                    break block11;
                }
                paint3.recycle();
                throw throwable2;
            }
            object3 = paint3;
            this.l = n17;
            this.m = n16;
            paint3 = null;
            this.n = 0;
            this.o = n18;
            this.p = n15;
            this.q = n14;
            this.r = n10;
            int n24 = -1;
            object2.setColor(n24);
            paint.setColor(n24);
            object.setColor(-855638017);
            paint4.setColor(0x33FFFFFF);
            n7 = -1291845888;
            object3.setColor(n7);
            paint2.setColor(0x33FFFF00);
            n8 = 0;
            object3 = null;
            this.k = null;
        }
        super();
        defaultTimeBar.u = object3;
        object = Locale.getDefault();
        super((Appendable)object3, (Locale)object);
        defaultTimeBar.v = object2;
        n7 = 1;
        super(defaultTimeBar, n7);
        defaultTimeBar.w = object3;
        object3 = defaultTimeBar.k;
        if (object3 != null) {
            n8 = object3.getMinimumWidth();
            n7 = 1;
            defaultTimeBar.s = n8 = (n8 + n7) / 2;
        } else {
            n7 = 1;
            n8 = defaultTimeBar.q;
            int n25 = defaultTimeBar.p;
            int n26 = defaultTimeBar.r;
            n25 = Math.max(n25, n26);
            defaultTimeBar.s = n8 = (Math.max(n8, n25) + n7) / 2;
        }
        defaultTimeBar.F = 1.0f;
        super();
        defaultTimeBar.E = object3;
        super(defaultTimeBar);
        object3.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        defaultTimeBar.J = l2 = -9223372036854775807L;
        defaultTimeBar.B = l2;
        defaultTimeBar.A = 20;
        n8 = 1;
        defaultTimeBar.setFocusable(n8 != 0);
        n7 = this.getImportantForAccessibility();
        if (n7 == 0) {
            defaultTimeBar.setImportantForAccessibility(n8);
        }
    }

    public static int b(float f5, int n3) {
        return (int)((float)n3 * f5 + 0.5f);
    }

    private long getPositionIncrement() {
        long l2 = this.B;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l2 = this.J;
            long l7 = l2 - l3;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object == false) {
                l2 = 0L;
            } else {
                int n3 = this.A;
                l3 = n3;
                l2 /= l3;
            }
        }
        return l2;
    }

    private String getProgressText() {
        Formatter formatter = this.v;
        long l2 = this.K;
        return gz3.u(this.u, formatter, l2);
    }

    private long getScrubberPosition() {
        long l2;
        long l3;
        long l4;
        long l7;
        Rect rect = this.b;
        int n3 = rect.width();
        if (n3 > 0 && (l7 = (l4 = (l3 = this.J) - (l2 = -9223372036854775807L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            l3 = this.d.width();
            l2 = this.J;
            l3 *= l2;
            l2 = rect.width();
            return l3 / l2;
        }
        return 0L;
    }

    public final void a(b$a b$a) {
        this.x.add(b$a);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c(long l2) {
        long l3 = this.J;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object <= 0) {
            return false;
        }
        Object object2 = this.H;
        l4 = object2 ? this.I : this.K;
        long l8 = l4;
        long l12 = 0L;
        long l14 = (l2 = gz3.i(l4 += l2, l12, l3)) - l8;
        object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (!object2) {
            return false;
        }
        object2 = this.H;
        if (!object2) {
            this.d(l2);
        } else {
            this.g(l2);
        }
        this.f();
        return true;
    }

    public final void d(long l2) {
        boolean bl2;
        boolean bl3;
        this.I = l2;
        this.H = bl3 = true;
        this.setPressed(bl3);
        Object object = this.getParent();
        if (object != null) {
            object.requestDisallowInterceptTouchEvent(bl3);
        }
        Iterator iterator = this.x.iterator();
        while (bl2 = iterator.hasNext()) {
            object = (b$a)iterator.next();
            object.E(l2);
        }
    }

    public final void drawableStateChanged() {
        int[] nArray;
        boolean bl2;
        boolean bl3;
        super.drawableStateChanged();
        Drawable drawable2 = this.k;
        if (drawable2 != null && (bl3 = drawable2.isStateful()) && (bl2 = drawable2.setState(nArray = this.getDrawableState()))) {
            this.invalidate();
        }
    }

    public final void e(boolean bl2) {
        boolean bl3;
        Object object = this.w;
        this.removeCallbacks((Runnable)object);
        object = null;
        this.H = false;
        this.setPressed(false);
        Object object2 = this.getParent();
        if (object2 != null) {
            object2.requestDisallowInterceptTouchEvent(false);
        }
        this.invalidate();
        object = this.x.iterator();
        while (bl3 = object.hasNext()) {
            object2 = (b$a)object.next();
            long l2 = this.I;
            object2.J(l2, bl2);
        }
    }

    public final void f() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        int n3 = this.H;
        long l2 = n3 != 0 ? this.I : this.K;
        long l3 = this.J;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0) {
            l3 = rect2.width();
            l4 = this.L;
            l3 *= l4;
            l4 = this.J;
            int n4 = (int)(l3 / l4);
            int n7 = rect2.left + n4;
            n4 = rect2.right;
            rect.right = n7 = Math.min(n7, n4);
            l3 = (long)rect2.width() * l2;
            l2 = this.J;
            int n8 = (int)(l3 /= l2);
            n3 = rect2.left + n8;
            n8 = rect2.right;
            rect3.right = n8 = Math.min(n3, n8);
        } else {
            int n10;
            rect.right = n10 = rect2.left;
            rect3.right = n10;
        }
        rect = this.a;
        this.invalidate(rect);
    }

    public final void g(long l2) {
        boolean bl2;
        long l3 = this.I;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        this.I = l2;
        Iterator iterator = this.x.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a b$a = (b$a)iterator.next();
            b$a.I(l2);
        }
    }

    public long getPreferredUpdateDelay() {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        Rect rect = this.b;
        float f5 = rect.width();
        float f6 = this.z;
        int n3 = (int)(f5 /= f6);
        if (n3 != 0 && (l8 = (l7 = (l4 = this.J) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false && (l8 = (l2 = l4 - (l3 = -9223372036854775807L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            l3 = n3;
            l4 /= l3;
        } else {
            l4 = Long.MAX_VALUE;
        }
        return l4;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    public final void onDraw(Canvas canvas) {
        float f5;
        int n3;
        Paint paint;
        long l2;
        int n4;
        float f6;
        float f7;
        float f8;
        float f11;
        DefaultTimeBar defaultTimeBar = this;
        Canvas canvas2 = canvas;
        canvas.save();
        Rect rect = this.b;
        int n7 = rect.height();
        int n8 = rect.centerY();
        int n10 = n7 / 2;
        int n14 = n8 - n10;
        int n15 = n14 + n7;
        long l3 = this.J;
        Paint paint2 = this.g;
        Rect rect2 = this.d;
        long l4 = 0L;
        n10 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
        if (n10 <= 0) {
            f11 = rect.left;
            f8 = n14;
            n7 = rect.right;
            f7 = n7;
            f6 = n15;
            Canvas canvas3 = canvas;
            canvas.drawRect(f11, f8, f7, f6, paint2);
        } else {
            Rect rect3 = this.c;
            int n16 = rect3.left;
            int n17 = rect3.right;
            n7 = Math.max(rect.left, n17);
            n8 = rect2.right;
            if ((n7 = Math.max(n7, n8)) < (n8 = rect.right)) {
                f8 = n7;
                f7 = n14;
                f6 = n8;
                f11 = n15;
                rect3 = canvas;
                float f12 = f11;
                f11 = f8;
                f8 = f7;
                f7 = f6;
                f6 = f12;
                canvas.drawRect(f11, f8, f7, f12, paint2);
            }
            n7 = rect2.right;
            if (n17 > (n7 = Math.max(n16, n7))) {
                f11 = n7;
                f8 = n14;
                f7 = n17;
                f6 = n15;
                paint2 = defaultTimeBar.f;
                rect3 = canvas;
                canvas.drawRect(f11, f8, f7, f6, paint2);
            }
            if ((n7 = rect2.width()) > 0) {
                f11 = rect2.left;
                f8 = n14;
                n7 = rect2.right;
                f7 = n7;
                f6 = n15;
                paint2 = defaultTimeBar.e;
                rect3 = canvas;
                canvas.drawRect(f11, f8, f7, f6, paint2);
            }
            if ((n7 = defaultTimeBar.M) != 0) {
                long[] lArray = defaultTimeBar.N;
                lArray.getClass();
                boolean[] blArray = defaultTimeBar.O;
                blArray.getClass();
                n4 = defaultTimeBar.o;
                int n18 = n4 / 2;
                l2 = 0;
                f6 = 0.0f;
                f7 = 0.0f;
                paint = null;
                for (n3 = 0; n3 < (n7 = defaultTimeBar.M); ++n3) {
                    long l7 = lArray[n3];
                    long l8 = 0L;
                    l3 = defaultTimeBar.J;
                    l3 = gz3.i(l7, l8, l3);
                    l4 = (long)rect.width() * l3;
                    l3 = defaultTimeBar.J;
                    n7 = (int)(l4 /= l3) - n18;
                    n8 = rect.left;
                    n10 = rect.width() - n4;
                    n7 = Math.max(0, n7);
                    n7 = Math.min(n10, n7) + n8;
                    n8 = blArray[n3];
                    Paint paint3 = n8 != 0 ? defaultTimeBar.i : defaultTimeBar.h;
                    f11 = n7;
                    f8 = n14;
                    float f14 = n7 += n4;
                    f5 = n15;
                    rect3 = canvas;
                    f7 = f14;
                    f14 = 0.0f;
                    f6 = f5;
                    paint2 = paint3;
                    canvas.drawRect(f11, f8, f7, f5, paint3);
                    l2 = 0;
                    f6 = 0.0f;
                    l4 = 0L;
                }
            }
        }
        l3 = defaultTimeBar.J;
        long l12 = 0L;
        l2 = l3 == l12 ? 0 : (l3 < l12 ? -1 : 1);
        if (l2 > 0) {
            n7 = rect2.right;
            n8 = rect2.left;
            n10 = rect.right;
            n7 = gz3.h(n7, n8, n10);
            n8 = rect2.centerY();
            Drawable drawable2 = defaultTimeBar.k;
            if (drawable2 == null) {
                n10 = (int)(defaultTimeBar.H ? 1 : 0);
                n10 = n10 == 0 && (n10 = (int)(this.isFocused() ? 1 : 0)) == 0 ? ((n10 = (int)(this.isEnabled() ? 1 : 0)) != 0 ? defaultTimeBar.p : defaultTimeBar.q) : defaultTimeBar.r;
                f8 = n10;
                f7 = defaultTimeBar.F;
                f8 *= f7;
                n3 = 0x40000000;
                f7 = 2.0f;
                n10 = (int)(f8 / f7);
                f5 = n7;
                f11 = n8;
                f8 = n10;
                paint = defaultTimeBar.j;
                canvas2.drawCircle(f5, f11, f8, paint);
            } else {
                f7 = drawable2.getIntrinsicWidth();
                f6 = defaultTimeBar.F;
                n3 = (int)(f7 *= f6);
                f6 = drawable2.getIntrinsicHeight();
                float f15 = defaultTimeBar.F;
                l2 = (int)(f6 *= f15);
                n4 = n7 - (n3 /= 2);
                int n19 = n8 - (l2 /= 2);
                drawable2.setBounds(n4, n19, n7 += n3, n8 += l2);
                drawable2.draw(canvas2);
            }
        }
        canvas.restore();
    }

    public final void onFocusChanged(boolean bl2, int n3, Rect rect) {
        super.onFocusChanged(bl2, n3, rect);
        n3 = (int)(this.H ? 1 : 0);
        if (n3 != 0 && !bl2) {
            bl2 = false;
            this.e(false);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int n3 = accessibilityEvent.getEventType();
        int n4 = 4;
        if (n3 == n4) {
            List list = accessibilityEvent.getText();
            String string2 = this.getProgressText();
            list.add(string2);
        }
        accessibilityEvent.setClassName((CharSequence)"android.widget.SeekBar");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.SeekBar");
        String string2 = this.getProgressText();
        accessibilityNodeInfo.setContentDescription((CharSequence)string2);
        long l2 = this.J;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 <= 0) {
            return;
        }
        string2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD;
        accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction)string2);
        string2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD;
        accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction)string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onKeyDown(int n3, KeyEvent keyEvent) {
        boolean bl2 = this.isEnabled();
        if (!bl2) return super.onKeyDown(n3, keyEvent);
        long l2 = this.getPositionIncrement();
        int n4 = 66;
        boolean bl3 = true;
        if (n3 != n4) {
            switch (n3) {
                default: {
                    return super.onKeyDown(n3, keyEvent);
                }
                case 21: {
                    l2 = -l2;
                }
                case 22: {
                    bl2 = this.c(l2);
                    if (!bl2) return super.onKeyDown(n3, keyEvent);
                    X90 x90 = this.w;
                    this.removeCallbacks(x90);
                    this.postDelayed(x90, 1000L);
                    return bl3;
                }
                case 23: 
            }
        }
        if (!(bl2 = this.H)) return super.onKeyDown(n3, keyEvent);
        this.e(false);
        return bl3;
    }

    public final void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        Object object;
        Rect rect;
        n8 -= n4;
        n10 -= n7;
        n3 = this.getPaddingLeft();
        n4 = this.getPaddingRight();
        n4 = n8 - n4;
        n7 = (int)(this.G ? 1 : 0);
        if (n7 != 0) {
            n7 = 0;
            rect = null;
        } else {
            n7 = this.s;
        }
        int n14 = this.n;
        int n15 = 1;
        int n16 = this.l;
        int n17 = this.m;
        if (n14 == n15) {
            n14 = this.getPaddingBottom();
            n14 = n10 - n14 - n17;
            n15 = this.getPaddingBottom();
            n15 = n10 - n15 - n16;
            int n18 = n16 / 2;
            n18 = Math.max(n7 - n18, 0);
            n15 -= n18;
        } else {
            n14 = (n10 - n17) / 2;
            n15 = (n10 - n16) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(n3, n14, n4, n17 += n14);
        n3 = rect2.left + n7;
        n4 = rect2.right - n7;
        rect = this.b;
        rect.set(n3, n15, n4, n16 += n15);
        n3 = gz3.a;
        n4 = 29;
        if (n3 >= n4 && ((object = this.D) == null || (n3 = object.width()) != n8 || (n3 = (object = this.D).height()) != n10)) {
            this.D = object = new Rect(0, 0, n8, n10);
            object = Collections.singletonList(object);
            nn0.b(this, (List)object);
        }
        this.f();
    }

    public final void onMeasure(int n3, int n4) {
        int[] nArray;
        int n7 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.getSize((int)n4);
        int n8 = this.m;
        if (n7 == 0) {
            n4 = n8;
        } else {
            int n10 = 0x40000000;
            if (n7 != n10) {
                n4 = Math.min(n8, n4);
            }
        }
        n3 = View.MeasureSpec.getSize((int)n3);
        this.setMeasuredDimension(n3, n4);
        Drawable drawable2 = this.k;
        if (drawable2 != null && (n4 = (int)(drawable2.isStateful() ? 1 : 0)) != 0 && (n3 = (int)(drawable2.setState(nArray = this.getDrawableState()) ? 1 : 0)) != 0) {
            this.invalidate();
        }
    }

    public final void onRtlPropertiesChanged(int n3) {
        int n4;
        int n7;
        Drawable drawable2 = this.k;
        if (drawable2 != null && (n7 = gz3.a) >= (n4 = 23) && (n3 = (int)(mn0_0.a(drawable2, n3) ? 1 : 0)) != 0) {
            this.invalidate();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        block6: {
            int n3;
            Rect rect;
            int n4;
            int n7;
            int n8;
            block7: {
                int n10;
                block8: {
                    block9: {
                        long l2;
                        long l3;
                        long l4;
                        n8 = this.isEnabled();
                        n7 = 0;
                        if (n8 == 0 || (n8 = (l4 = (l3 = this.J) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) break block6;
                        Point point = this.y;
                        float f5 = motionEvent.getX();
                        n4 = (int)f5;
                        float f6 = motionEvent.getY();
                        int n14 = (int)f6;
                        point.set(n4, n14);
                        n4 = point.x;
                        n8 = point.y;
                        n14 = motionEvent.getAction();
                        Rect rect2 = this.d;
                        rect = this.b;
                        n3 = 1;
                        if (n14 == 0) break block7;
                        n10 = 3;
                        if (n14 == n3) break block8;
                        int n15 = 2;
                        if (n14 == n15) break block9;
                        if (n14 == n10) break block8;
                        break block6;
                    }
                    int n16 = this.H;
                    if (n16 != 0) {
                        n16 = this.t;
                        if (n8 < n16) {
                            n16 = this.C;
                            n4 = (n4 - n16) / n10 + n16;
                            float f7 = n4;
                            n16 = (int)f7;
                            n8 = rect.left;
                            n7 = rect.right;
                            rect2.right = n16 = gz3.h(n16, n8, n7);
                        } else {
                            this.C = n4;
                            float f8 = n4;
                            n16 = (int)f8;
                            n8 = rect.left;
                            n7 = rect.right;
                            rect2.right = n16 = gz3.h(n16, n8, n7);
                        }
                        long l7 = this.getScrubberPosition();
                        this.g(l7);
                        this.f();
                        this.invalidate();
                        return n3 != 0;
                    }
                    break block6;
                }
                if ((n8 = (int)(this.H ? 1 : 0)) != 0) {
                    int n17 = motionEvent.getAction();
                    if (n17 == n10) {
                        n7 = 1;
                    }
                    this.e(n7 != 0);
                    return n3 != 0;
                }
                break block6;
            }
            float f11 = n4;
            float f12 = n8;
            int n18 = (int)f11;
            n8 = (int)f12;
            Rect rect3 = this.a;
            if ((n8 = (int)(rect3.contains(n18, n8) ? 1 : 0)) != 0) {
                n8 = rect.left;
                n7 = rect.right;
                rect2.right = n18 = gz3.h(n18, n8, n7);
                long l8 = this.getScrubberPosition();
                this.d(l8);
                this.f();
                this.invalidate();
                return n3 != 0;
            }
        }
        return false;
    }

    public final boolean performAccessibilityAction(int n3, Bundle bundle) {
        block10: {
            boolean bl2;
            block9: {
                int n4;
                long l2;
                block8: {
                    boolean bl3 = super.performAccessibilityAction(n3, bundle);
                    bl2 = true;
                    if (bl3) {
                        return bl2;
                    }
                    l2 = this.J;
                    long l3 = 0L;
                    bl3 = false;
                    bundle = null;
                    Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object <= 0) {
                        return false;
                    }
                    n4 = 8192;
                    if (n3 != n4) break block8;
                    l2 = -this.getPositionIncrement();
                    n3 = (int)(this.c(l2) ? 1 : 0);
                    if (n3 != 0) {
                        this.e(false);
                    }
                    break block9;
                }
                n4 = 4096;
                if (n3 != n4) break block10;
                l2 = this.getPositionIncrement();
                n3 = (int)(this.c(l2) ? 1 : 0);
                if (n3 != 0) {
                    this.e(false);
                }
            }
            this.sendAccessibilityEvent(4);
            return bl2;
        }
        return false;
    }

    public void setAdGroupTimesMs(long[] lArray, boolean[] blArray, int n3) {
        boolean bl2 = n3 == 0 || lArray != null && blArray != null;
        ct3.a(bl2);
        this.M = n3;
        this.N = lArray;
        this.O = blArray;
        this.f();
    }

    public void setAdMarkerColor(int n3) {
        this.h.setColor(n3);
        Rect rect = this.a;
        this.invalidate(rect);
    }

    public void setBufferedColor(int n3) {
        this.f.setColor(n3);
        Rect rect = this.a;
        this.invalidate(rect);
    }

    public void setBufferedPosition(long l2) {
        long l3 = this.L;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        this.L = l2;
        this.f();
    }

    public void setDuration(long l2) {
        long l3;
        long l4 = this.J;
        long l7 = l4 - l2;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        this.J = l2;
        boolean bl2 = this.H;
        if (bl2 && (object = (l3 = l2 - (l4 = -9223372036854775807L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
            boolean bl3 = true;
            this.e(bl3);
        }
        this.f();
    }

    public void setEnabled(boolean bl2) {
        super.setEnabled(bl2);
        boolean bl3 = this.H;
        if (bl3 && !bl2) {
            bl2 = true;
            this.e(bl2);
        }
    }

    public void setKeyCountIncrement(int n3) {
        boolean bl2 = n3 > 0;
        ct3.a(bl2);
        this.A = n3;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        ct3.a(bl2);
        this.A = -1;
        this.B = l2;
    }

    public void setPlayedAdMarkerColor(int n3) {
        this.i.setColor(n3);
        Rect rect = this.a;
        this.invalidate(rect);
    }

    public void setPlayedColor(int n3) {
        this.e.setColor(n3);
        Rect rect = this.a;
        this.invalidate(rect);
    }

    public void setPosition(long l2) {
        long l3 = this.K;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        this.K = l2;
        String string2 = this.getProgressText();
        this.setContentDescription(string2);
        this.f();
    }

    public void setScrubberColor(int n3) {
        this.j.setColor(n3);
        Rect rect = this.a;
        this.invalidate(rect);
    }

    public void setUnplayedColor(int n3) {
        this.g.setColor(n3);
        Rect rect = this.a;
        this.invalidate(rect);
    }
}

