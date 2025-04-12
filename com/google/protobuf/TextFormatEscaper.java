/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.TextFormatEscaper$1;
import com.google.protobuf.TextFormatEscaper$2;
import com.google.protobuf.TextFormatEscaper$ByteSequence;

final class TextFormatEscaper {
    private TextFormatEscaper() {
    }

    public static String escapeBytes(ByteString byteString) {
        TextFormatEscaper$1 textFormatEscaper$1 = new TextFormatEscaper$1(byteString);
        return TextFormatEscaper.escapeBytes(textFormatEscaper$1);
    }

    public static String escapeBytes(TextFormatEscaper$ByteSequence textFormatEscaper$ByteSequence) {
        char c2;
        int n3 = textFormatEscaper$ByteSequence.size();
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (n3 = 0; n3 < (c2 = textFormatEscaper$ByteSequence.size()); ++n3) {
            String string2;
            char c3;
            c2 = (char)textFormatEscaper$ByteSequence.byteAt(n3);
            if (c2 != (c3 = '\"')) {
                c3 = '\'';
                if (c2 != c3) {
                    c3 = '\\';
                    if (c2 != c3) {
                        switch (c2) {
                            default: {
                                char c5 = ' ';
                                if (c2 >= c5 && c2 <= (c5 = '~')) {
                                    c2 = c2;
                                    stringBuilder.append(c2);
                                    break;
                                }
                                stringBuilder.append(c3);
                                c3 = (char)((c2 >>> 6 & 3) + 48);
                                stringBuilder.append(c3);
                                c3 = (char)((c2 >>> 3 & 7) + 48);
                                stringBuilder.append(c3);
                                c2 = (char)((c2 & 7) + 48);
                                stringBuilder.append(c2);
                                break;
                            }
                            case '\r': {
                                string2 = "\\r";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\f': {
                                string2 = "\\f";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\u000b': {
                                string2 = "\\v";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\n': {
                                string2 = "\\n";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\t': {
                                string2 = "\\t";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\b': {
                                string2 = "\\b";
                                stringBuilder.append(string2);
                                break;
                            }
                            case '\u0007': {
                                string2 = "\\a";
                                stringBuilder.append(string2);
                                break;
                            }
                        }
                        continue;
                    }
                    string2 = "\\\\";
                    stringBuilder.append(string2);
                    continue;
                }
                string2 = "\\'";
                stringBuilder.append(string2);
                continue;
            }
            string2 = "\\\"";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static String escapeBytes(byte[] byArray) {
        TextFormatEscaper$2 textFormatEscaper$2 = new TextFormatEscaper$2(byArray);
        return TextFormatEscaper.escapeBytes(textFormatEscaper$2);
    }

    public static String escapeDoubleQuotesAndBackslashes(String string2) {
        return string2.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String string2) {
        return TextFormatEscaper.escapeBytes(ByteString.copyFromUtf8(string2));
    }
}

