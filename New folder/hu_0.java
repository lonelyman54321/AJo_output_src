/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hu
 */
public final class hu_0
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;

    public hu_0(gx0_2 gx0_22) {
        this.c = gx0_22;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 0;
            object2 = 0;
            mq2_0 mq2_02 = mq2_0.a;
            gx0_2 gx0_22 = this.c;
            gx0_22.invoke(mq2_02, object, object2);
        }
        return Unit.a;
    }
}

