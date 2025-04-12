/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class rl3$a
extends Lambda
implements Function0 {
    public final /* synthetic */ sl3_0 c;

    public rl3$a(sl3_0 sl3_02) {
        this.c = sl3_02;
        super(0);
    }

    public final Object invoke() {
        return Float.valueOf(this.c.getAlpha());
    }
}

