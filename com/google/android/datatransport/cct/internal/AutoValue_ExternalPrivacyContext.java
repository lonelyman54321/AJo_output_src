/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext$1;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

final class AutoValue_ExternalPrivacyContext
extends ExternalPrivacyContext {
    private final ExternalPRequestContext prequest;

    private AutoValue_ExternalPrivacyContext(ExternalPRequestContext externalPRequestContext) {
        this.prequest = externalPRequestContext;
    }

    public /* synthetic */ AutoValue_ExternalPrivacyContext(ExternalPRequestContext externalPRequestContext, AutoValue_ExternalPrivacyContext$1 autoValue_ExternalPrivacyContext$1) {
        this(externalPRequestContext);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof ExternalPrivacyContext;
        if (bl3) {
            object = (ExternalPrivacyContext)object;
            ExternalPRequestContext externalPRequestContext = this.prequest;
            object = ((ExternalPrivacyContext)object).getPrequest();
            if (externalPRequestContext == null) {
                if (object != null) {
                    bl2 = false;
                }
            } else {
                bl2 = externalPRequestContext.equals(object);
            }
            return bl2;
        }
        return false;
    }

    public ExternalPRequestContext getPrequest() {
        return this.prequest;
    }

    public int hashCode() {
        int n3;
        ExternalPRequestContext externalPRequestContext = this.prequest;
        if (externalPRequestContext == null) {
            n3 = 0;
            externalPRequestContext = null;
        } else {
            n3 = externalPRequestContext.hashCode();
        }
        return n3 ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExternalPrivacyContext{prequest=");
        ExternalPRequestContext externalPRequestContext = this.prequest;
        stringBuilder.append(externalPRequestContext);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

