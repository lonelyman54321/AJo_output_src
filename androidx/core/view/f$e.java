/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.view;

import androidx.core.view.f;

public class f$e {
    public final f a;
    public ei1[] b;

    public f$e() {
        f f5 = new f();
        this(f5);
    }

    public f$e(f f5) {
        this.a = f5;
    }

    public final void a() {
        Object object = this.b;
        if (object != null) {
            int n3 = 0;
            ei1 ei12 = object[0];
            int n4 = 1;
            object = object[n4];
            f f5 = this.a;
            if (object == null) {
                object = f5.a;
                int n7 = 2;
                object = object.f(n7);
            }
            if (ei12 == null) {
                ei12 = f5.a.f(n4);
            }
            object = ei1.a(ei12, (ei1)object);
            this.g((ei1)object);
            object = this.b;
            n3 = 4;
            object = object[n3];
            if (object != null) {
                this.f((ei1)object);
            }
            object = this.b;
            n3 = 5;
            if ((object = object[n3]) != null) {
                this.d((ei1)object);
            }
            object = this.b;
            n3 = 6;
            if ((object = object[n3]) != null) {
                this.h((ei1)object);
            }
        }
    }

    public f b() {
        throw null;
    }

    public void c(int n3, ei1 object) {
        int n4;
        int n7;
        ei1[] ei1Array = this.b;
        if (ei1Array == null) {
            n7 = 9;
            this.b = ei1Array = new ei1[n7];
        }
        n7 = 1;
        for (int i3 = 1; i3 <= (n4 = 256); i3 <<= 1) {
            int n8;
            int n10 = n3 & i3;
            if (n10 == 0) continue;
            ei1[] ei1Array2 = this.b;
            if (i3 != n7) {
                n8 = 2;
                if (i3 != n8) {
                    int n14 = 4;
                    if (i3 != n14) {
                        n8 = 8;
                        if (i3 != n8) {
                            int n15 = 16;
                            if (i3 != n15) {
                                n14 = 32;
                                if (i3 != n14) {
                                    n14 = 64;
                                    if (i3 != n14) {
                                        n14 = 128;
                                        if (i3 != n14) {
                                            if (i3 != n4) {
                                                object = hj0_0.a(i3, "type needs to be >= FIRST and <= LAST, type=");
                                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                                                throw illegalArgumentException;
                                            }
                                        } else {
                                            n8 = 7;
                                        }
                                    } else {
                                        n8 = 6;
                                    }
                                } else {
                                    n8 = 5;
                                }
                            } else {
                                n8 = 4;
                            }
                        } else {
                            n8 = 3;
                        }
                    }
                } else {
                    n8 = 1;
                }
            } else {
                n8 = 0;
            }
            ei1Array2[n8] = object;
        }
    }

    public void d(ei1 ei12) {
    }

    public void e(ei1 ei12) {
        throw null;
    }

    public void f(ei1 ei12) {
    }

    public void g(ei1 ei12) {
        throw null;
    }

    public void h(ei1 ei12) {
    }
}

