/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 */
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/*
 * Renamed from mP1
 */
public final class mp1_0 {
    public static final PointF a;

    static {
        PointF pointF;
        a = pointF = new PointF();
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        float f5 = pointF.x;
        float f6 = pointF2.x;
        float f7 = pointF.y;
        float f8 = pointF2.y;
        PointF pointF3 = new PointF(f5 += f6, f7 += f8);
        return pointF3;
    }

    public static float b(float f5, float f6, float f7) {
        f5 = Math.min(f7, f5);
        return Math.max(f6, f5);
    }

    public static int c(int n3) {
        n3 = Math.min(255, n3);
        return Math.max(0, n3);
    }

    public static int d(float f5, float f6) {
        int n3 = (int)f5;
        int n4 = (int)f6;
        int n7 = n3 / n4;
        int n8 = n3 ^ n4;
        n8 = n8 >= 0 ? 1 : 0;
        int n10 = n3 % n4;
        if (n8 == 0 && n10 != 0) {
            n7 += -1;
        }
        return n3 - (n4 *= n7);
    }

    public static void e(l13 l132, Path path) {
        Object object;
        int n3;
        path.reset();
        PointF pointF = l132.b;
        float f5 = pointF.x;
        float f6 = pointF.y;
        path.moveTo(f5, f6);
        PointF pointF2 = a;
        f6 = pointF.x;
        float f7 = pointF.y;
        pointF2.set(f6, f7);
        f7 = 0.0f;
        pointF = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = l132.a)).size()); ++i3) {
            float f8;
            object = (Oe0)((ArrayList)object).get(i3);
            PointF pointF3 = ((Oe0)object).a;
            boolean bl2 = pointF3.equals((Object)pointF2);
            PointF pointF4 = ((Oe0)object).b;
            object = ((Oe0)object).c;
            if (bl2 && (bl2 = pointF4.equals(object))) {
                f8 = ((PointF)object).x;
                float f11 = ((PointF)object).y;
                path.lineTo(f8, f11);
            } else {
                float f12 = pointF3.x;
                float f14 = pointF3.y;
                float f15 = pointF4.x;
                float f16 = pointF4.y;
                float f17 = ((PointF)object).x;
                float f18 = ((PointF)object).y;
                pointF4 = path;
                path.cubicTo(f12, f14, f15, f16, f17, f18);
            }
            f8 = ((PointF)object).x;
            f6 = ((PointF)object).y;
            pointF2.set(f8, f6);
        }
        boolean bl3 = l132.c;
        if (bl3) {
            path.close();
        }
    }

    public static float f(float f5, float f6, float f7) {
        return xu0_1.a(f6, f5, f7, f5);
    }

    public static void g(ko1 object, int n3, ArrayList arrayList, ko1 object2, mo1_0 mo1_02) {
        String string2 = mo1_02.getName();
        boolean bl2 = ((ko1)object).a(n3, string2);
        if (bl2) {
            object = mo1_02.getName();
            object2.getClass();
            ko1 ko12 = new ko1((ko1)object2);
            object2 = ko12.a;
            object2.add(object);
            object = new ko1(ko12);
            ((ko1)object).b = mo1_02;
            arrayList.add(object);
        }
    }
}

