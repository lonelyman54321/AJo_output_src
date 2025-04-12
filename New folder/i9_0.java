/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I9
 */
public final class i9_0
implements bx0_2,
o60_0,
zn0$h$a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i9_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public ImmutableList a(int n3, qp3 qp32, int[] nArray) {
        int n4;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        for (int i3 = 0; i3 < (n4 = qp32.a); ++i3) {
            zn0$b zn0$b;
            Object object;
            int n7 = nArray[i3];
            Object object2 = object = this.b;
            object2 = (zn0$d)object;
            object = zn0$b;
            zn0$b = new zn0$b(n3, qp32, i3, (zn0$d)object2, n7);
            immutableList$Builder.add(zn0$b);
        }
        return immutableList$Builder.build();
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return (DataCallback)oj_0.a((Function1)this.b, "$tmp0", object, "p0", object);
            }
            case 0: 
        }
        return (DataCallback)oj_0.a((Function1)this.b, "$tmp0", object, "p0", object);
    }
}

