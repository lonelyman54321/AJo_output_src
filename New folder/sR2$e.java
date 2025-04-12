/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Path
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public final class sR2$e
extends sR2$f {
    public final Path d;
    public final /* synthetic */ sR2 e;

    public sR2$e(sR2 sR22, Path path, float f5) {
        this.e = sR22;
        super(sR22, f5, 0.0f);
        this.d = path;
    }

    public final void b(String string2) {
        float f5;
        sR2 sR22 = this.e;
        boolean bl2 = sR22.U();
        if (bl2) {
            Path path;
            Paint paint;
            float f6;
            float f7;
            Canvas canvas;
            sR2$h sR2$h = sR22.d;
            boolean bl3 = sR2$h.b;
            if (bl3) {
                canvas = sR22.a;
                f7 = this.a;
                f6 = this.b;
                paint = sR2$h.d;
                path = this.d;
                canvas.drawTextOnPath(string2, path, f7, f6, paint);
            }
            sR2$h = sR22.d;
            bl3 = sR2$h.c;
            if (bl3) {
                canvas = sR22.a;
                f7 = this.a;
                f6 = this.b;
                paint = sR2$h.e;
                path = this.d;
                canvas.drawTextOnPath(string2, path, f7, f6, paint);
            }
        }
        float f8 = this.a;
        this.a = f5 = sR22.d.d.measureText(string2) + f8;
    }
}

