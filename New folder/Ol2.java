/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$f$a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Ol2
implements Function1 {
    public boolean a = true;
    public final /* synthetic */ Ql2 b;

    public Ol2(Ql2 ql2) {
        this.b = ql2;
    }

    public final Object invoke(Object object) {
        object = (wZ)object;
        Object object2 = "loadStates";
        Intrinsics.checkNotNullParameter(object, object2);
        boolean bl2 = this.a;
        if (bl2) {
            boolean bl3 = false;
            object = null;
            this.a = false;
        } else {
            object = ((wZ)object).d.a;
            boolean bl4 = object instanceof Ov1$c;
            if (bl4) {
                Object object3;
                object = this.b;
                object2 = ((RecyclerView$f)object).getStateRestorationPolicy();
                if (object2 == (object3 = RecyclerView$f$a.PREVENT) && !(bl2 = ((Ql2)object).a)) {
                    object2 = RecyclerView$f$a.ALLOW;
                    ((Ql2)object).setStateRestorationPolicy((RecyclerView$f$a)((Object)object2));
                }
                object2 = "listener";
                Intrinsics.checkNotNullParameter(this, object2);
                object = ((Ql2)object).b;
                object.getClass();
                Intrinsics.checkNotNullParameter(this, object2);
                object3 = ((Cq)object).m;
                ((CopyOnWriteArrayList)object3).remove(this);
                boolean bl5 = ((CopyOnWriteArrayList)object3).isEmpty();
                if (bl5 && (object3 = (Function1)((Cq)object).l.get()) != null) {
                    object = ((Cq)object).h;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object3, object2);
                    object = ((Sl2)object).d;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object3, object2);
                    object = ((mr1_1)object).a;
                    ((CopyOnWriteArrayList)object).remove(object3);
                }
            }
        }
        return Unit.a;
    }
}

