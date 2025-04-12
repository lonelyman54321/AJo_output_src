/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.search.data;

import com.ril.ajio.search.data.AjioConfig;
import com.ril.ajio.search.data.LuxeConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SearchConfig {
    public static final int $stable;
    private final AjioConfig ajioConfig;
    private final LuxeConfig luxeConfig;
    private final Boolean masterFlag;

    public SearchConfig() {
        this(null, null, null, 7, null);
    }

    public SearchConfig(AjioConfig ajioConfig, LuxeConfig luxeConfig, Boolean bl2) {
        this.ajioConfig = ajioConfig;
        this.luxeConfig = luxeConfig;
        this.masterFlag = bl2;
    }

    public /* synthetic */ SearchConfig(AjioConfig ajioConfig, LuxeConfig luxeConfig, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            ajioConfig = null;
        }
        if ((n4 = n3 & 2) != 0) {
            luxeConfig = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = null;
        }
        this(ajioConfig, luxeConfig, bl2);
    }

    public static /* synthetic */ SearchConfig copy$default(SearchConfig searchConfig, AjioConfig ajioConfig, LuxeConfig luxeConfig, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            ajioConfig = searchConfig.ajioConfig;
        }
        if ((n4 = n3 & 2) != 0) {
            luxeConfig = searchConfig.luxeConfig;
        }
        if ((n3 &= 4) != 0) {
            bl2 = searchConfig.masterFlag;
        }
        return searchConfig.copy(ajioConfig, luxeConfig, bl2);
    }

    public final AjioConfig component1() {
        return this.ajioConfig;
    }

    public final LuxeConfig component2() {
        return this.luxeConfig;
    }

    public final Boolean component3() {
        return this.masterFlag;
    }

    public final SearchConfig copy(AjioConfig ajioConfig, LuxeConfig luxeConfig, Boolean bl2) {
        SearchConfig searchConfig = new SearchConfig(ajioConfig, luxeConfig, bl2);
        return searchConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SearchConfig;
        if (!bl3) {
            return false;
        }
        object = (SearchConfig)object;
        Object object2 = this.ajioConfig;
        Object object3 = ((SearchConfig)object).ajioConfig;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.luxeConfig;
        object3 = ((SearchConfig)object).luxeConfig;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.masterFlag;
        object = ((SearchConfig)object).masterFlag;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final AjioConfig getAjioConfig() {
        return this.ajioConfig;
    }

    public final LuxeConfig getLuxeConfig() {
        return this.luxeConfig;
    }

    public final Boolean getMasterFlag() {
        return this.masterFlag;
    }

    public int hashCode() {
        int n3;
        int n4;
        AjioConfig ajioConfig = this.ajioConfig;
        int n7 = 0;
        if (ajioConfig == null) {
            n4 = 0;
            ajioConfig = null;
        } else {
            n4 = ajioConfig.hashCode();
        }
        n4 *= 31;
        Object object = this.luxeConfig;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((LuxeConfig)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.masterFlag;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        AjioConfig ajioConfig = this.ajioConfig;
        LuxeConfig luxeConfig = this.luxeConfig;
        Boolean bl2 = this.masterFlag;
        StringBuilder stringBuilder = new StringBuilder("SearchConfig(ajioConfig=");
        stringBuilder.append(ajioConfig);
        stringBuilder.append(", luxeConfig=");
        stringBuilder.append(luxeConfig);
        stringBuilder.append(", masterFlag=");
        return nx3_0.a(stringBuilder, bl2, ")");
    }
}

