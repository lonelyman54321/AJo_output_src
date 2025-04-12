/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

final class GraphConstants$Presence
extends Enum {
    private static final /* synthetic */ GraphConstants$Presence[] $VALUES;
    public static final /* enum */ GraphConstants$Presence EDGE_EXISTS;

    private static /* synthetic */ GraphConstants$Presence[] $values() {
        GraphConstants$Presence graphConstants$Presence = EDGE_EXISTS;
        GraphConstants$Presence[] graphConstants$PresenceArray = new GraphConstants$Presence[]{graphConstants$Presence};
        return graphConstants$PresenceArray;
    }

    static {
        GraphConstants$Presence graphConstants$Presence;
        EDGE_EXISTS = graphConstants$Presence = new GraphConstants$Presence("EDGE_EXISTS", 0);
        $VALUES = GraphConstants$Presence.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private GraphConstants$Presence() {
        void var2_-1;
        void var1_-1;
    }

    public static GraphConstants$Presence valueOf(String string2) {
        return Enum.valueOf(GraphConstants$Presence.class, string2);
    }

    public static GraphConstants$Presence[] values() {
        return (GraphConstants$Presence[])$VALUES.clone();
    }
}

