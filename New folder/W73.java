/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class W73
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ boolean e;

    public W73(Function2 function2, u10 u102, boolean bl2) {
        this.c = function2;
        this.d = u102;
        this.e = bl2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = Bt3.b;
            object2 = ((At3)object.j((H30)object2)).j;
            u10 u102 = (u10)this.d;
            Function2 function2 = this.c;
            boolean bl2 = this.e;
            Function2 function22 = new V73(function2, u102, bl2);
            function22 = v10.c(225114541, function22, (b30_0)object);
            int n7 = 48;
            Ll3.a((xm3)object2, function22, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

