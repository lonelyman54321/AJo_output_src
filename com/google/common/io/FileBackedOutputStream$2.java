/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.ByteSource;
import com.google.common.io.FileBackedOutputStream;
import java.io.InputStream;

class FileBackedOutputStream$2
extends ByteSource {
    final /* synthetic */ FileBackedOutputStream this$0;

    public FileBackedOutputStream$2(FileBackedOutputStream fileBackedOutputStream) {
        this.this$0 = fileBackedOutputStream;
    }

    public InputStream openStream() {
        return FileBackedOutputStream.access$100(this.this$0);
    }
}

