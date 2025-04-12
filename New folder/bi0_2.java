/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bi0
 */
public final class bi0_2 {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");

    public static final by0_2 a(Long object) {
        by0_2 by0_22;
        Cloneable cloneable = a;
        Object object2 = Locale.ROOT;
        cloneable = Calendar.getInstance((TimeZone)cloneable, (Locale)object2);
        Intrinsics.checkNotNull(cloneable);
        object2 = "<this>";
        Intrinsics.checkNotNullParameter(cloneable, (String)object2);
        if (object != null) {
            long l2 = object;
            ((Calendar)cloneable).setTimeInMillis(l2);
        }
        int n3 = ((Calendar)cloneable).get(15);
        int n4 = ((Calendar)cloneable).get(16) + n3;
        int n7 = ((Calendar)cloneable).get(13);
        int n8 = ((Calendar)cloneable).get(12);
        int n10 = ((Calendar)cloneable).get(11);
        n3 = 7;
        int n14 = ((Calendar)cloneable).get(n3);
        int n15 = 5;
        n14 = (n14 + n15) % n3;
        qf3_2.Companion.getClass();
        object = (qf3_2)((Object)qf3_2.getEntries().get(n14));
        int n16 = ((Calendar)cloneable).get(n15);
        int n17 = ((Calendar)cloneable).get(6);
        Object object3 = bq1_2.Companion;
        n15 = ((Calendar)cloneable).get(2);
        object3.getClass();
        object3 = bq1_2.getEntries().get(n15);
        Object object4 = object3;
        object4 = (bq1_2)((Object)object3);
        int n18 = ((Calendar)cloneable).get(1);
        long l3 = ((Calendar)cloneable).getTimeInMillis();
        long l4 = n4;
        object3 = by0_22;
        by0_22 = new by0_2(n7, n8, n10, (qf3_2)((Object)object), n16, n17, (bq1_2)((Object)object4), n18, l3 += l4);
        return by0_22;
    }
}

