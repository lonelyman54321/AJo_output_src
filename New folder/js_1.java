/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.services.data.Home.NavigationParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JS
 */
public final class js_1
implements o60_0,
bx0_2,
v53_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ js_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
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
            case 1: 
        }
        return NewPlpRepo.i((y12_0)((Function1)this.b), object);
    }

    public void b(H53$a h53$a) {
        block8: {
            Object object = (String)this.b;
            Object object2 = "emitter";
            Intrinsics.checkNotNullParameter(h53$a, (String)object2);
            object2 = new Gson();
            Object[] objectArray = NavigationParent.class;
            object = ((Gson)object2).fromJson((String)object, (Class)objectArray);
            object = (NavigationParent)object;
            object2 = DataCallback.Companion;
            object = ((DataCallback$Companion)object2).onSuccess(object);
            try {
                h53$a.a(object);
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                objectArray = new Object[]{};
                String string2 = "CMS top bar cached response parse error";
                ((yn3$a)object2).d(string2, objectArray);
                boolean bl2 = h53$a.b(exception);
                if (bl2) break block8;
                dr2_2.b(exception);
            }
        }
    }
}

