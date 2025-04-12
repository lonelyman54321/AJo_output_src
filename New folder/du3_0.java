/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Du3
 */
public final class du3_0
implements Function0 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ float b;

    public /* synthetic */ du3_0(ft1_2 ft1_22) {
        this.a = ft1_22;
        this.b = 50.0f;
    }

    public final Object invoke() {
        Iterator iterator = this.a;
        Intrinsics.checkNotNullParameter(iterator, "$lazyListState");
        float f5 = this.b;
        iterator = x20_0.g((ft1_2)((Object)iterator), f5);
        int n3 = yx_2.o((Iterable)((Object)iterator), 10);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n3);
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            n3 = ((Js1)iterator.next()).getIndex();
            Integer n4 = n3;
            arrayList.add(n4);
        }
        return arrayList;
    }
}

