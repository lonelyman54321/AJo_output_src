/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters$35;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.BitSet;

class TypeAdapters$2
extends TypeAdapter {
    public BitSet read(JsonReader object) {
        Object object2;
        Serializable serializable = new BitSet();
        ((JsonReader)object).beginArray();
        Object object3 = ((JsonReader)object).peek();
        StringBuilder stringBuilder = null;
        int n3 = 0;
        while (object3 != (object2 = JsonToken.END_ARRAY)) {
            int n4;
            block9: {
                int n7;
                block7: {
                    block8: {
                        block5: {
                            block6: {
                                int n8;
                                object2 = TypeAdapters$35.$SwitchMap$com$google$gson$stream$JsonToken;
                                n7 = ((Enum)object3).ordinal();
                                JsonToken jsonToken = object2[n7];
                                if (jsonToken == (n7 = 1) || jsonToken == (n8 = 2)) break block5;
                                n7 = 3;
                                if (jsonToken != n7) break block6;
                                n7 = (int)(((JsonReader)object).nextBoolean() ? 1 : 0);
                                break block7;
                            }
                            stringBuilder = new StringBuilder("Invalid bitset value type: ");
                            stringBuilder.append(object3);
                            stringBuilder.append("; at path ");
                            object = ((JsonReader)object).getPath();
                            stringBuilder.append((String)object);
                            object = stringBuilder.toString();
                            serializable = new JsonSyntaxException((String)object);
                            throw serializable;
                        }
                        n4 = ((JsonReader)object).nextInt();
                        if (n4 != 0) break block8;
                        n7 = 0;
                        break block7;
                    }
                    if (n4 != n7) break block9;
                }
                if (n7 != 0) {
                    serializable.set(n3);
                }
                ++n3;
                object3 = ((JsonReader)object).peek();
                continue;
            }
            object3 = wk0_0.a(n4, "Invalid bitset value ", ", expected 0 or 1; at path ");
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            serializable = new JsonSyntaxException((String)object);
            throw serializable;
        }
        ((JsonReader)object).endArray();
        return serializable;
    }

    public void write(JsonWriter jsonWriter, BitSet bitSet) {
        jsonWriter.beginArray();
        int n3 = bitSet.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = bitSet.get(i3);
            long l2 = n4;
            jsonWriter.value(l2);
        }
        jsonWriter.endArray();
    }
}

