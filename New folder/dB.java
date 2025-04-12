/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.FacetValue;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class dB
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (FacetValue)object;
        int n3 = ((FacetValue)object2).getCount();
        int n4 = ((FacetValue)object).getCount();
        return Intrinsics.compare(n3, n4);
    }
}

