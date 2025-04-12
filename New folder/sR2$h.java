/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Typeface
 */
import android.graphics.Paint;
import android.graphics.Typeface;

public final class sR2$h {
    public final rR2$E a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public rR2$b f;
    public rR2$b g;
    public boolean h;

    public sR2$h() {
        Object object;
        this.d = object = new Paint();
        int n3 = 193;
        object.setFlags(n3);
        object.setHinting(0);
        Paint.Style style2 = Paint.Style.FILL;
        object.setStyle(style2);
        style2 = Typeface.DEFAULT;
        object.setTypeface((Typeface)style2);
        this.e = object = new Paint();
        object.setFlags(n3);
        object.setHinting(0);
        Paint.Style style3 = Paint.Style.STROKE;
        object.setStyle(style3);
        object.setTypeface((Typeface)style2);
        object = rR2$E.b();
        this.a = object;
    }

    public sR2$h(sR2$h object) {
        Object object2;
        boolean bl2;
        this.b = bl2 = ((sR2$h)object).b;
        this.c = bl2 = ((sR2$h)object).c;
        Object object3 = ((sR2$h)object).d;
        this.d = object2 = new Paint(object3);
        object3 = ((sR2$h)object).e;
        this.e = object2 = new Paint(object3);
        object2 = ((sR2$h)object).f;
        if (object2 != null) {
            super((rR2$b)object2);
            this.f = object3;
        }
        if ((object2 = ((sR2$h)object).g) != null) {
            super((rR2$b)object2);
            this.g = object3;
        }
        this.h = bl2 = ((sR2$h)object).h;
        object = ((sR2$h)object).a;
        object = ((rR2$E)object).clone();
        object = (rR2$E)object;
        try {
            this.a = object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            this.a = object = rR2$E.b();
        }
    }
}

