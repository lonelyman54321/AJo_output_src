/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
import android.graphics.Matrix;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class rp1 {
    public final Function2 a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f;
    public boolean g;
    public boolean h;

    public rp1(Function2 function2) {
        boolean bl2;
        this.a = function2;
        this.f = bl2 = true;
        this.g = bl2;
        this.h = bl2;
    }

    public final float[] a(Object object) {
        boolean bl2;
        boolean bl3;
        float[] fArray = this.e;
        if (fArray == null) {
            this.e = fArray = QK1.a();
        }
        if (bl3 = this.g) {
            this.h = bl2 = lk1_0.a(this.b(object), fArray);
            bl2 = false;
            object = null;
            this.g = false;
        }
        if (!(bl2 = this.h)) {
            fArray = null;
        }
        return fArray;
    }

    public final float[] b(Object object) {
        boolean bl2;
        boolean bl3;
        float[] fArray = this.d;
        if (fArray == null) {
            this.d = fArray = QK1.a();
        }
        if (!(bl3 = this.f)) {
            return fArray;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            this.b = matrix = new Matrix();
        }
        Function2 function2 = this.a;
        function2.invoke(object, matrix);
        object = this.c;
        if (object == null || !(bl2 = Intrinsics.areEqual(matrix, object))) {
            wu1_2.c(matrix, fArray);
            this.b = object;
            this.c = matrix;
        }
        this.f = false;
        return fArray;
    }

    public final void c() {
        boolean bl2;
        this.f = bl2 = true;
        this.g = bl2;
    }
}

