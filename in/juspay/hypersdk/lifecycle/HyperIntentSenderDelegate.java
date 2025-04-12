/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Bundle
 */
package in.juspay.hypersdk.lifecycle;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.lifecycle.HyperIntentSenderDelegate$IntentQueueData;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

public final class HyperIntentSenderDelegate
implements IntentSenderDelegate {
    private final Queue intentSenderQueue;
    private final JuspayServices juspayServices;

    public HyperIntentSenderDelegate(JuspayServices concurrentLinkedQueue) {
        Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "juspayServices");
        this.juspayServices = concurrentLinkedQueue;
        this.intentSenderQueue = concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }

    public final void clearQueue() {
        this.intentSenderQueue.clear();
    }

    public final void fragmentAttached() {
        boolean bl2;
        Iterator iterator = this.intentSenderQueue.iterator();
        while (bl2 = iterator.hasNext()) {
            HyperIntentSenderDelegate$IntentQueueData hyperIntentSenderDelegate$IntentQueueData = (HyperIntentSenderDelegate$IntentQueueData)iterator.next();
            IntentSender intentSender = hyperIntentSenderDelegate$IntentQueueData.getIntentSender();
            int n3 = hyperIntentSenderDelegate$IntentQueueData.getRequestCode();
            Intent intent = hyperIntentSenderDelegate$IntentQueueData.getFillInIntent();
            int n4 = hyperIntentSenderDelegate$IntentQueueData.getFlagMask();
            int n7 = hyperIntentSenderDelegate$IntentQueueData.getFlagValues();
            int n8 = hyperIntentSenderDelegate$IntentQueueData.getExtraFlags();
            Bundle bundle = hyperIntentSenderDelegate$IntentQueueData.getOptions();
            this.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8, bundle);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startIntentSenderForResult(IntentSender object, int n3, Intent object2, int n4, int n7, int n8, Bundle bundle) {
        Exception exception2;
        Object object3;
        HyperIntentSenderDelegate hyperIntentSenderDelegate;
        block3: {
            HyperIntentSenderDelegate$IntentQueueData hyperIntentSenderDelegate$IntentQueueData;
            Object object4;
            hyperIntentSenderDelegate = this;
            Object object5 = "intentSender";
            object3 = object;
            Intrinsics.checkNotNullParameter(object, (String)object5);
            try {
                boolean bl2;
                object5 = this.juspayServices;
                object4 = ((JuspayServices)object5).getFragment();
                if (object4 != null && (bl2 = ((Fragment)object4).isAdded())) {
                    Intent intent = object2;
                    ((Fragment)object4).startIntentSenderForResult((IntentSender)object, n3, (Intent)object2, n4, n7, n8, bundle);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object5 = hyperIntentSenderDelegate.intentSenderQueue;
            object4 = hyperIntentSenderDelegate$IntentQueueData;
            object3 = object;
            Intent intent = object2;
            hyperIntentSenderDelegate$IntentQueueData = new HyperIntentSenderDelegate$IntentQueueData((IntentSender)object, n3, (Intent)object2, n4, n7, n8, bundle);
            object5.add(hyperIntentSenderDelegate$IntentQueueData);
            return;
        }
        SdkTracker sdkTracker = hyperIntentSenderDelegate.juspayServices.getSdkTracker();
        object3 = "start_intent_sender_for_result";
        String string2 = "Exception in startIntentSenderForResult";
        String string3 = "lifecycle";
        String string4 = "android";
        object = sdkTracker;
        object2 = string4;
        sdkTracker.trackException(string3, string4, (String)object3, string2, exception2);
    }
}

