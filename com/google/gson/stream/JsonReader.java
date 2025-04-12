/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.stream.JsonReader$1;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class JsonReader
implements Closeable {
    static final int BUFFER_SIZE = 1024;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer;
    private final Reader in;
    private boolean lenient = false;
    private int limit;
    private int lineNumber;
    private int lineStart;
    private int[] pathIndices;
    private String[] pathNames;
    int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int pos;
    private int[] stack;
    private int stackSize;

    static {
        JsonReader$1 jsonReader$1 = new JsonReader$1();
        JsonReaderInternalAccess.INSTANCE = jsonReader$1;
    }

    public JsonReader(Reader reader) {
        char[] cArray = new char[1024];
        this.buffer = cArray;
        this.pos = 0;
        this.limit = 0;
        this.lineNumber = 0;
        this.lineStart = 0;
        this.peeked = 0;
        int n3 = 32;
        int[] nArray = new int[n3];
        this.stack = nArray;
        this.stackSize = 1;
        nArray[0] = 6;
        Object[] objectArray = new String[n3];
        this.pathNames = objectArray;
        objectArray = new int[n3];
        this.pathIndices = (int[])objectArray;
        Objects.requireNonNull(reader, "in == null");
        this.in = reader;
    }

    private void checkLenient() {
        boolean bl2 = this.lenient;
        if (bl2) {
            return;
        }
        throw this.syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void consumeNonExecutePrefix() {
        int n3;
        this.nextNonWhitespace(true);
        int n4 = this.pos;
        this.pos = n3 = n4 + -1;
        n3 = this.limit;
        int n7 = 5;
        if ((n4 += 4) > n3 && (n4 = (int)(this.fillBuffer(n7) ? 1 : 0)) == 0) {
            return;
        }
        char[] cArray = this.buffer;
        n4 = this.pos;
        int n8 = cArray[n4];
        int n10 = 41;
        if (n8 == n10) {
            n8 = n4 + 1;
            n10 = 93;
            if ((n8 = cArray[n8]) == n10) {
                n8 = n4 + 2;
                n10 = 125;
                if ((n8 = cArray[n8]) == n10) {
                    n8 = n4 + 3;
                    n10 = 39;
                    if ((n8 = cArray[n8]) == n10) {
                        n8 = n4 + 4;
                        n3 = cArray[n8];
                        if (n3 == (n8 = 10)) {
                            this.pos = n4 += n7;
                        }
                    }
                }
            }
        }
    }

    private boolean fillBuffer(int n3) {
        block3: {
            int n4;
            char[] cArray = this.buffer;
            int n7 = this.lineStart;
            int n8 = this.pos;
            this.lineStart = n7 -= n8;
            n7 = this.limit;
            if (n7 != n8) {
                this.limit = n7 -= n8;
                System.arraycopy(cArray, n8, cArray, 0, n7);
            } else {
                this.limit = 0;
            }
            this.pos = 0;
            do {
                int n10;
                int n14;
                Reader reader = this.in;
                n8 = this.limit;
                n4 = cArray.length - n8;
                n7 = reader.read(cArray, n8, n4);
                if (n7 == (n8 = -1)) break block3;
                this.limit = n8 = this.limit + n7;
                n7 = this.lineNumber;
                n4 = 1;
                if (n7 != 0 || (n7 = this.lineStart) != 0 || n8 <= 0 || (n14 = cArray[0]) != (n10 = 65279)) continue;
                this.pos = n14 = this.pos + n4;
                this.lineStart = ++n7;
                ++n3;
            } while (n8 < n3);
            return n4 != 0;
        }
        return false;
    }

    private String getPath(boolean bl2) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder("$");
        for (int i3 = 0; i3 < (n3 = this.stackSize); ++i3) {
            int[] nArray = this.stack;
            int n4 = nArray[i3];
            int n7 = 1;
            if (n4 != n7 && n4 != (n7 = 2)) {
                n3 = 3;
                if (n4 != n3 && n4 != (n3 = 4) && n4 != (n3 = 5)) continue;
                n3 = 46;
                stringBuilder.append((char)n3);
                String string2 = this.pathNames[i3];
                if (string2 == null) continue;
                stringBuilder.append(string2);
                continue;
            }
            nArray = this.pathIndices;
            n4 = nArray[i3];
            if (bl2 && n4 > 0 && i3 == (n3 += -1)) {
                n4 += -1;
            }
            stringBuilder.append('[');
            stringBuilder.append(n4);
            n3 = 93;
            stringBuilder.append((char)n3);
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    private boolean isLiteral(char var1_1) {
        block4: {
            var2_2 = 9;
            if (var1_1 == var2_2 || var1_1 == (var2_2 = 10) || var1_1 == (var2_2 = 12) || var1_1 == (var2_2 = 13) || var1_1 == (var2_2 = 32)) break block4;
            var2_2 = 35;
            if (var1_1 == var2_2) ** GOTO lbl-1000
            var2_2 = 44;
            if (var1_1 == var2_2) break block4;
            var2_2 = 47;
            if (var1_1 == var2_2 || var1_1 == (var2_2 = 61)) ** GOTO lbl-1000
            var2_2 = 123;
            if (var1_1 == var2_2 || var1_1 == (var2_2 = 125) || var1_1 == (var2_2 = 58)) break block4;
            var2_2 = 59;
            if (var1_1 == var2_2) ** GOTO lbl-1000
            switch (var1_1) {
                default: {
                    return true;
                }
                case 92: lbl-1000:
                // 4 sources

                {
                    this.checkLenient();
                }
                case 91: 
                case 93: 
            }
        }
        return false;
    }

    private int nextNonWhitespace(boolean bl2) {
        Object object = this.buffer;
        int n3 = this.pos;
        Object object2 = this.limit;
        while (true) {
            String string2;
            Object object3 = 1;
            if (n3 == object2) {
                this.pos = n3;
                n3 = (int)(this.fillBuffer((int)object3) ? 1 : 0);
                if (n3 == 0) {
                    if (!bl2) {
                        return -1;
                    }
                    object = new StringBuilder;
                    ((StringBuilder)object)("End of input");
                    string2 = this.locationString();
                    ((StringBuilder)object).append(string2);
                    object = ((StringBuilder)object).toString();
                    EOFException eOFException = new EOFException((String)object);
                    throw eOFException;
                }
                n3 = this.pos;
                object2 = this.limit;
            }
            int n4 = n3 + 1;
            int n7 = object[n3];
            int n8 = 10;
            if (n7 == n8) {
                this.lineNumber = n3 = this.lineNumber + object3;
                this.lineStart = n4;
            } else {
                n8 = 32;
                if (n7 != n8 && n7 != (n8 = 13) && n7 != (n8 = 9)) {
                    n8 = 47;
                    if (n7 == n8) {
                        this.pos = n4;
                        int n10 = 2;
                        if (n4 == object2) {
                            this.pos = n3;
                            n3 = (int)(this.fillBuffer(n10) ? 1 : 0);
                            this.pos = object2 = this.pos + object3;
                            if (n3 == 0) {
                                return n7;
                            }
                        }
                        this.checkLenient();
                        n3 = this.pos;
                        object2 = object[n3];
                        object3 = 42;
                        if (object2 != object3) {
                            if (object2 != n8) {
                                return n7;
                            }
                            this.pos = ++n3;
                            this.skipToEndOfLine();
                            n3 = this.pos;
                            object2 = this.limit;
                            continue;
                        }
                        this.pos = ++n3;
                        string2 = "*/";
                        n3 = (int)(this.skipTo(string2) ? 1 : 0);
                        if (n3 != 0) {
                            n3 = this.pos + n10;
                            object2 = this.limit;
                            continue;
                        }
                        throw this.syntaxError("Unterminated comment");
                    }
                    n3 = 35;
                    if (n7 == n3) {
                        this.pos = n4;
                        this.checkLenient();
                        this.skipToEndOfLine();
                        n3 = this.pos;
                        object2 = this.limit;
                        continue;
                    }
                    this.pos = n4;
                    return n7;
                }
            }
            n3 = n4;
        }
    }

    private String nextQuotedValue(char c2) {
        int n3;
        char[] cArray = this.buffer;
        int n4 = 0;
        StringBuilder stringBuilder = null;
        do {
            int n7;
            int n8;
            int n10;
            n3 = this.pos;
            int n14 = this.limit;
            block1: while (true) {
                n10 = n14;
                n14 = n3;
                while (true) {
                    n8 = 16;
                    n7 = 1;
                    if (n3 >= n10) break block1;
                    int n15 = n3 + 1;
                    if ((n3 = cArray[n3]) == c2) {
                        this.pos = n15;
                        n15 = n15 - n14 - n7;
                        if (stringBuilder == null) {
                            String string2 = new String(cArray, n14, n15);
                            return string2;
                        }
                        stringBuilder.append(cArray, n14, n15);
                        return stringBuilder.toString();
                    }
                    int n16 = 92;
                    if (n3 == n16) {
                        this.pos = n15;
                        n3 = (n15 -= n14) + -1;
                        if (stringBuilder == null) {
                            n10 = Math.max(n15 *= 2, n8);
                            stringBuilder = new StringBuilder(n10);
                        }
                        stringBuilder.append(cArray, n14, n3);
                        n3 = this.readEscapeCharacter();
                        stringBuilder.append((char)n3);
                        n3 = this.pos;
                        n14 = this.limit;
                        continue block1;
                    }
                    n8 = 10;
                    if (n3 == n8) {
                        this.lineNumber = n3 = this.lineNumber + n7;
                        this.lineStart = n15;
                    }
                    n3 = n15;
                }
                break;
            }
            if (stringBuilder == null) {
                StringBuilder stringBuilder2;
                n4 = (n3 - n14) * 2;
                n4 = Math.max(n4, n8);
                stringBuilder = stringBuilder2 = new StringBuilder(n4);
            }
            n10 = n3 - n14;
            stringBuilder.append(cArray, n14, n10);
            this.pos = n3;
            n3 = (int)(this.fillBuffer(n7) ? 1 : 0);
        } while (n3 != 0);
        throw this.syntaxError("Unterminated string");
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private String nextUnquotedValue() {
        var1_1 = null;
        var2_2 = 0;
        do {
            block10: {
                var3_3 = 0;
                var4_4 = null;
                block5: while (true) {
                    if ((var6_6 = (var5_5 = this.pos) + var3_3) >= (var7_7 = this.limit)) ** GOTO lbl29
                    var8_8 = this.buffer;
                    var5_5 += var3_3;
                    var6_6 = 9;
                    if ((var5_5 = var8_8[var5_5]) == var6_6 || var5_5 == (var6_6 = 10) || var5_5 == (var6_6 = 12) || var5_5 == (var6_6 = 13) || var5_5 == (var6_6 = 32)) break;
                    var6_6 = 35;
                    if (var5_5 == var6_6) ** GOTO lbl-1000
                    var6_6 = 44;
                    if (var5_5 == var6_6) break;
                    var6_6 = 47;
                    if (var5_5 == var6_6 || var5_5 == (var6_6 = 61)) ** GOTO lbl-1000
                    var6_6 = 123;
                    if (var5_5 == var6_6 || var5_5 == (var6_6 = 125) || var5_5 == (var6_6 = 58)) break;
                    var6_6 = 59;
                    if (var5_5 == var6_6) ** GOTO lbl-1000
                    switch (var5_5) {
                        default: {
                            ++var3_3;
                            continue block5;
                        }
                        case 92: lbl-1000:
                        // 4 sources

                        {
                            this.checkLenient();
                            break block5;
                        }
lbl29:
                        // 1 sources

                        var9_9 = this.buffer;
                        var5_5 = var9_9.length;
                        if (var3_3 < var5_5) {
                            var5_5 = var3_3 + 1;
                            if ((var5_5 = (int)this.fillBuffer(var5_5)) == 0) break block5;
                            continue block5;
                        }
                        break block10;
                        case 91: 
                        case 93: 
                    }
                    break;
                }
                var2_2 = var3_3;
                break;
            }
            if (var1_1 == null) {
                var5_5 = Math.max(var3_3, 16);
                var1_1 = new StringBuilder(var5_5);
            }
            var9_9 = this.buffer;
            var6_6 = this.pos;
            var1_1.append(var9_9, var6_6, var3_3);
            this.pos = var5_5 = this.pos + var3_3;
        } while ((var3_3 = (int)this.fillBuffer(1)) != 0);
        if (var1_1 == null) {
            var4_4 = this.buffer;
            var5_5 = this.pos;
            var1_1 = new String(var4_4, var5_5, var2_2);
        } else {
            var4_4 = this.buffer;
            var5_5 = this.pos;
            var1_1.append(var4_4, var5_5, var2_2);
            var1_1 = var1_1.toString();
        }
        this.pos = var3_3 = this.pos + var2_2;
        return var1_1;
    }

    private int peekKeyword() {
        int n3;
        int n4;
        int n7;
        block13: {
            int n8;
            Object object;
            block12: {
                String string2;
                object = this.buffer;
                n8 = this.pos;
                n7 = object[n8];
                if (n7 != (n8 = 116) && n7 != (n8 = 84)) {
                    n8 = 102;
                    if (n7 != n8 && n7 != (n8 = 70)) {
                        n8 = 110;
                        if (n7 != n8 && n7 != (n8 = 78)) {
                            return 0;
                        }
                        object = "null";
                        string2 = "NULL";
                        n4 = 7;
                    } else {
                        object = "false";
                        string2 = "FALSE";
                        n4 = 6;
                    }
                } else {
                    object = "true";
                    string2 = "TRUE";
                    n4 = 5;
                }
                n3 = ((String)object).length();
                for (int i3 = 1; i3 < n3; ++i3) {
                    int n10 = this.pos + i3;
                    int n14 = this.limit;
                    if (n10 >= n14) {
                        n10 = i3 + 1;
                        if ((n10 = (int)(this.fillBuffer(n10) ? 1 : 0)) == 0) {
                            return 0;
                        }
                    }
                    char[] cArray = this.buffer;
                    n14 = this.pos + i3;
                    n10 = cArray[n14];
                    if (n10 == (n14 = (int)((String)object).charAt(i3)) || n10 == (n14 = (int)string2.charAt(i3))) continue;
                    return 0;
                }
                n7 = this.pos + n3;
                n8 = this.limit;
                if (n7 < n8) break block12;
                n7 = n3 + 1;
                if ((n7 = (int)(this.fillBuffer(n7) ? 1 : 0)) == 0) break block13;
            }
            object = this.buffer;
            n8 = this.pos + n3;
            n7 = object[n8];
            if ((n7 = (int)(this.isLiteral((char)n7) ? 1 : 0)) != 0) {
                return 0;
            }
        }
        this.pos = n7 = this.pos + n3;
        this.peeked = n4;
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    private int peekNumber() {
        var1_1 = this;
        var2_2 = this.buffer;
        var3_3 = this.pos;
        var4_4 = this.limit;
        var5_5 = 0;
        var6_6 = 1;
        var7_7 = 0;
        var8_8 = 0;
        var9_9 = 1;
        var10_10 = 0L;
        var12_11 = false;
        while (true) {
            block21: {
                block24: {
                    block25: {
                        block29: {
                            block23: {
                                block26: {
                                    block27: {
                                        block28: {
                                            block22: {
                                                var13_12 = var3_3 + var7_7;
                                                var14_13 = 2;
                                                if (var13_12 != var4_4) break block22;
                                                var3_3 = var2_2.length;
                                                if (var7_7 == var3_3) {
                                                    return 0;
                                                }
                                                var3_3 = var7_7 + 1;
                                                if ((var3_3 = (int)var1_1.fillBuffer(var3_3)) == 0) break block23;
                                                var3_3 = var1_1.pos;
                                                var4_4 = var1_1.limit;
                                            }
                                            var13_12 = var3_3 + var7_7;
                                            var13_12 = var2_2[var13_12];
                                            var5_5 = 43;
                                            var15_14 = 5;
                                            if (var13_12 == var5_5) break block24;
                                            var5_5 = 69;
                                            if (var13_12 == var5_5 || var13_12 == (var5_5 = 101)) ** GOTO lbl111
                                            var5_5 = 45;
                                            if (var13_12 == var5_5) ** GOTO lbl99
                                            var5_5 = 46;
                                            var16_15 = 3;
                                            if (var13_12 == var5_5) break block25;
                                            var5_5 = 48;
                                            if (var13_12 < var5_5 || var13_12 > (var5_5 = 57)) break block26;
                                            if (var8_8 == var6_6 || var8_8 == 0) break block27;
                                            if (var8_8 == var14_13) {
                                                var17_16 = 0L;
                                                cfr_temp_0 = var10_10 - var17_16;
                                                var16_15 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                if (var16_15 == 0) {
                                                    return 0;
                                                }
                                                var19_17 = (long)10 * var10_10;
                                                var21_18 = var13_12 += -48;
                                                var19_17 -= var21_18;
                                                var21_18 = -922337203685477580L;
                                                cfr_temp_1 = var10_10 - var21_18;
                                                var5_5 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                var5_5 = var5_5 <= 0 && (var5_5 != 0 || (var5_5 = (int)(var19_17 == var10_10 ? 0 : (var19_17 < var10_10 ? -1 : 1))) >= 0) ? 0 : 1;
                                                var9_9 &= var5_5;
                                                var10_10 = var19_17;
                                                while (true) {
                                                    var5_5 = 0;
lbl56:
                                                    // 4 sources

                                                    while (true) {
                                                        var17_16 = 0L;
                                                        break block21;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            if (var8_8 != var16_15) break block28;
                                            var5_5 = 0;
                                            var8_8 = 4;
                                            ** GOTO lbl56
                                        }
                                        if (var8_8 != var15_14 && var8_8 != (var16_15 = 6)) ** continue;
                                        var5_5 = 0;
                                        var8_8 = 7;
                                        ** GOTO lbl56
                                    }
                                    var16_15 = -(var13_12 += -48);
                                    var10_10 = var16_15;
                                    var5_5 = 0;
                                    var8_8 = 2;
                                    ** continue;
                                }
                                var23_19 = (int)var1_1.isLiteral((char)var13_12);
                                if (var23_19 != 0) break block29;
                            }
                            if (!(var8_8 != var14_13 || var9_9 == 0 || (var4_4 = (int)((cfr_temp_2 = var10_10 - (var24_20 = -9223372036854775808L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) == 0 && !var12_11 || (var23_19 = (int)((cfr_temp_3 = var10_10 - (var17_16 = 0L)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) == 0 && var12_11)) {
                                if (!var12_11) {
                                    var10_10 = -var10_10;
                                }
                                var1_1.peekedLong = var10_10;
                                var1_1.pos = var23_19 = var1_1.pos + var7_7;
                                var1_1.peeked = var23_19 = 15;
                                return var23_19;
                            }
                            if (var8_8 != var14_13 && var8_8 != (var23_19 = 4) && var8_8 != (var23_19 = 7)) {
                                return 0;
                            }
                            var1_1.peekedNumberLength = var7_7;
                            var1_1.peeked = var23_19 = 16;
                            return var23_19;
                        }
                        return 0;
                    }
                    var5_5 = 0;
                    var17_16 = 0L;
                    if (var8_8 == var14_13) {
                        var8_8 = 3;
                    } else {
                        return 0;
lbl99:
                        // 1 sources

                        var16_15 = 6;
                        var5_5 = 0;
                        var17_16 = 0L;
                        if (var8_8 == 0) {
                            var8_8 = 1;
                            var12_11 = true;
                        } else if (var8_8 == var15_14) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var8_8 = 6;
                                ** GOTO lbl123
                                break;
                            }
                        } else {
                            return 0;
lbl111:
                            // 1 sources

                            var5_5 = 0;
                            var17_16 = 0L;
                            if (var8_8 != var14_13 && var8_8 != (var16_15 = 4)) {
                                return 0;
                            }
                            var8_8 = 5;
                        }
                    }
                    break block21;
                }
                var16_15 = 6;
                var5_5 = 0;
                var17_16 = 0L;
                if (var8_8 != var15_14) break;
                ** continue;
            }
            ++var7_7;
        }
        return 0;
    }

    private void push(int n3) {
        Object[] objectArray;
        int n4 = this.stackSize;
        Object[] objectArray2 = this.stack;
        int n7 = objectArray2.length;
        if (n4 == n7) {
            this.stack = objectArray2 = Arrays.copyOf(objectArray2, n4 *= 2);
            objectArray2 = Arrays.copyOf(this.pathIndices, n4);
            this.pathIndices = objectArray2;
            objectArray2 = this.pathNames;
            objectArray = (String[])Arrays.copyOf(objectArray2, n4);
            this.pathNames = (String[])objectArray;
        }
        objectArray = this.stack;
        int n8 = this.stackSize;
        this.stackSize = n7 = n8 + 1;
        objectArray[n8] = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private char readEscapeCharacter() {
        int n3;
        int n4;
        int n7;
        Object object;
        int n8;
        int n10;
        block16: {
            block15: {
                block14: {
                    n10 = this.pos;
                    n8 = this.limit;
                    object = "Unterminated escape sequence";
                    n7 = 1;
                    if (n10 == n8 && (n10 = (int)(this.fillBuffer(n7) ? 1 : 0)) == 0) {
                        throw this.syntaxError((String)object);
                    }
                    char[] cArray = this.buffer;
                    n8 = this.pos;
                    this.pos = n4 = n8 + 1;
                    n10 = cArray[n8];
                    n3 = 10;
                    if (n10 == n3) break block14;
                    n7 = 34;
                    if (n10 == n7 || n10 == (n7 = 39) || n10 == (n7 = 47) || n10 == (n7 = 92)) break block15;
                    n7 = 98;
                    if (n10 == n7) {
                        return '\b';
                    }
                    n7 = 102;
                    if (n10 == n7) {
                        return '\f';
                    }
                    n4 = 110;
                    if (n10 == n4) {
                        return (char)n3;
                    }
                    n4 = 114;
                    if (n10 == n4) {
                        return '\r';
                    }
                    n4 = 116;
                    if (n10 == n4) {
                        return '\t';
                    }
                    n4 = 117;
                    if (n10 != n4) {
                        throw this.syntaxError("Invalid escape sequence");
                    }
                    n10 = this.limit;
                    n4 = 4;
                    if ((n8 += 5) > n10 && (n10 = (int)(this.fillBuffer(n4) ? 1 : 0)) == 0) {
                        throw this.syntaxError((String)object);
                    }
                    break block16;
                }
                this.lineNumber = n8 = this.lineNumber + n7;
                this.lineStart = n4;
            }
            return (char)n10;
        }
        n10 = this.pos;
        n8 = n10 + 4;
        char c2 = '\u0000';
        object = null;
        while (true) {
            if (n10 >= n8) {
                this.pos = n10 = this.pos + n4;
                return c2;
            }
            char[] cArray = this.buffer;
            n3 = cArray[n10];
            c2 = (char)(c2 << 4);
            int n14 = 48;
            if (n3 >= n14 && n3 <= (n14 = 57)) {
                n3 += -48;
            } else {
                n14 = 97;
                if (n3 >= n14 && n3 <= n7) {
                    n3 += -87;
                } else {
                    n14 = 65;
                    if (n3 < n14 || n3 > (n14 = 70)) break;
                    n3 += -55;
                }
            }
            n3 += c2;
            c2 = (char)n3;
            ++n10;
        }
        object = this.buffer;
        n7 = this.pos;
        String string2 = new String((char[])object, n7, n4);
        string2 = "\\u".concat(string2);
        NumberFormatException numberFormatException = new NumberFormatException(string2);
        throw numberFormatException;
    }

    private void skipQuotedValue(char c2) {
        int n3;
        int n4;
        char[] cArray = this.buffer;
        do {
            n4 = this.pos;
            int n7 = this.limit;
            while (true) {
                n3 = 1;
                if (n4 >= n7) break;
                int n8 = n4 + 1;
                if ((n4 = cArray[n4]) == c2) {
                    this.pos = n8;
                    return;
                }
                int n10 = 92;
                if (n4 == n10) {
                    this.pos = n8;
                    this.readEscapeCharacter();
                    n4 = this.pos;
                    n7 = this.limit;
                    continue;
                }
                n10 = 10;
                if (n4 == n10) {
                    this.lineNumber = n4 = this.lineNumber + n3;
                    this.lineStart = n8;
                }
                n4 = n8;
            }
            this.pos = n4;
        } while ((n4 = (int)(this.fillBuffer(n3) ? 1 : 0)) != 0);
        throw this.syntaxError("Unterminated string");
    }

    /*
     * Unable to fully structure code
     */
    private boolean skipTo(String var1_1) {
        var2_2 = var1_1.length();
        block0: while (true) {
            block3: {
                var3_3 = this.pos + var2_2;
                var4_4 = this.limit;
                if (var3_3 > var4_4 && (var3_3 = (int)this.fillBuffer(var2_2)) == 0) {
                    return false;
                }
                var6_6 = this.buffer;
                var4_4 = this.pos;
                var3_3 = var6_6[var4_4];
                var7_7 = 10;
                var8_8 = 1;
                if (var3_3 != var7_7) break block3;
                this.lineNumber = var3_3 = this.lineNumber + var8_8;
                this.lineStart = ++var4_4;
                ** GOTO lbl22
            }
            for (var5_5 = 0; var5_5 < var2_2; ++var5_5) {
                var6_6 = this.buffer;
                var4_4 = this.pos + var5_5;
                var3_3 = var6_6[var4_4];
                if (var3_3 == (var4_4 = (int)var1_1.charAt(var5_5))) continue;
lbl22:
                // 2 sources

                this.pos = var3_3 = this.pos + var8_8;
                continue block0;
            }
            break;
        }
        return (boolean)var8_8;
    }

    private void skipToEndOfLine() {
        int n3;
        int n4;
        do {
            int n7;
            n4 = this.pos;
            n3 = this.limit;
            int n8 = 1;
            if (n4 >= n3 && (n4 = (int)(this.fillBuffer(n8) ? 1 : 0)) == 0) break;
            char[] cArray = this.buffer;
            n3 = this.pos;
            this.pos = n7 = n3 + 1;
            n4 = cArray[n3];
            if (n4 != (n3 = 10)) continue;
            this.lineNumber = n4 = this.lineNumber + n8;
            this.lineStart = n7;
            break;
        } while (n4 != (n3 = 13));
    }

    /*
     * Unable to fully structure code
     */
    private void skipUnquotedValue() {
        do {
            var1_1 = 0;
            block5: while ((var3_3 = (var2_2 = this.pos) + var1_1) < (var4_4 = this.limit)) {
                block6: {
                    var5_5 = this.buffer;
                    var2_2 += var1_1;
                    var3_3 = 9;
                    if ((var2_2 = var5_5[var2_2]) == var3_3 || var2_2 == (var3_3 = 10) || var2_2 == (var3_3 = 12) || var2_2 == (var3_3 = 13) || var2_2 == (var3_3 = 32)) break block6;
                    var3_3 = 35;
                    if (var2_2 == var3_3) ** GOTO lbl-1000
                    var3_3 = 44;
                    if (var2_2 == var3_3) break block6;
                    var3_3 = 47;
                    if (var2_2 == var3_3 || var2_2 == (var3_3 = 61)) ** GOTO lbl-1000
                    var3_3 = 123;
                    if (var2_2 == var3_3 || var2_2 == (var3_3 = 125) || var2_2 == (var3_3 = 58)) break block6;
                    var3_3 = 59;
                    if (var2_2 == var3_3) ** GOTO lbl-1000
                    switch (var2_2) {
                        default: {
                            ++var1_1;
                            continue block5;
                        }
                        case 92: lbl-1000:
                        // 4 sources

                        {
                            this.checkLenient();
                        }
                        case 91: 
                        case 93: 
                    }
                }
                this.pos = var2_2 = this.pos + var1_1;
                return;
            }
            this.pos = var2_2 += var1_1;
        } while ((var1_1 = (int)this.fillBuffer(1)) != 0);
    }

    private IOException syntaxError(String charSequence) {
        charSequence = Ex0.a((String)charSequence);
        String string2 = this.locationString();
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        MalformedJsonException malformedJsonException = new MalformedJsonException((String)charSequence);
        throw malformedJsonException;
    }

    public void beginArray() {
        int n3;
        int n4 = this.peeked;
        if (n4 == 0) {
            n4 = this.doPeek();
        }
        if (n4 == (n3 = 3)) {
            n4 = 1;
            this.push(n4);
            int[] nArray = this.pathIndices;
            int n7 = this.stackSize - n4;
            nArray[n7] = 0;
            this.peeked = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected BEGIN_ARRAY but was ");
        Object object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public void beginObject() {
        int n3;
        int n4 = this.peeked;
        if (n4 == 0) {
            n4 = this.doPeek();
        }
        if (n4 == (n3 = 1)) {
            this.push(3);
            this.peeked = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected BEGIN_OBJECT but was ");
        Object object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public int doPeek() {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        block32: {
            Object object;
            block37: {
                int n19;
                int n20;
                int n21;
                int n22;
                int n24;
                block30: {
                    block36: {
                        block35: {
                            block33: {
                                block34: {
                                    block31: {
                                        block29: {
                                            object = this.stack;
                                            n18 = this.stackSize;
                                            n17 = n18 + -1;
                                            n17 = object[n17];
                                            n16 = 39;
                                            n15 = 34;
                                            n24 = 8;
                                            n22 = 3;
                                            n21 = 93;
                                            n20 = 7;
                                            n14 = 59;
                                            n10 = 44;
                                            n8 = 4;
                                            n7 = 2;
                                            n4 = 1;
                                            if (n17 != n4) break block29;
                                            object[n18 -= n4] = n7;
                                            break block30;
                                        }
                                        if (n17 != n7) break block31;
                                        n19 = this.nextNonWhitespace(n4 != 0);
                                        if (n19 != n10) {
                                            if (n19 != n14) {
                                                if (n19 == n21) {
                                                    this.peeked = n8;
                                                    return n8;
                                                }
                                                throw this.syntaxError("Unterminated array");
                                            }
                                            this.checkLenient();
                                        }
                                        break block30;
                                    }
                                    n3 = 5;
                                    if (n17 == n22 || n17 == n3) break block32;
                                    if (n17 != n8) break block33;
                                    object[n18 -= n4] = n3;
                                    n19 = this.nextNonWhitespace(n4 != 0);
                                    if (n19 == (n18 = 58)) break block30;
                                    n18 = 61;
                                    if (n19 != n18) break block34;
                                    this.checkLenient();
                                    n19 = this.pos;
                                    n18 = this.limit;
                                    if ((n19 < n18 || (n19 = (int)(this.fillBuffer(n4) ? 1 : 0)) != 0) && (n19 = (object = (Object)this.buffer)[n18 = this.pos]) == (n3 = 62)) {
                                        this.pos = n18 += n4;
                                    }
                                    break block30;
                                }
                                throw this.syntaxError("Expected ':'");
                            }
                            n19 = 6;
                            if (n17 != n19) break block35;
                            n19 = (int)(this.lenient ? 1 : 0);
                            if (n19 != 0) {
                                this.consumeNonExecutePrefix();
                            }
                            object = this.stack;
                            n18 = this.stackSize - n4;
                            object[n18] = n20;
                            break block30;
                        }
                        if (n17 != n20) break block36;
                        object = null;
                        n19 = this.nextNonWhitespace(false);
                        if (n19 == (n18 = -1)) {
                            this.peeked = n19 = 17;
                            return n19;
                        }
                        this.checkLenient();
                        this.pos = n19 = this.pos - n4;
                        break block30;
                    }
                    if (n17 == n24) break block37;
                }
                n19 = this.nextNonWhitespace(n4 != 0);
                if (n19 != n15) {
                    if (n19 != n16) {
                        if (n19 != n10 && n19 != n14) {
                            n18 = 91;
                            if (n19 != n18) {
                                if (n19 != n21) {
                                    n18 = 123;
                                    if (n19 != n18) {
                                        this.pos = n19 = this.pos - n4;
                                        n19 = this.peekKeyword();
                                        if (n19 != 0) {
                                            return n19;
                                        }
                                        n19 = this.peekNumber();
                                        if (n19 != 0) {
                                            return n19;
                                        }
                                        object = this.buffer;
                                        n18 = this.pos;
                                        n19 = object[n18];
                                        if ((n19 = (int)(this.isLiteral((char)n19) ? 1 : 0)) != 0) {
                                            this.checkLenient();
                                            this.peeked = n19 = 10;
                                            return n19;
                                        }
                                        throw this.syntaxError("Expected value");
                                    }
                                    this.peeked = n4;
                                    return n4;
                                }
                                if (n17 == n4) {
                                    this.peeked = n8;
                                    return n8;
                                }
                            } else {
                                this.peeked = n22;
                                return n22;
                            }
                        }
                        if (n17 != n4 && n17 != n7) {
                            throw this.syntaxError("Unexpected value");
                        }
                        this.checkLenient();
                        this.pos = n19 = this.pos - n4;
                        this.peeked = n20;
                        return n20;
                    }
                    this.checkLenient();
                    this.peeked = n24;
                    return n24;
                }
                this.peeked = n19 = 9;
                return n19;
            }
            object = new IllegalStateException;
            object("JsonReader is closed");
            throw object;
        }
        object[n18 -= n4] = n8;
        int n25 = 125;
        if (n17 == n3 && (n18 = this.nextNonWhitespace(n4 != 0)) != n10) {
            if (n18 != n14) {
                if (n18 == n25) {
                    this.peeked = n7;
                    return n7;
                }
                throw this.syntaxError("Unterminated object");
            }
            this.checkLenient();
        }
        if ((n18 = this.nextNonWhitespace(n4 != 0)) != n15) {
            if (n18 != n16) {
                String string2 = "Expected name";
                if (n18 != n25) {
                    this.checkLenient();
                    this.pos = n25 = this.pos - n4;
                    n25 = (char)n18;
                    n25 = (int)(this.isLiteral((char)n25) ? 1 : 0);
                    if (n25 != 0) {
                        this.peeked = n25 = 14;
                        return n25;
                    }
                    throw this.syntaxError(string2);
                }
                if (n17 != n3) {
                    this.peeked = n7;
                    return n7;
                }
                throw this.syntaxError(string2);
            }
            this.checkLenient();
            this.peeked = n25 = 12;
            return n25;
        }
        this.peeked = n25 = 13;
        return n25;
    }

    public void endArray() {
        int n3;
        int n4 = this.peeked;
        if (n4 == 0) {
            n4 = this.doPeek();
        }
        if (n4 == (n3 = 4)) {
            int n7;
            n4 = this.stackSize;
            this.stackSize = n3 = n4 + -1;
            int[] nArray = this.pathIndices;
            nArray[n4 += -2] = n7 = nArray[n4] + 1;
            this.peeked = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected END_ARRAY but was ");
        Object object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public void endObject() {
        int n3;
        int n4 = this.peeked;
        if (n4 == 0) {
            n4 = this.doPeek();
        }
        if (n4 == (n3 = 2)) {
            int n7;
            n4 = this.stackSize;
            this.stackSize = n7 = n4 + -1;
            this.pathNames[n7] = null;
            int[] nArray = this.pathIndices;
            n4 -= n3;
            nArray[n4] = n3 = nArray[n4] + 1;
            this.peeked = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected END_OBJECT but was ");
        Object object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public String getPath() {
        return this.getPath(false);
    }

    public String getPreviousPath() {
        return this.getPath(true);
    }

    public boolean hasNext() {
        int n3;
        int n4 = this.peeked;
        if (n4 == 0) {
            n4 = this.doPeek();
        }
        n4 = n4 != (n3 = 2) && n4 != (n3 = 4) && n4 != (n3 = 17) ? 1 : 0;
        return n4 != 0;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public String locationString() {
        int n3 = this.lineNumber + 1;
        int n4 = this.pos;
        int n7 = this.lineStart;
        n4 = n4 - n7 + 1;
        StringBuilder stringBuilder = fQ2.a(" at line ", " column ", " path ", n3, n4);
        String string2 = this.getPath();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public boolean nextBoolean() {
        int n3 = this.peeked;
        if (n3 == 0) {
            n3 = this.doPeek();
        }
        int n4 = 5;
        int n7 = 0;
        Object object = null;
        int n8 = 1;
        if (n3 == n4) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n4 = this.stackSize - n8;
            nArray[n4] = n7 = nArray[n4] + n8;
            return n8 != 0;
        }
        n4 = 6;
        if (n3 == n4) {
            int n10;
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n4 = this.stackSize - n8;
            nArray[n4] = n10 = nArray[n4] + n8;
            return false;
        }
        CharSequence charSequence = new StringBuilder("Expected a boolean but was ");
        object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public double nextDouble() {
        String string2;
        Object object;
        int n3 = this.peeked;
        if (n3 == 0) {
            n3 = this.doPeek();
        }
        int n4 = 15;
        int n7 = 0;
        Object object2 = null;
        if (n3 == n4) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n4 = this.stackSize + -1;
            nArray[n4] = n7 = nArray[n4] + 1;
            return this.peekedLong;
        }
        n4 = 16;
        int n8 = 11;
        if (n3 == n4) {
            char[] cArray = this.buffer;
            object = this.pos;
            int n10 = this.peekedNumberLength;
            this.peekedString = string2 = new String(cArray, (int)object, n10);
            n3 = this.pos;
            n4 = this.peekedNumberLength;
            this.pos = n3 += n4;
        } else {
            n4 = 8;
            if (n3 != n4 && n3 != (object = 9)) {
                n4 = 10;
                if (n3 == n4) {
                    this.peekedString = string2 = this.nextUnquotedValue();
                } else if (n3 != n8) {
                    CharSequence charSequence = new StringBuilder("Expected a double but was ");
                    object2 = this.peek();
                    charSequence.append(object2);
                    object2 = this.locationString();
                    charSequence.append((String)object2);
                    charSequence = charSequence.toString();
                    IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                    throw illegalStateException;
                }
            } else {
                n3 = n3 == n4 ? 39 : 34;
                this.peekedString = string2 = this.nextQuotedValue((char)n3);
            }
        }
        this.peeked = n8;
        string2 = this.peekedString;
        double d2 = Double.parseDouble(string2);
        n8 = (int)(this.lenient ? 1 : 0);
        if (n8 == 0 && ((n8 = (int)(Double.isNaN(d2) ? 1 : 0)) != 0 || (n8 = (int)(Double.isInfinite(d2) ? 1 : 0)) != 0)) {
            StringBuilder stringBuilder = new StringBuilder("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            string2 = this.locationString();
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            object2 = new MalformedJsonException(string2);
            throw object2;
        }
        this.peekedString = null;
        this.peeked = 0;
        object2 = this.pathIndices;
        n8 = this.stackSize + -1;
        object = object2[n8] + true;
        object2[n8] = (JsonToken)((Object)object);
        return d2;
    }

    public int nextInt() {
        Object object;
        int n3;
        Object object2;
        int n4 = this.peeked;
        if (n4 == 0) {
            n4 = this.doPeek();
        }
        int n7 = 15;
        Object object3 = 0;
        Object object4 = null;
        String string2 = "Expected an int but was ";
        if (n4 == n7) {
            long l2 = this.peekedLong;
            int n8 = (int)l2;
            long l3 = n8;
            long l4 = l2 - l3;
            Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object5 == false) {
                this.peeked = 0;
                int[] nArray = this.pathIndices;
                n7 = this.stackSize + -1;
                nArray[n7] = object3 = nArray[n7] + 1;
                return n8;
            }
            CharSequence charSequence = new StringBuilder(string2);
            long l7 = this.peekedLong;
            charSequence.append(l7);
            object4 = this.locationString();
            charSequence.append((String)object4);
            charSequence = charSequence.toString();
            NumberFormatException numberFormatException = new NumberFormatException((String)charSequence);
            throw numberFormatException;
        }
        n7 = 16;
        if (n4 == n7) {
            object2 = this.buffer;
            n3 = this.pos;
            int n10 = this.peekedNumberLength;
            object = new String((char[])object2, n3, n10);
            this.peekedString = object;
            n4 = this.pos;
            n7 = this.peekedNumberLength;
            this.pos = n4 += n7;
        } else {
            int n14;
            n7 = 10;
            n3 = 8;
            if (n4 != n3 && n4 != (n14 = 9) && n4 != n7) {
                CharSequence charSequence = new StringBuilder(string2);
                object4 = this.peek();
                charSequence.append(object4);
                object4 = this.locationString();
                charSequence.append((String)object4);
                charSequence = charSequence.toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                throw illegalStateException;
            }
            if (n4 == n7) {
                object = this.nextUnquotedValue();
                this.peekedString = object;
            } else {
                n4 = n4 == n3 ? 39 : 34;
                object = this.nextQuotedValue((char)n4);
                this.peekedString = object;
            }
            try {
                object = this.peekedString;
            }
            catch (NumberFormatException numberFormatException) {}
            n4 = Integer.parseInt((String)object);
            this.peeked = 0;
            object2 = this.pathIndices;
            n3 = this.stackSize + -1;
            n14 = object2[n3] + '\u0001';
            object2[n3] = n14;
            return n4;
        }
        this.peeked = n4 = 11;
        object = this.peekedString;
        double d2 = Double.parseDouble((String)object);
        n3 = (int)d2;
        double d5 = n3;
        double d7 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
        if (d7 == false) {
            this.peekedString = null;
            this.peeked = 0;
            object = this.pathIndices;
            n7 = this.stackSize + -1;
            object3 = object[n7] + true;
            object[n7] = object3;
            return n3;
        }
        object2 = new StringBuilder;
        ((StringBuilder)object2)(string2);
        object4 = this.peekedString;
        ((StringBuilder)object2).append((String)object4);
        object4 = this.locationString();
        ((StringBuilder)object2).append((String)object4);
        object2 = ((StringBuilder)object2).toString();
        object = new NumberFormatException((String)object2);
        throw object;
    }

    public long nextLong() {
        Object object;
        Object object2;
        int n3 = this.peeked;
        if (n3 == 0) {
            n3 = this.doPeek();
        }
        int n4 = 15;
        Object object3 = 0;
        Object object4 = null;
        if (n3 == n4) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n4 = this.stackSize + -1;
            nArray[n4] = object3 = nArray[n4] + 1;
            return this.peekedLong;
        }
        n4 = 16;
        String string2 = "Expected a long but was ";
        if (n3 == n4) {
            object2 = this.buffer;
            int n7 = this.pos;
            int n8 = this.peekedNumberLength;
            object = new String((char[])object2, n7, n8);
            this.peekedString = object;
            n3 = this.pos;
            n4 = this.peekedNumberLength;
            this.pos = n3 += n4;
        } else {
            int n10;
            n4 = 10;
            int n14 = 8;
            if (n3 != n14 && n3 != (n10 = 9) && n3 != n4) {
                CharSequence charSequence = new StringBuilder(string2);
                object4 = this.peek();
                charSequence.append(object4);
                object4 = this.locationString();
                charSequence.append((String)object4);
                charSequence = charSequence.toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                throw illegalStateException;
            }
            if (n3 == n4) {
                object = this.nextUnquotedValue();
                this.peekedString = object;
            } else {
                n3 = n3 == n14 ? 39 : 34;
                object = this.nextQuotedValue((char)n3);
                this.peekedString = object;
            }
            try {
                object = this.peekedString;
            }
            catch (NumberFormatException numberFormatException) {}
            long l2 = Long.parseLong((String)object);
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n10 = this.stackSize + -1;
            int n15 = nArray[n10] + 1;
            nArray[n10] = n15;
            return l2;
        }
        this.peeked = n3 = 11;
        object = this.peekedString;
        double d2 = Double.parseDouble((String)object);
        long l3 = (long)d2;
        double d5 = l3;
        double d7 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
        if (d7 == false) {
            this.peekedString = null;
            this.peeked = 0;
            object = this.pathIndices;
            n4 = this.stackSize + -1;
            object3 = object[n4] + true;
            object[n4] = object3;
            return l3;
        }
        object2 = new StringBuilder;
        ((StringBuilder)object2)(string2);
        object4 = this.peekedString;
        ((StringBuilder)object2).append((String)object4);
        object4 = this.locationString();
        ((StringBuilder)object2).append((String)object4);
        object2 = ((StringBuilder)object2).toString();
        object = new NumberFormatException((String)object2);
        throw object;
    }

    public String nextName() {
        block7: {
            String string2;
            block5: {
                int n3;
                int n4;
                block6: {
                    block4: {
                        n4 = this.peeked;
                        if (n4 == 0) {
                            n4 = this.doPeek();
                        }
                        if (n4 != (n3 = 14)) break block4;
                        string2 = this.nextUnquotedValue();
                        break block5;
                    }
                    n3 = 12;
                    if (n4 != n3) break block6;
                    n4 = 39;
                    string2 = this.nextQuotedValue((char)n4);
                    break block5;
                }
                n3 = 13;
                if (n4 != n3) break block7;
                n4 = 34;
                string2 = this.nextQuotedValue((char)n4);
            }
            this.peeked = 0;
            String[] stringArray = this.pathNames;
            int n7 = this.stackSize + -1;
            stringArray[n7] = string2;
            return string2;
        }
        CharSequence charSequence = new StringBuilder("Expected a name but was ");
        Object object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public void nextNull() {
        int n3;
        int n4 = this.peeked;
        if (n4 == 0) {
            n4 = this.doPeek();
        }
        if (n4 == (n3 = 7)) {
            int n7;
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n3 = this.stackSize + -1;
            nArray[n3] = n7 = nArray[n3] + 1;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected null but was ");
        Object object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public String nextString() {
        block10: {
            int n3;
            int n4;
            Object[] objectArray;
            String string2;
            block5: {
                int n7;
                int n8;
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    n8 = this.peeked;
                                    if (n8 == 0) {
                                        n8 = this.doPeek();
                                    }
                                    if (n8 != (n7 = 10)) break block4;
                                    string2 = this.nextUnquotedValue();
                                    break block5;
                                }
                                n7 = 8;
                                if (n8 != n7) break block6;
                                n8 = 39;
                                string2 = this.nextQuotedValue((char)n8);
                                break block5;
                            }
                            n7 = 9;
                            if (n8 != n7) break block7;
                            n8 = 34;
                            string2 = this.nextQuotedValue((char)n8);
                            break block5;
                        }
                        n7 = 11;
                        if (n8 != n7) break block8;
                        string2 = this.peekedString;
                        n7 = 0;
                        objectArray = null;
                        this.peekedString = null;
                        break block5;
                    }
                    n7 = 15;
                    if (n8 != n7) break block9;
                    long l2 = this.peekedLong;
                    string2 = Long.toString(l2);
                    break block5;
                }
                n7 = 16;
                if (n8 != n7) break block10;
                objectArray = this.buffer;
                n4 = this.pos;
                n3 = this.peekedNumberLength;
                string2 = new String((char[])objectArray, n4, n3);
                n7 = this.pos;
                n4 = this.peekedNumberLength;
                this.pos = n7 += n4;
            }
            this.peeked = 0;
            objectArray = this.pathIndices;
            n4 = this.stackSize + -1;
            objectArray[n4] = n3 = objectArray[n4] + 1;
            return string2;
        }
        CharSequence charSequence = new StringBuilder("Expected a string but was ");
        Object object = this.peek();
        charSequence.append(object);
        object = this.locationString();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public JsonToken peek() {
        int n3 = this.peeked;
        if (n3 == 0) {
            n3 = this.doPeek();
        }
        switch (n3) {
            default: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 17: {
                return JsonToken.END_DOCUMENT;
            }
            case 15: 
            case 16: {
                return JsonToken.NUMBER;
            }
            case 12: 
            case 13: 
            case 14: {
                return JsonToken.NAME;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return JsonToken.STRING;
            }
            case 7: {
                return JsonToken.NULL;
            }
            case 5: 
            case 6: {
                return JsonToken.BOOLEAN;
            }
            case 4: {
                return JsonToken.END_ARRAY;
            }
            case 3: {
                return JsonToken.BEGIN_ARRAY;
            }
            case 2: {
                return JsonToken.END_OBJECT;
            }
            case 1: 
        }
        return JsonToken.BEGIN_OBJECT;
    }

    public final void setLenient(boolean bl2) {
        this.lenient = bl2;
    }

    /*
     * Unable to fully structure code
     */
    public void skipValue() {
        var1_1 = null;
        var2_2 = 0;
        do {
            if ((var3_3 = this.peeked) == 0) {
                var3_3 = this.doPeek();
            }
            var4_4 = 39;
            var5_5 = '\"';
            var6_6 = "<skipped>";
            var7_7 = 1;
            block0 : switch (var3_3) {
                default: {
                    break;
                }
                case 17: {
                    return;
                }
                case 16: {
                    var3_3 = this.pos;
                    var4_4 = this.peekedNumberLength;
                    this.pos = var3_3 += var4_4;
                    break;
                }
                case 14: {
                    this.skipUnquotedValue();
                    if (var2_2 != 0) break;
                    var8_8 = this.pathNames;
                    var4_4 = this.stackSize - var7_7;
                    var8_8[var4_4] = var6_6;
                    break;
                }
                case 13: {
                    this.skipQuotedValue(var5_5);
                    if (var2_2 != 0) break;
                    var8_8 = this.pathNames;
                    var4_4 = this.stackSize - var7_7;
                    var8_8[var4_4] = var6_6;
                    break;
                }
                case 12: {
                    this.skipQuotedValue((char)var4_4);
                    if (var2_2 != 0) break;
                    var8_8 = this.pathNames;
                    var4_4 = this.stackSize - var7_7;
                    var8_8[var4_4] = var6_6;
                    break;
                }
                case 10: {
                    this.skipUnquotedValue();
                    break;
                }
                case 9: {
                    this.skipQuotedValue(var5_5);
                    break;
                }
                case 8: {
                    this.skipQuotedValue((char)var4_4);
                    break;
                }
                case 4: {
                    this.stackSize = var3_3 = this.stackSize - var7_7;
lbl52:
                    // 2 sources

                    while (true) {
                        var2_2 += -1;
                        break block0;
                        break;
                    }
                }
                case 3: {
                    this.push(var7_7);
lbl57:
                    // 2 sources

                    while (true) {
                        ++var2_2;
                        break block0;
                        break;
                    }
                }
                case 2: {
                    if (var2_2 == 0) {
                        var8_8 = this.pathNames;
                        var4_4 = this.stackSize - var7_7;
                        var5_5 = '\u0000';
                        var8_8[var4_4] = null;
                    }
                    this.stackSize = var3_3 = this.stackSize - var7_7;
                    ** continue;
                }
                case 1: {
                    var3_3 = 3;
                    this.push(var3_3);
                    ** continue;
                }
            }
            this.peeked = 0;
        } while (var2_2 > 0);
        var1_1 = this.pathIndices;
        var2_2 = this.stackSize - var7_7;
        var1_1[var2_2] = var3_3 = var1_1[var2_2] + var7_7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getClass().getSimpleName();
        stringBuilder.append(string2);
        string2 = this.locationString();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

