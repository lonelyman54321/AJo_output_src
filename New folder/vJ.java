/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

public final class vJ {
    public final HO0 a;
    public final i23_0 b;
    public final cf3_2 c;
    public final mb3_2 d;
    public final br2_2 e;

    public vJ(es0_2 object, aW object2) {
        cf3_2 cf3_22;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "src");
        Intrinsics.checkNotNullParameter(object2, "scope");
        this.a = object3 = new HO0();
        object3 = he_2.SUSPEND;
        int n3 = 1;
        object3 = k23_0.a(n3, -1 >>> 1, (he_2)((Object)object3));
        this.b = object3;
        qg3_2 qg3_22 = new uj_1(this, null);
        this.c = cf3_22 = new cf3_2((i23_0)object3, (uj_1)qg3_22);
        object3 = l90_0.LAZY;
        super((es0_2)object, this, null);
        object = Ae3.d((i90_0)object2, null, (l90_0)((Object)object3), qg3_22, n3);
        object2 = new tj_0(this);
        ((JobSupport)object).G((Function1)object2);
        this.d = object;
        object = new rj_1(this, null);
        this.e = object2 = new br2_2((Function2)object);
    }
}

