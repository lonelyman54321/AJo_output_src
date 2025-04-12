/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

class TypeAdapters$35 {
    static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JsonToken jsonToken;
        int n7 = JsonToken.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$gson$stream$JsonToken = nArray;
        try {
            jsonToken = JsonToken.NUMBER;
            n4 = jsonToken.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$gson$stream$JsonToken;
            jsonToken = JsonToken.STRING;
            n4 = jsonToken.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$gson$stream$JsonToken;
            jsonToken = JsonToken.BOOLEAN;
            n4 = jsonToken.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$gson$stream$JsonToken;
            jsonToken = JsonToken.BEGIN_ARRAY;
            n4 = jsonToken.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$gson$stream$JsonToken;
            jsonToken = JsonToken.BEGIN_OBJECT;
            n4 = jsonToken.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$gson$stream$JsonToken;
            jsonToken = JsonToken.NULL;
            n4 = jsonToken.ordinal();
            nArray[n4] = n3 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

