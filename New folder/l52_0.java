/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.util.LongSparseArray
 */
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.LongSparseArray;
import com.chuckerteam.chucker.R$color;
import com.chuckerteam.chucker.R$drawable;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.ClearDatabaseService;
import com.chuckerteam.chucker.internal.support.ClearDatabaseService$a$b;
import com.chuckerteam.chucker.internal.ui.BaseChuckerActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

/*
 * Renamed from l52
 */
public final class l52_0 {
    public static final LongSparseArray d;
    public static final HashSet e;
    public final Context a;
    public final NotificationManager b;
    public final hh3_2 c;

    static {
        Object object;
        d = object = new LongSparseArray();
        object = new HashSet();
        e = object;
    }

    public l52_0(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.a = object;
        Object object2 = object.getSystemService("notification");
        if (object2 != null) {
            object2 = (NotificationManager)object2;
            this.b = object2;
            Serializable serializable = new l52$b(this);
            serializable = yr1_2.b(serializable);
            this.c = serializable;
            super(this);
            yr1_2.b(serializable);
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 26;
            if (n3 >= n4) {
                k52.a();
                n3 = R$string.chucker_network_notification_category;
                serializable = i52.a(object.getString(n3));
                k52.a();
                n4 = R$string.chucker_throwable_notification_category;
                object = j52.a(object.getString(n4));
                n4 = 2;
                Object[] objectArray = new NotificationChannel[n4];
                objectArray[0] = serializable;
                n3 = 1;
                objectArray[n3] = object;
                object = xx_2.i(objectArray);
                h52.a((NotificationManager)object2, (List)object);
            }
            return;
        }
        super("null cannot be cast to non-null type android.app.NotificationManager");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(HttpTransaction object) {
        long l2;
        long l3 = ((HttpTransaction)object).getId();
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            return;
        }
        LongSparseArray longSparseArray = d;
        synchronized (longSparseArray) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        HashSet hashSet = e;
                        l2 = ((HttpTransaction)object).getId();
                        Long l7 = l2;
                        hashSet.add(l7);
                        long l8 = ((HttpTransaction)object).getId();
                        longSparseArray.put(l8, object);
                        int n3 = longSparseArray.size();
                        int n4 = 10;
                        if (n3 <= n4) break block4;
                        n3 = 0;
                        object = null;
                        longSparseArray.removeAt(0);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(HttpTransaction object) {
        int n3;
        Object object2 = "transaction";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        l52_0.a((HttpTransaction)object);
        boolean bl2 = BaseChuckerActivity.X;
        if (bl2) return;
        object2 = this.a;
        object = new J42((Context)object2, "chucker_transactions");
        object2 = (PendingIntent)this.c.getValue();
        ((J42)object).g = object2;
        int n4 = 1;
        ((J42)object).y = n4;
        ((J42)object).P.icon = n3 = R$drawable.chucker_ic_transaction_notification;
        Object object3 = this.a;
        int n7 = R$color.chucker_color_primary;
        ((J42)object).D = n3 = t70.getColor(object3, n7);
        object3 = this.a;
        n7 = R$string.chucker_http_notification_title;
        object3 = J42.b(object3.getString(n7));
        ((J42)object).e = object3;
        ((J42)object).d(16, n4 != 0);
        object3 = ClearDatabaseService$a$b.a;
        n7 = R$string.chucker_clear;
        Object object4 = this.a;
        String string2 = object4.getString(n7);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.chucker_clear)");
        Object object5 = new Intent((Context)object4, ClearDatabaseService.class);
        String string3 = "EXTRA_ITEM_TO_CLEAR";
        object5.putExtra(string3, (Serializable)object3);
        n3 = Build.VERSION.SDK_INT;
        int n8 = 23;
        int n10 = 0;
        if (n3 >= n8) {
            n3 = 0x4000000;
        } else {
            n3 = 0;
            object3 = null;
        }
        n8 = 11;
        object3 = PendingIntent.getService((Context)object4, (int)n8, (Intent)object5, (int)(n3 |= 0x40000000));
        int n14 = R$drawable.chucker_ic_delete_white;
        object4 = new A42(n14, string2, (PendingIntent)object3);
        ((J42)object).b.add(object4);
        Intrinsics.checkNotNullExpressionValue(object, "Builder(context, TRANSACTIONS_CHANNEL_ID)\n                    .setContentIntent(transactionsScreenIntent)\n                    .setLocalOnly(true)\n                    .setSmallIcon(R.drawable.chucker_ic_transaction_notification)\n                    .setColor(ContextCompat.getColor(context, R.color.chucker_color_primary))\n                    .setContentTitle(context.getString(R.string.chucker_http_notification_title))\n                    .setAutoCancel(true)\n                    .addAction(createClearAction(ClearDatabaseService.ClearAction.Transaction))");
        object3 = new P42();
        string2 = d;
        synchronized (string2) {
            int n15;
            try {
                n15 = string2.size() - n4;
                object2 = kotlin.ranges.c.d;
                object2.getClass();
                n14 = -1;
                object2 = new c(n15, 0, n14);
                object2 = ((c)object2).d();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while ((n15 = (int)(((ui1_2)object2).c ? 1 : 0)) != 0) {
                n15 = ((mi1_2)object2).nextInt();
                object5 = d;
                object4 = object5.valueAt(n15);
                if ((object4 = (HttpTransaction)object4) != null && n10 < (n14 = 10)) {
                    if (n10 == 0) {
                        object5 = ((HttpTransaction)object4).getNotificationText();
                        object5 = J42.b((CharSequence)object5);
                        ((J42)object).f = object5;
                    }
                    if ((object4 = ((HttpTransaction)object4).getNotificationText()) != null) {
                        object5 = object3.e;
                        object4 = J42.b((CharSequence)object4);
                        ((ArrayList)object5).add(object4);
                    }
                }
                ++n10;
            }
            ((J42)object).g((U42)object3);
            n4 = Build.VERSION.SDK_INT;
            n3 = 24;
            if (n4 >= n3) {
                object2 = e;
                n4 = ((HashSet)object2).size();
                object2 = String.valueOf(n4);
                ((J42)object).q = object2 = J42.b((CharSequence)object2);
            } else {
                object2 = e;
                ((J42)object).k = n4 = ((HashSet)object2).size();
            }
        }
        object2 = this.b;
        n3 = 1138;
        object = ((J42)object).a();
        object2.notify(n3, (Notification)object);
    }
}

