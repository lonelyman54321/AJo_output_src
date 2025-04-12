/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter$FilterResult;

public interface NodeFilter {
    public NodeFilter$FilterResult head(Node var1, int var2);

    public NodeFilter$FilterResult tail(Node var1, int var2);
}

