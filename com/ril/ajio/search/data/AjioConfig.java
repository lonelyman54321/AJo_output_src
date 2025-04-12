/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.search.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AjioConfig {
    public static final int $stable;
    private final Boolean masterFlag;
    private final String pageUrl;
    private final Integer searchPageVersion;
    private final boolean trendingCategoryEnabled;
    private final Integer trendingCategoryVersion;

    public AjioConfig() {
        this(null, null, null, null, false, 31, null);
    }

    public AjioConfig(Boolean bl2, String string2, Integer n3, Integer n4, boolean bl3) {
        this.masterFlag = bl2;
        this.pageUrl = string2;
        this.trendingCategoryVersion = n3;
        this.searchPageVersion = n4;
        this.trendingCategoryEnabled = bl3;
    }

    public /* synthetic */ AjioConfig(Boolean object, String object2, Integer object3, Integer n3, boolean bl2, int n4, DefaultConstructorMarker object4) {
        int n7 = n4 & 1;
        Integer n8 = null;
        if (n7 != 0) {
            n7 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n10 = n4 & 2;
        Object object5 = n10 != 0 ? null : object2;
        n10 = n4 & 4;
        Object object6 = n10 != 0 ? null : object3;
        n10 = n4 & 8;
        if (n10 == 0) {
            n8 = n3;
        }
        n10 = n4 & 0x10;
        if (n10 != 0) {
            bl2 = false;
            n4 = 0;
        } else {
            n4 = (int)(bl2 ? 1 : 0);
        }
        object = this;
        object2 = object4;
        object3 = object5;
        n3 = object6;
        this((Boolean)object4, (String)object5, (Integer)object6, n8, n4 != 0);
    }

    public static /* synthetic */ AjioConfig copy$default(AjioConfig ajioConfig, Boolean bl2, String object, Integer constable, Integer object2, boolean bl3, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = ajioConfig.masterFlag;
        }
        if ((n4 = n3 & 2) != 0) {
            object = ajioConfig.pageUrl;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            constable = ajioConfig.trendingCategoryVersion;
        }
        Integer n8 = constable;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = ajioConfig.searchPageVersion;
        }
        Integer n10 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl3 = ajioConfig.trendingCategoryEnabled;
        }
        object = ajioConfig;
        constable = bl2;
        object2 = object3;
        n4 = (int)(bl3 ? 1 : 0);
        return ajioConfig.copy(bl2, (String)object3, n8, n10, bl3);
    }

    public final Boolean component1() {
        return this.masterFlag;
    }

    public final String component2() {
        return this.pageUrl;
    }

    public final Integer component3() {
        return this.trendingCategoryVersion;
    }

    public final Integer component4() {
        return this.searchPageVersion;
    }

    public final boolean component5() {
        return this.trendingCategoryEnabled;
    }

    public final AjioConfig copy(Boolean bl2, String string2, Integer n3, Integer n4, boolean bl3) {
        AjioConfig ajioConfig = new AjioConfig(bl2, string2, n3, n4, bl3);
        return ajioConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AjioConfig;
        if (!bl3) {
            return false;
        }
        object = (AjioConfig)object;
        Object object2 = this.masterFlag;
        Object object3 = ((AjioConfig)object).masterFlag;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageUrl;
        object3 = ((AjioConfig)object).pageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.trendingCategoryVersion;
        object3 = ((AjioConfig)object).trendingCategoryVersion;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.searchPageVersion;
        object3 = ((AjioConfig)object).searchPageVersion;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.trendingCategoryEnabled;
        boolean bl4 = ((AjioConfig)object).trendingCategoryEnabled;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getMasterFlag() {
        return this.masterFlag;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final Integer getSearchPageVersion() {
        return this.searchPageVersion;
    }

    public final boolean getTrendingCategoryEnabled() {
        return this.trendingCategoryEnabled;
    }

    public final Integer getTrendingCategoryVersion() {
        return this.trendingCategoryVersion;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.masterFlag;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.pageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.trendingCategoryVersion;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.searchPageVersion;
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.trendingCategoryEnabled ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.masterFlag;
        String string2 = this.pageUrl;
        Integer n3 = this.trendingCategoryVersion;
        Integer n4 = this.searchPageVersion;
        boolean bl3 = this.trendingCategoryEnabled;
        StringBuilder stringBuilder = new StringBuilder("AjioConfig(masterFlag=");
        stringBuilder.append(bl2);
        stringBuilder.append(", pageUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", trendingCategoryVersion=");
        stringBuilder.append(n3);
        stringBuilder.append(", searchPageVersion=");
        stringBuilder.append(n4);
        stringBuilder.append(", trendingCategoryEnabled=");
        return Vm.a(")", bl3, stringBuilder);
    }
}

