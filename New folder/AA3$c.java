/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 */
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

public final class AA3$c
extends AA3$d {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public AA3$c() {
        float f5;
        Object object;
        this.a = object = new Matrix();
        this.b = object;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = f5 = 1.0f;
        this.g = f5;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = object = new Matrix();
        this.l = null;
    }

    public AA3$c(AA3$c object, Jp jp) {
        int n3;
        float f5;
        Matrix matrix;
        float f6;
        Object object2;
        this.a = object2 = new Matrix();
        this.b = object2;
        object2 = null;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = f6 = 1.0f;
        this.g = f6;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = matrix = new Matrix();
        int n4 = 0;
        this.l = null;
        this.c = f5 = ((AA3$c)object).c;
        this.d = f5 = ((AA3$c)object).d;
        this.e = f5 = ((AA3$c)object).e;
        this.f = f5 = ((AA3$c)object).f;
        this.g = f5 = ((AA3$c)object).g;
        this.h = f5 = ((AA3$c)object).h;
        this.i = f5 = ((AA3$c)object).i;
        Object object3 = ((AA3$c)object).l;
        this.l = object3;
        this.k = n3 = ((AA3$c)object).k;
        if (object3 != null) {
            jp.put(object3, this);
        }
        object3 = ((AA3$c)object).j;
        matrix.set((Matrix)object3);
        object = ((AA3$c)object).b;
        matrix = null;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)object).size()); ++i3) {
            block8: {
                Object object4;
                block7: {
                    block6: {
                        int n7;
                        float f7;
                        Object object5;
                        object3 = ((ArrayList)object).get(i3);
                        n3 = object3 instanceof AA3$c;
                        if (n3 != 0) {
                            object3 = (AA3$c)object3;
                            object4 = this.b;
                            object5 = new AA3$c((AA3$c)object3, jp);
                            ((ArrayList)object4).add(object5);
                            continue;
                        }
                        n3 = object3 instanceof AA3$b;
                        if (n3 == 0) break block6;
                        object3 = (AA3$b)object3;
                        object4 = new AA3$e((AA3$e)object3);
                        ((AA3$b)object4).f = 0.0f;
                        ((AA3$b)object4).h = f6;
                        ((AA3$b)object4).i = f6;
                        ((AA3$b)object4).j = 0.0f;
                        ((AA3$b)object4).k = f6;
                        ((AA3$b)object4).l = 0.0f;
                        object5 = Paint.Cap.BUTT;
                        ((AA3$b)object4).m = object5;
                        object5 = Paint.Join.MITER;
                        ((AA3$b)object4).n = object5;
                        ((AA3$b)object4).o = 4.0f;
                        ((AA3$b)object4).e = object5 = ((AA3$b)object3).e;
                        ((AA3$b)object4).f = f7 = ((AA3$b)object3).f;
                        ((AA3$b)object4).h = f7 = ((AA3$b)object3).h;
                        ((AA3$b)object4).g = object5 = ((AA3$b)object3).g;
                        ((AA3$e)object4).c = n7 = ((AA3$e)object3).c;
                        ((AA3$b)object4).i = f7 = ((AA3$b)object3).i;
                        ((AA3$b)object4).j = f7 = ((AA3$b)object3).j;
                        ((AA3$b)object4).k = f7 = ((AA3$b)object3).k;
                        ((AA3$b)object4).l = f7 = ((AA3$b)object3).l;
                        object5 = ((AA3$b)object3).m;
                        ((AA3$b)object4).m = object5;
                        object5 = ((AA3$b)object3).n;
                        ((AA3$b)object4).n = object5;
                        ((AA3$b)object4).o = f5 = ((AA3$b)object3).o;
                        break block7;
                    }
                    n3 = object3 instanceof AA3$a;
                    if (n3 == 0) break block8;
                    object3 = (AA3$a)object3;
                    object4 = new AA3$e((AA3$e)object3);
                }
                this.b.add(object4);
                object3 = ((AA3$e)object4).b;
                if (object3 == null) continue;
                jp.put(object3, object4);
                continue;
            }
            object = new IllegalStateException("Unknown object in the tree!");
            throw object;
        }
    }

    public final boolean a() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.b)).size()); ++i3) {
            boolean bl2 = ((AA3$d)(object = (AA3$d)((ArrayList)object).get(i3))).a();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final boolean b(int[] nArray) {
        Object object;
        int n3;
        boolean bl2 = false;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.b)).size()); ++i3) {
            object = (AA3$d)((ArrayList)object).get(i3);
            boolean bl3 = ((AA3$d)object).b(nArray);
            bl2 |= bl3;
        }
        return bl2;
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        float f5 = -this.d;
        float f6 = -this.e;
        matrix.postTranslate(f5, f6);
        f5 = this.f;
        f6 = this.g;
        matrix.postScale(f5, f6);
        f5 = this.c;
        matrix.postRotate(f5, 0.0f, 0.0f);
        f5 = this.h;
        f6 = this.d;
        f5 += f6;
        f6 = this.i;
        float f7 = this.e;
        matrix.postTranslate(f5, f6 += f7);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f5) {
        float f6 = this.d;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.d = f5;
            this.c();
        }
    }

    public void setPivotY(float f5) {
        float f6 = this.e;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.e = f5;
            this.c();
        }
    }

    public void setRotation(float f5) {
        float f6 = this.c;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.c = f5;
            this.c();
        }
    }

    public void setScaleX(float f5) {
        float f6 = this.f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.f = f5;
            this.c();
        }
    }

    public void setScaleY(float f5) {
        float f6 = this.g;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.g = f5;
            this.c();
        }
    }

    public void setTranslateX(float f5) {
        float f6 = this.h;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.h = f5;
            this.c();
        }
    }

    public void setTranslateY(float f5) {
        float f6 = this.i;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.i = f5;
            this.c();
        }
    }
}

