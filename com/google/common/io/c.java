/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.TempFileCreator$JavaNioCreator;
import com.google.common.io.TempFileCreator$JavaNioCreator$PermissionSupplier;
import java.nio.file.attribute.FileAttribute;

public final class c
implements TempFileCreator$JavaNioCreator$PermissionSupplier {
    public final FileAttribute get() {
        return TempFileCreator$JavaNioCreator.d();
    }
}

