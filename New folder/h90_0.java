/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H90
 */
public final class h90_0
extends a {
    public static final H90$a b;
    public final String a;

    static {
        H90$a h90$a;
        b = h90$a = new Object();
    }

    public h90_0(String string2) {
        H90$a h90$a = b;
        super(h90$a);
        this.a = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof h90_0;
        if (!bl3) {
            return false;
        }
        object = (h90_0)object;
        String string2 = this.a;
        object = ((h90_0)object).a;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoroutineName(");
        String string2 = this.a;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

