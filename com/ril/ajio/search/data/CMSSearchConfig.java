/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.search.data;

import com.ril.ajio.search.data.SearchConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CMSSearchConfig {
    public static final int $stable;
    private final Boolean autoSuggestionNewUIEnabled;
    private final Boolean autoSuggetionAPIFlag;
    private final Boolean clearBtnEnabled;
    private final String pageUrlAjio;
    private final String pageUrlLuxe;
    private final Integer recentSearchMaxLimit;
    private final Boolean recentSearchNewUIEnabled;
    private final Boolean searchBtnEnabled;
    private final SearchConfig searchConfig;
    private final Integer search_wishlist_max_limit;

    public CMSSearchConfig() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public CMSSearchConfig(Boolean bl2, Boolean bl3, Boolean bl4, Integer n3, Boolean bl5, Boolean bl6, SearchConfig searchConfig, String string2, String string3, Integer n4) {
        this.autoSuggestionNewUIEnabled = bl2;
        this.autoSuggetionAPIFlag = bl3;
        this.clearBtnEnabled = bl4;
        this.recentSearchMaxLimit = n3;
        this.recentSearchNewUIEnabled = bl5;
        this.searchBtnEnabled = bl6;
        this.searchConfig = searchConfig;
        this.pageUrlLuxe = string2;
        this.pageUrlAjio = string3;
        this.search_wishlist_max_limit = n4;
    }

    public /* synthetic */ CMSSearchConfig(Boolean object, Boolean bl2, Boolean bl3, Integer constable, Boolean comparable, Boolean bl4, SearchConfig object2, String object3, String string2, Integer object4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string3;
        String string4;
        SearchConfig searchConfig;
        Boolean bl5;
        Boolean bl6;
        Integer n4;
        Boolean bl7;
        Boolean bl8;
        Boolean bl9;
        int n7 = n3;
        int n8 = n3 & 1;
        Integer n10 = null;
        if (n8 != 0) {
            n8 = 0;
            bl9 = null;
        } else {
            bl9 = object;
        }
        int n14 = n7 & 2;
        if (n14 != 0) {
            n14 = 0;
            bl8 = null;
        } else {
            bl8 = bl2;
        }
        int n15 = n7 & 4;
        if (n15 != 0) {
            n15 = 0;
            bl7 = null;
        } else {
            bl7 = bl3;
        }
        int n16 = n7 & 8;
        if (n16 != 0) {
            n16 = 0;
            n4 = null;
        } else {
            n4 = constable;
        }
        int n17 = n7 & 0x10;
        if (n17 != 0) {
            n17 = 0;
            bl6 = null;
        } else {
            bl6 = comparable;
        }
        int n18 = n7 & 0x20;
        if (n18 != 0) {
            n18 = 0;
            bl5 = null;
        } else {
            bl5 = bl4;
        }
        int n19 = n7 & 0x40;
        if (n19 != 0) {
            n19 = 0;
            searchConfig = null;
        } else {
            searchConfig = object2;
        }
        int n20 = n7 & 0x80;
        if (n20 != 0) {
            n20 = 0;
            string4 = null;
        } else {
            string4 = object3;
        }
        int n21 = n7 & 0x100;
        if (n21 != 0) {
            n21 = 0;
            string3 = null;
        } else {
            string3 = string2;
        }
        if ((n7 &= 0x200) == 0) {
            n10 = object4;
        }
        object = this;
        bl2 = bl9;
        bl3 = bl8;
        constable = bl7;
        comparable = n4;
        bl4 = bl6;
        object2 = bl5;
        object3 = searchConfig;
        string2 = string4;
        object4 = string3;
        this(bl9, bl8, bl7, n4, bl6, bl5, searchConfig, string4, string3, n10);
    }

    public static /* synthetic */ CMSSearchConfig copy$default(CMSSearchConfig cMSSearchConfig, Boolean bl2, Boolean bl3, Boolean bl4, Integer n3, Boolean bl5, Boolean bl6, SearchConfig searchConfig, String string2, String string3, Integer n4, int n7, Object object) {
        CMSSearchConfig cMSSearchConfig2 = cMSSearchConfig;
        int n8 = n7;
        int n10 = n7 & 1;
        Boolean bl7 = n10 != 0 ? cMSSearchConfig.autoSuggestionNewUIEnabled : bl2;
        int n14 = n8 & 2;
        Boolean bl8 = n14 != 0 ? cMSSearchConfig2.autoSuggetionAPIFlag : bl3;
        int n15 = n8 & 4;
        Boolean bl9 = n15 != 0 ? cMSSearchConfig2.clearBtnEnabled : bl4;
        int n16 = n8 & 8;
        Integer n17 = n16 != 0 ? cMSSearchConfig2.recentSearchMaxLimit : n3;
        int n18 = n8 & 0x10;
        Boolean bl10 = n18 != 0 ? cMSSearchConfig2.recentSearchNewUIEnabled : bl5;
        int n19 = n8 & 0x20;
        Boolean bl11 = n19 != 0 ? cMSSearchConfig2.searchBtnEnabled : bl6;
        int n20 = n8 & 0x40;
        SearchConfig searchConfig2 = n20 != 0 ? cMSSearchConfig2.searchConfig : searchConfig;
        int n21 = n8 & 0x80;
        String string4 = n21 != 0 ? cMSSearchConfig2.pageUrlLuxe : string2;
        int n22 = n8 & 0x100;
        String string5 = n22 != 0 ? cMSSearchConfig2.pageUrlAjio : string3;
        Integer n24 = (n8 &= 0x200) != 0 ? cMSSearchConfig2.search_wishlist_max_limit : n4;
        bl2 = bl7;
        bl3 = bl8;
        bl4 = bl9;
        n3 = n17;
        bl5 = bl10;
        bl6 = bl11;
        searchConfig = searchConfig2;
        string2 = string4;
        string3 = string5;
        n4 = n24;
        return cMSSearchConfig.copy(bl7, bl8, bl9, n17, bl10, bl11, searchConfig2, string4, string5, n24);
    }

    public final Boolean component1() {
        return this.autoSuggestionNewUIEnabled;
    }

    public final Integer component10() {
        return this.search_wishlist_max_limit;
    }

    public final Boolean component2() {
        return this.autoSuggetionAPIFlag;
    }

    public final Boolean component3() {
        return this.clearBtnEnabled;
    }

    public final Integer component4() {
        return this.recentSearchMaxLimit;
    }

    public final Boolean component5() {
        return this.recentSearchNewUIEnabled;
    }

    public final Boolean component6() {
        return this.searchBtnEnabled;
    }

    public final SearchConfig component7() {
        return this.searchConfig;
    }

    public final String component8() {
        return this.pageUrlLuxe;
    }

    public final String component9() {
        return this.pageUrlAjio;
    }

    public final CMSSearchConfig copy(Boolean bl2, Boolean bl3, Boolean bl4, Integer n3, Boolean bl5, Boolean bl6, SearchConfig searchConfig, String string2, String string3, Integer n4) {
        CMSSearchConfig cMSSearchConfig = new CMSSearchConfig(bl2, bl3, bl4, n3, bl5, bl6, searchConfig, string2, string3, n4);
        return cMSSearchConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CMSSearchConfig;
        if (!bl3) {
            return false;
        }
        object = (CMSSearchConfig)object;
        Object object2 = this.autoSuggestionNewUIEnabled;
        Object object3 = ((CMSSearchConfig)object).autoSuggestionNewUIEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.autoSuggetionAPIFlag;
        object3 = ((CMSSearchConfig)object).autoSuggetionAPIFlag;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clearBtnEnabled;
        object3 = ((CMSSearchConfig)object).clearBtnEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.recentSearchMaxLimit;
        object3 = ((CMSSearchConfig)object).recentSearchMaxLimit;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.recentSearchNewUIEnabled;
        object3 = ((CMSSearchConfig)object).recentSearchNewUIEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.searchBtnEnabled;
        object3 = ((CMSSearchConfig)object).searchBtnEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.searchConfig;
        object3 = ((CMSSearchConfig)object).searchConfig;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageUrlLuxe;
        object3 = ((CMSSearchConfig)object).pageUrlLuxe;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageUrlAjio;
        object3 = ((CMSSearchConfig)object).pageUrlAjio;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.search_wishlist_max_limit;
        object = ((CMSSearchConfig)object).search_wishlist_max_limit;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getAutoSuggestionNewUIEnabled() {
        return this.autoSuggestionNewUIEnabled;
    }

    public final Boolean getAutoSuggetionAPIFlag() {
        return this.autoSuggetionAPIFlag;
    }

    public final Boolean getClearBtnEnabled() {
        return this.clearBtnEnabled;
    }

    public final String getPageUrlAjio() {
        return this.pageUrlAjio;
    }

    public final String getPageUrlLuxe() {
        return this.pageUrlLuxe;
    }

    public final Integer getRecentSearchMaxLimit() {
        return this.recentSearchMaxLimit;
    }

    public final Boolean getRecentSearchNewUIEnabled() {
        return this.recentSearchNewUIEnabled;
    }

    public final Boolean getSearchBtnEnabled() {
        return this.searchBtnEnabled;
    }

    public final SearchConfig getSearchConfig() {
        return this.searchConfig;
    }

    public final Integer getSearch_wishlist_max_limit() {
        return this.search_wishlist_max_limit;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.autoSuggestionNewUIEnabled;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.autoSuggetionAPIFlag;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clearBtnEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.recentSearchMaxLimit;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.recentSearchNewUIEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.searchBtnEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.searchConfig;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((SearchConfig)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageUrlLuxe;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageUrlAjio;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.search_wishlist_max_limit;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.autoSuggestionNewUIEnabled;
        Boolean bl3 = this.autoSuggetionAPIFlag;
        Boolean bl4 = this.clearBtnEnabled;
        Integer n3 = this.recentSearchMaxLimit;
        Boolean bl5 = this.recentSearchNewUIEnabled;
        Boolean bl6 = this.searchBtnEnabled;
        SearchConfig searchConfig = this.searchConfig;
        String string2 = this.pageUrlLuxe;
        String string3 = this.pageUrlAjio;
        Integer n4 = this.search_wishlist_max_limit;
        StringBuilder stringBuilder = new StringBuilder("CMSSearchConfig(autoSuggestionNewUIEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", autoSuggetionAPIFlag=");
        stringBuilder.append(bl3);
        stringBuilder.append(", clearBtnEnabled=");
        stringBuilder.append(bl4);
        stringBuilder.append(", recentSearchMaxLimit=");
        stringBuilder.append(n3);
        stringBuilder.append(", recentSearchNewUIEnabled=");
        stringBuilder.append(bl5);
        stringBuilder.append(", searchBtnEnabled=");
        stringBuilder.append(bl6);
        stringBuilder.append(", searchConfig=");
        stringBuilder.append(searchConfig);
        stringBuilder.append(", pageUrlLuxe=");
        stringBuilder.append(string2);
        stringBuilder.append(", pageUrlAjio=");
        stringBuilder.append(string3);
        stringBuilder.append(", search_wishlist_max_limit=");
        stringBuilder.append(n4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

