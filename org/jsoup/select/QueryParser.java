/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.CombiningEvaluator$And;
import org.jsoup.select.CombiningEvaluator$Or;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Evaluator$AllElements;
import org.jsoup.select.Evaluator$Attribute;
import org.jsoup.select.Evaluator$AttributeStarting;
import org.jsoup.select.Evaluator$AttributeWithValue;
import org.jsoup.select.Evaluator$AttributeWithValueContaining;
import org.jsoup.select.Evaluator$AttributeWithValueEnding;
import org.jsoup.select.Evaluator$AttributeWithValueMatching;
import org.jsoup.select.Evaluator$AttributeWithValueNot;
import org.jsoup.select.Evaluator$AttributeWithValueStarting;
import org.jsoup.select.Evaluator$Class;
import org.jsoup.select.Evaluator$ContainsData;
import org.jsoup.select.Evaluator$ContainsOwnText;
import org.jsoup.select.Evaluator$ContainsText;
import org.jsoup.select.Evaluator$ContainsWholeOwnText;
import org.jsoup.select.Evaluator$ContainsWholeText;
import org.jsoup.select.Evaluator$CssNthEvaluator;
import org.jsoup.select.Evaluator$Id;
import org.jsoup.select.Evaluator$IndexEquals;
import org.jsoup.select.Evaluator$IndexGreaterThan;
import org.jsoup.select.Evaluator$IndexLessThan;
import org.jsoup.select.Evaluator$IsEmpty;
import org.jsoup.select.Evaluator$IsFirstChild;
import org.jsoup.select.Evaluator$IsFirstOfType;
import org.jsoup.select.Evaluator$IsLastChild;
import org.jsoup.select.Evaluator$IsLastOfType;
import org.jsoup.select.Evaluator$IsNthChild;
import org.jsoup.select.Evaluator$IsNthLastChild;
import org.jsoup.select.Evaluator$IsNthLastOfType;
import org.jsoup.select.Evaluator$IsNthOfType;
import org.jsoup.select.Evaluator$IsOnlyChild;
import org.jsoup.select.Evaluator$IsOnlyOfType;
import org.jsoup.select.Evaluator$IsRoot;
import org.jsoup.select.Evaluator$MatchText;
import org.jsoup.select.Evaluator$Matches;
import org.jsoup.select.Evaluator$MatchesOwn;
import org.jsoup.select.Evaluator$MatchesWholeOwnText;
import org.jsoup.select.Evaluator$MatchesWholeText;
import org.jsoup.select.Evaluator$Tag;
import org.jsoup.select.Evaluator$TagEndsWith;
import org.jsoup.select.Selector$SelectorParseException;
import org.jsoup.select.StructuralEvaluator$Has;
import org.jsoup.select.StructuralEvaluator$ImmediateParentRun;
import org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling;
import org.jsoup.select.StructuralEvaluator$Is;
import org.jsoup.select.StructuralEvaluator$Not;
import org.jsoup.select.StructuralEvaluator$Parent;
import org.jsoup.select.StructuralEvaluator$PreviousSibling;
import org.jsoup.select.StructuralEvaluator$Root;

