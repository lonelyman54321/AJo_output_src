/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Entities$CoreCharset;

class Entities$1 {
    static final /* synthetic */ int[] $SwitchMap$org$jsoup$nodes$Entities$CoreCharset;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Entities$CoreCharset entities$CoreCharset;
        int n7 = Entities$CoreCharset.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$org$jsoup$nodes$Entities$CoreCharset = nArray;
        try {
            entities$CoreCharset = Entities$CoreCharset.ascii;
            n4 = entities$CoreCharset.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$org$jsoup$nodes$Entities$CoreCharset;
            entities$CoreCharset = Entities$CoreCharset.utf;
            n4 = entities$CoreCharset.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

