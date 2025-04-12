/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

public final class e80$a
extends e80_0 {
    public final KSerializer a(List list) {
        Intrinsics.checkNotNullParameter(list, "typeArgumentsSerializers");
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof e80$a;
        if (!bl2) return false;
        ((e80$a)object).getClass();
        object = null;
        boolean bl3 = Intrinsics.areEqual(null, null);
        if (!bl3) return false;
        return true;
    }

    public final int hashCode() {
        throw null;
    }
}

