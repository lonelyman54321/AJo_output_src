/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
package in.juspay.hypersdk.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.lifecycle.HyperActivityLaunchDelegate$IntentQueueData;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

public final class HyperActivityLaunchDelegate
implements ActivityLaunchDelegate {
    private final JuspayServices juspayServices;
    private final Queue startActivityQueue;

    public HyperActivityLaunchDelegate(JuspayServices concurrentLinkedQueue) {
        Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "juspayServices");
        this.juspayServices = concurrentLinkedQueue;
        this.startActivityQueue = concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }

    public final void clearQueue() {
        this.startActivityQueue.clear();
    }

    public final void fragmentAttached() {
        boolean bl2;
        Iterator iterator = this.startActivityQueue.iterator();
        while (bl2 = iterator.hasNext()) {
            HyperActivityLaunchDelegate$IntentQueueData hyperActivityLaunchDelegate$IntentQueueData = (HyperActivityLaunchDelegate$IntentQueueData)iterator.next();
            Intent intent = hyperActivityLaunchDelegate$IntentQueueData.getIntent();
            int n3 = hyperActivityLaunchDelegate$IntentQueueData.getRequestCode();
            hyperActivityLaunchDelegate$IntentQueueData = hyperActivityLaunchDelegate$IntentQueueData.getBundle();
            this.startActivityForResult(intent, n3, (Bundle)hyperActivityLaunchDelegate$IntentQueueData);
        }
    }

    public void startActivityForResult(Intent intent, int n3, Bundle bundle) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Object object = this.juspayServices.getFragment();
        if (object != null && (bl2 = ((Fragment)object).isAdded())) {
            ((Fragment)object).startActivityForResult(intent, n3, bundle);
        } else {
            object = this.startActivityQueue;
            HyperActivityLaunchDelegate$IntentQueueData hyperActivityLaunchDelegate$IntentQueueData = new HyperActivityLaunchDelegate$IntentQueueData(intent, n3, bundle);
            object.add(hyperActivityLaunchDelegate$IntentQueueData);
        }
    }
}

