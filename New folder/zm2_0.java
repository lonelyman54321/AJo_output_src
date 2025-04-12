/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zM2
 */
public final class zm2_0 {
    public static long d;
    public final long a;
    public final long b;
    public final SharedPreferences c;

    /*
     * Enabled aggressive block sorting
     */
    public zm2_0(Context object, zM2$a zM2$a) {
        long l2;
        long l3;
        int n3;
        Object object2;
        block7: {
            long l4;
            block8: {
                Intrinsics.checkNotNullParameter(object, "context");
                Intrinsics.checkNotNullParameter((Object)zM2$a, "retentionPeriod");
                object2 = zM2$b.$EnumSwitchMapping$0;
                n3 = zM2$a.ordinal();
                int n4 = object2[n3];
                n3 = 1;
                l4 = 1L;
                if (n4 == n3) break block8;
                n3 = 2;
                if (n4 != n3) {
                    n3 = 3;
                    if (n4 != n3) {
                        n3 = 4;
                        if (n4 != n3) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        l3 = 0L;
                        break block7;
                    } else {
                        object2 = TimeUnit.DAYS;
                        long l7 = 7;
                        l3 = ((TimeUnit)((Object)object2)).toMillis(l7);
                    }
                    break block7;
                } else {
                    object2 = TimeUnit.DAYS;
                    l3 = ((TimeUnit)((Object)object2)).toMillis(l4);
                }
                break block7;
            }
            object2 = (Object)TimeUnit.HOURS;
            l3 = ((TimeUnit)((Object)object2)).toMillis(l4);
        }
        this.a = l3;
        n3 = 0;
        object = object.getSharedPreferences("chucker_preferences", 0);
        object2 = "context.getSharedPreferences(PREFS_NAME, 0)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.c = object;
        object = zM2$a.ONE_HOUR;
        if (zM2$a == object) {
            object = TimeUnit.MINUTES;
            l3 = 30;
            l2 = ((TimeUnit)((Object)object)).toMillis(l3);
        } else {
            object = TimeUnit.HOURS;
            l3 = 2;
            l2 = ((TimeUnit)((Object)object)).toMillis(l3);
        }
        this.b = l2;
    }
}

