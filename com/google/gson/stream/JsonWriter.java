/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonWriter
implements Closeable,
Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS;
    private static final Pattern VALID_JSON_NUMBER_PATTERN;
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack;
    private int stackSize;

    static {
        int n3;
        int n4 = 1;
        VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        REPLACEMENT_CHARS = new String[128];
        for (int i3 = 0; i3 <= (n3 = 31); i3 += n4) {
            String[] stringArray = REPLACEMENT_CHARS;
            Object object = i3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            stringArray[i3] = object = String.format("\\u%04x", objectArray);
        }
        String[] stringArray = REPLACEMENT_CHARS;
        stringArray[34] = "\\\"";
        stringArray[92] = "\\\\";
        stringArray[9] = "\\t";
        stringArray[8] = "\\b";
        stringArray[10] = "\\n";
        stringArray[13] = "\\r";
        stringArray[12] = "\\f";
        stringArray = (String[])stringArray.clone();
        HTML_SAFE_REPLACEMENT_CHARS = stringArray;
        stringArray[60] = "\\u003c";
        stringArray[62] = "\\u003e";
        stringArray[38] = "\\u0026";
        stringArray[61] = "\\u003d";
        stringArray[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        int[] nArray = new int[32];
        this.stack = nArray;
        this.stackSize = 0;
        this.push(6);
        this.separator = ":";
        this.serializeNulls = true;
        Objects.requireNonNull(writer, "out == null");
        this.out = writer;
    }

    private void beforeName() {
        block4: {
            block3: {
                int n3;
                int n4;
                block2: {
                    n4 = this.peek();
                    if (n4 != (n3 = 5)) break block2;
                    Writer writer = this.out;
                    n3 = 44;
                    writer.write(n3);
                    break block3;
                }
                n3 = 3;
                if (n4 != n3) break block4;
            }
            this.newline();
            this.replaceTop(4);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Nesting problem.");
        throw illegalStateException;
    }

    private void beforeValue() {
        int n3 = this.peek();
        int n4 = 1;
        int n7 = 2;
        if (n3 != n4) {
            if (n3 != n7) {
                n4 = 4;
                if (n3 != n4) {
                    n4 = 6;
                    n7 = 7;
                    if (n3 != n4) {
                        if (n3 == n7) {
                            n3 = (int)(this.lenient ? 1 : 0);
                            if (n3 == 0) {
                                IllegalStateException illegalStateException = new IllegalStateException("JSON must have only one top-level value.");
                                throw illegalStateException;
                            }
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("Nesting problem.");
                            throw illegalStateException;
                        }
                    }
                    this.replaceTop(n7);
                } else {
                    Writer writer = this.out;
                    String string2 = this.separator;
                    writer.append(string2);
                    n3 = 5;
                    this.replaceTop(n3);
                }
            } else {
                Writer writer = this.out;
                n4 = 44;
                writer.append((char)n4);
                this.newline();
            }
        } else {
            this.replaceTop(n7);
            this.newline();
        }
    }

    private JsonWriter close(int n3, int n4, char c2) {
        int n7 = this.peek();
        if (n7 != n4 && n7 != n3) {
            IllegalStateException illegalStateException = new IllegalStateException("Nesting problem.");
            throw illegalStateException;
        }
        Object object = this.deferredName;
        if (object == null) {
            this.stackSize = n3 = this.stackSize + -1;
            if (n7 == n4) {
                this.newline();
            }
            this.out.write(c2);
            return this;
        }
        CharSequence charSequence = new StringBuilder("Dangling name: ");
        String string2 = this.deferredName;
        charSequence.append(string2);
        charSequence = charSequence.toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    private static boolean isTrustedNumberType(Class clazz) {
        boolean bl2;
        Class clazz2 = Integer.class;
        if (clazz != clazz2 && clazz != (clazz2 = Long.class) && clazz != (clazz2 = Double.class) && clazz != (clazz2 = Float.class) && clazz != (clazz2 = Byte.class) && clazz != (clazz2 = Short.class) && clazz != (clazz2 = BigDecimal.class) && clazz != (clazz2 = BigInteger.class) && clazz != (clazz2 = AtomicInteger.class) && clazz != (clazz2 = AtomicLong.class)) {
            bl2 = false;
            clazz = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private void newline() {
        Object object = this.indent;
        if (object == null) {
            return;
        }
        object = this.out;
        ((Writer)object).write(10);
        int n3 = this.stackSize;
        for (int i3 = 1; i3 < n3; ++i3) {
            Writer writer = this.out;
            String string2 = this.indent;
            writer.write(string2);
        }
    }

    private JsonWriter open(int n3, char c2) {
        this.beforeValue();
        this.push(n3);
        this.out.write(c2);
        return this;
    }

    private int peek() {
        int n3 = this.stackSize;
        if (n3 != 0) {
            int[] nArray = this.stack;
            return nArray[n3 += -1];
        }
        IllegalStateException illegalStateException = new IllegalStateException("JsonWriter is closed.");
        throw illegalStateException;
    }

    private void push(int n3) {
        int[] nArray;
        int n4 = this.stackSize;
        int[] nArray2 = this.stack;
        int n7 = nArray2.length;
        if (n4 == n7) {
            this.stack = nArray = Arrays.copyOf(nArray2, n4 *= 2);
        }
        nArray = this.stack;
        int n8 = this.stackSize;
        this.stackSize = n7 = n8 + 1;
        nArray[n8] = n3;
    }

    private void replaceTop(int n3) {
        int[] nArray = this.stack;
        int n4 = this.stackSize + -1;
        nArray[n4] = n3;
    }

    private void string(String string2) {
        boolean bl2 = this.htmlSafe;
        Object object = bl2 ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        Writer writer = this.out;
        int n3 = 34;
        writer.write(n3);
        int n4 = string2.length();
        int n7 = 0;
        Writer writer2 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            String string3;
            int n8;
            int n10 = string2.charAt(i3);
            if (n10 < (n8 = 128)) {
                string3 = object[n10];
                if (string3 == null) {
                    continue;
                }
            } else {
                n8 = 8232;
                if (n10 == n8) {
                    string3 = "\\u2028";
                } else {
                    n8 = 8233;
                    if (n10 != n8) continue;
                    string3 = "\\u2029";
                }
            }
            if (n7 < i3) {
                Writer writer3 = this.out;
                int n14 = i3 - n7;
                writer3.write(string2, n7, n14);
            }
            writer2 = this.out;
            writer2.write(string3);
            n7 = i3 + 1;
        }
        if (n7 < n4) {
            object = this.out;
            ((Writer)object).write(string2, n7, n4 -= n7);
        }
        this.out.write(n3);
    }

    private void writeDeferredName() {
        String string2 = this.deferredName;
        if (string2 != null) {
            this.beforeName();
            string2 = this.deferredName;
            this.string(string2);
            string2 = null;
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() {
        this.writeDeferredName();
        return this.open(1, '[');
    }

    public JsonWriter beginObject() {
        this.writeDeferredName();
        return this.open(3, '{');
    }

    public void close() {
        Object object;
        block2: {
            block3: {
                object = this.out;
                ((Writer)object).close();
                int n3 = this.stackSize;
                int n4 = 1;
                if (n3 > n4) break block2;
                if (n3 != n4) break block3;
                int[] nArray = this.stack;
                n3 -= n4;
                n4 = 7;
                if ((n3 = nArray[n3]) != n4) break block2;
            }
            this.stackSize = 0;
            return;
        }
        object = new IOException("Incomplete document");
        throw object;
    }

    public JsonWriter endArray() {
        return this.close(1, 2, ']');
    }

    public JsonWriter endObject() {
        return this.close(3, 5, '}');
    }

    public void flush() {
        int n3 = this.stackSize;
        if (n3 != 0) {
            this.out.flush();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("JsonWriter is closed.");
        throw illegalStateException;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public JsonWriter jsonValue(String string2) {
        if (string2 == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        this.out.append(string2);
        return this;
    }

    public JsonWriter name(String object) {
        Objects.requireNonNull(object, "name == null");
        String string2 = this.deferredName;
        if (string2 == null) {
            int n3 = this.stackSize;
            if (n3 != 0) {
                this.deferredName = object;
                return this;
            }
            object = new IllegalStateException("JsonWriter is closed.");
            throw object;
        }
        object = new IllegalStateException();
        throw object;
    }

    public JsonWriter nullValue() {
        String string2 = this.deferredName;
        if (string2 != null) {
            boolean bl2 = this.serializeNulls;
            if (bl2) {
                this.writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        this.beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean bl2) {
        this.htmlSafe = bl2;
    }

    public final void setIndent(String string2) {
        int n3 = string2.length();
        if (n3 == 0) {
            this.indent = null;
            this.separator = string2 = ":";
        } else {
            this.indent = string2;
            this.separator = string2 = ": ";
        }
    }

    public final void setLenient(boolean bl2) {
        this.lenient = bl2;
    }

    public final void setSerializeNulls(boolean bl2) {
        this.serializeNulls = bl2;
    }

    public JsonWriter value(double d2) {
        this.writeDeferredName();
        boolean bl2 = this.lenient;
        if (!bl2 && ((bl2 = Double.isNaN(d2)) || (bl2 = Double.isInfinite(d2)))) {
            StringBuilder stringBuilder = new StringBuilder("Numeric values must be finite, but was ");
            stringBuilder.append(d2);
            String string2 = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.beforeValue();
        Writer writer = this.out;
        String string3 = Double.toString(d2);
        writer.append(string3);
        return this;
    }

    public JsonWriter value(float f5) {
        this.writeDeferredName();
        boolean bl2 = this.lenient;
        if (!bl2 && ((bl2 = Float.isNaN(f5)) || (bl2 = Float.isInfinite(f5)))) {
            StringBuilder stringBuilder = new StringBuilder("Numeric values must be finite, but was ");
            stringBuilder.append(f5);
            String string2 = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.beforeValue();
        Writer writer = this.out;
        String string3 = Float.toString(f5);
        writer.append(string3);
        return this;
    }

    public JsonWriter value(long l2) {
        this.writeDeferredName();
        this.beforeValue();
        Writer writer = this.out;
        String string2 = Long.toString(l2);
        writer.write(string2);
        return this;
    }

    public JsonWriter value(Boolean object) {
        if (object == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        Writer writer = this.out;
        boolean bl2 = (Boolean)object;
        object = bl2 ? "true" : "false";
        writer.write((String)object);
        return this;
    }

    public JsonWriter value(Number object) {
        String string2;
        block8: {
            block7: {
                block6: {
                    if (object == null) {
                        return this.nullValue();
                    }
                    this.writeDeferredName();
                    string2 = object.toString();
                    Object object2 = "-Infinity";
                    boolean bl2 = string2.equals(object2);
                    if (bl2 || (bl2 = string2.equals(object2 = "Infinity")) || (bl2 = string2.equals(object2 = "NaN"))) break block6;
                    bl2 = JsonWriter.isTrustedNumberType((Class)(object = object.getClass()));
                    if (!bl2 && !(bl2 = ((Matcher)(object2 = VALID_JSON_NUMBER_PATTERN.matcher(string2))).matches())) {
                        StringBuilder stringBuilder = new StringBuilder("String created by ");
                        stringBuilder.append(object);
                        stringBuilder.append(" is not a valid JSON number: ");
                        stringBuilder.append(string2);
                        object = stringBuilder.toString();
                        object2 = new IllegalArgumentException((String)object);
                        throw object2;
                    }
                    break block7;
                }
                boolean bl3 = this.lenient;
                if (!bl3) break block8;
            }
            this.beforeValue();
            this.out.append(string2);
            return this;
        }
        string2 = "Numeric values must be finite, but was ".concat(string2);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public JsonWriter value(String string2) {
        if (string2 == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        this.string(string2);
        return this;
    }

    public JsonWriter value(boolean bl2) {
        this.writeDeferredName();
        this.beforeValue();
        Writer writer = this.out;
        String string2 = bl2 ? "true" : "false";
        writer.write(string2);
        return this;
    }
}

