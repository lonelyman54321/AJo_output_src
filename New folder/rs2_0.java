/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from RS2
 */
public final class rs2_0
extends Lambda
implements Function2 {
    public final /* synthetic */ mI0 c;
    public final /* synthetic */ Function2 d;

    public rs2_0(mI0 mI02, Function2 function2) {
        this.c = mI02;
        this.d = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = HS2.a;
            Object object3 = this.c;
            object2 = ((vc3_1)object2).c(object3);
            object3 = this.d;
            int n7 = 8;
            L30.a((MB2)object2, (Function2)object3, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

