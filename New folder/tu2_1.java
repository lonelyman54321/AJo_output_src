/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tu2
 */
public final class tu2_1
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (FacetValue)object;
        object2 = (FacetValue)object2;
        object = ((FacetValue)object).getName();
        Intrinsics.checkNotNull(object);
        object = ((String)object).toLowerCase();
        String string2 = "toLowerCase(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object2 = ((FacetValue)object2).getName();
        Intrinsics.checkNotNull(object2);
        object2 = ((String)object2).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        return ((String)object).compareTo((String)object2);
    }
}

