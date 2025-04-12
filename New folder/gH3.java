/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class gH3 {
    public final List a;

    public gH3(List list) {
        Intrinsics.checkNotNullParameter(list, "displayFeatures");
        this.a = list;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<gH3> clazz;
        boolean bl2;
        if (this == object) {
            return true;
        }
        if (object != null && (bl2 = Intrinsics.areEqual(clazz = gH3.class, object2 = object.getClass()))) {
            object = (gH3)object;
            object2 = this.a;
            object = ((gH3)object).a;
            return Intrinsics.areEqual(object2, object);
        }
        return false;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final String toString() {
        List list = this.a;
        return CollectionsKt.R(list, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}

