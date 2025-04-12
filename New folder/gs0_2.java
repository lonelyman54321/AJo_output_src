/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/*
 * Renamed from GS0
 */
public final class gs0_2
extends ut2_2 {
    public final boolean T(Throwable throwable) {
        boolean bl2 = throwable instanceof ChildCancelledException;
        if (bl2) {
            return true;
        }
        return this.H(throwable);
    }
}

