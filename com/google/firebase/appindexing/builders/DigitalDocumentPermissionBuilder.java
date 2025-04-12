/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PersonBuilder;

public final class DigitalDocumentPermissionBuilder
extends IndexableBuilder {
    public static final String COMMENT_PERMISSION = "CommentPermission";
    public static final String READ_PERMISSION = "ReadPermission";
    public static final String WRITE_PERMISSION = "WritePermission";

    public DigitalDocumentPermissionBuilder() {
        super("DigitalDocumentPermission");
    }

    public DigitalDocumentPermissionBuilder setGrantee(PersonBuilder ... personBuilderArray) {
        this.put("grantee", personBuilderArray);
        return this;
    }

    public DigitalDocumentPermissionBuilder setPermissionType(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("permissionType", stringArray);
        return this;
    }
}

