/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 */
import android.graphics.Paint;

public final class AA3$b
extends AA3$e {
    public O00 e;
    public float f = 0.0f;
    public O00 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public Paint.Cap m;
    public Paint.Join n;
    public float o;

    public AA3$b() {
        Paint.Cap cap;
        float f5;
        this.h = f5 = 1.0f;
        this.i = f5;
        this.j = 0.0f;
        this.k = f5;
        this.l = 0.0f;
        this.m = cap = Paint.Cap.BUTT;
        cap = Paint.Join.MITER;
        this.n = cap;
        this.o = 4.0f;
    }

    public final boolean a() {
        O00 o00 = this.g;
        boolean bl2 = o00.b();
        if (!bl2 && !(bl2 = (o00 = this.e).b())) {
            bl2 = false;
            o00 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean b(int[] var1_1) {
        var2_2 = this.g;
        var3_3 = var2_2.b();
        var4_4 = false;
        if (var3_3 == 0) ** GOTO lbl-1000
        var5_5 = var2_2.b;
        var6_6 = var5_5.getDefaultColor();
        var3_3 = var5_5.getColorForState(var1_1, var6_6);
        if (var3_3 != (var6_6 = var2_2.c)) {
            var2_2.c = var3_3;
            var7_7 = true;
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = false;
            var2_2 = null;
        }
        var5_5 = this.e;
        var6_6 = (int)var5_5.b();
        if (var6_6 != 0 && (var10_10 = (var8_8 = var5_5.b).getColorForState(var1_1, var9_9 = var8_8.getDefaultColor())) != (var6_6 = var5_5.c)) {
            var5_5.c = var10_10;
            var4_4 = true;
        }
        return var7_7 | var4_4;
    }

    public float getFillAlpha() {
        return this.i;
    }

    public int getFillColor() {
        return this.g.c;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public int getStrokeColor() {
        return this.e.c;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getTrimPathEnd() {
        return this.k;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public float getTrimPathStart() {
        return this.j;
    }

    public void setFillAlpha(float f5) {
        this.i = f5;
    }

    public void setFillColor(int n3) {
        this.g.c = n3;
    }

    public void setStrokeAlpha(float f5) {
        this.h = f5;
    }

    public void setStrokeColor(int n3) {
        this.e.c = n3;
    }

    public void setStrokeWidth(float f5) {
        this.f = f5;
    }

    public void setTrimPathEnd(float f5) {
        this.k = f5;
    }

    public void setTrimPathOffset(float f5) {
        this.l = f5;
    }

    public void setTrimPathStart(float f5) {
        this.j = f5;
    }
}

