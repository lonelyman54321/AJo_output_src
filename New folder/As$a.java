/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class As$a
implements fs0_2 {
    public final /* synthetic */ tr1_0 a;

    public As$a(tr1_0 tr1_02) {
        this.a = tr1_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (Component)object;
        object2 = this.a;
        Component component = (Component)object2.getValue();
        boolean bl2 = Intrinsics.areEqual(component, object);
        if (!bl2) {
            object2.setValue(object);
        }
        return Unit.a;
    }
}

