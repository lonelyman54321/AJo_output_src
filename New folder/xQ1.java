/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Movie
 *  android.graphics.Paint
 *  android.graphics.Picture
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.os.SystemClock
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class xQ1
extends Drawable
implements Animatable {
    public final Movie a;
    public final Bitmap.Config b;
    public final WS2 c;
    public final Paint d;
    public final ArrayList e;
    public final Rect f;
    public final Rect g;
    public Canvas h;
    public Bitmap i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public long o;
    public long p;
    public int q;
    public Picture r;
    public Ms2 s;
    public boolean t;

    public xQ1(Movie object, Bitmap.Config object2, WS2 wS2) {
        float f5;
        this.a = object;
        this.b = object2;
        this.c = wS2;
        int n3 = 3;
        super(n3);
        this.d = object;
        super();
        this.e = object;
        super();
        this.f = object;
        super();
        this.g = object;
        this.j = f5 = 1.0f;
        this.k = f5;
        f5 = 0.0f / 0.0f;
        this.q = -1;
        object = Ms2.UNCHANGED;
        this.s = object;
        boolean bl2 = f.a(object2) ^ true;
        if (bl2) {
            return;
        }
        object2 = "Bitmap config must not be hardware.".toString();
        super((String)object2);
        throw object;
    }

    public final void a(Canvas canvas) {
        block13: {
            Throwable throwable2;
            int n3;
            Canvas canvas2;
            block14: {
                Paint paint;
                float f5;
                float f6;
                Bitmap bitmap;
                block12: {
                    canvas2 = this.h;
                    bitmap = this.i;
                    if (canvas2 == null || bitmap == null) break block13;
                    f6 = 0.0f;
                    PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
                    canvas2.drawColor(0, mode);
                    n3 = canvas2.save();
                    try {
                        f5 = this.j;
                    }
                    catch (Throwable throwable2) {}
                    canvas2.scale(f5, f5);
                    mode = this.a;
                    paint = this.d;
                    mode.draw(canvas2, 0.0f, 0.0f, paint);
                    mode = this.r;
                    if (mode == null) break block12;
                    mode.draw(canvas2);
                    break block14;
                }
                canvas2.restoreToCount(n3);
                int n4 = canvas.save();
                try {
                    f6 = this.l;
                    f5 = this.m;
                    canvas.translate(f6, f5);
                    f6 = this.k;
                    canvas.scale(f6, f6);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    return;
                }
                finally {
                    canvas.restoreToCount(n4);
                }
            }
            canvas2.restoreToCount(n3);
            throw throwable2;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f;
        int n3 = Intrinsics.areEqual(rect2, rect);
        if (n3 != 0) {
            return;
        }
        rect2.set(rect);
        int n4 = rect.width();
        n3 = rect.height();
        Movie movie = this.a;
        int n7 = movie.width();
        int n8 = movie.height();
        if (n7 > 0 && n8 > 0) {
            float f5;
            double d2;
            double d5;
            double d7;
            WS2 wS2 = this.c;
            double d9 = cj0_0.a(n7, n8, n4, n3, wS2);
            boolean bl2 = this.t;
            if (!bl2 && (d7 = (d5 = d9 - (d2 = 1.0)) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) > 0) {
                d9 = d2;
            }
            this.j = f5 = (float)d9;
            float f6 = (float)n7 * f5;
            n7 = (int)f6;
            float f7 = n8;
            n8 = (int)(f5 *= f7);
            Bitmap.Config config = this.b;
            config = Bitmap.createBitmap((int)n7, (int)n8, (Bitmap.Config)config);
            Bitmap bitmap = this.i;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.i = config;
            bitmap = new Canvas((Bitmap)config);
            this.h = bitmap;
            int n10 = this.t;
            if (n10 != 0) {
                this.k = 1.0f;
                boolean bl3 = false;
                float f8 = 0.0f;
                rect = null;
                this.l = 0.0f;
                this.m = 0.0f;
            } else {
                float f11;
                double d12 = cj0_0.a(n7, n8, n4, n3, wS2);
                this.k = f11 = (float)d12;
                n10 = rect.left;
                f5 = n10;
                float f12 = n4;
                f6 = (float)n7 * f11;
                f12 -= f6;
                n7 = 2;
                f6 = n7;
                this.l = f12 = f12 / f6 + f5;
                int n14 = rect.top;
                float f14 = n14;
                f12 = n3;
                float f15 = n8;
                this.m = f12 = (f12 - (f11 *= f15)) / f6 + f14;
            }
        }
    }

    public final void draw(Canvas canvas) {
        int n3;
        float f5;
        Movie movie = this.a;
        int n4 = movie.duration();
        boolean bl2 = true;
        float f6 = Float.MIN_VALUE;
        if (n4 == 0) {
            n4 = 0;
            f5 = 0.0f;
            Object var7_7 = null;
            n3 = 0;
        } else {
            long l2;
            int n7 = this.n;
            if (n7 != 0) {
                this.p = l2 = SystemClock.uptimeMillis();
            }
            l2 = this.p;
            long l3 = this.o;
            int n8 = (int)(l2 -= l3);
            n7 = n8 / n4;
            n3 = this.q;
            int n10 = -1;
            n3 = n3 != n10 && n7 > n3 ? 0 : 1;
            if (n3 != 0) {
                n7 *= n4;
                n4 = n8 - n7;
            }
        }
        movie.setTime(n4);
        int n14 = this.t;
        if (n14 != 0) {
            n14 = canvas.getWidth();
            n4 = canvas.getHeight();
            Rect rect = this.g;
            rect.set(0, 0, n14, n4);
            this.b(rect);
            n14 = canvas.save();
            f5 = (float)bl2;
            f6 = this.j;
            f5 /= f6;
            try {
                canvas.scale(f5, f5);
                this.a(canvas);
            }
            finally {
                canvas.restoreToCount(n14);
            }
        } else {
            movie = this.getBounds();
            this.b((Rect)movie);
            this.a(canvas);
        }
        boolean bl3 = this.n;
        if (bl3 && n3 != 0) {
            this.invalidateSelf();
        } else {
            this.stop();
        }
    }

    public final int getIntrinsicHeight() {
        return this.a.height();
    }

    public final int getIntrinsicWidth() {
        return this.a.width();
    }

    public final int getOpacity() {
        Ms2 ms2;
        int n3;
        Object object = this.d;
        int n4 = object.getAlpha();
        n4 = n4 == (n3 = 255) && ((object = this.s) == (ms2 = Ms2.OPAQUE) || object == (ms2 = Ms2.UNCHANGED) && (n4 = (int)((object = this.a).isOpaque() ? 1 : 0)) != 0) ? -1 : -3;
        return n4;
    }

    public final boolean isRunning() {
        return this.n;
    }

    public final void setAlpha(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = 256)) {
            this.d.setAlpha(n3);
            return;
        }
        String string2 = hj0_0.a(n3, "Invalid alpha: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public final void start() {
        long l2;
        boolean bl2 = this.n;
        if (bl2) {
            return;
        }
        this.n = bl2 = true;
        this.o = l2 = SystemClock.uptimeMillis();
        ArrayList arrayList = this.e;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Mj mj = (Mj)arrayList.get(i3);
            mj.onAnimationStart(this);
        }
        this.invalidateSelf();
    }

    public final void stop() {
        int n3 = this.n;
        if (n3 == 0) {
            return;
        }
        this.n = false;
        ArrayList arrayList = this.e;
        int n4 = arrayList.size();
        for (n3 = 0; n3 < n4; ++n3) {
            Mj mj = (Mj)arrayList.get(n3);
            mj.onAnimationEnd(this);
        }
    }
}

