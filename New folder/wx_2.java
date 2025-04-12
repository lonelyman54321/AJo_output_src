/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from wX
 */
public abstract class wx_2
extends ux_2 {
    public wx_2(KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "element");
        super(kSerializer);
    }

    public final Iterator c(Object object) {
        object = (Collection)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object.iterator();
    }

    public final int d(Object object) {
        object = (Collection)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object.size();
    }
}

