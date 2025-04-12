/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.PayNowResponse;
import kotlin.jvm.internal.Intrinsics;

public final class au3 {
    public final PayNowResponse a;
    public final String b;

    public au3() {
        this(null, null);
    }

    public au3(PayNowResponse payNowResponse, String string2) {
        this.a = payNowResponse;
        this.b = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof au3;
        if (!bl3) {
            return false;
        }
        object = (au3)object;
        PayNowResponse payNowResponse = this.a;
        Object object2 = ((au3)object).a;
        bl3 = Intrinsics.areEqual(payNowResponse, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((au3)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        PayNowResponse payNowResponse = this.a;
        if (payNowResponse == null) {
            n3 = 0;
            payNowResponse = null;
        } else {
            n3 = payNowResponse.hashCode();
        }
        n3 *= 31;
        String string2 = this.b;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UPITransactionData(payNowResp=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", upiText=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

