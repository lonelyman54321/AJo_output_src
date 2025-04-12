/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.Timestamp$Companion;
import com.google.firebase.Timestamp$Companion$CREATOR$1;
import com.google.firebase.Timestamp$compareTo$1;
import com.google.firebase.Timestamp$compareTo$2;
import java.time.Instant;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

public final class Timestamp
implements Comparable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Timestamp$Companion Companion;
    private final int nanoseconds;
    private final long seconds;

    static {
        Object object = new Timestamp$Companion(null);
        Companion = object;
        object = new Timestamp$Companion$CREATOR$1();
        CREATOR = object;
    }

    public Timestamp(long l2, int n3) {
        Timestamp$Companion.access$validateRange(Companion, l2, n3);
        this.seconds = l2;
        this.nanoseconds = n3;
    }

    public Timestamp(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "time");
        long l2 = mn3_0.a(instant);
        int n3 = nn3_0.a(instant);
        this(l2, n3);
    }

    public Timestamp(Date serializable) {
        Intrinsics.checkNotNullParameter(serializable, "date");
        Timestamp$Companion timestamp$Companion = Companion;
        serializable = Timestamp$Companion.access$toPreciseTime(timestamp$Companion, serializable);
        long l2 = ((Number)((Pair)serializable).a).longValue();
        int n3 = ((Number)((Pair)serializable).b).intValue();
        Timestamp$Companion.access$validateRange(timestamp$Companion, l2, n3);
        this.seconds = l2;
        this.nanoseconds = n3;
    }

    public static final Timestamp now() {
        return Companion.now();
    }

    public int compareTo(Timestamp timestamp) {
        String string2 = "other";
        Intrinsics.checkNotNullParameter(timestamp, string2);
        int n3 = 2;
        Function1[] function1Array = new Function1[n3];
        PropertyReference1Impl propertyReference1Impl = Timestamp$compareTo$1.INSTANCE;
        int n4 = 0;
        function1Array[0] = propertyReference1Impl;
        propertyReference1Impl = Timestamp$compareTo$2.INSTANCE;
        int n7 = 1;
        function1Array[n7] = propertyReference1Impl;
        Intrinsics.checkNotNullParameter(function1Array, "selectors");
        propertyReference1Impl = null;
        for (int i3 = 0; i3 < n3; i3 += n7) {
            Object object = function1Array[i3];
            Comparable comparable = (Comparable)object.invoke(this);
            int n8 = q00_0.a(comparable, (Comparable)(object = (Comparable)object.invoke(timestamp)));
            if (n8 == 0) continue;
            n4 = n8;
            break;
        }
        return n4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2;
        if (!(object == this || (bl2 = object instanceof Timestamp) && (n3 = this.compareTo((Timestamp)(object = (Timestamp)object))) == 0)) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long l2 = this.seconds;
        int n3 = (int)l2 * 1369;
        int n4 = (int)(l2 >> 32);
        n3 = (n3 + n4) * 37;
        int n7 = this.nanoseconds;
        return n3 + n7;
    }

    public final Date toDate() {
        long l2 = this.seconds;
        long l3 = 1000;
        l2 *= l3;
        l3 = this.nanoseconds / 1000000;
        Date date = new Date(l2 += l3);
        return date;
    }

    public final Instant toInstant() {
        long l2 = this.seconds;
        long l3 = this.nanoseconds;
        Instant instant = ln3_0.a(l2, l3);
        Intrinsics.checkNotNullExpressionValue(instant, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instant;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Timestamp(seconds=");
        long l2 = this.seconds;
        stringBuilder.append(l2);
        stringBuilder.append(", nanoseconds=");
        int n3 = this.nanoseconds;
        return tu.a(stringBuilder, n3, ')');
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        long l2 = this.seconds;
        parcel.writeLong(l2);
        n3 = this.nanoseconds;
        parcel.writeInt(n3);
    }
}

