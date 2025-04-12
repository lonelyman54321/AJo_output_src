/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Yc2
 */
public final class yc2_0
implements Function2 {
    public final /* synthetic */ Ref$ObjectRef a;

    public /* synthetic */ yc2_0(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    public final Object invoke(Object object, Object object2) {
        block3: {
            object = (String)object;
            object2 = (String)object2;
            Ref$ObjectRef ref$ObjectRef = this.a;
            Intrinsics.checkNotNullParameter(ref$ObjectRef, "$value4");
            Intrinsics.checkNotNullParameter(object, "old");
            String string2 = "new";
            Intrinsics.checkNotNullParameter(object2, string2);
            ref$ObjectRef.element = object2;
            int n3 = ((String)object2).length();
            int n4 = 1;
            if (n3 <= n4) {
                int n7;
                string2 = null;
                for (n3 = 0; n3 < (n7 = ((String)object2).length()); ++n3) {
                    n7 = Character.isDigit(((String)object2).charAt(n3)) ^ n4;
                    if (n7 == 0) {
                        continue;
                    }
                    break block3;
                }
                object = object2;
            }
        }
        return object;
    }
}

