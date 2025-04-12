/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from f83
 */
public final class f83_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public f83_0(u10 u102, int n3) {
        this.c = u102;
        this.d = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        g83.e((u10)this.c, (b30_0)object, n3);
        return Unit.a;
    }
}

