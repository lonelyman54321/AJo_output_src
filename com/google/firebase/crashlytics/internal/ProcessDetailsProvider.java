/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.os.Build$VERSION
 *  android.os.Process
 */
package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE;

    static {
        ProcessDetailsProvider processDetailsProvider;
        INSTANCE = processDetailsProvider = new ProcessDetailsProvider();
    }

    private ProcessDetailsProvider() {
    }

    public static /* synthetic */ CrashlyticsReport$Session$Event$Application$ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String string2, int n3, int n4, boolean bl2, int n7, Object object) {
        int n8 = n7 & 2;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n8 = n7 & 4) != 0) {
            n4 = 0;
        }
        if ((n7 &= 8) != 0) {
            bl2 = false;
        }
        return processDetailsProvider.buildProcessDetails(string2, n3, n4, bl2);
    }

    private final String getProcessName() {
        String string2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            string2 = dz2_0.a();
            String string3 = "{\n      Process.myProcessName()\n    }";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        } else {
            n4 = 28;
            String string4 = "";
            if (n3 < n4 || (string2 = hy_2.a()) == null) {
                string2 = string4;
            }
        }
        return string2;
    }

    public final CrashlyticsReport$Session$Event$Application$ProcessDetails buildProcessDetails(String string2) {
        Intrinsics.checkNotNullParameter(string2, "processName");
        return ProcessDetailsProvider.buildProcessDetails$default(this, string2, 0, 0, false, 14, null);
    }

    public final CrashlyticsReport$Session$Event$Application$ProcessDetails buildProcessDetails(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "processName");
        return ProcessDetailsProvider.buildProcessDetails$default(this, string2, n3, 0, false, 12, null);
    }

    public final CrashlyticsReport$Session$Event$Application$ProcessDetails buildProcessDetails(String string2, int n3, int n4) {
        Intrinsics.checkNotNullParameter(string2, "processName");
        return ProcessDetailsProvider.buildProcessDetails$default(this, string2, n3, n4, false, 8, null);
    }

    public final CrashlyticsReport$Session$Event$Application$ProcessDetails buildProcessDetails(String object, int n3, int n4, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "processName");
        object = CrashlyticsReport$Session$Event$Application$ProcessDetails.builder().setProcessName((String)object).setPid(n3).setImportance(n4).setDefaultProcess(bl2).build();
        Intrinsics.checkNotNullExpressionValue(object, "builder()\n      .setProc\u2026ltProcess)\n      .build()");
        return object;
    }

    public final List getAppProcessDetails(Context object) {
        int n3;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "context");
        Object object3 = object.getApplicationInfo();
        int n4 = ((ApplicationInfo)object3).uid;
        String string2 = object.getApplicationInfo().processName;
        Object object4 = "activity";
        object = object.getSystemService((String)object4);
        boolean bl2 = object instanceof ActivityManager;
        boolean bl3 = false;
        Object object5 = null;
        object = bl2 ? (ActivityManager)object : null;
        if (object != null) {
            object5 = object.getRunningAppProcesses();
        }
        if (object5 == null) {
            object5 = mz0_2.a;
        }
        object5 = (Iterable)object5;
        object = CollectionsKt.J((Iterable)object5);
        object4 = new ArrayList();
        object = ((ArrayList)object).iterator();
        while (bl3 = object.hasNext()) {
            object2 = object5 = object.next();
            object2 = (ActivityManager.RunningAppProcessInfo)object5;
            n3 = ((ActivityManager.RunningAppProcessInfo)object2).uid;
            if (n3 != n4) continue;
            object4.add(object5);
        }
        n4 = yx_2.o(object4, 10);
        object = new ArrayList(n4);
        object3 = object4.iterator();
        while (bl2 = object3.hasNext()) {
            object4 = (ActivityManager.RunningAppProcessInfo)object3.next();
            object5 = CrashlyticsReport$Session$Event$Application$ProcessDetails.builder();
            object2 = object4.processName;
            object5 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder)object5).setProcessName((String)object2);
            n3 = object4.pid;
            object5 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder)object5).setPid(n3);
            n3 = object4.importance;
            object5 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder)object5).setImportance(n3);
            bl2 = Intrinsics.areEqual(object4.processName, string2);
            object4 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder)object5).setDefaultProcess(bl2).build();
            ((ArrayList)object).add(object4);
        }
        return object;
    }

    public final CrashlyticsReport$Session$Event$Application$ProcessDetails getCurrentProcessDetails(Context object) {
        Object object2;
        int n3;
        Object object3;
        block2: {
            boolean bl2;
            object3 = "context";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            n3 = Process.myPid();
            object = ((Iterable)this.getAppProcessDetails((Context)object)).iterator();
            while (bl2 = object.hasNext()) {
                object2 = object3 = object.next();
                object2 = (CrashlyticsReport$Session$Event$Application$ProcessDetails)object3;
                int n4 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails)object2).getPid();
                if (n4 != n3) continue;
                break block2;
            }
            bl2 = false;
            object3 = null;
        }
        object3 = (CrashlyticsReport$Session$Event$Application$ProcessDetails)object3;
        if (object3 == null) {
            String string2 = this.getProcessName();
            int n7 = 12;
            object2 = this;
            object3 = ProcessDetailsProvider.buildProcessDetails$default(this, string2, n3, 0, false, n7, null);
        }
        return object3;
    }
}

