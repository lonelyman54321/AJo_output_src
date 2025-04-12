/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

class CLSUUID {
    private static final String ID_SHA;
    private static final AtomicLong sequenceNumber;
    private final String sessionId;

    static {
        Serializable serializable = new StringBuilder();
        String string2 = UUID.randomUUID().toString();
        serializable.append(string2);
        long l2 = System.currentTimeMillis();
        serializable.append(l2);
        ID_SHA = CommonUtils.sha1(serializable.toString());
        serializable = new AtomicLong(0L);
        sequenceNumber = serializable;
    }

    public CLSUUID() {
        Object object = new byte[10];
        this.populateTime((byte[])object);
        this.populateSequenceNumber((byte[])object);
        this.populatePID((byte[])object);
        object = CommonUtils.hexify((byte[])object);
        Locale locale = Locale.US;
        int n3 = 12;
        String string2 = ((String)object).substring(0, n3);
        int n4 = 16;
        String string3 = ((String)object).substring(n3, n4);
        object = ((String)object).subSequence(n4, 20);
        String string4 = ID_SHA.substring(0, n3);
        Object[] objectArray = new Object[]{string2, string3, object, string4};
        this.sessionId = object = String.format(locale, "%s%s%s%s", objectArray).toUpperCase(locale);
    }

    private static byte[] convertLongToFourByteBuffer(long l2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        int n3 = (int)l2;
        byteBuffer.putInt(n3);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.order(byteOrder);
        byteBuffer.position(0);
        return byteBuffer.array();
    }

    private static byte[] convertLongToTwoByteBuffer(long l2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        short s7 = (short)l2;
        byteBuffer.putShort(s7);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.order(byteOrder);
        byteBuffer.position(0);
        return byteBuffer.array();
    }

    private void populatePID(byte[] byArray) {
        byte by2;
        byte by4;
        byte[] byArray2 = CLSUUID.convertLongToTwoByteBuffer(Integer.valueOf(Process.myPid()).shortValue());
        byArray[8] = by4 = byArray2[0];
        byArray[9] = by2 = byArray2[1];
    }

    private void populateSequenceNumber(byte[] byArray) {
        byte by2;
        byte by4;
        byte[] byArray2 = CLSUUID.convertLongToTwoByteBuffer(sequenceNumber.incrementAndGet());
        byArray[6] = by4 = byArray2[0];
        byArray[7] = by2 = byArray2[1];
    }

    private void populateTime(byte[] byArray) {
        byte by2;
        byte by4;
        int n3;
        byte by5;
        Object object = new Date();
        long l2 = ((Date)object).getTime();
        long l3 = 1000L;
        long l4 = l2 / l3;
        l2 %= l3;
        byte[] byArray2 = CLSUUID.convertLongToFourByteBuffer(l4);
        byArray[0] = by5 = byArray2[0];
        by5 = 1;
        byArray[by5] = n3 = byArray2[by5];
        n3 = 2;
        byArray[n3] = by4 = byArray2[n3];
        n3 = 3;
        byArray[n3] = by2 = byArray2[n3];
        object = CLSUUID.convertLongToTwoByteBuffer(l2);
        Object object2 = object[0];
        byArray[4] = (byte)object2;
        Object object3 = object[by5];
        byArray[5] = (byte)object3;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String toString() {
        return this.sessionId;
    }
}

