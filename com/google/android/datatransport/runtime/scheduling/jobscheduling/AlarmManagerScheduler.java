/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build$VERSION
 *  android.util.Base64
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;

public class AlarmManagerScheduler
implements WorkScheduler {
    static final String ATTEMPT_NUMBER = "attemptNumber";
    static final String BACKEND_NAME = "backendName";
    static final String EVENT_PRIORITY = "priority";
    static final String EXTRAS = "extras";
    private static final String LOG_TAG = "AlarmManagerScheduler";
    private AlarmManager alarmManager;
    private final Clock clock;
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    public AlarmManagerScheduler(Context context, EventStore eventStore, AlarmManager alarmManager, Clock clock, SchedulerConfig schedulerConfig) {
        this.context = context;
        this.eventStore = eventStore;
        this.alarmManager = alarmManager;
        this.clock = clock;
        this.config = schedulerConfig;
    }

    public AlarmManagerScheduler(Context context, EventStore eventStore, Clock clock, SchedulerConfig schedulerConfig) {
        Object object;
        Object object2 = object = context.getSystemService("alarm");
        object2 = (AlarmManager)object;
        this(context, eventStore, (AlarmManager)object2, clock, schedulerConfig);
    }

    public boolean isJobServiceOn(Intent intent) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        n3 = n3 >= n4 ? 0x24000000 : 0x20000000;
        Context context = this.context;
        boolean bl2 = false;
        if ((intent = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)n3)) != null) {
            bl2 = true;
        }
        return bl2;
    }

    public void schedule(TransportContext transportContext, int n3) {
        this.schedule(transportContext, n3, false);
    }

    public void schedule(TransportContext transportContext, int n3, boolean n4) {
        Object object;
        int n7 = 3;
        Object object2 = new Uri.Builder();
        Object object3 = transportContext.getBackendName();
        object2.appendQueryParameter(BACKEND_NAME, (String)object3);
        int n8 = PriorityMapping.toInt(transportContext.getPriority());
        object3 = String.valueOf(n8);
        object2.appendQueryParameter(EVENT_PRIORITY, (String)object3);
        object3 = transportContext.getExtras();
        if (object3 != null) {
            object3 = Base64.encodeToString((byte[])transportContext.getExtras(), (int)0);
            object = EXTRAS;
            object2.appendQueryParameter((String)object, (String)object3);
        }
        object = this.context;
        Object[] objectArray = AlarmManagerSchedulerBroadcastReceiver.class;
        object3 = new Intent(object, objectArray);
        object2 = object2.build();
        object3.setData((Uri)object2);
        object3.putExtra(ATTEMPT_NUMBER, n3);
        object2 = LOG_TAG;
        if (n4 == 0 && (n4 = this.isJobServiceOn((Intent)object3)) != 0) {
            Logging.d((String)object2, "Upload for context %s is already scheduled. Returning...", (Object)transportContext);
            return;
        }
        long l2 = this.eventStore.getNextCallTime(transportContext);
        Object object4 = this.config;
        Priority priority = transportContext.getPriority();
        long l3 = ((SchedulerConfig)object4).getScheduleDelay(priority, l2, n3);
        object4 = l3;
        object = l2;
        Integer n10 = n3;
        int n14 = 4;
        objectArray = new Object[n14];
        objectArray[0] = transportContext;
        objectArray[1] = object4;
        int n15 = 2;
        objectArray[n15] = object;
        objectArray[n7] = n10;
        Logging.d((String)object2, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", objectArray);
        transportContext = this.context;
        n3 = Build.VERSION.SDK_INT;
        n4 = 23;
        if (n3 >= n4) {
            n3 = 0x4000000;
        } else {
            n3 = 0;
            n10 = null;
        }
        transportContext = PendingIntent.getBroadcast((Context)transportContext, (int)0, (Intent)object3, (int)n3);
        n10 = this.alarmManager;
        long l4 = this.clock.getTime() + l3;
        n10.set(n7, l4, (PendingIntent)transportContext);
    }
}

