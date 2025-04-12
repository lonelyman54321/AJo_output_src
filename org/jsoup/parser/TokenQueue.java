/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class TokenQueue {
    private static final String[] CssIdentifierChars;
    private static final char ESC = '\\';
    private static final String[] ElementSelectorChars;
    private int pos = 0;
    private String queue;

    static {
        String string2 = "_";
        String string3 = "-";
        ElementSelectorChars = new String[]{"*|", "|", string2, string3};
        CssIdentifierChars = new String[]{string3, string2};
    }

    public TokenQueue(String string2) {
        Validate.notNull(string2);
        this.queue = string2;
    }

    private String consumeEscapedCssIdentifier(String ... object) {
        int n3;
        int n4 = this.pos;
        int n7 = 0;
        while ((n3 = this.isEmpty()) == 0) {
            String string2 = this.queue;
            int n8 = this.pos;
            n3 = string2.charAt(n8);
            n8 = 92;
            int n10 = 1;
            if (n3 == n8 && (n3 = this.remainingLength()) > n10) {
                this.pos = n7 = this.pos + 2;
                n7 = 1;
                continue;
            }
            n3 = (int)(this.matchesCssIdentifier((String[])object) ? 1 : 0);
            if (n3 == 0) break;
            this.pos = n3 = this.pos + n10;
        }
        object = this.queue;
        n3 = this.pos;
        object = ((String)object).substring(n4, n3);
        if (n7 != 0) {
            object = TokenQueue.unescape((String)object);
        }
        return object;
    }

    public static String escapeCssIdentifier(String stringArray) {
        char c2;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        TokenQueue tokenQueue = new TokenQueue((String)stringArray);
        while ((c2 = tokenQueue.isEmpty()) == '\u0000') {
            stringArray = ElementSelectorChars;
            c2 = tokenQueue.matchesCssIdentifier(stringArray);
            if (c2 != '\u0000') {
                c2 = tokenQueue.consume();
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.append('\\');
            c2 = tokenQueue.consume();
            stringBuilder.append(c2);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    private boolean matchesCssIdentifier(String ... stringArray) {
        boolean bl2;
        boolean bl3 = this.matchesWord();
        if (!bl3 && !(bl2 = this.matchesAny(stringArray))) {
            bl2 = false;
            stringArray = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private int remainingLength() {
        int n3 = this.queue.length();
        int n4 = this.pos;
        return n3 - n4;
    }

    public static String unescape(String object) {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        object = ((String)object).toCharArray();
        int n3 = ((Object)object).length;
        Object object2 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = object[i3];
            int n4 = 92;
            if (object3 == n4) {
                if (object2 == n4) {
                    stringBuilder.append((char)object3);
                    object2 = 0;
                    continue;
                }
            } else {
                stringBuilder.append((char)object3);
            }
            object2 = object3;
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public void addFirst(String charSequence) {
        charSequence = Ex0.a((String)charSequence);
        String string2 = this.queue;
        int n3 = this.pos;
        string2 = string2.substring(n3);
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        this.queue = charSequence;
        this.pos = 0;
    }

    public void advance() {
        int n3 = this.isEmpty();
        if (n3 == 0) {
            this.pos = n3 = this.pos + 1;
        }
    }

    public String chompBalanced(char c2, char c3) {
        int n3 = -1;
        char c5 = '\u0000';
        boolean bl2 = false;
        boolean bl3 = false;
        int n4 = -1;
        int n7 = -1;
        int n8 = 0;
        boolean bl4 = false;
        while (true) {
            char c6;
            block21: {
                block17: {
                    block19: {
                        block20: {
                            char c7;
                            block18: {
                                if ((c6 = this.isEmpty()) != '\u0000') break block17;
                                c6 = this.consume();
                                c7 = '\\';
                                if (c5 == c7) break block18;
                                c7 = '\'';
                                if (c6 == c7 && c6 != c2 && !bl2) {
                                    bl3 ^= true;
                                } else {
                                    c7 = '\"';
                                    if (c6 == c7 && c6 != c2 && !bl3) {
                                        bl2 ^= true;
                                    }
                                }
                                if (bl3 || bl2 || bl4) break block19;
                                if (c6 == c2) {
                                    ++n8;
                                    if (n4 == n3) {
                                        n4 = this.pos;
                                    }
                                } else if (c6 == c3) {
                                    n8 += -1;
                                }
                                break block20;
                            }
                            c7 = 'Q';
                            if (c6 == c7) {
                                bl4 = true;
                            } else {
                                c7 = 'E';
                                if (c6 == c7) {
                                    bl4 = false;
                                }
                            }
                        }
                        if (n8 > 0 && c5 != '\u0000') {
                            n7 = this.pos;
                        }
                    }
                    if (n8 > 0) break block21;
                }
                String string2 = n7 >= 0 ? this.queue.substring(n4, n7) : "";
                if (n8 > 0) {
                    CharSequence charSequence = new StringBuilder("Did not find balanced marker at '");
                    charSequence.append(string2);
                    String string3 = "'";
                    charSequence.append(string3);
                    charSequence = charSequence.toString();
                    Validate.fail((String)charSequence);
                }
                return string2;
            }
            c5 = c6;
        }
    }

    public String chompTo(String string2) {
        String string3 = this.consumeTo(string2);
        this.matchChomp(string2);
        return string3;
    }

    public String chompToIgnoreCase(String string2) {
        String string3 = this.consumeToIgnoreCase(string2);
        this.matchChomp(string2);
        return string3;
    }

    public char consume() {
        int n3;
        String string2 = this.queue;
        int n4 = this.pos;
        this.pos = n3 = n4 + 1;
        return string2.charAt(n4);
    }

    public void consume(String object) {
        int n3 = this.matches((String)object);
        if (n3 != 0) {
            int n4 = ((String)object).length();
            if (n4 <= (n3 = this.remainingLength())) {
                this.pos = n3 = this.pos + n4;
                return;
            }
            object = new IllegalStateException("Queue not long enough to consume sequence");
            throw object;
        }
        object = new IllegalStateException("Queue did not match expected sequence");
        throw object;
    }

    public String consumeCssIdentifier() {
        String[] stringArray = CssIdentifierChars;
        return this.consumeEscapedCssIdentifier(stringArray);
    }

    public String consumeElementSelector() {
        String[] stringArray = ElementSelectorChars;
        return this.consumeEscapedCssIdentifier(stringArray);
    }

    public String consumeTo(String string2) {
        int n3;
        String string3 = this.queue;
        int n4 = this.pos;
        int n7 = string3.indexOf(string2, n4);
        if (n7 != (n3 = -1)) {
            string3 = this.queue;
            n4 = this.pos;
            string2 = string3.substring(n4, n7);
            n3 = this.pos;
            this.pos = n4 = string2.length() + n3;
            return string2;
        }
        return this.remainder();
    }

    public String consumeToAny(String ... object) {
        int n3;
        int n4 = this.pos;
        while ((n3 = this.isEmpty()) == 0 && (n3 = this.matchesAny((String[])object)) == 0) {
            this.pos = n3 = this.pos + 1;
        }
        object = this.queue;
        n3 = this.pos;
        return ((String)object).substring(n4, n3);
    }

    public String consumeToIgnoreCase(String string2) {
        int n3;
        int n4 = this.pos;
        int n7 = 0;
        int n8 = 1;
        String string3 = string2.substring(0, n8);
        String string4 = string3.toLowerCase();
        String string5 = string3.toUpperCase();
        boolean bl2 = string4.equals(string5);
        while ((n3 = this.isEmpty()) == 0 && (n3 = this.matches(string2)) == 0) {
            if (bl2) {
                string5 = this.queue;
                int n10 = this.pos;
                n3 = string5.indexOf(string3, n10);
                n10 = this.pos;
                if ((n3 -= n10) == 0) {
                    this.pos = ++n10;
                    continue;
                }
                if (n3 < 0) {
                    string5 = this.queue;
                    this.pos = n3 = string5.length();
                    continue;
                }
                this.pos = n10 += n3;
                continue;
            }
            this.pos = n3 = this.pos + n8;
        }
        string2 = this.queue;
        n7 = this.pos;
        return string2.substring(n4, n7);
    }

    public boolean consumeWhitespace() {
        int n3;
        int n4 = 0;
        while ((n3 = this.matchesWhitespace()) != 0) {
            n4 = this.pos;
            n3 = 1;
            this.pos = n4 += n3;
            n4 = 1;
        }
        return n4 != 0;
    }

    public String consumeWord() {
        int n3;
        int n4 = this.pos;
        while ((n3 = this.matchesWord()) != 0) {
            this.pos = n3 = this.pos + 1;
        }
        String string2 = this.queue;
        int n7 = this.pos;
        return string2.substring(n4, n7);
    }

    public boolean isEmpty() {
        int n3 = this.remainingLength();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean matchChomp(String string2) {
        int n3 = this.matches(string2);
        if (n3 != 0) {
            int n4;
            n3 = this.pos;
            this.pos = n4 = string2.length() + n3;
            return true;
        }
        return false;
    }

    public boolean matches(String string2) {
        String string3 = this.queue;
        int n3 = this.pos;
        int n4 = string2.length();
        return string3.regionMatches(true, n3, string2, 0, n4);
    }

    public boolean matchesAny(char ... cArray) {
        int n3 = this.isEmpty();
        if (n3 != 0) {
            return false;
        }
        for (char c2 : cArray) {
            String string2 = this.queue;
            int n4 = this.pos;
            char c3 = string2.charAt(n4);
            if (c3 != c2) continue;
            return true;
        }
        return false;
    }

    public boolean matchesAny(String ... stringArray) {
        for (String string2 : stringArray) {
            boolean bl2 = this.matches(string2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public boolean matchesWhitespace() {
        int n3;
        String string2;
        boolean bl2 = this.isEmpty();
        if (!bl2 && (bl2 = StringUtil.isWhitespace((string2 = this.queue).charAt(n3 = this.pos)))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public boolean matchesWord() {
        int n3;
        String string2;
        boolean bl2 = this.isEmpty();
        if (!bl2 && (bl2 = Character.isLetterOrDigit((string2 = this.queue).charAt(n3 = this.pos)))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public String remainder() {
        String string2 = this.queue;
        int n3 = this.pos;
        string2 = string2.substring(n3);
        this.pos = n3 = this.queue.length();
        return string2;
    }

    public String toString() {
        String string2 = this.queue;
        int n3 = this.pos;
        return string2.substring(n3);
    }
}

