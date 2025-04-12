/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c1
 */
public abstract class c1_0
extends g1_0 {
    public abstract boolean c(Map.Entry var1);

    public final boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (!bl2) {
            return false;
        }
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "element");
        return this.c((Map.Entry)object);
    }
}

