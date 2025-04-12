/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Tenant
implements Serializable {
    private String callbackUrl;
    private String code;
    private String description;
    private String imageURL;
    private String name;
    private String s2sCallbackUrl;

    public Tenant() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Tenant(String string2, String string3, String string4, String string5, String string6, String string7) {
        this.code = string2;
        this.name = string3;
        this.description = string4;
        this.imageURL = string5;
        this.callbackUrl = string6;
        this.s2sCallbackUrl = string7;
    }

    public /* synthetic */ Tenant(String object, String object2, String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker object3) {
        String string6;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string7 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string8 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        String string9 = n7 != 0 ? null : string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        this((String)object3, (String)object4, string7, string8, string9, string6);
    }

    public static /* synthetic */ Tenant copy$default(Tenant tenant, String string2, String object, String string3, String object2, String string4, String string5, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = tenant.code;
        }
        if ((n4 = n3 & 2) != 0) {
            object = tenant.name;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = tenant.description;
        }
        String string6 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = tenant.imageURL;
        }
        String string7 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = tenant.callbackUrl;
        }
        String string8 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string5 = tenant.s2sCallbackUrl;
        }
        String string9 = string5;
        object = tenant;
        string3 = string2;
        object2 = object3;
        string4 = string6;
        string5 = string7;
        object3 = string9;
        return tenant.copy(string2, (String)object2, string6, string7, string8, string9);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.imageURL;
    }

    public final String component5() {
        return this.callbackUrl;
    }

    public final String component6() {
        return this.s2sCallbackUrl;
    }

    public final Tenant copy(String string2, String string3, String string4, String string5, String string6, String string7) {
        Tenant tenant = new Tenant(string2, string3, string4, string5, string6, string7);
        return tenant;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Tenant;
        if (!bl3) {
            return false;
        }
        object = (Tenant)object;
        String string2 = this.code;
        String string3 = ((Tenant)object).code;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.name;
        string3 = ((Tenant)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.description;
        string3 = ((Tenant)object).description;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageURL;
        string3 = ((Tenant)object).imageURL;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.callbackUrl;
        string3 = ((Tenant)object).callbackUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.s2sCallbackUrl;
        object = ((Tenant)object).s2sCallbackUrl;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getName() {
        return this.name;
    }

    public final String getS2sCallbackUrl() {
        return this.s2sCallbackUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.code;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.name;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.description;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.imageURL;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.callbackUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.s2sCallbackUrl;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setCallbackUrl(String string2) {
        this.callbackUrl = string2;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setImageURL(String string2) {
        this.imageURL = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setS2sCallbackUrl(String string2) {
        this.s2sCallbackUrl = string2;
    }

    public String toString() {
        CharSequence charSequence = this.code;
        String string2 = this.name;
        String string3 = this.description;
        String string4 = this.imageURL;
        String string5 = this.callbackUrl;
        String string6 = this.s2sCallbackUrl;
        charSequence = og_1.a("Tenant(code=", charSequence, ", name=", string2, ", description=");
        X50.a((StringBuilder)charSequence, string3, ", imageURL=", string4, ", callbackUrl=");
        return ko_0.a((StringBuilder)charSequence, string5, ", s2sCallbackUrl=", string6, ")");
    }
}

