/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

class QueueFile$Element {
    static final int HEADER_LENGTH = 4;
    static final QueueFile$Element NULL;
    final int length;
    final int position;

    static {
        QueueFile$Element queueFile$Element;
        NULL = queueFile$Element = new QueueFile$Element(0, 0);
    }

    public QueueFile$Element(int n3, int n4) {
        this.position = n3;
        this.length = n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getClass().getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append("[position = ");
        int n3 = this.position;
        stringBuilder.append(n3);
        stringBuilder.append(", length = ");
        return g30.a(this.length, "]", stringBuilder);
    }
}

