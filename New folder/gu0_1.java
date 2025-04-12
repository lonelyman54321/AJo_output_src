/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from GU0
 */
public final class gu0_1
extends LP1$c
implements J30,
G62 {
    public Cs2$a n;
    public boolean o;

    public final void a0() {
        Object object = new Ref$ObjectRef();
        Object object2 = new FU0((Ref$ObjectRef)object, this);
        H62.a(this, (Function0)object2);
        object = (cs2_0)((Ref$ObjectRef)object).element;
        boolean bl2 = this.o;
        if (bl2) {
            object2 = this.n;
            if (object2 != null) {
                object2.release();
            }
            object = object != null ? object.a() : null;
            this.n = object;
        }
    }

    public final boolean g1() {
        return false;
    }

    public final void l1() {
        Cs2$a cs2$a = this.n;
        if (cs2$a != null) {
            cs2$a.release();
        }
        this.n = null;
    }
}

