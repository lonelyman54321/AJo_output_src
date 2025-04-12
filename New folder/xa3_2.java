/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xa3
 */
public final class xa3_2
implements un0_0 {
    public final float a;
    public final float b;
    public final Object c;

    public xa3_2() {
        this(null, 7);
    }

    public xa3_2(float f5, float f6, Object object) {
        this.a = f5;
        this.b = f6;
        this.c = object;
    }

    public /* synthetic */ xa3_2(Object object, int n3) {
        if ((n3 &= 4) != 0) {
            object = null;
        }
        this(1.0f, 1500.0f, object);
    }

    public final NA3 a() {
        Object object = ya3_0.a;
        Object object2 = this.c;
        object = object2 == null ? null : (Ol)((Ws3)object).a().invoke(object2);
        float f5 = this.a;
        float f6 = this.b;
        ua3_1 ua3_12 = new ua3_1(f5, f6, (Ol)object);
        return ua3_12;
    }

    public final JA3 b(Vs3 object) {
        Object object2 = this.c;
        object = object2 == null ? null : (Ol)object.a().invoke(object2);
        float f5 = this.a;
        float f6 = this.b;
        ua3_1 ua3_12 = new ua3_1(f5, f6, (Ol)object);
        return ua3_12;
    }

    public final boolean equals(Object object) {
        Object object2 = object instanceof xa3_2;
        boolean bl2 = false;
        if (object2) {
            Object object3;
            boolean bl3;
            float f5;
            object = (xa3_2)object;
            float f6 = ((xa3_2)object).a;
            float f7 = this.a;
            float f8 = f6 - f7;
            object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (!object2 && !(object2 = (f5 = (f6 = ((xa3_2)object).b) - (f7 = this.b)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) && (bl3 = Intrinsics.areEqual(object = ((xa3_2)object).c, object3 = this.c))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.c;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n3 *= 31;
        n3 = UR0.a(this.a, n3, 31);
        return Float.floatToIntBits(this.b) + n3;
    }
}

