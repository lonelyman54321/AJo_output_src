/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class eg0 {
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
        Class<eg0> clazz2 = eg0.class;
        bl2 = Intrinsics.areEqual(clazz2, clazz);
        if (!bl2) {
            return false;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate");
        ((eg0)object).getClass();
        return Intrinsics.areEqual(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        eg0$a eg0$a = eg0$a.c;
        CollectionsKt.R(null, ",\n", null, null, eg0$a, 30);
        throw null;
    }
}

