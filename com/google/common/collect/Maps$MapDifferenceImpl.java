/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import java.util.Map;

class Maps$MapDifferenceImpl
implements MapDifference {
    final Map differences;
    final Map onBoth;
    final Map onlyOnLeft;
    final Map onlyOnRight;

    public Maps$MapDifferenceImpl(Map map2, Map map3, Map map4, Map map5) {
        this.onlyOnLeft = map2 = Maps.access$100(map2);
        this.onlyOnRight = map2 = Maps.access$100(map3);
        this.onBoth = map2 = Maps.access$100(map4);
        this.differences = map2 = Maps.access$100(map5);
    }

    public boolean areEqual() {
        Map map2 = this.onlyOnLeft;
        boolean bl2 = map2.isEmpty();
        if (bl2 && (bl2 = (map2 = this.onlyOnRight).isEmpty()) && (bl2 = (map2 = this.differences).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            map2 = null;
        }
        return bl2;
    }

    public Map entriesDiffering() {
        return this.differences;
    }

    public Map entriesInCommon() {
        return this.onBoth;
    }

    public Map entriesOnlyOnLeft() {
        return this.onlyOnLeft;
    }

    public Map entriesOnlyOnRight() {
        return this.onlyOnRight;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof MapDifference;
        if (bl3) {
            boolean bl4;
            Map map2;
            object = (MapDifference)object;
            Map map3 = this.entriesOnlyOnLeft();
            bl3 = map3.equals(map2 = object.entriesOnlyOnLeft());
            if (!(bl3 && (bl3 = (map3 = this.entriesOnlyOnRight()).equals(map2 = object.entriesOnlyOnRight())) && (bl3 = (map3 = this.entriesInCommon()).equals(map2 = object.entriesInCommon())) && (bl4 = (map3 = this.entriesDiffering()).equals(object = object.entriesDiffering())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        Map map2 = this.entriesOnlyOnLeft();
        Map map3 = this.entriesOnlyOnRight();
        Map map4 = this.entriesInCommon();
        Map map5 = this.entriesDiffering();
        Object[] objectArray = new Object[]{map2, map3, map4, map5};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        boolean bl2 = this.areEqual();
        if (bl2) {
            return "equal";
        }
        StringBuilder stringBuilder = new StringBuilder("not equal");
        Map map2 = this.onlyOnLeft;
        boolean bl3 = map2.isEmpty();
        if (!bl3) {
            stringBuilder.append(": only on left=");
            map2 = this.onlyOnLeft;
            stringBuilder.append(map2);
        }
        if (!(bl3 = (map2 = this.onlyOnRight).isEmpty())) {
            stringBuilder.append(": only on right=");
            map2 = this.onlyOnRight;
            stringBuilder.append(map2);
        }
        if (!(bl3 = (map2 = this.differences).isEmpty())) {
            stringBuilder.append(": value differences=");
            map2 = this.differences;
            stringBuilder.append(map2);
        }
        return stringBuilder.toString();
    }
}

