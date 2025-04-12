/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 */
import android.graphics.Canvas;
import android.graphics.Paint;

public class sR2$f
extends sR2$j {
    public float a;
    public float b;
    public final /* synthetic */ sR2 c;

    public sR2$f(sR2 sR22, float f5, float f6) {
        this.c = sR22;
        this.a = f5;
        this.b = f6;
    }

    public void b(String string2) {
        float f5;
        sR2 sR22 = this.c;
        boolean bl2 = sR22.U();
        if (bl2) {
            float f6;
            float f7;
            Canvas canvas;
            sR2$h sR2$h = sR22.d;
            boolean bl3 = sR2$h.b;
            if (bl3) {
                canvas = sR22.a;
                f7 = this.a;
                f6 = this.b;
                sR2$h = sR2$h.d;
                canvas.drawText(string2, f7, f6, (Paint)sR2$h);
            }
            sR2$h = sR22.d;
            bl3 = sR2$h.c;
            if (bl3) {
                canvas = sR22.a;
                f7 = this.a;
                f6 = this.b;
                sR2$h = sR2$h.e;
                canvas.drawText(string2, f7, f6, (Paint)sR2$h);
            }
        }
        float f8 = this.a;
        this.a = f5 = sR22.d.d.measureText(string2) + f8;
    }
}

