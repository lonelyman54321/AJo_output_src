/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class iF$a$a
implements iF$a {
    public final Throwable b;

    public iF$a$a(Throwable throwable) {
        this.b = throwable;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof iF$a$a;
        if (!bl3) {
            return false;
        }
        object = (iF$a$a)object;
        Throwable throwable = this.b;
        object = ((iF$a$a)object).b;
        boolean bl4 = Intrinsics.areEqual(throwable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Throwable throwable = this.b;
        if (throwable == null) {
            n3 = 0;
            throwable = null;
        } else {
            n3 = throwable.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Closed(cause=");
        Throwable throwable = this.b;
        stringBuilder.append(throwable);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

