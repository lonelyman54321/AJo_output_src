/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from sd
 */
public final class sd_1
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yT1 b;

    public sd_1(dr0_0 dr0_02, yT1 yT12) {
        this.a = dr0_02;
        this.b = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 72;
            dr0_0 dr0_02 = this.a;
            yT1 yT12 = this.b;
            qd_0.e(n4, (b30_0)object, dr0_02, yT12);
        }
        return Unit.a;
    }
}

