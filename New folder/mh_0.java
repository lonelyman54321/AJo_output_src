/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from mh
 */
public final class mh_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ jq0 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public mh_0(Function0 function0, jq0 jq02, u10 u102, int n3) {
        this.c = function0;
        this.d = jq02;
        this.e = u102;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        Function0 function0 = this.c;
        u10 u102 = (u10)this.e;
        jq0 jq02 = this.d;
        th.a(function0, jq02, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

