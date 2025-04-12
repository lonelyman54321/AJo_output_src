/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a70
 */
public final class a70_0 {
    public final LinkedHashSet a;
    public final ArrayList b;

    public a70_0() {
        Collection collection = bm0_2.a;
        Iterable iterable = e70_0.b;
        collection = CollectionsKt.n0(q03_0.h(collection, iterable));
        this.a = collection;
        this.b = collection;
    }

    public final void a(k70_0 k70_02, no1_2 no1_22, Function1 function1) {
        Intrinsics.checkNotNullParameter(k70_02, "contentType");
        Object object = "converter";
        Intrinsics.checkNotNullParameter(no1_22, (String)object);
        String string2 = "configuration";
        Intrinsics.checkNotNullParameter(function1, string2);
        Object object2 = k70$a.a;
        boolean bl2 = k70_02.b((k70_0)object2);
        object2 = bl2 ? tl1_2.a : new b70_0(k70_02);
        Intrinsics.checkNotNullParameter(k70_02, "contentTypeToSend");
        Intrinsics.checkNotNullParameter(no1_22, (String)object);
        Intrinsics.checkNotNullParameter(object2, "contentTypeMatcher");
        Intrinsics.checkNotNullParameter(function1, string2);
        function1.invoke(no1_22);
        object = new a70$a(no1_22, k70_02, (l70_0)object2);
        this.b.add(object);
    }
}

