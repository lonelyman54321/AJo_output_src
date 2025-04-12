/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yp
 */
public final class yp_2
implements Function1 {
    public final Object invoke(Object object) {
        object = (CharSequence)object;
        Intrinsics.checkNotNullParameter(object, "it");
        return object.length();
    }
}

