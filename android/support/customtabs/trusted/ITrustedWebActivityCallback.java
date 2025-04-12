/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 */
package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IInterface;

public interface ITrustedWebActivityCallback
extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    public void onExtraCallback(String var1, Bundle var2);
}

