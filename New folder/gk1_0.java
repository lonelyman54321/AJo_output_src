/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from GK1
 */
public final class gk1_0
extends Lambda
implements Function2 {
    public final /* synthetic */ At3 c;
    public final /* synthetic */ Function2 d;

    public gk1_0(At3 at3, u10 u102) {
        this.c = at3;
        this.d = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.c.i;
            u10 u102 = (u10)this.d;
            Function2 function2 = new FK1(u102);
            function2 = v10.c(181426554, function2, (b30_0)object);
            int n7 = 48;
            Ll3.a((xm3)object2, function2, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

