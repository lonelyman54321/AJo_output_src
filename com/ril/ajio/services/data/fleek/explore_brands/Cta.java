/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.services.data.fleek.explore_brands.Style;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Cta {
    private String redirectionUrl;
    private Style style;
    private String text;

    public Cta() {
        this(null, null, null, 7, null);
    }

    public Cta(String string2, Style style2, String string3) {
        this.redirectionUrl = string2;
        this.style = style2;
        this.text = string3;
    }

    public /* synthetic */ Cta(String string2, Style style2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            style2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(string2, style2, string3);
    }

    public static /* synthetic */ Cta copy$default(Cta cta, String string2, Style style2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cta.redirectionUrl;
        }
        if ((n4 = n3 & 2) != 0) {
            style2 = cta.style;
        }
        if ((n3 &= 4) != 0) {
            string3 = cta.text;
        }
        return cta.copy(string2, style2, string3);
    }

    public final String component1() {
        return this.redirectionUrl;
    }

    public final Style component2() {
        return this.style;
    }

    public final String component3() {
        return this.text;
    }

    public final Cta copy(String string2, Style style2, String string3) {
        Cta cta = new Cta(string2, style2, string3);
        return cta;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Cta;
        if (!bl3) {
            return false;
        }
        object = (Cta)object;
        Object object2 = this.redirectionUrl;
        Object object3 = ((Cta)object).redirectionUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.style;
        object3 = ((Cta)object).style;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.text;
        object = ((Cta)object).text;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.redirectionUrl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.style;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Style)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.text;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setRedirectionUrl(String string2) {
        this.redirectionUrl = string2;
    }

    public final void setStyle(Style style2) {
        this.style = style2;
    }

    public final void setText(String string2) {
        this.text = string2;
    }

    public String toString() {
        String string2 = this.redirectionUrl;
        Style style2 = this.style;
        String string3 = this.text;
        StringBuilder stringBuilder = new StringBuilder("Cta(redirectionUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", style=");
        stringBuilder.append(style2);
        stringBuilder.append(", text=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

