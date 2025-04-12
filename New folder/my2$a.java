/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class my2$a {
    public final String a;

    public my2$a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.a = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof my2$a;
        if (bl3) {
            object = ((my2$a)object).a;
            String string2 = this.a;
            bl2 = Intrinsics.areEqual(string2, object);
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

