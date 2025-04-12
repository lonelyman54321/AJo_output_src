/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 */
package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.foreground.SystemForegroundService$a;
import androidx.work.impl.foreground.SystemForegroundService$b;
import androidx.work.impl.foreground.a$a;
import androidx.work.impl.utils.StopWorkRunnable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.i;

public final class a
implements t82,
fe0_0 {
    public static final /* synthetic */ int j;
    public final ni3_1 a;
    public final Si3 b;
    public final Object c;
    public gI3 d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final MH3 h;
    public a$a i;

    static {
        qx1.b("SystemFgDispatcher");
    }

    public a(Context object) {
        Object object2;
        this.c = object2 = new Object();
        object = ni3_1.i(object);
        this.a = object;
        this.b = object2 = object.d;
        this.d = null;
        object2 = new LinkedHashMap();
        this.e = object2;
        this.g = object2;
        super();
        this.f = object2;
        aq3 aq32 = object.j;
        this.h = object2 = new MH3(aq32);
        object.f.a(this);
    }

    public static Intent b(Context context, gI3 gI32, AV0 aV0) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        String string2 = gI32.a;
        intent.putExtra("KEY_WORKSPEC_ID", string2);
        int n3 = gI32.b;
        intent.putExtra("KEY_GENERATION", n3);
        int n4 = aV0.a;
        intent.putExtra("KEY_NOTIFICATION_ID", n4);
        n3 = aV0.b;
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", n3);
        gI32 = aV0.c;
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)gI32);
        return intent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(gI3 gI32, boolean bl2) {
        int n3;
        Object object;
        Object object2;
        Object object3;
        block15: {
            block14: {
                object3 = this.c;
                // MONITORENTER : object3
                object2 = this.f;
                object2 = ((HashMap)object2).remove(gI32);
                object2 = (EI3)object2;
                object = null;
                if (object2 == null) break block14;
                object2 = this.g;
                object2 = ((HashMap)object2).remove(gI32);
                object2 = (i)object2;
                break block15;
            }
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object2.d(null);
        }
        // MONITOREXIT : object3
        object3 = (AV0)this.e.remove(gI32);
        object2 = this.d;
        n3 = gI32.equals(object2);
        if (n3 != 0) {
            object2 = this.e;
            n3 = object2.size();
            if (n3 > 0) {
                int n4;
                object2 = this.e.entrySet().iterator();
                object = object2.next();
                while ((n4 = object2.hasNext()) != 0) {
                    object = (Map.Entry)object2.next();
                }
                this.d = object2 = (gI3)object.getKey();
                object2 = this.i;
                if (object2 != null) {
                    object2 = (AV0)object.getValue();
                    object = this.i;
                    n4 = ((AV0)object2).a;
                    int n7 = ((AV0)object2).b;
                    Notification notification = ((AV0)object2).c;
                    object = (SystemForegroundService)object;
                    object.getClass();
                    int n8 = Build.VERSION.SDK_INT;
                    int n10 = 31;
                    if (n8 >= n10) {
                        SystemForegroundService$b.a((Service)object, n4, notification, n7);
                    } else {
                        n10 = 29;
                        if (n8 >= n10) {
                            SystemForegroundService$a.a((Service)object, n4, notification, n7);
                        } else {
                            object.startForeground(n4, notification);
                        }
                    }
                    object = this.i;
                    n3 = ((AV0)object2).a;
                    object = ((SystemForegroundService)object).d;
                    object.cancel(n3);
                }
            } else {
                this.d = null;
            }
        }
        object2 = this.i;
        if (object3 == null) return;
        if (object2 == null) return;
        object = qx1.a();
        gI32.toString();
        object.getClass();
        int n14 = ((AV0)object3).a;
        object2 = (SystemForegroundService)object2;
        object3 = ((SystemForegroundService)object2).d;
        object3.cancel(n14);
    }

    public final void c(Intent object) {
        Object object2 = this.i;
        if (object2 != null) {
            object2 = "KEY_NOTIFICATION_ID";
            int n3 = 0;
            int n4 = object.getIntExtra((String)object2, 0);
            Object object3 = "KEY_FOREGROUND_SERVICE_TYPE";
            int n7 = object.getIntExtra((String)object3, 0);
            Object object4 = object.getStringExtra("KEY_WORKSPEC_ID");
            Object object5 = "KEY_GENERATION";
            int n8 = object.getIntExtra((String)object5, 0);
            gI3 gI32 = new gI3((String)object4, n8);
            object = (Notification)object.getParcelableExtra("KEY_NOTIFICATION");
            object4 = qx1.a();
            object4.getClass();
            if (object != null) {
                object4 = new AV0(n4, (Notification)object, n7);
                object3 = this.e;
                object3.put(gI32, object4);
                object5 = this.d;
                object5 = (AV0)((LinkedHashMap)object3).get(object5);
                int n10 = 29;
                if (object5 == null) {
                    this.d = gI32;
                } else {
                    object4 = ((SystemForegroundService)this.i).d;
                    object4.notify(n4, (Notification)object);
                    int n14 = Build.VERSION.SDK_INT;
                    if (n14 >= n10) {
                        object = ((LinkedHashMap)object3).entrySet().iterator();
                        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            object2 = (AV0)((Map.Entry)object.next()).getValue();
                            n4 = ((AV0)object2).b;
                            n3 |= n4;
                        }
                        n14 = ((AV0)object5).a;
                        object2 = ((AV0)object5).c;
                        object4 = new AV0(n14, (Notification)object2, n3);
                    } else {
                        object4 = object5;
                    }
                }
                object = (SystemForegroundService)this.i;
                object.getClass();
                n4 = Build.VERSION.SDK_INT;
                n3 = 31;
                n7 = ((AV0)object4).a;
                n8 = ((AV0)object4).b;
                object4 = ((AV0)object4).c;
                if (n4 >= n3) {
                    SystemForegroundService$b.a((Service)object, n7, (Notification)object4, n8);
                } else if (n4 >= n10) {
                    SystemForegroundService$a.a((Service)object, n7, (Notification)object4, n8);
                } else {
                    object.startForeground(n7, (Notification)object4);
                }
                return;
            }
            object = new IllegalArgumentException("Notification passed in the intent was null.");
            throw object;
        }
        object = new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        throw object;
    }

    public final void d(EI3 object, k60_0 k60_02) {
        boolean bl2 = k60_02 instanceof k60$b;
        if (bl2) {
            qx1.a().getClass();
            object = JI3.a((EI3)object);
            k60_02 = (k60$b)k60_02;
            int n3 = ((k60$b)k60_02).a;
            ni3_1 ni3_12 = this.a;
            ni3_12.getClass();
            xb3_0 xb3_02 = new xb3_0((gI3)object);
            boolean bl3 = true;
            kz2_0 kz2_02 = ni3_12.f;
            StopWorkRunnable stopWorkRunnable = new StopWorkRunnable(kz2_02, xb3_02, bl3, n3);
            object = ni3_12.d;
            object.d(stopWorkRunnable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object var1_1 = null;
        this.i = null;
        Object object = this.c;
        synchronized (object) {
            try {
                Iterator iterator = this.g;
                iterator = ((HashMap)((Object)iterator)).values();
                iterator = iterator.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4, 5] lbl11 : MonitorExitStatement: MONITOREXIT : var2_3
                        this.a.f.g(this);
                        return;
                    }
                    Object object2 = iterator.next();
                    object2 = (i)object2;
                    object2.d(null);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void f(int n3) {
        boolean bl2;
        int n4;
        qx1.a().getClass();
        Object object = this.e.entrySet().iterator();
        while (true) {
            n4 = object.hasNext();
            bl2 = true;
            if (n4 == 0) break;
            Object object2 = object.next();
            Object object3 = (AV0)object2.getValue();
            int n7 = ((AV0)object3).b;
            if (n7 != n3) continue;
            object2 = (gI3)object2.getKey();
            object3 = this.a;
            object3.getClass();
            xb3_0 xb3_02 = new xb3_0((gI3)object2);
            object2 = ((ni3_1)object3).f;
            int n8 = -128;
            StopWorkRunnable stopWorkRunnable = new StopWorkRunnable((kz2_0)object2, xb3_02, bl2, n8);
            object2 = ((ni3_1)object3).d;
            object2.d(stopWorkRunnable);
        }
        a$a a$a = this.i;
        if (a$a != null) {
            a$a = (SystemForegroundService)a$a;
            ((SystemForegroundService)a$a).b = bl2;
            object = qx1.a();
            object.getClass();
            int n10 = Build.VERSION.SDK_INT;
            n4 = 26;
            if (n10 >= n4) {
                a$a.stopForeground(bl2);
            }
            a$a.stopSelf();
        }
    }
}

