/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.PathMeasure
 *  android.graphics.Shader
 */
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

public final class AA3$f {
    public static final Matrix p;
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final AA3$c g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final Jp o;

    static {
        Matrix matrix;
        p = matrix = new Matrix();
    }

    public AA3$f() {
        Object object;
        this.c = object = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = object;
        super();
        this.g = object;
        super();
        this.a = object;
        super();
        this.b = object;
    }

    public AA3$f(AA3$f object) {
        int n3;
        float f5;
        Object object2 = new Matrix();
        this.c = object2;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = object2;
        AA3$c aA3$c = ((AA3$f)object).g;
        Object object3 = new AA3$c(aA3$c, (Jp)object2);
        this.g = object3;
        aA3$c = ((AA3$f)object).a;
        super((Path)aA3$c);
        this.a = object3;
        aA3$c = ((AA3$f)object).b;
        super((Path)aA3$c);
        this.b = object3;
        this.h = f5 = ((AA3$f)object).h;
        this.i = f5 = ((AA3$f)object).i;
        this.j = f5 = ((AA3$f)object).j;
        this.k = f5 = ((AA3$f)object).k;
        this.l = n3 = ((AA3$f)object).l;
        this.m = object3 = ((AA3$f)object).m;
        object3 = ((AA3$f)object).m;
        if (object3 != null) {
            ((a53)object2).put(object3, this);
        }
        this.n = object = ((AA3$f)object).n;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a(AA3$c aA3$c, Matrix matrix, Canvas canvas, int n3, int n4) {
        AA3$f aA3$f = this;
        AA3$c aA3$c2 = aA3$c;
        Canvas canvas2 = canvas;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        Object object = aA3$c.a;
        Matrix matrix2 = matrix;
        object.set(matrix);
        Matrix matrix3 = aA3$c.a;
        object = aA3$c.j;
        matrix3.preConcat((Matrix)object);
        canvas.save();
        int n8 = 0;
        float f6 = 0.0f;
        Shader shader = null;
        int n10 = 0;
        while (true) {
            float f7;
            int n14;
            Matrix matrix4;
            block24: {
                Shader shader2;
                float f8;
                Path path;
                Path path2;
                float f11;
                boolean bl2;
                float f12;
                float f14;
                float f15;
                int n15;
                Matrix matrix5;
                float f16;
                int n16;
                float f17;
                int n17;
                block27: {
                    PathMeasure pathMeasure;
                    block28: {
                        block26: {
                            block25: {
                                float f18;
                                float f19;
                                block23: {
                                    block22: {
                                        int n18;
                                        block21: {
                                            float[] fArray;
                                            block20: {
                                                if (n10 >= (n18 = ((ArrayList)(object = aA3$c2.b)).size())) {
                                                    canvas.restore();
                                                    return;
                                                }
                                                n18 = (object = (AA3$d)((ArrayList)object).get(n10)) instanceof AA3$c;
                                                if (n18 == 0) break block20;
                                                Object object2 = object;
                                                AA3$c aA3$c3 = (AA3$c)object;
                                                object = this;
                                                Canvas canvas3 = canvas;
                                                n17 = n4;
                                                this.a(aA3$c3, matrix3, canvas, n3, n4);
                                                break block21;
                                            }
                                            n18 = object instanceof AA3$e;
                                            if (n18 == 0) break block21;
                                            object = (AA3$e)object;
                                            n18 = n3;
                                            f19 = n3;
                                            f17 = aA3$f.j;
                                            n16 = n4;
                                            float f20 = n4;
                                            f16 = aA3$f.k;
                                            f20 /= f16;
                                            f16 = Math.min(f19 /= f17, f20);
                                            matrix5 = aA3$f.c;
                                            matrix5.set(matrix3);
                                            matrix5.postScale(f19, f20);
                                            n15 = 4;
                                            f15 = 5.6E-45f;
                                            float[] fArray2 = fArray = new float[n15];
                                            float[] fArray3 = fArray;
                                            fArray2[0] = 0.0f;
                                            fArray3[1] = 1.0f;
                                            fArray2[2] = 1.0f;
                                            fArray3[3] = 0.0f;
                                            matrix3.mapVectors(fArray);
                                            f14 = fArray[0];
                                            f12 = f16;
                                            double d2 = f14;
                                            double d5 = fArray[n7];
                                            d5 = Math.hypot(d2, d5);
                                            f19 = (float)d5;
                                            d2 = fArray[2];
                                            bl2 = 3 != 0;
                                            f14 = 4.2E-45f;
                                            f17 = fArray[bl2];
                                            matrix4 = matrix3;
                                            double d7 = f17;
                                            double d9 = Math.hypot(d2, d7);
                                            f17 = (float)d9;
                                            f20 = fArray[0];
                                            f5 = fArray[1];
                                            n17 = 2;
                                            f16 = fArray[n17];
                                            f11 = fArray[bl2];
                                            f20 *= f11;
                                            f20 -= (f5 *= f16);
                                            f19 = Math.max(f19, f17);
                                            float f22 = f19 - 0.0f;
                                            n16 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                                            if (n16 <= 0) break block22;
                                            f17 = Math.abs(f20);
                                            f19 = f17 / f19;
                                            break block23;
                                        }
                                        n18 = n3;
                                        matrix4 = matrix3;
                                        break block24;
                                    }
                                    f19 = 0.0f;
                                }
                                n16 = (f18 = f19 - 0.0f) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                                if (n16 == 0) break block24;
                                object.getClass();
                                path2 = aA3$f.a;
                                path2.reset();
                                path = ((AA3$e)object).a;
                                if (path != null) {
                                    rn2.f((rn2$a[])path, path2);
                                }
                                path = aA3$f.b;
                                path.reset();
                                n17 = object instanceof aa3_1.a;
                                if (n17 == 0) break block25;
                                n14 = ((AA3$e)object).c;
                                object = n14 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                                path.setFillType((Path.FillType)object);
                                path.addPath(path2, matrix5);
                                canvas2.clipPath(path);
                                break block24;
                            }
                            object = (AA3$b)object;
                            f16 = ((AA3$b)object).j;
                            n7 = 0;
                            f5 = 0.0f;
                            pathMeasure = null;
                            float f23 = f16 - 0.0f;
                            f8 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                            if (f8 != false) break block26;
                            f5 = ((AA3$b)object).k;
                            f8 = 1065353216;
                            f11 = 1.0f;
                            float f24 = f5 - f11;
                            n7 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                            if (n7 == 0) break block27;
                            break block28;
                        }
                        f8 = 1065353216;
                        f11 = 1.0f;
                    }
                    f5 = ((AA3$b)object).l;
                    f16 = (f16 + f5) % f11;
                    f15 = (((AA3$b)object).k + f5) % f11;
                    pathMeasure = aA3$f.f;
                    if (pathMeasure == null) {
                        aA3$f.f = pathMeasure = new PathMeasure();
                    }
                    aA3$f.f.setPath(path2, false);
                    pathMeasure = aA3$f.f;
                    f5 = pathMeasure.getLength();
                    path2.reset();
                    float f25 = (f16 *= f5) - (f15 *= f5);
                    f8 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                    if (f8 > 0) {
                        matrix3 = aA3$f.f;
                        bl2 = true;
                        f14 = Float.MIN_VALUE;
                        matrix3.getSegment(f16, f5, path2, bl2);
                        shader2 = aA3$f.f;
                        n7 = 0;
                        f5 = 0.0f;
                        pathMeasure = null;
                        shader2.getSegment(0.0f, f15, path2, bl2);
                    } else {
                        n7 = 0;
                        f5 = 0.0f;
                        pathMeasure = null;
                        bl2 = true;
                        f14 = Float.MIN_VALUE;
                        matrix3 = aA3$f.f;
                        matrix3.getSegment(f16, f15, path2, bl2);
                    }
                    path2.rLineTo(0.0f, 0.0f);
                }
                path.addPath(path2, matrix5);
                O00 o00 = ((AA3$b)object).g;
                shader2 = o00.a;
                if (shader2 != null || (n17 = o00.c) != 0) {
                    n17 = 1;
                    f16 = Float.MIN_VALUE;
                } else {
                    n17 = 0;
                    f16 = 0.0f;
                    shader2 = null;
                }
                n7 = 0xFFFFFF;
                f5 = 2.3509886E-38f;
                f8 = 0.0f;
                f11 = 0.0f;
                matrix3 = null;
                n15 = 255;
                f15 = 3.57E-43f;
                bl2 = 1132396544 != 0;
                f14 = 255.0f;
                if (n17 != 0) {
                    void var19_28;
                    shader2 = aA3$f.e;
                    if (shader2 == null) {
                        n8 = 1;
                        f6 = Float.MIN_VALUE;
                        shader2 = new Paint(n8);
                        aA3$f.e = shader2;
                        shader = Paint.Style.FILL;
                        shader2.setStyle((Paint.Style)shader);
                    }
                    shader2 = aA3$f.e;
                    shader = o00.a;
                    if (shader != null) {
                        shader.setLocalMatrix(matrix5);
                        shader2.setShader(shader);
                        f17 = ((AA3$b)object).i * f14;
                        n16 = Math.round(f17);
                        shader2.setAlpha(n16);
                    } else {
                        shader2.setShader(null);
                        shader2.setAlpha(n15);
                        n16 = o00.c;
                        f6 = ((AA3$b)object).i;
                        n15 = Color.alpha((int)n16);
                        n16 &= n7;
                        f15 = (float)n15 * f6;
                        n8 = (int)f15 << 24;
                        shader2.setColor(n16 |= n8);
                    }
                    shader2.setColorFilter(null);
                    n16 = ((AA3$e)object).c;
                    if (n16 == 0) {
                        Path.FillType fillType = Path.FillType.WINDING;
                    } else {
                        Path.FillType fillType = Path.FillType.EVEN_ODD;
                    }
                    path.setFillType((Path.FillType)var19_28);
                    canvas2.drawPath(path, (Paint)shader2);
                }
                O00 o002 = ((AA3$b)object).e;
                shader2 = o002.a;
                if (shader2 != null || (n17 = o002.c) != 0) {
                    shader2 = aA3$f.d;
                    if (shader2 == null) {
                        n8 = 1;
                        f6 = Float.MIN_VALUE;
                        shader2 = new Paint(n8);
                        aA3$f.d = shader2;
                        shader = Paint.Style.STROKE;
                        shader2.setStyle((Paint.Style)shader);
                    }
                    shader2 = aA3$f.d;
                    shader = ((AA3$b)object).n;
                    if (shader != null) {
                        shader2.setStrokeJoin((Paint.Join)shader);
                    }
                    if ((shader = ((AA3$b)object).m) != null) {
                        shader2.setStrokeCap((Paint.Cap)shader);
                    }
                    f6 = ((AA3$b)object).o;
                    shader2.setStrokeMiter(f6);
                    shader = o002.a;
                    if (shader != null) {
                        shader.setLocalMatrix(matrix5);
                        shader2.setShader(shader);
                        f17 = ((AA3$b)object).h * f14;
                        n16 = Math.round(f17);
                        shader2.setAlpha(n16);
                    } else {
                        shader2.setShader(null);
                        n8 = 255;
                        shader2.setAlpha(n8);
                        n16 = o002.c;
                        f6 = ((AA3$b)object).h;
                        matrix5 = aa3_1.j;
                        int n19 = Color.alpha((int)n16);
                        n16 &= n7;
                        f5 = (float)n19 * f6;
                        n7 = (int)f5 << 24;
                        shader2.setColor(n16 |= n7);
                    }
                    shader2.setColorFilter(null);
                    f7 = ((AA3$b)object).f * (f19 *= f12);
                    shader2.setStrokeWidth(f7);
                    canvas2.drawPath(path, (Paint)shader2);
                }
            }
            n14 = 1;
            f7 = Float.MIN_VALUE;
            n10 += n14;
            matrix3 = matrix4;
            n7 = 1;
            f5 = Float.MIN_VALUE;
            n8 = 0;
            f6 = 0.0f;
            shader = null;
        }
    }

    public float getAlpha() {
        return (float)this.getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f5) {
        int n3 = (int)(f5 * 255.0f);
        this.setRootAlpha(n3);
    }

    public void setRootAlpha(int n3) {
        this.l = n3;
    }
}

