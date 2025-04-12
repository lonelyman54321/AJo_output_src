/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

public final class NodeFilter$FilterResult
extends Enum {
    private static final /* synthetic */ NodeFilter$FilterResult[] $VALUES;
    public static final /* enum */ NodeFilter$FilterResult CONTINUE;
    public static final /* enum */ NodeFilter$FilterResult REMOVE;
    public static final /* enum */ NodeFilter$FilterResult SKIP_CHILDREN;
    public static final /* enum */ NodeFilter$FilterResult SKIP_ENTIRELY;
    public static final /* enum */ NodeFilter$FilterResult STOP;

    private static /* synthetic */ NodeFilter$FilterResult[] $values() {
        NodeFilter$FilterResult nodeFilter$FilterResult = CONTINUE;
        nodeFilter$FilterResult = SKIP_CHILDREN;
        nodeFilter$FilterResult = SKIP_ENTIRELY;
        nodeFilter$FilterResult = REMOVE;
        nodeFilter$FilterResult = STOP;
        NodeFilter$FilterResult[] nodeFilter$FilterResultArray = new NodeFilter$FilterResult[]{nodeFilter$FilterResult, nodeFilter$FilterResult, nodeFilter$FilterResult, nodeFilter$FilterResult, nodeFilter$FilterResult};
        return nodeFilter$FilterResultArray;
    }

    static {
        NodeFilter$FilterResult nodeFilter$FilterResult;
        CONTINUE = nodeFilter$FilterResult = new NodeFilter$FilterResult("CONTINUE", 0);
        SKIP_CHILDREN = nodeFilter$FilterResult = new NodeFilter$FilterResult("SKIP_CHILDREN", 1);
        SKIP_ENTIRELY = nodeFilter$FilterResult = new NodeFilter$FilterResult("SKIP_ENTIRELY", 2);
        REMOVE = nodeFilter$FilterResult = new NodeFilter$FilterResult("REMOVE", 3);
        STOP = nodeFilter$FilterResult = new NodeFilter$FilterResult("STOP", 4);
        $VALUES = NodeFilter$FilterResult.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NodeFilter$FilterResult() {
        void var2_-1;
        void var1_-1;
    }

    public static NodeFilter$FilterResult valueOf(String string2) {
        return Enum.valueOf(NodeFilter$FilterResult.class, string2);
    }

    public static NodeFilter$FilterResult[] values() {
        return (NodeFilter$FilterResult[])$VALUES.clone();
    }
}

