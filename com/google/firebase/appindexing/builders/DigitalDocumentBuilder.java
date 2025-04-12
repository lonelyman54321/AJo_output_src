/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.DigitalDocumentPermissionBuilder;
import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PersonBuilder;
import java.util.Date;

public final class DigitalDocumentBuilder
extends IndexableBuilder {
    public DigitalDocumentBuilder() {
        super("DigitalDocument");
    }

    public DigitalDocumentBuilder(String string2) {
        super(string2);
    }

    public DigitalDocumentBuilder setAuthor(PersonBuilder ... personBuilderArray) {
        this.put("author", personBuilderArray);
        return this;
    }

    public DigitalDocumentBuilder setDateCreated(Date object) {
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("dateCreated", (long[])object);
        return this;
    }

    public DigitalDocumentBuilder setDateModified(Date object) {
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("dateModified", (long[])object);
        return this;
    }

    public DigitalDocumentBuilder setHasDigitalDocumentPermission(DigitalDocumentPermissionBuilder ... digitalDocumentPermissionBuilderArray) {
        this.put("hasDigitalDocumentPermission", digitalDocumentPermissionBuilderArray);
        return this;
    }

    public DigitalDocumentBuilder setText(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("text", stringArray);
        return this;
    }
}

