/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.widget.RemoteViews
 */
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$id;
import kotlin.jvm.internal.Intrinsics;

public class In3
extends q70_0 {
    public In3(Context object, Integer n3, uj3_1 uj3_12, int n4) {
        int n7;
        String string2;
        int n8;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "context");
        String string3 = "renderer";
        Intrinsics.checkNotNullParameter(uj3_12, string3);
        super(n4, uj3_12, (Context)object);
        this.a();
        object = uj3_12.c;
        this.h((String)object);
        object = uj3_12.d;
        this.e((String)object);
        object = uj3_12.r;
        this.b((String)object);
        object = uj3_12.r;
        if (object != null && (n4 = ((String)object).length()) > 0) {
            object2 = this.c;
            int n10 = R$id.chronometer;
            n8 = xz3_0.h((String)object, "#FFFFFF");
            string2 = "setBackgroundColor";
            object2.setInt(n10, string2, n8);
        }
        object = uj3_12.h;
        this.i((String)object);
        object = uj3_12.j;
        object2 = uj3_12.h;
        string3 = this.c;
        string2 = "#000000";
        if (object != null && (n7 = ((String)object).length()) > 0) {
            n4 = R$id.chronometer;
            n8 = xz3_0.h((String)object, string2);
            string3.setTextColor(n4, n8);
        } else if (object2 != null && (n8 = ((String)object2).length()) > 0) {
            n8 = R$id.chronometer;
            n4 = xz3_0.h((String)object2, string2);
            string3.setTextColor(n8, n4);
        }
        object = uj3_12.i;
        this.f((String)object);
        string3 = this.c;
        int n14 = R$id.chronometer;
        long l2 = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNull(n3);
        long l3 = n3.intValue();
        long l4 = l2 + l3;
        boolean bl2 = true;
        string3.setChronometer(n14, l4, null, bl2);
        n8 = Build.VERSION.SDK_INT;
        int n15 = 24;
        if (n8 >= n15) {
            object = this.c;
            n15 = R$id.chronometer;
            Hn3.a((RemoteViews)object, n15);
        }
        this.g();
    }
}

