/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder;

final class AutoValue_CrashlyticsReport_FilesPayload_File$Builder
extends CrashlyticsReport$FilesPayload$File$Builder {
    private byte[] contents;
    private String filename;

    public CrashlyticsReport$FilesPayload$File build() {
        Object object;
        CharSequence charSequence = this.filename;
        if (charSequence != null && (object = this.contents) != null) {
            AutoValue_CrashlyticsReport_FilesPayload_File autoValue_CrashlyticsReport_FilesPayload_File = new AutoValue_CrashlyticsReport_FilesPayload_File((String)charSequence, (byte[])object, null);
            return autoValue_CrashlyticsReport_FilesPayload_File;
        }
        charSequence = new StringBuilder();
        object = this.filename;
        if (object == null) {
            object = " filename";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((object = this.contents) == null) {
            object = " contents";
            ((StringBuilder)charSequence).append((String)object);
        }
        object = new IllegalStateException;
        charSequence = Gs.a("Missing required properties:", (StringBuilder)charSequence);
        object((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$FilesPayload$File$Builder setContents(byte[] object) {
        if (object != null) {
            this.contents = object;
            return this;
        }
        object = new NullPointerException;
        object("Null contents");
        throw object;
    }

    public CrashlyticsReport$FilesPayload$File$Builder setFilename(String object) {
        if (object != null) {
            this.filename = object;
            return this;
        }
        object = new NullPointerException("Null filename");
        throw object;
    }
}

