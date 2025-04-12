/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EP
 */
public final class ep_1
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ ResourceOwner b;
    public final /* synthetic */ Component c;
    public final /* synthetic */ String d;

    public /* synthetic */ ep_1(Function1 function1, ResourceOwner resourceOwner, Component component, String string2) {
        this.a = function1;
        this.b = resourceOwner;
        this.c = component;
        this.d = string2;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$brandClick");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$brand");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$component");
        object.invoke(object2);
        object = pp0_0.a;
        object = ((Component)object3).getHeading();
        object = cP.a("category menu - ", (String)object, " brand click");
        object2 = ((ResourceOwner)object2).getName();
        object3 = new StringBuilder();
        String string2 = this.d;
        object2 = BW0.b((StringBuilder)object3, string2, " | ", (String)object2);
        Intrinsics.checkNotNullParameter(object, "action");
        Intrinsics.checkNotNullParameter(object2, "label");
        object3 = new ip0_2((String)object, (String)object2, null);
        Ae3.d(pp0_0.b, null, null, (Function2)object3, 3);
        return Unit.a;
    }
}

