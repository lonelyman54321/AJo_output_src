/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeReader$1;
import com.google.gson.internal.bind.JsonTreeReader$2;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class JsonTreeReader
extends JsonReader {
    private static final Object SENTINEL_CLOSED;
    private static final Reader UNREADABLE_READER;
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;

    static {
        Object object = new JsonTreeReader$1();
        UNREADABLE_READER = object;
        SENTINEL_CLOSED = object = new Object();
    }

    public JsonTreeReader(JsonElement jsonElement) {
        Object object = UNREADABLE_READER;
        super((Reader)object);
        int n3 = 32;
        Object[] objectArray = new Object[n3];
        this.stack = objectArray;
        this.stackSize = 0;
        objectArray = new String[n3];
        this.pathNames = objectArray;
        object = new int[n3];
        this.pathIndices = (int[])object;
        this.push(jsonElement);
    }

    private void expect(JsonToken object) {
        Object object2 = this.peek();
        if (object2 == object) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(object);
        stringBuilder.append(" but was ");
        object = this.peek();
        stringBuilder.append(object);
        object = this.locationString();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    private String getPath(boolean bl2) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder("$");
        for (int i3 = 0; i3 < (n3 = this.stackSize); ++i3) {
            Object object;
            int n4;
            Object object2 = this.stack;
            Object object3 = object2[i3];
            boolean bl3 = object3 instanceof JsonArray;
            if (bl3) {
                int n7;
                if (++i3 >= n3 || (n7 = (object2 = object2[i3]) instanceof Iterator) == false) continue;
                object2 = this.pathIndices;
                n7 = object2[i3];
                if (bl2 && n7 > 0 && (i3 == (n4 = n3 + -1) || i3 == (n3 += -2))) {
                    n7 += -1;
                }
                stringBuilder.append('[');
                stringBuilder.append(n7);
                n3 = 93;
                stringBuilder.append((char)n3);
                continue;
            }
            n4 = object3 instanceof JsonObject;
            if (n4 == 0 || ++i3 >= n3 || (n3 = (object = object2[i3]) instanceof Iterator) == 0) continue;
            n3 = 46;
            stringBuilder.append((char)n3);
            object = this.pathNames[i3];
            if (object == null) continue;
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    private String locationString() {
        StringBuilder stringBuilder = new StringBuilder(" at path ");
        String string2 = this.getPath();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private String nextName(boolean bl2) {
        Object object = JsonToken.NAME;
        this.expect((JsonToken)((Object)object));
        object = (Map.Entry)((Iterator)this.peekStack()).next();
        String string2 = (String)object.getKey();
        String[] stringArray = this.pathNames;
        int n3 = this.stackSize + -1;
        String string3 = bl2 ? "<skipped>" : string2;
        stringArray[n3] = string3;
        string3 = object.getValue();
        this.push(string3);
        return string2;
    }

    private Object peekStack() {
        Object[] objectArray = this.stack;
        int n3 = this.stackSize + -1;
        return objectArray[n3];
    }

    private Object popStack() {
        int n3;
        Object[] objectArray = this.stack;
        this.stackSize = n3 = this.stackSize + -1;
        Object object = objectArray[n3];
        objectArray[n3] = null;
        return object;
    }

    private void push(Object object) {
        Object[] objectArray;
        int n3 = this.stackSize;
        Object[] objectArray2 = this.stack;
        int n4 = objectArray2.length;
        if (n3 == n4) {
            this.stack = objectArray2 = Arrays.copyOf(objectArray2, n3 *= 2);
            objectArray2 = Arrays.copyOf(this.pathIndices, n3);
            this.pathIndices = (int[])objectArray2;
            objectArray2 = this.pathNames;
            objectArray = (String[])Arrays.copyOf(objectArray2, n3);
            this.pathNames = objectArray;
        }
        objectArray = this.stack;
        int n7 = this.stackSize;
        this.stackSize = n4 = n7 + 1;
        objectArray[n7] = object;
    }

    public void beginArray() {
        Object object = JsonToken.BEGIN_ARRAY;
        this.expect((JsonToken)((Object)object));
        object = ((JsonArray)this.peekStack()).iterator();
        this.push(object);
        object = this.pathIndices;
        int n3 = this.stackSize + -1;
        object[n3] = (JsonToken)false;
    }

    public void beginObject() {
        Object object = JsonToken.BEGIN_OBJECT;
        this.expect((JsonToken)((Object)object));
        object = ((JsonObject)this.peekStack()).entrySet().iterator();
        this.push(object);
    }

    public void close() {
        Object object;
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object = SENTINEL_CLOSED;
        this.stack = objectArray;
        this.stackSize = n3;
    }

    public void endArray() {
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this.expect(jsonToken);
        this.popStack();
        this.popStack();
        int n3 = this.stackSize;
        if (n3 > 0) {
            int n4;
            int[] nArray = this.pathIndices;
            nArray[n3 += -1] = n4 = nArray[n3] + 1;
        }
    }

    public void endObject() {
        String[] stringArray = JsonToken.END_OBJECT;
        this.expect((JsonToken)stringArray);
        stringArray = this.pathNames;
        int n3 = this.stackSize + -1;
        int n4 = 0;
        stringArray[n3] = null;
        this.popStack();
        this.popStack();
        int n7 = this.stackSize;
        if (n7 > 0) {
            int[] nArray = this.pathIndices;
            nArray[n7 += -1] = n4 = nArray[n7] + 1;
        }
    }

    public String getPath() {
        return this.getPath(false);
    }

    public String getPreviousPath() {
        return this.getPath(true);
    }

    public boolean hasNext() {
        boolean bl2;
        JsonToken jsonToken;
        JsonToken jsonToken2 = this.peek();
        if (jsonToken2 != (jsonToken = JsonToken.END_OBJECT) && jsonToken2 != (jsonToken = JsonToken.END_ARRAY) && jsonToken2 != (jsonToken = JsonToken.END_DOCUMENT)) {
            bl2 = true;
        } else {
            bl2 = false;
            jsonToken2 = null;
        }
        return bl2;
    }

    public boolean nextBoolean() {
        Object object = JsonToken.BOOLEAN;
        this.expect((JsonToken)((Object)object));
        object = (JsonPrimitive)this.popStack();
        boolean bl2 = ((JsonPrimitive)object).getAsBoolean();
        int n3 = this.stackSize;
        if (n3 > 0) {
            int n4;
            int[] nArray = this.pathIndices;
            nArray[n3 += -1] = n4 = nArray[n3] + 1;
        }
        return bl2;
    }

    public double nextDouble() {
        Object object;
        JsonToken jsonToken;
        Object object2 = this.peek();
        if (object2 != (jsonToken = JsonToken.NUMBER) && object2 != (object = JsonToken.STRING)) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(object2);
            object2 = this.locationString();
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = (JsonPrimitive)this.peekStack();
        double d2 = ((JsonPrimitive)object2).getAsDouble();
        int n3 = this.isLenient();
        if (n3 == 0 && ((n3 = Double.isNaN(d2)) != 0 || (n3 = (int)(Double.isInfinite(d2) ? 1 : 0)) != 0)) {
            StringBuilder stringBuilder = new StringBuilder("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            object2 = stringBuilder.toString();
            object = new MalformedJsonException((String)object2);
            throw object;
        }
        this.popStack();
        n3 = this.stackSize;
        if (n3 > 0) {
            int n4;
            int[] nArray = this.pathIndices;
            nArray[n3 += -1] = n4 = nArray[n3] + 1;
        }
        return d2;
    }

    public int nextInt() {
        Object object;
        JsonToken jsonToken;
        Object object2 = this.peek();
        if (object2 != (jsonToken = JsonToken.NUMBER) && object2 != (object = JsonToken.STRING)) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(object2);
            object2 = this.locationString();
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = (JsonPrimitive)this.peekStack();
        int n3 = ((JsonPrimitive)object2).getAsInt();
        this.popStack();
        int n4 = this.stackSize;
        if (n4 > 0) {
            reference var7_7;
            object = this.pathIndices;
            object[n4 += -1] = var7_7 = object[n4] + true;
        }
        return n3;
    }

    public JsonElement nextJsonElement() {
        Object object;
        Object object2 = this.peek();
        if (object2 != (object = JsonToken.NAME) && object2 != (object = JsonToken.END_ARRAY) && object2 != (object = JsonToken.END_OBJECT) && object2 != (object = JsonToken.END_DOCUMENT)) {
            object2 = (JsonElement)this.peekStack();
            this.skipValue();
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected ");
        stringBuilder.append(object2);
        stringBuilder.append(" when reading a JsonElement.");
        object2 = stringBuilder.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public long nextLong() {
        Object object;
        JsonToken jsonToken;
        Object object2 = this.peek();
        if (object2 != (jsonToken = JsonToken.NUMBER) && object2 != (object = JsonToken.STRING)) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(object2);
            object2 = this.locationString();
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = (JsonPrimitive)this.peekStack();
        long l2 = ((JsonPrimitive)object2).getAsLong();
        this.popStack();
        int n3 = this.stackSize;
        if (n3 > 0) {
            int n4;
            int[] nArray = this.pathIndices;
            nArray[n3 += -1] = n4 = nArray[n3] + 1;
        }
        return l2;
    }

    public String nextName() {
        return this.nextName(false);
    }

    public void nextNull() {
        JsonToken jsonToken = JsonToken.NULL;
        this.expect(jsonToken);
        this.popStack();
        int n3 = this.stackSize;
        if (n3 > 0) {
            int n4;
            int[] nArray = this.pathIndices;
            nArray[n3 += -1] = n4 = nArray[n3] + 1;
        }
    }

    public String nextString() {
        Object object;
        JsonToken jsonToken;
        Object object2 = this.peek();
        if (object2 != (jsonToken = JsonToken.STRING) && object2 != (object = JsonToken.NUMBER)) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(object2);
            object2 = this.locationString();
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = ((JsonPrimitive)this.popStack()).getAsString();
        int n3 = this.stackSize;
        if (n3 > 0) {
            reference var6_6;
            object = this.pathIndices;
            object[n3 += -1] = var6_6 = object[n3] + true;
        }
        return object2;
    }

    public JsonToken peek() {
        int n3 = this.stackSize;
        if (n3 == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object object = this.peekStack();
        boolean bl2 = object instanceof Iterator;
        if (bl2) {
            Object object2 = this.stack;
            int n4 = this.stackSize + -2;
            object2 = object2[n4];
            bl2 = object2 instanceof JsonObject;
            n4 = (int)((object = (Iterator)object).hasNext() ? 1 : 0);
            if (n4 != 0) {
                if (bl2) {
                    return JsonToken.NAME;
                }
                object = object.next();
                this.push(object);
                return this.peek();
            }
            object = bl2 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            return object;
        }
        bl2 = object instanceof JsonObject;
        if (bl2) {
            return JsonToken.BEGIN_OBJECT;
        }
        bl2 = object instanceof JsonArray;
        if (bl2) {
            return JsonToken.BEGIN_ARRAY;
        }
        bl2 = object instanceof JsonPrimitive;
        if (bl2) {
            bl2 = ((JsonPrimitive)(object = (JsonPrimitive)object)).isString();
            if (bl2) {
                return JsonToken.STRING;
            }
            bl2 = ((JsonPrimitive)object).isBoolean();
            if (bl2) {
                return JsonToken.BOOLEAN;
            }
            n3 = (int)(((JsonPrimitive)object).isNumber() ? 1 : 0);
            if (n3 != 0) {
                return JsonToken.NUMBER;
            }
            object = new AssertionError();
            throw object;
        }
        bl2 = object instanceof JsonNull;
        if (bl2) {
            return JsonToken.NULL;
        }
        Object object3 = SENTINEL_CLOSED;
        if (object == object3) {
            object = new IllegalStateException("JsonReader is closed");
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder("Custom JsonElement subclass ");
        object = object.getClass().getName();
        stringBuilder.append((String)object);
        stringBuilder.append(" is not supported");
        object = stringBuilder.toString();
        object3 = new MalformedJsonException((String)object);
        throw object3;
    }

    public void promoteNameToValue() {
        Object object = JsonToken.NAME;
        this.expect((JsonToken)((Object)object));
        object = (Map.Entry)((Iterator)this.peekStack()).next();
        Object object2 = object.getValue();
        this.push(object2);
        object = (String)object.getKey();
        object2 = new Object((String)object);
        this.push(object2);
    }

    public void skipValue() {
        JsonToken jsonToken = this.peek();
        int[] nArray = JsonTreeReader$2.$SwitchMap$com$google$gson$stream$JsonToken;
        int n3 = jsonToken.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 4;
                    if (n3 != n7) {
                        this.popStack();
                        n3 = this.stackSize;
                        if (n3 > 0) {
                            int n8;
                            int[] nArray2 = this.pathIndices;
                            nArray2[n3 -= n4] = n8 = nArray2[n3] + n4;
                        }
                    }
                } else {
                    this.endObject();
                }
            } else {
                this.endArray();
            }
        } else {
            this.nextName(n4 != 0);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("JsonTreeReader");
        String string2 = this.locationString();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

