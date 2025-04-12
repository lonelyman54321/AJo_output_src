/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Lh3
 */
public final class lh3_2
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;

    public lh3_2(u10 u102, Function2 function2) {
        this.c = u102;
        this.d = function2;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        object = (rZ)object;
        object2 = (b30_0)object2;
        int n4 = ((Number)(object3 = (Number)object3)).intValue() & 0x11;
        if (n4 == (n3 = 16) && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = this.d;
            object3 = (u10)this.c;
            Uh3.d((u10)object3, (Function2)object, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

