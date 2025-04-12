/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xL2
 */
public final class xl2_2
extends Lambda
implements Function0 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ i50_0 d;

    public xl2_2(tr1_0 tr1_02, i50_0 i50_02) {
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

