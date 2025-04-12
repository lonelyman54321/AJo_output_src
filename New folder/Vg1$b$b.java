/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Vg1$b$b
extends Lambda
implements Function0 {
    public final /* synthetic */ i90_0 c;

    public Vg1$b$b(i90_0 i90_02) {
        this.c = i90_02;
        super(0);
    }

    public final Object invoke() {
        return Float.valueOf(mg3_0.h(this.c.getCoroutineContext()));
    }
}

