/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from IS2
 */
public final class is2_0
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;

    public is2_0(u10 u102) {
        this.c = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = LP1$a.b;
            n3 = 54;
            Integer n7 = n3;
            gx0_2 gx0_22 = this.c;
            gx0_22.invoke(object2, object, n7);
        }
        return Unit.a;
    }
}

