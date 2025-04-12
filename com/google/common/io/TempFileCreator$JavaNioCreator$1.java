/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.collect.ImmutableList;
import java.nio.file.attribute.FileAttribute;

class TempFileCreator$JavaNioCreator$1
implements FileAttribute {
    final /* synthetic */ ImmutableList val$acl;

    public TempFileCreator$JavaNioCreator$1(ImmutableList immutableList) {
        this.val$acl = immutableList;
    }

    public String name() {
        return "acl:acl";
    }

    public ImmutableList value() {
        return this.val$acl;
    }
}

