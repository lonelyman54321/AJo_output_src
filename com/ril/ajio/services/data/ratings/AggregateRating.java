/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AggregateRating {
    private Double averageRating;
    private Integer numUser1StarRatings;
    private Integer numUser2StarRatings;
    private Integer numUser3StarRatings;
    private Integer numUser4StarRatings;
    private Integer numUser5StarRatings;
    private String numUserRatings;
    private String percentage1StarRatings;
    private String percentage2StarRatings;
    private String percentage3StarRatings;
    private String percentage4StarRatings;
    private String percentage5StarRatings;

    public AggregateRating() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public AggregateRating(Double d2, Integer n3, Integer n4, Integer n7, Integer n8, Integer n10, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.averageRating = d2;
        this.numUser1StarRatings = n3;
        this.numUser2StarRatings = n4;
        this.numUser3StarRatings = n7;
        this.numUser4StarRatings = n8;
        this.numUser5StarRatings = n10;
        this.numUserRatings = string2;
        this.percentage1StarRatings = string3;
        this.percentage2StarRatings = string4;
        this.percentage3StarRatings = string5;
        this.percentage4StarRatings = string6;
        this.percentage5StarRatings = string7;
    }

    public /* synthetic */ AggregateRating(Double object, Integer number, Integer n3, Integer n4, Integer n7, Integer n8, String object2, String string2, String string3, String string4, String string5, String string6, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        Integer n14;
        Integer n15;
        Integer n16;
        Integer n17;
        Integer n18;
        Double d2;
        int n19 = n10;
        int n20 = n10 & 1;
        String string12 = null;
        if (n20 != 0) {
            n20 = 0;
            d2 = null;
        } else {
            d2 = object;
        }
        int n21 = n19 & 2;
        if (n21 != 0) {
            n21 = 0;
            n18 = null;
        } else {
            n18 = number;
        }
        int n22 = n19 & 4;
        if (n22 != 0) {
            n22 = 0;
            n17 = null;
        } else {
            n17 = n3;
        }
        int n24 = n19 & 8;
        if (n24 != 0) {
            n24 = 0;
            n16 = null;
        } else {
            n16 = n4;
        }
        int n25 = n19 & 0x10;
        if (n25 != 0) {
            n25 = 0;
            n15 = null;
        } else {
            n15 = n7;
        }
        int n26 = n19 & 0x20;
        if (n26 != 0) {
            n26 = 0;
            n14 = null;
        } else {
            n14 = n8;
        }
        int n27 = n19 & 0x40;
        if (n27 != 0) {
            n27 = 0;
            string11 = null;
        } else {
            string11 = object2;
        }
        int n28 = n19 & 0x80;
        if (n28 != 0) {
            n28 = 0;
            string10 = null;
        } else {
            string10 = string2;
        }
        int n29 = n19 & 0x100;
        if (n29 != 0) {
            n29 = 0;
            string9 = null;
        } else {
            string9 = string3;
        }
        int n30 = n19 & 0x200;
        if (n30 != 0) {
            n30 = 0;
            string8 = null;
        } else {
            string8 = string4;
        }
        int n32 = n19 & 0x400;
        if (n32 != 0) {
            n32 = 0;
            string7 = null;
        } else {
            string7 = string5;
        }
        if ((n19 &= 0x800) == 0) {
            string12 = string6;
        }
        object = this;
        number = d2;
        n3 = n18;
        n4 = n17;
        n7 = n16;
        n8 = n15;
        object2 = n14;
        string2 = string11;
        string3 = string10;
        string4 = string9;
        string5 = string8;
        string6 = string7;
        this(d2, n18, n17, n16, n15, n14, string11, string10, string9, string8, string7, string12);
    }

    public static /* synthetic */ AggregateRating copy$default(AggregateRating aggregateRating, Double d2, Integer n3, Integer n4, Integer n7, Integer n8, Integer n10, String string2, String string3, String string4, String string5, String string6, String string7, int n14, Object object) {
        AggregateRating aggregateRating2 = aggregateRating;
        int n15 = n14;
        int n16 = n14 & 1;
        Double d5 = n16 != 0 ? aggregateRating.averageRating : d2;
        int n17 = n15 & 2;
        Integer n18 = n17 != 0 ? aggregateRating2.numUser1StarRatings : n3;
        int n19 = n15 & 4;
        Integer n20 = n19 != 0 ? aggregateRating2.numUser2StarRatings : n4;
        int n21 = n15 & 8;
        Integer n22 = n21 != 0 ? aggregateRating2.numUser3StarRatings : n7;
        int n24 = n15 & 0x10;
        Integer n25 = n24 != 0 ? aggregateRating2.numUser4StarRatings : n8;
        int n26 = n15 & 0x20;
        Integer n27 = n26 != 0 ? aggregateRating2.numUser5StarRatings : n10;
        int n28 = n15 & 0x40;
        String string8 = n28 != 0 ? aggregateRating2.numUserRatings : string2;
        int n29 = n15 & 0x80;
        String string9 = n29 != 0 ? aggregateRating2.percentage1StarRatings : string3;
        int n30 = n15 & 0x100;
        String string10 = n30 != 0 ? aggregateRating2.percentage2StarRatings : string4;
        int n32 = n15 & 0x200;
        String string11 = n32 != 0 ? aggregateRating2.percentage3StarRatings : string5;
        int n34 = n15 & 0x400;
        String string12 = n34 != 0 ? aggregateRating2.percentage4StarRatings : string6;
        String string13 = (n15 &= 0x800) != 0 ? aggregateRating2.percentage5StarRatings : string7;
        d2 = d5;
        n3 = n18;
        n4 = n20;
        n7 = n22;
        n8 = n25;
        n10 = n27;
        string2 = string8;
        string3 = string9;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        return aggregateRating.copy(d5, n18, n20, n22, n25, n27, string8, string9, string10, string11, string12, string13);
    }

    public final Double component1() {
        return this.averageRating;
    }

    public final String component10() {
        return this.percentage3StarRatings;
    }

    public final String component11() {
        return this.percentage4StarRatings;
    }

    public final String component12() {
        return this.percentage5StarRatings;
    }

    public final Integer component2() {
        return this.numUser1StarRatings;
    }

    public final Integer component3() {
        return this.numUser2StarRatings;
    }

    public final Integer component4() {
        return this.numUser3StarRatings;
    }

    public final Integer component5() {
        return this.numUser4StarRatings;
    }

    public final Integer component6() {
        return this.numUser5StarRatings;
    }

    public final String component7() {
        return this.numUserRatings;
    }

    public final String component8() {
        return this.percentage1StarRatings;
    }

    public final String component9() {
        return this.percentage2StarRatings;
    }

    public final AggregateRating copy(Double d2, Integer n3, Integer n4, Integer n7, Integer n8, Integer n10, String string2, String string3, String string4, String string5, String string6, String string7) {
        AggregateRating aggregateRating = new AggregateRating(d2, n3, n4, n7, n8, n10, string2, string3, string4, string5, string6, string7);
        return aggregateRating;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AggregateRating;
        if (!bl3) {
            return false;
        }
        object = (AggregateRating)object;
        Object object2 = this.averageRating;
        Object object3 = ((AggregateRating)object).averageRating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numUser1StarRatings;
        object3 = ((AggregateRating)object).numUser1StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numUser2StarRatings;
        object3 = ((AggregateRating)object).numUser2StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numUser3StarRatings;
        object3 = ((AggregateRating)object).numUser3StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numUser4StarRatings;
        object3 = ((AggregateRating)object).numUser4StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numUser5StarRatings;
        object3 = ((AggregateRating)object).numUser5StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numUserRatings;
        object3 = ((AggregateRating)object).numUserRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.percentage1StarRatings;
        object3 = ((AggregateRating)object).percentage1StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.percentage2StarRatings;
        object3 = ((AggregateRating)object).percentage2StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.percentage3StarRatings;
        object3 = ((AggregateRating)object).percentage3StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.percentage4StarRatings;
        object3 = ((AggregateRating)object).percentage4StarRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.percentage5StarRatings;
        object = ((AggregateRating)object).percentage5StarRatings;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final Integer getNumUser1StarRatings() {
        return this.numUser1StarRatings;
    }

    public final Integer getNumUser2StarRatings() {
        return this.numUser2StarRatings;
    }

    public final Integer getNumUser3StarRatings() {
        return this.numUser3StarRatings;
    }

    public final Integer getNumUser4StarRatings() {
        return this.numUser4StarRatings;
    }

    public final Integer getNumUser5StarRatings() {
        return this.numUser5StarRatings;
    }

    public final String getNumUserRatings() {
        return this.numUserRatings;
    }

    public final String getPercentage1StarRatings() {
        return this.percentage1StarRatings;
    }

    public final String getPercentage2StarRatings() {
        return this.percentage2StarRatings;
    }

    public final String getPercentage3StarRatings() {
        return this.percentage3StarRatings;
    }

    public final String getPercentage4StarRatings() {
        return this.percentage4StarRatings;
    }

    public final String getPercentage5StarRatings() {
        return this.percentage5StarRatings;
    }

    public int hashCode() {
        int n3;
        int n4;
        Double d2 = this.averageRating;
        int n7 = 0;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = ((Object)d2).hashCode();
        }
        n4 *= 31;
        Object object = this.numUser1StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.numUser2StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.numUser3StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.numUser4StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.numUser5StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.numUserRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.percentage1StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.percentage2StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.percentage3StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.percentage4StarRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.percentage5StarRatings;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAverageRating(Double d2) {
        this.averageRating = d2;
    }

    public final void setNumUser1StarRatings(Integer n3) {
        this.numUser1StarRatings = n3;
    }

    public final void setNumUser2StarRatings(Integer n3) {
        this.numUser2StarRatings = n3;
    }

    public final void setNumUser3StarRatings(Integer n3) {
        this.numUser3StarRatings = n3;
    }

    public final void setNumUser4StarRatings(Integer n3) {
        this.numUser4StarRatings = n3;
    }

    public final void setNumUser5StarRatings(Integer n3) {
        this.numUser5StarRatings = n3;
    }

    public final void setNumUserRatings(String string2) {
        this.numUserRatings = string2;
    }

    public final void setPercentage1StarRatings(String string2) {
        this.percentage1StarRatings = string2;
    }

    public final void setPercentage2StarRatings(String string2) {
        this.percentage2StarRatings = string2;
    }

    public final void setPercentage3StarRatings(String string2) {
        this.percentage3StarRatings = string2;
    }

    public final void setPercentage4StarRatings(String string2) {
        this.percentage4StarRatings = string2;
    }

    public final void setPercentage5StarRatings(String string2) {
        this.percentage5StarRatings = string2;
    }

    public String toString() {
        Double d2 = this.averageRating;
        Integer n3 = this.numUser1StarRatings;
        Integer n4 = this.numUser2StarRatings;
        Integer n7 = this.numUser3StarRatings;
        Integer n8 = this.numUser4StarRatings;
        Integer n10 = this.numUser5StarRatings;
        String string2 = this.numUserRatings;
        String string3 = this.percentage1StarRatings;
        String string4 = this.percentage2StarRatings;
        String string5 = this.percentage3StarRatings;
        String string6 = this.percentage4StarRatings;
        String string7 = this.percentage5StarRatings;
        StringBuilder stringBuilder = new StringBuilder("AggregateRating(averageRating=");
        stringBuilder.append(d2);
        stringBuilder.append(", numUser1StarRatings=");
        stringBuilder.append(n3);
        stringBuilder.append(", numUser2StarRatings=");
        stringBuilder.append(n4);
        stringBuilder.append(", numUser3StarRatings=");
        stringBuilder.append(n7);
        stringBuilder.append(", numUser4StarRatings=");
        stringBuilder.append(n8);
        stringBuilder.append(", numUser5StarRatings=");
        stringBuilder.append(n10);
        stringBuilder.append(", numUserRatings=");
        X50.a(stringBuilder, string2, ", percentage1StarRatings=", string3, ", percentage2StarRatings=");
        X50.a(stringBuilder, string4, ", percentage3StarRatings=", string5, ", percentage4StarRatings=");
        return ko_0.a(stringBuilder, string6, ", percentage5StarRatings=", string7, ")");
    }
}

