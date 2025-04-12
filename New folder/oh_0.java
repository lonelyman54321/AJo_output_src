/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from oh
 */
public final class oh_0
extends Lambda
implements Function2 {
    public final /* synthetic */ ib3_0 c;

    public oh_0(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = (Function2)this.c.getValue();
            n3 = 0;
            Integer n7 = 0;
            object2.invoke(object, n7);
        }
        return Unit.a;
    }
}

