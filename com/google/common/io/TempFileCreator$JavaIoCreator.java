/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.StandardSystemProperty;
import com.google.common.io.TempFileCreator;
import com.google.common.io.TempFileCreator$1;
import java.io.File;
import java.io.Serializable;

final class TempFileCreator$JavaIoCreator
extends TempFileCreator {
    private static final int TEMP_DIR_ATTEMPTS = 10000;

    private TempFileCreator$JavaIoCreator() {
        super(null);
    }

    public /* synthetic */ TempFileCreator$JavaIoCreator(TempFileCreator$1 tempFileCreator$1) {
        this();
    }

    public File createTempDir() {
        int n3;
        CharSequence charSequence = StandardSystemProperty.JAVA_IO_TMPDIR.value();
        Serializable serializable = new File((String)charSequence);
        charSequence = new StringBuilder();
        long l2 = System.currentTimeMillis();
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append("-");
        charSequence = ((StringBuilder)charSequence).toString();
        for (int i3 = 0; i3 < (n3 = 10000); ++i3) {
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append((String)charSequence);
            charSequence2.append(i3);
            charSequence2 = charSequence2.toString();
            File file = new File((File)serializable, (String)charSequence2);
            boolean bl2 = file.mkdir();
            if (!bl2) continue;
            return file;
        }
        charSequence = uc0_0.a("Failed to create directory within 10000 attempts (tried ", (String)charSequence, "0 to ", (String)charSequence, "9999)");
        serializable = new IllegalStateException((String)charSequence);
        throw serializable;
    }

    public File createTempFile(String string2) {
        return File.createTempFile(string2, null, null);
    }
}

