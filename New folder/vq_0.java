/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VQ
 */
public final class vq_0 {
    public String a;
    public CCItemDetailsQAModel$CCItemQALists b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof vq_0;
        if (!bl3) {
            return false;
        }
        object = (vq_0)object;
        Object object2 = this.a;
        Object object3 = ((vq_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((vq_0)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((vq_0)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((vq_0)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((vq_0)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.f;
        boolean bl4 = ((vq_0)object).f;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.f ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CcContactUsData(title=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", qaItem=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", orderId=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", orderStatus=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", productCode=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", isLuxeOrder=");
        boolean bl2 = this.f;
        return Vm.a(")", bl2, stringBuilder);
    }
}

