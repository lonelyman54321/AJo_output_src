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
package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.sessions.ProcessDetails;
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

    private final ProcessDetails buildProcessDetails(String string2, int n3, int n4, boolean bl2) {
        ProcessDetails processDetails = new ProcessDetails(string2, n3, n4, bl2);
        return processDetails;
    }

    public static /* synthetic */ ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String string2, int n3, int n4, boolean bl2, int n7, Object object) {
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

    public final List getAppProcessDetails(Context object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "context");
        Object object3 = object.getApplicationInfo();
        int n3 = ((ApplicationInfo)object3).uid;
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
            int n4 = ((ActivityManager.RunningAppProcessInfo)object2).uid;
            if (n4 != n3) continue;
            object4.add(object5);
        }
        n3 = yx_2.o(object4, 10);
        object = new ArrayList(n3);
        object3 = object4.iterator();
        while (bl2 = object3.hasNext()) {
            object4 = (ActivityManager.RunningAppProcessInfo)object3.next();
            object2 = object4.processName;
            String string3 = "runningAppProcessInfo.processName";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            int n7 = object4.pid;
            int n8 = object4.importance;
            object4 = object4.processName;
            bl2 = Intrinsics.areEqual(object4, string2);
            object5 = new ProcessDetails((String)object2, n7, n8, bl2);
            ((ArrayList)object).add(object5);
        }
        return object;
    }

    public final ProcessDetails getCurrentProcessDetails(Context object) {
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
                object2 = (ProcessDetails)object3;
                int n4 = ((ProcessDetails)object2).getPid();
                if (n4 != n3) continue;
                break block2;
            }
            bl2 = false;
            object3 = null;
        }
        object3 = (ProcessDetails)object3;
        if (object3 == null) {
            String string2 = this.getProcessName$com_google_firebase_firebase_sessions();
            int n7 = 12;
            object2 = this;
            object3 = ProcessDetailsProvider.buildProcessDetails$default(this, string2, n3, 0, false, n7, null);
        }
        return object3;
    }

    public final String getProcessName$com_google_firebase_firebase_sessions() {
        String string2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            String string3 = dz2_0.a();
            Intrinsics.checkNotNullExpressionValue(string3, "myProcessName()");
            return string3;
        }
        n4 = 28;
        if (n3 >= n4 && (string2 = hy_2.a()) != null) {
            return string2;
        }
        string2 = ProcessUtils.getMyProcessName();
        if (string2 != null) {
            return string2;
        }
        return "";
    }
}

