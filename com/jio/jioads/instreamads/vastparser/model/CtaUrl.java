/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CtaUrl {
    public String a;
    public String b;
    public List c;

    public CtaUrl() {
        this(null, null, null, 7, null);
    }

    public CtaUrl(String string2, String string3, List list) {
        this.a = string2;
        this.b = string3;
        this.c = list;
    }

    public /* synthetic */ CtaUrl(String string2, String string3, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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

    public static /* synthetic */ CtaUrl copy$default(CtaUrl ctaUrl, String string2, String string3, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = ctaUrl.a;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = ctaUrl.b;
        }
        if ((n3 &= 4) != 0) {
            list = ctaUrl.c;
        }
        return ctaUrl.copy(string2, string3, list);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final List component3() {
        return this.c;
    }

    public final CtaUrl copy(String string2, String string3, List list) {
        CtaUrl ctaUrl = new CtaUrl(string2, string3, list);
        return ctaUrl;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CtaUrl;
        if (!bl3) {
            return false;
        }
        object = (CtaUrl)object;
        Object object2 = this.a;
        String string2 = ((CtaUrl)object).a;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        string2 = ((CtaUrl)object).b;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object = ((CtaUrl)object).c;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getClickTrackers() {
        return this.c;
    }

    public final String getDeeplink() {
        return this.a;
    }

    public final String getFallback() {
        return this.b;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setClickTrackers(List list) {
        this.c = list;
    }

    public final void setDeeplink(String string2) {
        this.a = string2;
    }

    public final void setFallback(String string2) {
        this.b = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CtaUrl(deeplink=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", fallback=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", clickTrackers=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

