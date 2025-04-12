/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.b;

public final class x03
extends k0_0 {
    public long a = 0L;
    public final E80 b;
    public final CleverTapInstanceConfig c;
    public final LocalDataStore d;
    public final ha3_1 e;

    public x03(CleverTapInstanceConfig cleverTapInstanceConfig, E80 e80, ha3_1 ha3_12, LocalDataStore localDataStore) {
        this.c = cleverTapInstanceConfig;
        this.b = e80;
        this.e = ha3_12;
        this.d = localDataStore;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Z() {
        Object object = this.b;
        String string2 = null;
        ((E80)object).d = 0;
        ((E80)object).i(false);
        object = this.b;
        boolean bl2 = ((E80)object).g;
        if (bl2) {
            ((E80)object).g = false;
        }
        object = this.c.b();
        string2 = this.c.a;
        String string3 = "Session destroyed; Session ID is now 0";
        ((b)object).b(string2, string3);
        object = this.b;
        synchronized (object) {
            string2 = null;
            ((E80)object).q = null;
        }
        this.b.b();
        this.b.a();
        this.b.c();
    }

    public final void a0(Context object) {
        E80 e80 = this.b;
        int n3 = e80.d;
        if (n3 <= 0) {
            b b2;
            int n4;
            n3 = 1;
            e80.f = n3;
            Object object2 = this.e;
            if (object2 != null) {
                n4 = 0;
                b2 = null;
                ((ha3_1)object2).a = null;
            }
            long l2 = System.currentTimeMillis();
            long l3 = 1000L;
            e80.d = n4 = (int)(l2 /= l3);
            object2 = this.c;
            b2 = ((CleverTapInstanceConfig)object2).b();
            CharSequence charSequence = new StringBuilder("Session created with ID: ");
            int n7 = e80.d;
            charSequence.append(n7);
            charSequence = charSequence.toString();
            String string2 = ((CleverTapInstanceConfig)object2).a;
            b2.b(string2, (String)charSequence);
            b2 = gc3_0.e((Context)object);
            charSequence = "lastSessionId";
            int n8 = gc3_0.c((Context)object, (CleverTapInstanceConfig)object2, (String)charSequence);
            CharSequence charSequence2 = "sexe";
            int n10 = gc3_0.c((Context)object, (CleverTapInstanceConfig)object2, (String)charSequence2);
            if (n10 > 0) {
                e80.m = n10 -= n8;
            }
            object = ((CleverTapInstanceConfig)object2).b();
            charSequence2 = new StringBuilder("Last session length: ");
            int n14 = e80.m;
            ((StringBuilder)charSequence2).append(n14);
            String string3 = " seconds";
            ((StringBuilder)charSequence2).append(string3);
            charSequence2 = ((StringBuilder)charSequence2).toString();
            ((b)object).b(string2, (String)charSequence2);
            if (n8 == 0) {
                e80.g = n3;
            }
            object = b2.edit();
            String string4 = gc3_0.l((CleverTapInstanceConfig)object2, (String)charSequence);
            int n15 = e80.d;
            object = object.putInt(string4, n15);
            gc3_0.i((SharedPreferences.Editor)object);
        }
    }
}

