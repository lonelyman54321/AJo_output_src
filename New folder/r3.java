/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

public final class r3
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;

    public /* synthetic */ r3(Context context, String string2, long l2) {
        this.a = l2;
        this.b = string2;
        this.c = context;
    }

    public final void run() {
        Object object;
        int n3;
        long l2 = this.a;
        Object object2 = this.b;
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$activityName");
        Object object4 = v3.h;
        if (object4 != null) {
            object4 = ((t03)object4).b;
        } else {
            n3 = 0;
            object4 = null;
        }
        Object object5 = v3.h;
        String string2 = "appContext";
        if (object5 == null) {
            object5 = l2;
            v3.h = object4 = new t03((Long)object5, null);
            object4 = v3.j;
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            v03.b(object3, (String)object2, (String)object4);
        } else if (object4 != null) {
            long l3 = (Long)object4;
            l3 = l2 - l3;
            v3.a.getClass();
            object4 = dl0_2.b(FacebookSdk.b());
            n3 = object4 == null ? 60 : ((al0_2)object4).d;
            long l4 = n3 * 1000;
            n3 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
            if (n3 > 0) {
                object4 = v3.h;
                object5 = v3.j;
                v03.d((String)object2, (t03)object4, (String)object5);
                object4 = v3.j;
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                v03.b(object3, (String)object2, (String)object4);
                object3 = l2;
                v3.h = object2 = new t03((Long)object3, null);
            } else {
                long l7 = 1000L;
                long l8 = l3 - l7;
                n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                if (n3 > 0 && (object2 = v3.h) != null) {
                    int n4;
                    ((t03)object2).d = n4 = ((t03)object2).d + 1;
                }
            }
        }
        object2 = v3.h;
        if (object2 != null) {
            ((t03)object2).b = object = Long.valueOf(l2);
        }
        object = v3.h;
        if (object != null) {
            ((t03)object).a();
        }
    }
}

