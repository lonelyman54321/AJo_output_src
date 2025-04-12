/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from e30
 */
public final class e30_0
extends c30_0 {
    public final boolean c;

    public e30_0(lm1_2 lm1_22, boolean bl2) {
        Intrinsics.checkNotNullParameter(lm1_22, "writer");
        super(lm1_22);
        this.c = bl2;
    }

    public final void j(String string2) {
        String string3 = "value";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = this.c;
        if (bl2) {
            super.j(string2);
        } else {
            this.h(string2);
        }
    }
}

