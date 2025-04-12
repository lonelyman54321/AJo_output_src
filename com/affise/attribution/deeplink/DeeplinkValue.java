/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.deeplink;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class DeeplinkValue {
    private final String deeplink;
    private final String host;
    private final Map parameters;
    private final String path;
    private final String scheme;

    public DeeplinkValue(String string2, String string3, String string4, String string5, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "deeplink");
        Intrinsics.checkNotNullParameter(map2, "parameters");
        this.deeplink = string2;
        this.scheme = string3;
        this.host = string4;
        this.path = string5;
        this.parameters = map2;
    }

    public static /* synthetic */ DeeplinkValue copy$default(DeeplinkValue deeplinkValue, String string2, String object, String string3, String object2, Map object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = deeplinkValue.deeplink;
        }
        if ((n4 = n3 & 2) != 0) {
            object = deeplinkValue.scheme;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = deeplinkValue.host;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = deeplinkValue.path;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = deeplinkValue.parameters;
        }
        Map map2 = object3;
        object = deeplinkValue;
        string3 = string2;
        object2 = object4;
        object3 = string4;
        object4 = map2;
        return deeplinkValue.copy(string2, (String)object2, string4, string5, map2);
    }

    public final String component1() {
        return this.deeplink;
    }

    public final String component2() {
        return this.scheme;
    }

    public final String component3() {
        return this.host;
    }

    public final String component4() {
        return this.path;
    }

    public final Map component5() {
        return this.parameters;
    }

    public final DeeplinkValue copy(String string2, String string3, String string4, String string5, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "deeplink");
        Intrinsics.checkNotNullParameter(map2, "parameters");
        DeeplinkValue deeplinkValue = new DeeplinkValue(string2, string3, string4, string5, map2);
        return deeplinkValue;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DeeplinkValue;
        if (!bl3) {
            return false;
        }
        object = (DeeplinkValue)object;
        Object object2 = this.deeplink;
        String string2 = ((DeeplinkValue)object).deeplink;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.scheme;
        string2 = ((DeeplinkValue)object).scheme;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.host;
        string2 = ((DeeplinkValue)object).host;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.path;
        string2 = ((DeeplinkValue)object).path;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.parameters;
        object = ((DeeplinkValue)object).parameters;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getHost() {
        return this.host;
    }

    public final Map getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        int n3;
        String string2 = this.deeplink;
        int n4 = string2.hashCode() * 31;
        String string3 = this.scheme;
        int n7 = 0;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.host;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.path;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        n4 = (n4 + n7) * 31;
        return ((Object)this.parameters).hashCode() + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeeplinkValue(deeplink=");
        Object object = this.deeplink;
        stringBuilder.append((String)object);
        stringBuilder.append(", scheme=");
        object = this.scheme;
        stringBuilder.append((String)object);
        stringBuilder.append(", host=");
        object = this.host;
        stringBuilder.append((String)object);
        stringBuilder.append(", path=");
        object = this.path;
        stringBuilder.append((String)object);
        stringBuilder.append(", parameters=");
        object = this.parameters;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

