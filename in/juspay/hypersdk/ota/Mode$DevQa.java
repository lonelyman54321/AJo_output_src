/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.Mode;
import kotlin.jvm.internal.Intrinsics;

public final class Mode$DevQa
implements Mode {
    private final String ticket;

    public Mode$DevQa(String string2) {
        Intrinsics.checkNotNullParameter(string2, "ticket");
        this.ticket = string2;
    }

    public static /* synthetic */ Mode$DevQa copy$default(Mode$DevQa mode$DevQa, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = mode$DevQa.ticket;
        }
        return mode$DevQa.copy(string2);
    }

    public final String component1() {
        return this.ticket;
    }

    public final Mode$DevQa copy(String string2) {
        Intrinsics.checkNotNullParameter(string2, "ticket");
        Mode$DevQa mode$DevQa = new Mode$DevQa(string2);
        return mode$DevQa;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Mode$DevQa;
        if (!bl3) {
            return false;
        }
        object = (Mode$DevQa)object;
        String string2 = this.ticket;
        object = ((Mode$DevQa)object).ticket;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        return this.ticket.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DevQa(ticket=");
        String string2 = this.ticket;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

