/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class tL2$b
implements Serializable {
    public final Throwable a;

    public tL2$b(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "exception");
        this.a = throwable;
    }

    public final boolean equals(Object object) {
        Throwable throwable;
        boolean bl2;
        boolean bl3 = object instanceof tL2$b;
        if (bl3 && (bl2 = Intrinsics.areEqual(throwable = this.a, object = ((tL2$b)object).a))) {
            bl2 = true;
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
        StringBuilder stringBuilder = new StringBuilder("Failure(");
        Throwable throwable = this.a;
        stringBuilder.append(throwable);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

