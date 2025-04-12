/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder
extends CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder {
    private String arch;
    private String buildId;
    private String libraryName;

    public CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch build() {
        String string2;
        Object object;
        CharSequence charSequence = this.arch;
        if (charSequence != null && (object = this.libraryName) != null && (string2 = this.buildId) != null) {
            AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch autoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch = new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch((String)charSequence, (String)object, string2, null);
            return autoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch;
        }
        charSequence = new StringBuilder();
        object = this.arch;
        if (object == null) {
            object = " arch";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((object = this.libraryName) == null) {
            object = " libraryName";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((object = this.buildId) == null) {
            object = " buildId";
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", (StringBuilder)charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder setArch(String object) {
        if (object != null) {
            this.arch = object;
            return this;
        }
        object = new NullPointerException("Null arch");
        throw object;
    }

    public CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder setBuildId(String object) {
        if (object != null) {
            this.buildId = object;
            return this;
        }
        object = new NullPointerException("Null buildId");
        throw object;
    }

    public CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder setLibraryName(String object) {
        if (object != null) {
            this.libraryName = object;
            return this;
        }
        object = new NullPointerException("Null libraryName");
        throw object;
    }
}

