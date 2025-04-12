/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Vt1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;

    public Vt1$a(Vt1 vt1) {
        this.c = vt1;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        block24: {
            Object object3;
            int n3;
            int n4;
            int n7;
            int n8;
            Object object4;
            boolean bl2;
            int n10;
            int n14;
            block18: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        object = (Qe1)object;
                                        n14 = ((Qe1)object).a;
                                        object2 = this.c.r;
                                        object2.getClass();
                                        n10 = 7;
                                        bl2 = Qe1.a(n14, n10);
                                        object4 = null;
                                        n8 = 5;
                                        n7 = 6;
                                        n4 = 2;
                                        n3 = 1;
                                        if (!bl2) break block17;
                                        object3 = ((uo1_1)object2).a().a;
                                        break block18;
                                    }
                                    bl2 = Qe1.a(n14, n4);
                                    if (!bl2) break block19;
                                    object3 = ((uo1_1)object2).a().b;
                                    break block18;
                                }
                                bl2 = Qe1.a(n14, n7);
                                if (!bl2) break block20;
                                object3 = ((uo1_1)object2).a().c;
                                break block18;
                            }
                            bl2 = Qe1.a(n14, n8);
                            if (!bl2) break block21;
                            object3 = ((uo1_1)object2).a().d;
                            break block18;
                        }
                        bl2 = Qe1.a(n14, 3);
                        if (!bl2) break block22;
                        object3 = ((uo1_1)object2).a().e;
                        break block18;
                    }
                    bl2 = Qe1.a(n14, 4);
                    if (!bl2) break block23;
                    object3 = ((uo1_1)object2).a().f;
                    break block18;
                }
                bl2 = Qe1.a(n14, n3);
                if (bl2) {
                    bl2 = true;
                } else {
                    object3 = null;
                    bl2 = Qe1.a(n14, 0);
                }
                if (!bl2) break block24;
                bl2 = false;
                object3 = null;
            }
            if (object3 != null) {
                object3.invoke(object2);
                object3 = Unit.a;
            } else {
                bl2 = false;
                object3 = null;
            }
            if (object3 == null) {
                bl2 = Qe1.a(n14, n7);
                String string2 = "focusManager";
                if (bl2) {
                    object = ((uo1_1)object2).c;
                    if (object != null) {
                        object4 = object;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    }
                    object4.d(n3);
                } else {
                    bl2 = Qe1.a(n14, n8);
                    if (bl2) {
                        object = ((uo1_1)object2).c;
                        if (object != null) {
                            object4 = object;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                        }
                        object4.d(n4);
                    } else if ((n14 = (int)(Qe1.a(n14, n10) ? 1 : 0)) != 0 && (object = ((uo1_1)object2).a) != null) {
                        object.hide();
                    }
                }
            }
            return Unit.a;
        }
        object2 = "invalid ImeAction".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

