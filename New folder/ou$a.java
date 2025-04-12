/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class ou$a
extends cl1_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    private volatile /* synthetic */ Object _disposer$volatile;
    public final bl_2 e;
    public fr0_1 f;
    public final /* synthetic */ ou_2 g;

    static {
        h = AtomicReferenceFieldUpdater.newUpdater(ou$a.class, Object.class, "_disposer$volatile");
    }

    public ou$a(ou_2 ou_22, CancellableContinuationImpl cancellableContinuationImpl) {
        this.g = ou_22;
        this.e = cancellableContinuationImpl;
    }

    public final boolean i() {
        return false;
    }

    public final void j(Throwable object) {
        bl_2 bl_22 = this.e;
        if (object != null) {
            if ((object = bl_22.y((Throwable)object)) != null) {
                bl_22.J(object);
                object = (ou$b)h.get(this);
                if (object != null) {
                    object.a();
                }
            }
        } else {
            object = ou_2.b;
            Object object2 = this.g;
            int n3 = object.decrementAndGet(object2);
            if (n3 == 0) {
                object = ((ou_2)object2).a;
                int n4 = ((vn0_2[])object).length;
                object2 = new Object(n4);
                n4 = ((vn0_2[])object).length;
                for (int i3 = 0; i3 < n4; ++i3) {
                    Object object3 = object[i3].k();
                    ((ArrayList)object2).add(object3);
                }
                object = tl2_2.b;
                bl_22.resumeWith(object2);
            }
        }
    }
}

