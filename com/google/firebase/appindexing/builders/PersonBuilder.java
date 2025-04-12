/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;

public final class PersonBuilder
extends IndexableBuilder {
    public PersonBuilder() {
        super("Person");
    }

    public PersonBuilder setEmail(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("email", stringArray);
        return this;
    }

    public PersonBuilder setIsSelf(boolean bl2) {
        boolean[] blArray = new boolean[]{bl2};
        this.put("isSelf", blArray);
        return this;
    }

    public PersonBuilder setTelephone(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("telephone", stringArray);
        return this;
    }
}

