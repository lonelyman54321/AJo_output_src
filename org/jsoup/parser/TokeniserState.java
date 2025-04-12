/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$EOF;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState$1;
import org.jsoup.parser.TokeniserState$10;
import org.jsoup.parser.TokeniserState$11;
import org.jsoup.parser.TokeniserState$12;
import org.jsoup.parser.TokeniserState$13;
import org.jsoup.parser.TokeniserState$14;
import org.jsoup.parser.TokeniserState$15;
import org.jsoup.parser.TokeniserState$16;
import org.jsoup.parser.TokeniserState$17;
import org.jsoup.parser.TokeniserState$18;
import org.jsoup.parser.TokeniserState$19;
import org.jsoup.parser.TokeniserState$2;
import org.jsoup.parser.TokeniserState$20;
import org.jsoup.parser.TokeniserState$21;
import org.jsoup.parser.TokeniserState$22;
import org.jsoup.parser.TokeniserState$23;
import org.jsoup.parser.TokeniserState$24;
import org.jsoup.parser.TokeniserState$25;
import org.jsoup.parser.TokeniserState$26;
import org.jsoup.parser.TokeniserState$27;
import org.jsoup.parser.TokeniserState$28;
import org.jsoup.parser.TokeniserState$29;
import org.jsoup.parser.TokeniserState$3;
import org.jsoup.parser.TokeniserState$30;
import org.jsoup.parser.TokeniserState$31;
import org.jsoup.parser.TokeniserState$32;
import org.jsoup.parser.TokeniserState$33;
import org.jsoup.parser.TokeniserState$34;
import org.jsoup.parser.TokeniserState$35;
import org.jsoup.parser.TokeniserState$36;
import org.jsoup.parser.TokeniserState$37;
import org.jsoup.parser.TokeniserState$38;
import org.jsoup.parser.TokeniserState$39;
import org.jsoup.parser.TokeniserState$4;
import org.jsoup.parser.TokeniserState$40;
import org.jsoup.parser.TokeniserState$41;
import org.jsoup.parser.TokeniserState$42;
import org.jsoup.parser.TokeniserState$43;
import org.jsoup.parser.TokeniserState$44;
import org.jsoup.parser.TokeniserState$45;
import org.jsoup.parser.TokeniserState$46;
import org.jsoup.parser.TokeniserState$47;
import org.jsoup.parser.TokeniserState$48;
import org.jsoup.parser.TokeniserState$49;
import org.jsoup.parser.TokeniserState$5;
import org.jsoup.parser.TokeniserState$50;
import org.jsoup.parser.TokeniserState$51;
import org.jsoup.parser.TokeniserState$52;
import org.jsoup.parser.TokeniserState$53;
import org.jsoup.parser.TokeniserState$54;
import org.jsoup.parser.TokeniserState$55;
import org.jsoup.parser.TokeniserState$56;
import org.jsoup.parser.TokeniserState$57;
import org.jsoup.parser.TokeniserState$58;
import org.jsoup.parser.TokeniserState$59;
import org.jsoup.parser.TokeniserState$6;
import org.jsoup.parser.TokeniserState$60;
import org.jsoup.parser.TokeniserState$61;
import org.jsoup.parser.TokeniserState$62;
import org.jsoup.parser.TokeniserState$63;
import org.jsoup.parser.TokeniserState$64;
import org.jsoup.parser.TokeniserState$65;
import org.jsoup.parser.TokeniserState$66;
import org.jsoup.parser.TokeniserState$67;
import org.jsoup.parser.TokeniserState$7;
import org.jsoup.parser.TokeniserState$8;
import org.jsoup.parser.TokeniserState$9;

