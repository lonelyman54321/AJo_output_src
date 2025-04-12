/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class a {
    public static int a(ArrayList arrayList, InputStream inputStream, Kp kp) {
        int n3 = -1;
        if (inputStream == null) {
            return n3;
        }
        int n4 = inputStream.markSupported();
        if (n4 == 0) {
            hG2 hG22 = new hG2(inputStream, kp);
            inputStream = hG22;
        }
        inputStream.mark(0x500000);
        n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            ImageHeaderParser imageHeaderParser = (ImageHeaderParser)arrayList.get(i3);
            try {
                int n7 = imageHeaderParser.a(inputStream, kp);
                if (n7 == n3) continue;
                n3 = n7;
                break;
            }
            finally {
                inputStream.reset();
            }
        }
        return n3;
    }

    public static ImageHeaderParser$ImageType b(List list, InputStream inputStream, Kp kp) {
        Object object;
        block7: {
            hG2 hG22;
            if (inputStream == null) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int n3 = inputStream.markSupported();
            if (n3 == 0) {
                hG22 = new hG2(inputStream, kp);
                inputStream = hG22;
            }
            inputStream.mark(0x500000);
            int n4 = list.size();
            hG22 = null;
            for (n3 = 0; n3 < n4; ++n3) {
                object = (ImageHeaderParser)list.get(n3);
                try {
                    object = object.c(inputStream);
                    ImageHeaderParser$ImageType imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
                    if (object == imageHeaderParser$ImageType) {
                        continue;
                    }
                    break block7;
                }
                finally {
                    inputStream.reset();
                }
            }
            object = ImageHeaderParser$ImageType.UNKNOWN;
        }
        return object;
    }

    public static ImageHeaderParser$ImageType c(List list, ByteBuffer byteBuffer) {
        Object object;
        block6: {
            if (byteBuffer == null) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                object = (ImageHeaderParser)list.get(i3);
                try {
                    object = object.b(byteBuffer);
                    ImageHeaderParser$ImageType imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
                    if (object == imageHeaderParser$ImageType) {
                        continue;
                    }
                    break block6;
                }
                finally {
                    hf_0.c(byteBuffer);
                }
            }
            object = ImageHeaderParser$ImageType.UNKNOWN;
        }
        return object;
    }
}

