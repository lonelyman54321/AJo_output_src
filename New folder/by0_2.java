/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;

/*
 * Renamed from bY0
 */
public final class by0_2
implements Comparable {
    public static final bY0$b Companion;
    public static final KSerializer[] j;
    public final int a;
    public final int b;
    public final int c;
    public final qf3_2 d;
    public final int e;
    public final int f;
    public final bq1_2 g;
    public final int h;
    public final long i;

    static {
        Object[] objectArray = new bY0$b();
        Companion = objectArray;
        objectArray = qf3_2.values();
        String string2 = "io.ktor.util.date.WeekDay";
        Object object = "serialName";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        String string3 = "values";
        Intrinsics.checkNotNullParameter(objectArray, string3);
        na0_2 na0_22 = new na0_2(string2, (Enum[])objectArray);
        objectArray = bq1_2.values();
        string2 = "io.ktor.util.date.Month";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(objectArray, string3);
        object = new na0_2(string2, (Enum[])objectArray);
        objectArray = new KSerializer[]{null, null, null, na0_22, null, null, object, null, null};
        j = objectArray;
        bi0_2.a(0L);
    }

    public by0_2(int n3, int n4, int n7, int n8, qf3_2 object, int n10, int n14, bq1_2 bq1_22, int n15, long l2) {
        String string2;
        int n16;
        int n17 = 511;
        int n18 = n3 & 0x1FF;
        if (n17 == n18) {
            this.a = n4;
            this.b = n7;
            this.c = n8;
            this.d = object;
            this.e = n10;
            this.f = n14;
            this.g = bq1_22;
            this.h = n15;
            this.i = l2;
            return;
        }
        Object object2 = bY0$a.a.getDescriptor();
        Intrinsics.checkNotNullParameter(object2, "descriptor");
        ArrayList<String> arrayList = new ArrayList<String>();
        n3 = ~n3 & n17;
        n8 = 0;
        CharSequence charSequence = null;
        object = null;
        for (n16 = 0; n16 < (n10 = 32); ++n16) {
            n10 = n3 & 1;
            if (n10 != 0) {
                string2 = object2.e(n16);
                arrayList.add(string2);
            }
            n3 >>>= 1;
        }
        object2 = object2.h();
        Intrinsics.checkNotNullParameter(arrayList, "missingFields");
        object = "serialName";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        n16 = arrayList.size();
        n10 = 1;
        if (n16 == n10) {
            super("Field '");
            charSequence = (String)arrayList.get(0);
            string2 = "' is required for type with serial name '";
            String string3 = "', but it was missing";
            object2 = ko_0.a((StringBuilder)object, (String)charSequence, string2, (String)object2, string3);
        } else {
            charSequence = new StringBuilder("Fields ");
            ((StringBuilder)charSequence).append(arrayList);
            object = " are required for type with serial name '";
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("', but they were missing");
            object2 = ((StringBuilder)charSequence).toString();
        }
        MissingFieldException missingFieldException = new MissingFieldException(arrayList, (String)object2, null);
        throw missingFieldException;
    }

    public by0_2(int n3, int n4, int n7, qf3_2 qf3_22, int n8, int n10, bq1_2 bq1_22, int n14, long l2) {
        Intrinsics.checkNotNullParameter((Object)qf3_22, "dayOfWeek");
        Intrinsics.checkNotNullParameter((Object)bq1_22, "month");
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = qf3_22;
        this.e = n8;
        this.f = n10;
        this.g = bq1_22;
        this.h = n14;
        this.i = l2;
    }

    public final int compareTo(Object object) {
        object = (by0_2)object;
        Intrinsics.checkNotNullParameter(object, "other");
        long l2 = this.i;
        long l3 = ((by0_2)object).i;
        return Intrinsics.compare(l2, l3);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof by0_2;
        if (n3 == 0) {
            return false;
        }
        object = (by0_2)object;
        int n4 = this.a;
        n3 = ((by0_2)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((by0_2)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        n4 = ((by0_2)object).c;
        if (n3 != n4) {
            return false;
        }
        Enum enum_ = this.d;
        Enum enum_2 = ((by0_2)object).d;
        if (enum_ != enum_2) {
            return false;
        }
        n3 = this.e;
        n4 = ((by0_2)object).e;
        if (n3 != n4) {
            return false;
        }
        n3 = this.f;
        n4 = ((by0_2)object).f;
        if (n3 != n4) {
            return false;
        }
        enum_ = this.g;
        enum_2 = ((by0_2)object).g;
        if (enum_ != enum_2) {
            return false;
        }
        n3 = this.h;
        n4 = ((by0_2)object).h;
        if (n3 != n4) {
            return false;
        }
        long l2 = this.i;
        long l3 = ((by0_2)object).i;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = (((Object)((Object)this.d)).hashCode() + n3) * 31;
        n3 = this.e;
        n4 = (n4 + n3) * 31;
        n3 = this.f;
        n4 = (n4 + n3) * 31;
        n3 = (((Object)((Object)this.g)).hashCode() + n4) * 31;
        n4 = this.h;
        n3 = (n3 + n4) * 31;
        long l2 = this.i;
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^ l3);
        return n3 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GMTDate(seconds=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", minutes=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", hours=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", dayOfWeek=");
        Enum enum_ = this.d;
        stringBuilder.append(enum_);
        stringBuilder.append(", dayOfMonth=");
        n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(", dayOfYear=");
        n3 = this.f;
        stringBuilder.append(n3);
        stringBuilder.append(", month=");
        enum_ = this.g;
        stringBuilder.append(enum_);
        stringBuilder.append(", year=");
        n3 = this.h;
        stringBuilder.append(n3);
        stringBuilder.append(", timestamp=");
        long l2 = this.i;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

