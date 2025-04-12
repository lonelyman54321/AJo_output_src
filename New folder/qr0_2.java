/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Qr0
 */
public final class qr0_2
implements es0_2 {
    public final es0_2 a;
    public final Function1 b;
    public final Function2 c;

    public qr0_2(es0_2 es0_22) {
        us0_2 us0_22 = XA3.a;
        vs0_2 vs0_22 = XA3.b;
        this.a = es0_22;
        this.b = us0_22;
        this.c = vs0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Object object3;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = object3 = k52_0.a;
        object3 = new Qr0$a(this, ref$ObjectRef, (fs0_2)object);
        if ((object = this.a.collect((fs0_2)object3, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

