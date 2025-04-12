/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p00
 */
public final class p00_0
implements Comparator {
    public final /* synthetic */ Function1[] a;

    public /* synthetic */ p00_0(Function1[] function1Array) {
        this.a = function1Array;
    }

    public final int compare(Object object, Object object2) {
        Function1[] function1Array = this.a;
        String string2 = "$selectors";
        Intrinsics.checkNotNullParameter(function1Array, string2);
        int n3 = function1Array.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = function1Array[i3];
            Comparable comparable = (Comparable)object3.invoke(object);
            int n7 = q00_0.a(comparable, (Comparable)(object3 = (Comparable)object3.invoke(object2)));
            if (n7 == 0) continue;
            n4 = n7;
            break;
        }
        return n4;
    }
}

