/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NF0
 */
public final class nf0_1
implements Function1 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tr1_0 d;

    public /* synthetic */ nf0_1(Function2 function2, Subcomponent subcomponent, int n3, tr1_0 tr1_02) {
        this.a = function2;
        this.b = subcomponent;
        this.c = n3;
        this.d = tr1_02;
    }

    public final Object invoke(Object object) {
        object = (Integer)object;
        int n3 = (Integer)object;
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onThemeExpandClick");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$expandedItem$delegate");
        Object object2 = (Number)tr1_02.getValue();
        int n4 = ((Number)object2).intValue();
        if (n4 == n3) {
            n3 = -1;
        } else {
            object2 = this.b;
            if (object2 == null || (object2 = ((Subcomponent)object2).getHeading()) == null) {
                object2 = "";
            }
            int n7 = this.c;
            Integer n8 = n7;
            function2.invoke(object2, n8);
        }
        object = n3;
        tr1_02.setValue(object);
        return Unit.a;
    }
}

