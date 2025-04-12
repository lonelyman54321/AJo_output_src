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

public interface IResultReceiver2
extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    public void send(int var1, Bundle var2);
}

