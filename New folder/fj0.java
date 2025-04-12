/*
 * Decompiled with CFR 0.152.
 */
public final class fj0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        Object object = this;
        int n3 = this.a;
        int n4 = this.b;
        int n7 = this.c;
        int n8 = this.d;
        int n10 = this.e;
        int n14 = this.f;
        int n15 = this.g;
        int n16 = this.h;
        int n17 = this.i;
        int n18 = this.j;
        long l2 = this.k;
        int n19 = this.l;
        object = fQ2.a("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=", n3, n4);
        m10.a((StringBuilder)object, n7, "\n skippedInputBuffers=", n8, "\n renderedOutputBuffers=");
        m10.a((StringBuilder)object, n10, "\n skippedOutputBuffers=", n14, "\n droppedBuffers=");
        m10.a((StringBuilder)object, n15, "\n droppedInputBuffers=", n16, "\n maxConsecutiveDroppedBuffers=");
        m10.a((StringBuilder)object, n17, "\n droppedToKeyframeEvents=", n18, "\n totalVideoFrameProcessingOffsetUs=");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append("\n videoFrameProcessingOffsetCount=");
        ((StringBuilder)object).append(n19);
        ((StringBuilder)object).append("\n}");
        return ((StringBuilder)object).toString();
    }
}

