/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.TempFileCreator;
import com.google.common.io.TempFileCreator$1;
import java.io.File;
import java.io.IOException;

final class TempFileCreator$ThrowingCreator
extends TempFileCreator {
    private static final String MESSAGE = "Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().";

    private TempFileCreator$ThrowingCreator() {
        super(null);
    }

    public /* synthetic */ TempFileCreator$ThrowingCreator(TempFileCreator$1 tempFileCreator$1) {
        this();
    }

    public File createTempDir() {
        IllegalStateException illegalStateException = new IllegalStateException(MESSAGE);
        throw illegalStateException;
    }

    public File createTempFile(String object) {
        object = new IOException(MESSAGE);
        throw object;
    }
}

