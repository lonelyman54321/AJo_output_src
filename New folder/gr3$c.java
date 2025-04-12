/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class gr3$c
implements gr3$b {
    public final Object a;
    public final Object b;

    public gr3$c(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final Object a() {
        return this.b;
    }

    public final Object b() {
        return this.a;
    }

    public final boolean c(Object object, Object object2) {
        Object object3 = this.b();
        boolean bl2 = Intrinsics.areEqual(object, object3);
        if (bl2 && (bl2 = Intrinsics.areEqual(object2, object = this.a()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3 = object instanceof gr3$b;
        if (bl3 && (bl3 = Intrinsics.areEqual(object3 = this.a, object2 = (object = (gr3$b)object).b())) && (bl2 = Intrinsics.areEqual(object2 = this.b, object = object.a()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Object object = this.a;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n3 *= 31;
        Object object2 = this.b;
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n3 + n4;
    }
}

