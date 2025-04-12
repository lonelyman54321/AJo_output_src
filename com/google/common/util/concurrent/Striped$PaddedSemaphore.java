/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.concurrent.Semaphore;

class Striped$PaddedSemaphore
extends Semaphore {
    long unused1;
    long unused2;
    long unused3;

    public Striped$PaddedSemaphore(int n3) {
        super(n3, false);
    }
}

