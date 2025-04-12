/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.PathEffect
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Shader
 *  android.graphics.Xfermode
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.os.Build;

public final class ei
implements fm2 {
    public final Paint a;
    public int b;
    public Shader c;
    public TX d;
    public li e;

    public ei(Paint paint) {
        this.a = paint;
        this.b = 3;
    }

    public final long a() {
        return zx_0.c(this.a.getColor());
    }

    public final void b(float f5) {
        int n3 = (int)Math.rint(f5 * 255.0f);
        this.a.setAlpha(n3);
    }

    public final void c(int n3) {
        Paint.Cap cap;
        boolean bl2 = Se3.a(n3, 2);
        if (bl2) {
            cap = Paint.Cap.SQUARE;
        } else {
            bl2 = Se3.a(n3, 1);
            if (bl2) {
                cap = Paint.Cap.ROUND;
            } else {
                bl2 = false;
                cap = (n3 = (int)(Se3.a(n3, 0) ? 1 : 0)) != 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        this.a.setStrokeCap(cap);
    }

    public final void d(int n3) {
        int n4 = zy_0.a(this.b, n3);
        if (n4 == 0) {
            this.b = n3;
            n4 = Build.VERSION.SDK_INT;
            int n7 = 29;
            Paint paint = this.a;
            if (n4 >= n7) {
                mj3_0 mj3_02 = mj3_0.a;
                mj3_02.a(paint, n3);
            } else {
                PorterDuff.Mode mode = Lf.b(n3);
                PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
                paint.setXfermode((Xfermode)porterDuffXfermode);
            }
        }
    }

    public final void e(int n3) {
        int n4 = (int)(Ue3.b(n3, 0) ? 1 : 0);
        Paint.Join join = n4 != 0 ? Paint.Join.MITER : ((n4 = Ue3.b(n3, 2)) != 0 ? Paint.Join.BEVEL : ((n3 = (int)(Ue3.b(n3, n4 = 1) ? 1 : 0)) != 0 ? Paint.Join.ROUND : Paint.Join.MITER));
        this.a.setStrokeJoin(join);
    }

    public final void f(long l2) {
        int n3 = zx_0.i(l2);
        this.a.setColor(n3);
    }

    public final void g(li li2) {
        PathEffect pathEffect = li2 != null ? li2.a : null;
        this.a.setPathEffect(pathEffect);
        this.e = li2;
    }

    public final float getAlpha() {
        return (float)this.a.getAlpha() / 255.0f;
    }

    public final Paint h() {
        return this.a;
    }

    public final void i(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final Shader j() {
        return this.c;
    }

    public final void k(float f5) {
        this.a.setStrokeMiter(f5);
    }

    public final void l(TX tX) {
        this.d = tX;
        tX = tX != null ? tX.a : null;
        this.a.setColorFilter((ColorFilter)tX);
    }

    public final void m(int n3) {
        int n4 = 1;
        Paint.Style style2 = n3 == n4 ? Paint.Style.STROKE : Paint.Style.FILL;
        this.a.setStyle(style2);
    }

    public final void n(float f5) {
        this.a.setStrokeWidth(f5);
    }

    public final int o() {
        int[] nArray;
        int n3;
        Paint.Cap cap = this.a.getStrokeCap();
        if (cap == null) {
            n3 = -1;
        } else {
            nArray = fi$a.$EnumSwitchMapping$1;
            n3 = cap.ordinal();
            n3 = nArray[n3];
        }
        int n4 = 0;
        nArray = null;
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                n7 = 3;
                if (n3 == n7) {
                    n4 = 2;
                }
            } else {
                n4 = 1;
            }
        }
        return n4;
    }

    public final int p() {
        int[] nArray;
        int n3;
        Paint.Join join = this.a.getStrokeJoin();
        if (join == null) {
            n3 = -1;
        } else {
            nArray = fi$a.$EnumSwitchMapping$2;
            n3 = join.ordinal();
            n3 = nArray[n3];
        }
        int n4 = 0;
        nArray = null;
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                n8 = 3;
                if (n3 == n8) {
                    n4 = 1;
                }
            } else {
                n4 = 2;
            }
        }
        return n4;
    }

    public final void q(int n3) {
        n3 = BM0.a(n3, 0) ^ 1;
        this.a.setFilterBitmap(n3 != 0);
    }
}

