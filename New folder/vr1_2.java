/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Vr1
 */
public final class vr1_2
extends Lambda
implements Function2 {
    public final /* synthetic */ wr1_0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;

    public vr1_2(wr1_0 wr1_02, Object object, int n3, Object object2, int n4) {
        this.c = wr1_02;
        this.d = object;
        this.e = n3;
        this.f = object2;
        this.g = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        int n4 = this.e;
        Object object4 = this.f;
        wr1_0 wr1_02 = this.c;
        Object object5 = this.d;
        en3.a(wr1_02, object5, n4, object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

