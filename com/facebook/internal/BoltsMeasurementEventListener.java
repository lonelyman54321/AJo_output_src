/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.g;
import com.facebook.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class BoltsMeasurementEventListener
extends BroadcastReceiver {
    public static BoltsMeasurementEventListener b;
    public final Context a;

    public BoltsMeasurementEventListener(Context context) {
        context = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "context.applicationContext");
        this.a = context;
    }

    public static final /* synthetic */ BoltsMeasurementEventListener a() {
        Class<BoltsMeasurementEventListener> clazz = BoltsMeasurementEventListener.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        try {
            return b;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void finalize() {
        Object object;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        bl2 = td0.b((Object)this);
        if (bl2) return;
        try {
            object = this.a;
        }
        catch (Throwable throwable) {
            try {
                td0.a((Object)this, throwable);
                return;
            }
            catch (Throwable throwable2) {
                td0.a((Object)this, throwable2);
                return;
            }
        }
        object = Xv1.a((Context)object);
        String string2 = "getInstance(applicationContext)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        ((Xv1)object).d(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceive(Context object, Intent object2) {
        Throwable throwable2;
        block11: {
            boolean bl2;
            g g3;
            Object object3;
            String string2;
            String string3;
            block10: {
                block9: {
                    string3 = "";
                    string2 = "bf_";
                    boolean bl3 = td0.b((Object)this);
                    if (bl3) {
                        return;
                    }
                    try {
                        object3 = null;
                        g3 = new g((Context)object, null);
                        object = "loggerImpl";
                        Intrinsics.checkNotNullParameter(g3, (String)object);
                        object = new StringBuilder(string2);
                        if (object2 == null) break block9;
                        string2 = "event_name";
                        string2 = object2.getStringExtra(string2);
                        break block10;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                string2 = null;
            }
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            if (object2 != null) {
                string2 = "event_args";
                object2 = object2.getBundleExtra(string2);
            } else {
                bl2 = false;
                object2 = null;
            }
            string2 = new Bundle();
            if (object2 != null) {
                object3 = object2.keySet();
            }
            if (object3 != null) {
                boolean bl4;
                object3 = object3.iterator();
                while (bl4 = object3.hasNext()) {
                    Object object4 = object3.next();
                    object4 = (String)object4;
                    Object object5 = "key";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                    Object object6 = "[^0-9a-zA-Z _-]";
                    object5 = new Regex((String)object6);
                    object6 = "-";
                    object5 = ((Regex)object5).replace((CharSequence)object4, (String)object6);
                    String string4 = "^[ -]*";
                    object6 = new Regex(string4);
                    object5 = ((Regex)object6).replace((CharSequence)object5, string3);
                    string4 = "[ -]*$";
                    object6 = new Regex(string4);
                    object5 = ((Regex)object6).replace((CharSequence)object5, string3);
                    object4 = object2.get(object4);
                    object4 = (String)object4;
                    string2.putString((String)object5, object4);
                }
            }
            object2 = FacebookSdk.a;
            bl2 = j.c();
            if (bl2) {
                g3.e((String)object, (Bundle)string2);
            }
            return;
        }
        td0.a((Object)this, throwable2);
    }
}

