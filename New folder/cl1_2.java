/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;

/*
 * Renamed from Cl1
 */
public abstract class cl1_2
extends yw1_2
implements fr0_1,
bg1_2 {
    public JobSupport d;

    public final d42_0 b() {
        return null;
    }

    public final void dispose() {
        block9: {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            boolean bl2;
            Object object5 = this.h();
            object5.getClass();
            block0: while (bl2 = (object4 = ((AtomicReferenceFieldUpdater)(object3 = JobSupport.a)).get(object5)) instanceof cl1_2) {
                if (object4 == this) {
                    boolean bl3;
                    object2 = y61.g;
                    while (!(bl3 = ((AtomicReferenceFieldUpdater)object3).compareAndSet(object5, object4, object2))) {
                        object = ((AtomicReferenceFieldUpdater)object3).get(object5);
                        if (object == object4) continue;
                        continue block0;
                    }
                }
                break block9;
            }
            boolean bl4 = object4 instanceof bg1_2;
            if (bl4 && (object5 = (object4 = (bg1_2)object4).b()) != null) {
                block2: while (true) {
                    boolean bl5;
                    if (bl5 = (object3 = ((AtomicReferenceFieldUpdater)(object5 = yw1_2.a)).get(this)) instanceof ri2_2) {
                        object3 = (ri2_2)object3;
                        object5 = ((ri2_2)object3).a;
                        break;
                    }
                    if (object3 == this) {
                        object3 = (yw1_2)object3;
                        break;
                    }
                    Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    object4 = object3;
                    object4 = (yw1_2)object3;
                    object4.getClass();
                    object2 = yw1_2.c;
                    object = (ri2_2)((AtomicReferenceFieldUpdater)object2).get(object4);
                    if (object == null) {
                        object = new Object((yw1_2)object4);
                        ((AtomicReferenceFieldUpdater)object2).set(object4, object);
                    }
                    do {
                        if (!(bl2 = ((AtomicReferenceFieldUpdater)object5).compareAndSet(this, object3, object))) continue;
                        ((yw1_2)object4).d();
                        break block2;
                    } while ((object2 = ((AtomicReferenceFieldUpdater)object5).get(this)) == object3);
                }
            }
        }
    }

    public i getParent() {
        return this.h();
    }

    public final JobSupport h() {
        JobSupport jobSupport = this.d;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract boolean i();

    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable var1);

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getClass().getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = si0_2.d(this);
        stringBuilder.append(string2);
        stringBuilder.append("[job@");
        string2 = si0_2.d(this.h());
        stringBuilder.append(string2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

