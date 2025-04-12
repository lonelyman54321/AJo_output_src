/*
 * Decompiled with CFR 0.152.
 */
import java.util.SortedMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SF0
 */
public final class sf0_2
implements Function2 {
    public final /* synthetic */ SortedMap a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ sf0_2(SortedMap sortedMap, boolean bl2, of0_2 of0_22, int n3) {
        this.a = sortedMap;
        this.b = bl2;
        this.c = of0_22;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$brandsMap");
        Function1 function1 = this.c;
        Intrinsics.checkNotNullParameter(function1, "$brandClick");
        int n3 = Me3.b(this.d | 1);
        boolean bl2 = this.b;
        function1 = (of0_2)function1;
        iG0.c((SortedMap)object2, bl2, (of0_2)function1, (b30_0)object, n3);
        return Unit.a;
    }
}

