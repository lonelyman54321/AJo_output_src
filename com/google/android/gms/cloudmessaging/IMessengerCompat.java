/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.Message
 */
package com.google.android.gms.cloudmessaging;

import android.os.IInterface;
import android.os.Message;

interface IMessengerCompat
extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    public void send(Message var1);
}

