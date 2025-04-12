/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 */
package android.support.customtabs;

import android.os.Bundle;
import android.os.IInterface;

public interface IEngagementSignalsCallback
extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    public void onGreatestScrollPercentageIncreased(int var1, Bundle var2);

    public void onSessionEnded(boolean var1, Bundle var2);

    public void onVerticalScrollEvent(boolean var1, Bundle var2);
}

