/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$QuirksMode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$Doctype;

final class HtmlTreeBuilderState$1
extends HtmlTreeBuilderState {
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        block7: {
            boolean bl2;
            block6: {
                boolean bl3;
                block5: {
                    bl3 = HtmlTreeBuilderState.access$100((Token)object);
                    bl2 = true;
                    if (bl3) {
                        return bl2;
                    }
                    bl3 = ((Token)object).isComment();
                    if (!bl3) break block5;
                    object = ((Token)object).asComment();
                    htmlTreeBuilder.insertCommentNode((Token$Comment)object);
                    break block6;
                }
                bl3 = ((Token)object).isDoctype();
                if (!bl3) break block7;
                object = ((Token)object).asDoctype();
                Object object2 = htmlTreeBuilder.settings;
                String string2 = ((Token$Doctype)object).getName();
                object2 = ((ParseSettings)object2).normalizeTag(string2);
                string2 = ((Token$Doctype)object).getPublicIdentifier();
                String string3 = ((Token$Doctype)object).getSystemIdentifier();
                Object object3 = new DocumentType((String)object2, string2, string3);
                object2 = ((Token$Doctype)object).getPubSysKey();
                object3.setPubSysKey((String)object2);
                object2 = htmlTreeBuilder.getDocument();
                ((Element)object2).appendChild((Node)object3);
                htmlTreeBuilder.onNodeInserted((Node)object3);
                boolean bl4 = ((Token$Doctype)object).isForceQuirks();
                if (bl4) {
                    object = htmlTreeBuilder.getDocument();
                    object3 = Document$QuirksMode.quirks;
                    ((Document)object).quirksMode((Document$QuirksMode)((Object)object3));
                }
                object = HtmlTreeBuilderState.BeforeHtml;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
            }
            return bl2;
        }
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.BeforeHtml;
        htmlTreeBuilder.transition(htmlTreeBuilderState);
        return htmlTreeBuilder.process((Token)object);
    }
}

