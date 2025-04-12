/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.os.Bundle;

public final class a {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public a(Integer n3, Integer n4, Integer n7, Integer n8) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
    }

    public static a a(Bundle object) {
        a a2;
        if (object == null) {
            a2 = null;
            object = new Bundle(0);
        }
        Integer n3 = (Integer)object.get("android.support.customtabs.extra.TOOLBAR_COLOR");
        Integer n4 = (Integer)object.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR");
        Integer n7 = (Integer)object.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR");
        object = (Integer)object.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR");
        a2 = new a(n3, n4, n7, (Integer)object);
        return a2;
    }
}

