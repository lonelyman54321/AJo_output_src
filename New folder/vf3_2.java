/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vf3
 */
public final class vf3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ wf3 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public vf3_2(wf3 wf32, LP1 lP1, Function2 function2, int n3) {
        this.c = wf32;
        this.d = lP1;
        this.e = function2;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        Function2 function2 = this.e;
        wf3 wf32 = this.c;
        LP1 lP1 = this.d;
        tf3.b(wf32, lP1, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

