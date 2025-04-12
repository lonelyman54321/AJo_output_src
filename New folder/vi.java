/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class vi
implements Uv2 {
    public final boolean equals(Object object) {
        boolean bl2;
        Class<?> clazz;
        if (this == object) {
            return true;
        }
        if (object != null) {
            clazz = object.getClass();
        } else {
            bl2 = false;
            clazz = null;
        }
        Class<vi> clazz2 = vi.class;
        bl2 = Intrinsics.areEqual(clazz2, clazz);
        if (!bl2) {
            return false;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        ((vi)object).getClass();
        return Intrinsics.areEqual(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}

