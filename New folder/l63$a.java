/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

public final class l63$a
extends CancellationException {
    public final l63_0 a;

    public l63$a(l63_0 l63_02) {
        Intrinsics.checkNotNullParameter(l63_02, "runner");
        super("Cancelled isolated runner");
        this.a = l63_02;
    }
}

