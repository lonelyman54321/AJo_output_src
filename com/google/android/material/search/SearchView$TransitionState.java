/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.search;

public final class SearchView$TransitionState
extends Enum {
    private static final /* synthetic */ SearchView$TransitionState[] $VALUES;
    public static final /* enum */ SearchView$TransitionState HIDDEN;
    public static final /* enum */ SearchView$TransitionState HIDING;
    public static final /* enum */ SearchView$TransitionState SHOWING;
    public static final /* enum */ SearchView$TransitionState SHOWN;

    static {
        SearchView$TransitionState searchView$TransitionState;
        SearchView$TransitionState searchView$TransitionState2;
        SearchView$TransitionState searchView$TransitionState3;
        SearchView$TransitionState searchView$TransitionState4;
        HIDING = searchView$TransitionState4 = new SearchView$TransitionState("HIDING", 0);
        int n3 = 1;
        HIDDEN = searchView$TransitionState3 = new SearchView$TransitionState("HIDDEN", n3);
        int n4 = 2;
        SHOWING = searchView$TransitionState2 = new SearchView$TransitionState("SHOWING", n4);
        int n7 = 3;
        SHOWN = searchView$TransitionState = new SearchView$TransitionState("SHOWN", n7);
        SearchView$TransitionState[] searchView$TransitionStateArray = new SearchView$TransitionState[4];
        searchView$TransitionStateArray[0] = searchView$TransitionState4;
        searchView$TransitionStateArray[n3] = searchView$TransitionState3;
        searchView$TransitionStateArray[n4] = searchView$TransitionState2;
        searchView$TransitionStateArray[n7] = searchView$TransitionState;
        $VALUES = searchView$TransitionStateArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SearchView$TransitionState() {
        void var2_-1;
        void var1_-1;
    }

    public static SearchView$TransitionState valueOf(String string2) {
        return Enum.valueOf(SearchView$TransitionState.class, string2);
    }

    public static SearchView$TransitionState[] values() {
        return (SearchView$TransitionState[])$VALUES.clone();
    }
}

