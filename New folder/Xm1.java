/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.PointF
 */
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

public final class Xm1 {
    public static final Gm1$a a = Gm1$a.a("x", "y");

    public static int a(gm1_0 gm1_02) {
        boolean bl2;
        gm1_02.a();
        double d2 = gm1_02.p();
        double d5 = 255.0;
        int n3 = (int)(d2 *= d5);
        int n4 = (int)(gm1_02.p() * d5);
        double d7 = gm1_02.p() * d5;
        int n7 = (int)d7;
        while (bl2 = gm1_02.k()) {
            gm1_02.H();
        }
        gm1_02.c();
        return Color.argb((int)255, (int)n3, (int)n4, (int)n7);
    }

    public static PointF b(gm1_0 object, float f5) {
        boolean bl2;
        Object object2 = xm1$a_0.a;
        Gm1$b gm1$b = ((gm1_0)object).z();
        int n3 = gm1$b.ordinal();
        int n4 = object2[n3];
        n3 = 1;
        float f6 = Float.MIN_VALUE;
        if (n4 != n3) {
            Gm1$b gm1$b2;
            Gm1$b gm1$b3;
            int n7 = 2;
            float f7 = 2.8E-45f;
            if (n4 != n7) {
                n7 = 3;
                f7 = 4.2E-45f;
                if (n4 == n7) {
                    int n8;
                    ((gm1_0)object).b();
                    n4 = 0;
                    float f8 = 0.0f;
                    object2 = null;
                    n7 = 0;
                    f7 = 0.0f;
                    Object var10_13 = null;
                    while ((n8 = ((gm1_0)object).k()) != 0) {
                        Gm1$a gm1$a = a;
                        n8 = ((gm1_0)object).C(gm1$a);
                        if (n8 != 0) {
                            if (n8 != n3) {
                                ((gm1_0)object).G();
                                ((gm1_0)object).H();
                                continue;
                            }
                            f7 = Xm1.d((gm1_0)object);
                            continue;
                        }
                        f8 = Xm1.d((gm1_0)object);
                    }
                    ((gm1_0)object).d();
                    object = new PointF(f8 *= f5, f7 *= f5);
                    return object;
                }
                object2 = new StringBuilder;
                ((StringBuilder)object2)("Unknown point starts with ");
                object = ((gm1_0)object).z();
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            ((gm1_0)object).a();
            double d2 = ((gm1_0)object).p();
            float f11 = (float)d2;
            double d5 = ((gm1_0)object).p();
            f6 = (float)d5;
            while ((gm1$b3 = ((gm1_0)object).z()) != (gm1$b2 = Gm1$b.END_ARRAY)) {
                ((gm1_0)object).H();
            }
            ((gm1_0)object).c();
            object = new PointF(f11 *= f5, f6 *= f5);
            return object;
        }
        double d7 = ((gm1_0)object).p();
        float f12 = (float)d7;
        double d9 = ((gm1_0)object).p();
        f6 = (float)d9;
        while (bl2 = ((gm1_0)object).k()) {
            ((gm1_0)object).H();
        }
        object = new PointF(f12 *= f5, f6 *= f5);
        return object;
    }

    public static ArrayList c(gm1_0 gm1_02, float f5) {
        Gm1$b gm1$b;
        Gm1$b gm1$b2;
        ArrayList<Gm1$b> arrayList = new ArrayList<Gm1$b>();
        gm1_02.a();
        while ((gm1$b2 = gm1_02.z()) == (gm1$b = Gm1$b.BEGIN_ARRAY)) {
            gm1_02.a();
            gm1$b2 = Xm1.b(gm1_02, f5);
            arrayList.add(gm1$b2);
            gm1_02.c();
        }
        gm1_02.c();
        return arrayList;
    }

    public static float d(gm1_0 object) {
        Object object2 = ((gm1_0)object).z();
        Object object3 = xm1$a_0.a;
        int n3 = object2.ordinal();
        int n4 = object3[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 == n3) {
                ((gm1_0)object).a();
                double d2 = ((gm1_0)object).p();
                float f5 = (float)d2;
                while ((n4 = (int)(((gm1_0)object).k() ? 1 : 0)) != 0) {
                    ((gm1_0)object).H();
                }
                ((gm1_0)object).c();
                return f5;
            }
            object3 = new StringBuilder;
            ((StringBuilder)object3)("Unknown value for token of type ");
            ((StringBuilder)object3).append(object2);
            object2 = ((StringBuilder)object3).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        return (float)((gm1_0)object).p();
    }
}

