/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$ByteIterator;
import com.google.protobuf.ByteString$LeafByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.RopeByteString$1;
import com.google.protobuf.RopeByteString$Balancer;
import com.google.protobuf.RopeByteString$PieceIterator;
import com.google.protobuf.RopeByteString$RopeInputStream;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

final class RopeByteString
extends ByteString {
    static final int[] minLengthByDepth;
    private static final long serialVersionUID = 1L;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[47];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 1;
        nArray2[2] = 2;
        nArray3[3] = 3;
        nArray2[4] = 5;
        nArray3[5] = 8;
        nArray2[6] = 13;
        nArray3[7] = 21;
        nArray2[8] = 34;
        nArray3[9] = 55;
        nArray2[10] = 89;
        nArray3[11] = 144;
        nArray2[12] = 233;
        nArray3[13] = 377;
        nArray2[14] = 610;
        nArray3[15] = 987;
        nArray2[16] = 1597;
        nArray3[17] = 2584;
        nArray2[18] = 4181;
        nArray3[19] = 6765;
        nArray2[20] = 10946;
        nArray3[21] = 17711;
        nArray2[22] = 28657;
        nArray3[23] = 46368;
        nArray2[24] = 75025;
        nArray3[25] = 121393;
        nArray2[26] = 196418;
        nArray3[27] = 317811;
        nArray2[28] = 514229;
        nArray3[29] = 832040;
        nArray2[30] = 1346269;
        nArray3[31] = 2178309;
        nArray2[32] = 3524578;
        nArray3[33] = 5702887;
        nArray2[34] = 0x8CCCC9;
        nArray3[35] = 14930352;
        nArray2[36] = 24157817;
        nArray3[37] = 39088169;
        nArray2[38] = 63245986;
        nArray3[39] = 102334155;
        nArray2[40] = 165580141;
        nArray3[41] = 267914296;
        nArray2[42] = 433494437;
        nArray3[43] = 701408733;
        nArray2[44] = 1134903170;
        nArray3[45] = 1836311903;
        nArray3[46] = -1 >>> 1;
        minLengthByDepth = nArray;
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        int n3;
        int n4;
        this.left = byteString;
        this.right = byteString2;
        this.leftLength = n4 = byteString.size();
        this.totalLength = n3 = byteString2.size() + n4;
        int n7 = byteString.getTreeDepth();
        int n8 = byteString2.getTreeDepth();
        this.treeDepth = n7 = Math.max(n7, n8) + 1;
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, RopeByteString$1 ropeByteString$1) {
        this(byteString, byteString2);
    }

    public static /* synthetic */ ByteString access$400(RopeByteString ropeByteString) {
        return ropeByteString.left;
    }

    public static /* synthetic */ ByteString access$500(RopeByteString ropeByteString) {
        return ropeByteString.right;
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        Object object;
        int n3 = byteString2.size();
        if (n3 == 0) {
            return byteString;
        }
        n3 = byteString.size();
        if (n3 == 0) {
            return byteString2;
        }
        n3 = byteString.size();
        int n4 = byteString2.size() + n3;
        if (n4 < (n3 = 128)) {
            return RopeByteString.concatenateBytes(byteString, byteString2);
        }
        int n7 = byteString instanceof RopeByteString;
        if (n7 != 0) {
            ByteString byteString3 = byteString;
            byteString3 = (RopeByteString)byteString;
            ByteString byteString4 = ((RopeByteString)byteString3).right;
            int n8 = byteString4.size();
            int n10 = byteString2.size() + n8;
            if (n10 < n3) {
                byteString = RopeByteString.concatenateBytes(((RopeByteString)byteString3).right, byteString2);
                ByteString byteString5 = ((RopeByteString)byteString3).left;
                byteString2 = new RopeByteString(byteString5, byteString);
                return byteString2;
            }
            object = ((RopeByteString)byteString3).left;
            n3 = ((ByteString)object).getTreeDepth();
            if (n3 > (n8 = (byteString4 = ((RopeByteString)byteString3).right).getTreeDepth()) && (n3 = ((RopeByteString)byteString3).getTreeDepth()) > (n8 = byteString2.getTreeDepth())) {
                object = ((RopeByteString)byteString3).right;
                byteString = new RopeByteString((ByteString)object, byteString2);
                object = ((RopeByteString)byteString3).left;
                byteString2 = new RopeByteString((ByteString)object, byteString);
                return byteString2;
            }
        }
        n3 = byteString.getTreeDepth();
        n7 = byteString2.getTreeDepth();
        if (n4 >= (n3 = RopeByteString.minLength(Math.max(n3, n7) + 1))) {
            object = new RopeByteString(byteString, byteString2);
            return object;
        }
        object = new RopeByteString$Balancer(null);
        return RopeByteString$Balancer.access$100((RopeByteString$Balancer)object, byteString, byteString2);
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int n3 = byteString.size();
        int n4 = byteString2.size();
        byte[] byArray = new byte[n3 + n4];
        byteString.copyTo(byArray, 0, 0, n3);
        byteString2.copyTo(byArray, 0, n3, n4);
        return ByteString.wrap(byArray);
    }

    private boolean equalsFragments(ByteString serializable) {
        RopeByteString$PieceIterator ropeByteString$PieceIterator = new RopeByteString$PieceIterator(this, null);
        ByteString$LeafByteString byteString$LeafByteString = (ByteString$LeafByteString)ropeByteString$PieceIterator.next();
        RopeByteString$PieceIterator ropeByteString$PieceIterator2 = new RopeByteString$PieceIterator((ByteString)serializable, null);
        serializable = (ByteString$LeafByteString)ropeByteString$PieceIterator2.next();
        int n3 = 0;
        int n4 = 0;
        int n7 = 0;
        while (true) {
            int n8 = byteString$LeafByteString.size() - n3;
            int n10 = serializable.size() - n4;
            int n14 = Math.min(n8, n10);
            int n15 = n3 == 0 ? byteString$LeafByteString.equalsRange((ByteString)serializable, n4, n14) : ((ByteString$LeafByteString)serializable).equalsRange(byteString$LeafByteString, n3, n14);
            if (n15 == 0) {
                return false;
            }
            n15 = this.totalLength;
            if ((n7 += n14) >= n15) {
                if (n7 == n15) {
                    return true;
                }
                serializable = new IllegalStateException();
                throw serializable;
            }
            if (n14 == n8) {
                byteString$LeafByteString = (ByteString$LeafByteString)ropeByteString$PieceIterator.next();
                n3 = 0;
            } else {
                n3 += n14;
            }
            if (n14 == n10) {
                serializable = (ByteString$LeafByteString)ropeByteString$PieceIterator2.next();
                n4 = 0;
                continue;
            }
            n4 += n14;
        }
    }

    public static int minLength(int n3) {
        int[] nArray = minLengthByDepth;
        int n4 = nArray.length;
        if (n3 >= n4) {
            return -1 >>> 1;
        }
        return nArray[n3];
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        RopeByteString ropeByteString = new RopeByteString(byteString, byteString2);
        return ropeByteString;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
        throw object;
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.toByteArray()).asReadOnlyBuffer();
    }

    public List asReadOnlyByteBufferList() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<ByteBuffer>();
        boolean bl2 = false;
        ByteBuffer byteBuffer = null;
        RopeByteString$PieceIterator ropeByteString$PieceIterator = new RopeByteString$PieceIterator(this, null);
        while (bl2 = ropeByteString$PieceIterator.hasNext()) {
            byteBuffer = ropeByteString$PieceIterator.next().asReadOnlyByteBuffer();
            arrayList.add(byteBuffer);
        }
        return arrayList;
    }

    public byte byteAt(int n3) {
        int n4 = this.totalLength;
        ByteString.checkIndex(n3, n4);
        return this.internalByteAt(n3);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    public void copyToInternal(byte[] byArray, int n3, int n4, int n7) {
        int n8 = n3 + n7;
        int n10 = this.leftLength;
        if (n8 <= n10) {
            ByteString byteString = this.left;
            byteString.copyToInternal(byArray, n3, n4, n7);
        } else if (n3 >= n10) {
            ByteString byteString = this.right;
            byteString.copyToInternal(byArray, n3 -= n10, n4, n7);
        } else {
            this.left.copyToInternal(byArray, n3, n4, n10 -= n3);
            ByteString byteString = this.right;
            n8 = 0;
            Object var7_9 = null;
            byteString.copyToInternal(byArray, 0, n4 += n10, n7 -= n10);
        }
    }

    public boolean equals(Object object) {
        int n3 = 1;
        if (object == this) {
            return n3 != 0;
        }
        int n4 = object instanceof ByteString;
        if (n4 == 0) {
            return false;
        }
        n4 = this.totalLength;
        int n7 = ((ByteString)(object = (ByteString)object)).size();
        if (n4 != n7) {
            return false;
        }
        n4 = this.totalLength;
        if (n4 == 0) {
            return n3 != 0;
        }
        n3 = this.peekCachedHashCode();
        n4 = ((ByteString)object).peekCachedHashCode();
        if (n3 != 0 && n4 != 0 && n3 != n4) {
            return false;
        }
        return this.equalsFragments((ByteString)object);
    }

    public int getTreeDepth() {
        return this.treeDepth;
    }

    public byte internalByteAt(int n3) {
        int n4 = this.leftLength;
        if (n3 < n4) {
            return this.left.internalByteAt(n3);
        }
        ByteString byteString = this.right;
        return byteString.internalByteAt(n3 -= n4);
    }

    public boolean isBalanced() {
        int n3 = this.totalLength;
        int n4 = RopeByteString.minLength(this.treeDepth);
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isValidUtf8() {
        ByteString byteString = this.left;
        int n3 = this.leftLength;
        boolean bl2 = false;
        int n4 = byteString.partialIsValidUtf8(0, 0, n3);
        ByteString byteString2 = this.right;
        int n7 = byteString2.size();
        if ((n4 = byteString2.partialIsValidUtf8(n4, 0, n7)) == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public ByteString$ByteIterator iterator() {
        RopeByteString$1 ropeByteString$1 = new RopeByteString$1(this);
        return ropeByteString$1;
    }

    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.asReadOnlyByteBufferList(), true);
    }

    public InputStream newInput() {
        RopeByteString$RopeInputStream ropeByteString$RopeInputStream = new RopeByteString$RopeInputStream(this);
        return ropeByteString$RopeInputStream;
    }

    public int partialHash(int n3, int n4, int n7) {
        int n8 = n4 + n7;
        int n10 = this.leftLength;
        if (n8 <= n10) {
            return this.left.partialHash(n3, n4, n7);
        }
        if (n4 >= n10) {
            ByteString byteString = this.right;
            return byteString.partialHash(n3, n4 -= n10, n7);
        }
        n3 = this.left.partialHash(n3, n4, n10 -= n4);
        ByteString byteString = this.right;
        return byteString.partialHash(n3, 0, n7 -= n10);
    }

    public int partialIsValidUtf8(int n3, int n4, int n7) {
        int n8 = n4 + n7;
        int n10 = this.leftLength;
        if (n8 <= n10) {
            return this.left.partialIsValidUtf8(n3, n4, n7);
        }
        if (n4 >= n10) {
            ByteString byteString = this.right;
            return byteString.partialIsValidUtf8(n3, n4 -= n10, n7);
        }
        n3 = this.left.partialIsValidUtf8(n3, n4, n10 -= n4);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(n3, 0, n7 -= n10);
    }

    public int size() {
        return this.totalLength;
    }

    public ByteString substring(int n3, int n4) {
        int n7 = this.totalLength;
        if ((n7 = ByteString.checkRange(n3, n4, n7)) == 0) {
            return ByteString.EMPTY;
        }
        int n8 = this.totalLength;
        if (n7 == n8) {
            return this;
        }
        n7 = this.leftLength;
        if (n4 <= n7) {
            return this.left.substring(n3, n4);
        }
        if (n3 >= n7) {
            ByteString byteString = this.right;
            return byteString.substring(n3 -= n7, n4 -= n7);
        }
        ByteString byteString = this.left.substring(n3);
        ByteString byteString2 = this.right;
        n8 = this.leftLength;
        ByteString byteString3 = byteString2.substring(0, n4 -= n8);
        byteString2 = new RopeByteString(byteString, byteString3);
        return byteString2;
    }

    public String toStringInternal(Charset charset) {
        byte[] byArray = this.toByteArray();
        String string2 = new String(byArray, charset);
        return string2;
    }

    public Object writeReplace() {
        return ByteString.wrap(this.toByteArray());
    }

    public void writeTo(ByteOutput byteOutput) {
        this.left.writeTo(byteOutput);
        this.right.writeTo(byteOutput);
    }

    public void writeTo(OutputStream outputStream) {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    public void writeToInternal(OutputStream outputStream, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = this.leftLength;
        if (n7 <= n8) {
            ByteString byteString = this.left;
            byteString.writeToInternal(outputStream, n3, n4);
        } else if (n3 >= n8) {
            ByteString byteString = this.right;
            byteString.writeToInternal(outputStream, n3 -= n8, n4);
        } else {
            this.left.writeToInternal(outputStream, n3, n8 -= n3);
            ByteString byteString = this.right;
            n7 = 0;
            Object var6_8 = null;
            byteString.writeToInternal(outputStream, 0, n4 -= n8);
        }
    }

    public void writeToReverse(ByteOutput byteOutput) {
        this.right.writeToReverse(byteOutput);
        this.left.writeToReverse(byteOutput);
    }
}

