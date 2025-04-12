/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SizeInstructionConfig {
    public static final int $stable = 8;
    private final List categories;

    public SizeInstructionConfig() {
        this(null, 1, null);
    }

    public SizeInstructionConfig(List list) {
        this.categories = list;
    }

    public /* synthetic */ SizeInstructionConfig(List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
        }
        this(list);
    }

    public static /* synthetic */ SizeInstructionConfig copy$default(SizeInstructionConfig sizeInstructionConfig, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = sizeInstructionConfig.categories;
        }
        return sizeInstructionConfig.copy(list);
    }

    public final List component1() {
        return this.categories;
    }

    public final SizeInstructionConfig copy(List list) {
        SizeInstructionConfig sizeInstructionConfig = new SizeInstructionConfig(list);
        return sizeInstructionConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SizeInstructionConfig;
        if (!bl3) {
            return false;
        }
        object = (SizeInstructionConfig)object;
        List list = this.categories;
        object = ((SizeInstructionConfig)object).categories;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getCategories() {
        return this.categories;
    }

    public int hashCode() {
        int n3;
        List list = this.categories;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public String toString() {
        List list = this.categories;
        StringBuilder stringBuilder = new StringBuilder("SizeInstructionConfig(categories=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

