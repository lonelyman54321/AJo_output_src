/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qo3
 */
public final class qo3_0
implements gx0_2 {
    public final /* synthetic */ Function2 a;

    public qo3_0(u10 u102) {
        this.a = u102;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (mk2_0)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            n4 = 0;
            object = 0;
            object3 = this.a;
            object3.invoke(object2, object);
        }
        return Unit.a;
    }
}

