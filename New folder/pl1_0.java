/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from pL1
 */
public final class pl1_0
extends Lambda
implements Function2 {
    public final /* synthetic */ nl1_0 c;
    public final /* synthetic */ KA d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    public pl1_0(nl1_0 nl1_02, float f5, int n3) {
        this.c = nl1_02;
        this.e = f5;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        float f5 = this.e;
        this.c.d(f5, (b30_0)object, n3);
        return Unit.a;
    }
}

