/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RQ
 */
public final class rq_1 {
    public CCItemDetailsQAModel$CCItemQALists a;
    public String b;
    public String c;
    public String d;
    public boolean e;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof rq_1;
        if (!bl3) {
            return false;
        }
        object = (rq_1)object;
        Object object2 = this.a;
        Object object3 = ((rq_1)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((rq_1)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((rq_1)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((rq_1)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.e;
        boolean bl4 = ((rq_1)object).e;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.a;
        if (cCItemDetailsQAModel$CCItemQALists == null) {
            n4 = 0;
            cCItemDetailsQAModel$CCItemQALists = null;
        } else {
            n4 = cCItemDetailsQAModel$CCItemQALists.hashCode();
        }
        n4 *= 31;
        String string2 = this.b;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.c;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.d;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.e ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CcCallMeBackData(qaItem=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", orderId=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", orderStatus=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", productCode=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", isLuxeOrder=");
        boolean bl2 = this.e;
        return Vm.a(")", bl2, stringBuilder);
    }
}

