/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Hk$b$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Hk c;
    public final /* synthetic */ Hk$b d;

    public Hk$b$b(Hk hk, Hk$b hk$b) {
        this.c = hk;
        this.d = hk$b;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2;
        object = (gr3$b)object;
        Object object2 = this.c;
        Object object3 = ((Hk)object2).d;
        Object object4 = object.b();
        object3 = (ib3_0)((dt2_0)object3).b(object4);
        long l3 = 0L;
        if (object3 != null) {
            object3 = (bj1)object3.getValue();
            l2 = ((bj1)object3).a;
        } else {
            l2 = l3;
        }
        object = object.a();
        object2 = ((Hk)object2).d;
        object = (ib3_0)((dt2_0)object2).b(object);
        if (object != null) {
            object = (bj1)object.getValue();
            l3 = ((bj1)object).a;
        }
        if ((object = (W63)this.d.c.getValue()) == null || (object = object.b(l2, l3)) == null) {
            int n3 = 7;
            object3 = null;
            object = Hl.b(0.0f, n3, null);
        }
        return object;
    }
}

