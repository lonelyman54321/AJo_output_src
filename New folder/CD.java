/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CD
implements Function0 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ CD(ArrayList arrayList, int n3, xj0_0 xj0_02) {
        this.a = arrayList;
        this.b = n3;
        this.c = xj0_02;
    }

    public final Object invoke() {
        boolean bl2;
        int n3;
        Object object;
        Function2 function2 = this.c;
        Intrinsics.checkNotNullParameter(function2, "$sendImpression");
        Object object2 = this.a;
        if (object2 != null && (object = (Subcomponent)CollectionsKt.N(n3 = this.b, (List)object2)) != null && !(bl2 = ((Subcomponent)object).isGaFiredInCurrentSession())) {
            object = (Subcomponent)CollectionsKt.N(n3, (List)object2);
            if (object != null) {
                boolean bl3 = true;
                ((Subcomponent)object).setGaFiredInCurrentSession(bl3);
            }
            object = n3;
            object2 = CollectionsKt.N(n3, (List)object2);
            function2.invoke(object, object2);
        }
        return Unit.a;
    }
}

