/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Eu$c
extends Lambda
implements Function0 {
    public final /* synthetic */ eu_1 c;

    public Eu$c(eu_1 eu_12) {
        this.c = eu_12;
        super(0);
    }

    public final Object invoke() {
        eu_1 eu_12 = this.c;
        LP1$b lP1$b = eu_12.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
        ((pp1_0)lP1$b).a(eu_12);
        return Unit.a;
    }
}

