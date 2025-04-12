/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import com.google.firebase.Timestamp;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Timestamp$Companion {
    private Timestamp$Companion() {
    }

    public /* synthetic */ Timestamp$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ Pair access$toPreciseTime(Timestamp$Companion timestamp$Companion, Date date) {
        return timestamp$Companion.toPreciseTime(date);
    }

    public static final /* synthetic */ void access$validateRange(Timestamp$Companion timestamp$Companion, long l2, int n3) {
        timestamp$Companion.validateRange(l2, n3);
    }

    private final Pair toPreciseTime(Date comparable) {
        long l2 = comparable.getTime();
        int n3 = 1000;
        long l3 = n3;
        l2 /= l3;
        long l4 = comparable.getTime() % l3;
        l3 = 1000000;
        int n4 = (int)(l4 *= l3);
        if (n4 < 0) {
            Long l7 = l2 - 1L;
            comparable = n4 + 1000000000;
            Pair pair = new Pair(l7, comparable);
            return pair;
        }
        Long l8 = l2;
        comparable = n4;
        Pair pair = new Pair(l8, comparable);
        return pair;
    }

    private final void validateRange(long l2, int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = 1000000000)) {
            long l3;
            long l4 = -62135596800L;
            long l7 = l4 - l2;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 <= 0 && (n3 = (int)((l3 = l2 - (l4 = 253402300800L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) < 0) {
                return;
            }
            String string2 = Wm2.a(l2, "Timestamp seconds out of range: ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = hj0_0.a(n3, "Timestamp nanoseconds out of range: ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final Timestamp now() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date);
        return timestamp;
    }
}

