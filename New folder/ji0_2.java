/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.LuxeDetails;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jI0
 */
public final class ji0_2
implements Serializable {
    public LuxeDetails a;
    public String b;
    public int c;
    public String d;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ji0_2;
        if (n3 == 0) {
            return false;
        }
        object = (ji0_2)object;
        Object object2 = this.a;
        Object object3 = ((ji0_2)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((ji0_2)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((ji0_2)object).c;
        if (n3 != n4) {
            return false;
        }
        object3 = this.d;
        object = ((ji0_2)object).d;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        LuxeDetails luxeDetails = this.a;
        if (luxeDetails == null) {
            n3 = 0;
            luxeDetails = null;
        } else {
            n3 = luxeDetails.hashCode();
        }
        n3 *= 31;
        String string2 = this.b;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        return this.d.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FBEventData(luxeDetails=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", productCodeList=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", numItems=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", netPayable=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

