/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.RectF
 */
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public final class QU$a {
    public final RectF a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int[] i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public Path o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;

    public QU$a() {
        Paint paint;
        Paint paint2;
        RectF rectF;
        this.a = rectF = new RectF();
        this.b = rectF;
        this.c = paint2 = new Paint();
        this.d = paint = new Paint();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = 255;
        Paint.Cap cap = Paint.Cap.SQUARE;
        rectF.setStrokeCap(cap);
        boolean bl2 = true;
        rectF.setAntiAlias(bl2);
        Paint.Style style2 = Paint.Style.STROKE;
        rectF.setStyle(style2);
        rectF = Paint.Style.FILL;
        paint2.setStyle((Paint.Style)rectF);
        paint2.setAntiAlias(bl2);
        paint.setColor(0);
    }

    public final void a(int n3) {
        this.j = n3;
        this.u = n3 = this.i[n3];
    }
}

