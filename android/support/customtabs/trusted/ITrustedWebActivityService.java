/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 */
package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface ITrustedWebActivityService
extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    public Bundle areNotificationsEnabled(Bundle var1);

    public void cancelNotification(Bundle var1);

    public Bundle extraCommand(String var1, Bundle var2, IBinder var3);

    public Bundle getActiveNotifications();

    public Bundle getSmallIconBitmap();

    public int getSmallIconId();

    public Bundle notifyNotificationWithChannel(Bundle var1);
}

