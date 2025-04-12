/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$LeafByteString;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.RopeByteString$PieceIterator;
import java.io.InputStream;

class RopeByteString$RopeInputStream
extends InputStream {
    private ByteString$LeafByteString currentPiece;
    private int currentPieceIndex;
    private int currentPieceOffsetInRope;
    private int currentPieceSize;
    private int mark;
    private RopeByteString$PieceIterator pieceIterator;
    final /* synthetic */ RopeByteString this$0;

    public RopeByteString$RopeInputStream(RopeByteString ropeByteString) {
        this.this$0 = ropeByteString;
        this.initialize();
    }

    private void advanceIfCurrentPieceFullyRead() {
        int n3;
        int n4;
        ByteString$LeafByteString byteString$LeafByteString = this.currentPiece;
        if (byteString$LeafByteString != null && (n4 = this.currentPieceIndex) == (n3 = this.currentPieceSize)) {
            this.currentPieceOffsetInRope = n4 = this.currentPieceOffsetInRope + n3;
            n4 = 0;
            byteString$LeafByteString = null;
            this.currentPieceIndex = 0;
            RopeByteString$PieceIterator ropeByteString$PieceIterator = this.pieceIterator;
            n3 = (int)(ropeByteString$PieceIterator.hasNext() ? 1 : 0);
            if (n3 != 0) {
                this.currentPiece = byteString$LeafByteString = this.pieceIterator.next();
                this.currentPieceSize = n4 = byteString$LeafByteString.size();
            } else {
                n3 = 0;
                ropeByteString$PieceIterator = null;
                this.currentPiece = null;
                this.currentPieceSize = 0;
            }
        }
    }

    private int availableInternal() {
        int n3 = this.currentPieceOffsetInRope;
        int n4 = this.currentPieceIndex;
        return this.this$0.size() - (n3 += n4);
    }

    private void initialize() {
        int n3;
        RopeByteString ropeByteString = this.this$0;
        Object object = new RopeByteString$PieceIterator(ropeByteString, null);
        this.pieceIterator = object;
        this.currentPiece = object = ((RopeByteString$PieceIterator)object).next();
        this.currentPieceSize = n3 = ((ByteString)object).size();
        this.currentPieceIndex = 0;
        this.currentPieceOffsetInRope = 0;
    }

    private int readSkipInternal(byte[] byArray, int n3, int n4) {
        int n7;
        int n8;
        for (n7 = n4; n7 > 0; n7 -= n8) {
            this.advanceIfCurrentPieceFullyRead();
            ByteString$LeafByteString byteString$LeafByteString = this.currentPiece;
            if (byteString$LeafByteString == null) break;
            n8 = this.currentPieceSize;
            int n10 = this.currentPieceIndex;
            n8 = Math.min(n8 - n10, n7);
            if (byArray != null) {
                ByteString$LeafByteString byteString$LeafByteString2 = this.currentPiece;
                int n14 = this.currentPieceIndex;
                byteString$LeafByteString2.copyTo(byArray, n14, n3, n8);
                n3 += n8;
            }
            this.currentPieceIndex = n10 = this.currentPieceIndex + n8;
        }
        return n4 - n7;
    }

    public int available() {
        return this.availableInternal();
    }

    public void mark(int n3) {
        n3 = this.currentPieceOffsetInRope;
        int n4 = this.currentPieceIndex;
        this.mark = n3 += n4;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        int n3;
        this.advanceIfCurrentPieceFullyRead();
        ByteString$LeafByteString byteString$LeafByteString = this.currentPiece;
        if (byteString$LeafByteString == null) {
            return -1;
        }
        int n4 = this.currentPieceIndex;
        this.currentPieceIndex = n3 = n4 + 1;
        return byteString$LeafByteString.byteAt(n4) & 0xFF;
    }

    public int read(byte[] object, int n3, int n4) {
        int n7;
        object.getClass();
        if (n3 >= 0 && n4 >= 0 && n4 <= (n7 = ((byte[])object).length - n3)) {
            int n8 = this.readSkipInternal((byte[])object, n3, n4);
            if (n8 == 0 && (n4 > 0 || (n3 = this.availableInternal()) == 0)) {
                n8 = -1;
            }
            return n8;
        }
        object = new IndexOutOfBoundsException;
        object();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reset() {
        synchronized (this) {
            this.initialize();
            int n3 = this.mark;
            this.readSkipInternal(null, 0, n3);
            return;
        }
    }

    public long skip(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            l3 = Integer.MAX_VALUE;
            long l7 = l2 - l3;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object > 0) {
                l2 = l3;
            }
            int n3 = (int)l2;
            return this.readSkipInternal(null, 0, n3);
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
        throw indexOutOfBoundsException;
    }
}

