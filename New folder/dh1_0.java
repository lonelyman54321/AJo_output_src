/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dh1
 */
public final class dh1_0 {
    public static final Object a(Object arrayList, Object object) {
        if (arrayList == null) {
            arrayList = object;
        } else {
            boolean bl2 = arrayList instanceof ArrayList;
            if (bl2) {
                Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList<Object> arrayList2 = arrayList;
                arrayList2 = arrayList;
                arrayList2.add(object);
            } else {
                int n3 = 4;
                ArrayList<Object> arrayList3 = new ArrayList<Object>(n3);
                arrayList3.add(arrayList);
                arrayList3.add(object);
                arrayList = arrayList3;
            }
        }
        return arrayList;
    }
}

