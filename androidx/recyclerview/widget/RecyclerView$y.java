/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

public final class RecyclerView$y {
    public int a = -1;
    public int b = 0;
    public int c = 0;
    public int d = 1;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l;
    public long m;
    public int n;

    public final void a(int n3) {
        int n4 = this.d & n3;
        if (n4 != 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Layout state should be one of ");
        String string2 = Integer.toBinaryString(n3);
        stringBuilder.append(string2);
        stringBuilder.append(" but it is ");
        string2 = Integer.toBinaryString(this.d);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int b() {
        int n3 = this.g;
        if (n3 != 0) {
            n3 = this.b;
            int n4 = this.c;
            n3 -= n4;
        } else {
            n3 = this.e;
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("State{mTargetPosition=");
        int bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", mData=null, mItemCount=");
        int n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(", mIsMeasuring=");
        boolean bl3 = this.i;
        stringBuilder.append(bl3);
        stringBuilder.append(", mPreviousLayoutItemCount=");
        int n4 = this.b;
        stringBuilder.append(n4);
        stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        int n7 = this.c;
        stringBuilder.append(n7);
        stringBuilder.append(", mStructureChanged=");
        boolean bl4 = this.f;
        stringBuilder.append(bl4);
        stringBuilder.append(", mInPreLayout=");
        boolean bl5 = this.g;
        stringBuilder.append(bl5);
        stringBuilder.append(", mRunSimpleAnimations=");
        boolean bl6 = this.j;
        stringBuilder.append(bl6);
        stringBuilder.append(", mRunPredictiveAnimations=");
        boolean bl7 = this.k;
        return AR.a(stringBuilder, bl7, '}');
    }
}

