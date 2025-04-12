/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Jg1
 */
public final class jg1_2
implements Iterable,
KMappedMarker {
    public final Function0 a;

    public jg1_2(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "iteratorFactory");
        this.a = function0;
    }

    public final Iterator iterator() {
        Iterator iterator = (Iterator)this.a.invoke();
        kg1_2 kg1_22 = new kg1_2(iterator);
        return kg1_22;
    }
}

