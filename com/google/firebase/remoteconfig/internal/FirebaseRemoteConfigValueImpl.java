/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import java.nio.charset.Charset;
import java.util.regex.Matcher;

public class FirebaseRemoteConfigValueImpl
implements FirebaseRemoteConfigValue {
    private static final String ILLEGAL_ARGUMENT_STRING_FORMAT = "[Value: %s] cannot be converted to a %s.";
    private final int source;
    private final String value;

    public FirebaseRemoteConfigValueImpl(String string2, int n3) {
        this.value = string2;
        this.source = n3;
    }

    private String asTrimmedString() {
        return this.asString().trim();
    }

    private void throwIfNullValue() {
        Object object = this.value;
        if (object != null) {
            return;
        }
        object = new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        throw object;
    }

    public boolean asBoolean() {
        int n3 = this.source;
        IllegalArgumentException illegalArgumentException = null;
        if (n3 == 0) {
            return false;
        }
        String string2 = this.asTrimmedString();
        Matcher matcher = ConfigGetParameterHandler.TRUE_REGEX.matcher(string2);
        boolean bl2 = matcher.matches();
        if (bl2) {
            return true;
        }
        matcher = ConfigGetParameterHandler.FALSE_REGEX.matcher(string2);
        bl2 = matcher.matches();
        if (bl2) {
            return false;
        }
        string2 = cP.a("[Value: ", string2, "] cannot be converted to a boolean.");
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public byte[] asByteArray() {
        int n3 = this.source;
        if (n3 == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        String string2 = this.value;
        Charset charset = ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING;
        return string2.getBytes(charset);
    }

    public double asDouble() {
        Double d2;
        int n3 = this.source;
        if (n3 == 0) {
            return 0.0;
        }
        String string2 = this.asTrimmedString();
        try {
            d2 = Double.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            string2 = cP.a("[Value: ", string2, "] cannot be converted to a double.");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2, numberFormatException);
            throw illegalArgumentException;
        }
        return d2;
    }

    public long asLong() {
        Long l2;
        int n3 = this.source;
        if (n3 == 0) {
            return 0L;
        }
        String string2 = this.asTrimmedString();
        try {
            l2 = Long.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            string2 = cP.a("[Value: ", string2, "] cannot be converted to a long.");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2, numberFormatException);
            throw illegalArgumentException;
        }
        return l2;
    }

    public String asString() {
        int n3 = this.source;
        if (n3 == 0) {
            return "";
        }
        this.throwIfNullValue();
        return this.value;
    }

    public int getSource() {
        return this.source;
    }
}

