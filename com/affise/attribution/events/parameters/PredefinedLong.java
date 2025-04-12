/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.Predefined;
import com.affise.attribution.events.parameters.PredefinedLong$Companion;

public final class PredefinedLong
extends Enum
implements Predefined {
    private static final /* synthetic */ PredefinedLong[] $VALUES;
    public static final /* enum */ PredefinedLong AMOUNT;
    public static final PredefinedLong$Companion Companion;
    public static final /* enum */ PredefinedLong DATE_A;
    public static final /* enum */ PredefinedLong DATE_B;
    public static final /* enum */ PredefinedLong DEPARTING_ARRIVAL_DATE;
    public static final /* enum */ PredefinedLong DEPARTING_DEPARTURE_DATE;
    public static final /* enum */ PredefinedLong EVENT_END;
    public static final /* enum */ PredefinedLong EVENT_START;
    public static final /* enum */ PredefinedLong HOTEL_SCORE;
    public static final /* enum */ PredefinedLong LEVEL;
    public static final /* enum */ PredefinedLong MAX_RATING_VALUE;
    public static final /* enum */ PredefinedLong NUM_ADULTS;
    public static final /* enum */ PredefinedLong NUM_CHILDREN;
    public static final /* enum */ PredefinedLong NUM_INFANTS;
    public static final /* enum */ PredefinedLong PREFERRED_NUM_STOPS;
    public static final /* enum */ PredefinedLong PREFERRED_STAR_RATINGS;
    public static final /* enum */ PredefinedLong QUANTITY;
    public static final /* enum */ PredefinedLong RATING_VALUE;
    public static final /* enum */ PredefinedLong RETURNING_ARRIVAL_DATE;
    public static final /* enum */ PredefinedLong RETURNING_DEPARTURE_DATE;
    public static final /* enum */ PredefinedLong SCORE;
    public static final /* enum */ PredefinedLong TRAVEL_END;
    public static final /* enum */ PredefinedLong TRAVEL_START;
    public static final /* enum */ PredefinedLong USER_SCORE;
    private final String value;

    private static final /* synthetic */ PredefinedLong[] $values() {
        PredefinedLong predefinedLong = AMOUNT;
        predefinedLong = DATE_A;
        predefinedLong = DATE_B;
        predefinedLong = DEPARTING_ARRIVAL_DATE;
        predefinedLong = DEPARTING_DEPARTURE_DATE;
        predefinedLong = HOTEL_SCORE;
        predefinedLong = LEVEL;
        predefinedLong = MAX_RATING_VALUE;
        predefinedLong = NUM_ADULTS;
        predefinedLong = NUM_CHILDREN;
        predefinedLong = NUM_INFANTS;
        predefinedLong = PREFERRED_NUM_STOPS;
        predefinedLong = PREFERRED_STAR_RATINGS;
        predefinedLong = QUANTITY;
        predefinedLong = RATING_VALUE;
        predefinedLong = RETURNING_ARRIVAL_DATE;
        predefinedLong = RETURNING_DEPARTURE_DATE;
        predefinedLong = SCORE;
        predefinedLong = TRAVEL_START;
        predefinedLong = TRAVEL_END;
        predefinedLong = USER_SCORE;
        predefinedLong = EVENT_START;
        predefinedLong = EVENT_END;
        PredefinedLong[] predefinedLongArray = new PredefinedLong[]{predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong, predefinedLong};
        return predefinedLongArray;
    }

    static {
        Object object = new PredefinedLong("AMOUNT", 0, "amount");
        AMOUNT = object;
        object = new PredefinedLong("DATE_A", 1, "date_a");
        DATE_A = object;
        object = new PredefinedLong("DATE_B", 2, "date_b");
        DATE_B = object;
        object = new PredefinedLong("DEPARTING_ARRIVAL_DATE", 3, "departing_arrival_date");
        DEPARTING_ARRIVAL_DATE = object;
        object = new PredefinedLong("DEPARTING_DEPARTURE_DATE", 4, "departing_departure_date");
        DEPARTING_DEPARTURE_DATE = object;
        object = new PredefinedLong("HOTEL_SCORE", 5, "hotel_score");
        HOTEL_SCORE = object;
        object = new PredefinedLong("LEVEL", 6, "level");
        LEVEL = object;
        object = new PredefinedLong("MAX_RATING_VALUE", 7, "max_rating_value");
        MAX_RATING_VALUE = object;
        object = new PredefinedLong("NUM_ADULTS", 8, "num_adults");
        NUM_ADULTS = object;
        object = new PredefinedLong("NUM_CHILDREN", 9, "num_children");
        NUM_CHILDREN = object;
        object = new PredefinedLong("NUM_INFANTS", 10, "num_infants");
        NUM_INFANTS = object;
        object = new PredefinedLong("PREFERRED_NUM_STOPS", 11, "preferred_num_stops");
        PREFERRED_NUM_STOPS = object;
        object = new PredefinedLong("PREFERRED_STAR_RATINGS", 12, "preferred_star_ratings");
        PREFERRED_STAR_RATINGS = object;
        object = new PredefinedLong("QUANTITY", 13, "quantity");
        QUANTITY = object;
        object = new PredefinedLong("RATING_VALUE", 14, "rating_value");
        RATING_VALUE = object;
        object = new PredefinedLong("RETURNING_ARRIVAL_DATE", 15, "returning_arrival_date");
        RETURNING_ARRIVAL_DATE = object;
        object = new PredefinedLong("RETURNING_DEPARTURE_DATE", 16, "returning_departure_date");
        RETURNING_DEPARTURE_DATE = object;
        object = new PredefinedLong("SCORE", 17, "score");
        SCORE = object;
        object = new PredefinedLong("TRAVEL_START", 18, "travel_start");
        TRAVEL_START = object;
        object = new PredefinedLong("TRAVEL_END", 19, "travel_end");
        TRAVEL_END = object;
        object = new PredefinedLong("USER_SCORE", 20, "user_score");
        USER_SCORE = object;
        object = new PredefinedLong("EVENT_START", 21, "event_start");
        EVENT_START = object;
        object = new PredefinedLong("EVENT_END", 22, "event_end");
        EVENT_END = object;
        $VALUES = PredefinedLong.$values();
        Companion = object = new PredefinedLong$Companion(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PredefinedLong() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final /* synthetic */ String access$getValue$p(PredefinedLong predefinedLong) {
        return predefinedLong.value;
    }

    public static final PredefinedLong from(String string2) {
        return Companion.from(string2);
    }

    public static PredefinedLong valueOf(String string2) {
        return Enum.valueOf(PredefinedLong.class, string2);
    }

    public static PredefinedLong[] values() {
        return (PredefinedLong[])$VALUES.clone();
    }

    public String value() {
        StringBuilder stringBuilder = new StringBuilder("affise_p_");
        String string2 = this.value;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

