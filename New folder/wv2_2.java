/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.kmm.shared.util.CommonFlow;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wV2
 */
public final class wv2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ vv2_2 a;

    public wv2_2(vv2_2 vv2_22, f80_0 f80_02) {
        this.a = vv2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        vv2_2 vv2_22 = this.a;
        object = new wv2_2(vv2_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (wv2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wv2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((vv2_2)object).u;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
            object2 = null;
        }
        object2 = ((x9_0)object2).l;
        nc0_2 nc0_22 = new nc0_2((Fragment)object, 2);
        ((CommonFlow)object2).watch(nc0_22);
        return Unit.a;
    }
}

