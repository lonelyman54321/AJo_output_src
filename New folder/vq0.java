/*
 * Decompiled with CFR 0.152.
 */
public final class vq0 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public int a = 0;
    public int b = -1 >>> 1;
    public float c = 1.0f;
    public int d = 0;
    public String e = null;
    public Object f;
    public boolean g = false;

    static {
        String string2;
        h = string2 = new String("FIXED_DIMENSION");
        i = string2 = new String("WRAP_DIMENSION");
        j = string2 = new String("SPREAD_DIMENSION");
        k = string2 = new String("PARENT_DIMENSION");
        l = string2 = new String("PERCENT_DIMENSION");
        m = string2 = new String("RATIO_DIMENSION");
    }

    public vq0(String string2) {
        this.f = string2;
    }

    public static vq0 b(int n3) {
        String string2 = h;
        vq0 vq02 = new vq0(string2);
        vq02.f = null;
        vq02.d = n3;
        return vq02;
    }

    public static vq0 c(String string2) {
        vq0 vq02 = new Object();
        vq02.a = 0;
        vq02.b = -1 >>> 1;
        vq02.c = 1.0f;
        vq02.d = 0;
        vq02.e = null;
        vq02.f = string2;
        vq02.g = true;
        return vq02;
    }

    public final void a(Y50 y50, int n3) {
        String string2 = this.e;
        if (string2 != null) {
            y50.O(string2);
        }
        string2 = k;
        Object object = l;
        String string3 = i;
        int n4 = 1;
        int n7 = -1 >>> 1;
        if (n3 == 0) {
            n3 = (int)(this.g ? 1 : 0);
            if (n3 != 0) {
                Object object2 = Y50$b.MATCH_CONSTRAINT;
                y50.S((Y50$b)((Object)object2));
                object2 = this.f;
                if (object2 != string3) {
                    n4 = object2 == object ? 2 : 0;
                }
                n3 = this.a;
                int n8 = this.b;
                float f5 = this.c;
                y50.T(n4, f5, n3, n8);
            } else {
                Object object3;
                n3 = this.a;
                if (n3 > 0) {
                    y50.f0 = n3 < 0 ? 0 : n3;
                }
                if ((n3 = this.b) < n7) {
                    object = y50.E;
                    object[0] = n3;
                }
                if ((object3 = this.f) == string3) {
                    object3 = Y50$b.WRAP_CONTENT;
                    y50.S((Y50$b)((Object)object3));
                } else if (object3 == string2) {
                    object3 = Y50$b.MATCH_PARENT;
                    y50.S((Y50$b)((Object)object3));
                } else if (object3 == null) {
                    object3 = Y50$b.FIXED;
                    y50.S((Y50$b)((Object)object3));
                    n3 = this.d;
                    y50.W(n3);
                }
            }
        } else {
            n3 = (int)(this.g ? 1 : 0);
            if (n3 != 0) {
                Object object4 = Y50$b.MATCH_CONSTRAINT;
                y50.U((Y50$b)((Object)object4));
                object4 = this.f;
                if (object4 != string3) {
                    n4 = object4 == object ? 2 : 0;
                }
                n3 = this.a;
                int n10 = this.b;
                float f6 = this.c;
                y50.V(n4, f6, n3, n10);
            } else {
                Object object5;
                n3 = this.a;
                if (n3 > 0) {
                    y50.g0 = n3 < 0 ? 0 : n3;
                }
                if ((n3 = this.b) < n7) {
                    object = y50.E;
                    object[n4] = n3;
                }
                if ((object5 = this.f) == string3) {
                    object5 = Y50$b.WRAP_CONTENT;
                    y50.U((Y50$b)((Object)object5));
                } else if (object5 == string2) {
                    object5 = Y50$b.MATCH_PARENT;
                    y50.U((Y50$b)((Object)object5));
                } else if (object5 == null) {
                    object5 = Y50$b.FIXED;
                    y50.U((Y50$b)((Object)object5));
                    n3 = this.d;
                    y50.R(n3);
                }
            }
        }
    }
}

