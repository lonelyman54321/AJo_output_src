/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.BaseValue$$serializer;
import com.ril.ajio.kmm.shared.model.home.Data$Companion;
import com.ril.ajio.kmm.shared.model.home.Page;
import com.ril.ajio.kmm.shared.model.home.Page$$serializer;
import com.ril.ajio.kmm.shared.model.home.SEO;
import com.ril.ajio.kmm.shared.model.home.SEO$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Data {
    public static final Data$Companion Companion;
    private BaseValue baseValue;
    private Page page;
    private SEO seo;

    static {
        Data$Companion data$Companion;
        Companion = data$Companion = new Data$Companion(null);
    }

    public Data() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ Data(int n3, Page page, BaseValue baseValue, SEO sEO, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.page = n4 == 0 ? null : page;
        int n7 = n3 & 2;
        this.baseValue = n7 == 0 ? null : baseValue;
        this.seo = (n3 &= 4) == 0 ? null : sEO;
    }

    public Data(Page page, BaseValue baseValue, SEO sEO) {
        this.page = page;
        this.baseValue = baseValue;
        this.seo = sEO;
    }

    public /* synthetic */ Data(Page page, BaseValue baseValue, SEO sEO, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            page = null;
        }
        if ((n4 = n3 & 2) != 0) {
            baseValue = null;
        }
        if ((n3 &= 4) != 0) {
            sEO = null;
        }
        this(page, baseValue, sEO);
    }

    public static /* synthetic */ Data copy$default(Data data, Page page, BaseValue baseValue, SEO sEO, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            page = data.page;
        }
        if ((n4 = n3 & 2) != 0) {
            baseValue = data.baseValue;
        }
        if ((n3 &= 4) != 0) {
            sEO = data.seo;
        }
        return data.copy(page, baseValue, sEO);
    }

    public static final /* synthetic */ void write$Self$shared_release(Data object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        Object object3;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((Data)object).page) != null) {
            object3 = Page$$serializer.INSTANCE;
            object2 = ((Data)object).page;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((Data)object).baseValue) != null) {
            object3 = BaseValue$$serializer.INSTANCE;
            object2 = ((Data)object).baseValue;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object3 = ((Data)object).seo) != null) {
            object3 = SEO$$serializer.INSTANCE;
            object = ((Data)object).seo;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final Page component1() {
        return this.page;
    }

    public final BaseValue component2() {
        return this.baseValue;
    }

    public final SEO component3() {
        return this.seo;
    }

    public final Data copy(Page page, BaseValue baseValue, SEO sEO) {
        Data data = new Data(page, baseValue, sEO);
        return data;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Data;
        if (!bl3) {
            return false;
        }
        object = (Data)object;
        Object object2 = this.page;
        Object object3 = ((Data)object).page;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.baseValue;
        object3 = ((Data)object).baseValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.seo;
        object = ((Data)object).seo;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final BaseValue getBaseValue() {
        return this.baseValue;
    }

    public final Page getPage() {
        return this.page;
    }

    public final SEO getSeo() {
        return this.seo;
    }

    public int hashCode() {
        int n3;
        int n4;
        Page page = this.page;
        int n7 = 0;
        if (page == null) {
            n4 = 0;
            page = null;
        } else {
            n4 = page.hashCode();
        }
        n4 *= 31;
        Object object = this.baseValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((BaseValue)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.seo;
        if (object != null) {
            n7 = ((SEO)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setBaseValue(BaseValue baseValue) {
        this.baseValue = baseValue;
    }

    public final void setPage(Page page) {
        this.page = page;
    }

    public final void setSeo(SEO sEO) {
        this.seo = sEO;
    }

    public String toString() {
        Page page = this.page;
        BaseValue baseValue = this.baseValue;
        SEO sEO = this.seo;
        StringBuilder stringBuilder = new StringBuilder("Data(page=");
        stringBuilder.append(page);
        stringBuilder.append(", baseValue=");
        stringBuilder.append(baseValue);
        stringBuilder.append(", seo=");
        stringBuilder.append(sEO);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

