/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Pv3 {
    public final int a;
    public Pv3$a b;
    public Pv3$a c;
    public int d;
    public Long e;
    public boolean f;

    public Pv3() {
        this(0);
    }

    public Pv3(int n3) {
        this.a = 100000;
    }

    public final void a(ql3_0 object) {
        int n3 = 0;
        this.f = false;
        Object object2 = this.b;
        if (object2 != null) {
            object2 = ((Pv3$a)object2).b;
        } else {
            n3 = 0;
            object2 = null;
        }
        n3 = Intrinsics.areEqual(object, object2);
        if (n3 != 0) {
            return;
        }
        object2 = ((ql3_0)object).a;
        Object object3 = ((Sl)object2).a;
        Object object4 = this.b;
        object4 = object4 != null && (object4 = ((Pv3$a)object4).b) != null ? ((ql3_0)object4).a.a : null;
        boolean bl2 = Intrinsics.areEqual(object3, object4);
        if (bl2) {
            object2 = this.b;
            if (object2 != null) {
                ((Pv3$a)object2).b = object;
            }
            return;
        }
        object3 = this.b;
        this.b = object4 = new Pv3$a((Pv3$a)object3, (ql3_0)object);
        this.c = null;
        int n4 = this.d;
        object2 = ((Sl)object2).a;
        this.d = n3 = ((String)object2).length() + n4;
        n4 = this.a;
        if (n3 > n4) {
            object = this.b;
            if (object != null) {
                object2 = ((Pv3$a)object).a;
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                while (true) {
                    if (object != null && (object2 = ((Pv3$a)object).a) != null) {
                        object2 = ((Pv3$a)object2).a;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 == null) break;
                    object = ((Pv3$a)object).a;
                }
                if (object != null) {
                    ((Pv3$a)object).a = null;
                }
            }
        }
    }
}

