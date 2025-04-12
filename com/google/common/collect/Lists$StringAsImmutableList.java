/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

final class Lists$StringAsImmutableList
extends ImmutableList {
    private final String string;

    public Lists$StringAsImmutableList(String string2) {
        this.string = string2;
    }

    public Character get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        return Character.valueOf(this.string.charAt(n3));
    }

    public int indexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Character;
        if (bl2) {
            String string2 = this.string;
            object = (Character)object;
            n3 = ((Character)object).charValue();
            n3 = string2.indexOf(n3);
        } else {
            n3 = -1;
        }
        return n3;
    }

    public boolean isPartialView() {
        return false;
    }

    public int lastIndexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Character;
        if (bl2) {
            String string2 = this.string;
            object = (Character)object;
            n3 = ((Character)object).charValue();
            n3 = string2.lastIndexOf(n3);
        } else {
            n3 = -1;
        }
        return n3;
    }

    public int size() {
        return this.string.length();
    }

    public ImmutableList subList(int n3, int n4) {
        int n7 = this.size();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        return Lists.charactersOf(this.string.substring(n3, n4));
    }
}

