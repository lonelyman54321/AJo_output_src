/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from E6
 */
public final class e6_0
implements Function2 {
    public final /* synthetic */ z6_0 a;

    public e6_0(z6_0 z6_02) {
        this.a = z6_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = od3_2.a();
            n4 = (int)(Intrinsics.areEqual(object, object2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0);
            long l2 = n4 != 0 ? nz_1.a : OX.f;
            object2 = this.a;
            object = new d6_0((z6_0)object2);
            n3 = 711025293;
            u10 u102 = v10.c(n3, (fx0_2)object, (b30_0)object3);
            int n7 = 0x180000;
            int n8 = 59;
            long l3 = 0L;
            jg3_0.a(null, null, l2, l3, null, 0.0f, u102, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

