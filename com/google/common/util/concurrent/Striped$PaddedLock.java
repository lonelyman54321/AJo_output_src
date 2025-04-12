/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.concurrent.locks.ReentrantLock;

class Striped$PaddedLock
extends ReentrantLock {
    long unused1;
    long unused2;
    long unused3;

    public Striped$PaddedLock() {
        super(false);
    }
}

