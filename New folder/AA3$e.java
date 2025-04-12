/*
 * Decompiled with CFR 0.152.
 */
public abstract class AA3$e
extends AA3$d {
    public rn2$a[] a = null;
    public String b;
    public int c = 0;
    public final int d;

    public AA3$e() {
    }

    public AA3$e(AA3$e rn2$aArray) {
        int n3;
        String string2;
        this.b = string2 = rn2$aArray.b;
        this.d = n3 = rn2$aArray.d;
        rn2$aArray = rn2.e(rn2$aArray.a);
        this.a = rn2$aArray;
    }

    public rn2$a[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(rn2$a[] rn2$aArray) {
        rn2$a[] rn2$aArray2 = this.a;
        boolean bl2 = rn2.a(rn2$aArray2, rn2$aArray);
        if (!bl2) {
            rn2$aArray = rn2.e(rn2$aArray);
            this.a = rn2$aArray;
        } else {
            int n3;
            rn2$aArray2 = this.a;
            for (int i3 = 0; i3 < (n3 = rn2$aArray.length); ++i3) {
                int n4;
                char c2;
                rn2$a rn2$a = rn2$aArray2[i3];
                Object object = rn2$aArray[i3];
                rn2$a.a = c2 = ((rn2$a)object).a;
                rn2$a = null;
                for (n3 = 0; n3 < (n4 = ((Object)(object = (Object)rn2$aArray[i3].b)).length); ++n3) {
                    float[] fArray = rn2$aArray2[i3].b;
                    Object object2 = object[n3];
                    fArray[n3] = (float)object2;
                }
            }
        }
    }
}

