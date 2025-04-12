/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import com.ril.ajio.services.data.prioritydelivery.PdpCartDelivery;
import com.ril.ajio.services.data.prioritydelivery.PlpDelivery;
import com.ril.ajio.services.data.prioritydelivery.SPCDelivery;
import com.ril.ajio.services.data.prioritydelivery.ThankYouDelivery;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriorityDeliveryP2Config {
    private final boolean isEnabled;
    private final PdpCartDelivery pdpCartDelivery;
    private final PlpDelivery plpDelivery;
    private final SPCDelivery spc;
    private final ThankYouDelivery thankYou;

    public PriorityDeliveryP2Config() {
        this(false, null, null, null, null, 31, null);
    }

    public PriorityDeliveryP2Config(boolean bl2, PlpDelivery plpDelivery, PdpCartDelivery pdpCartDelivery, SPCDelivery sPCDelivery, ThankYouDelivery thankYouDelivery) {
        this.isEnabled = bl2;
        this.plpDelivery = plpDelivery;
        this.pdpCartDelivery = pdpCartDelivery;
        this.spc = sPCDelivery;
        this.thankYou = thankYouDelivery;
    }

    public /* synthetic */ PriorityDeliveryP2Config(boolean bl2, PlpDelivery object, PdpCartDelivery pdpCartDelivery, SPCDelivery object2, ThankYouDelivery object3, int n3, DefaultConstructorMarker object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = false;
        }
        n4 = n3 & 2;
        ThankYouDelivery thankYouDelivery = null;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 4;
        PdpCartDelivery pdpCartDelivery2 = n7 != 0 ? null : pdpCartDelivery;
        n7 = n3 & 8;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 0x10;
        if (n7 == 0) {
            thankYouDelivery = object3;
        }
        object = this;
        object2 = object4;
        object3 = pdpCartDelivery2;
        object4 = thankYouDelivery;
        this(bl2, (PlpDelivery)object2, pdpCartDelivery2, (SPCDelivery)object5, thankYouDelivery);
    }

    public static /* synthetic */ PriorityDeliveryP2Config copy$default(PriorityDeliveryP2Config priorityDeliveryP2Config, boolean bl2, PlpDelivery object, PdpCartDelivery pdpCartDelivery, SPCDelivery object2, ThankYouDelivery object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = priorityDeliveryP2Config.isEnabled;
        }
        if ((n4 = n3 & 2) != 0) {
            object = priorityDeliveryP2Config.plpDelivery;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            pdpCartDelivery = priorityDeliveryP2Config.pdpCartDelivery;
        }
        PdpCartDelivery pdpCartDelivery2 = pdpCartDelivery;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = priorityDeliveryP2Config.spc;
        }
        SPCDelivery sPCDelivery = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = priorityDeliveryP2Config.thankYou;
        }
        ThankYouDelivery thankYouDelivery = object3;
        object = priorityDeliveryP2Config;
        object2 = object4;
        object3 = pdpCartDelivery2;
        object4 = thankYouDelivery;
        return priorityDeliveryP2Config.copy(bl2, (PlpDelivery)object2, pdpCartDelivery2, sPCDelivery, thankYouDelivery);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final PlpDelivery component2() {
        return this.plpDelivery;
    }

    public final PdpCartDelivery component3() {
        return this.pdpCartDelivery;
    }

    public final SPCDelivery component4() {
        return this.spc;
    }

    public final ThankYouDelivery component5() {
        return this.thankYou;
    }

    public final PriorityDeliveryP2Config copy(boolean bl2, PlpDelivery plpDelivery, PdpCartDelivery pdpCartDelivery, SPCDelivery sPCDelivery, ThankYouDelivery thankYouDelivery) {
        PriorityDeliveryP2Config priorityDeliveryP2Config = new PriorityDeliveryP2Config(bl2, plpDelivery, pdpCartDelivery, sPCDelivery, thankYouDelivery);
        return priorityDeliveryP2Config;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriorityDeliveryP2Config;
        if (!bl3) {
            return false;
        }
        object = (PriorityDeliveryP2Config)object;
        bl3 = this.isEnabled;
        boolean bl4 = ((PriorityDeliveryP2Config)object).isEnabled;
        if (bl3 != bl4) {
            return false;
        }
        Object object2 = this.plpDelivery;
        Object object3 = ((PriorityDeliveryP2Config)object).plpDelivery;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdpCartDelivery;
        object3 = ((PriorityDeliveryP2Config)object).pdpCartDelivery;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.spc;
        object3 = ((PriorityDeliveryP2Config)object).spc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.thankYou;
        object = ((PriorityDeliveryP2Config)object).thankYou;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final PdpCartDelivery getPdpCartDelivery() {
        return this.pdpCartDelivery;
    }

    public final PlpDelivery getPlpDelivery() {
        return this.plpDelivery;
    }

    public final SPCDelivery getSpc() {
        return this.spc;
    }

    public final ThankYouDelivery getThankYou() {
        return this.thankYou;
    }

    public int hashCode() {
        int n3;
        int n4 = this.isEnabled;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        Object object = this.plpDelivery;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PlpDelivery)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdpCartDelivery;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PdpCartDelivery)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.spc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((SPCDelivery)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.thankYou;
        if (object != null) {
            n7 = ((ThankYouDelivery)object).hashCode();
        }
        return n4 + n7;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean bl2 = this.isEnabled;
        PlpDelivery plpDelivery = this.plpDelivery;
        PdpCartDelivery pdpCartDelivery = this.pdpCartDelivery;
        SPCDelivery sPCDelivery = this.spc;
        ThankYouDelivery thankYouDelivery = this.thankYou;
        StringBuilder stringBuilder = new StringBuilder("PriorityDeliveryP2Config(isEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", plpDelivery=");
        stringBuilder.append(plpDelivery);
        stringBuilder.append(", pdpCartDelivery=");
        stringBuilder.append(pdpCartDelivery);
        stringBuilder.append(", spc=");
        stringBuilder.append(sPCDelivery);
        stringBuilder.append(", thankYou=");
        stringBuilder.append(thankYouDelivery);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

