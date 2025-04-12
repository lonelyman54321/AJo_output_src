/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Path$FillType
 *  android.graphics.Path$Op
 *  android.graphics.RectF
 */
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class ki
implements gn2 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public ki() {
        this(0);
    }

    public /* synthetic */ ki(int n3) {
        Path path = new Path();
        this(path);
    }

    public ki(Path path) {
        this.a = path;
    }

    public final void a(float f5, float f6) {
        this.a.moveTo(f5, f6);
    }

    public final aG2 b() {
        RectF rectF = this.b;
        if (rectF == null) {
            this.b = rectF = new RectF();
        }
        rectF = this.b;
        Intrinsics.checkNotNull(rectF);
        this.a.computeBounds(rectF, true);
        float f5 = rectF.left;
        float f6 = rectF.top;
        float f7 = rectF.right;
        float f8 = rectF.bottom;
        aG2 aG22 = new aG2(f5, f6, f7, f8);
        return aG22;
    }

    public final void c(float f5, float f6, float f7, float f8, float f11, float f12) {
        this.a.cubicTo(f5, f6, f7, f8, f11, f12);
    }

    public final void close() {
        this.a.close();
    }

    public final void d(float f5, float f6) {
        this.a.lineTo(f5, f6);
    }

    public final boolean e() {
        return this.a.isConvex();
    }

    public final void f(float f5, float f6) {
        this.a.rMoveTo(f5, f6);
    }

    public final void g(float f5, float f6, float f7, float f8, float f11, float f12) {
        this.a.rCubicTo(f5, f6, f7, f8, f11, f12);
    }

    public final void h(gn2 object, long l2) {
        boolean bl2 = object instanceof ki;
        if (bl2) {
            object = (ki)object;
            float f5 = e72.d(l2);
            float f6 = e72.e(l2);
            Path path = this.a;
            object = ((ki)object).a;
            path.addPath((Path)object, f5, f6);
            return;
        }
        object = new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        throw object;
    }

    public final void i(int n3) {
        int n4 = 1;
        Path.FillType fillType = n3 == n4 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
        this.a.setFillType(fillType);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final void j(float f5, float f6, float f7, float f8) {
        this.a.quadTo(f5, f6, f7, f8);
    }

    public final void k(long l2) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = matrix = new Matrix();
        } else {
            Intrinsics.checkNotNull(matrix);
            matrix.reset();
        }
        matrix = this.d;
        Intrinsics.checkNotNull(matrix);
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        matrix.setTranslate(f5, f6);
        Matrix matrix2 = this.d;
        Intrinsics.checkNotNull(matrix2);
        this.a.transform(matrix2);
    }

    public final void l(float f5, float f6, float f7, float f8) {
        this.a.rQuadTo(f5, f6, f7, f8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void m(aG2 object, gn2$a gn2$a) {
        float f5;
        boolean bl2;
        float f6;
        boolean bl3;
        boolean bl4;
        float f7 = ((aG2)object).a;
        int n3 = Float.isNaN(f7);
        if (!(n3 != 0 || (bl4 = Float.isNaN(f7 = ((aG2)object).b)) || (bl3 = Float.isNaN(f6 = ((aG2)object).c)) || (bl2 = Float.isNaN(f5 = ((aG2)object).d)))) {
            RectF rectF = this.b;
            if (rectF == null) {
                this.b = rectF = new RectF();
            }
            rectF = this.b;
            Intrinsics.checkNotNull(rectF);
            float f8 = ((aG2)object).a;
            rectF.set(f8, f7, f6, f5);
            object = this.b;
            Intrinsics.checkNotNull(object);
            int[] nArray = ni$a.$EnumSwitchMapping$0;
            int n4 = gn2$a.ordinal();
            n4 = nArray[n4];
            n3 = 1;
            f7 = Float.MIN_VALUE;
            if (n4 != n3) {
                n3 = 2;
                f7 = 2.8E-45f;
                if (n4 != n3) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                gn2$a = Path.Direction.CW;
            } else {
                gn2$a = Path.Direction.CCW;
            }
            this.a.addRect((RectF)object, (Path.Direction)gn2$a);
            return;
        }
        object = new IllegalStateException("Invalid rectangle, make sure no value is NaN");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n(NP2 object, gn2$a gn2$a) {
        float f5;
        RectF rectF = this.b;
        if (rectF == null) {
            RectF rectF2;
            this.b = rectF2 = new RectF();
        }
        RectF rectF3 = this.b;
        Intrinsics.checkNotNull(rectF3);
        float f6 = ((NP2)object).a;
        float f7 = ((NP2)object).c;
        float f8 = ((NP2)object).d;
        float f11 = ((NP2)object).b;
        rectF3.set(f6, f11, f7, f8);
        float[] fArray = this.c;
        if (fArray == null) {
            int n3 = 8;
            float[] fArray2 = new float[n3];
            this.c = fArray2;
        }
        float[] fArray3 = this.c;
        Intrinsics.checkNotNull(fArray3);
        long l2 = ((NP2)object).e;
        f8 = r90_0.b(l2);
        f11 = 0.0f;
        fArray3[0] = f8;
        f6 = r90_0.c(l2);
        int n4 = 1;
        f7 = Float.MIN_VALUE;
        fArray3[n4] = f6;
        long l3 = ((NP2)object).f;
        f6 = r90_0.b(l3);
        int n7 = 2;
        fArray3[n7] = f6;
        fArray3[3] = f6 = r90_0.c(l3);
        l3 = ((NP2)object).g;
        f6 = r90_0.b(l3);
        int n8 = 4;
        fArray3[n8] = f6;
        f6 = r90_0.c(l3);
        int n10 = 5;
        f8 = 7.0E-45f;
        fArray3[n10] = f6;
        l3 = ((NP2)object).h;
        fArray3[6] = f5 = r90_0.b(l3);
        f5 = r90_0.c(l3);
        int n14 = 7;
        f6 = 9.8E-45f;
        fArray3[n14] = f5;
        object = this.b;
        Intrinsics.checkNotNull(object);
        float[] fArray4 = this.c;
        Intrinsics.checkNotNull(fArray4);
        int[] nArray = ni$a.$EnumSwitchMapping$0;
        int n15 = gn2$a.ordinal();
        n15 = nArray[n15];
        if (n15 != n4) {
            if (n15 != n7) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            gn2$a = Path.Direction.CW;
        } else {
            gn2$a = Path.Direction.CCW;
        }
        this.a.addRoundRect((RectF)object, fArray4, (Path.Direction)gn2$a);
    }

    public final int o() {
        int n3;
        Path.FillType fillType;
        Path.FillType fillType2 = this.a.getFillType();
        if (fillType2 == (fillType = Path.FillType.EVEN_ODD)) {
            n3 = 1;
        } else {
            n3 = 0;
            fillType2 = null;
        }
        return n3;
    }

    public final boolean p(gn2 object, gn2 gn22, int n3) {
        int n4;
        Path.Op op2 = n3 == 0 ? Path.Op.DIFFERENCE : (n3 == (n4 = 1) ? Path.Op.INTERSECT : (n3 == (n4 = 4) ? Path.Op.REVERSE_DIFFERENCE : (n3 == (n4 = 2) ? Path.Op.UNION : Path.Op.XOR)));
        n4 = object instanceof ki;
        String string2 = "Unable to obtain android.graphics.Path";
        if (n4 != 0) {
            object = ((ki)object).a;
            n4 = gn22 instanceof ki;
            if (n4 != 0) {
                gn22 = ((ki)gn22).a;
                return this.a.op((Path)object, (Path)gn22, op2);
            }
            object = new UnsupportedOperationException(string2);
            throw object;
        }
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    public final void q(float f5, float f6) {
        this.a.rLineTo(f5, f6);
    }

    public final void reset() {
        this.a.reset();
    }

    public final void rewind() {
        this.a.rewind();
    }
}

