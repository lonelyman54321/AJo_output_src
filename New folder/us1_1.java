/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from us1
 */
public final class us1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ws1_0 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public us1_1(Object object, int n3, ws1_0 ws1_02, u10 u102, int n4) {
        this.c = object;
        this.d = n3;
        this.e = ws1_02;
        this.f = u102;
        this.g = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        int n4 = this.d;
        Object object4 = object = this.f;
        object4 = (u10)object;
        Object object5 = this.c;
        ws1_0 ws1_02 = this.e;
        vs1.b(object5, n4, ws1_02, (u10)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

