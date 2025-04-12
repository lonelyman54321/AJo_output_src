/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from kf2
 */
public final class kf2_2
implements Function2 {
    public final /* synthetic */ Function0 a;

    public kf2_2(rb2_1 rb2_12) {
        this.a = rb2_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 0;
            object2 = null;
            rb2_1 rb2_12 = (rb2_1)this.a;
            qf2_0.c(rb2_12, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

