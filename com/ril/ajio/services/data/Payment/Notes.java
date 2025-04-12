/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Notes {
    private final Boolean SEND_WALLETS_IN_DISPLAY_PRIORITY;
    private final Boolean STORED_CARD_NOTE_ENABLED;
    private final String STORED_CARD_NOTE_HEADING;
    private final String STORED_CARD_NOTE_MESSAGE;

    public Notes() {
        this(null, null, null, null, 15, null);
    }

    public Notes(Boolean bl2, Boolean bl3, String string2, String string3) {
        this.SEND_WALLETS_IN_DISPLAY_PRIORITY = bl2;
        this.STORED_CARD_NOTE_ENABLED = bl3;
        this.STORED_CARD_NOTE_HEADING = string2;
        this.STORED_CARD_NOTE_MESSAGE = string3;
    }

    public /* synthetic */ Notes(Boolean bl2, Boolean bl3, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = null;
        }
        if ((n3 &= 8) != 0) {
            string3 = null;
        }
        this(bl2, bl3, string2, string3);
    }

    public static /* synthetic */ Notes copy$default(Notes notes, Boolean bl2, Boolean bl3, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = notes.SEND_WALLETS_IN_DISPLAY_PRIORITY;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = notes.STORED_CARD_NOTE_ENABLED;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = notes.STORED_CARD_NOTE_HEADING;
        }
        if ((n3 &= 8) != 0) {
            string3 = notes.STORED_CARD_NOTE_MESSAGE;
        }
        return notes.copy(bl2, bl3, string2, string3);
    }

    public final Boolean component1() {
        return this.SEND_WALLETS_IN_DISPLAY_PRIORITY;
    }

    public final Boolean component2() {
        return this.STORED_CARD_NOTE_ENABLED;
    }

    public final String component3() {
        return this.STORED_CARD_NOTE_HEADING;
    }

    public final String component4() {
        return this.STORED_CARD_NOTE_MESSAGE;
    }

    public final Notes copy(Boolean bl2, Boolean bl3, String string2, String string3) {
        Notes notes = new Notes(bl2, bl3, string2, string3);
        return notes;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Notes;
        if (!bl3) {
            return false;
        }
        object = (Notes)object;
        Object object2 = this.SEND_WALLETS_IN_DISPLAY_PRIORITY;
        Object object3 = ((Notes)object).SEND_WALLETS_IN_DISPLAY_PRIORITY;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.STORED_CARD_NOTE_ENABLED;
        object3 = ((Notes)object).STORED_CARD_NOTE_ENABLED;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.STORED_CARD_NOTE_HEADING;
        object3 = ((Notes)object).STORED_CARD_NOTE_HEADING;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.STORED_CARD_NOTE_MESSAGE;
        object = ((Notes)object).STORED_CARD_NOTE_MESSAGE;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getSEND_WALLETS_IN_DISPLAY_PRIORITY() {
        return this.SEND_WALLETS_IN_DISPLAY_PRIORITY;
    }

    public final Boolean getSTORED_CARD_NOTE_ENABLED() {
        return this.STORED_CARD_NOTE_ENABLED;
    }

    public final String getSTORED_CARD_NOTE_HEADING() {
        return this.STORED_CARD_NOTE_HEADING;
    }

    public final String getSTORED_CARD_NOTE_MESSAGE() {
        return this.STORED_CARD_NOTE_MESSAGE;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.SEND_WALLETS_IN_DISPLAY_PRIORITY;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.STORED_CARD_NOTE_ENABLED;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.STORED_CARD_NOTE_HEADING;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.STORED_CARD_NOTE_MESSAGE;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.SEND_WALLETS_IN_DISPLAY_PRIORITY;
        Boolean bl3 = this.STORED_CARD_NOTE_ENABLED;
        String string2 = this.STORED_CARD_NOTE_HEADING;
        String string3 = this.STORED_CARD_NOTE_MESSAGE;
        StringBuilder stringBuilder = new StringBuilder("Notes(SEND_WALLETS_IN_DISPLAY_PRIORITY=");
        stringBuilder.append(bl2);
        stringBuilder.append(", STORED_CARD_NOTE_ENABLED=");
        stringBuilder.append(bl3);
        stringBuilder.append(", STORED_CARD_NOTE_HEADING=");
        return ko_0.a(stringBuilder, string2, ", STORED_CARD_NOTE_MESSAGE=", string3, ")");
    }
}

