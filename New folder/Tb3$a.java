/*
 * Decompiled with CFR 0.152.
 */
public final class Tb3$a
extends Tb3 {
    public volatile boolean a;

    public final void a() {
        boolean bl2 = this.a;
        if (!bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Already released");
        throw illegalStateException;
    }
}

