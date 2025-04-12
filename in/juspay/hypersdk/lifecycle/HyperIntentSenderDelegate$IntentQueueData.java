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
import kotlin.jvm.internal.Intrinsics;

final class HyperIntentSenderDelegate$IntentQueueData {
    private final int extraFlags;
    private final Intent fillInIntent;
    private final int flagMask;
    private final int flagValues;
    private final IntentSender intentSender;
    private final Bundle options;
    private final int requestCode;

    public HyperIntentSenderDelegate$IntentQueueData(IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.requestCode = n3;
        this.fillInIntent = intent;
        this.flagMask = n4;
        this.flagValues = n7;
        this.extraFlags = n8;
        this.options = bundle;
    }

    public static /* synthetic */ HyperIntentSenderDelegate$IntentQueueData copy$default(HyperIntentSenderDelegate$IntentQueueData hyperIntentSenderDelegate$IntentQueueData, IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle, int n10, Object object) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            intentSender = hyperIntentSenderDelegate$IntentQueueData.intentSender;
        }
        if ((n14 = n10 & 2) != 0) {
            n3 = hyperIntentSenderDelegate$IntentQueueData.requestCode;
        }
        n14 = n3;
        n3 = n10 & 4;
        if (n3 != 0) {
            intent = hyperIntentSenderDelegate$IntentQueueData.fillInIntent;
        }
        Intent intent2 = intent;
        n3 = n10 & 8;
        if (n3 != 0) {
            n4 = hyperIntentSenderDelegate$IntentQueueData.flagMask;
        }
        int n15 = n4;
        n3 = n10 & 0x10;
        if (n3 != 0) {
            n7 = hyperIntentSenderDelegate$IntentQueueData.flagValues;
        }
        int n16 = n7;
        n3 = n10 & 0x20;
        if (n3 != 0) {
            n8 = hyperIntentSenderDelegate$IntentQueueData.extraFlags;
        }
        int n17 = n8;
        n3 = n10 & 0x40;
        if (n3 != 0) {
            bundle = hyperIntentSenderDelegate$IntentQueueData.options;
        }
        intent = intentSender;
        n4 = n14;
        n8 = n15;
        n10 = n17;
        return hyperIntentSenderDelegate$IntentQueueData.copy(intentSender, n14, intent2, n15, n16, n17, bundle);
    }

    public final IntentSender component1() {
        return this.intentSender;
    }

    public final int component2() {
        return this.requestCode;
    }

    public final Intent component3() {
        return this.fillInIntent;
    }

    public final int component4() {
        return this.flagMask;
    }

    public final int component5() {
        return this.flagValues;
    }

    public final int component6() {
        return this.extraFlags;
    }

    public final Bundle component7() {
        return this.options;
    }

    public final HyperIntentSenderDelegate$IntentQueueData copy(IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        HyperIntentSenderDelegate$IntentQueueData hyperIntentSenderDelegate$IntentQueueData = new HyperIntentSenderDelegate$IntentQueueData(intentSender, n3, intent, n4, n7, n8, bundle);
        return hyperIntentSenderDelegate$IntentQueueData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof HyperIntentSenderDelegate$IntentQueueData;
        if (n3 == 0) {
            return false;
        }
        object = (HyperIntentSenderDelegate$IntentQueueData)object;
        IntentSender intentSender = this.intentSender;
        IntentSender intentSender2 = ((HyperIntentSenderDelegate$IntentQueueData)object).intentSender;
        n3 = Intrinsics.areEqual(intentSender, intentSender2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.requestCode;
        int n4 = ((HyperIntentSenderDelegate$IntentQueueData)object).requestCode;
        if (n3 != n4) {
            return false;
        }
        intentSender = this.fillInIntent;
        intentSender2 = ((HyperIntentSenderDelegate$IntentQueueData)object).fillInIntent;
        n3 = (int)(Intrinsics.areEqual(intentSender, intentSender2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.flagMask;
        n4 = ((HyperIntentSenderDelegate$IntentQueueData)object).flagMask;
        if (n3 != n4) {
            return false;
        }
        n3 = this.flagValues;
        n4 = ((HyperIntentSenderDelegate$IntentQueueData)object).flagValues;
        if (n3 != n4) {
            return false;
        }
        n3 = this.extraFlags;
        n4 = ((HyperIntentSenderDelegate$IntentQueueData)object).extraFlags;
        if (n3 != n4) {
            return false;
        }
        intentSender = this.options;
        object = ((HyperIntentSenderDelegate$IntentQueueData)object).options;
        boolean bl3 = Intrinsics.areEqual(intentSender, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int getExtraFlags() {
        return this.extraFlags;
    }

    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagMask() {
        return this.flagMask;
    }

    public final int getFlagValues() {
        return this.flagValues;
    }

    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    public final Bundle getOptions() {
        return this.options;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public int hashCode() {
        IntentSender intentSender = this.intentSender;
        int n3 = intentSender.hashCode() * 31;
        int n4 = this.requestCode;
        n3 = (n3 + n4) * 31;
        Intent intent = this.fillInIntent;
        int n7 = 0;
        if (intent == null) {
            n4 = 0;
            intent = null;
        } else {
            n4 = intent.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = this.flagMask;
        n3 = (n3 + n4) * 31;
        n4 = this.flagValues;
        n3 = (n3 + n4) * 31;
        n4 = this.extraFlags;
        n3 = (n3 + n4) * 31;
        intent = this.options;
        if (intent != null) {
            n7 = intent.hashCode();
        }
        return n3 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IntentQueueData(intentSender=");
        IntentSender intentSender = this.intentSender;
        stringBuilder.append(intentSender);
        stringBuilder.append(", requestCode=");
        int n3 = this.requestCode;
        stringBuilder.append(n3);
        stringBuilder.append(", fillInIntent=");
        intentSender = this.fillInIntent;
        stringBuilder.append(intentSender);
        stringBuilder.append(", flagMask=");
        n3 = this.flagMask;
        stringBuilder.append(n3);
        stringBuilder.append(", flagValues=");
        n3 = this.flagValues;
        stringBuilder.append(n3);
        stringBuilder.append(", extraFlags=");
        n3 = this.extraFlags;
        stringBuilder.append(n3);
        stringBuilder.append(", options=");
        intentSender = this.options;
        stringBuilder.append(intentSender);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

