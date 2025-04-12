/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.i;
import androidx.navigation.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from YS1
 */
public final class ys1_1
extends Lambda
implements Function1 {
    public static final ys1_1 c;

    static {
        ys1_1 ys1_12;
        c = ys1_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        int n3;
        int n4;
        object = (i)object;
        Intrinsics.checkNotNullParameter(object, "destination");
        j j3 = ((i)object).b;
        if (j3 == null || (n4 = j3.l) != (n3 = ((i)object).g)) {
            j3 = null;
        }
        return j3;
    }
}

