/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing;

import com.google.firebase.appindexing.FirebaseAppIndexingException;

public class FirebaseAppIndexingTooManyArgumentsException
extends FirebaseAppIndexingException {
    public FirebaseAppIndexingTooManyArgumentsException() {
        super("Too many Indexables provided. Try splitting them in batches.");
    }

    public FirebaseAppIndexingTooManyArgumentsException(String string2) {
        super(string2);
    }

    public FirebaseAppIndexingTooManyArgumentsException(String string2, Throwable throwable) {
        super(string2, throwable);
    }
}

