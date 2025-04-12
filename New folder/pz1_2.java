/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.entity.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pZ1
 */
public final class pz1_2
implements Function1 {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ pz1_2(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        String string2;
        Object object2;
        bz1_2 bz1_22;
        block7: {
            block9: {
                boolean bl2;
                block8: {
                    object = (Component)object;
                    bz1_22 = this.a;
                    Intrinsics.checkNotNullParameter(bz1_22, "this$0");
                    Object object3 = bz1_22.J;
                    object2 = null;
                    string2 = "banerRootViewItem";
                    if (object3 != null || object == null) break block7;
                    object3 = ((Component)object).getBanners();
                    if (object3 == null) break block8;
                    bl2 = object3.isEmpty();
                    boolean bl3 = true;
                    if ((bl2 ^= bl3) == bl3) break block9;
                }
                if (!(bl2 = ((Component)object).isDynamicAdsFlowEnabled())) break block7;
            }
            bz1_22.J = object;
            object = bz1_22.H;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            boolean bl4 = false;
            object = null;
            object2.setVisibility(0);
            bz1_22.cb();
            return Unit.a;
        }
        if ((object = bz1_22.H) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        int n3 = 8;
        object2.setVisibility(n3);
        return Unit.a;
    }
}

