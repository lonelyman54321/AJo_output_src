/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dV1
 */
public final class dv1_0 {
    public static final /* synthetic */ int b;
    public final Object a;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("NetworkRequestCompat"), "tagWithPrefix(\"NetworkRequestCompat\")");
    }

    public dv1_0() {
        this(null);
    }

    public dv1_0(Object object) {
        this.a = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof dv1_0;
        if (!bl3) {
            return false;
        }
        object = (dv1_0)object;
        Object object2 = this.a;
        object = ((dv1_0)object).a;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkRequestCompat(wrapped=");
        Object object = this.a;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

