/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class M80
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ Al3 d;
    public final /* synthetic */ ql3_0 e;
    public final /* synthetic */ Se1 f;

    public M80(Vt1 vt1, Al3 al3, ql3_0 ql3_02, Se1 se1) {
        this.c = vt1;
        this.d = al3;
        this.e = ql3_02;
        this.f = se1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        boolean bl2 = ((Vt1)object).b();
        if (bl2) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object object2 = ((Vt1)object).d;
            Object object3 = ((Vt1)object).t;
            Object object4 = new dk3_0((Gx0)object2, (Vt1$b)object3, ref$ObjectRef);
            object2 = this.d;
            object3 = ((Al3)object2).a;
            ql3_0 ql3_02 = this.e;
            Se1 se1 = this.f;
            Vt1$a vt1$a = ((Vt1)object).u;
            object3.d(ql3_02, se1, (dk3_0)object4, vt1$a);
            object4 = new Il3((Al3)object2, (zt2_0)object3);
            object2 = ((Al3)object2).b;
            ((AtomicReference)object2).set(object4);
            ref$ObjectRef.element = object4;
            ((Vt1)object).e = object4;
        }
        object = new Object();
        return object;
    }
}

