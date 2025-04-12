/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from FA0
 */
public final class fa0_2
extends hv2_2 {
    public final XZ2$b l;
    public final hh3_2 m;

    public fa0_2(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "name");
        super((String)object, null, n3);
        Object object2 = XZ2$b.a;
        this.l = object2;
        object2 = new ea0_2(n3, (String)object, this);
        this.m = object = yr1_2.b((Function0)object2);
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        boolean bl3 = object instanceof SerialDescriptor;
        if (!bl3) {
            return false;
        }
        Object object3 = (object = (SerialDescriptor)object).getKind();
        if (object3 != (object2 = XZ2$b.a)) {
            return false;
        }
        object2 = this.a;
        object3 = object.h();
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = kt2_2.a(this);
        boolean bl4 = Intrinsics.areEqual(object3, object = kt2_2.a((SerialDescriptor)object));
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final SerialDescriptor g(int n3) {
        return ((SerialDescriptor[])this.m.getValue())[n3];
    }

    public final xz2_1 getKind() {
        return this.l;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        rz2_2 rz2_22 = new rz2_2(this);
        int n7 = 1;
        while ((n3 = rz2_22.hasNext()) != 0) {
            Object object = rz2_22.next();
            n7 *= 31;
            if ((object = (String)object) != null) {
                n3 = object.hashCode();
            } else {
                n3 = 0;
                object = null;
            }
            n7 += n3;
        }
        return n4 * 31 + n7;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        sz2_2 sz2_22 = new sz2_2(this);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        String string3 = ui0_1.a(stringBuilder, string2, '(');
        return CollectionsKt.R(sz2_22, ", ", string3, ")", null, 56);
    }
}

