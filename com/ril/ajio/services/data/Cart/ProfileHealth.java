/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.Extra;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ProfileHealth
implements Serializable {
    private final String action;
    private final ActionContent actionContent;
    private final Extra extra;
    private final String message;
    private final Float returnFee;
    private final Integer returnPercent;
    private final String rule;

    public ProfileHealth(String string2, ActionContent actionContent, Extra extra, String string3, String string4, Integer n3, Float f5) {
        this.action = string2;
        this.actionContent = actionContent;
        this.extra = extra;
        this.message = string3;
        this.rule = string4;
        this.returnPercent = n3;
        this.returnFee = f5;
    }

    public static /* synthetic */ ProfileHealth copy$default(ProfileHealth profileHealth, String string2, ActionContent serializable, Extra object, String object2, String object3, Integer object4, Float object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = profileHealth.action;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = profileHealth.actionContent;
        }
        object6 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object = profileHealth.extra;
        }
        Extra extra = object;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = profileHealth.message;
        }
        String string3 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = profileHealth.rule;
        }
        String string4 = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = profileHealth.returnPercent;
        }
        Integer n8 = object4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object5 = profileHealth.returnFee;
        }
        Float f5 = object5;
        serializable = profileHealth;
        object = string2;
        object2 = object6;
        object3 = extra;
        object4 = string3;
        object5 = string4;
        object6 = f5;
        return profileHealth.copy(string2, (ActionContent)object2, extra, string3, string4, n8, f5);
    }

    public final String component1() {
        return this.action;
    }

    public final ActionContent component2() {
        return this.actionContent;
    }

    public final Extra component3() {
        return this.extra;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.rule;
    }

    public final Integer component6() {
        return this.returnPercent;
    }

    public final Float component7() {
        return this.returnFee;
    }

    public final ProfileHealth copy(String string2, ActionContent actionContent, Extra extra, String string3, String string4, Integer n3, Float f5) {
        ProfileHealth profileHealth = new ProfileHealth(string2, actionContent, extra, string3, string4, n3, f5);
        return profileHealth;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProfileHealth;
        if (!bl3) {
            return false;
        }
        object = (ProfileHealth)object;
        Object object2 = this.action;
        Object object3 = ((ProfileHealth)object).action;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.actionContent;
        object3 = ((ProfileHealth)object).actionContent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extra;
        object3 = ((ProfileHealth)object).extra;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((ProfileHealth)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rule;
        object3 = ((ProfileHealth)object).rule;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnPercent;
        object3 = ((ProfileHealth)object).returnPercent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnFee;
        object = ((ProfileHealth)object).returnFee;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAction() {
        return this.action;
    }

    public final ActionContent getActionContent() {
        return this.actionContent;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Float getReturnFee() {
        return this.returnFee;
    }

    public final Integer getReturnPercent() {
        return this.returnPercent;
    }

    public final String getRule() {
        return this.rule;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.action;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.actionContent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ActionContent)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extra;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Extra)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rule;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnPercent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnFee;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.action;
        ActionContent actionContent = this.actionContent;
        Extra extra = this.extra;
        String string3 = this.message;
        String string4 = this.rule;
        Integer n3 = this.returnPercent;
        Float f5 = this.returnFee;
        StringBuilder stringBuilder = new StringBuilder("ProfileHealth(action=");
        stringBuilder.append(string2);
        stringBuilder.append(", actionContent=");
        stringBuilder.append(actionContent);
        stringBuilder.append(", extra=");
        stringBuilder.append(extra);
        stringBuilder.append(", message=");
        stringBuilder.append(string3);
        stringBuilder.append(", rule=");
        stringBuilder.append(string4);
        stringBuilder.append(", returnPercent=");
        stringBuilder.append(n3);
        stringBuilder.append(", returnFee=");
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

