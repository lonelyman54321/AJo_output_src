/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.location.Location
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$j;
import java.util.Calendar;

public final class AppCompatDelegateImpl$k
extends AppCompatDelegateImpl$j {
    public final Ss3 c;
    public final /* synthetic */ AppCompatDelegateImpl d;

    public AppCompatDelegateImpl$k(AppCompatDelegateImpl appCompatDelegateImpl, Ss3 ss3) {
        this.d = appCompatDelegateImpl;
        super(appCompatDelegateImpl);
        this.c = ss3;
    }

    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        void var9_15;
        Ss3 ss3 = this.c;
        Object object = ss3.c;
        long l2 = ((Ss3$a)object).b;
        long l3 = System.currentTimeMillis();
        int n3 = 1;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 > 0) {
            boolean bl2 = ((Ss3$a)object).a;
        } else {
            long l4;
            long l7;
            long l8;
            long l12;
            boolean bl3;
            Location location;
            String string2;
            Object object3;
            block19: {
                int n4;
                block18: {
                    object3 = ss3.a;
                    string2 = "android.permission.ACCESS_COARSE_LOCATION";
                    n4 = jq1_1.b((Context)object3, string2);
                    location = null;
                    ss3 = ss3.b;
                    if (n4 == 0) {
                        string2 = "network";
                        try {
                            bl3 = ss3.isProviderEnabled(string2);
                            if (!bl3) break block18;
                            string2 = ss3.getLastKnownLocation(string2);
                            break block19;
                        }
                        catch (Exception exception) {}
                    }
                }
                n4 = 0;
                string2 = null;
            }
            String string3 = "android.permission.ACCESS_FINE_LOCATION";
            int n7 = jq1_1.b((Context)object3, string3);
            if (n7 == 0) {
                object3 = "gps";
                try {
                    bl3 = ss3.isProviderEnabled((String)object3);
                    if (bl3) {
                        location = ss3.getLastKnownLocation((String)object3);
                    }
                }
                catch (Exception exception) {}
            }
            if (location != null && string2 != null ? (l12 = (l8 = (l7 = location.getTime()) - (l4 = string2.getTime())) == 0L ? 0 : (l8 < 0L ? -1 : 1)) > 0 : location != null) {
                string2 = location;
            }
            boolean bl4 = false;
            ss3 = null;
            if (string2 != null) {
                long l14;
                double d2;
                boolean bl5;
                l3 = System.currentTimeMillis();
                object3 = Rs3.d;
                if (object3 == null) {
                    object3 = new Object();
                    Rs3.d = object3;
                }
                object3 = Rs3.d;
                long l15 = 86400000L;
                long l16 = l3 - l15;
                double d5 = string2.getLatitude();
                double d7 = string2.getLongitude();
                ((Rs3)object3).a(d5, d7, l16);
                d5 = string2.getLatitude();
                d7 = string2.getLongitude();
                l16 = l3;
                ((Rs3)object3).a(d5, d7, l3);
                int n8 = ((Rs3)object3).c;
                if (n8 == n3) {
                    bl5 = true;
                }
                l16 = ((Rs3)object3).b;
                long l17 = ((Rs3)object3).a;
                d5 = string2.getLatitude();
                d7 = d2 = string2.getLongitude();
                long l18 = l16;
                l16 = l15 += l3;
                ((Rs3)object3).a(d5, d2, l15);
                l16 = ((Rs3)object3).b;
                l2 = -1;
                long l19 = l18 == l2 ? 0 : (l18 < l2 ? -1 : 1);
                if (l19 != false && (l14 = l17 == l2 ? 0 : (l17 < l2 ? -1 : 1)) != false) {
                    n7 = (int)(l3 == l17 ? 0 : (l3 < l17 ? -1 : 1));
                    if (n7 <= 0) {
                        n7 = (int)(l3 == l18 ? 0 : (l3 < l18 ? -1 : 1));
                        l16 = n7 > 0 ? l17 : l18;
                    }
                    l2 = 60000L;
                    l16 += l2;
                } else {
                    l2 = 43200000L;
                    l16 = l3 + l2;
                }
                ((Ss3$a)object).a = bl5;
                ((Ss3$a)object).b = l16;
            } else {
                object = Calendar.getInstance();
                int n10 = ((Calendar)object).get(11);
                if (n10 < (n7 = 6) || n10 >= (n7 = 22)) {
                    boolean bl6 = true;
                }
            }
        }
        if (var9_15 == false) return n3;
        return 2;
    }

    public final void d() {
        boolean bl2 = true;
        this.d.B(bl2, bl2);
    }
}

