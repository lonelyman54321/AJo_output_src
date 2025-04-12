/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

class JsonReader$1
extends JsonReaderInternalAccess {
    public void promoteNameToValue(JsonReader object) {
        block8: {
            block6: {
                int n3;
                int n4;
                block7: {
                    block5: {
                        n4 = object instanceof JsonTreeReader;
                        if (n4 != 0) {
                            ((JsonTreeReader)object).promoteNameToValue();
                            return;
                        }
                        n4 = ((JsonReader)object).peeked;
                        if (n4 == 0) {
                            n4 = ((JsonReader)object).doPeek();
                        }
                        if (n4 != (n3 = 13)) break block5;
                        ((JsonReader)object).peeked = n4 = 9;
                        break block6;
                    }
                    n3 = 12;
                    if (n4 != n3) break block7;
                    ((JsonReader)object).peeked = n4 = 8;
                    break block6;
                }
                n3 = 14;
                if (n4 != n3) break block8;
                ((JsonReader)object).peeked = n4 = 10;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected a name but was ");
        JsonToken jsonToken = ((JsonReader)object).peek();
        stringBuilder.append((Object)jsonToken);
        object = ((JsonReader)object).locationString();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

