/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sm1
 */
public final class sm1_1 {
    public static om1_2 a(Function1 function1) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        su_1 su_12;
        Object object;
        boolean bl5;
        String string2;
        boolean bl6;
        Object object2 = function1;
        Object object3 = ml1_2.d;
        Intrinsics.checkNotNullParameter(object3, "from");
        Intrinsics.checkNotNullParameter(function1, "builderAction");
        Intrinsics.checkNotNullParameter(object3, "json");
        Object object4 = new Object();
        Object object5 = ((ml1_2)object3).a;
        ((ql1_2)object4).a = bl6 = ((sl1_2)object5).a;
        ((ql1_2)object4).b = bl6 = ((sl1_2)object5).f;
        ((ql1_2)object4).c = bl6 = ((sl1_2)object5).b;
        ((ql1_2)object4).d = bl6 = ((sl1_2)object5).c;
        ((ql1_2)object4).e = bl6 = ((sl1_2)object5).e;
        ((ql1_2)object4).f = string2 = ((sl1_2)object5).g;
        ((ql1_2)object4).g = bl5 = ((sl1_2)object5).h;
        ((ql1_2)object4).h = object = ((sl1_2)object5).j;
        ((ql1_2)object4).i = su_12 = ((sl1_2)object5).p;
        ((ql1_2)object4).j = bl4 = ((sl1_2)object5).l;
        ((ql1_2)object4).k = bl4 = ((sl1_2)object5).m;
        ((ql1_2)object4).l = bl4 = ((sl1_2)object5).n;
        ((ql1_2)object4).m = bl4 = ((sl1_2)object5).o;
        ((ql1_2)object4).n = bl4 = ((sl1_2)object5).k;
        ((ql1_2)object4).o = bl4 = ((sl1_2)object5).d;
        ((ql1_2)object4).p = bl3 = ((sl1_2)object5).i;
        ((ql1_2)object4).q = object3 = ((ml1_2)object3).b;
        function1.invoke(object4);
        boolean bl7 = ((ql1_2)object4).p;
        if (bl7) {
            object2 = "type";
            bl7 = Intrinsics.areEqual(object, object2);
            if (bl7) {
                object2 = su_1.POLYMORPHIC;
                if (su_12 != object2) {
                    object3 = "useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString();
                    object2 = new IllegalArgumentException((String)object3);
                    throw object2;
                }
            } else {
                object3 = "Class discriminator should not be specified when array polymorphism is specified".toString();
                object2 = new IllegalArgumentException((String)object3);
                throw object2;
            }
        }
        bl7 = ((ql1_2)object4).e;
        object3 = "    ";
        if (!bl7) {
            bl7 = Intrinsics.areEqual(string2, object3);
            if (!bl7) {
                object3 = "Indent should not be specified when default printing mode is used".toString();
                object2 = new IllegalArgumentException((String)object3);
                throw object2;
            }
        } else {
            bl7 = Intrinsics.areEqual(string2, object3);
            if (!bl7) {
                object2 = null;
                for (bl7 = false; bl7 < (bl2 = string2.length()); bl7 += 1) {
                    bl2 = string2.charAt((int)(bl7 ? 1 : 0)) != 0;
                    if (bl2 == (bl3 = 32 != 0) || bl2 == (bl3 = 9 != 0) || bl2 == (bl3 = 13 != 0) || bl2 == (bl3 = 10 != 0)) continue;
                    object2 = "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(string2);
                    object2 = object2.toString();
                    object3 = new IllegalArgumentException((String)object2);
                    throw object3;
                }
            }
        }
        object = object2;
        boolean bl8 = ((ql1_2)object4).a;
        bl4 = ((ql1_2)object4).c;
        boolean bl9 = ((ql1_2)object4).d;
        boolean bl10 = ((ql1_2)object4).o;
        boolean bl11 = ((ql1_2)object4).e;
        boolean bl12 = ((ql1_2)object4).p;
        boolean bl13 = ((ql1_2)object4).n;
        boolean bl14 = ((ql1_2)object4).m;
        object3 = ((ql1_2)object4).i;
        boolean bl15 = ((ql1_2)object4).b;
        String string3 = ((ql1_2)object4).f;
        boolean bl16 = ((ql1_2)object4).g;
        String string4 = ((ql1_2)object4).h;
        boolean bl17 = ((ql1_2)object4).j;
        boolean bl18 = ((ql1_2)object4).k;
        bl2 = ((ql1_2)object4).l;
        object2 = new sl1_2(bl8, bl4, bl9, bl10, bl11, bl15, string3, bl16, bl12, string4, bl13, bl17, bl18, bl2, bl14, (su_1)((Object)object3));
        object4 = ((ql1_2)object4).q;
        Intrinsics.checkNotNullParameter(object2, "configuration");
        Intrinsics.checkNotNullParameter(object4, "module");
        object5 = object4;
        object5 = (yz2_2)object4;
        object3 = new ml1_2((sl1_2)object2, (yz2_2)object5);
        object5 = p03.a;
        bl3 = Intrinsics.areEqual(object4, object5);
        if (!bl3) {
            object5 = new hm1_1((sl1_2)object2);
            ((i0_0)object4).H((hm1_1)object5);
        }
        return object3;
    }
}

