/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from XZ2
 */
public abstract class xz2_1 {
    public final int hashCode() {
        return this.toString().hashCode();
    }

    public final String toString() {
        String string2 = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}

