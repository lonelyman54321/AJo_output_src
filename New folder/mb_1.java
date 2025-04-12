/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mB
 */
public final class mb_1
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mb_1(ac_1 ac_12, Component component, boolean bl2) {
        this.a = ac_12;
        this.b = component;
        this.c = bl2;
    }

    public final Object invoke() {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onFollowClick");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$component");
        Object object2 = ((Component)object).getSubcomponents();
        object2 = object2 != null ? (Subcomponent)CollectionsKt.firstOrNull((List)object2) : null;
        object = this.c;
        function2.invoke(object2, object);
        return Unit.a;
    }
}

