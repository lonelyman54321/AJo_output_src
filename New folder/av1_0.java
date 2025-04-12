/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Av1
 */
public final class av1_0
implements F62 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ kn1_0 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ av1_0(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, kn1_0 kn1_02, Function2 function2) {
        this.a = ref$ObjectRef;
        this.b = ref$ObjectRef2;
        this.c = kn1_02;
        this.d = function2;
    }

    public final void onChanged(Object object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$lastA");
        Ref$ObjectRef ref$ObjectRef = this.b;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$lastB");
        kn1_0 kn1_02 = this.c;
        Intrinsics.checkNotNullParameter(kn1_02, "$this_apply");
        Function2 function2 = this.d;
        Intrinsics.checkNotNullParameter(function2, "$func");
        ((Ref$ObjectRef)object2).element = object;
        Object object3 = ref$ObjectRef.element;
        if (object == null && (object2 = kn1_02.d()) != null) {
            object = null;
            kn1_02.k(null);
        } else if (object != null && object3 != null) {
            object = function2.invoke(object, object3);
            kn1_02.k(object);
        }
    }
}

