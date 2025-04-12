/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class pl0$a
implements fs0_2 {
    public final /* synthetic */ p83_0 a;

    public pl0$a(p83_0 p83_02) {
        this.a = p83_02;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        object = (kj1)object;
        boolean bl2 = object instanceof x91;
        p83_0 p83_02 = this.a;
        if (bl2) {
            p83_02.add(object);
        } else {
            bl2 = object instanceof y91;
            if (bl2) {
                object = ((y91)object).a;
                p83_02.remove(object);
            } else {
                bl2 = object instanceof rt0_0;
                if (bl2) {
                    p83_02.add(object);
                } else {
                    bl2 = object instanceof ST0;
                    if (bl2) {
                        object = ((ST0)object).a;
                        p83_02.remove(object);
                    } else {
                        bl2 = object instanceof Ey2$b;
                        if (bl2) {
                            p83_02.add(object);
                        } else {
                            bl2 = object instanceof Ey2$c;
                            if (bl2) {
                                object = ((Ey2$c)object).a;
                                p83_02.remove(object);
                            } else {
                                bl2 = object instanceof Ey2$a;
                                if (bl2) {
                                    object = ((Ey2$a)object).a;
                                    p83_02.remove(object);
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

