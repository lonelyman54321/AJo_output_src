/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import com.google.firebase.Timestamp;
import kotlin.jvm.internal.PropertyReference1Impl;

final class Timestamp$compareTo$1
extends PropertyReference1Impl {
    public static final Timestamp$compareTo$1 INSTANCE;

    static {
        Timestamp$compareTo$1 timestamp$compareTo$1;
        INSTANCE = timestamp$compareTo$1 = new Timestamp$compareTo$1();
    }

    public Timestamp$compareTo$1() {
        super(Timestamp.class, "seconds", "getSeconds()J", 0);
    }

    public Object get(Object object) {
        return ((Timestamp)object).getSeconds();
    }
}

