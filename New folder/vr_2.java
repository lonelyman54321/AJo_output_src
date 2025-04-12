/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VR
 */
public final class vr_2 {
    public static final VR$b b;
    public final Object a;

    static {
        VR$b vR$b;
        b = vR$b = new Object();
    }

    public /* synthetic */ vr_2(Object object) {
        this.a = object;
    }

    public static final Object a(Object object) {
        boolean bl2 = object instanceof VR$b;
        if (bl2) {
            object = null;
        }
        return object;
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2;
        boolean bl3 = object instanceof vr_2;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(object2 = this.a, object = ((vr_2)object).a))) {
            bl4 = true;
        }
        return bl4;
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
        Object object = this.a;
        boolean bl2 = object instanceof VR$a;
        if (bl2) {
            object = ((VR$a)object).toString();
        } else {
            String string2 = "Value(";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            char c2 = ')';
            stringBuilder.append(c2);
            object = stringBuilder.toString();
        }
        return object;
    }
}

