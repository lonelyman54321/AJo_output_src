/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class U01
extends Lambda
implements Function1 {
    public final /* synthetic */ W01 c;

    public U01(W01 w01) {
        this.c = w01;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Kt0)object;
        Object object2 = this.c;
        gn2 gn22 = ((W01)object2).l;
        boolean bl2 = ((W01)object2).n;
        if (bl2 && (bl2 = ((W01)object2).v) && gn22 != null) {
            object2 = ((W01)object2).d;
            xL$b xL$b = object.M0();
            long l2 = xL$b.l();
            Object object3 = xL$b.a();
            object3.p();
            try {
                object3 = xL$b.a;
                int n3 = 1;
                ((yl_0)object3).a(gn22, n3);
                object2.invoke(object);
            }
            finally {
                jz.b(xL$b, l2);
            }
        } else {
            object2 = ((W01)object2).d;
            object2.invoke(object);
        }
        return Unit.a;
    }
}

