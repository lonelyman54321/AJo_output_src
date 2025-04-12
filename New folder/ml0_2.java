/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import kotlin.time.b;
import kotlinx.coroutines.d;

/*
 * Renamed from ML0
 */
public final class ml0_2 {
    public final ol0_1 a;
    public final yc1_2 b;
    public final long c;
    public final ArrayList d;
    public final ll0_2 e;
    public final c80 f;

    public ml0_2(ol0_1 object, yc1_2 yc1_22) {
        ke0_0 ke0_02;
        il0_1 il0_12 = new il0_1();
        aw0_1 aw0_12 = aw0_1.MINUTES;
        long l2 = kotlin.time.a.c(kotlin.time.b.f(5, aw0_12));
        Intrinsics.checkNotNullParameter(object, "fileResourceProvider");
        Intrinsics.checkNotNullParameter(ke0_02, "dispatchers");
        Intrinsics.checkNotNullParameter(il0_12, "config");
        this.a = object;
        this.b = yc1_22;
        this.c = l2;
        object = new ArrayList();
        this.d = object;
        this.e = object = new ll0_2(this);
        object = ir0_2.a;
        em0_2.b.getClass();
        this.f = object = kotlinx.coroutines.d.a(ew3_0.b.M0(4, null));
    }

    public final void a(ArrayList object, bm0_1 bm0_12, zl0_1 object2, am0_1 object3, Function1 function1) {
        Intrinsics.checkNotNullParameter(object, "urlMetas");
        Intrinsics.checkNotNullParameter(bm0_12, "successBlock");
        Intrinsics.checkNotNullParameter(object2, "failureBlock");
        Intrinsics.checkNotNullParameter(object3, "startedBlock");
        Intrinsics.checkNotNullParameter(function1, "preloadFinished");
        kl0_2 kl0_22 = new kl0_2(this);
        jl0_2 jl0_22 = new jl0_2((ArrayList)object, this, function1, (am0_1)object3, kl0_22, bm0_12, (zl0_1)object2, null);
        object2 = this.f;
        object3 = this.e;
        object = Ae3.d((i90_0)object2, (CoroutineContext)object3, null, jl0_22, 2);
        this.d.add(object);
    }
}

