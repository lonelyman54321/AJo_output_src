/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext$1;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

final class AutoValue_ExternalPRequestContext
extends ExternalPRequestContext {
    private final Integer originAssociatedProductId;

    private AutoValue_ExternalPRequestContext(Integer n3) {
        this.originAssociatedProductId = n3;
    }

    public /* synthetic */ AutoValue_ExternalPRequestContext(Integer n3, AutoValue_ExternalPRequestContext$1 autoValue_ExternalPRequestContext$1) {
        this(n3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof ExternalPRequestContext;
        if (bl3) {
            object = (ExternalPRequestContext)object;
            Integer n3 = this.originAssociatedProductId;
            object = ((ExternalPRequestContext)object).getOriginAssociatedProductId();
            if (n3 == null) {
                if (object != null) {
                    bl2 = false;
                }
            } else {
                bl2 = n3.equals(object);
            }
            return bl2;
        }
        return false;
    }

    public Integer getOriginAssociatedProductId() {
        return this.originAssociatedProductId;
    }

    public int hashCode() {
        int n3;
        Integer n4 = this.originAssociatedProductId;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = n4.hashCode();
        }
        return n3 ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExternalPRequestContext{originAssociatedProductId=");
        Integer n3 = this.originAssociatedProductId;
        stringBuilder.append(n3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

