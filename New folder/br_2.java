/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bR
 */
public final class br_2 {
    public ArrayList a;
    public ArrayList b;
    public String c;

    public br_2() {
        throw null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof br_2;
        if (!bl3) {
            return false;
        }
        object = (br_2)object;
        ArrayList arrayList = this.a;
        Object object2 = ((br_2)object).a;
        bl3 = Intrinsics.areEqual(arrayList, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        arrayList = ((br_2)object).b;
        bl3 = Intrinsics.areEqual(object2, arrayList);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object = ((br_2)object).c;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CcOrderTrackingData(orderTracking=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", returnOrderTracking=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", shipmentId=");
        object = this.c;
        return h30_0.a(stringBuilder, (String)object, ")");
    }
}

