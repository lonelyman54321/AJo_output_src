/*
 * Decompiled with CFR 0.152.
 */
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rf1
 */
public final class rf1_1 {
    public final String a;
    public final double b;
    public final Currency c;

    public rf1_1(String string2, double d2, Currency currency) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.a = string2;
        this.b = d2;
        this.c = currency;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof rf1_1;
        if (n3 == 0) {
            return false;
        }
        object = (rf1_1)object;
        String string2 = this.a;
        Object object2 = ((rf1_1)object).a;
        n3 = Intrinsics.areEqual(string2, object2);
        if (n3 == 0) {
            return false;
        }
        double d2 = this.b;
        double d5 = ((rf1_1)object).b;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        object2 = this.c;
        object = ((rf1_1)object).c;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        long l2 = Double.doubleToLongBits(this.b);
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        n3 = (n3 + n4) * 31;
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InAppPurchase(eventName=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", amount=");
        double d2 = this.b;
        stringBuilder.append(d2);
        stringBuilder.append(", currency=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

