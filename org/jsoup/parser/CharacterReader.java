/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

public final class CharacterReader {
    static final char EOF = '\uffff';
    static final int maxBufferLen = 32768;
    private static final int maxStringCacheLen = 12;
    private static final int minReadAheadLen = 1024;
    static final int readAheadLimit = 24576;
    private static final int stringCacheSize = 512;
    private int bufLength;
    private int bufMark;
    private int bufPos;
    private int bufSplitPoint;
    private char[] charBuf;
    private int lastIcIndex;
    private String lastIcSeq;
    private int lineNumberOffset;
    private ArrayList newlinePositions;
    private boolean readFully;
    private Reader reader;
    private int readerPos;
    private String[] stringCache;

    public CharacterReader(Reader reader) {
        this(reader, 32768);
    }

    public CharacterReader(Reader object, int n3) {
        this.bufMark = -1;
        String[] stringArray = new String[512];
        this.stringCache = stringArray;
        this.newlinePositions = null;
        this.lineNumberOffset = 1;
        Validate.notNull(object);
        Validate.isTrue(((Reader)object).markSupported());
        this.reader = object;
        object = new char[Math.min(n3, 32768)];
        this.charBuf = (char[])object;
        this.bufferUp();
    }

    public CharacterReader(String string2) {
        StringReader stringReader = new StringReader(string2);
        int n3 = string2.length();
        this(stringReader, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void bufferUp() {
        UncheckedIOException uncheckedIOException;
        int n3 = this.readFully;
        if (n3 != 0) return;
        n3 = this.bufPos;
        int n4 = this.bufSplitPoint;
        if (n3 < n4) {
            return;
        }
        n4 = this.bufMark;
        int n7 = -1;
        if (n4 != n7) {
            n3 -= n4;
            int n8 = n4;
            n4 = n3;
            n3 = n8;
        } else {
            n4 = 0;
            uncheckedIOException = null;
        }
        try {
            Reader reader;
            boolean bl2;
            Reader reader2 = this.reader;
            long l2 = n3;
            long l3 = reader2.skip(l2);
            reader2 = this.reader;
            int n10 = 32768;
            reader2.mark(n10);
            int n14 = 0;
            reader2 = null;
            while (true) {
                n10 = 1024;
                bl2 = true;
                if (n14 > n10) break;
                reader = this.reader;
                char[] cArray = this.charBuf;
                int n15 = cArray.length - n14;
                n10 = reader.read(cArray, n14, n15);
                if (n10 == n7) {
                    this.readFully = bl2;
                }
                if (n10 <= 0) break;
                n14 += n10;
            }
            reader = this.reader;
            reader.reset();
            if (n14 > 0) {
                int n16;
                n10 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
                if (n10 != 0) {
                    bl2 = false;
                }
                Validate.isTrue(bl2);
                this.bufLength = n14;
                this.readerPos = n16 = this.readerPos + n3;
                this.bufPos = n4;
                n3 = this.bufMark;
                if (n3 != n7) {
                    this.bufMark = 0;
                }
                n3 = 24576;
                this.bufSplitPoint = n3 = Math.min(n14, n3);
            }
            this.scanBufferForNewlines();
            this.lastIcSeq = null;
            return;
        }
        catch (IOException iOException) {}
        uncheckedIOException = new UncheckedIOException(iOException);
        throw uncheckedIOException;
    }

    private static String cacheString(char[] cArray, String[] object, int n3, int n4) {
        int n7;
        int n8 = 12;
        if (n4 > n8) {
            object = new String(cArray, n3, n4);
            return object;
        }
        n8 = 1;
        if (n4 < n8) {
            return "";
        }
        int n10 = 0;
        String string2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            n10 *= 31;
            n7 = n3 + n8;
            n7 = cArray[n7];
            n10 += n7;
        }
        n8 = n10 & 0x1FF;
        string2 = object[n8];
        if (string2 != null && (n7 = (int)(CharacterReader.rangeEquals(cArray, n3, n4, string2) ? 1 : 0)) != 0) {
            return string2;
        }
        object[n8] = string2 = new String(cArray, n3, n4);
        return string2;
    }

    private boolean isEmptyNoBufferUp() {
        int n3 = this.bufPos;
        int n4 = this.bufLength;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    private int lineNumIndex(int n3) {
        int n4 = this.isTrackNewlines();
        if (n4 == 0) {
            return 0;
        }
        ArrayList arrayList = this.newlinePositions;
        Integer n7 = n3;
        if ((n3 = Collections.binarySearch(arrayList, n7)) < (n4 = -1)) {
            n3 = Math.abs(n3) + -2;
        }
        return n3;
    }

    public static boolean rangeEquals(char[] cArray, int n3, int n4, String string2) {
        int n7 = string2.length();
        if (n4 == n7) {
            n7 = 0;
            while (true) {
                int n8 = n4 + -1;
                if (n4 == 0) break;
                n4 = n3 + 1;
                n3 = cArray[n3];
                int n10 = n7 + 1;
                if (n3 != (n7 = (int)string2.charAt(n7))) {
                    return false;
                }
                n3 = n4;
                n4 = n8;
                n7 = n10;
            }
            return true;
        }
        return false;
    }

    private void scanBufferForNewlines() {
        int n3;
        Object object;
        int n4;
        int n7 = this.isTrackNewlines();
        if (n7 == 0) {
            return;
        }
        ArrayList arrayList = this.newlinePositions;
        n7 = arrayList.size();
        if (n7 > 0) {
            n7 = this.readerPos;
            if ((n7 = this.lineNumIndex(n7)) == (n4 = -1)) {
                n7 = 0;
                arrayList = null;
            }
            object = (Integer)this.newlinePositions.get(n7);
            object.intValue();
            this.lineNumberOffset = n3 = this.lineNumberOffset + n7;
            this.newlinePositions.clear();
            arrayList = this.newlinePositions;
            arrayList.add(object);
        }
        for (n7 = this.bufPos; n7 < (n4 = this.bufLength); ++n7) {
            object = this.charBuf;
            n4 = object[n7];
            n3 = 10;
            if (n4 != n3) continue;
            object = this.newlinePositions;
            n3 = this.readerPos + 1 + n7;
            Integer n8 = n3;
            object.add(n8);
        }
    }

    public void advance() {
        int n3;
        this.bufPos = n3 = this.bufPos + 1;
    }

    /*
     * Unable to fully structure code
     */
    public void close() {
        var1_1 = this.reader;
        if (var1_1 == null) {
            return;
        }
        try {
            var1_1.close();
lbl6:
            // 2 sources

            while (true) {
                this.reader = null;
                this.charBuf = null;
                this.stringCache = null;
                break;
            }
        }
        catch (Throwable var1_2) {
            this.reader = null;
            this.charBuf = null;
            this.stringCache = null;
            throw var1_2;
        }
        return;
        catch (IOException v0) {
            ** continue;
        }
    }

    public int columnNumber() {
        int n3 = this.pos();
        return this.columnNumber(n3);
    }

    public int columnNumber(int n3) {
        int n4;
        int n7 = this.isTrackNewlines();
        if (n7 == 0) {
            return n3 + 1;
        }
        n7 = this.lineNumIndex(n3);
        if (n7 == (n4 = -1)) {
            return n3 + 1;
        }
        n7 = (Integer)this.newlinePositions.get(n7);
        return n3 - n7 + 1;
    }

    public char consume() {
        int n3;
        this.bufferUp();
        char c2 = this.isEmptyNoBufferUp();
        if (c2 != '\u0000') {
            c2 = (char)-1;
        } else {
            char[] cArray = this.charBuf;
            n3 = this.bufPos;
            c2 = cArray[n3];
        }
        this.bufPos = n3 = this.bufPos + 1;
        return c2;
    }

    public String consumeAttributeQuoted(boolean bl2) {
        Object object;
        int n3;
        int n4;
        int n7;
        int n8 = this.bufPos;
        int n10 = this.bufLength;
        char[] cArray = this.charBuf;
        for (n7 = n8; n7 < n10 && (n4 = cArray[n7]) != 0 && !(n4 != (n3 = 34) ? n4 == (n3 = 38) || n4 == (n3 = 39) && bl2 : !bl2); ++n7) {
        }
        this.bufPos = n7;
        if (n7 > n8) {
            object = this.charBuf;
            String[] stringArray = this.stringCache;
            object = CharacterReader.cacheString((char[])object, stringArray, n8, n7 -= n8);
        } else {
            object = "";
        }
        return object;
    }

    public String consumeData() {
        String string2;
        int n3;
        int n4;
        int n7;
        int n8 = this.bufPos;
        int n10 = this.bufLength;
        Object[] objectArray = this.charBuf;
        for (n7 = n8; n7 < n10 && (n4 = objectArray[n7]) != 0 && n4 != (n3 = 38) && n4 != (n3 = 60); ++n7) {
        }
        this.bufPos = n7;
        if (n7 > n8) {
            char[] cArray = this.charBuf;
            objectArray = this.stringCache;
            string2 = CharacterReader.cacheString(cArray, (String[])objectArray, n8, n7 -= n8);
        } else {
            string2 = "";
        }
        return string2;
    }

    public String consumeDigitSequence() {
        int n3;
        char[] cArray;
        int n4;
        int n7;
        this.bufferUp();
        int n8 = this.bufPos;
        while ((n7 = this.bufPos) < (n4 = this.bufLength) && (n4 = (cArray = this.charBuf)[n7]) >= (n3 = 48) && n4 <= (n3 = 57)) {
            this.bufPos = ++n7;
        }
        cArray = this.charBuf;
        String[] stringArray = this.stringCache;
        return CharacterReader.cacheString(cArray, stringArray, n8, n7 -= n8);
    }

    public String consumeHexSequence() {
        int n3;
        char[] cArray;
        int n4;
        int n7;
        this.bufferUp();
        int n8 = this.bufPos;
        while ((n7 = this.bufPos) < (n4 = this.bufLength) && ((n4 = (cArray = this.charBuf)[n7]) >= (n3 = 48) && n4 <= (n3 = 57) || n4 >= (n3 = 65) && n4 <= (n3 = 70) || n4 >= (n3 = 97) && n4 <= (n3 = 102))) {
            this.bufPos = ++n7;
        }
        cArray = this.charBuf;
        String[] stringArray = this.stringCache;
        return CharacterReader.cacheString(cArray, stringArray, n8, n7 -= n8);
    }

    public String consumeLetterSequence() {
        Object[] objectArray;
        int n3;
        int n4;
        this.bufferUp();
        int n7 = this.bufPos;
        while ((n4 = this.bufPos) < (n3 = this.bufLength) && ((n4 = (objectArray = this.charBuf)[n4]) >= (n3 = 65) && n4 <= (n3 = 90) || n4 >= (n3 = 97) && n4 <= (n3 = 122) || (n4 = (int)(Character.isLetter((char)n4) ? 1 : 0)) != 0)) {
            this.bufPos = n4 = this.bufPos + 1;
        }
        char[] cArray = this.charBuf;
        objectArray = this.stringCache;
        int n8 = this.bufPos - n7;
        return CharacterReader.cacheString(cArray, (String[])objectArray, n7, n8);
    }

    public String consumeLetterThenDigitSequence() {
        int n3;
        char[] cArray;
        Object[] objectArray;
        int n4;
        int n7;
        this.bufferUp();
        int n8 = this.bufPos;
        while ((n7 = this.bufPos) < (n4 = this.bufLength) && ((n7 = (objectArray = this.charBuf)[n7]) >= (n4 = 65) && n7 <= (n4 = 90) || n7 >= (n4 = 97) && n7 <= (n4 = 122) || (n7 = (int)(Character.isLetter((char)n7) ? 1 : 0)) != 0)) {
            this.bufPos = n7 = this.bufPos + 1;
        }
        while ((n7 = (int)(this.isEmptyNoBufferUp() ? 1 : 0)) == 0 && (n7 = (cArray = this.charBuf)[n4 = this.bufPos]) >= (n3 = 48) && n7 <= (n3 = 57)) {
            this.bufPos = ++n4;
        }
        cArray = this.charBuf;
        objectArray = this.stringCache;
        n3 = this.bufPos - n8;
        return CharacterReader.cacheString(cArray, (String[])objectArray, n8, n3);
    }

    public String consumeRawData() {
        String string2;
        char c2;
        char c3;
        int n3;
        int n4 = this.bufPos;
        int n7 = this.bufLength;
        Object[] objectArray = this.charBuf;
        for (n3 = n4; n3 < n7 && (c3 = objectArray[n3]) != '\u0000' && c3 != (c2 = '<'); ++n3) {
        }
        this.bufPos = n3;
        if (n3 > n4) {
            char[] cArray = this.charBuf;
            objectArray = this.stringCache;
            string2 = CharacterReader.cacheString(cArray, (String[])objectArray, n4, n3 -= n4);
        } else {
            string2 = "";
        }
        return string2;
    }

    public String consumeTagName() {
        String string2;
        int n3;
        int n4;
        int n7;
        this.bufferUp();
        int n8 = this.bufPos;
        int n10 = this.bufLength;
        Object[] objectArray = this.charBuf;
        for (n7 = n8; n7 < n10 && (n4 = objectArray[n7]) != (n3 = 9) && n4 != (n3 = 10) && n4 != (n3 = 12) && n4 != (n3 = 13) && n4 != (n3 = 32) && n4 != (n3 = 47) && n4 != (n3 = 60) && n4 != (n3 = 62); ++n7) {
        }
        this.bufPos = n7;
        if (n7 > n8) {
            char[] cArray = this.charBuf;
            objectArray = this.stringCache;
            string2 = CharacterReader.cacheString(cArray, (String[])objectArray, n8, n7 -= n8);
        } else {
            string2 = "";
        }
        return string2;
    }

    public String consumeTo(char c2) {
        char c3;
        if ((c2 = (char)this.nextIndexOf(c2)) != (c3 = '\uffffffff')) {
            int n3;
            Object object = this.charBuf;
            String[] stringArray = this.stringCache;
            int n4 = this.bufPos;
            object = CharacterReader.cacheString(object, stringArray, n4, c2);
            this.bufPos = n3 = this.bufPos + c2;
            return object;
        }
        return this.consumeToEnd();
    }

    public String consumeTo(String object) {
        int n3;
        int n4 = this.nextIndexOf((CharSequence)object);
        if (n4 != (n3 = -1)) {
            object = this.charBuf;
            String[] stringArray = this.stringCache;
            int n7 = this.bufPos;
            object = CharacterReader.cacheString((char[])object, stringArray, n7, n4);
            this.bufPos = n3 = this.bufPos + n4;
            return object;
        }
        n4 = this.bufLength;
        n3 = this.bufPos;
        if ((n4 -= n3) < (n3 = ((String)object).length())) {
            return this.consumeToEnd();
        }
        n4 = this.bufLength;
        int n8 = ((String)object).length();
        n4 = n4 - n8 + 1;
        object = this.charBuf;
        String[] stringArray = this.stringCache;
        int n10 = this.bufPos;
        int n14 = n4 - n10;
        object = CharacterReader.cacheString((char[])object, stringArray, n10, n14);
        this.bufPos = n4;
        return object;
    }

    public String consumeToAny(char ... object) {
        int n3;
        this.bufferUp();
        int n4 = this.bufPos;
        int n7 = this.bufLength;
        char[] cArray = this.charBuf;
        int n8 = ((char[])object).length;
        block0: for (n3 = n4; n3 < n7; ++n3) {
            for (int i3 = 0; i3 < n8; ++i3) {
                char c2 = cArray[n3];
                char c3 = object[i3];
                if (c2 == c3) break block0;
            }
        }
        this.bufPos = n3;
        if (n3 > n4) {
            object = this.charBuf;
            String[] stringArray = this.stringCache;
            object = CharacterReader.cacheString(object, stringArray, n4, n3 -= n4);
        } else {
            object = "";
        }
        return object;
    }

    public String consumeToAnySorted(char ... object) {
        int n3;
        this.bufferUp();
        int n4 = this.bufPos;
        int n7 = this.bufLength;
        char[] cArray = this.charBuf;
        for (n3 = n4; n3 < n7; ++n3) {
            int n8 = cArray[n3];
            if ((n8 = Arrays.binarySearch(object, (char)n8)) >= 0) break;
        }
        this.bufPos = n3;
        if (n3 > n4) {
            object = this.charBuf;
            String[] stringArray = this.stringCache;
            object = CharacterReader.cacheString(object, stringArray, n4, n3 -= n4);
        } else {
            object = "";
        }
        return object;
    }

    public String consumeToEnd() {
        int n3;
        this.bufferUp();
        Object object = this.charBuf;
        String[] stringArray = this.stringCache;
        int n4 = this.bufPos;
        int n7 = this.bufLength - n4;
        object = CharacterReader.cacheString(object, stringArray, n4, n7);
        this.bufPos = n3 = this.bufLength;
        return object;
    }

    public boolean containsIgnoreCase(String string2) {
        int n3;
        Object object = this.lastIcSeq;
        int n4 = string2.equals(object);
        boolean bl2 = false;
        boolean bl3 = true;
        int n7 = -1;
        if (n4 != 0) {
            n4 = this.lastIcIndex;
            if (n4 == n7) {
                return false;
            }
            n3 = this.bufPos;
            if (n4 >= n3) {
                return bl3;
            }
        }
        this.lastIcSeq = string2;
        object = Locale.ENGLISH;
        String string3 = string2.toLowerCase((Locale)object);
        n3 = this.nextIndexOf(string3);
        if (n3 > n7) {
            int n8;
            this.lastIcIndex = n8 = this.bufPos + n3;
            return bl3;
        }
        int n10 = this.nextIndexOf(string2 = string2.toUpperCase((Locale)object));
        if (n10 > n7) {
            bl2 = true;
        }
        if (bl2) {
            n4 = this.bufPos;
            n7 = n4 + n10;
        }
        this.lastIcIndex = n7;
        return bl2;
    }

    public char current() {
        this.bufferUp();
        char c2 = this.isEmptyNoBufferUp();
        if (c2 != '\u0000') {
            c2 = (char)-1;
        } else {
            char[] cArray = this.charBuf;
            int n3 = this.bufPos;
            c2 = cArray[n3];
        }
        return c2;
    }

    public boolean isEmpty() {
        this.bufferUp();
        int n3 = this.bufPos;
        int n4 = this.bufLength;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isTrackNewlines() {
        boolean bl2;
        ArrayList arrayList = this.newlinePositions;
        if (arrayList != null) {
            bl2 = true;
        } else {
            bl2 = false;
            arrayList = null;
        }
        return bl2;
    }

    public int lineNumber() {
        int n3 = this.pos();
        return this.lineNumber(n3);
    }

    public int lineNumber(int n3) {
        int n4 = this.isTrackNewlines();
        int n7 = 1;
        if (n4 == 0) {
            return n7;
        }
        if ((n3 = this.lineNumIndex(n3)) == (n4 = -1)) {
            return this.lineNumberOffset;
        }
        n4 = this.lineNumberOffset;
        return n3 + n4 + n7;
    }

    public void mark() {
        int n3 = this.bufLength;
        int n4 = this.bufPos;
        if ((n3 -= n4) < (n4 = 1024)) {
            n3 = 0;
            this.bufSplitPoint = 0;
        }
        this.bufferUp();
        this.bufMark = n3 = this.bufPos;
    }

    public boolean matchConsume(String string2) {
        this.bufferUp();
        int n3 = this.matches(string2);
        if (n3 != 0) {
            int n4;
            n3 = this.bufPos;
            this.bufPos = n4 = string2.length() + n3;
            return true;
        }
        return false;
    }

    public boolean matchConsumeIgnoreCase(String string2) {
        int n3 = this.matchesIgnoreCase(string2);
        if (n3 != 0) {
            int n4;
            n3 = this.bufPos;
            this.bufPos = n4 = string2.length() + n3;
            return true;
        }
        return false;
    }

    public boolean matches(char c2) {
        int n3;
        char[] cArray;
        char c3 = this.isEmpty();
        c2 = c3 == '\u0000' && (c3 = (cArray = this.charBuf)[n3 = this.bufPos]) == c2 ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public boolean matches(String string2) {
        this.bufferUp();
        int n3 = string2.length();
        int n4 = this.bufLength;
        int n7 = this.bufPos;
        n4 -= n7;
        n7 = 0;
        if (n3 > n4) {
            return false;
        }
        for (n4 = 0; n4 < n3; ++n4) {
            int n8;
            char[] cArray;
            char c2;
            char c3 = string2.charAt(n4);
            if (c3 == (c2 = (cArray = this.charBuf)[n8 = this.bufPos + n4])) continue;
            return false;
        }
        return true;
    }

    public boolean matchesAny(char ... cArray) {
        char c2 = this.isEmpty();
        if (c2 != '\u0000') {
            return false;
        }
        this.bufferUp();
        char[] cArray2 = this.charBuf;
        int n3 = this.bufPos;
        c2 = cArray2[n3];
        for (char c3 : cArray) {
            if (c3 != c2) continue;
            return true;
        }
        return false;
    }

    public boolean matchesAnySorted(char[] cArray) {
        int n3;
        char[] cArray2;
        int n4;
        this.bufferUp();
        char c2 = this.isEmpty();
        if (c2 == '\u0000' && (n4 = Arrays.binarySearch(cArray, c2 = (cArray2 = this.charBuf)[n3 = this.bufPos])) >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            cArray = null;
        }
        return n4 != 0;
    }

    public boolean matchesAsciiAlpha() {
        char c2 = this.isEmpty();
        boolean bl2 = false;
        if (c2 != '\u0000') {
            return false;
        }
        char[] cArray = this.charBuf;
        int n3 = this.bufPos;
        c2 = cArray[n3];
        if (c2 >= (n3 = 65) && c2 <= (n3 = 90) || c2 >= (n3 = 97) && c2 <= (n3 = 122)) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean matchesDigit() {
        char c2 = this.isEmpty();
        boolean bl2 = false;
        if (c2 != '\u0000') {
            return false;
        }
        char[] cArray = this.charBuf;
        int n3 = this.bufPos;
        c2 = cArray[n3];
        if (c2 >= (n3 = 48) && c2 <= (n3 = 57)) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean matchesIgnoreCase(String string2) {
        this.bufferUp();
        int n3 = string2.length();
        int n4 = this.bufLength;
        int n7 = this.bufPos;
        n4 -= n7;
        n7 = 0;
        if (n3 > n4) {
            return false;
        }
        for (n4 = 0; n4 < n3; ++n4) {
            int n8;
            char[] cArray;
            char c2;
            char c3 = Character.toUpperCase(string2.charAt(n4));
            if (c3 == (c2 = Character.toUpperCase((cArray = this.charBuf)[n8 = this.bufPos + n4]))) continue;
            return false;
        }
        return true;
    }

    public boolean matchesLetter() {
        char c2 = this.isEmpty();
        boolean bl2 = false;
        if (c2 != '\u0000') {
            return false;
        }
        char[] cArray = this.charBuf;
        int n3 = this.bufPos;
        c2 = cArray[n3];
        if (c2 >= (n3 = 65) && c2 <= (n3 = 90) || c2 >= (n3 = 97) && c2 <= (n3 = 122) || (c2 = (char)(Character.isLetter(c2) ? 1 : 0)) != '\u0000') {
            bl2 = true;
        }
        return bl2;
    }

    public int nextIndexOf(char c2) {
        int n3;
        this.bufferUp();
        for (int i3 = this.bufPos; i3 < (n3 = this.bufLength); ++i3) {
            char[] cArray = this.charBuf;
            n3 = cArray[i3];
            if (c2 != n3) continue;
            c2 = (char)this.bufPos;
            return i3 - c2;
        }
        return -1;
    }

    public int nextIndexOf(CharSequence charSequence) {
        int n3;
        this.bufferUp();
        char c2 = charSequence.charAt(0);
        int n4 = this.bufPos;
        while (n4 < (n3 = this.bufLength)) {
            char[] cArray = this.charBuf;
            n3 = cArray[n4];
            int n7 = 1;
            if (c2 != n3) {
                while ((n4 += n7) < (n3 = this.bufLength) && c2 != (n3 = (cArray = this.charBuf)[n4])) {
                }
            }
            n3 = n4 + 1;
            int n8 = charSequence.length() + n3 - n7;
            int n10 = this.bufLength;
            if (n4 < n10 && n8 <= n10) {
                char[] cArray2;
                char c3;
                char c5;
                n10 = n3;
                while (n10 < n8 && (c5 = charSequence.charAt(n7)) == (c3 = (cArray2 = this.charBuf)[n10])) {
                    ++n10;
                    ++n7;
                }
                if (n10 == n8) {
                    int n14 = this.bufPos;
                    return n4 - n14;
                }
            }
            n4 = n3;
        }
        return -1;
    }

    public int pos() {
        int n3 = this.readerPos;
        int n4 = this.bufPos;
        return n3 + n4;
    }

    public String posLineCol() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.lineNumber();
        stringBuilder.append(n3);
        stringBuilder.append(":");
        n3 = this.columnNumber();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public boolean rangeEquals(int n3, int n4, String string2) {
        return CharacterReader.rangeEquals(this.charBuf, n3, n4, string2);
    }

    public boolean readFully() {
        return this.readFully;
    }

    public void rewindToMark() {
        int n3 = this.bufMark;
        int n4 = -1;
        if (n3 != n4) {
            this.bufPos = n3;
            this.unmark();
            return;
        }
        IOException iOException = new IOException("Mark invalid");
        UncheckedIOException uncheckedIOException = new UncheckedIOException(iOException);
        throw uncheckedIOException;
    }

    public String toString() {
        int n3 = this.bufLength;
        int n4 = this.bufPos;
        int n7 = n3 - n4;
        if (n7 < 0) {
            return "";
        }
        char[] cArray = this.charBuf;
        String string2 = new String(cArray, n4, n3 -= n4);
        return string2;
    }

    public void trackNewlines(boolean bl2) {
        ArrayList arrayList;
        if (bl2 && (arrayList = this.newlinePositions) == null) {
            ArrayList arrayList2;
            int n3 = 409;
            this.newlinePositions = arrayList2 = new ArrayList(n3);
            this.scanBufferForNewlines();
        } else if (!bl2) {
            bl2 = false;
            Object var3_4 = null;
            this.newlinePositions = null;
        }
    }

    public void unconsume() {
        int n3 = this.bufPos;
        int n4 = 1;
        if (n3 >= n4) {
            this.bufPos = n3 -= n4;
            return;
        }
        IOException iOException = new IOException("WTF: No buffer left to unconsume.");
        UncheckedIOException uncheckedIOException = new UncheckedIOException(iOException);
        throw uncheckedIOException;
    }

    public void unmark() {
        this.bufMark = -1;
    }
}

