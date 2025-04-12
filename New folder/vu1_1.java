/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vu1
 */
public final class vu1_1 {
    public final df1_1 a;
    public final rs3_0 b;

    public vu1_1(df1_1 df1_12, rs3_0 rs3_02) {
        Intrinsics.checkNotNullParameter(df1_12, "manager");
        Intrinsics.checkNotNullParameter(rs3_02, "triggerManager");
        this.a = df1_12;
        this.b = rs3_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(ru1_2 object, String object2) {
        Object object3 = ((ru1_2)object).a;
        int[] nArray = vu1$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object3).ordinal();
        n3 = nArray[n3];
        boolean bl2 = false;
        nArray = null;
        Object object4 = "campaignId";
        int n4 = 6;
        int n7 = 14;
        int n8 = 13;
        int n10 = 12;
        int n14 = 11;
        rs3_0 rs3_02 = this.b;
        df1_1 df1_12 = this.a;
        int n15 = 1;
        int n16 = ((ru1_2)object).c;
        int n17 = ((ru1_2)object).b;
        switch (n3) {
            default: {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            case 9: {
                int n18 = rs3_02.a((String)object2);
                if (n18 != n17) return bl2;
                return true;
            }
            case 8: {
                int n19 = rs3_02.a((String)object2) % n17;
                if (n19 != 0) return bl2;
                return true;
            }
            case 7: {
                int n20;
                df1_12.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object3 = df1_12.a.b;
                if (object3 == null || (object2 = ((ef1_1)object3).b((String)object2)) == null) {
                    object2 = mz0_2.a;
                }
                if ((n20 = object2.size()) >= n17) return bl2;
                return true;
            }
            case 6: {
                long l2;
                long l3;
                int n21;
                df1_12.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object3 = Calendar.getInstance(df1_12.c);
                object4 = new Date();
                ((Calendar)object3).setTime((Date)object4);
                ((Calendar)object3).set(n14, 0);
                ((Calendar)object3).set(n10, 0);
                ((Calendar)object3).set(n8, 0);
                ((Calendar)object3).set(n7, 0);
                int n22 = ((Calendar)object3).getFirstDayOfWeek();
                n7 = 7;
                n8 = (((Calendar)object3).get(n7) - n22 + n7) % n7;
                n22 = -n8;
                ((Calendar)object3).add(n4, n22);
                if (n16 > n15) {
                    n22 = 3;
                    n4 = -n16;
                    ((Calendar)object3).add(n22, n4);
                }
                if ((n21 = df1_12.a(l3 = ((TimeUnit)((Object)(object4 = TimeUnit.MILLISECONDS))).toSeconds(l2 = ((Calendar)object3).getTimeInMillis()), (String)object2)) >= n17) return bl2;
                return true;
            }
            case 5: {
                df1_12.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object3 = Calendar.getInstance(df1_12.c);
                object4 = new Date();
                ((Calendar)object3).setTime((Date)object4);
                ((Calendar)object3).set(n14, 0);
                ((Calendar)object3).set(n10, 0);
                ((Calendar)object3).set(n8, 0);
                ((Calendar)object3).set(n7, 0);
                int n24 = -n16;
                ((Calendar)object3).add(n4, n24);
                object3 = ((Calendar)object3).getTime();
                object4 = TimeUnit.MILLISECONDS;
                long l4 = ((Date)object3).getTime();
                long l7 = ((TimeUnit)((Object)object4)).toSeconds(l4);
                int n25 = df1_12.a(l7, (String)object2);
                if (n25 >= n17) return bl2;
                return true;
            }
            case 4: {
                df1_12.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                long l8 = df1_12.b.a();
                object3 = TimeUnit.HOURS;
                long l12 = n16;
                l12 = ((TimeUnit)((Object)object3)).toSeconds(l12);
                int n26 = df1_12.a(l8 -= l12, (String)object2);
                if (n26 >= n17) return bl2;
                return true;
            }
            case 3: {
                df1_12.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                long l14 = df1_12.b.a();
                object3 = TimeUnit.MINUTES;
                long l15 = n16;
                l15 = ((TimeUnit)((Object)object3)).toSeconds(l15);
                int n27 = df1_12.a(l14 -= l15, (String)object2);
                if (n27 >= n17) return bl2;
                return true;
            }
            case 2: {
                df1_12.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object3 = df1_12.b;
                long l16 = object3.a();
                long l17 = n16;
                int n28 = df1_12.a(l16 -= l17, (String)object2);
                if (n28 >= n17) return bl2;
                return true;
            }
            case 1: {
                int n29;
                df1_12.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object3 = df1_12.d;
                object2 = (List)((LinkedHashMap)object3).get(object2);
                if (object2 != null) {
                    n29 = object2.size();
                } else {
                    n29 = 0;
                    object2 = null;
                }
                if (n29 >= n17) return bl2;
                return true;
            }
        }
    }

    public final boolean b(String string2, ArrayList object) {
        Intrinsics.checkNotNullParameter(object, "whenLimits");
        Object object2 = "campaignId";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        boolean bl2 = object.isEmpty();
        boolean bl3 = true;
        if (!bl2) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (ru1_2)object.next();
                bl2 = this.a((ru1_2)object2, string2);
                if (bl2) continue;
                bl3 = false;
                break;
            }
        }
        return bl3;
    }
}

