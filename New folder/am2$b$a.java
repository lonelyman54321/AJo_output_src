/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class am2$b$a
extends am2$b {
    public final Throwable a;

    public am2$b$a(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "throwable");
        this.a = exception;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof am2$b$a;
        if (!bl3) {
            return false;
        }
        object = (am2$b$a)object;
        Throwable throwable = this.a;
        object = ((am2$b$a)object).a;
        boolean bl4 = Intrinsics.areEqual(throwable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoadResult.Error(\n                    |   throwable: ");
        Throwable throwable = this.a;
        stringBuilder.append(throwable);
        stringBuilder.append("\n                    |) ");
        return ee3_2.c(stringBuilder.toString());
    }
}

