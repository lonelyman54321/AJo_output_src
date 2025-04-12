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
import kotlin.jvm.internal.Intrinsics;

final class HyperActivityLaunchDelegate$IntentQueueData {
    private final Bundle bundle;
    private final Intent intent;
    private final int requestCode;

    public HyperActivityLaunchDelegate$IntentQueueData(Intent intent, int n3, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.requestCode = n3;
        this.bundle = bundle;
    }

    public static /* synthetic */ HyperActivityLaunchDelegate$IntentQueueData copy$default(HyperActivityLaunchDelegate$IntentQueueData hyperActivityLaunchDelegate$IntentQueueData, Intent intent, int n3, Bundle bundle, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            intent = hyperActivityLaunchDelegate$IntentQueueData.intent;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = hyperActivityLaunchDelegate$IntentQueueData.requestCode;
        }
        if ((n4 &= 4) != 0) {
            bundle = hyperActivityLaunchDelegate$IntentQueueData.bundle;
        }
        return hyperActivityLaunchDelegate$IntentQueueData.copy(intent, n3, bundle);
    }

    public final Intent component1() {
        return this.intent;
    }

    public final int component2() {
        return this.requestCode;
    }

    public final Bundle component3() {
        return this.bundle;
    }

    public final HyperActivityLaunchDelegate$IntentQueueData copy(Intent intent, int n3, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        HyperActivityLaunchDelegate$IntentQueueData hyperActivityLaunchDelegate$IntentQueueData = new HyperActivityLaunchDelegate$IntentQueueData(intent, n3, bundle);
        return hyperActivityLaunchDelegate$IntentQueueData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof HyperActivityLaunchDelegate$IntentQueueData;
        if (n3 == 0) {
            return false;
        }
        object = (HyperActivityLaunchDelegate$IntentQueueData)object;
        Intent intent = this.intent;
        Intent intent2 = ((HyperActivityLaunchDelegate$IntentQueueData)object).intent;
        n3 = Intrinsics.areEqual(intent, intent2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.requestCode;
        int n4 = ((HyperActivityLaunchDelegate$IntentQueueData)object).requestCode;
        if (n3 != n4) {
            return false;
        }
        intent = this.bundle;
        object = ((HyperActivityLaunchDelegate$IntentQueueData)object).bundle;
        boolean bl3 = Intrinsics.areEqual(intent, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public int hashCode() {
        Intent intent = this.intent;
        int n3 = intent.hashCode() * 31;
        int n4 = this.requestCode;
        n3 = (n3 + n4) * 31;
        Bundle bundle = this.bundle;
        if (bundle == null) {
            n4 = 0;
            bundle = null;
        } else {
            n4 = bundle.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IntentQueueData(intent=");
        Intent intent = this.intent;
        stringBuilder.append(intent);
        stringBuilder.append(", requestCode=");
        int n3 = this.requestCode;
        stringBuilder.append(n3);
        stringBuilder.append(", bundle=");
        intent = this.bundle;
        stringBuilder.append(intent);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

