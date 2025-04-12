/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hy2
 */
public final class hy2_2
extends Lambda
implements Function2 {
    public final /* synthetic */ Object[] c;
    public final /* synthetic */ vr1_1 d;

    public hy2_2(vr1_1 vr1_12, Object[] objectArray) {
        this.c = objectArray;
        this.d = vr1_12;
        super(2);
    }

    public final Object invoke(Object objectArray, Object object) {
        int n3;
        Object[] objectArray2 = objectArray;
        objectArray2 = (b30_0)objectArray;
        int n4 = ((Number)(object = (Number)object)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(objectArray2.h() ? 1 : 0)) != 0) {
            objectArray2.D();
        } else {
            u10 u102 = c20_0.a;
            objectArray = this.c;
            n3 = (int)(objectArray2.x(objectArray) ? 1 : 0);
            Object object2 = objectArray2.v();
            if (n3 != 0 || object2 == (object = b30$a.a)) {
                object = this.d;
                object2 = new gy2_1((vr1_1)object, objectArray);
                objectArray2.o(object2);
            }
            object2 = (Function0)object2;
            long l2 = 0L;
            int n7 = 6;
            long l3 = 0L;
            zs0_0.a(u102, (Function0)object2, null, null, null, null, l2, l3, null, (b30_0)objectArray2, n7);
        }
        return Unit.a;
    }
}

