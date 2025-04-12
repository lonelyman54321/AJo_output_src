/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.FacetValue;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class bv2$c
implements Comparator {
    public final /* synthetic */ List a;

    public bv2$c(List list) {
        this.a = list;
    }

    public final int compare(Object object, Object object2) {
        object = ((FacetValue)object).getCode();
        List list = this.a;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(list, string2);
        object = list.indexOf(object);
        object2 = ((FacetValue)object2).getCode();
        Intrinsics.checkNotNullParameter(list, string2);
        object2 = list.indexOf(object2);
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

