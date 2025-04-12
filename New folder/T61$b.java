/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class T61$b
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yT1 b;

    public T61$b(dr0_0 dr0_02, yT1 yT12) {
        this.a = dr0_02;
        this.b = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = this.a;
            object2 = (Boolean)((dr0_0)object).m.getValue();
            n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            if (n3 == 0) {
                yT1 yT12 = this.b;
                object2 = new U61((dr0_0)object, yT12);
                u10 u102 = v10.c(722383186, (fx0_2)object2, (b30_0)object3);
                long l2 = nz_1.a;
                n4 = 12;
                float f5 = n4;
                int n7 = 1597446;
                int n8 = 46;
                long l3 = 0L;
                Km.c(f5, n7, n8, l2, l3, u102, (b30_0)object3, null, null, null);
            }
        }
        return Unit.a;
    }
}

