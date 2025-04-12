/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.lifecycle;

import androidx.fragment.app.Fragment;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.lifecycle.HyperRequestPermissionDelegate$RequestQueueData;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

public final class HyperRequestPermissionDelegate
implements RequestPermissionDelegate {
    private final JuspayServices juspayServices;
    private final Queue requestQueue;

    public HyperRequestPermissionDelegate(JuspayServices concurrentLinkedQueue) {
        Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "juspayServices");
        this.juspayServices = concurrentLinkedQueue;
        this.requestQueue = concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }

    public final void clearQueue() {
        this.requestQueue.clear();
    }

    public final void fragmentAttached() {
        int n3;
        Iterator iterator = this.requestQueue.iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            HyperRequestPermissionDelegate$RequestQueueData hyperRequestPermissionDelegate$RequestQueueData = (HyperRequestPermissionDelegate$RequestQueueData)iterator.next();
            String[] stringArray = hyperRequestPermissionDelegate$RequestQueueData.getRequests();
            n3 = hyperRequestPermissionDelegate$RequestQueueData.getRequestCode();
            this.requestPermission(stringArray, n3);
        }
    }

    public void requestPermission(String[] stringArray, int n3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(stringArray, "permissions");
        Object object = this.juspayServices.getFragment();
        if (object != null && (bl2 = ((Fragment)object).isAdded())) {
            ((Fragment)object).requestPermissions(stringArray, n3);
        } else {
            object = this.requestQueue;
            HyperRequestPermissionDelegate$RequestQueueData hyperRequestPermissionDelegate$RequestQueueData = new HyperRequestPermissionDelegate$RequestQueueData(stringArray, n3);
            object.add(hyperRequestPermissionDelegate$RequestQueueData);
        }
    }
}

