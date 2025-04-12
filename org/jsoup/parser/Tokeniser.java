/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.util.AbstractCollection;
import java.util.Arrays;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseError;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$Doctype;
import org.jsoup.parser.Token$EndTag;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Token$TokenType;
import org.jsoup.parser.Tokeniser$1;
import org.jsoup.parser.TokeniserState;

final class Tokeniser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int Unset = 255;
    private static final char[] notCharRefCharsSorted;
    static final char replacementChar = '\ufffd';
    static final int[] win1252Extensions;
    static final int win1252ExtensionsStart = 128;
    final Token$Character charPending;
    private int charStartPos;
    private final StringBuilder charsBuilder;
    private String charsString;
    private final int[] codepointHolder;
    final Token$Comment commentPending;
    final StringBuilder dataBuffer;
    final Token$Doctype doctypePending;
    private Token emitPending;
    final Token$EndTag endPending;
    private final ParseErrorList errors;
    private boolean isEmitPending;
    private String lastStartCloseSeq;
    private String lastStartTag;
    private int markupStartPos;
    private final int[] multipointHolder;
    private final CharacterReader reader;
    final Token$StartTag startPending;
    private TokeniserState state;
    Token$Tag tagPending;

    static {
        int[] nArray;
        char[] cArray;
        char[] cArray2 = cArray = new char[7];
        char[] cArray3 = cArray;
        cArray2[0] = 9;
        cArray3[1] = 10;
        cArray2[2] = 13;
        cArray3[3] = 12;
        cArray2[4] = 32;
        cArray3[5] = 60;
        cArray3[6] = 38;
        notCharRefCharsSorted = cArray;
        int[] nArray2 = nArray = new int[32];
        int[] nArray3 = nArray;
        nArray2[0] = 8364;
        nArray3[1] = 129;
        nArray2[2] = 8218;
        nArray3[3] = 402;
        nArray2[4] = 8222;
        nArray3[5] = 8230;
        nArray2[6] = 8224;
        nArray3[7] = 8225;
        nArray2[8] = 710;
        nArray3[9] = 8240;
        nArray2[10] = 352;
        nArray3[11] = 8249;
        nArray2[12] = 338;
        nArray3[13] = 141;
        nArray2[14] = 381;
        nArray3[15] = 143;
        nArray2[16] = 144;
        nArray3[17] = 8216;
        nArray2[18] = 8217;
        nArray3[19] = 8220;
        nArray2[20] = 8221;
        nArray3[21] = 8226;
        nArray2[22] = 8211;
        nArray3[23] = 8212;
        nArray2[24] = 732;
        nArray3[25] = 8482;
        nArray2[26] = 353;
        nArray3[27] = 8250;
        nArray2[28] = 339;
        nArray3[29] = 157;
        nArray2[30] = 382;
        nArray3[31] = 376;
        win1252Extensions = nArray;
        Arrays.sort(cArray);
    }

    public Tokeniser(CharacterReader characterReader, ParseErrorList parseErrorList, boolean bl2) {
        Object object;
        this.state = object = TokeniserState.Data;
        this.emitPending = null;
        this.isEmitPending = false;
        this.charsString = null;
        int n3 = 1024;
        super(n3);
        this.charsBuilder = object;
        super(n3);
        this.dataBuffer = object;
        super();
        this.endPending = object;
        super();
        this.charPending = object;
        super();
        this.doctypePending = object;
        super();
        this.commentPending = object;
        this.charStartPos = -1;
        object = new int[1];
        this.codepointHolder = (int[])object;
        object = new int[2];
        this.multipointHolder = (int[])object;
        super(bl2, characterReader);
        this.startPending = object;
        this.tagPending = object;
        this.reader = characterReader;
        this.errors = parseErrorList;
    }

    private void characterReferenceError(String string2, Object ... objectArray) {
        ParseErrorList parseErrorList = this.errors;
        boolean bl2 = parseErrorList.canAddError();
        if (bl2) {
            parseErrorList = this.errors;
            CharacterReader characterReader = this.reader;
            String string3 = "Invalid character reference: ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(string2);
            string2 = String.format(stringBuilder.toString(), objectArray);
            ParseError parseError = new ParseError(characterReader, string2);
            ((AbstractCollection)parseErrorList).add(parseError);
        }
    }

    public static boolean currentNodeInHtmlNS() {
        return true;
    }

    public void advanceTransition(TokeniserState tokeniserState) {
        this.transition(tokeniserState);
        this.reader.advance();
    }

    public String appropriateEndTagName() {
        return this.lastStartTag;
    }

    public String appropriateEndTagSeq() {
        CharSequence charSequence = this.lastStartCloseSeq;
        if (charSequence == null) {
            charSequence = new StringBuilder("</");
            String string2 = this.lastStartTag;
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            this.lastStartCloseSeq = charSequence;
        }
        return this.lastStartCloseSeq;
    }

    public int[] consumeCharacterReference(Character object, boolean object2) {
        Object object3;
        String string2;
        Object[] objectArray;
        int n3;
        Object object4;
        int n4;
        block21: {
            block22: {
                int n7 = 128;
                n4 = 1;
                object4 = this.reader;
                int n8 = object4.isEmpty();
                boolean n10 = false;
                Object object5 = null;
                if (n8 != 0) {
                    return null;
                }
                if (object != null && (n3 = ((Character)object).charValue()) == (n8 = (object4 = this.reader).current())) {
                    return null;
                }
                object = this.reader;
                object4 = notCharRefCharsSorted;
                n3 = (int)(((CharacterReader)object).matchesAnySorted((char[])object4) ? 1 : 0);
                if (n3 != 0) {
                    return null;
                }
                object = this.codepointHolder;
                this.reader.mark();
                object4 = this.reader;
                n8 = (int)(object4.matchConsume("#") ? 1 : 0);
                objectArray = ";";
                if (n8 != 0) {
                    Object object6 = this.reader;
                    object2 = (int)(((CharacterReader)object6).matchConsumeIgnoreCase("X") ? 1 : 0);
                    object4 = this.reader;
                    object4 = object2 != 0 ? object4.consumeHexSequence() : object4.consumeDigitSequence();
                    int n14 = object4.length();
                    if (n14 == 0) {
                        object6 = new Object[]{};
                        this.characterReferenceError("numeric reference with no numerals", (Object[])object6);
                        this.reader.rewindToMark();
                        return null;
                    }
                    this.reader.unmark();
                    object5 = this.reader;
                    boolean bl2 = ((CharacterReader)object5).matchConsume((String)objectArray);
                    if (!bl2) {
                        object5 = "missing semicolon on [&#%s]";
                        objectArray = new Object[n4];
                        objectArray[0] = object4;
                        this.characterReferenceError((String)object5, objectArray);
                    }
                    object2 = object2 != 0 ? 16 : 10;
                    int n15 = -1;
                    object6 = Integer.valueOf((String)object4, object2);
                    try {
                        object2 = (Integer)object6;
                    }
                    catch (NumberFormatException numberFormatException) {
                        object2 = -1;
                    }
                    if (object2 != n15 && (object2 < (n8 = 55296) || object2 > (n8 = 57343)) && object2 <= (n8 = 0x10FFFF)) {
                        int n16;
                        if (object2 >= n7 && object2 < (n16 = ((Object[])(object4 = (Object)win1252Extensions)).length + n7)) {
                            object5 = object2;
                            Object[] objectArray2 = new Object[n4];
                            objectArray2[0] = object5;
                            object5 = "character [%s] is not a valid unicode code point";
                            this.characterReferenceError((String)object5, objectArray2);
                            object2 -= n7;
                            object2 = (int)object4[object2];
                        }
                        object[0] = object2;
                    } else {
                        object6 = object2;
                        Object[] objectArray3 = new Object[n4];
                        objectArray3[0] = object6;
                        object6 = "character [%s] outside of valid range";
                        this.characterReferenceError((String)object6, objectArray3);
                        object2 = (char)-3;
                        object[0] = object2;
                    }
                    return object;
                }
                string2 = this.reader.consumeLetterThenDigitSequence();
                object4 = this.reader;
                n8 = (int)(object4.matches(';') ? 1 : 0);
                boolean bl3 = Entities.isBaseNamedEntity(string2);
                if (!(bl3 || (bl3 = Entities.isNamedEntity(string2)) && n8 != 0)) {
                    object = this.reader;
                    ((CharacterReader)object).rewindToMark();
                    if (n8 != 0) {
                        object = "invalid named reference [%s]";
                        Object[] objectArray4 = new Object[n4];
                        objectArray4[0] = string2;
                        this.characterReferenceError((String)object, objectArray4);
                    }
                    return null;
                }
                if (object2 == 0) break block21;
                object3 = this.reader;
                object2 = (int)(((CharacterReader)object3).matchesLetter() ? 1 : 0);
                if (object2 != 0 || (object2 = (int)(((CharacterReader)(object3 = this.reader)).matchesDigit() ? 1 : 0)) != 0) break block22;
                object3 = this.reader;
                n8 = 3;
                object4 = new char[n8];
                Object[] objectArray5 = object4;
                object4[0] = 61;
                objectArray5[1] = 45;
                objectArray5[2] = 95;
                object2 = (int)(((CharacterReader)object3).matchesAny((char[])object4) ? 1 : 0);
                if (object2 == 0) break block21;
            }
            this.reader.rewindToMark();
            return null;
        }
        this.reader.unmark();
        object3 = this.reader;
        object2 = (int)(((CharacterReader)object3).matchConsume((String)objectArray) ? 1 : 0);
        if (object2 == 0) {
            object3 = "missing semicolon on [&%s]";
            object4 = new Object[n4];
            object4[0] = string2;
            this.characterReferenceError((String)object3, object4);
        }
        if ((object2 = Entities.codepointsForName(string2, (int[])(object3 = (Object)this.multipointHolder))) == n4) {
            object2 = this.multipointHolder[0];
            object[0] = object2;
            return object;
        }
        n3 = 2;
        if (object2 == n3) {
            return this.multipointHolder;
        }
        object = new StringBuilder("Unexpected characters returned for ");
        ((StringBuilder)object).append(string2);
        Validate.fail(((StringBuilder)object).toString());
        return this.multipointHolder;
    }

    public void createBogusCommentPending() {
        this.commentPending.reset();
        this.commentPending.bogus = true;
    }

    public void createCommentPending() {
        this.commentPending.reset();
    }

    public void createDoctypePending() {
        this.doctypePending.reset();
    }

    public Token$Tag createTagPending(boolean bl2) {
        Token$Tag token$Tag = bl2 ? this.startPending.reset() : this.endPending.reset();
        this.tagPending = token$Tag;
        return token$Tag;
    }

    public void createTempBuffer() {
        Token.reset(this.dataBuffer);
    }

    public void emit(char c2) {
        int n3;
        Object object;
        CharSequence charSequence = this.charsString;
        if (charSequence == null) {
            object = String.valueOf(c2);
            this.charsString = object;
        } else {
            charSequence = this.charsBuilder;
            n3 = ((StringBuilder)charSequence).length();
            if (n3 == 0) {
                charSequence = this.charsBuilder;
                String string2 = this.charsString;
                ((StringBuilder)charSequence).append(string2);
            }
            charSequence = this.charsBuilder;
            ((StringBuilder)charSequence).append(c2);
        }
        object = this.charPending;
        n3 = this.charStartPos;
        ((Token)object).startPos(n3);
        object = this.charPending;
        n3 = this.reader.pos();
        ((Token)object).endPos(n3);
    }

    public void emit(String object) {
        int n3;
        CharSequence charSequence = this.charsString;
        if (charSequence == null) {
            this.charsString = object;
        } else {
            charSequence = this.charsBuilder;
            n3 = ((StringBuilder)charSequence).length();
            if (n3 == 0) {
                charSequence = this.charsBuilder;
                String string2 = this.charsString;
                ((StringBuilder)charSequence).append(string2);
            }
            charSequence = this.charsBuilder;
            ((StringBuilder)charSequence).append((String)object);
        }
        object = this.charPending;
        n3 = this.charStartPos;
        ((Token)object).startPos(n3);
        object = this.charPending;
        n3 = this.reader.pos();
        ((Token)object).endPos(n3);
    }

    public void emit(StringBuilder object) {
        int n3;
        CharSequence charSequence = this.charsString;
        if (charSequence == null) {
            object = ((StringBuilder)object).toString();
            this.charsString = object;
        } else {
            charSequence = this.charsBuilder;
            n3 = ((StringBuilder)charSequence).length();
            if (n3 == 0) {
                charSequence = this.charsBuilder;
                String string2 = this.charsString;
                ((StringBuilder)charSequence).append(string2);
            }
            charSequence = this.charsBuilder;
            ((StringBuilder)charSequence).append((CharSequence)object);
        }
        object = this.charPending;
        n3 = this.charStartPos;
        ((Token)object).startPos(n3);
        object = this.charPending;
        n3 = this.reader.pos();
        ((Token)object).endPos(n3);
    }

    public void emit(Token object) {
        Validate.isFalse(this.isEmitPending);
        this.emitPending = object;
        int n3 = 1;
        this.isEmitPending = n3;
        int n4 = this.markupStartPos;
        ((Token)object).startPos(n4);
        n4 = this.reader.pos();
        ((Token)object).endPos(n4);
        this.charStartPos = n4 = -1;
        Token$TokenType token$TokenType = ((Token)object).type;
        Token$TokenType token$TokenType2 = Token$TokenType.StartTag;
        if (token$TokenType == token$TokenType2) {
            this.lastStartTag = object = ((Token$StartTag)object).tagName;
            object = null;
            this.lastStartCloseSeq = null;
        } else {
            token$TokenType2 = Token$TokenType.EndTag;
            if (token$TokenType == token$TokenType2 && (n4 = (int)(((Token$Tag)(object = (Token$EndTag)object)).hasAttributes() ? 1 : 0)) != 0) {
                object = ((Token$Tag)object).normalName();
                Object[] objectArray = new Object[n3];
                n4 = 0;
                token$TokenType = null;
                objectArray[0] = object;
                object = "Attributes incorrectly present on end tag [/%s]";
                this.error((String)object, objectArray);
            }
        }
    }

    public void emit(char[] object) {
        object = String.valueOf(object);
        this.emit((String)object);
    }

    public void emit(int[] nArray) {
        int n3 = nArray.length;
        String string2 = new String(nArray, 0, n3);
        this.emit(string2);
    }

    public void emitCommentPending() {
        Token$Comment token$Comment = this.commentPending;
        this.emit(token$Comment);
    }

    public void emitDoctypePending() {
        Token$Doctype token$Doctype = this.doctypePending;
        this.emit(token$Doctype);
    }

    public void emitTagPending() {
        this.tagPending.finaliseTag();
        Token$Tag token$Tag = this.tagPending;
        this.emit(token$Tag);
    }

    public void eofError(TokeniserState tokeniserState) {
        ParseErrorList parseErrorList = this.errors;
        boolean bl2 = parseErrorList.canAddError();
        if (bl2) {
            parseErrorList = this.errors;
            CharacterReader characterReader = this.reader;
            String string2 = "Unexpectedly reached end of file (EOF) in input state [%s]";
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = tokeniserState;
            ParseError parseError = new ParseError(characterReader, string2, objectArray);
            ((AbstractCollection)parseErrorList).add(parseError);
        }
    }

    public void error(String string2) {
        ParseErrorList parseErrorList = this.errors;
        boolean bl2 = parseErrorList.canAddError();
        if (bl2) {
            parseErrorList = this.errors;
            CharacterReader characterReader = this.reader;
            ParseError parseError = new ParseError(characterReader, string2);
            ((AbstractCollection)parseErrorList).add(parseError);
        }
    }

    public void error(String string2, Object ... objectArray) {
        ParseErrorList parseErrorList = this.errors;
        boolean bl2 = parseErrorList.canAddError();
        if (bl2) {
            parseErrorList = this.errors;
            CharacterReader characterReader = this.reader;
            ParseError parseError = new ParseError(characterReader, string2, objectArray);
            ((AbstractCollection)parseErrorList).add(parseError);
        }
    }

    public void error(TokeniserState object) {
        ParseErrorList parseErrorList = this.errors;
        boolean bl2 = parseErrorList.canAddError();
        if (bl2) {
            parseErrorList = this.errors;
            CharacterReader characterReader = this.reader;
            Character c2 = Character.valueOf(characterReader.current());
            int n3 = 2;
            Object[] objectArray = new Object[n3];
            objectArray[0] = c2;
            int n4 = 1;
            objectArray[n4] = object;
            object = "Unexpected character '%s' in input state [%s]";
            ParseError parseError = new ParseError(characterReader, (String)object, objectArray);
            ((AbstractCollection)parseErrorList).add(parseError);
        }
    }

    public TokeniserState getState() {
        return this.state;
    }

    public boolean isAppropriateEndTagToken() {
        String string2;
        boolean bl2;
        String string3 = this.lastStartTag;
        if (string3 != null && (bl2 = (string3 = this.tagPending.name()).equalsIgnoreCase(string2 = this.lastStartTag))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public Token read() {
        Object object;
        Object object2;
        boolean bl2;
        while (!(bl2 = this.isEmitPending)) {
            object2 = this.state;
            object = this.reader;
            ((TokeniserState)((Object)object2)).read(this, (CharacterReader)object);
        }
        object2 = this.charsBuilder;
        int n3 = ((StringBuilder)object2).length();
        if (n3 != 0) {
            object = ((StringBuilder)object2).toString();
            int n4 = ((StringBuilder)object2).length();
            ((StringBuilder)object2).delete(0, n4);
            object2 = this.charPending.data((String)object);
            this.charsString = null;
            return object2;
        }
        object2 = this.charsString;
        if (object2 != null) {
            object2 = this.charPending.data((String)object2);
            this.charsString = null;
            return object2;
        }
        this.isEmitPending = false;
        return this.emitPending;
    }

    public void transition(TokeniserState tokeniserState) {
        Object object = Tokeniser$1.$SwitchMap$org$jsoup$parser$TokeniserState;
        int n3 = tokeniserState.ordinal();
        int n4 = object[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 == n3 && (n4 = this.charStartPos) == (n3 = -1)) {
                object = this.reader;
                this.charStartPos = n4 = ((CharacterReader)object).pos();
            }
        } else {
            object = this.reader;
            this.markupStartPos = n4 = ((CharacterReader)object).pos();
        }
        this.state = tokeniserState;
    }

    public String unescapeEntities(boolean bl2) {
        Object object;
        int n3;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        while ((n3 = ((CharacterReader)(object = this.reader)).isEmpty()) == false) {
            int n4;
            object = this.reader;
            int n7 = '&';
            object = ((CharacterReader)object).consumeTo((char)n7);
            stringBuilder.append((String)object);
            object = this.reader;
            n3 = (int)(((CharacterReader)object).matches((char)n7) ? 1 : 0);
            if (n3 == false) continue;
            this.reader.consume();
            n3 = false;
            object = this.consumeCharacterReference(null, bl2);
            if (object != null && (n4 = ((Object)object).length) != 0) {
                n7 = (int)object[0];
                stringBuilder.appendCodePoint(n7);
                n7 = ((Object)object).length;
                n4 = 2;
                if (n7 != n4) continue;
                n7 = 1;
                n3 = object[n7];
                stringBuilder.appendCodePoint(n3);
                continue;
            }
            stringBuilder.append((char)n7);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }
}

