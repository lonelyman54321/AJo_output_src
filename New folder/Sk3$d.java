/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Sk3$d
extends Lambda
implements Function0 {
    public final /* synthetic */ Sk3 c;

    public Sk3$d(Sk3 sk3) {
        this.c = sk3;
        super(0);
    }

    public final Object invoke() {
        Sk3 sk3 = this.c;
        sk3.f();
        sk3.m();
        return Unit.a;
    }
}

