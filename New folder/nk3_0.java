/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nk3
 */
public final class nk3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Function2 d;

    public nk3_0(long l2, Function2 function2) {
        this.c = l2;
        this.d = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            Function2 function2 = this.d;
            long l2 = this.c;
            int n7 = 6;
            lk3_0.b(l2, null, null, function2, (b30_0)object3, 0, n7);
        }
        return Unit.a;
    }
}

