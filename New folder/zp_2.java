/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zp
 */
public final class zp_2
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (CharSequence)object;
        int n3 = (Integer)object2;
        Intrinsics.checkNotNullParameter(object, "s");
        return Character.valueOf(object.charAt(n3));
    }
}

