/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AB
 */
public final class ab_0
implements Function2 {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ List b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ ab_0(Boolean bl2, List list, dr0_0 dr0_02, jd_1 jd_12, kd_1 kd_12, ld_1 ld_12, int n3) {
        this.a = bl2;
        this.b = list;
        this.c = dr0_02;
        this.d = jd_12;
        this.e = kd_12;
        this.f = ld_12;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$onShareClick");
        object2 = this.e;
        Intrinsics.checkNotNullParameter(object2, "$onBackClick");
        Object object4 = this.f;
        Intrinsics.checkNotNullParameter(object4, "$onSearchClick");
        int n3 = Me3.b(this.g | 1);
        Object object5 = object;
        object5 = (jd_1)object;
        Object object6 = object2;
        object6 = (kd_1)object2;
        Function0 function0 = object4;
        function0 = (ld_1)object4;
        object4 = this.a;
        List list = this.b;
        bb_0.a((Boolean)object4, list, dr0_02, (jd_1)object5, (kd_1)object6, (ld_1)function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

