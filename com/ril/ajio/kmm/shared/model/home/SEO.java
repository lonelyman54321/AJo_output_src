/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.SEO$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class SEO {
    public static final SEO$Companion Companion;
    private String pageUrl;

    static {
        SEO$Companion sEO$Companion;
        Companion = sEO$Companion = new SEO$Companion(null);
    }

    public SEO() {
        this(null, 1, null);
    }

    public /* synthetic */ SEO(int n3, String string2, a03_0 a03_02) {
        if ((n3 &= 1) == 0) {
            n3 = 0;
            this.pageUrl = null;
        } else {
            this.pageUrl = string2;
        }
    }

    public SEO(String string2) {
        this.pageUrl = string2;
    }

    public /* synthetic */ SEO(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ SEO copy$default(SEO sEO, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = sEO.pageUrl;
        }
        return sEO.copy(string2);
    }

    public static final /* synthetic */ void write$Self$shared_release(SEO object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((SEO)object).pageUrl) != null) {
            object2 = pe3_2.a;
            object = ((SEO)object).pageUrl;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, object);
        }
    }

    public final String component1() {
        return this.pageUrl;
    }

    public final SEO copy(String string2) {
        SEO sEO = new SEO(string2);
        return sEO;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SEO;
        if (!bl3) {
            return false;
        }
        object = (SEO)object;
        String string2 = this.pageUrl;
        object = ((SEO)object).pageUrl;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public int hashCode() {
        int n3;
        String string2 = this.pageUrl;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public final void setPageUrl(String string2) {
        this.pageUrl = string2;
    }

    public String toString() {
        String string2 = this.pageUrl;
        return cP.a("SEO(pageUrl=", string2, ")");
    }
}

