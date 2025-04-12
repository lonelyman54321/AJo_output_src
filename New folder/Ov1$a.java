/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Ov1$a
extends Ov1 {
    public final Throwable b;

    public Ov1$a(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "error");
        super(false);
        this.b = exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Ov1$a;
        if (!bl2) return false;
        object = (Ov1$a)object;
        boolean bl3 = this.a;
        bl2 = ((Ov1)object).a;
        if (bl3 != bl2) return false;
        Throwable throwable = this.b;
        object = ((Ov1$a)object).b;
        boolean bl4 = Intrinsics.areEqual(throwable, object);
        if (!bl4) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = this.a;
        n3 = n3 != 0 ? 1231 : 1237;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Error(endOfPaginationReached=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", error=");
        Throwable throwable = this.b;
        stringBuilder.append(throwable);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

