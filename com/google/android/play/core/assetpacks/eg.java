/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

public final class eg
extends InputStream {
    private final Enumeration a;
    private InputStream b;

    public eg(Enumeration enumeration) {
        this.a = enumeration;
        this.a();
    }

    public final void a() {
        boolean bl2;
        Object object = this.b;
        if (object != null) {
            ((InputStream)object).close();
        }
        if (bl2 = (object = this.a).hasMoreElements()) {
            object = this.a;
            object = (File)object.nextElement();
            FileInputStream fileInputStream = new FileInputStream((File)object);
            this.b = fileInputStream;
            return;
        }
        this.b = null;
    }

    public final void close() {
        super.close();
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
            inputStream = null;
            this.b = null;
        }
    }

    public final int read() {
        int n3;
        while (true) {
            InputStream inputStream = this.b;
            n3 = -1;
            if (inputStream == null) break;
            int n4 = inputStream.read();
            if (n4 != n3) {
                return n4;
            }
            this.a();
        }
        return n3;
    }

    public final int read(byte[] object, int n3, int n4) {
        int n7;
        InputStream inputStream = this.b;
        int n8 = -1;
        if (inputStream == null) {
            return n8;
        }
        object.getClass();
        if (n3 >= 0 && n4 >= 0 && n4 <= (n7 = ((byte[])object).length - n3)) {
            if (n4 != 0) {
                do {
                    if ((n7 = (inputStream = this.b).read((byte[])object, n3, n4)) > 0) {
                        return n7;
                    }
                    this.a();
                } while ((inputStream = this.b) != null);
                return n8;
            }
            return 0;
        }
        object = new IndexOutOfBoundsException;
        object();
        throw object;
    }
}

