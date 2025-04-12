/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.Lists;
import java.util.ArrayList;

class CycleDetectingLockFactory$1
extends ThreadLocal {
    public ArrayList initialValue() {
        return Lists.newArrayListWithCapacity(3);
    }
}

