/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.SystemForegroundDispatcher$1;
import androidx.work.impl.foreground.a;
import androidx.work.impl.foreground.a$a;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public class SystemForegroundService
extends LifecycleService
implements a$a {
    public static final /* synthetic */ int e;
    public boolean b;
    public a c;
    public NotificationManager d;

    static {
        qx1.b("SystemFgService");
    }

    public final void a() {
        Object object = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        this.d = object;
        Object object2 = this.getApplicationContext();
        object = new a((Context)object2);
        this.c = object;
        object2 = ((a)object).i;
        if (object2 != null) {
            object = qx1.a();
            object.getClass();
        } else {
            ((a)object).i = this;
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.a();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c.e();
    }

    public final int onStartCommand(Intent object, int n3, int n4) {
        Object object2;
        super.onStartCommand((Intent)object, n3, n4);
        n3 = (int)(this.b ? 1 : 0);
        if (n3 != 0) {
            qx1.a().getClass();
            this.c.e();
            this.a();
            n3 = 0;
            object2 = null;
            this.b = false;
        }
        if (object != null) {
            object2 = this.c;
            object2.getClass();
            Object object3 = object.getAction();
            Object object4 = "ACTION_START_FOREGROUND";
            boolean n7 = ((String)object4).equals(object3);
            Object object5 = "KEY_WORKSPEC_ID";
            if (n7) {
                object3 = qx1.a();
                Objects.toString(object);
                object3.getClass();
                object3 = object.getStringExtra((String)object5);
                object4 = new SystemForegroundDispatcher$1((a)object2, (String)object3);
                object3 = ((a)object2).b;
                object3.d((Runnable)object4);
                ((a)object2).c((Intent)object);
            } else {
                object4 = "ACTION_NOTIFY";
                boolean bl2 = ((String)object4).equals(object3);
                if (bl2) {
                    ((a)object2).c((Intent)object);
                } else {
                    object4 = "ACTION_CANCEL_WORK";
                    boolean bl3 = ((String)object4).equals(object3);
                    if (bl3) {
                        object3 = qx1.a();
                        Objects.toString(object);
                        object3.getClass();
                        object = object.getStringExtra((String)object5);
                        if (object != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) == 0) {
                            object = UUID.fromString((String)object);
                            object2 = ((a)object2).a;
                            object2.getClass();
                            Intrinsics.checkNotNullParameter(object, "id");
                            Intrinsics.checkNotNullParameter(object2, "workManagerImpl");
                            object3 = ((ni3_1)object2).b.m;
                            object4 = ((ni3_1)object2).d.c();
                            Intrinsics.checkNotNullExpressionValue(object4, "workManagerImpl.workTask\u2026ecutor.serialTaskExecutor");
                            object5 = new vk_0((ni3_1)object2, (UUID)object);
                            object = "CancelWorkById";
                            O92.a((S40)object3, (String)object, (VZ2)object4, (Function0)object5);
                        }
                    } else {
                        object = "ACTION_STOP_FOREGROUND";
                        boolean bl4 = ((String)object).equals(object3);
                        if (bl4) {
                            qx1.a().getClass();
                            object = ((a)object2).i;
                            if (object != null) {
                                object = (SystemForegroundService)object;
                                n3 = 1;
                                ((SystemForegroundService)object).b = n3;
                                object3 = qx1.a();
                                object3.getClass();
                                n4 = Build.VERSION.SDK_INT;
                                int n8 = 26;
                                if (n4 >= n8) {
                                    object.stopForeground(n3 != 0);
                                }
                                object.stopSelf();
                            }
                        }
                    }
                }
            }
        }
        return 3;
    }

    public final void onTimeout(int n3) {
        n3 = Build.VERSION.SDK_INT;
        int n4 = 35;
        if (n3 >= n4) {
            return;
        }
        this.c.f(2048);
    }

    public final void onTimeout(int n3, int n4) {
        this.c.f(n4);
    }
}

