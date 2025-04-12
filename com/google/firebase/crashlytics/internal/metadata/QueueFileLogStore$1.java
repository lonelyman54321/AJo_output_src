/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementReader;
import com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore;
import java.io.InputStream;

class QueueFileLogStore$1
implements QueueFile$ElementReader {
    final /* synthetic */ QueueFileLogStore this$0;
    final /* synthetic */ byte[] val$logBytes;
    final /* synthetic */ int[] val$offsetHolder;

    public QueueFileLogStore$1(QueueFileLogStore queueFileLogStore, byte[] byArray, int[] nArray) {
        this.this$0 = queueFileLogStore;
        this.val$logBytes = byArray;
        this.val$offsetHolder = nArray;
    }

    public void read(InputStream inputStream, int n3) {
        try {
            Object[] objectArray = this.val$logBytes;
            int[] nArray = this.val$offsetHolder;
            int n4 = nArray[0];
            inputStream.read((byte[])objectArray, n4, n3);
            objectArray = this.val$offsetHolder;
            objectArray[0] = n4 = objectArray[0] + n3;
            return;
        }
        finally {
            inputStream.close();
        }
    }
}

