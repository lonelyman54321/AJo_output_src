/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Bv1
 */
public final class bv1_1
implements F62 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ kn1_0 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ bv1_1(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, kn1_0 kn1_02, Function2 function2) {
        this.a = ref$ObjectRef;
        this.b = ref$ObjectRef2;
        this.c = kn1_02;
        this.d = function2;
    }

    public final void onChanged(Object object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$lastB");
        Ref$ObjectRef ref$ObjectRef = this.b;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$lastA");
        kn1_0 kn1_02 = this.c;
        Intrinsics.checkNotNullParameter(kn1_02, "$this_apply");
        Function2 function2 = this.d;
        Intrinsics.checkNotNullParameter(function2, "$func");
        ((Ref$ObjectRef)object2).element = object;
        Object object3 = ref$ObjectRef.element;
        if (object == null && (object2 = kn1_02.d()) != null) {
            object = null;
            kn1_02.k(null);
        } else if (object3 != null && object != null) {
            object = function2.invoke(object3, object);
            kn1_02.k(object);
        }
    }
}

