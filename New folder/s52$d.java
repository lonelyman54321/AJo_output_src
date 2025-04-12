/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.ResolveInfo
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 *  android.provider.Settings$Secure
 *  android.util.Log
 */
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel$Stub;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class s52$d
implements Handler.Callback,
ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c;
    public HashSet d;

    public s52$d(Context context) {
        Handler handler = new HashMap();
        this.c = handler;
        this.d = handler;
        this.a = context;
        super("NotificationManagerCompat");
        context.start();
        context = context.getLooper();
        this.b = handler = new Handler((Looper)context, (Handler.Callback)this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(s52$d$a s52$d$a) {
        block14: {
            boolean bl2;
            Object object;
            Object object2;
            Object object3;
            String string2 = "NotifManCompat";
            int n3 = 3;
            boolean bl3 = Log.isLoggable((String)string2, (int)n3);
            ComponentName componentName = s52$d$a.a;
            if (bl3) {
                Objects.toString(componentName);
                object3 = s52$d$a.d;
                ((ArrayDeque)object3).size();
            }
            if (bl3 = ((ArrayDeque)(object3 = s52$d$a.d)).isEmpty()) {
                return;
            }
            bl3 = s52$d$a.b;
            if (bl3) {
                bl3 = true;
            } else {
                object2 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
                object3 = new Intent((String)object2);
                object3 = object3.setComponent(componentName);
                int n4 = 33;
                object = this.a;
                s52$d$a.b = bl3 = object.bindService((Intent)object3, (ServiceConnection)this, n4);
                if (bl3) {
                    bl3 = false;
                    object3 = null;
                    s52$d$a.e = 0;
                } else {
                    Objects.toString(componentName);
                    object.unbindService((ServiceConnection)this);
                }
                bl3 = s52$d$a.b;
            }
            if (!bl3 || (object3 = s52$d$a.c) == null) break block14;
            while ((object2 = (s52$e)((ArrayDeque)(object3 = s52$d$a.d)).peek()) != null) {
                block13: {
                    try {
                        boolean bl4 = Log.isLoggable((String)string2, (int)n3);
                        if (bl4) {
                            object2.toString();
                        }
                    }
                    catch (DeadObjectException deadObjectException) {
                        break block13;
                    }
                    catch (RemoteException remoteException) {
                        Objects.toString(componentName);
                        break;
                    }
                    {
                        object = s52$d$a.c;
                        object2.a((INotificationSideChannel)object);
                        ((ArrayDeque)object3).remove();
                        continue;
                    }
                }
                bl2 = Log.isLoggable((String)string2, (int)n3);
                if (!bl2) break;
                Objects.toString(componentName);
                break;
            }
            bl2 = ((ArrayDeque)object3).isEmpty();
            if (!bl2) {
                this.b(s52$d$a);
            }
            return;
        }
        this.b(s52$d$a);
    }

    public final void b(s52$d$a object) {
        int n3;
        Handler handler = this.b;
        int n4 = 3;
        ComponentName componentName = ((s52$d$a)object).a;
        int n7 = handler.hasMessages(n4, (Object)componentName);
        if (n7 != 0) {
            return;
        }
        n7 = ((s52$d$a)object).e;
        ((s52$d$a)object).e = n3 = n7 + 1;
        int n8 = 6;
        if (n3 > n8) {
            object = ((s52$d$a)object).d;
            ((ArrayDeque)object).size();
            Objects.toString(componentName);
            ((ArrayDeque)object).clear();
            return;
        }
        int n10 = (1 << n7) * 1000;
        Log.isLoggable((String)"NotifManCompat", (int)n4);
        Message message = handler.obtainMessage(n4, (Object)componentName);
        long l2 = n10;
        handler.sendMessageDelayed(message, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean handleMessage(Message object) {
        Object object2;
        Object object3;
        Object object4;
        int n3;
        int n4;
        Object object5;
        Object object6;
        Iterator<Object> iterator;
        int n7;
        ArrayDeque arrayDeque;
        int n8;
        Object object7;
        boolean bl2;
        block20: {
            int n10 = object.what;
            bl2 = false;
            object7 = null;
            n8 = 1;
            arrayDeque = null;
            n7 = 3;
            if (n10 != 0) {
                if (n10 == n8) {
                    object = (s52$c)object.obj;
                    Object object8 = object.a;
                    object = object.b;
                    object7 = this.c;
                    if ((object8 = (s52$d$a)((HashMap)object7).get(object8)) == null) return n8 != 0;
                    object = INotificationSideChannel$Stub.asInterface((IBinder)object);
                    object8.c = object;
                    object8.e = 0;
                    this.a((s52$d$a)object8);
                    return n8 != 0;
                }
                int n14 = 2;
                if (n10 != n14) {
                    if (n10 != n7) {
                        return false;
                    }
                    object = (ComponentName)object.obj;
                    HashMap hashMap = this.c;
                    if ((object = (s52$d$a)hashMap.get(object)) == null) return n8 != 0;
                    this.a((s52$d$a)object);
                    return n8 != 0;
                }
                object = (ComponentName)object.obj;
                HashMap hashMap = this.c;
                if ((object = (s52$d$a)hashMap.get(object)) == null) return n8 != 0;
                n10 = object.b;
                if (n10 != 0) {
                    hashMap = this.a;
                    hashMap.unbindService(this);
                    object.b = false;
                }
                object.c = null;
                return n8 != 0;
            }
            object = (s52$e)object.obj;
            iterator = Settings.Secure.getString((ContentResolver)this.a.getContentResolver(), (String)"enabled_notification_listeners");
            object6 = s52.c;
            // MONITORENTER : object6
            if (iterator != null) {
                object5 = s52.d;
                boolean bl3 = ((String)((Object)iterator)).equals(object5);
                if (bl3) break block20;
                object5 = ":";
                n4 = -1;
                object5 = ((String)((Object)iterator)).split((String)object5, n4);
                n3 = ((String[])object5).length;
                object4 = new HashSet(n3);
                n3 = ((Intent)object5).length;
                object3 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    object2 = object5[i3];
                    if ((object2 = ComponentName.unflattenFromString((String)object2)) == null) continue;
                    object2 = object2.getPackageName();
                    ((HashSet)object4).add(object2);
                }
                s52.e = object4;
                s52.d = iterator;
            }
        }
        iterator = s52.e;
        // MONITOREXIT : object6
        object6 = this.d;
        boolean bl4 = iterator.equals(object6);
        if (!bl4) {
            Object object9;
            this.d = iterator;
            object6 = this.a.getPackageManager();
            object5 = new Intent();
            object4 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
            object5 = object5.setAction((String)object4);
            object6 = object6.queryIntentServices((Intent)object5, 0);
            object5 = new HashSet();
            object6 = object6.iterator();
            while ((n4 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                object4 = (ResolveInfo)object6.next();
                object9 = ((ResolveInfo)object4).serviceInfo.packageName;
                n3 = (int)(((HashSet)((Object)iterator)).contains(object9) ? 1 : 0);
                if (n3 == 0) continue;
                object3 = ((ResolveInfo)object4).serviceInfo;
                object2 = object3.packageName;
                object3 = object3.name;
                object9 = new ComponentName((String)object2, (String)object3);
                object4 = ((ResolveInfo)object4).serviceInfo.permission;
                if (object4 != null) {
                    object9.toString();
                    continue;
                }
                ((HashSet)object5).add(object9);
            }
            iterator = ((HashSet)object5).iterator();
            while (bl4 = iterator.hasNext()) {
                object4 = this.c;
                object6 = (ComponentName)iterator.next();
                n4 = (int)(((HashMap)object4).containsKey(object6) ? 1 : 0);
                if (n4 != 0) continue;
                object4 = "NotifManCompat";
                n4 = (int)(Log.isLoggable((String)object4, (int)n7) ? 1 : 0);
                if (n4 != 0) {
                    Objects.toString(object6);
                }
                object4 = this.c;
                object9 = new s52$d$a((ComponentName)object6);
                ((HashMap)object4).put(object6, object9);
            }
            iterator = this.c.entrySet().iterator();
            while (bl4 = iterator.hasNext()) {
                object6 = (Map.Entry)iterator.next();
                object4 = object6.getKey();
                n4 = (int)(((HashSet)object5).contains(object4) ? 1 : 0);
                if (n4 != 0) continue;
                object4 = "NotifManCompat";
                n4 = (int)(Log.isLoggable((String)object4, (int)n7) ? 1 : 0);
                if (n4 != 0) {
                    object4 = object6.getKey();
                    Objects.toString(object4);
                }
                object6 = (s52$d$a)object6.getValue();
                n4 = (int)(((s52$d$a)object6).b ? 1 : 0);
                if (n4 != 0) {
                    object4 = this.a;
                    object4.unbindService((ServiceConnection)this);
                    ((s52$d$a)object6).b = false;
                }
                ((s52$d$a)object6).c = null;
                iterator.remove();
            }
        }
        iterator = this.c.values().iterator();
        while (bl2 = iterator.hasNext()) {
            object7 = (s52$d$a)iterator.next();
            arrayDeque = ((s52$d$a)object7).d;
            arrayDeque.add(object);
            this.a((s52$d$a)object7);
        }
        return n8 != 0;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String string2 = "NotifManCompat";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            Objects.toString(componentName);
        }
        string2 = this.b;
        s52$c s52$c = new s52$c(componentName, iBinder);
        string2.obtainMessage(1, (Object)s52$c).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String string2 = "NotifManCompat";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, (Object)componentName).sendToTarget();
    }
}

