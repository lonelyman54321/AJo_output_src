/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OJ0
 */
public final class oj0_0
implements Function0 {
    public final /* synthetic */ ft1_2 a;

    public /* synthetic */ oj0_0(ft1_2 ft1_22) {
        this.a = ft1_22;
    }

    public final Object invoke() {
        Iterator iterator = this.a;
        Intrinsics.checkNotNullParameter(iterator, "$listState");
        iterator = ((ft1_2)((Object)iterator)).j().i();
        int n3 = yx_2.o((Iterable)((Object)iterator), 10);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            n3 = ((Js1)iterator.next()).getIndex();
            Integer n4 = n3;
            arrayList.add(n4);
        }
        return arrayList;
    }
}

