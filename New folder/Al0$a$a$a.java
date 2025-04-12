/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$IntRef;

public final class Al0$a$a$a
implements fs0_2 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Al0$a d;

    public Al0$a$a$a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Ref$IntRef ref$IntRef3, Al0$a a2) {
        this.a = ref$IntRef;
        this.b = ref$IntRef2;
        this.c = ref$IntRef3;
        this.d = a2;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        int n3;
        object = (kj1)object;
        int n4 = object instanceof Ey2$b;
        Ref$IntRef ref$IntRef = this.c;
        Ref$IntRef ref$IntRef2 = this.b;
        Object object2 = this.a;
        int n7 = 1;
        if (n4 != 0) {
            ((Ref$IntRef)object2).element = n3 = ((Ref$IntRef)object2).element + n7;
        } else {
            n4 = object instanceof ey2_0.c;
            if (n4 != 0) {
                ((Ref$IntRef)object2).element = n3 = ((Ref$IntRef)object2).element + -1;
            } else {
                n4 = object instanceof ey2_0.a;
                if (n4 != 0) {
                    ((Ref$IntRef)object2).element = n3 = ((Ref$IntRef)object2).element + -1;
                } else {
                    n4 = object instanceof x91;
                    if (n4 != 0) {
                        ref$IntRef2.element = n3 = ref$IntRef2.element + n7;
                    } else {
                        n4 = object instanceof y91;
                        if (n4 != 0) {
                            ref$IntRef2.element = n3 = ref$IntRef2.element + -1;
                        } else {
                            n4 = object instanceof rt0_0;
                            if (n4 != 0) {
                                ref$IntRef.element = n3 = ref$IntRef.element + n7;
                            } else {
                                n3 = object instanceof ST0;
                                if (n3 != 0) {
                                    ref$IntRef.element = n3 = ref$IntRef.element + -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        n3 = ((Ref$IntRef)object2).element;
        n4 = 0;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        int n8 = ref$IntRef2.element;
        if (n8 > 0) {
            n8 = 1;
        } else {
            n8 = 0;
            ref$IntRef2 = null;
        }
        int n10 = ref$IntRef.element;
        if (n10 > 0) {
            n10 = 1;
        } else {
            n10 = 0;
            ref$IntRef = null;
        }
        object2 = this.d;
        int n14 = ((Al0$a)object2).o;
        if (n14 != n3) {
            ((Al0$a)object2).o = n3;
            n4 = 1;
        }
        if ((n3 = (int)(((Al0$a)object2).p ? 1 : 0)) != n8) {
            ((Al0$a)object2).p = n8;
            n4 = 1;
        }
        if ((n3 = (int)(((Al0$a)object2).q ? 1 : 0)) != n10) {
            ((Al0$a)object2).q = n10;
        } else {
            n7 = n4;
        }
        if (n7 != 0) {
            jt0_0.a((it0_0)object2);
        }
        return Unit.a;
    }
}

