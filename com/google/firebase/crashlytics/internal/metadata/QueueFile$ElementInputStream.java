/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import com.google.firebase.crashlytics.internal.metadata.QueueFile$1;
import com.google.firebase.crashlytics.internal.metadata.QueueFile$Element;
import java.io.InputStream;
import java.io.RandomAccessFile;

final class QueueFile$ElementInputStream
extends InputStream {
    private int position;
    private int remaining;
    final /* synthetic */ QueueFile this$0;

    private QueueFile$ElementInputStream(QueueFile queueFile, QueueFile$Element queueFile$Element) {
        int n3;
        this.this$0 = queueFile;
        int n4 = queueFile$Element.position + 4;
        this.position = n3 = QueueFile.access$100(queueFile, n4);
        this.remaining = n3 = queueFile$Element.length;
    }

    public /* synthetic */ QueueFile$ElementInputStream(QueueFile queueFile, QueueFile$Element queueFile$Element, QueueFile.1 var3_3) {
        this(queueFile, queueFile$Element);
    }

    public int read() {
        int n3;
        int n4 = this.remaining;
        if (n4 == 0) {
            return -1;
        }
        RandomAccessFile randomAccessFile = QueueFile.access$400(this.this$0);
        long l2 = this.position;
        randomAccessFile.seek(l2);
        n4 = QueueFile.access$400(this.this$0).read();
        QueueFile queueFile = this.this$0;
        int n7 = this.position + 1;
        this.position = n3 = QueueFile.access$100(queueFile, n7);
        this.remaining = n3 = this.remaining + -1;
        return n4;
    }

    public int read(byte[] object, int n3, int n4) {
        Object object2 = "buffer";
        QueueFile.access$200(object, (String)object2);
        int n7 = n3 | n4;
        if (n7 >= 0 && n4 <= (n7 = ((byte[])object).length - n3)) {
            n7 = this.remaining;
            if (n7 > 0) {
                int n8;
                if (n4 > n7) {
                    n4 = n7;
                }
                object2 = this.this$0;
                int n10 = this.position;
                QueueFile.access$300((QueueFile)object2, n10, object, n3, n4);
                object = this.this$0;
                n3 = this.position + n4;
                this.position = n8 = QueueFile.access$100((QueueFile)object, n3);
                this.remaining = n8 = this.remaining - n4;
                return n4;
            }
            return -1;
        }
        object = new ArrayIndexOutOfBoundsException;
        object();
        throw object;
    }
}

