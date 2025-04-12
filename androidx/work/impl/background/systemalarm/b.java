/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;

public final class b {
    public final Context a;
    public final TV b;
    public final int c;
    public final MH3 d;

    static {
        qx1.b("ConstraintsCmdHandler");
    }

    public b(Context object, TV object2, int n3, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.a = object;
        this.b = object2;
        this.c = n3;
        object = systemAlarmDispatcher.e.j;
        this.d = object2 = new MH3((aq3)object);
    }
}

