/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 */
package com.ril.ajio.launch;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c$a;
import com.ril.ajio.launch.DynamicIconChangeWorker$a;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class DynamicIconChangeWorker
extends Worker {
    public static final DynamicIconChangeWorker$a Companion;
    public static boolean b;

    static {
        DynamicIconChangeWorker$a dynamicIconChangeWorker$a;
        Companion = dynamicIconChangeWorker$a = new Object();
    }

    public DynamicIconChangeWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        super(context, workerParameters);
    }

    public final c$a doWork() {
        Iterator iterator;
        block54: {
            Object object;
            Context context;
            Object object2;
            int n3;
            int n4;
            block52: {
                String string2;
                Object object3;
                Object object4;
                Object object5;
                block53: {
                    block51: {
                        iterator = null;
                        n4 = 1;
                        n3 = 2;
                        object2 = this.getInputData().c("icon_type");
                        object5 = "Main";
                        if (object2 == null) {
                            object2 = object5;
                        }
                        context = this.getApplicationContext();
                        context = context.getPackageManager();
                        object4 = "Dynamic2";
                        boolean bl2 = Intrinsics.areEqual(object2, object4);
                        object3 = "com.ril.ajio.launch.activity.DynamicIconActivity2";
                        string2 = "com.ril.ajio.launch.activity.SplashScreenActivity";
                        if (!bl2) break block51;
                        object5 = this.getApplicationContext();
                        object2 = new ComponentName((Context)object5, string2);
                        object5 = n3;
                        object4 = new Pair(object2, object5);
                        object5 = this.getApplicationContext();
                        object2 = new ComponentName((Context)object5, (String)object3);
                        object5 = n4;
                        object3 = new Pair(object2, object5);
                        object = new Pair[n3];
                        object[0] = object4;
                        object[n4] = object3;
                        iterator = xx_2.i((Object[])object);
                        break block52;
                    }
                    boolean bl3 = Intrinsics.areEqual(object2, object5);
                    if (!bl3) break block53;
                    object5 = this.getApplicationContext();
                    object2 = new ComponentName((Context)object5, (String)object3);
                    object5 = n3;
                    object4 = new Pair(object2, object5);
                    object5 = this.getApplicationContext();
                    object2 = new ComponentName((Context)object5, string2);
                    object5 = n4;
                    object3 = new Pair(object2, object5);
                    object = new Pair[n3];
                    object[0] = object4;
                    object[n4] = object3;
                    iterator = xx_2.i((Object[])object);
                    break block52;
                }
                object5 = this.getApplicationContext();
                object2 = new ComponentName((Context)object5, (String)object3);
                object5 = n3;
                object4 = new Pair(object2, object5);
                object5 = this.getApplicationContext();
                object2 = new ComponentName((Context)object5, string2);
                object5 = n4;
                object3 = new Pair(object2, object5);
                object = new Pair[n3];
                object[0] = object4;
                object[n4] = object3;
                iterator = xx_2.i((Object[])object);
            }
            iterator = (Iterable)((Object)iterator);
            try {
                iterator = iterator.iterator();
            }
            catch (Exception exception) {}
            while (true) {
                n3 = (int)(iterator.hasNext() ? 1 : 0);
                if (n3 == 0) break block54;
                break;
            }
            {
                object = iterator.next();
                object = (Pair)object;
                object2 = ((Pair)object).a;
                object2 = (ComponentName)object2;
                object = ((Pair)object).b;
                object = (Number)object;
                n3 = ((Number)object).intValue();
                context.setComponentEnabledSetting((ComponentName)object2, n3, n4);
                continue;
            }
        }
        iterator = new Iterator();
        Intrinsics.checkNotNullExpressionValue(iterator, "success(...)");
        return iterator;
    }
}

