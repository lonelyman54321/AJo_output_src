/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Path
 */
import android.graphics.Paint;
import android.graphics.Path;

public final class sR2$g
extends sR2$j {
    public float a;
    public final float b;
    public final Path c;
    public final /* synthetic */ sR2 d;

    public sR2$g(sR2 sR22, float f5, float f6, Path path) {
        this.d = sR22;
        this.a = f5;
        this.b = f6;
        this.c = path;
    }

    public final boolean a(rR2$Y rR2$Y) {
        boolean bl2 = rR2$Y instanceof rR2$Z;
        return !bl2;
    }

    public final void b(String string2) {
        float f5;
        sR2 sR22 = this.d;
        boolean bl2 = sR22.U();
        if (bl2) {
            Path path = new Path();
            Paint paint = sR22.d.d;
            int n3 = string2.length();
            float f6 = this.a;
            float f7 = this.b;
            paint.getTextPath(string2, 0, n3, f6, f7, path);
            paint = this.c;
            paint.addPath(path);
        }
        float f8 = this.a;
        this.a = f5 = sR22.d.d.measureText(string2) + f8;
    }
}

