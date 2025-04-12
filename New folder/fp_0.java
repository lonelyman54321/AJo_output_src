/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FP
 */
public final class fp_0
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ ResourceOwner b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ fp_0(Component component, ResourceOwner resourceOwner, String string2, Function1 function1, int n3) {
        this.a = component;
        this.b = resourceOwner;
        this.c = string2;
        this.d = function1;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        ResourceOwner resourceOwner = this.b;
        Intrinsics.checkNotNullParameter(resourceOwner, "$brand");
        Function1 function1 = this.d;
        Intrinsics.checkNotNullParameter(function1, "$brandClick");
        int n3 = Me3.b(this.e | 1);
        String string2 = this.c;
        np_0.c(component, resourceOwner, string2, function1, (b30_0)object3, n3);
        return Unit.a;
    }
}

