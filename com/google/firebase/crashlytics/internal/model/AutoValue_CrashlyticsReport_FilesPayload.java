/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$1;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder;
import java.util.List;

final class AutoValue_CrashlyticsReport_FilesPayload
extends CrashlyticsReport$FilesPayload {
    private final List files;
    private final String orgId;

    private AutoValue_CrashlyticsReport_FilesPayload(List list, String string2) {
        this.files = list;
        this.orgId = string2;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload(List list, String string2, AutoValue_CrashlyticsReport_FilesPayload$1 autoValue_CrashlyticsReport_FilesPayload$1) {
        this(list, string2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CrashlyticsReport$FilesPayload;
        if (bl3) {
            boolean bl4;
            Object object2 = this.files;
            List list = ((CrashlyticsReport$FilesPayload)(object = (CrashlyticsReport$FilesPayload)object)).getFiles();
            bl3 = object2.equals(list);
            if (!bl3 || !((object2 = this.orgId) == null ? (object = ((CrashlyticsReport$FilesPayload)object).getOrgId()) == null : (bl4 = ((String)object2).equals(object = ((CrashlyticsReport$FilesPayload)object).getOrgId())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public List getFiles() {
        return this.files;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public int hashCode() {
        List list = this.files;
        int n3 = list.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        String string2 = this.orgId;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        return n3 ^ n4;
    }

    public CrashlyticsReport$FilesPayload$Builder toBuilder() {
        AutoValue_CrashlyticsReport_FilesPayload$Builder autoValue_CrashlyticsReport_FilesPayload$Builder = new AutoValue_CrashlyticsReport_FilesPayload$Builder(this, null);
        return autoValue_CrashlyticsReport_FilesPayload$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FilesPayload{files=");
        Object object = this.files;
        stringBuilder.append(object);
        stringBuilder.append(", orgId=");
        object = this.orgId;
        return h30_0.a(stringBuilder, (String)object, "}");
    }
}

