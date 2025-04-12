/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZQ
 */
public final class zq_1 {
    public final CCHelpInterface a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public zq_1(CCHelpInterface cCHelpInterface, String string2, String string3, String string4, String string5, boolean bl2, boolean bl3) {
        this.a = cCHelpInterface;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = bl2;
        this.g = bl3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zq_1;
        if (!bl3) {
            return false;
        }
        object = (zq_1)object;
        Object object2 = this.a;
        Object object3 = ((zq_1)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((zq_1)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((zq_1)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((zq_1)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((zq_1)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.f;
        boolean bl4 = ((zq_1)object).f;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.g;
        boolean bl5 = ((zq_1)object).g;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        CCHelpInterface cCHelpInterface = this.a;
        if (cCHelpInterface == null) {
            n4 = 0;
            cCHelpInterface = null;
        } else {
            n4 = cCHelpInterface.hashCode();
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
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.e;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = 1237;
        n3 = 1231;
        int n8 = this.f;
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = (int)(this.g ? 1 : 0);
        if (n8 != 0) {
            n7 = 1231;
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CcItemHelpData(ccHelpInterface=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", orderStatus=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", productCode=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", orderId=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", incidentId=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", isLuxeOrder=");
        boolean bl2 = this.f;
        stringBuilder.append(bl2);
        stringBuilder.append(", isExpandable=");
        bl2 = this.g;
        return Vm.a(")", bl2, stringBuilder);
    }
}

