/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import com.google.firebase.Timestamp;
import kotlin.jvm.internal.PropertyReference1Impl;

final class Timestamp$compareTo$2
extends PropertyReference1Impl {
    public static final Timestamp$compareTo$2 INSTANCE;

    static {
        Timestamp$compareTo$2 timestamp$compareTo$2;
        INSTANCE = timestamp$compareTo$2 = new Timestamp$compareTo$2();
    }

    public Timestamp$compareTo$2() {
        super(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0);
    }

    public Object get(Object object) {
        return ((Timestamp)object).getNanoseconds();
    }
}

