/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 */
import android.graphics.Path;

public final class sR2$d
implements rr2$x_0 {
    public final Path a;
    public float b;
    public float c;

    public sR2$d(rR2$w rR2$w) {
        Path path;
        this.a = path = new Path();
        if (rR2$w == null) {
            return;
        }
        rR2$w.h(this);
    }

    public final void a(float f5, float f6) {
        this.a.moveTo(f5, f6);
        this.b = f5;
        this.c = f6;
    }

    public final void b(float f5, float f6, float f7, float f8) {
        this.a.quadTo(f5, f6, f7, f8);
        this.b = f7;
        this.c = f8;
    }

    public final void c(float f5, float f6, float f7, float f8, float f11, float f12) {
        this.a.cubicTo(f5, f6, f7, f8, f11, f12);
        this.b = f11;
        this.c = f12;
    }

    public final void close() {
        this.a.close();
    }

    public final void d(float f5, float f6) {
        this.a.lineTo(f5, f6);
        this.b = f5;
        this.c = f6;
    }

    public final void e(float f5, float f6, float f7, boolean bl2, boolean bl3, float f8, float f11) {
        float f12 = this.b;
        float f14 = this.c;
        sR2.a(f12, f14, f5, f6, f7, bl2, bl3, f8, f11, this);
        f12 = f8;
        this.b = f8;
        f12 = f11;
        this.c = f11;
    }
}

