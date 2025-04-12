/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$TokenType;

final class HtmlTreeBuilderState$10
extends HtmlTreeBuilderState {
    public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        Object object = token.type;
        Object object2 = Token$TokenType.Character;
        boolean bl2 = true;
        if (object == object2) {
            object = ((Token$Character)(token = token.asCharacter())).getData();
            boolean bl3 = ((String)object).equals(object2 = HtmlTreeBuilderState.access$400());
            if (bl3) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.addPendingTableCharacters((Token$Character)token);
            return bl2;
        }
        object = htmlTreeBuilder.getPendingTableCharacters();
        int n3 = object.size();
        if (n3 > 0) {
            boolean bl4;
            object = htmlTreeBuilder.currentToken;
            object2 = htmlTreeBuilder.getPendingTableCharacters().iterator();
            while (bl4 = object2.hasNext()) {
                Token$Character token$Character = (Token$Character)object2.next();
                htmlTreeBuilder.currentToken = token$Character;
                boolean bl5 = HtmlTreeBuilderState.access$100(token$Character);
                if (!bl5) {
                    htmlTreeBuilder.error(this);
                    Object object3 = htmlTreeBuilder.currentElement().normalName();
                    String[] stringArray = HtmlTreeBuilderState$Constants.InTableFoster;
                    bl5 = StringUtil.inSorted(object3, stringArray);
                    if (bl5) {
                        htmlTreeBuilder.setFosterInserts(bl2);
                        object3 = HtmlTreeBuilderState.InBody;
                        htmlTreeBuilder.process(token$Character, (HtmlTreeBuilderState)((Object)object3));
                        htmlTreeBuilder.setFosterInserts(false);
                        continue;
                    }
                    object3 = HtmlTreeBuilderState.InBody;
                    htmlTreeBuilder.process(token$Character, (HtmlTreeBuilderState)((Object)object3));
                    continue;
                }
                htmlTreeBuilder.insertCharacterNode(token$Character);
            }
            htmlTreeBuilder.currentToken = object;
            htmlTreeBuilder.resetPendingTableCharacters();
        }
        object = htmlTreeBuilder.originalState();
        htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
        return htmlTreeBuilder.process(token);
    }
}

