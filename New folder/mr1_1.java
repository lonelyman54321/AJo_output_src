/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mR1
 */
public final class mr1_1 {
    public final CopyOnWriteArrayList a;
    public final kb3_2 b;
    public final ge2_2 c;

    public mr1_1() {
        Object object = new CopyOnWriteArrayList();
        this.a = object;
        this.b = object = lb3_2.a(null);
        this.c = object = ms0_1.b((kb3_2)object);
    }

    public static final wZ a(mr1_1 object, wZ object2, Qv1 qv1, Qv1 qv12) {
        Object object3;
        object.getClass();
        object = Ov1$c.c;
        if (object2 == null || (object3 = ((wZ)object2).a) == null) {
            object3 = object;
        }
        Ov1 ov1 = qv1.a;
        Ov1 ov12 = null;
        Ov1 ov13 = qv12 != null ? qv12.a : null;
        Ov1 ov14 = mr1_1.b((Ov1)object3, ov1, ov1, ov13);
        if (object2 == null || (object3 = ((wZ)object2).b) == null) {
            object3 = object;
        }
        ov1 = qv12 != null ? qv12.b : null;
        ov13 = qv1.a;
        Object object4 = qv1.b;
        Ov1 ov15 = mr1_1.b((Ov1)object3, ov13, (Ov1)object4, ov1);
        if (object2 != null && (object2 = ((wZ)object2).c) != null) {
            object = object2;
        }
        if (qv12 != null) {
            ov12 = qv12.c;
        }
        object2 = qv1.c;
        Ov1 ov16 = mr1_1.b((Ov1)object, ov13, (Ov1)object2, ov12);
        object4 = object;
        object = new wZ(ov14, ov15, ov16, qv1, qv12);
        return object;
    }

    public static Ov1 b(Ov1 ov1, Ov1 ov12, Ov1 ov13, Ov1 ov14) {
        boolean bl2;
        if (ov14 == null) {
            return ov13;
        }
        boolean bl3 = ov1 instanceof Ov1$b;
        if (!bl3 || (bl2 = ov12 instanceof Ov1$c) && (bl2 = ov14 instanceof Ov1$c) || (bl2 = ov14 instanceof Ov1$a)) {
            ov1 = ov14;
        }
        return ov1;
    }

    public final void c(Function1 object) {
        block3: {
            wZ wZ2;
            Object object2;
            Object object3;
            boolean bl2;
            do {
                object3 = this.b;
                Object object4 = object2 = ((kb3_2)object3).getValue();
                object4 = (wZ)object2;
                wZ2 = (wZ)object.invoke(object4);
                boolean bl3 = Intrinsics.areEqual(object4, wZ2);
                if (bl3) break block3;
            } while (!(bl2 = ((kb3_2)object3).j(object2, wZ2)));
            if (wZ2 != null) {
                object = this.a.iterator();
                while (bl2 = object.hasNext()) {
                    object3 = (Function1)object.next();
                    object3.invoke(wZ2);
                }
            }
        }
    }

    public final void d(Qv1 qv1, Qv1 qv12) {
        Intrinsics.checkNotNullParameter(qv1, "sourceLoadStates");
        mR1$a mR1$a = new mR1$a(this, qv1, qv12);
        this.c(mR1$a);
    }
}

