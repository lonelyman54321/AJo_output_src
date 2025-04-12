/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UA
 */
public final class ua_0
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ua_0(Component component, gc_2 gc_22, int n3) {
        this.a = component;
        this.b = gc_22;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$item");
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        int n3 = Me3.b(this.c | 1);
        function1 = (gc_2)function1;
        va_0.a((Component)object2, (gc_2)function1, (b30_0)object, n3);
        return Unit.a;
    }
}

