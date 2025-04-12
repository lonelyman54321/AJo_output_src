/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class wZ {
    public final Ov1 a;
    public final Ov1 b;
    public final Ov1 c;
    public final Qv1 d;
    public final Qv1 e;

    public wZ(Ov1 ov1, Ov1 ov12, Ov1 ov13, Qv1 qv1, Qv1 qv12) {
        Intrinsics.checkNotNullParameter(ov1, "refresh");
        Intrinsics.checkNotNullParameter(ov12, "prepend");
        Intrinsics.checkNotNullParameter(ov13, "append");
        String string2 = "source";
        Intrinsics.checkNotNullParameter(qv1, string2);
        this.a = ov1;
        this.b = ov12;
        this.c = ov13;
        this.d = qv1;
        this.e = qv12;
        boolean bl2 = qv1.e;
        if (bl2) {
            bl2 = qv12 != null ? qv12.e : true;
        }
        bl2 = qv1.d;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = wZ.class) == (object2 = object.getClass())) {
            object = (wZ)object;
            object2 = this.a;
            object3 = ((wZ)object).a;
            boolean bl3 = Intrinsics.areEqual(object2, object3);
            if (!bl3) {
                return false;
            }
            object2 = this.b;
            object3 = ((wZ)object).b;
            bl3 = Intrinsics.areEqual(object2, object3);
            if (!bl3) {
                return false;
            }
            object2 = this.c;
            object3 = ((wZ)object).c;
            bl3 = Intrinsics.areEqual(object2, object3);
            if (!bl3) {
                return false;
            }
            object2 = this.d;
            object3 = ((wZ)object).d;
            bl3 = Intrinsics.areEqual(object2, object3);
            if (!bl3) {
                return false;
            }
            object2 = this.e;
            object = ((wZ)object).e;
            boolean bl4 = Intrinsics.areEqual(object2, object);
            if (!bl4) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        Qv1 qv1 = this.d;
        n4 = (qv1.hashCode() + n3) * 31;
        Qv1 qv12 = this.e;
        if (qv12 != null) {
            n3 = qv12.hashCode();
        } else {
            n3 = 0;
            qv12 = null;
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CombinedLoadStates(refresh=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", prepend=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", append=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", source=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", mediator=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

