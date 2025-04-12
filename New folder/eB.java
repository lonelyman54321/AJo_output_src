/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.FacetValue;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class eB
implements Comparator {
    public final int compare(Object object, Object object2) {
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

