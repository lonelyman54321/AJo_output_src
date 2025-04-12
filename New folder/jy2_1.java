/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Jy2
 */
public final class jy2_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Object[] c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public jy2_1(String string2, String string3, Object[] objectArray) {
        this.c = objectArray;
        this.d = string2;
        this.e = string3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        jy2_1 jy2_12 = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            Object object5;
            object4 = object3.v();
            if (object4 == (object5 = b30$a.a)) {
                n4 = 0;
                object4 = Pv2.b(0);
                object3.o(object4);
            }
            object4 = (vr1_1)object4;
            Object[] objectArray = jy2_12.c;
            object5 = new hy2_2((vr1_1)object4, objectArray);
            u10 u102 = v10.c(958604965, (fx0_2)object5, (b30_0)object3);
            String string2 = jy2_12.d;
            String string3 = jy2_12.e;
            object5 = new iy2_2(string2, string3, objectArray, (vr1_1)object4);
            u10 u103 = v10.c(57310875, (fx0_2)object5, (b30_0)object3);
            int n7 = 0xC00000;
            int n8 = 131039;
            n4 = 0;
            object4 = null;
            n3 = 0;
            object5 = null;
            objectArray = null;
            string2 = null;
            string3 = null;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            long l8 = 0L;
            int n10 = 196608;
            HS2.a(null, null, null, null, null, u102, 0, false, null, false, null, 0.0f, l2, l3, l4, l7, l8, u103, (b30_0)object3, n10, n7, n8);
        }
        return Unit.a;
    }
}

