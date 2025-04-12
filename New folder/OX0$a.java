/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;

public final class OX0$a {
    public static /* synthetic */ es0_2 a(ox0_2 ox0_22, CoroutineContext coroutineContext, int n3, he_2 he_22, int n4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            coroutineContext = f.a;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = -3;
        }
        if ((n4 &= 4) != 0) {
            he_22 = he_2.SUSPEND;
        }
        return ox0_22.e(coroutineContext, n3, he_22);
    }
}

