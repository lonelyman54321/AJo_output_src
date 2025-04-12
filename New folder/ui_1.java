/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ui
 */
public final class ui_1
extends Lambda
implements Function2 {
    public final /* synthetic */ k72 c;
    public final /* synthetic */ Nc d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public ui_1(k72 k722, Nc nc, u10 u102, int n3) {
        this.c = k722;
        this.d = nc;
        this.e = u102;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        k72 k722 = this.c;
        u10 u102 = (u10)this.e;
        Nc nc = this.d;
        bj_0.a(k722, nc, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

