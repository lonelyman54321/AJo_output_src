/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.collect.ImmutableList;
import com.google.common.graph.SuccessorsFunction;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

class Files$2
implements SuccessorsFunction {
    public Iterable successors(File fileArray) {
        boolean bl2 = fileArray.isDirectory();
        if (bl2 && (fileArray = fileArray.listFiles()) != null) {
            return Collections.unmodifiableList(Arrays.asList(fileArray));
        }
        return ImmutableList.of();
    }
}

