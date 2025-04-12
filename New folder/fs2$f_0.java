/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$f
 */
public final class fs2$f_0
extends Lambda
implements Function1 {
    public static final fs2$f_0 c;

    static {
        fs2$f_0 fs2$f_0;
        c = fs2$f_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        object = (List)object;
        int n3 = 0;
        Object object2 = object.get(0);
        Object object3 = null;
        if (object2 != null) {
            object2 = (Vl)((Object)object2);
        } else {
            n3 = 0;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        int n4 = 2;
        Object object4 = object.get(n4);
        if (object4 != null) {
            object4 = (Integer)object4;
        } else {
            n4 = 0;
            object4 = null;
        }
        Intrinsics.checkNotNull(object4);
        n4 = ((Number)object4).intValue();
        int n7 = 3;
        Object object5 = object.get(n7);
        if (object5 != null) {
            object5 = (Integer)object5;
        } else {
            n7 = 0;
            object5 = null;
        }
        Intrinsics.checkNotNull(object5);
        n7 = ((Number)object5).intValue();
        int n8 = 4;
        Object object6 = object.get(n8);
        if (object6 != null) {
            object6 = (String)object6;
        } else {
            n8 = 0;
            object6 = null;
        }
        Intrinsics.checkNotNull(object6);
        Object object7 = FS2$f$a.$EnumSwitchMapping$0;
        n3 = ((Enum)object2).ordinal();
        n3 = object7[n3];
        int n10 = 1;
        switch (n3) {
            default: {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            case 7: {
                object = object.get(n10);
                if (object != null) {
                    object3 = object;
                    object3 = (String)object;
                }
                Intrinsics.checkNotNull(object3);
                object = new Sl$b(object3, (String)object6, n4, n7);
                break;
            }
            case 6: {
                object = object.get(n10);
                object2 = FS2.g;
                object7 = Boolean.FALSE;
                n10 = (int)(Intrinsics.areEqual(object, object7) ? 1 : 0);
                if (n10 == 0 && object != null) {
                    object2 = ((ds2_0)object2).b;
                    object3 = object = object2.invoke(object);
                    object3 = (Gu1$a)object;
                }
                Intrinsics.checkNotNull(object3);
                object = new Sl$b(object3, (String)object6, n4, n7);
                break;
            }
            case 5: {
                object = object.get(n10);
                object2 = FS2.f;
                object7 = Boolean.FALSE;
                n10 = (int)(Intrinsics.areEqual(object, object7) ? 1 : 0);
                if (n10 == 0 && object != null) {
                    object2 = ((ds2_0)object2).b;
                    object3 = object = object2.invoke(object);
                    object3 = (Gu1$b)object;
                }
                Intrinsics.checkNotNull(object3);
                object = new Sl$b(object3, (String)object6, n4, n7);
                break;
            }
            case 4: {
                object = object.get(n10);
                object2 = FS2.e;
                object7 = Boolean.FALSE;
                n10 = (int)(Intrinsics.areEqual(object, object7) ? 1 : 0);
                if (n10 == 0 && object != null) {
                    object2 = ((ds2_0)object2).b;
                    object3 = object = object2.invoke(object);
                    object3 = (hx3)object;
                }
                Intrinsics.checkNotNull(object3);
                object = new Sl$b(object3, (String)object6, n4, n7);
                break;
            }
            case 3: {
                object = object.get(n10);
                object2 = FS2.d;
                object7 = Boolean.FALSE;
                n10 = (int)(Intrinsics.areEqual(object, object7) ? 1 : 0);
                if (n10 == 0 && object != null) {
                    object2 = ((ds2_0)object2).b;
                    object3 = object = object2.invoke(object);
                    object3 = (fb3_1)object;
                }
                Intrinsics.checkNotNull(object3);
                object = new Sl$b(object3, (String)object6, n4, n7);
                break;
            }
            case 2: {
                object = object.get(n10);
                object2 = FS2.i;
                object7 = Boolean.FALSE;
                n10 = (int)(Intrinsics.areEqual(object, object7) ? 1 : 0);
                if (n10 == 0 && object != null) {
                    object2 = ((ds2_0)object2).b;
                    object3 = object = object2.invoke(object);
                    object3 = (S93)object;
                }
                Intrinsics.checkNotNull(object3);
                object = new Sl$b(object3, (String)object6, n4, n7);
                break;
            }
            case 1: {
                object = object.get(n10);
                object2 = FS2.h;
                object7 = Boolean.FALSE;
                n10 = (int)(Intrinsics.areEqual(object, object7) ? 1 : 0);
                if (n10 == 0 && object != null) {
                    object2 = ((ds2_0)object2).b;
                    object3 = object = object2.invoke(object);
                    object3 = (ym2_0)object;
                }
                Intrinsics.checkNotNull(object3);
                object = new Sl$b(object3, (String)object6, n4, n7);
            }
        }
        return object;
    }
}

