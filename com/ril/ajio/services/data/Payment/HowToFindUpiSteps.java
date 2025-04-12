/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HowToFindUpiSteps {
    private String appName;
    private String iconURL;
    private List steps;

    public HowToFindUpiSteps() {
        this(null, null, null, 7, null);
    }

    public HowToFindUpiSteps(String string2, String string3, List list) {
        this.appName = string2;
        this.iconURL = string3;
        this.steps = list;
    }

    public /* synthetic */ HowToFindUpiSteps(String string2, String string3, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            list = null;
        }
        this(string2, string3, list);
    }

    public static /* synthetic */ HowToFindUpiSteps copy$default(HowToFindUpiSteps howToFindUpiSteps, String string2, String string3, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = howToFindUpiSteps.appName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = howToFindUpiSteps.iconURL;
        }
        if ((n3 &= 4) != 0) {
            list = howToFindUpiSteps.steps;
        }
        return howToFindUpiSteps.copy(string2, string3, list);
    }

    public final String component1() {
        return this.appName;
    }

    public final String component2() {
        return this.iconURL;
    }

    public final List component3() {
        return this.steps;
    }

    public final HowToFindUpiSteps copy(String string2, String string3, List list) {
        HowToFindUpiSteps howToFindUpiSteps = new HowToFindUpiSteps(string2, string3, list);
        return howToFindUpiSteps;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HowToFindUpiSteps;
        if (!bl3) {
            return false;
        }
        object = (HowToFindUpiSteps)object;
        Object object2 = this.appName;
        String string2 = ((HowToFindUpiSteps)object).appName;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.iconURL;
        string2 = ((HowToFindUpiSteps)object).iconURL;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.steps;
        object = ((HowToFindUpiSteps)object).steps;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final List getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.appName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.iconURL;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.steps;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setAppName(String string2) {
        this.appName = string2;
    }

    public final void setIconURL(String string2) {
        this.iconURL = string2;
    }

    public final void setSteps(List list) {
        this.steps = list;
    }

    public String toString() {
        CharSequence charSequence = this.appName;
        String string2 = this.iconURL;
        List list = this.steps;
        charSequence = og_1.a("HowToFindUpiSteps(appName=", (String)charSequence, ", iconURL=", string2, ", steps=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

