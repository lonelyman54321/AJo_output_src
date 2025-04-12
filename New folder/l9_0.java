/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from L9
 */
public final class l9_0
implements bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ l9_0(int n3, Function1 function1) {
        this.a = n3;
        this.b = function1;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return (DataCallback)oj_0.a(this.b, "$tmp0", object, "p0", object);
            }
            case 0: 
        }
        return (DataCallback)oj_0.a(this.b, "$tmp0", object, "p0", object);
    }
}

