/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.TempFileCreator$JavaNioCreator;
import com.google.common.io.TempFileCreator$JavaNioCreator$PermissionSupplier;
import java.nio.file.attribute.FileAttribute;

public final class d
implements TempFileCreator$JavaNioCreator$PermissionSupplier {
    public final /* synthetic */ FileAttribute a;

    public /* synthetic */ d(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    public final FileAttribute get() {
        return TempFileCreator$JavaNioCreator.c(this.a);
    }
}

