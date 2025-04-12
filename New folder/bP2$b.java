/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class bP2$b
extends Lambda
implements Function0 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ i50_0 d;

    public bP2$b(tr1_0 tr1_02, i50_0 i50_02) {
        this.c = tr1_02;
        this.d = i50_02;
        super(0);
    }

    public final Object invoke() {
        tr1_0 tr1_02 = this.c;
        boolean bl2 = (Boolean)tr1_02.getValue();
        boolean bl3 = true;
        Boolean bl4 = bl2 ^ bl3;
        tr1_02.setValue(bl4);
        this.d.d = bl3;
        return Unit.a;
    }
}

