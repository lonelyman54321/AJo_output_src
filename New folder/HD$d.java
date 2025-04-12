/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class HD$d
extends HD {
    public final p83_0 a;

    public HD$d(p83_0 p83_02) {
        this.a = p83_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HD$d;
        if (!bl3) {
            return false;
        }
        object = (HD$d)object;
        p83_0 p83_02 = this.a;
        object = ((HD$d)object).a;
        boolean bl4 = Intrinsics.areEqual(p83_02, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        p83_0 p83_02 = this.a;
        if (p83_02 == null) {
            n3 = 0;
            p83_02 = null;
        } else {
            n3 = p83_02.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(brands=");
        p83_0 p83_02 = this.a;
        stringBuilder.append(p83_02);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

