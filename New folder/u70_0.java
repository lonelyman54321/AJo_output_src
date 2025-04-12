/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from U70
 */
public final class u70_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ E70 d;

    public u70_0(Yk3 yk3, E70 e70) {
        this.c = yk3;
        this.d = e70;
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
            object = object2.v();
            if (object == (object3 = b30$a.a)) {
                object = new M70();
                object2.o(object);
            }
            object = (M70)object;
            ((M70)object).a.clear();
            this.c.invoke(object);
            n3 = 0;
            object3 = null;
            E70 e70 = this.d;
            ((M70)object).a(e70, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