public class QueryParser {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final String[] AttributeEvals;
    private static final char[] Combinators;
    private static final Pattern NTH_AB;
    private static final Pattern NTH_B;
    private final List evals;
    private final String query;
    private final TokenQueue tq;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[5];
        char[] cArray3 = cArray;
        cArray2[0] = 44;
        cArray3[1] = 62;
        cArray2[2] = 43;
        cArray3[3] = 126;
        cArray3[4] = 32;
        Combinators = cArray;
        AttributeEvals = new String[]{"=", "!=", "^=", "$=", "*=", "~="};
        NTH_AB = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
        NTH_B = Pattern.compile("([+-])?(\\d+)");
    }

    private QueryParser(String string2) {
        Object object = new ArrayList();
        this.evals = object;
        Validate.notEmpty(string2);
        this.query = string2 = string2.trim();
        this.tq = object = new TokenQueue(string2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Evaluator byAttribute() {
        void var7_9;
        int n3 = 1;
        Object object = this.tq;
        char c2 = ']';
        object = ((TokenQueue)object).chompBalanced('[', c2);
        Object object2 = new TokenQueue((String)object);
        object = AttributeEvals;
        object = ((TokenQueue)object2).consumeToAny((String[])object);
        Validate.notEmpty((String)object);
        ((TokenQueue)object2).consumeWhitespace();
        boolean bl2 = ((TokenQueue)object2).isEmpty();
        if (bl2) {
            object2 = "^";
            boolean bl3 = ((String)object).startsWith((String)object2);
            if (!bl3) return new Evaluator$Attribute((String)object);
            String string2 = ((String)object).substring(n3);
            return new Evaluator$AttributeStarting(string2);
        }
        String string3 = "=";
        bl2 = ((TokenQueue)object2).matchChomp(string3);
        if (bl2) {
            object2 = ((TokenQueue)object2).remainder();
            Evaluator$AttributeWithValue evaluator$AttributeWithValue = new Evaluator$AttributeWithValue((String)object, (String)object2);
            return var7_9;
        }
        string3 = "!=";
        bl2 = ((TokenQueue)object2).matchChomp(string3);
        if (bl2) {
            object2 = ((TokenQueue)object2).remainder();
            Evaluator$AttributeWithValueNot evaluator$AttributeWithValueNot = new Evaluator$AttributeWithValueNot((String)object, (String)object2);
            return var7_9;
        }
        string3 = "^=";
        bl2 = ((TokenQueue)object2).matchChomp(string3);
        if (bl2) {
            object2 = ((TokenQueue)object2).remainder();
            Evaluator$AttributeWithValueStarting evaluator$AttributeWithValueStarting = new Evaluator$AttributeWithValueStarting((String)object, (String)object2);
            return var7_9;
        }
        string3 = "$=";
        bl2 = ((TokenQueue)object2).matchChomp(string3);
        if (bl2) {
            object2 = ((TokenQueue)object2).remainder();
            Evaluator$AttributeWithValueEnding evaluator$AttributeWithValueEnding = new Evaluator$AttributeWithValueEnding((String)object, (String)object2);
            return var7_9;
        }
        string3 = "*=";
        bl2 = ((TokenQueue)object2).matchChomp(string3);
        if (bl2) {
            object2 = ((TokenQueue)object2).remainder();
            Evaluator$AttributeWithValueContaining evaluator$AttributeWithValueContaining = new Evaluator$AttributeWithValueContaining((String)object, (String)object2);
            return var7_9;
        }
        string3 = "~=";
        bl2 = ((TokenQueue)object2).matchChomp(string3);
        if (bl2) {
            object2 = Pattern.compile(((TokenQueue)object2).remainder());
            Evaluator$AttributeWithValueMatching evaluator$AttributeWithValueMatching = new Evaluator$AttributeWithValueMatching((String)object, (Pattern)object2);
            return var7_9;
        }
        string3 = this.query;
        object2 = ((TokenQueue)object2).remainder();
        Object[] objectArray = new Object[2];
        objectArray[0] = string3;
        objectArray[n3] = object2;
        object = new Selector$SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", objectArray);
        throw object;
    }

    private Evaluator byClass() {
        String string2 = this.tq.consumeCssIdentifier();
        Validate.notEmpty(string2);
        string2 = string2.trim();
        Evaluator$Class evaluator$Class = new Evaluator$Class(string2);
        return evaluator$Class;
    }

    private Evaluator byId() {
        String string2 = this.tq.consumeCssIdentifier();
        Validate.notEmpty(string2);
        Evaluator$Id evaluator$Id = new Evaluator$Id(string2);
        return evaluator$Id;
    }

    private Evaluator byTag() {
        Evaluator evaluator;
        int n3 = 2;
        String string2 = Normalizer.normalize(this.tq.consumeElementSelector());
        Validate.notEmpty(string2);
        String string3 = "*|";
        boolean bl2 = string2.startsWith(string3);
        String string4 = ":";
        if (bl2) {
            Object object = string2.substring(n3);
            Evaluator$Tag evaluator$Tag = new Evaluator$Tag((String)object);
            string2 = string2.replace(string3, string4);
            object = new Evaluator$TagEndsWith(string2);
            Evaluator[] evaluatorArray = new Evaluator[n3];
            string2 = null;
            evaluatorArray[0] = evaluator$Tag;
            int n4 = 1;
            evaluatorArray[n4] = object;
            evaluator = new CombiningEvaluator$Or(evaluatorArray);
        } else {
            String string5 = "|";
            boolean bl3 = string2.contains(string5);
            if (bl3) {
                string2 = string2.replace(string5, string4);
            }
            evaluator = new Evaluator$Tag(string2);
        }
        return evaluator;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void combinator(char n3) {
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        block12: {
            block13: {
                Object[] objectArray;
                int n4;
                block8: {
                    block9: {
                        block10: {
                            block11: {
                                int n7;
                                int n8;
                                block7: {
                                    block6: {
                                        block5: {
                                            n4 = 2;
                                            this.tq.consumeWhitespace();
                                            objectArray = QueryParser.parse(this.consumeSubQuery());
                                            object3 = this.evals;
                                            int n10 = object3.size();
                                            n8 = 44;
                                            n7 = 1;
                                            if (n10 != n7) break block5;
                                            object3 = (Evaluator)this.evals.get(0);
                                            boolean bl3 = object3 instanceof CombiningEvaluator$Or;
                                            if (!bl3 || n3 == n8) break block6;
                                            object2 = object3;
                                            object2 = ((CombiningEvaluator$Or)object3).rightMostEvaluator();
                                            bl2 = true;
                                            Object object4 = object2;
                                            object2 = object3;
                                            object3 = object4;
                                            break block7;
                                        }
                                        object2 = this.evals;
                                        object3 = new CombiningEvaluator$And((Collection)object2);
                                    }
                                    object2 = object3;
                                    bl2 = false;
                                }
                                List list = this.evals;
                                list.clear();
                                int n14 = 32;
                                if (n3 == n14) break block8;
                                n14 = 62;
                                if (n3 == n14) break block9;
                                n14 = 126;
                                if (n3 == n14) break block10;
                                n14 = 43;
                                if (n3 == n14) break block11;
                                if (n3 != n8) {
                                    Character c2 = Character.valueOf((char)n3);
                                    objectArray = new Object[n7];
                                    objectArray[0] = c2;
                                    Selector$SelectorParseException selector$SelectorParseException = new Selector$SelectorParseException("Unknown combinator '%s'", objectArray);
                                    throw selector$SelectorParseException;
                                }
                                n3 = object3 instanceof CombiningEvaluator$Or;
                                if (n3 != 0) {
                                    object3 = (CombiningEvaluator$Or)object3;
                                } else {
                                    object = new CombiningEvaluator$Or();
                                    ((CombiningEvaluator$Or)object).add((Evaluator)object3);
                                    object3 = object;
                                }
                                ((CombiningEvaluator$Or)object3).add((Evaluator)objectArray);
                                break block12;
                            }
                            StructuralEvaluator$ImmediatePreviousSibling structuralEvaluator$ImmediatePreviousSibling = new StructuralEvaluator$ImmediatePreviousSibling((Evaluator)object3);
                            Evaluator[] evaluatorArray = new Evaluator[n4];
                            evaluatorArray[0] = structuralEvaluator$ImmediatePreviousSibling;
                            evaluatorArray[n7] = objectArray;
                            object = new CombiningEvaluator$And(evaluatorArray);
                            break block13;
                        }
                        StructuralEvaluator$PreviousSibling structuralEvaluator$PreviousSibling = new StructuralEvaluator$PreviousSibling((Evaluator)object3);
                        Evaluator[] evaluatorArray = new Evaluator[n4];
                        evaluatorArray[0] = structuralEvaluator$PreviousSibling;
                        evaluatorArray[n7] = objectArray;
                        object = new CombiningEvaluator$And(evaluatorArray);
                        break block13;
                    }
                    n3 = object3 instanceof StructuralEvaluator$ImmediateParentRun;
                    object3 = n3 != 0 ? (StructuralEvaluator$ImmediateParentRun)object3 : (object = new StructuralEvaluator$ImmediateParentRun((Evaluator)object3));
                    ((StructuralEvaluator$ImmediateParentRun)object3).add((Evaluator)objectArray);
                    break block12;
                }
                StructuralEvaluator$Parent structuralEvaluator$Parent = new StructuralEvaluator$Parent((Evaluator)object3);
                Evaluator[] evaluatorArray = new Evaluator[n4];
                evaluatorArray[0] = structuralEvaluator$Parent;
                evaluatorArray[n7] = objectArray;
                object = new CombiningEvaluator$And(evaluatorArray);
            }
            object3 = object;
        }
        if (bl2) {
            object = object2;
            object = (CombiningEvaluator$Or)object2;
            ((CombiningEvaluator)object).replaceRightMostEvaluator((Evaluator)object3);
        } else {
            object2 = object3;
        }
        this.evals.add(object2);
    }

    private Evaluator consumeEvaluator() {
        Object object = this.tq;
        String string2 = "#";
        boolean bl2 = ((TokenQueue)object).matchChomp(string2);
        if (bl2) {
            return this.byId();
        }
        object = this.tq;
        string2 = ".";
        bl2 = ((TokenQueue)object).matchChomp(string2);
        if (bl2) {
            return this.byClass();
        }
        object = this.tq;
        bl2 = ((TokenQueue)object).matchesWord();
        if (!bl2 && !(bl2 = ((TokenQueue)(object = this.tq)).matches(string2 = "*|"))) {
            object = this.tq;
            string2 = "[";
            bl2 = ((TokenQueue)object).matches(string2);
            if (bl2) {
                return this.byAttribute();
            }
            object = this.tq;
            string2 = "*";
            bl2 = ((TokenQueue)object).matchChomp(string2);
            if (bl2) {
                object = new Evaluator$AllElements();
                return object;
            }
            object = this.tq;
            string2 = ":";
            bl2 = ((TokenQueue)object).matchChomp(string2);
            if (bl2) {
                return this.parsePseudoSelector();
            }
            string2 = this.query;
            String string3 = this.tq.remainder();
            Object[] objectArray = new Object[]{string2, string3};
            object = new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", objectArray);
            throw object;
        }
        return this.byTag();
    }

    private int consumeIndex() {
        String string2 = this.consumeParens().trim();
        Validate.isTrue(StringUtil.isNumeric(string2), "Index must be numeric");
        return Integer.parseInt(string2);
    }

    private String consumeParens() {
        return this.tq.chompBalanced('(', ')');
    }

    private String consumeSubQuery() {
        Object object;
        char c2;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        char c3 = '\u0000';
        TokenQueue tokenQueue = null;
        while ((c2 = ((TokenQueue)(object = this.tq)).isEmpty()) == '\u0000') {
            char c5;
            char c6;
            object = this.tq;
            Object object2 = "(";
            c2 = ((TokenQueue)object).matches((String)object2);
            if (c2 != '\u0000') {
                stringBuilder.append((String)object2);
                object = this.tq;
                c6 = '(';
                c5 = ')';
                object = ((TokenQueue)object).chompBalanced(c6, c5);
                stringBuilder.append((String)object);
                object = ")";
                stringBuilder.append((String)object);
                continue;
            }
            object = this.tq;
            object2 = "[";
            c2 = ((TokenQueue)object).matches((String)object2);
            if (c2 != '\u0000') {
                stringBuilder.append((String)object2);
                object = this.tq;
                c6 = '[';
                c5 = ']';
                object = ((TokenQueue)object).chompBalanced(c6, c5);
                stringBuilder.append((String)object);
                object = "]";
                stringBuilder.append((String)object);
                continue;
            }
            object = this.tq;
            object2 = Combinators;
            c2 = ((TokenQueue)object).matchesAny((char[])object2);
            if (c2 != '\u0000') {
                if (c3 != '\u0000') break;
                object = this.tq;
                c2 = ((TokenQueue)object).consume();
                stringBuilder.append(c2);
                continue;
            }
            tokenQueue = this.tq;
            c3 = tokenQueue.consume();
            stringBuilder.append(c3);
            c3 = '\u0001';
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    private Evaluator contains(boolean bl2) {
        String string2 = bl2 ? ":containsOwn" : ":contains";
        String string3 = TokenQueue.unescape(this.consumeParens());
        String string4 = "(text) query must not be empty";
        string2 = string2.concat(string4);
        Validate.notEmpty(string3, string2);
        Evaluator evaluator = bl2 ? new Evaluator$ContainsOwnText(string3) : new Evaluator$ContainsText(string3);
        return evaluator;
    }

    private Evaluator containsData() {
        String string2 = TokenQueue.unescape(this.consumeParens());
        Validate.notEmpty(string2, ":containsData(text) query must not be empty");
        Evaluator$ContainsData evaluator$ContainsData = new Evaluator$ContainsData(string2);
        return evaluator$ContainsData;
    }

    private Evaluator containsWholeText(boolean bl2) {
        String string2 = bl2 ? ":containsWholeOwnText" : ":containsWholeText";
        String string3 = TokenQueue.unescape(this.consumeParens());
        String string4 = "(text) query must not be empty";
        string2 = string2.concat(string4);
        Validate.notEmpty(string3, string2);
        Evaluator evaluator = bl2 ? new Evaluator$ContainsWholeOwnText(string3) : new Evaluator$ContainsWholeText(string3);
        return evaluator;
    }

    private Evaluator cssNthChild(boolean bl2, boolean bl3) {
        int n3;
        Object[] objectArray;
        String string2;
        block9: {
            int n4;
            int n7;
            block6: {
                String string3;
                String string4;
                Object object;
                block8: {
                    boolean bl4;
                    String string5;
                    block7: {
                        String string6;
                        block5: {
                            n7 = 0;
                            string5 = null;
                            string2 = Normalizer.normalize(this.consumeParens());
                            objectArray = NTH_AB.matcher(string2);
                            object = NTH_B.matcher(string2);
                            string6 = "odd";
                            bl4 = string6.equals(string2);
                            n3 = 1;
                            if (!bl4) break block5;
                            n7 = 2;
                            n4 = 1;
                            break block6;
                        }
                        string6 = "even";
                        bl4 = string6.equals(string2);
                        if (!bl4) break block7;
                        n7 = 2;
                        n4 = 0;
                        string2 = null;
                        break block6;
                    }
                    bl4 = objectArray.matches();
                    string4 = "";
                    string3 = "^\\+";
                    if (!bl4) break block8;
                    n4 = 3;
                    string2 = objectArray.group(n4);
                    if (string2 != null) {
                        string2 = objectArray.group(n3).replaceFirst(string3, string4);
                        n3 = Integer.parseInt(string2);
                    }
                    if ((object = objectArray.group(n4 = 4)) != null) {
                        string5 = objectArray.group(n4).replaceFirst(string3, string4);
                        n7 = Integer.parseInt(string5);
                    }
                    n4 = n7;
                    n7 = n3;
                    break block6;
                }
                boolean bl5 = ((Matcher)object).matches();
                if (!bl5) break block9;
                string2 = ((Matcher)object).group().replaceFirst(string3, string4);
                n4 = Integer.parseInt(string2);
            }
            Evaluator$CssNthEvaluator evaluator$CssNthEvaluator = bl3 ? (bl2 ? new Evaluator$IsNthLastOfType(n7, n4) : new Evaluator$IsNthOfType(n7, n4)) : (bl2 ? new Evaluator$IsNthLastChild(n7, n4) : new Evaluator$IsNthChild(n7, n4));
            return evaluator$CssNthEvaluator;
        }
        objectArray = new Object[n3];
        objectArray[0] = string2;
        Selector$SelectorParseException selector$SelectorParseException = new Selector$SelectorParseException("Could not parse nth-index '%s': unexpected format", objectArray);
        throw selector$SelectorParseException;
    }

    private Evaluator has() {
        Object object = this.consumeParens();
        Validate.notEmpty((String)object, ":has(selector) sub-select must not be empty");
        object = QueryParser.parse((String)object);
        StructuralEvaluator$Has structuralEvaluator$Has = new StructuralEvaluator$Has((Evaluator)object);
        return structuralEvaluator$Has;
    }

    private Evaluator is() {
        Object object = this.consumeParens();
        Validate.notEmpty((String)object, ":is(selector) sub-select must not be empty");
        object = QueryParser.parse((String)object);
        StructuralEvaluator$Is structuralEvaluator$Is = new StructuralEvaluator$Is((Evaluator)object);
        return structuralEvaluator$Is;
    }

    private Evaluator matches(boolean bl2) {
        Evaluator evaluator;
        Object object = bl2 ? ":matchesOwn" : ":matches";
        String string2 = this.consumeParens();
        String string3 = "(regex) query must not be empty";
        object = ((String)object).concat(string3);
        Validate.notEmpty(string2, (String)object);
        if (bl2) {
            object = Pattern.compile(string2);
            evaluator = new Evaluator$MatchesOwn((Pattern)object);
        } else {
            object = Pattern.compile(string2);
            evaluator = new Evaluator$Matches((Pattern)object);
        }
        return evaluator;
    }

    private Evaluator matchesWholeText(boolean bl2) {
        Evaluator evaluator;
        Object object = bl2 ? ":matchesWholeOwnText" : ":matchesWholeText";
        String string2 = this.consumeParens();
        String string3 = "(regex) query must not be empty";
        object = ((String)object).concat(string3);
        Validate.notEmpty(string2, (String)object);
        if (bl2) {
            object = Pattern.compile(string2);
            evaluator = new Evaluator$MatchesWholeOwnText((Pattern)object);
        } else {
            object = Pattern.compile(string2);
            evaluator = new Evaluator$MatchesWholeText((Pattern)object);
        }
        return evaluator;
    }

    private Evaluator not() {
        Object object = this.consumeParens();
        Validate.notEmpty((String)object, ":not(selector) subselect must not be empty");
        object = QueryParser.parse((String)object);
        StructuralEvaluator$Not structuralEvaluator$Not = new StructuralEvaluator$Not((Evaluator)object);
        return structuralEvaluator$Not;
    }

    public static Evaluator parse(String string2) {
        Object object;
        try {
            object = new QueryParser(string2);
            return ((QueryParser)object).parse();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            String string3 = illegalArgumentException.getMessage();
            object = new Selector$SelectorParseException(string3);
            throw object;
        }
    }

    private Evaluator parsePseudoSelector() {
        String string2;
        String string3;
        int n4 = 2;
        Object object = this.tq.consumeCssIdentifier();
        object.getClass();
        int n7 = 1;
        int n8 = -1;
        int n10 = ((String)object).hashCode();
        switch (n10) {
            default: {
                break;
            }
            case 2025926969: {
                string3 = "last-of-type";
                boolean n3 = ((String)object).equals(string3);
                if (!n3) break;
                n8 = 27;
                break;
            }
            case 2014184485: {
                string3 = "containsWholeText";
                boolean bl2 = ((String)object).equals(string3);
                if (!bl2) break;
                n8 = 26;
                break;
            }
            case 1870740819: {
                string3 = "matchesOwn";
                boolean bl3 = ((String)object).equals(string3);
                if (!bl3) break;
                n8 = 25;
                break;
            }
            case 1455900751: {
                string3 = "only-of-type";
                boolean bl4 = ((String)object).equals(string3);
                if (!bl4) break;
                n8 = 24;
                break;
            }
            case 1292941139: {
                string3 = "first-of-type";
                boolean bl5 = ((String)object).equals(string3);
                if (!bl5) break;
                n8 = 23;
                break;
            }
            case 1255901423: {
                string3 = "matchesWholeOwnText";
                boolean bl6 = ((String)object).equals(string3);
                if (!bl6) break;
                n8 = 22;
                break;
            }
            case 840862003: {
                string3 = "matches";
                boolean bl7 = ((String)object).equals(string3);
                if (!bl7) break;
                n8 = 21;
                break;
            }
            case 835834661: {
                string3 = "last-child";
                boolean bl8 = ((String)object).equals(string3);
                if (!bl8) break;
                n8 = 20;
                break;
            }
            case 614017170: {
                string3 = "matchText";
                boolean bl9 = ((String)object).equals(string3);
                if (!bl9) break;
                n8 = 19;
                break;
            }
            case 208017639: {
                string3 = "containsOwn";
                boolean bl10 = ((String)object).equals(string3);
                if (!bl10) break;
                n8 = 18;
                break;
            }
            case 96634189: {
                string3 = "empty";
                boolean bl11 = ((String)object).equals(string3);
                if (!bl11) break;
                n8 = 17;
                break;
            }
            case 3506402: {
                string3 = "root";
                boolean bl12 = ((String)object).equals(string3);
                if (!bl12) break;
                n8 = 16;
                break;
            }
            case 109267: {
                string3 = "not";
                boolean bl13 = ((String)object).equals(string3);
                if (!bl13) break;
                n8 = 15;
                break;
            }
            case 103066: {
                string3 = "has";
                boolean bl14 = ((String)object).equals(string3);
                if (!bl14) break;
                n8 = 14;
                break;
            }
            case 3464: {
                string3 = "lt";
                boolean bl15 = ((String)object).equals(string3);
                if (!bl15) break;
                n8 = 13;
                break;
            }
            case 3370: {
                string3 = "is";
                boolean bl16 = ((String)object).equals(string3);
                if (!bl16) break;
                n8 = 12;
                break;
            }
            case 3309: {
                string3 = "gt";
                boolean bl17 = ((String)object).equals(string3);
                if (!bl17) break;
                n8 = 11;
                break;
            }
            case 3244: {
                string3 = "eq";
                boolean bl18 = ((String)object).equals(string3);
                if (!bl18) break;
                n8 = 10;
                break;
            }
            case -55413797: {
                string3 = "containsWholeOwnText";
                boolean bl19 = ((String)object).equals(string3);
                if (!bl19) break;
                n8 = 9;
                break;
            }
            case -567445985: {
                string3 = "contains";
                boolean bl20 = ((String)object).equals(string3);
                if (!bl20) break;
                n8 = 8;
                break;
            }
            case -872629820: {
                string3 = "nth-last-of-type";
                boolean bl21 = ((String)object).equals(string3);
                if (!bl21) break;
                n8 = 7;
                break;
            }
            case -897532411: {
                string3 = "nth-of-type";
                boolean bl22 = ((String)object).equals(string3);
                if (!bl22) break;
                n8 = 6;
                break;
            }
            case -947996741: {
                string3 = "only-child";
                boolean bl23 = ((String)object).equals(string3);
                if (!bl23) break;
                n8 = 5;
                break;
            }
            case -1629748624: {
                string3 = "nth-last-child";
                boolean bl24 = ((String)object).equals(string3);
                if (!bl24) break;
                n8 = 4;
                break;
            }
            case -1754914063: {
                string3 = "nth-child";
                boolean bl25 = ((String)object).equals(string3);
                if (!bl25) break;
                n8 = 3;
                break;
            }
            case -1939921007: {
                string3 = "matchesWholeText";
                boolean bl26 = ((String)object).equals(string3);
                if (!bl26) break;
                n8 = 2;
                break;
            }
            case -2136991809: {
                string3 = "first-child";
                boolean bl27 = ((String)object).equals(string3);
                if (!bl27) break;
                n8 = 1;
                break;
            }
            case -2141736343: {
                string3 = "containsData";
                boolean bl28 = ((String)object).equals(string3);
                if (!bl28) break;
                n8 = 0;
                string2 = null;
            }
        }
        switch (n8) {
            default: {
                string2 = this.query;
                string3 = this.tq.remainder();
                Object[] objectArray = new Object[n4];
                objectArray[0] = string2;
                objectArray[n7] = string3;
                object = new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", objectArray);
                throw object;
            }
            case 27: {
                Evaluator$IsLastOfType evaluator$IsLastOfType = new Evaluator$IsLastOfType();
                return evaluator$IsLastOfType;
            }
            case 26: {
                return this.containsWholeText(false);
            }
            case 25: {
                return this.matches(n7 != 0);
            }
            case 24: {
                Evaluator$IsOnlyOfType evaluator$IsOnlyOfType = new Evaluator$IsOnlyOfType();
                return evaluator$IsOnlyOfType;
            }
            case 23: {
                Evaluator$IsFirstOfType evaluator$IsFirstOfType = new Evaluator$IsFirstOfType();
                return evaluator$IsFirstOfType;
            }
            case 22: {
                return this.matchesWholeText(n7 != 0);
            }
            case 21: {
                return this.matches(false);
            }
            case 20: {
                Evaluator$IsLastChild evaluator$IsLastChild = new Evaluator$IsLastChild();
                return evaluator$IsLastChild;
            }
            case 19: {
                Evaluator$MatchText evaluator$MatchText = new Evaluator$MatchText();
                return evaluator$MatchText;
            }
            case 18: {
                return this.contains(n7 != 0);
            }
            case 17: {
                Evaluator$IsEmpty evaluator$IsEmpty = new Evaluator$IsEmpty();
                return evaluator$IsEmpty;
            }
            case 16: {
                Evaluator$IsRoot evaluator$IsRoot = new Evaluator$IsRoot();
                return evaluator$IsRoot;
            }
            case 15: {
                return this.not();
            }
            case 14: {
                return this.has();
            }
            case 13: {
                int n3 = this.consumeIndex();
                Evaluator$IndexLessThan evaluator$IndexLessThan = new Evaluator$IndexLessThan(n3);
                return evaluator$IndexLessThan;
            }
            case 12: {
                return this.is();
            }
            case 11: {
                int n14 = this.consumeIndex();
                Evaluator$IndexGreaterThan evaluator$IndexGreaterThan = new Evaluator$IndexGreaterThan(n14);
                return evaluator$IndexGreaterThan;
            }
            case 10: {
                int n15 = this.consumeIndex();
                Evaluator$IndexEquals evaluator$IndexEquals = new Evaluator$IndexEquals(n15);
                return evaluator$IndexEquals;
            }
            case 9: {
                return this.containsWholeText(n7 != 0);
            }
            case 8: {
                return this.contains(false);
            }
            case 7: {
                return this.cssNthChild(n7 != 0, n7 != 0);
            }
            case 6: {
                return this.cssNthChild(false, n7 != 0);
            }
            case 5: {
                Evaluator$IsOnlyChild evaluator$IsOnlyChild = new Evaluator$IsOnlyChild();
                return evaluator$IsOnlyChild;
            }
            case 4: {
                return this.cssNthChild(n7 != 0, false);
            }
            case 3: {
                return this.cssNthChild(false, false);
            }
            case 2: {
                return this.matchesWholeText(false);
            }
            case 1: {
                Evaluator$IsFirstChild evaluator$IsFirstChild = new Evaluator$IsFirstChild();
                return evaluator$IsFirstChild;
            }
            case 0: 
        }
        return this.containsData();
    }

    public Evaluator parse() {
        int n3;
        char c2;
        this.tq.consumeWhitespace();
        Object object = this.tq;
        Object object2 = Combinators;
        boolean n4 = ((TokenQueue)object).matchesAny((char[])object2);
        if (n4) {
            object = this.evals;
            object2 = new StructuralEvaluator$Root;
            ((StructuralEvaluator$Root)object2)();
            object.add(object2);
            object = this.tq;
            char c3 = ((TokenQueue)object).consume();
            this.combinator(c3);
        } else {
            object = this.evals;
            object2 = this.consumeEvaluator();
            object.add(object2);
        }
        while ((c2 = ((TokenQueue)(object = this.tq)).isEmpty()) == '\u0000') {
            object = this.tq;
            c2 = ((TokenQueue)object).consumeWhitespace();
            object2 = this.tq;
            char[] cArray = Combinators;
            n3 = (int)(((TokenQueue)object2).matchesAny(cArray) ? 1 : 0);
            if (n3 != 0) {
                object = this.tq;
                c2 = ((TokenQueue)object).consume();
                this.combinator(c2);
                continue;
            }
            if (c2 != '\u0000') {
                c2 = ' ';
                this.combinator(c2);
                continue;
            }
            object = this.evals;
            object2 = this.consumeEvaluator();
            object.add(object2);
        }
        object = this.evals;
        int n7 = object.size();
        if (n7 == (n3 = 1)) {
            return (Evaluator)this.evals.get(0);
        }
        object2 = this.evals;
        object = new CombiningEvaluator$And((Collection)object2);
        return object;
    }

    public String toString() {
        return this.query;
    }
}

