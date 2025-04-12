/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.Entities$1;
import org.jsoup.nodes.Entities$CoreCharset;
import org.jsoup.nodes.Entities$EscapeMode;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;

public class Entities {
    private static Document$OutputSettings DefaultOutput;
    private static final char[] codeDelims;
    static final int codepointRadix = 36;
    private static final int empty = 255;
    private static final String emptyName = "";
    private static final HashMap multipoints;

    static {
        Object object = new char[]{',', ';'};
        codeDelims = object;
        object = new HashMap;
        object();
        multipoints = object;
    }

    private Entities() {
    }

    public static /* synthetic */ void access$000(Entities$EscapeMode entities$EscapeMode, String string2, int n3) {
        Entities.load(entities$EscapeMode, string2, n3);
    }

    private static void appendEncoded(Appendable appendable, Entities$EscapeMode object, int n3) {
        object = object.nameForCodepoint(n3);
        String string2 = emptyName;
        boolean bl2 = string2.equals(object);
        char c2 = ';';
        if (!bl2) {
            n3 = 38;
            appendable = appendable.append((char)n3).append((CharSequence)object);
            appendable.append(c2);
        } else {
            appendable = appendable.append("&#x");
            object = Integer.toHexString(n3);
            appendable = appendable.append((CharSequence)object);
            appendable.append(c2);
        }
    }

    private static boolean canEncode(Entities$CoreCharset entities$CoreCharset, char c2, CharsetEncoder charsetEncoder) {
        boolean bl2;
        int[] nArray = Entities$1.$SwitchMap$org$jsoup$nodes$Entities$CoreCharset;
        int c3 = entities$CoreCharset.ordinal();
        boolean bl3 = nArray[c3];
        if (bl3 != (bl2 = true)) {
            boolean bl4 = 2 != 0;
            if (bl3 != bl4) {
                return charsetEncoder.canEncode(c2);
            }
            return bl2;
        }
        char c5 = '\u0080';
        if (c2 >= c5) {
            bl2 = false;
            nArray = null;
        }
        return bl2;
    }

    public static int codepointsForName(String string2, int[] nArray) {
        int n3;
        Object object = (String)multipoints.get(string2);
        int n4 = 1;
        if (object != null) {
            int n7;
            nArray[0] = n7 = object.codePointAt(0);
            nArray[n4] = n7 = object.codePointAt(n4);
            return 2;
        }
        object = Entities$EscapeMode.extended;
        int n8 = ((Entities$EscapeMode)((Object)object)).codepointForName(string2);
        if (n8 != (n3 = -1)) {
            nArray[0] = n8;
            return n4;
        }
        return 0;
    }

    public static String escape(String string2) {
        Document$OutputSettings document$OutputSettings = DefaultOutput;
        if (document$OutputSettings == null) {
            DefaultOutput = document$OutputSettings = new Document$OutputSettings();
        }
        document$OutputSettings = DefaultOutput;
        return Entities.escape(string2, document$OutputSettings);
    }

