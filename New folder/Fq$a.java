/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Fq$a {
    public final Object a;

    public /* synthetic */ Fq$a(Object object) {
        this.a = object;
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2;
        boolean bl3 = object instanceof Fq$a;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(object2 = this.a, object = ((Fq$a)object).a))) {
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
        StringBuilder stringBuilder = new StringBuilder("AsyncTypefaceResult(result=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

