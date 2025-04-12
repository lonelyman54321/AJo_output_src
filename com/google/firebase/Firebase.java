/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

public final class Firebase {
    public static final Firebase INSTANCE;

    static {
        Firebase firebase;
        INSTANCE = firebase = new Firebase();
    }

    private Firebase() {
    }
}

