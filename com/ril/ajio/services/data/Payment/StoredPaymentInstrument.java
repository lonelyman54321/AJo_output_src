/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class StoredPaymentInstrument {
    private Error error;
    private ArrayList storedPaymentInstruments;

    public StoredPaymentInstrument() {
        this(null, null, 3, null);
    }

    public StoredPaymentInstrument(Error error, ArrayList arrayList) {
        this.error = error;
        this.storedPaymentInstruments = arrayList;
    }

    public /* synthetic */ StoredPaymentInstrument(Error error, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            error = null;
        }
        if ((n3 &= 2) != 0) {
            arrayList = null;
        }
        this(error, arrayList);
    }

    public static /* synthetic */ StoredPaymentInstrument copy$default(StoredPaymentInstrument storedPaymentInstrument, Error error, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            error = storedPaymentInstrument.error;
        }
        if ((n3 &= 2) != 0) {
            arrayList = storedPaymentInstrument.storedPaymentInstruments;
        }
        return storedPaymentInstrument.copy(error, arrayList);
    }

    public final Error component1() {
        return this.error;
    }

    public final ArrayList component2() {
        return this.storedPaymentInstruments;
    }

    public final StoredPaymentInstrument copy(Error error, ArrayList arrayList) {
        StoredPaymentInstrument storedPaymentInstrument = new StoredPaymentInstrument(error, arrayList);
        return storedPaymentInstrument;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof StoredPaymentInstrument;
        if (!bl3) {
            return false;
        }
        object = (StoredPaymentInstrument)object;
        Serializable serializable = this.error;
        Error error = ((StoredPaymentInstrument)object).error;
        bl3 = Intrinsics.areEqual(serializable, error);
        if (!bl3) {
            return false;
        }
        serializable = this.storedPaymentInstruments;
        object = ((StoredPaymentInstrument)object).storedPaymentInstruments;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Error getError() {
        return this.error;
    }

    public final ArrayList getStoredPaymentInstruments() {
        return this.storedPaymentInstruments;
    }

    public int hashCode() {
        int n3;
        Error error = this.error;
        int n4 = 0;
        if (error == null) {
            n3 = 0;
            error = null;
        } else {
            n3 = error.hashCode();
        }
        n3 *= 31;
        ArrayList arrayList = this.storedPaymentInstruments;
        if (arrayList != null) {
            n4 = arrayList.hashCode();
        }
        return n3 + n4;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setStoredPaymentInstruments(ArrayList arrayList) {
        this.storedPaymentInstruments = arrayList;
    }

    public String toString() {
        Error error = this.error;
        ArrayList arrayList = this.storedPaymentInstruments;
        StringBuilder stringBuilder = new StringBuilder("StoredPaymentInstrument(error=");
        stringBuilder.append(error);
        stringBuilder.append(", storedPaymentInstruments=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

