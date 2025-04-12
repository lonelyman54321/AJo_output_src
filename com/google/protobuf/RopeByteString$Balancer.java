/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.RopeByteString$1;
import java.util.ArrayDeque;
import java.util.Arrays;

class RopeByteString$Balancer {
    private final ArrayDeque prefixesStack;

    private RopeByteString$Balancer() {
        ArrayDeque arrayDeque;
        this.prefixesStack = arrayDeque = new ArrayDeque();
    }

    public /* synthetic */ RopeByteString$Balancer(RopeByteString.1 var1_1) {
        this();
    }

    public static /* synthetic */ ByteString access$100(RopeByteString$Balancer ropeByteString$Balancer, ByteString byteString, ByteString byteString2) {
        return ropeByteString$Balancer.balance(byteString, byteString2);
    }

    private ByteString balance(ByteString byteString, ByteString iterable) {
        boolean bl2;
        this.doBalance(byteString);
        this.doBalance((ByteString)iterable);
        byteString = (ByteString)this.prefixesStack.pop();
        while (!(bl2 = ((ArrayDeque)(iterable = this.prefixesStack)).isEmpty())) {
            iterable = (ByteString)this.prefixesStack.pop();
            RopeByteString ropeByteString = new RopeByteString((ByteString)iterable, byteString, null);
            byteString = ropeByteString;
        }
        return byteString;
    }

    private void doBalance(ByteString object) {
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    bl2 = ((ByteString)object).isBalanced();
                    if (!bl2) break block2;
                    this.insert((ByteString)object);
                    break block3;
                }
                bl2 = object instanceof RopeByteString;
                if (!bl2) break block4;
                object = (RopeByteString)object;
                ByteString byteString = RopeByteString.access$400((RopeByteString)object);
                this.doBalance(byteString);
                object = RopeByteString.access$500((RopeByteString)object);
                this.doBalance((ByteString)object);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Has a new type of ByteString been created? Found ");
        object = object.getClass();
        stringBuilder.append(object);
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    private int getDepthBinForLength(int n3) {
        int[] nArray = RopeByteString.minLengthByDepth;
        if ((n3 = Arrays.binarySearch(nArray, n3)) < 0) {
            n3 = -(n3 + 1) + -1;
        }
        return n3;
    }

    private void insert(ByteString iterable) {
        int n3;
        int n32 = ((ByteString)iterable).size();
        n32 = this.getDepthBinForLength(n32);
        int n4 = RopeByteString.minLength(n32 + 1);
        Iterable iterable2 = this.prefixesStack;
        boolean n7 = ((ArrayDeque)iterable2).isEmpty();
        if (!n7 && (n3 = ((ByteString)(iterable2 = (ByteString)this.prefixesStack.peek())).size()) < n4) {
            int n8;
            int n10;
            n32 = RopeByteString.minLength(n32);
            ByteString byteString = (ByteString)this.prefixesStack.pop();
            while ((n10 = ((ArrayDeque)(iterable2 = this.prefixesStack)).isEmpty()) == 0 && (n10 = ((ByteString)(iterable2 = (ByteString)this.prefixesStack.peek())).size()) < n32) {
                iterable2 = (ByteString)this.prefixesStack.pop();
                RopeByteString ropeByteString = new RopeByteString((ByteString)iterable2, byteString, null);
                byteString = ropeByteString;
            }
            ByteString byteString2 = new RopeByteString(byteString, (ByteString)iterable, null);
            while ((n8 = ((ArrayDeque)(iterable = this.prefixesStack)).isEmpty()) == 0) {
                n8 = byteString2.size();
                n8 = RopeByteString.minLength(this.getDepthBinForLength(n8) + 1);
                byteString = (ByteString)this.prefixesStack.peek();
                n4 = byteString.size();
                if (n4 >= n8) break;
                iterable = (ByteString)this.prefixesStack.pop();
                byteString = new RopeByteString((ByteString)iterable, byteString2, null);
                byteString2 = byteString;
            }
            iterable = this.prefixesStack;
            ((ArrayDeque)iterable).push(byteString2);
        } else {
            ArrayDeque arrayDeque = this.prefixesStack;
            arrayDeque.push(iterable);
        }
    }
}

