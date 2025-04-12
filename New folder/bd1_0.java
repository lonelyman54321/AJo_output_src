/*
 * Decompiled with CFR 0.152.
 */
import com.fasterxml.jackson.databind.type.TypeBase;

/*
 * Renamed from bd1
 */
public abstract class bd1_0
extends TypeBase {
    private static final long serialVersionUID = 1L;

    public final boolean equals(Object object) {
        boolean bl2;
        if (object == this) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}

