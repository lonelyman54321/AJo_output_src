/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.TempFileCreator$JavaNioCreator;
import com.google.common.io.TempFileCreator$JavaNioCreator$PermissionSupplier;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;

public final class e
implements TempFileCreator$JavaNioCreator$PermissionSupplier {
    public final /* synthetic */ IOException a;

    public /* synthetic */ e(IOException iOException) {
        this.a = iOException;
    }

    public final FileAttribute get() {
        return TempFileCreator$JavaNioCreator.e(this.a);
    }
}

