/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.b;
import androidx.work.impl.background.systemalarm.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public final class a
implements fe0_0 {
    public static final /* synthetic */ int f;
    public final Context a;
    public final HashMap b;
    public final Object c;
    public final TV d;
    public final zb3_0 e;

    static {
        qx1.b("CommandHandler");
    }

    public a(Context object, TV tV, jh3_1 jh3_12) {
        this.a = object;
        this.d = tV;
        this.e = jh3_12;
        this.b = object;
        super();
        this.c = object;
    }

    public static gI3 d(Intent intent) {
        String string2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        int n3 = intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0);
        gI3 gI32 = new gI3(string2, n3);
        return gI32;
    }

    public static void e(Intent intent, gI3 gI32) {
        String string2 = gI32.a;
        intent.putExtra("KEY_WORKSPEC_ID", string2);
        int n3 = gI32.b;
        intent.putExtra("KEY_WORKSPEC_GENERATION", n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(gI3 gI32, boolean bl2) {
        Object object = this.c;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.b;
                        object2 = ((HashMap)object2).remove(gI32);
                        object2 = (c)object2;
                        zb3_0 zb3_02 = this.e;
                        zb3_02.a(gI32);
                        if (object2 == null) break block3;
                        ((c)object2).g(bl2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
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
    public final boolean b() {
        Object object = this.c;
        synchronized (object) {
            HashMap hashMap = this.b;
            return hashMap.isEmpty() ^ true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n3, Intent object, SystemAlarmDispatcher systemAlarmDispatcher) {
        boolean bl2;
        Object object2 = object.getAction();
        Object object3 = "ACTION_CONSTRAINTS_CHANGED";
        int n4 = ((String)object3).equals(object2);
        int n7 = 1;
        Object object4 = null;
        if (n4 != 0) {
            Object object5;
            Object object6;
            object2 = qx1.a();
            Objects.toString(object);
            object2.getClass();
            object2 = this.a;
            object3 = this.d;
            object = new b((Context)object2, (TV)object3, n3, systemAlarmDispatcher);
            Iterator iterator = systemAlarmDispatcher.e.c.f().f();
            int n8 = ConstraintProxy.a;
            object2 = ((ArrayList)((Object)iterator)).iterator();
            n4 = 0;
            object3 = null;
            int n10 = 0;
            EI3 eI3 = null;
            boolean bl3 = false;
            MH3 mH3 = null;
            boolean bl4 = false;
            while ((object6 = object2.hasNext()) != 0) {
                object5 = ((EI3)object2.next()).j;
                int n14 = ((b60)object5).e;
                n4 |= n14;
                n14 = ((b60)object5).c;
                n10 |= n14;
                n14 = ((b60)object5).f;
                bl3 |= n14;
                object5 = ((b60)object5).a;
                lV1 lV12 = lV1.NOT_REQUIRED;
                if (object5 != lV12) {
                    object6 = 1;
                } else {
                    object6 = 0;
                    object5 = null;
                }
                if (n4 == 0 || n10 == 0 || !bl3 || !(bl4 |= object6)) continue;
            }
            n8 = ConstraintProxyUpdateReceiver.a;
            object2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            object4 = ((b)object).a;
            object5 = ConstraintProxyUpdateReceiver.class;
            Object object7 = new ComponentName((Context)object4, (Class)object5);
            object2.setComponent(object7);
            object3 = object2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", n4 != 0).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", n10 != 0).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", bl3);
            object7 = "KEY_NETWORK_STATE_PROXY_ENABLED";
            object3.putExtra((String)object7, bl4);
            object4.sendBroadcast(object2);
            n4 = ((ArrayList)((Object)iterator)).size();
            object2 = new ArrayList(n4);
            object3 = ((b)object).b;
            long l2 = object3.currentTimeMillis();
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n10 = iterator.hasNext()) != 0) {
                eI3 = (EI3)iterator.next();
                long l3 = eI3.a();
                long l4 = l2 - l3;
                object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object6 < 0 || (bl3 = eI3.e()) && !(bl3 = (mH3 = ((b)object).d).a(eI3))) continue;
                ((ArrayList)object2).add(eI3);
            }
            iterator = ((ArrayList)object2).iterator();
            while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = (EI3)iterator.next();
                object3 = ((EI3)object2).a;
                object2 = JI3.a((EI3)object2);
                object3 = new Intent((Context)object4, SystemAlarmService.class);
                object3.setAction("ACTION_DELAY_MET");
                androidx.work.impl.background.systemalarm.a.e((Intent)object3, (gI3)object2);
                qx1.a().getClass();
                object2 = systemAlarmDispatcher.b.a();
                n10 = ((b)object).c;
                object7 = new SystemAlarmDispatcher$AddRunnable(n10, (Intent)object3, systemAlarmDispatcher);
                ((qI3$a)object2).execute((Runnable)object7);
            }
            return;
        }
        object3 = "ACTION_RESCHEDULE";
        n4 = ((String)object3).equals(object2);
        if (n4 != 0) {
            Object object8 = qx1.a();
            Objects.toString(object);
            object8.getClass();
            object8 = systemAlarmDispatcher.e;
            ((ni3_1)object8).l();
            return;
        }
        object3 = object.getExtras();
        Object object9 = new String[]{"KEY_WORKSPEC_ID"};
        if (object3 != null && !(bl2 = object3.isEmpty()) && (object3 = object3.get((String)(object9 = object9[0]))) != null) {
            object3 = "ACTION_SCHEDULE_WORK";
            n4 = ((String)object3).equals(object2);
            if (n4 != 0) {
                Throwable throwable2;
                block29: {
                    block28: {
                        Object object10;
                        block27: {
                            object = androidx.work.impl.background.systemalarm.a.d((Intent)object);
                            object2 = qx1.a();
                            ((gI3)object).toString();
                            object2.getClass();
                            object2 = systemAlarmDispatcher.e.c;
                            ((FP2)object2).beginTransaction();
                            try {
                                object3 = ((WorkDatabase)object2).f();
                                object10 = ((gI3)object).a;
                                object3 = object3.i((String)object10);
                                if (object3 != null) break block27;
                                qx1 qx12 = qx1.a();
                                ((gI3)object).toString();
                                qx12.getClass();
                                break block28;
                            }
                            catch (Throwable throwable2) {
                                break block29;
                            }
                        }
                        object10 = ((EI3)object3).b;
                        n7 = ((hI3$b)((Object)object10)).isFinished();
                        if (n7 != 0) {
                            qx1 qx13 = qx1.a();
                            ((gI3)object).toString();
                            qx13.getClass();
                        } else {
                            long l7 = ((EI3)object3).a();
                            n4 = ((EI3)object3).e();
                            object9 = this.a;
                            if (n4 == 0) {
                                qx1 qx14 = qx1.a();
                                ((gI3)object).toString();
                                qx14.getClass();
                                Gc.b((Context)object9, object2, (gI3)object, l7);
                            } else {
                                object3 = qx1.a();
                                ((gI3)object).toString();
                                object3.getClass();
                                Gc.b((Context)object9, object2, (gI3)object, l7);
                                object3 = SystemAlarmService.class;
                                object = new Intent((Context)object9, object3);
                                object3 = "ACTION_CONSTRAINTS_CHANGED";
                                object.setAction((String)object3);
                                object3 = systemAlarmDispatcher.b;
                                object3 = object3.a();
                                object10 = new SystemAlarmDispatcher$AddRunnable(n3, (Intent)object, systemAlarmDispatcher);
                                ((qI3$a)object3).execute((Runnable)object10);
                            }
                            ((FP2)object2).setTransactionSuccessful();
                        }
                    }
                    ((FP2)object2).endTransaction();
                    return;
                }
                ((FP2)object2).endTransaction();
                throw throwable2;
            }
            object3 = "ACTION_DELAY_MET";
            n4 = ((String)object3).equals(object2);
            if (n4 != 0) {
                object3 = this.c;
                synchronized (object3) {
                    Throwable throwable3;
                    block32: {
                        block31: {
                            block30: {
                                try {
                                    object = androidx.work.impl.background.systemalarm.a.d((Intent)object);
                                    object2 = qx1.a();
                                    ((gI3)object).toString();
                                    object2.getClass();
                                    object2 = this.b;
                                    boolean bl5 = ((HashMap)object2).containsKey(object);
                                    if (bl5) break block30;
                                    Context context = this.a;
                                    object4 = this.e;
                                    object4 = object4.c((gI3)object);
                                    object2 = new c(context, n3, systemAlarmDispatcher, (xb3_0)object4);
                                    HashMap hashMap = this.b;
                                    hashMap.put(object, object2);
                                    ((c)object2).f();
                                    break block31;
                                }
                                catch (Throwable throwable3) {
                                    break block32;
                                }
                            }
                            qx1 qx15 = qx1.a();
                            ((gI3)object).toString();
                            qx15.getClass();
                        }
                        return;
                    }
                    throw throwable3;
                }
            }
            Object object11 = "ACTION_STOP_WORK";
            n3 = (int)(((String)object11).equals(object2) ? 1 : 0);
            if (n3 != 0) {
                boolean bl6;
                object11 = object.getExtras();
                object = object11.getString("KEY_WORKSPEC_ID");
                object2 = "KEY_WORKSPEC_GENERATION";
                n4 = object11.containsKey((String)object2);
                object9 = this.e;
                if (n4 != 0) {
                    n3 = object11.getInt((String)object2);
                    object2 = new ArrayList(n7);
                    object3 = new gI3((String)object, n3);
                    object11 = object9.a((gI3)object3);
                    if (object11 != null) {
                        ((ArrayList)object2).add(object11);
                    }
                } else {
                    object2 = object9.remove((String)object);
                }
                object11 = object2.iterator();
                while (bl6 = object11.hasNext()) {
                    object = (xb3_0)object11.next();
                    qx1.a().getClass();
                    systemAlarmDispatcher.j.a((xb3_0)object);
                    object2 = systemAlarmDispatcher.e.c;
                    object3 = ((xb3_0)object).a;
                    n7 = Gc.a;
                    object2 = ((WorkDatabase)object2).c();
                    Object object12 = object2.c((gI3)object3);
                    if (object12 != null) {
                        n7 = ((sh3_0)object12).c;
                        object9 = this.a;
                        Gc.a((Context)object9, (gI3)object3, n7);
                        object12 = qx1.a();
                        ((gI3)object3).toString();
                        object12.getClass();
                        object2.a((gI3)object3);
                    }
                    object = ((xb3_0)object).a;
                    systemAlarmDispatcher.a((gI3)object, false);
                }
                return;
            }
            object11 = "ACTION_EXECUTION_COMPLETED";
            n3 = (int)(((String)object11).equals(object2) ? 1 : 0);
            if (n3 != 0) {
                object11 = androidx.work.impl.background.systemalarm.a.d((Intent)object);
                systemAlarmDispatcher = object.getExtras();
                boolean bl7 = systemAlarmDispatcher.getBoolean("KEY_NEEDS_RESCHEDULE");
                object2 = qx1.a();
                object.toString();
                object2.getClass();
                this.a((gI3)object11, bl7);
                return;
            }
            object11 = qx1.a();
            object.toString();
            object11.getClass();
            return;
        }
        qx1 qx16 = qx1.a();
        qx16.getClass();
    }
}

