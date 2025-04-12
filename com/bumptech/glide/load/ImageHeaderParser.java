/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {
    public int a(InputStream var1, Kp var2);

    public ImageHeaderParser$ImageType b(ByteBuffer var1);

    public ImageHeaderParser$ImageType c(InputStream var1);

    public int d(ByteBuffer var1, Kp var2);
}

