/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.CharArrayBuffer
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.text.TextUtils
 */
package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class DataUtils {
    public static void copyStringToBuffer(String string2, CharArrayBuffer charArrayBuffer) {
        int n3;
        int n4;
        int n7 = TextUtils.isEmpty((CharSequence)string2);
        if (n7 != 0) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArray = charArrayBuffer.data;
        if (cArray != null && (n7 = cArray.length) >= (n4 = string2.length())) {
            n7 = string2.length();
            char[] cArray2 = charArrayBuffer.data;
            string2.getChars(0, n7, cArray2, 0);
        } else {
            charArrayBuffer.data = cArray = string2.toCharArray();
        }
        charArrayBuffer.sizeCopied = n3 = string2.length();
    }

    public static byte[] loadImageBytes(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        bitmap.compress(compressFormat, 100, (OutputStream)byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}

