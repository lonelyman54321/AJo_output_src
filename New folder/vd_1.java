/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vD
 */
public final class vd_1
implements Function0 {
    public final /* synthetic */ ft1_2 a;

    public /* synthetic */ vd_1(ft1_2 ft1_22) {
        this.a = ft1_22;
    }

    public final Object invoke() {
        Object object = this.a;
        String string2 = "$lazyRowState";
        Intrinsics.checkNotNullParameter(object, string2);
        object = (Js1)CollectionsKt.T(((ft1_2)object).j().i());
        if (object != null) {
            int n3 = object.getIndex();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }
}

