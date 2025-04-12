/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class cj1
extends d63_0 {
    public final int b;
    public final int c;

    public cj1(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorMsg");
        Integer n4 = n3;
        super(n4, string2);
        this.b = n3;
        this.c = -1;
    }

    public final boolean a() {
        int n3 = this.b;
        int n4 = -1 << -1;
        boolean bl2 = false;
        if (n3 == n4) {
            ak2_1.b();
            return false;
        }
        n4 = this.c;
        if (n3 <= n4) {
            bl2 = true;
        }
        if (bl2) {
            ak2_1.b();
        }
        return bl2 ^ true;
    }
}

