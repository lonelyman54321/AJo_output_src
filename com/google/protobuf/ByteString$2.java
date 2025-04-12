/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$ByteIterator;
import java.util.Comparator;

class ByteString$2
implements Comparator {
    public int compare(ByteString serializable, ByteString serializable2) {
        int n3;
        ByteString$ByteIterator byteString$ByteIterator = ((ByteString)serializable).iterator();
        ByteString$ByteIterator byteString$ByteIterator2 = serializable2.iterator();
        while ((n3 = byteString$ByteIterator.hasNext()) != 0 && (n3 = byteString$ByteIterator2.hasNext()) != 0) {
            int n4;
            Integer n7;
            Integer n8 = ByteString.access$200(byteString$ByteIterator.nextByte());
            n3 = n8.compareTo(n7 = Integer.valueOf(n4 = ByteString.access$200(byteString$ByteIterator2.nextByte())));
            if (n3 == 0) continue;
            return n3;
        }
        serializable = Integer.valueOf(((ByteString)serializable).size());
        serializable2 = Integer.valueOf(serializable2.size());
        return ((Integer)serializable).compareTo((Integer)serializable2);
    }
}

