/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sv1
 */
public final class sv1_0
extends RU0 {
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof sv1_0;
        if (!bl3) {
            return false;
        }
        ((sv1_0)object).getClass();
        object = null;
        boolean bl4 = Intrinsics.areEqual(null, null);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=null)";
    }
}