    public static String escape(String string2, Document$OutputSettings object) {
        if (string2 == null) {
            return emptyName;
        }
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        try {
            Entities.escape(stringBuilder, string2, (Document$OutputSettings)object, false, false, false, false);
        }
        catch (IOException iOException) {
            object = new SerializationException(iOException);
            throw object;
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void escape(Appendable appendable, String string2, Document$OutputSettings document$OutputSettings, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Appendable appendable2 = appendable;
        Entities$EscapeMode entities$EscapeMode = document$OutputSettings.escapeMode();
        CharsetEncoder charsetEncoder = document$OutputSettings.encoder();
        Entities$CoreCharset entities$CoreCharset = document$OutputSettings.coreCharset;
        int n3 = string2.length();
        int n4 = 0;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        while (true) {
            char c2;
            block20: {
                char c3;
                block23: {
                    block24: {
                        block25: {
                            block26: {
                                Document$OutputSettings$Syntax document$OutputSettings$Syntax;
                                Document$OutputSettings$Syntax document$OutputSettings$Syntax2;
                                Entities$EscapeMode entities$EscapeMode2;
                                block27: {
                                    block28: {
                                        char c5;
                                        char c6;
                                        block21: {
                                            block22: {
                                                if (n4 >= n3) {
                                                    return;
                                                }
                                                c2 = string2.codePointAt(n4);
                                                c6 = ' ';
                                                if (!bl3) break block21;
                                                c3 = (char)(StringUtil.isWhitespace(c2) ? 1 : 0);
                                                c5 = '\u0001';
                                                if (c3 == '\u0000') break block22;
                                                if (!(bl4 && !bl7 || bl8)) {
                                                    if (bl5) {
                                                        bl6 = true;
                                                        break block20;
                                                    } else {
                                                        appendable2.append(c6);
                                                        bl8 = true;
                                                    }
                                                }
                                                break block20;
                                            }
                                            if (bl6) {
                                                appendable2.append(c6);
                                                bl6 = false;
                                            }
                                            bl7 = true;
                                            bl8 = false;
                                        }
                                        if (c2 >= (c3 = '\u10000')) break block23;
                                        c3 = c2;
                                        c5 = '\t';
                                        if (c3 == c5 || c3 == (c5 = '\n') || c3 == (c5 = '\r')) break block24;
                                        c5 = '\"';
                                        if (c3 == c5) break block25;
                                        c5 = '&';
                                        if (c3 == c5) break block26;
                                        c5 = '<';
                                        if (c3 == c5) break block27;
                                        c5 = '>';
                                        if (c3 == c5) break block28;
                                        c5 = '\u00a0';
                                        if (c3 != c5) {
                                            if (c3 >= c6 && (c6 = (char)(Entities.canEncode(entities$CoreCharset, c3, charsetEncoder) ? 1 : 0)) != '\u0000') {
                                                appendable2.append(c3);
                                                break block20;
                                            } else {
                                                Entities.appendEncoded(appendable2, entities$EscapeMode, c2);
                                            }
                                            break block20;
                                        } else {
                                            Entities$EscapeMode entities$EscapeMode3 = Entities$EscapeMode.xhtml;
                                            if (entities$EscapeMode != entities$EscapeMode3) {
                                                String string3 = "&nbsp;";
                                                appendable2.append(string3);
                                                break block20;
                                            } else {
                                                String string4 = "&#xa0;";
                                                appendable2.append(string4);
                                            }
                                        }
                                        break block20;
                                    }
                                    if (!bl2) {
                                        String string5 = "&gt;";
                                        appendable2.append(string5);
                                        break block20;
                                    } else {
                                        appendable2.append(c3);
                                    }
                                    break block20;
                                }
                                if (bl2 && entities$EscapeMode != (entities$EscapeMode2 = Entities$EscapeMode.xhtml) && (document$OutputSettings$Syntax2 = document$OutputSettings.syntax()) != (document$OutputSettings$Syntax = Document$OutputSettings$Syntax.xml)) {
                                    appendable2.append(c3);
                                    break block20;
                                } else {
                                    String string6 = "&lt;";
                                    appendable2.append(string6);
                                }
                                break block20;
                            }
                            String string7 = "&amp;";
                            appendable2.append(string7);
                            break block20;
                        }
                        if (bl2) {
                            String string8 = "&quot;";
                            appendable2.append(string8);
                            break block20;
                        } else {
                            appendable2.append(c3);
                        }
                        break block20;
                    }
                    appendable2.append(c3);
                    break block20;
                }
                char[] cArray = Character.toChars(c2);
                String string9 = new String(cArray);
                c3 = (char)(charsetEncoder.canEncode(string9) ? 1 : 0);
                if (c3 != '\u0000') {
                    appendable2.append(string9);
                } else {
                    Entities.appendEncoded(appendable2, entities$EscapeMode, c2);
                }
            }
            c2 = Character.charCount(c2);
            n4 += c2;
        }
    }

    public static String getByName(String object) {
        int n3;
        Object object2 = (String)multipoints.get(object);
        if (object2 != null) {
            return object2;
        }
        object2 = Entities$EscapeMode.extended;
        int n4 = ((Entities$EscapeMode)((Object)object2)).codepointForName((String)object);
        if (n4 != (n3 = -1)) {
            object = new int[]{n4};
            object2 = new String((int[])object, 0, 1);
            return object2;
        }
        return emptyName;
    }

    public static boolean isBaseNamedEntity(String string2) {
        int n3;
        Entities$EscapeMode entities$EscapeMode = Entities$EscapeMode.base;
        int n4 = entities$EscapeMode.codepointForName(string2);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        return n4 != 0;
    }

    public static boolean isNamedEntity(String string2) {
        int n3;
        Entities$EscapeMode entities$EscapeMode = Entities$EscapeMode.extended;
        int n4 = entities$EscapeMode.codepointForName(string2);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        return n4 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void load(Entities$EscapeMode object, String string2, int n3) {
        Object object2 = new String[n3];
        Entities$EscapeMode.access$102(object, (String[])object2);
        object2 = new int[n3];
        Entities$EscapeMode.access$202(object, (int[])object2);
        object2 = new int[n3];
        Entities$EscapeMode.access$302(object, (int[])object2);
        object2 = new String[n3];
        Entities$EscapeMode.access$402(object, (String[])object2);
        object2 = new CharacterReader(string2);
        boolean bl2 = false;
        string2 = null;
        int n4 = 0;
        try {
            char c2;
            while ((c2 = ((CharacterReader)object2).isEmpty()) == '\u0000') {
                c2 = '=';
                String string3 = ((CharacterReader)object2).consumeTo(c2);
                ((CharacterReader)object2).advance();
                Object object3 = codeDelims;
                object3 = ((CharacterReader)object2).consumeToAny((char)object3);
                int n7 = 36;
                int n8 = Integer.parseInt((String)object3, n7);
                int n10 = ((CharacterReader)object2).current();
                ((CharacterReader)object2).advance();
                int n14 = 44;
                int n15 = -1;
                if (n10 == n14) {
                    n10 = 59;
                    String string4 = ((CharacterReader)object2).consumeTo((char)n10);
                    n10 = Integer.parseInt(string4, n7);
                    ((CharacterReader)object2).advance();
                } else {
                    n10 = -1;
                }
                n14 = 38;
                Object object4 = ((CharacterReader)object2).consumeTo((char)n14);
                n7 = Integer.parseInt((String)object4, n7);
                ((CharacterReader)object2).advance();
                object4 = Entities$EscapeMode.access$100(object);
                object4[n4] = string3;
                object4 = Entities$EscapeMode.access$200(object);
                object4[n4] = (String)n8;
                object4 = Entities$EscapeMode.access$300(object);
                object4[n7] = (String)n8;
                object4 = Entities$EscapeMode.access$400(object);
                object4[n7] = string3;
                if (n10 != n15) {
                    HashMap hashMap = multipoints;
                    object3 = new int[]{n8, n10};
                    n10 = 2;
                    object4 = new String((int[])object3, 0, n10);
                    hashMap.put(string3, object4);
                }
                ++n4;
            }
            if (n4 == n3) {
                bl2 = true;
            }
            object = "Unexpected count of entities loaded";
            Validate.isTrue(bl2, (String)object);
            ((CharacterReader)object2).close();
            return;
        }
        catch (Throwable throwable) {}
        ((CharacterReader)object2).close();
        throw throwable;
    }

    public static String unescape(String string2) {
        return Entities.unescape(string2, false);
    }

    public static String unescape(String string2, boolean bl2) {
        return Parser.unescapeEntities(string2, bl2);
    }
}

