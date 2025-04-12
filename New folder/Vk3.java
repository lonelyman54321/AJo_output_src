/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Vk3
extends Lambda
implements Function0 {
    public final /* synthetic */ P70 c;
    public final /* synthetic */ Sk3 d;

    public Vk3(P70 p70, Sk3 sk3) {
        this.c = p70;
        this.d = sk3;
        super(0);
    }

    public final Object invoke() {
        this.d.d(false);
        P70$a$a p70$a$a = P70$a$a.a;
        this.c.a.setValue(p70$a$a);
        return Unit.a;
    }
}

