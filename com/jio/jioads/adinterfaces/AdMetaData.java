/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import kotlin.jvm.internal.Intrinsics;

public final class AdMetaData {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final AdMetaData$AdParams e;

    public AdMetaData(String string2, String string3, String string4, String string5, AdMetaData$AdParams adMetaData$AdParams) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = adMetaData$AdParams;
    }

    public static /* synthetic */ AdMetaData copy$default(AdMetaData adMetaData, String string2, String object, String string3, String object2, AdMetaData$AdParams object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = adMetaData.a;
        }
        if ((n4 = n3 & 2) != 0) {
            object = adMetaData.b;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = adMetaData.c;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = adMetaData.d;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = adMetaData.e;
        }
        AdMetaData$AdParams adMetaData$AdParams = object3;
        object = adMetaData;
        string3 = string2;
        object2 = object4;
        object3 = string4;
        object4 = adMetaData$AdParams;
        return adMetaData.copy(string2, (String)object2, string4, string5, adMetaData$AdParams);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final AdMetaData$AdParams component5() {
        return this.e;
    }

    public final AdMetaData copy(String string2, String string3, String string4, String string5, AdMetaData$AdParams adMetaData$AdParams) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        AdMetaData adMetaData = new AdMetaData(string2, string3, string4, string5, adMetaData$AdParams);
        return adMetaData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AdMetaData;
        if (!bl3) {
            return false;
        }
        object = (AdMetaData)object;
        Object object2 = this.a;
        String string2 = ((AdMetaData)object).a;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        string2 = ((AdMetaData)object).b;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        string2 = ((AdMetaData)object).c;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        string2 = ((AdMetaData)object).d;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object = ((AdMetaData)object).e;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAdDescription() {
        return this.d;
    }

    public final String getAdId() {
        return this.a;
    }

    public final AdMetaData$AdParams getAdParams() {
        return this.e;
    }

    public final String getAdSystem() {
        return this.c;
    }

    public final String getAdTitle() {
        return this.b;
    }

    public int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        Object object = this.b;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object != null) {
            n7 = ((AdMetaData$AdParams)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdMetaData(adId=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", adTitle=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adSystem=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", adDescription=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", adParams=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

