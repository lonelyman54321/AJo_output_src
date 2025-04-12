/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 */
package android.support.v4.os;

import android.os.Bundle;
import android.os.IInterface;

public interface IResultReceiver
extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public void send(int var1, Bundle var2);
}

