/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Vt1$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;

    public Vt1$b(Vt1 vt1) {
        this.c = vt1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (ql3_0)object;
        Object object2 = ((ql3_0)object).a.a;
        Vt1 vt1 = this.c;
        Object object3 = vt1.j;
        object3 = object3 != null ? ((Sl)object3).a : null;
        boolean bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            object2 = x21_0.None;
            object3 = vt1.k;
            ((h83_0)object3).setValue(object2);
        }
        long l2 = mm3.b;
        vt1.g(l2);
        vt1.f(l2);
        vt1.s.invoke(object);
        vt1.b.invalidate();
        return Unit.a;
    }
}

