/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kd
 */
public final class kd_2
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ ft1_2 b;

    public /* synthetic */ kd_2(dr0_0 dr0_02, ft1_2 ft1_22) {
        this.a = dr0_02;
        this.b = ft1_22;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        void var4_10;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.b;
        String string2 = "$lazyColumnState";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = (Boolean)((dr0_0)object).j.getValue();
        boolean n4 = (Boolean)object;
        if (n4) {
            void var4_7;
            object = (Js1)CollectionsKt.T(((ft1_2)object2).j().i());
            if (object != null) {
                int n3 = object.getIndex();
            } else {
                int n7 = -9;
            }
            object2 = ((ft1_2)object2).j();
            int n8 = object2.g() + -4;
            if (var4_7 >= n8) {
                return (boolean)var4_10;
            }
        }
        boolean bl2 = false;
        return (boolean)var4_10;
    }
}

