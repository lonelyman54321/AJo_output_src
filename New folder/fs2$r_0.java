/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$r
 */
public final class fs2$r_0
extends Lambda
implements Function1 {
    public static final fs2$r_0 c;

    static {
        fs2$r_0 fs2$r_0;
        c = fs2$r_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        object = (List)object;
        int n3 = object.size();
        ArrayList<hw1> arrayList = new ArrayList<hw1>(n3);
        n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object.get(i3);
            Object object3 = FS2.u;
            Boolean bl2 = Boolean.FALSE;
            boolean bl3 = Intrinsics.areEqual(object2, bl2);
            hw1 hw12 = null;
            if (!bl3 && object2 != null) {
                object3 = ((ds2_0)object3).b;
                object2 = object3.invoke(object2);
                hw12 = (hw1)object2;
                hw12 = (hw1)object2;
            }
            Intrinsics.checkNotNull(hw12);
            arrayList.add(hw12);
        }
        object = new iw1(arrayList);
        return object;
    }
}

