/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

public final class n {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f = 0;
    public int g = 0;
    public boolean h;
    public boolean i;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutState{mAvailable=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", mCurrentPosition=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", mItemDirection=");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(", mLayoutDirection=");
        n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(", mStartLine=");
        n3 = this.f;
        stringBuilder.append(n3);
        stringBuilder.append(", mEndLine=");
        n3 = this.g;
        return tu.a(stringBuilder, n3, '}');
    }
}

