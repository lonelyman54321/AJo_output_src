/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from PQ2
 */
public final class pq2_2
extends sg2_2 {
    private static final long serialVersionUID = -8219729196779211169L;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RunnableDisposable(disposed=");
        boolean bl2 = this.isDisposed();
        stringBuilder.append(bl2);
        stringBuilder.append(", ");
        Object v4 = this.get();
        stringBuilder.append(v4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

