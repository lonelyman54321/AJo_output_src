/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;

public final class F00$b
extends CompletableFuture {
    public final jj_2 a;

    public F00$b(v72_0 v72_02) {
        this.a = v72_02;
    }

    public final boolean cancel(boolean bl2) {
        if (bl2) {
            jj_2 jj_22 = this.a;
            jj_22.cancel();
        }
        return super.cancel(bl2);
    }
}

