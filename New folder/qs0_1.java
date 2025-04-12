/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qs0
 */
public final class qs0_1 {
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof qs0_1;
        if (!bl3) {
            return false;
        }
        ((qs0_1)object).getClass();
        boolean bl4 = false;
        object = null;
        bl3 = Intrinsics.areEqual(null, null);
        if (!bl3) {
            return false;
        }
        bl4 = Intrinsics.areEqual(null, null);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "DownloadTriggerForUrls(urls=null, callback=null)";
    }
}

