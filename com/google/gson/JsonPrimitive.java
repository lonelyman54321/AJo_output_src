/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class JsonPrimitive
extends JsonElement {
    private final Object value;

    public JsonPrimitive(Boolean bl2) {
        Objects.requireNonNull(bl2);
        this.value = bl2;
    }

    public JsonPrimitive(Character object) {
        Objects.requireNonNull(object);
        this.value = object = ((Character)object).toString();
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.value = number;
    }

    public JsonPrimitive(String string2) {
        Objects.requireNonNull(string2);
        this.value = string2;
    }

    private static boolean isIntegral(JsonPrimitive object) {
        boolean bl2;
        object = ((JsonPrimitive)object).value;
        boolean bl3 = object instanceof Number;
        boolean bl4 = false;
        if (bl3 && ((bl3 = (object = (Number)object) instanceof BigInteger) || (bl3 = object instanceof Long) || (bl3 = object instanceof Integer) || (bl3 = object instanceof Short) || (bl2 = object instanceof Byte))) {
            bl4 = true;
        }
        return bl4;
    }

    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = JsonPrimitive.class) == (object2 = object.getClass())) {
            object = (JsonPrimitive)object;
            object2 = this.value;
            if (object2 == null) {
                object = ((JsonPrimitive)object).value;
                if (object != null) {
                    bl2 = false;
                }
                return bl2;
            }
            boolean bl3 = JsonPrimitive.isIntegral(this);
            if (bl3 && (bl3 = JsonPrimitive.isIntegral((JsonPrimitive)object))) {
                long l2;
                object2 = this.getAsNumber();
                long l3 = ((Number)object2).longValue();
                long l4 = l3 - (l2 = ((Number)(object = ((JsonPrimitive)object).getAsNumber())).longValue());
                Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object4 != false) {
                    bl2 = false;
                }
                return bl2;
            }
            object2 = this.value;
            boolean bl4 = object2 instanceof Number;
            if (bl4 && (bl4 = (object3 = ((JsonPrimitive)object).value) instanceof Number)) {
                double d2;
                object2 = this.getAsNumber();
                double d5 = ((Number)object2).doubleValue();
                double d7 = d5 - (d2 = ((Number)(object = ((JsonPrimitive)object).getAsNumber())).doubleValue());
                Object object5 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                if (object5 != false && ((object5 = (Object)Double.isNaN(d5)) == false || (object5 = (Object)Double.isNaN(d2)) == false)) {
                    bl2 = false;
                }
                return bl2;
            }
            object = ((JsonPrimitive)object).value;
            return object2.equals(object);
        }
        return false;
    }

    public BigDecimal getAsBigDecimal() {
        Object object = this.value;
        boolean bl2 = object instanceof BigDecimal;
        if (bl2) {
            object = (BigDecimal)object;
        } else {
            String string2 = this.getAsString();
            object = new BigDecimal(string2);
        }
        return object;
    }

    public BigInteger getAsBigInteger() {
        Object object = this.value;
        boolean bl2 = object instanceof BigInteger;
        if (bl2) {
            object = (BigInteger)object;
        } else {
            String string2 = this.getAsString();
            object = new BigInteger(string2);
        }
        return object;
    }

    public boolean getAsBoolean() {
        boolean bl2 = this.isBoolean();
        if (bl2) {
            return (Boolean)this.value;
        }
        return Boolean.parseBoolean(this.getAsString());
    }

    public byte getAsByte() {
        byte by2 = this.isNumber();
        if (by2 != 0) {
            Number number = this.getAsNumber();
            by2 = number.byteValue();
        } else {
            String string2 = this.getAsString();
            by2 = Byte.parseByte(string2);
        }
        return by2;
    }

    public char getAsCharacter() {
        Object object = this.getAsString();
        boolean bl2 = ((String)object).isEmpty();
        if (!bl2) {
            return ((String)object).charAt(0);
        }
        object = new UnsupportedOperationException("String value is empty");
        throw object;
    }

    public double getAsDouble() {
        double d2;
        boolean bl2 = this.isNumber();
        if (bl2) {
            Number number = this.getAsNumber();
            d2 = number.doubleValue();
        } else {
            String string2 = this.getAsString();
            d2 = Double.parseDouble(string2);
        }
        return d2;
    }

    public float getAsFloat() {
        float f5;
        boolean bl2 = this.isNumber();
        if (bl2) {
            Number number = this.getAsNumber();
            f5 = number.floatValue();
        } else {
            String string2 = this.getAsString();
            f5 = Float.parseFloat(string2);
        }
        return f5;
    }

    public int getAsInt() {
        int n3 = this.isNumber();
        if (n3 != 0) {
            Number number = this.getAsNumber();
            n3 = number.intValue();
        } else {
            String string2 = this.getAsString();
            n3 = Integer.parseInt(string2);
        }
        return n3;
    }

    public long getAsLong() {
        long l2;
        boolean bl2 = this.isNumber();
        if (bl2) {
            Number number = this.getAsNumber();
            l2 = number.longValue();
        } else {
            String string2 = this.getAsString();
            l2 = Long.parseLong(string2);
        }
        return l2;
    }

    public Number getAsNumber() {
        Object object = this.value;
        boolean bl2 = object instanceof Number;
        if (bl2) {
            return (Number)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            object = (String)object;
            LazilyParsedNumber lazilyParsedNumber = new LazilyParsedNumber((String)object);
            return lazilyParsedNumber;
        }
        object = new UnsupportedOperationException("Primitive is neither a number nor a string");
        throw object;
    }

    public short getAsShort() {
        short s7 = this.isNumber();
        if (s7 != 0) {
            Number number = this.getAsNumber();
            s7 = number.shortValue();
        } else {
            String string2 = this.getAsString();
            s7 = Short.parseShort(string2);
        }
        return s7;
    }

    public String getAsString() {
        Object object = this.value;
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        boolean bl3 = this.isNumber();
        if (bl3) {
            return this.getAsNumber().toString();
        }
        bl3 = this.isBoolean();
        if (bl3) {
            return ((Boolean)this.value).toString();
        }
        CharSequence charSequence = new StringBuilder("Unexpected value type: ");
        Class<?> clazz = this.value.getClass();
        charSequence.append(clazz);
        charSequence = charSequence.toString();
        object = new AssertionError(charSequence);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int hashCode() {
        long l2;
        Object object = this.value;
        if (object == null) {
            return 31;
        }
        boolean bl2 = JsonPrimitive.isIntegral(this);
        int n3 = 32;
        if (bl2) {
            object = this.getAsNumber();
            l2 = ((Number)object).longValue();
            return (int)(l2 >>> n3 ^ l2);
        }
        object = this.value;
        boolean bl3 = object instanceof Number;
        if (!bl3) return object.hashCode();
        object = this.getAsNumber();
        double d2 = ((Number)object).doubleValue();
        l2 = Double.doubleToLongBits(d2);
        return (int)(l2 >>> n3 ^ l2);
    }

    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    public boolean isNumber() {
        return this.value instanceof Number;
    }

    public boolean isString() {
        return this.value instanceof String;
    }
}

