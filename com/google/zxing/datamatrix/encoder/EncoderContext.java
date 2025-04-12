/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

final class EncoderContext {
    private final StringBuilder codewords;
    private Dimension maxSize;
    private Dimension minSize;
    private final String msg;
    private int newEncoding;
    int pos;
    private SymbolShapeHint shape;
    private int skipAtEnd;
    private SymbolInfo symbolInfo;

    public EncoderContext(String object) {
        Object object2 = StandardCharsets.ISO_8859_1;
        object2 = ((String)object).getBytes((Charset)object2);
        int n3 = ((Object)object2).length;
        StringBuilder stringBuilder = new StringBuilder(n3);
        n3 = ((Object)object2).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2;
            char c3 = (char)(object2[i3] & 0xFF);
            char c5 = '?';
            if (c3 == c5 && (c2 = ((String)object).charAt(i3)) != c5) {
                object = new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
                throw object;
            }
            stringBuilder.append(c3);
        }
        this.msg = object2 = stringBuilder.toString();
        object2 = SymbolShapeHint.FORCE_NONE;
        this.shape = object2;
        int n4 = ((String)object).length();
        object2 = new StringBuilder(n4);
        this.codewords = object2;
        this.newEncoding = -1;
    }

    private int getTotalMessageCharCount() {
        int n3 = this.msg.length();
        int n4 = this.skipAtEnd;
        return n3 - n4;
    }

    public int getCodewordCount() {
        return this.codewords.length();
    }

    public StringBuilder getCodewords() {
        return this.codewords;
    }

    public char getCurrent() {
        String string2 = this.msg;
        int n3 = this.pos;
        return string2.charAt(n3);
    }

    public char getCurrentChar() {
        String string2 = this.msg;
        int n3 = this.pos;
        return string2.charAt(n3);
    }

    public String getMessage() {
        return this.msg;
    }

    public int getNewEncoding() {
        return this.newEncoding;
    }

    public int getRemainingCharacters() {
        int n3 = this.getTotalMessageCharCount();
        int n4 = this.pos;
        return n3 - n4;
    }

    public SymbolInfo getSymbolInfo() {
        return this.symbolInfo;
    }

    public boolean hasMoreCharacters() {
        int n3 = this.pos;
        int n4 = this.getTotalMessageCharCount();
        return n3 < n4;
    }

    public void resetEncoderSignal() {
        this.newEncoding = -1;
    }

    public void resetSymbolInfo() {
        this.symbolInfo = null;
    }

    public void setSizeConstraints(Dimension dimension, Dimension dimension2) {
        this.minSize = dimension;
        this.maxSize = dimension2;
    }

    public void setSkipAtEnd(int n3) {
        this.skipAtEnd = n3;
    }

    public void setSymbolShape(SymbolShapeHint symbolShapeHint) {
        this.shape = symbolShapeHint;
    }

    public void signalEncoderChange(int n3) {
        this.newEncoding = n3;
    }

    public void updateSymbolInfo() {
        int n3 = this.getCodewordCount();
        this.updateSymbolInfo(n3);
    }

    public void updateSymbolInfo(int n3) {
        int n4;
        Object object = this.symbolInfo;
        if (object == null || n3 > (n4 = object.getDataCapacity())) {
            SymbolInfo symbolInfo;
            object = this.shape;
            Dimension dimension = this.minSize;
            Dimension dimension2 = this.maxSize;
            boolean bl2 = true;
            this.symbolInfo = symbolInfo = SymbolInfo.lookup(n3, (SymbolShapeHint)((Object)object), dimension, dimension2, bl2);
        }
    }

    public void writeCodeword(char c2) {
        this.codewords.append(c2);
    }

    public void writeCodewords(String string2) {
        this.codewords.append(string2);
    }
}

