/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.StringToMD5Converter$Companion;
import com.affise.attribution.logs.LogsManager;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class StringToMD5Converter
implements Converter {
    private static final String ALGORITHM_NAME = "MD5";
    public static final StringToMD5Converter$Companion Companion;
    private final LogsManager logsManager;

    static {
        StringToMD5Converter$Companion stringToMD5Converter$Companion;
        Companion = stringToMD5Converter$Companion = new StringToMD5Converter$Companion(null);
    }

    public StringToMD5Converter(LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.logsManager = logsManager2;
    }

    private final String generateMd5(String object) {
        int n3;
        Object object2 = ALGORITHM_NAME;
        object2 = MessageDigest.getInstance((String)object2);
        ((MessageDigest)object2).reset();
        Object object3 = Charsets.UTF_8;
        object = ((String)object).getBytes((Charset)object3);
        object3 = "this as java.lang.String).getBytes(charset)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        try {
            ((MessageDigest)object2).update((byte[])object);
            object = ((MessageDigest)object2).digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            object2 = this.logsManager;
            object2.addSdkError(noSuchAlgorithmException);
            object = new byte[0];
        }
        object2 = new BigInteger(1, (byte[])object);
        int n4 = 16;
        object2 = ((BigInteger)object2).toString(n4);
        object = new StringBuilder((String)object2);
        while ((n3 = ((StringBuilder)object).length()) < (n4 = 32)) {
            object2 = "0";
            ((StringBuilder)object).insert(0, (String)object2);
        }
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullExpressionValue(object, "stringBuilder.toString()");
        return object;
    }

    public String convert(String string2) {
        Intrinsics.checkNotNullParameter(string2, "from");
        return this.generateMd5(string2);
    }
}

