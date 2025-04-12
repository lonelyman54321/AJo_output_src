/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class AO2
implements Function2 {
    public final /* synthetic */ bo2_0 a;

    public AO2(bo2_0 bo2_02) {
        this.a = bo2_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.a;
            hd2_0 hd2_02 = ((bo2_0)object2).c;
            object2 = ((bo2_0)object2).b;
            Ho3.c(0, (b30_0)object, (yi2_1)object2, hd2_02);
        }
        return Unit.a;
    }
}