abstract class TokeniserState
extends Enum {
    private static final /* synthetic */ TokeniserState[] $VALUES;
    public static final /* enum */ TokeniserState AfterAttributeName;
    public static final /* enum */ TokeniserState AfterAttributeValue_quoted;
    public static final /* enum */ TokeniserState AfterDoctypeName;
    public static final /* enum */ TokeniserState AfterDoctypePublicIdentifier;
    public static final /* enum */ TokeniserState AfterDoctypePublicKeyword;
    public static final /* enum */ TokeniserState AfterDoctypeSystemIdentifier;
    public static final /* enum */ TokeniserState AfterDoctypeSystemKeyword;
    public static final /* enum */ TokeniserState AttributeName;
    public static final /* enum */ TokeniserState AttributeValue_doubleQuoted;
    public static final /* enum */ TokeniserState AttributeValue_singleQuoted;
    public static final /* enum */ TokeniserState AttributeValue_unquoted;
    public static final /* enum */ TokeniserState BeforeAttributeName;
    public static final /* enum */ TokeniserState BeforeAttributeValue;
    public static final /* enum */ TokeniserState BeforeDoctypeName;
    public static final /* enum */ TokeniserState BeforeDoctypePublicIdentifier;
    public static final /* enum */ TokeniserState BeforeDoctypeSystemIdentifier;
    public static final /* enum */ TokeniserState BetweenDoctypePublicAndSystemIdentifiers;
    public static final /* enum */ TokeniserState BogusComment;
    public static final /* enum */ TokeniserState BogusDoctype;
    public static final /* enum */ TokeniserState CdataSection;
    public static final /* enum */ TokeniserState CharacterReferenceInData;
    public static final /* enum */ TokeniserState CharacterReferenceInRcdata;
    public static final /* enum */ TokeniserState Comment;
    public static final /* enum */ TokeniserState CommentEnd;
    public static final /* enum */ TokeniserState CommentEndBang;
    public static final /* enum */ TokeniserState CommentEndDash;
    public static final /* enum */ TokeniserState CommentStart;
    public static final /* enum */ TokeniserState CommentStartDash;
    public static final /* enum */ TokeniserState Data;
    public static final /* enum */ TokeniserState Doctype;
    public static final /* enum */ TokeniserState DoctypeName;
    public static final /* enum */ TokeniserState DoctypePublicIdentifier_doubleQuoted;
    public static final /* enum */ TokeniserState DoctypePublicIdentifier_singleQuoted;
    public static final /* enum */ TokeniserState DoctypeSystemIdentifier_doubleQuoted;
    public static final /* enum */ TokeniserState DoctypeSystemIdentifier_singleQuoted;
    public static final /* enum */ TokeniserState EndTagOpen;
    public static final /* enum */ TokeniserState MarkupDeclarationOpen;
    public static final /* enum */ TokeniserState PLAINTEXT;
    public static final /* enum */ TokeniserState RCDATAEndTagName;
    public static final /* enum */ TokeniserState RCDATAEndTagOpen;
    public static final /* enum */ TokeniserState Rawtext;
    public static final /* enum */ TokeniserState RawtextEndTagName;
    public static final /* enum */ TokeniserState RawtextEndTagOpen;
    public static final /* enum */ TokeniserState RawtextLessthanSign;
    public static final /* enum */ TokeniserState Rcdata;
    public static final /* enum */ TokeniserState RcdataLessthanSign;
    public static final /* enum */ TokeniserState ScriptData;
    public static final /* enum */ TokeniserState ScriptDataDoubleEscapeEnd;
    public static final /* enum */ TokeniserState ScriptDataDoubleEscapeStart;
    public static final /* enum */ TokeniserState ScriptDataDoubleEscaped;
    public static final /* enum */ TokeniserState ScriptDataDoubleEscapedDash;
    public static final /* enum */ TokeniserState ScriptDataDoubleEscapedDashDash;
    public static final /* enum */ TokeniserState ScriptDataDoubleEscapedLessthanSign;
    public static final /* enum */ TokeniserState ScriptDataEndTagName;
    public static final /* enum */ TokeniserState ScriptDataEndTagOpen;
    public static final /* enum */ TokeniserState ScriptDataEscapeStart;
    public static final /* enum */ TokeniserState ScriptDataEscapeStartDash;
    public static final /* enum */ TokeniserState ScriptDataEscaped;
    public static final /* enum */ TokeniserState ScriptDataEscapedDash;
    public static final /* enum */ TokeniserState ScriptDataEscapedDashDash;
    public static final /* enum */ TokeniserState ScriptDataEscapedEndTagName;
    public static final /* enum */ TokeniserState ScriptDataEscapedEndTagOpen;
    public static final /* enum */ TokeniserState ScriptDataEscapedLessthanSign;
    public static final /* enum */ TokeniserState ScriptDataLessthanSign;
    public static final /* enum */ TokeniserState SelfClosingStartTag;
    public static final /* enum */ TokeniserState TagName;
    public static final /* enum */ TokeniserState TagOpen;
    static final char[] attributeNameCharsSorted;
    static final char[] attributeValueUnquoted;
    private static final char eof = '\uffff';
    static final char nullChar = '\u0000';
    private static final char replacementChar = '\ufffd';
    private static final String replacementStr;

    private static /* synthetic */ TokeniserState[] $values() {
        TokeniserState tokeniserState = Data;
        tokeniserState = CharacterReferenceInData;
        tokeniserState = Rcdata;
        tokeniserState = CharacterReferenceInRcdata;
        tokeniserState = Rawtext;
        tokeniserState = ScriptData;
        tokeniserState = PLAINTEXT;
        tokeniserState = TagOpen;
        tokeniserState = EndTagOpen;
        tokeniserState = TagName;
        tokeniserState = RcdataLessthanSign;
        tokeniserState = RCDATAEndTagOpen;
        tokeniserState = RCDATAEndTagName;
        tokeniserState = RawtextLessthanSign;
        tokeniserState = RawtextEndTagOpen;
        tokeniserState = RawtextEndTagName;
        tokeniserState = ScriptDataLessthanSign;
        tokeniserState = ScriptDataEndTagOpen;
        tokeniserState = ScriptDataEndTagName;
        tokeniserState = ScriptDataEscapeStart;
        tokeniserState = ScriptDataEscapeStartDash;
        tokeniserState = ScriptDataEscaped;
        tokeniserState = ScriptDataEscapedDash;
        tokeniserState = ScriptDataEscapedDashDash;
        tokeniserState = ScriptDataEscapedLessthanSign;
        tokeniserState = ScriptDataEscapedEndTagOpen;
        tokeniserState = ScriptDataEscapedEndTagName;
        tokeniserState = ScriptDataDoubleEscapeStart;
        tokeniserState = ScriptDataDoubleEscaped;
        tokeniserState = ScriptDataDoubleEscapedDash;
        tokeniserState = ScriptDataDoubleEscapedDashDash;
        tokeniserState = ScriptDataDoubleEscapedLessthanSign;
        tokeniserState = ScriptDataDoubleEscapeEnd;
        tokeniserState = BeforeAttributeName;
        tokeniserState = AttributeName;
        tokeniserState = AfterAttributeName;
        tokeniserState = BeforeAttributeValue;
        tokeniserState = AttributeValue_doubleQuoted;
        tokeniserState = AttributeValue_singleQuoted;
        tokeniserState = AttributeValue_unquoted;
        tokeniserState = AfterAttributeValue_quoted;
        tokeniserState = SelfClosingStartTag;
        tokeniserState = BogusComment;
        tokeniserState = MarkupDeclarationOpen;
        tokeniserState = CommentStart;
        tokeniserState = CommentStartDash;
        tokeniserState = Comment;
        tokeniserState = CommentEndDash;
        tokeniserState = CommentEnd;
        tokeniserState = CommentEndBang;
        tokeniserState = Doctype;
        tokeniserState = BeforeDoctypeName;
        tokeniserState = DoctypeName;
        tokeniserState = AfterDoctypeName;
        tokeniserState = AfterDoctypePublicKeyword;
        tokeniserState = BeforeDoctypePublicIdentifier;
        tokeniserState = DoctypePublicIdentifier_doubleQuoted;
        tokeniserState = DoctypePublicIdentifier_singleQuoted;
        tokeniserState = AfterDoctypePublicIdentifier;
        tokeniserState = BetweenDoctypePublicAndSystemIdentifiers;
        tokeniserState = AfterDoctypeSystemKeyword;
        tokeniserState = BeforeDoctypeSystemIdentifier;
        tokeniserState = DoctypeSystemIdentifier_doubleQuoted;
        tokeniserState = DoctypeSystemIdentifier_singleQuoted;
        tokeniserState = AfterDoctypeSystemIdentifier;
        tokeniserState = BogusDoctype;
        tokeniserState = CdataSection;
        TokeniserState[] tokeniserStateArray = new TokeniserState[]{tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState, tokeniserState};
        return tokeniserStateArray;
    }

    static {
        Object object = new TokeniserState$1();
        Data = object;
        object = new TokeniserState$2();
        CharacterReferenceInData = object;
        object = new TokeniserState$3();
        Rcdata = object;
        object = new TokeniserState$4();
        CharacterReferenceInRcdata = object;
        object = new TokeniserState$5();
        Rawtext = object;
        object = new TokeniserState$6();
        ScriptData = object;
        object = new TokeniserState$7();
        PLAINTEXT = object;
        object = new TokeniserState$8();
        TagOpen = object;
        object = new TokeniserState$9();
        EndTagOpen = object;
        object = new TokeniserState$10();
        TagName = object;
        object = new TokeniserState$11();
        RcdataLessthanSign = object;
        int n3 = 11;
        object = new TokeniserState$12();
        RCDATAEndTagOpen = object;
        object = new TokeniserState$13();
        RCDATAEndTagName = object;
        int n4 = 13;
        object = new TokeniserState$14();
        RawtextLessthanSign = object;
        object = new TokeniserState$15();
        RawtextEndTagOpen = object;
        object = new TokeniserState$16();
        RawtextEndTagName = object;
        object = new TokeniserState$17();
        ScriptDataLessthanSign = object;
        object = new TokeniserState$18();
        ScriptDataEndTagOpen = object;
        object = new TokeniserState$19();
        ScriptDataEndTagName = object;
        object = new TokeniserState$20();
        ScriptDataEscapeStart = object;
        object = new TokeniserState$21();
        ScriptDataEscapeStartDash = object;
        object = new TokeniserState$22();
        ScriptDataEscaped = object;
        object = new TokeniserState$23();
        ScriptDataEscapedDash = object;
        object = new TokeniserState$24();
        ScriptDataEscapedDashDash = object;
        object = new TokeniserState$25();
        ScriptDataEscapedLessthanSign = object;
        object = new TokeniserState$26();
        ScriptDataEscapedEndTagOpen = object;
        object = new TokeniserState$27();
        ScriptDataEscapedEndTagName = object;
        object = new TokeniserState$28();
        ScriptDataDoubleEscapeStart = object;
        object = new TokeniserState$29();
        ScriptDataDoubleEscaped = object;
        object = new TokeniserState$30();
        ScriptDataDoubleEscapedDash = object;
        object = new TokeniserState$31();
        ScriptDataDoubleEscapedDashDash = object;
        object = new TokeniserState$32();
        ScriptDataDoubleEscapedLessthanSign = object;
        object = new TokeniserState$33();
        ScriptDataDoubleEscapeEnd = object;
        object = new TokeniserState$34();
        BeforeAttributeName = object;
        object = new TokeniserState$35();
        AttributeName = object;
        object = new TokeniserState$36();
        AfterAttributeName = object;
        object = new TokeniserState$37();
        BeforeAttributeValue = object;
        object = new TokeniserState$38();
        AttributeValue_doubleQuoted = object;
        object = new TokeniserState$39();
        AttributeValue_singleQuoted = object;
        object = new TokeniserState$40();
        AttributeValue_unquoted = object;
        object = new TokeniserState$41();
        AfterAttributeValue_quoted = object;
        object = new TokeniserState$42();
        SelfClosingStartTag = object;
        object = new TokeniserState$43();
        BogusComment = object;
        object = new TokeniserState$44();
        MarkupDeclarationOpen = object;
        object = new TokeniserState$45();
        CommentStart = object;
        object = new TokeniserState$46();
        CommentStartDash = object;
        object = new TokeniserState$47();
        Comment = object;
        object = new TokeniserState$48();
        CommentEndDash = object;
        object = new TokeniserState$49();
        CommentEnd = object;
        object = new TokeniserState$50();
        CommentEndBang = object;
        object = new TokeniserState$51();
        Doctype = object;
        object = new TokeniserState$52();
        BeforeDoctypeName = object;
        object = new TokeniserState$53();
        DoctypeName = object;
        object = new TokeniserState$54();
        AfterDoctypeName = object;
        object = new TokeniserState$55();
        AfterDoctypePublicKeyword = object;
        object = new TokeniserState$56();
        BeforeDoctypePublicIdentifier = object;
        object = new TokeniserState$57();
        DoctypePublicIdentifier_doubleQuoted = object;
        object = new TokeniserState$58();
        DoctypePublicIdentifier_singleQuoted = object;
        object = new TokeniserState$59();
        AfterDoctypePublicIdentifier = object;
        object = new TokeniserState$60();
        BetweenDoctypePublicAndSystemIdentifiers = object;
        object = new TokeniserState$61();
        AfterDoctypeSystemKeyword = object;
        object = new TokeniserState$62();
        BeforeDoctypeSystemIdentifier = object;
        object = new TokeniserState$63();
        DoctypeSystemIdentifier_doubleQuoted = object;
        object = new TokeniserState$64();
        DoctypeSystemIdentifier_singleQuoted = object;
        object = new TokeniserState$65();
        AfterDoctypeSystemIdentifier = object;
        object = new TokeniserState$66();
        BogusDoctype = object;
        object = new TokeniserState$67();
        CdataSection = object;
        $VALUES = TokeniserState.$values();
        Object object2 = object = (Object)new char[n3];
        object2[0] = (TokeniserState$1)9;
        object2[1] = (TokeniserState$1)10;
        object2[2] = (TokeniserState$1)12;
        object2[3] = (TokeniserState$1)13;
        object2[4] = (TokeniserState$1)32;
        object2[5] = (TokeniserState$1)34;
        object2[6] = (TokeniserState$1)39;
        object2[7] = (TokeniserState$1)47;
        object2[8] = (TokeniserState$1)60;
        object2[9] = (TokeniserState$1)61;
        object2[10] = (TokeniserState$1)62;
        attributeNameCharsSorted = (char[])object;
        Object object3 = object = (Object)new char[n4];
        object3[0] = (TokeniserState$1)false;
        object3[1] = (TokeniserState$1)9;
        object3[2] = (TokeniserState$1)10;
        object3[3] = (TokeniserState$1)12;
        object3[4] = (TokeniserState$1)13;
        object3[5] = (TokeniserState$1)32;
        object3[6] = (TokeniserState$1)34;
        object3[7] = (TokeniserState$1)38;
        object3[8] = (TokeniserState$1)39;
        object3[9] = (TokeniserState$1)60;
        object3[10] = (TokeniserState$1)61;
        object3[11] = (TokeniserState$1)62;
        object3[12] = (TokeniserState$1)96;
        attributeValueUnquoted = (char[])object;
        replacementStr = String.valueOf((char)-3);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TokeniserState() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ TokeniserState(TokeniserState$1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static /* synthetic */ void access$100(Tokeniser tokeniser, TokeniserState tokeniserState) {
        TokeniserState.readCharRef(tokeniser, tokeniserState);
    }

    public static /* synthetic */ void access$200(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        TokeniserState.readRawData(tokeniser, characterReader, tokeniserState, tokeniserState2);
    }

    public static /* synthetic */ String access$300() {
        return replacementStr;
    }

    public static /* synthetic */ void access$400(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        TokeniserState.readEndTag(tokeniser, characterReader, tokeniserState, tokeniserState2);
    }

    public static /* synthetic */ void access$500(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        TokeniserState.handleDataEndTag(tokeniser, characterReader, tokeniserState);
    }

    public static /* synthetic */ void access$600(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, tokeniserState, tokeniserState2);
    }

    private static void handleDataDoubleEscapeTag(Tokeniser tokeniser, CharacterReader object, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        int n3;
        boolean n4 = ((CharacterReader)object).matchesLetter();
        if (n4) {
            object = ((CharacterReader)object).consumeLetterSequence();
            tokeniser.dataBuffer.append((String)object);
            tokeniser.emit((String)object);
            return;
        }
        int n7 = ((CharacterReader)object).consume();
        if (n7 != (n3 = 9) && n7 != (n3 = 10) && n7 != (n3 = 12) && n7 != (n3 = 13) && n7 != (n3 = 32) && n7 != (n3 = 47) && n7 != (n3 = 62)) {
            ((CharacterReader)object).unconsume();
            tokeniser.transition(tokeniserState2);
        } else {
            String string2;
            object = tokeniser.dataBuffer.toString();
            boolean bl2 = ((String)object).equals(string2 = "script");
            if (bl2) {
                tokeniser.transition(tokeniserState);
            } else {
                tokeniser.transition(tokeniserState2);
            }
            tokeniser.emit((char)n7);
        }
    }

    private static void handleDataEndTag(Tokeniser tokeniser, CharacterReader object, TokeniserState tokeniserState) {
        block5: {
            block1: {
                block2: {
                    block3: {
                        block4: {
                            char c2;
                            char c3;
                            char c5;
                            char c6;
                            char c7;
                            boolean bl2;
                            boolean n3 = ((CharacterReader)object).matchesLetter();
                            if (n3) {
                                object = ((CharacterReader)object).consumeLetterSequence();
                                tokeniser.tagPending.appendTagName((String)object);
                                tokeniser.dataBuffer.append((String)object);
                                return;
                            }
                            boolean bl3 = tokeniser.isAppropriateEndTagToken();
                            if (!bl3 || (bl2 = ((CharacterReader)object).isEmpty())) break block1;
                            char c8 = ((CharacterReader)object).consume();
                            if (c8 == (c7 = '\t') || c8 == (c6 = '\n') || c8 == (c5 = '\f') || c8 == (c3 = '\r') || c8 == (c2 = ' ')) break block2;
                            char c10 = '/';
                            if (c8 == c10) break block3;
                            char c11 = '>';
                            if (c8 == c11) break block4;
                            StringBuilder stringBuilder = tokeniser.dataBuffer;
                            stringBuilder.append(c8);
                            break block1;
                        }
                        tokeniser.emitTagPending();
                        object = Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                        break block5;
                    }
                    object = SelfClosingStartTag;
                    tokeniser.transition((TokeniserState)((Object)object));
                    break block5;
                }
                object = BeforeAttributeName;
                tokeniser.transition((TokeniserState)((Object)object));
                break block5;
            }
            tokeniser.emit("</");
            object = tokeniser.dataBuffer;
            tokeniser.emit((StringBuilder)object);
            tokeniser.transition(tokeniserState);
        }
    }

    private static void readCharRef(Tokeniser tokeniser, TokeniserState tokeniserState) {
        char c2 = '\u0000';
        int[] nArray = tokeniser.consumeCharacterReference(null, false);
        if (nArray == null) {
            c2 = '&';
            tokeniser.emit(c2);
        } else {
            tokeniser.emit(nArray);
        }
        tokeniser.transition(tokeniserState);
    }

    private static void readEndTag(Tokeniser tokeniser, CharacterReader object, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        boolean bl2 = ((CharacterReader)object).matchesAsciiAlpha();
        if (bl2) {
            bl2 = false;
            object = null;
            tokeniser.createTagPending(false);
            tokeniser.transition(tokeniserState);
        } else {
            object = "</";
            tokeniser.emit((String)object);
            tokeniser.transition(tokeniserState2);
        }
    }

    private static void readRawData(Tokeniser tokeniser, CharacterReader object, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char c2 = ((CharacterReader)object).current();
        if (c2 != '\u0000') {
            char c3 = '<';
            if (c2 != c3) {
                c3 = (char)-1;
                if (c2 != c3) {
                    object = ((CharacterReader)object).consumeRawData();
                    tokeniser.emit((String)object);
                } else {
                    object = new Token$EOF();
                    tokeniser.emit((Token)object);
                }
            } else {
                tokeniser.advanceTransition(tokeniserState2);
            }
        } else {
            tokeniser.error(tokeniserState);
            ((CharacterReader)object).advance();
            char c5 = (char)-3;
            tokeniser.emit(c5);
        }
    }

    public static TokeniserState valueOf(String string2) {
        return Enum.valueOf(TokeniserState.class, string2);
    }

    public static TokeniserState[] values() {
        return (TokeniserState[])$VALUES.clone();
    }

    public abstract void read(Tokeniser var1, CharacterReader var2);
}

