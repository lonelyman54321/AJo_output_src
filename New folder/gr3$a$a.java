/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class gr3$a$a
implements ib3_0 {
    public final gr3$d a;
    public Function1 b;
    public Function1 c;
    public final /* synthetic */ gr3$a d;

    public gr3$a$a(gr3$a gr3$a, gr3$d gr3$d, Function1 function1, Function1 function12) {
        this.d = gr3$a;
        this.a = gr3$d;
        this.b = function1;
        this.c = function12;
    }

    public final void d(gr3$b object) {
        Object object2 = this.c;
        Object object3 = object.a();
        object2 = object2.invoke(object3);
        object3 = this.d.c;
        boolean bl2 = ((gr3)object3).h();
        gr3$d gr3$d = this.a;
        if (bl2) {
            object3 = this.c;
            Object object4 = object.b();
            object3 = object3.invoke(object4);
            object4 = this.b;
            object = (un0_0)object4.invoke(object);
            gr3$d.t(object3, object2, (un0_0)object);
        } else {
            object3 = this.b;
            object = (un0_0)object3.invoke(object);
            gr3$d.u(object2, (un0_0)object);
        }
    }

    public final Object getValue() {
        gr3$b gr3$b = this.d.c.f();
        this.d(gr3$b);
        return this.a.j.getValue();
    }
}

