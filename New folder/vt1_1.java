/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.i;
import androidx.navigation.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vT1
 */
public final class vt1_1
extends Lambda
implements Function1 {
    public static final vt1_1 c;

    static {
        vt1_1 vt1_12;
        c = vt1_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (i)object;
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object instanceof j;
        i i3 = null;
        if (n3 != 0) {
            object = (j)object;
            n3 = ((j)object).l;
            i3 = ((j)object).f(n3, (i)object, null, false);
        }
        return i3;
    }
}

