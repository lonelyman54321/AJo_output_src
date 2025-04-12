/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Config {
    private String ae;
    private String csl;
    private String loc;
    private String ls;
    private String te;

    public Config() {
        this(null, null, null, null, null, 31, null);
    }

    public Config(String string2, String string3, String string4, String string5, String string6) {
        this.csl = string2;
        this.ls = string3;
        this.ae = string4;
        this.te = string5;
        this.loc = string6;
    }

    public /* synthetic */ Config(String object, String object2, String string2, String string3, String string4, int n3, DefaultConstructorMarker object3) {
        String string5;
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
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string6;
        string4 = string7;
        this((String)object3, (String)object4, string6, string7, string5);
    }

    public static /* synthetic */ Config copy$default(Config config, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = config.csl;
        }
        if ((n4 = n3 & 2) != 0) {
            object = config.ls;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = config.ae;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = config.te;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = config.loc;
        }
        String string7 = string4;
        object = config;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return config.copy(string2, (String)object2, string5, string6, string7);
    }

    public final String component1() {
        return this.csl;
    }

    public final String component2() {
        return this.ls;
    }

    public final String component3() {
        return this.ae;
    }

    public final String component4() {
        return this.te;
    }

    public final String component5() {
        return this.loc;
    }

    public final Config copy(String string2, String string3, String string4, String string5, String string6) {
        Config config = new Config(string2, string3, string4, string5, string6);
        return config;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Config;
        if (!bl3) {
            return false;
        }
        object = (Config)object;
        String string2 = this.csl;
        String string3 = ((Config)object).csl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.ls;
        string3 = ((Config)object).ls;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.ae;
        string3 = ((Config)object).ae;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.te;
        string3 = ((Config)object).te;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.loc;
        object = ((Config)object).loc;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAe() {
        return this.ae;
    }

    public final String getCsl() {
        return this.csl;
    }

    public final String getLoc() {
        return this.loc;
    }

    public final String getLs() {
        return this.ls;
    }

    public final String getTe() {
        return this.te;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.csl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.ls;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.ae;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.te;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.loc;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setAe(String string2) {
        this.ae = string2;
    }

    public final void setCsl(String string2) {
        this.csl = string2;
    }

    public final void setLoc(String string2) {
        this.loc = string2;
    }

    public final void setLs(String string2) {
        this.ls = string2;
    }

    public final void setTe(String string2) {
        this.te = string2;
    }

    public String toString() {
        CharSequence charSequence = this.csl;
        String string2 = this.ls;
        String string3 = this.ae;
        String string4 = this.te;
        String string5 = this.loc;
        charSequence = og_1.a("Config(csl=", charSequence, ", ls=", string2, ", ae=");
        X50.a((StringBuilder)charSequence, string3, ", te=", string4, ", loc=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

