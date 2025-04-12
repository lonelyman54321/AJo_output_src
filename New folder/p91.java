/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

public final class p91
extends rr_1 {
    public final void apply() {
        float f5;
        float f6;
        Object object;
        Object object2;
        Object object3;
        int n3;
        Object object4 = this.m0;
        Object object5 = ((ArrayList)object4).iterator();
        while (true) {
            n3 = object5.hasNext();
            object3 = this.k0;
            if (n3 == 0) break;
            object2 = object5.next();
            object2 = object3.b(object2);
            ((G50)object2).g();
        }
        object4 = ((ArrayList)object4).iterator();
        Object object6 = 0;
        float f7 = 0.0f;
        object5 = null;
        n3 = 0;
        object2 = null;
        float f8 = 0.0f;
        while (true) {
            boolean bl2 = object4.hasNext();
            int n4 = 0;
            float f11 = 0.0f;
            Object object7 = null;
            if (!bl2) break;
            Object object8 = object4.next();
            G50 g50 = object3.b(object8);
            if (object2 == null) {
                object2 = this.N;
                if (object2 != null) {
                    g50.o(object2);
                    n3 = this.l;
                    object2 = g50.k(n3);
                    n4 = this.r;
                    ((G50)object2).m(n4);
                } else {
                    object2 = this.O;
                    if (object2 != null) {
                        g50.getClass();
                        object7 = Fb3$b.START_TO_END;
                        g50.d0 = object7;
                        g50.O = object2;
                        n3 = this.l;
                        object2 = g50.k(n3);
                        n4 = this.r;
                        ((G50)object2).m(n4);
                    } else {
                        object2 = this.J;
                        if (object2 != null) {
                            g50.o(object2);
                            n3 = this.j;
                            object2 = g50.k(n3);
                            n4 = this.p;
                            ((G50)object2).m(n4);
                        } else {
                            object2 = this.K;
                            if (object2 != null) {
                                g50.getClass();
                                object7 = Fb3$b.START_TO_END;
                                g50.d0 = object7;
                                g50.O = object2;
                                n3 = this.j;
                                object2 = g50.k(n3);
                                n4 = this.p;
                                ((G50)object2).m(n4);
                            } else {
                                object2 = g50.a.toString();
                                object7 = 0;
                                g50.o(object7);
                                f11 = this.w((String)object2);
                                object7 = Float.valueOf(f11);
                                object7 = g50.l((Float)object7);
                                f8 = this.v((String)object2);
                                object2 = Float.valueOf(f8);
                                ((G50)object7).n((Float)object2);
                            }
                        }
                    }
                }
                object2 = g50;
            }
            if (object5 != null) {
                Fb3$b fb3$b;
                object7 = ((G50)object5).a.toString();
                String string2 = g50.a.toString();
                Object object9 = g50.a;
                ((G50)object5).d0 = fb3$b = Fb3$b.END_TO_START;
                ((G50)object5).P = object9;
                float f12 = this.u((String)object7);
                object9 = Float.valueOf(f12);
                object9 = ((G50)object5).l((Float)object9);
                object7 = Float.valueOf(this.t((String)object7));
                ((G50)object9).n((Float)object7);
                object5 = ((G50)object5).a;
                object7 = Fb3$b.START_TO_END;
                g50.d0 = object7;
                g50.O = object5;
                f7 = this.w(string2);
                object5 = Float.valueOf(f7);
                object5 = g50.l((Float)object5);
                f11 = this.v(string2);
                object7 = Float.valueOf(f11);
                ((G50)object5).n((Float)object7);
            }
            object5 = object8.toString();
            object8 = this.o0;
            n4 = ((HashMap)object8).containsKey(object5);
            float f14 = -1.0f;
            if (n4 != 0) {
                object5 = (Float)((HashMap)object8).get(object5);
                f7 = ((Float)object5).floatValue();
            } else {
                object6 = -1082130432;
                f7 = -1.0f;
            }
            bl2 = f7 == f14 ? 0 : (f7 > f14 ? 1 : -1);
            if (bl2) {
                g50.f = f7;
            }
            object5 = g50;
        }
        if (object5 != null) {
            object4 = this.P;
            if (object4 != null) {
                object3 = Fb3$b.END_TO_START;
                ((G50)object5).d0 = object3;
                ((G50)object5).P = object4;
                object = this.m;
                object4 = ((G50)object5).k((int)object);
                object6 = this.s;
                ((G50)object4).m((int)object6);
            } else {
                object4 = this.Q;
                if (object4 != null) {
                    ((G50)object5).i(object4);
                    object = this.m;
                    object4 = ((G50)object5).k((int)object);
                    object6 = this.s;
                    ((G50)object4).m((int)object6);
                } else {
                    object4 = this.L;
                    if (object4 != null) {
                        object3 = Fb3$b.END_TO_START;
                        ((G50)object5).d0 = object3;
                        ((G50)object5).P = object4;
                        object = this.k;
                        object4 = ((G50)object5).k((int)object);
                        object6 = this.q;
                        ((G50)object4).m((int)object6);
                    } else {
                        object4 = this.M;
                        if (object4 != null) {
                            ((G50)object5).i(object4);
                            object = this.k;
                            object4 = ((G50)object5).k((int)object);
                            object6 = this.q;
                            ((G50)object4).m((int)object6);
                        } else {
                            object4 = ((G50)object5).a.toString();
                            object3 = 0;
                            ((G50)object5).i(object3);
                            f6 = this.u((String)object4);
                            object3 = Float.valueOf(f6);
                            object5 = ((G50)object5).l((Float)object3);
                            f5 = this.t((String)object4);
                            object4 = Float.valueOf(f5);
                            ((G50)object5).n((Float)object4);
                        }
                    }
                }
            }
        }
        if (object2 == null) {
            return;
        }
        f5 = this.n0;
        f7 = 0.5f;
        float f11 = f5 - f7;
        object6 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object6 != 0) {
            ((G50)object2).h = f5;
        }
        object4 = p91$a.a;
        object5 = this.t0;
        object6 = ((Enum)object5).ordinal();
        object = object4[object6];
        object6 = 1;
        f7 = Float.MIN_VALUE;
        if (object != object6) {
            Object object10 = 2;
            f6 = 2.8E-45f;
            if (object != object10) {
                object6 = 3;
                f7 = 4.2E-45f;
                if (object == object6) {
                    ((G50)object2).d = object10;
                }
            } else {
                ((G50)object2).d = object6;
            }
        } else {
            ((G50)object2).d = 0;
        }
    }
}

