/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from lh
 */
public final class lh_0
extends Lambda
implements Function0 {
    public final /* synthetic */ oq0_0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ jq0 e;
    public final /* synthetic */ bp1_0 f;

    public lh_0(oq0_0 oq0_02, Function0 function0, jq0 jq02, bp1_0 bp1_02) {
        this.c = oq0_02;
        this.d = function0;
        this.e = jq02;
        this.f = bp1_02;
        super(0);
    }

    public final Object invoke() {
        oq0_0 oq0_02 = this.c;
        Function0 function0 = this.d;
        jq0 jq02 = this.e;
        bp1_0 bp1_02 = this.f;
        oq0_02.c(function0, jq02, bp1_02);
        return Unit.a;
    }
}

