/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementReader;
import java.io.InputStream;

class QueueFile$1
implements QueueFile$ElementReader {
    boolean first = true;
    final /* synthetic */ QueueFile this$0;
    final /* synthetic */ StringBuilder val$builder;

    public QueueFile$1(QueueFile queueFile, StringBuilder stringBuilder) {
        this.this$0 = queueFile;
        this.val$builder = stringBuilder;
    }

    public void read(InputStream object, int n3) {
        boolean bl2 = this.first;
        if (bl2) {
            bl2 = false;
            object = null;
            this.first = false;
        } else {
            object = this.val$builder;
            String string2 = ", ";
            ((StringBuilder)object).append(string2);
        }
        this.val$builder.append(n3);
    }
}

