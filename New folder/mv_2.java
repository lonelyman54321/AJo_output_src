/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MV
 */
public final class mv_2 {
    public final da1_2 a;
    public final Object b;
    public final ArrayList c;
    public final nb_0 d;

    public mv_2(xq_2 object, da1_2 da1_22, Object object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(da1_22, "client");
        Intrinsics.checkNotNullParameter(object2, "pluginConfig");
        this.a = da1_22;
        this.b = object2;
        object = new ArrayList();
        this.c = object;
        this.d = object = new nb_0(1);
    }

    public final void a(lv_2 lv_22, qg3_2 qg3_22) {
        Intrinsics.checkNotNullParameter(lv_22, "hook");
        ArrayList arrayList = this.c;
        k91 k912 = new k91(lv_22, qg3_22);
        arrayList.add(k912);
    }
}

