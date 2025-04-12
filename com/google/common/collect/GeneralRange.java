/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.NullnessCasts;
import com.google.common.collect.Ordering;
import com.google.common.collect.Range;
import java.io.Serializable;
import java.util.Comparator;

final class GeneralRange
implements Serializable {
    private final Comparator comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final Object lowerEndpoint;
    private transient GeneralRange reverse;
    private final BoundType upperBoundType;
    private final Object upperEndpoint;

    private GeneralRange(Comparator object, boolean bl2, Object object2, BoundType boundType, boolean bl3, Object object3, BoundType boundType2) {
        Object object4;
        Object object5;
        this.comparator = object5 = (Comparator)Preconditions.checkNotNull(object);
        this.hasLowerBound = bl2;
        this.hasUpperBound = bl3;
        this.lowerEndpoint = object2;
        object5 = (BoundType)((Object)Preconditions.checkNotNull((Object)boundType));
        this.lowerBoundType = object5;
        this.upperEndpoint = object3;
        object5 = (BoundType)((Object)Preconditions.checkNotNull((Object)boundType2));
        this.upperBoundType = object5;
        if (bl2) {
            object5 = NullnessCasts.uncheckedCastNullableTToT(object2);
            object4 = NullnessCasts.uncheckedCastNullableTToT(object2);
            object.compare(object5, object4);
        }
        if (bl3) {
            object5 = NullnessCasts.uncheckedCastNullableTToT(object3);
            object4 = NullnessCasts.uncheckedCastNullableTToT(object3);
            object.compare(object5, object4);
        }
        if (bl2 && bl3) {
            boolean bl4;
            Object object6 = NullnessCasts.uncheckedCastNullableTToT(object2);
            Object object7 = NullnessCasts.uncheckedCastNullableTToT(object3);
            int n3 = object.compare(object6, object7);
            bl2 = false;
            object6 = null;
            bl3 = true;
            if (n3 <= 0) {
                bl4 = true;
            } else {
                bl4 = false;
                object5 = null;
            }
            object4 = "lowerEndpoint (%s) > upperEndpoint (%s)";
            Preconditions.checkArgument(bl4, (String)object4, object2, object3);
            if (n3 == 0) {
                object = BoundType.OPEN;
                if (boundType != object || boundType2 != object) {
                    bl2 = true;
                }
                Preconditions.checkArgument(bl2);
            }
        }
    }

    public static GeneralRange all(Comparator comparator) {
        BoundType boundType = BoundType.OPEN;
        GeneralRange generalRange = new GeneralRange(comparator, false, null, boundType, false, null, boundType);
        return generalRange;
    }

    public static GeneralRange downTo(Comparator comparator, Object object, BoundType boundType) {
        BoundType boundType2 = BoundType.OPEN;
        GeneralRange generalRange = new GeneralRange(comparator, true, object, boundType, false, null, boundType2);
        return generalRange;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static GeneralRange from(Range range) {
        void var4_6;
        Object object;
        boolean bl2 = range.hasLowerBound();
        Comparable comparable = null;
        if (bl2) {
            Comparable comparable2 = object = range.lowerEndpoint();
        } else {
            Object var4_5 = null;
        }
        bl2 = range.hasLowerBound();
        object = bl2 ? range.lowerBoundType() : BoundType.OPEN;
        Object object2 = object;
        bl2 = range.hasUpperBound();
        if (bl2) {
            comparable = range.upperEndpoint();
        }
        Comparable comparable3 = comparable;
        bl2 = range.hasUpperBound();
        object = bl2 ? range.upperBoundType() : BoundType.OPEN;
        Object object3 = object;
        Ordering ordering = Ordering.natural();
        boolean bl3 = range.hasLowerBound();
        boolean bl4 = range.hasUpperBound();
        return new GeneralRange(ordering, bl3, var4_6, (BoundType)((Object)object2), bl4, comparable3, (BoundType)((Object)object3));
    }

    public static GeneralRange range(Comparator comparator, Object object, BoundType boundType, Object object2, BoundType boundType2) {
        GeneralRange generalRange = new GeneralRange(comparator, true, object, boundType, true, object2, boundType2);
        return generalRange;
    }

    public static GeneralRange upTo(Comparator comparator, Object object, BoundType boundType) {
        BoundType boundType2 = BoundType.OPEN;
        GeneralRange generalRange = new GeneralRange(comparator, false, null, boundType2, true, object, boundType);
        return generalRange;
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public boolean contains(Object object) {
        boolean bl2;
        boolean bl3 = this.tooLow(object);
        if (!bl3 && !(bl2 = this.tooHigh(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof GeneralRange;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            boolean bl5;
            object = (GeneralRange)object;
            Object object2 = this.comparator;
            Object object3 = ((GeneralRange)object).comparator;
            bl2 = object2.equals(object3);
            if (bl2 && (bl2 = this.hasLowerBound) == (bl5 = ((GeneralRange)object).hasLowerBound) && (bl2 = this.hasUpperBound) == (bl5 = ((GeneralRange)object).hasUpperBound) && (bl2 = (object2 = this.getLowerBoundType()).equals(object3 = ((GeneralRange)object).getLowerBoundType())) && (bl2 = (object2 = this.getUpperBoundType()).equals(object3 = ((GeneralRange)object).getUpperBoundType())) && (bl2 = Objects.equal(object2 = this.getLowerEndpoint(), object3 = ((GeneralRange)object).getLowerEndpoint())) && (bl4 = Objects.equal(object2 = this.getUpperEndpoint(), object = ((GeneralRange)object).getUpperEndpoint()))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    public Object getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    public Object getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        Comparator comparator = this.comparator;
        Object object = this.getLowerEndpoint();
        BoundType boundType = this.getLowerBoundType();
        Object object2 = this.getUpperEndpoint();
        BoundType boundType2 = this.getUpperBoundType();
        Object[] objectArray = new Object[]{comparator, object, boundType, object2, boundType2};
        return Objects.hashCode(objectArray);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public GeneralRange intersect(GeneralRange object) {
        void var18_45;
        void var15_38;
        void var14_32;
        GeneralRange generalRange;
        void var9_21;
        BoundType boundType;
        Comparator comparator;
        int n3;
        Object object2;
        Preconditions.checkNotNull(object);
        Comparator comparator2 = this.comparator;
        Object object3 = ((GeneralRange)object).comparator;
        Preconditions.checkArgument(comparator2.equals(object3));
        boolean bl2 = this.hasLowerBound;
        object3 = this.getLowerEndpoint();
        BoundType boundType2 = this.getLowerBoundType();
        int n4 = this.hasLowerBound();
        if (n4 == 0) {
            bl2 = ((GeneralRange)object).hasLowerBound;
            object3 = ((GeneralRange)object).getLowerEndpoint();
            boundType2 = ((GeneralRange)object).getLowerBoundType();
        } else {
            BoundType boundType3;
            Object object4;
            Object object5;
            n4 = ((GeneralRange)object).hasLowerBound();
            if (n4 != 0 && ((n4 = (object2 = this.comparator).compare(object5 = this.getLowerEndpoint(), object4 = ((GeneralRange)object).getLowerEndpoint())) < 0 || n4 == 0 && (object2 = ((GeneralRange)object).getLowerBoundType()) == (boundType3 = BoundType.OPEN))) {
                object3 = ((GeneralRange)object).getLowerEndpoint();
                boundType2 = ((GeneralRange)object).getLowerBoundType();
            }
        }
        boolean bl3 = bl2;
        bl2 = this.hasUpperBound;
        object2 = this.getUpperEndpoint();
        BoundType boundType4 = this.getUpperBoundType();
        int n7 = this.hasUpperBound();
        if (n7 == 0) {
            bl2 = ((GeneralRange)object).hasUpperBound;
            object2 = ((GeneralRange)object).getUpperEndpoint();
            BoundType boundType5 = ((GeneralRange)object).getUpperBoundType();
        } else {
            BoundType boundType6;
            BoundType boundType7;
            Object object6;
            Object object7;
            Comparator comparator3;
            n7 = ((GeneralRange)object).hasUpperBound();
            if (n7 != 0 && ((n7 = (comparator3 = this.comparator).compare(object7 = this.getUpperEndpoint(), object6 = ((GeneralRange)object).getUpperEndpoint())) > 0 || n7 == 0 && (boundType7 = ((GeneralRange)object).getUpperBoundType()) == (boundType6 = BoundType.OPEN))) {
                object2 = ((GeneralRange)object).getUpperEndpoint();
                BoundType boundType8 = ((GeneralRange)object).getUpperBoundType();
            }
        }
        boolean bl4 = bl2;
        Object object8 = object2;
        if (bl3 && bl2 && ((n3 = (comparator = this.comparator).compare(object3, object2)) > 0 || n3 == 0 && boundType2 == (boundType = BoundType.OPEN) && var9_21 == boundType)) {
            BoundType boundType9 = BoundType.OPEN;
            BoundType boundType10 = BoundType.CLOSED;
            BoundType boundType11 = boundType9;
            BoundType boundType12 = boundType10;
            Object object9 = object8;
        } else {
            Object object10 = object3;
            BoundType boundType13 = boundType2;
            void var18_44 = var9_21;
        }
        Comparator comparator4 = this.comparator;
        object2 = generalRange;
        return new GeneralRange(comparator4, bl3, var14_32, (BoundType)var15_38, bl4, object8, (BoundType)var18_45);
    }

    public boolean isEmpty() {
        Object object;
        boolean bl2 = this.hasUpperBound();
        if (bl2 && (bl2 = this.tooLow(object = NullnessCasts.uncheckedCastNullableTToT(this.getUpperEndpoint()))) || (bl2 = this.hasLowerBound()) && (bl2 = this.tooHigh(object = NullnessCasts.uncheckedCastNullableTToT(this.getLowerEndpoint())))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public GeneralRange reverse() {
        GeneralRange generalRange = this.reverse;
        if (generalRange == null) {
            Ordering ordering = Ordering.from(this.comparator).reverse();
            boolean bl2 = this.hasUpperBound;
            Object object = this.getUpperEndpoint();
            BoundType boundType = this.getUpperBoundType();
            boolean bl3 = this.hasLowerBound;
            Object object2 = this.getLowerEndpoint();
            BoundType boundType2 = this.getLowerBoundType();
            generalRange = new GeneralRange(ordering, bl2, object, boundType, bl3, object2, boundType2);
            generalRange.reverse = this;
            this.reverse = generalRange;
        }
        return generalRange;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.comparator;
        stringBuilder.append(object);
        stringBuilder.append(":");
        object = this.lowerBoundType;
        BoundType boundType = BoundType.CLOSED;
        char c2 = object == boundType ? (char)'[' : '(';
        stringBuilder.append(c2);
        c2 = (char)(this.hasLowerBound ? 1 : 0);
        object = c2 != '\u0000' ? this.lowerEndpoint : "-\u221e";
        stringBuilder.append(object);
        stringBuilder.append(',');
        c2 = (char)(this.hasUpperBound ? 1 : 0);
        object = c2 != '\u0000' ? this.upperEndpoint : "\u221e";
        stringBuilder.append(object);
        object = this.upperBoundType;
        c2 = object == boundType ? (char)']' : ')';
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    public boolean tooHigh(Object object) {
        int n3;
        boolean bl2 = this.hasUpperBound();
        int n4 = 0;
        if (!bl2) {
            return false;
        }
        Object object2 = NullnessCasts.uncheckedCastNullableTToT(this.getUpperEndpoint());
        Comparator comparator = this.comparator;
        int n7 = comparator.compare(object, object2);
        bl2 = true;
        if (n7 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            comparator = null;
        }
        if (n7 == 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        BoundType boundType = this.getUpperBoundType();
        BoundType boundType2 = BoundType.OPEN;
        if (boundType == boundType2) {
            n4 = 1;
        }
        return (n7 & n4 | n3) != 0;
    }

    public boolean tooLow(Object object) {
        int n3;
        boolean bl2 = this.hasLowerBound();
        int n4 = 0;
        if (!bl2) {
            return false;
        }
        Object object2 = NullnessCasts.uncheckedCastNullableTToT(this.getLowerEndpoint());
        Comparator comparator = this.comparator;
        int n7 = comparator.compare(object, object2);
        bl2 = true;
        if (n7 < 0) {
            n3 = 1;
        } else {
            n3 = 0;
            comparator = null;
        }
        if (n7 == 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        BoundType boundType = this.getLowerBoundType();
        BoundType boundType2 = BoundType.OPEN;
        if (boundType == boundType2) {
            n4 = 1;
        }
        return (n7 & n4 | n3) != 0;
    }
}

