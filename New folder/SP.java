/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class SP
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (FacetValue)object;
        int n3 = ((FacetValue)object2).getCount();
        int n4 = ((FacetValue)object).getCount();
        return Intrinsics.compare(n3, n4);
    }
}

