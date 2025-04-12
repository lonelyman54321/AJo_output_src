/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from EA2
 */
public final class ea2_2
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ tr1_0 d;

    public ea2_2(i90_0 i90_02, int n3, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.a = i90_02;
        this.b = n3;
        this.c = tr1_02;
        this.d = tr1_03;
    }

    public final Object invoke() {
        tr1_0 tr1_02 = this.c;
        tr1_0 tr1_03 = this.d;
        int n3 = this.b;
        da2_2 da2_22 = new da2_2(n3, tr1_02, tr1_03, null);
        Ae3.d(this.a, null, null, da2_22, 3);
        return Unit.a;
    }
}

