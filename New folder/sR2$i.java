/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 */
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public final class sR2$i
extends sR2$j {
    public float a;
    public final float b;
    public final RectF c;
    public final /* synthetic */ sR2 d;

    public sR2$i(sR2 sR22, float f5, float f6) {
        this.d = sR22;
        this.c = sR22;
        this.a = f5;
        this.b = f6;
    }

    public final boolean a(rR2$Y object) {
        boolean bl2 = object instanceof rR2$Z;
        boolean bl3 = true;
        if (bl2) {
            Object object2 = object;
            object2 = (rR2$Z)object;
            object = ((rR2$N)object).a;
            object2 = ((rR2$Z)object2).o;
            object = ((rR2)object).d((String)object2);
            bl2 = false;
            object2 = null;
            if (object == null) {
                return false;
            }
            object = (rR2$v)object;
            rR2$w rR2$w = ((rR2$v)object).o;
            sR2$d sR2$d = new sR2$d(rR2$w);
            sR2$d = sR2$d.a;
            object = ((rr2$l_0)object).n;
            if (object != null) {
                sR2$d.transform((Matrix)object);
            }
            object = new RectF();
            sR2$d.computeBounds((RectF)object, bl3);
            this.c.union((RectF)object);
            return false;
        }
        return bl3;
    }

    public final void b(String string2) {
        float f5;
        float f6;
        sR2 sR22 = this.d;
        boolean bl2 = sR22.U();
        if (bl2) {
            Rect rect = new Rect();
            Paint paint = sR22.d.d;
            int n3 = string2.length();
            paint.getTextBounds(string2, 0, n3, rect);
            paint = new RectF(rect);
            f6 = this.a;
            float f7 = this.b;
            paint.offset(f6, f7);
            rect = this.c;
            rect.union((RectF)paint);
        }
        f6 = this.a;
        this.a = f5 = sR22.d.d.measureText(string2) + f6;
    }
}

