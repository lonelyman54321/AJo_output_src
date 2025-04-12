/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.NonNullElementWrapperList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray
extends JsonElement
implements Iterable {
    private final ArrayList elements;

    public JsonArray() {
        ArrayList arrayList;
        this.elements = arrayList = new ArrayList();
    }

    public JsonArray(int n3) {
        ArrayList arrayList;
        this.elements = arrayList = new ArrayList(n3);
    }

    private JsonElement getAsSingleElement() {
        int n3;
        Object object = this.elements;
        int n4 = ((ArrayList)object).size();
        if (n4 == (n3 = 1)) {
            return (JsonElement)this.elements.get(0);
        }
        object = hj0_0.a(n4, "Array must have size 1, but has size ");
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.elements.add(jsonElement);
    }

    public void add(Boolean object) {
        ArrayList arrayList = this.elements;
        if (object == null) {
            object = JsonNull.INSTANCE;
        } else {
            JsonPrimitive jsonPrimitive = new JsonPrimitive((Boolean)object);
            object = jsonPrimitive;
        }
        arrayList.add(object);
    }

    public void add(Character object) {
        ArrayList arrayList = this.elements;
        if (object == null) {
            object = JsonNull.INSTANCE;
        } else {
            JsonPrimitive jsonPrimitive = new JsonPrimitive((Character)object);
            object = jsonPrimitive;
        }
        arrayList.add(object);
    }

    public void add(Number object) {
        ArrayList arrayList = this.elements;
        if (object == null) {
            object = JsonNull.INSTANCE;
        } else {
            JsonPrimitive jsonPrimitive = new JsonPrimitive((Number)object);
            object = jsonPrimitive;
        }
        arrayList.add(object);
    }

    public void add(String object) {
        ArrayList arrayList = this.elements;
        if (object == null) {
            object = JsonNull.INSTANCE;
        } else {
            JsonPrimitive jsonPrimitive = new JsonPrimitive((String)object);
            object = jsonPrimitive;
        }
        arrayList.add(object);
    }

    public void addAll(JsonArray iterable) {
        ArrayList arrayList = this.elements;
        iterable = iterable.elements;
        arrayList.addAll(iterable);
    }

    public List asList() {
        ArrayList arrayList = this.elements;
        NonNullElementWrapperList nonNullElementWrapperList = new NonNullElementWrapperList(arrayList);
        return nonNullElementWrapperList;
    }

    public boolean contains(JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    public JsonArray deepCopy() {
        Iterable iterable = this.elements;
        boolean bl2 = ((ArrayList)iterable).isEmpty();
        if (!bl2) {
            boolean bl3;
            int n3 = this.elements.size();
            iterable = new Iterable(n3);
            Iterator iterator = this.elements.iterator();
            while (bl3 = iterator.hasNext()) {
                JsonElement jsonElement = ((JsonElement)iterator.next()).deepCopy();
                ((JsonArray)iterable).add(jsonElement);
            }
            return iterable;
        }
        iterable = new Iterable();
        return iterable;
    }

    public boolean equals(Object object) {
        ArrayList arrayList;
        boolean bl2;
        boolean bl3;
        if (!(object == this || (bl3 = object instanceof JsonArray) && (bl2 = ((ArrayList)(object = ((JsonArray)object).elements)).equals(arrayList = this.elements)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public JsonElement get(int n3) {
        return (JsonElement)this.elements.get(n3);
    }

    public BigDecimal getAsBigDecimal() {
        return this.getAsSingleElement().getAsBigDecimal();
    }

    public BigInteger getAsBigInteger() {
        return this.getAsSingleElement().getAsBigInteger();
    }

    public boolean getAsBoolean() {
        return this.getAsSingleElement().getAsBoolean();
    }

    public byte getAsByte() {
        return this.getAsSingleElement().getAsByte();
    }

    public char getAsCharacter() {
        return this.getAsSingleElement().getAsCharacter();
    }

    public double getAsDouble() {
        return this.getAsSingleElement().getAsDouble();
    }

    public float getAsFloat() {
        return this.getAsSingleElement().getAsFloat();
    }

    public int getAsInt() {
        return this.getAsSingleElement().getAsInt();
    }

    public long getAsLong() {
        return this.getAsSingleElement().getAsLong();
    }

    public Number getAsNumber() {
        return this.getAsSingleElement().getAsNumber();
    }

    public short getAsShort() {
        return this.getAsSingleElement().getAsShort();
    }

    public String getAsString() {
        return this.getAsSingleElement().getAsString();
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public Iterator iterator() {
        return this.elements.iterator();
    }

    public JsonElement remove(int n3) {
        return (JsonElement)this.elements.remove(n3);
    }

    public boolean remove(JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public JsonElement set(int n3, JsonElement jsonElement) {
        ArrayList arrayList = this.elements;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        return arrayList.set(n3, jsonElement);
    }

    public int size() {
        return this.elements.size();
    }
}

