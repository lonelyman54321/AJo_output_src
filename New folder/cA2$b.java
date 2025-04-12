/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.b;

public final class cA2$b
implements e92 {
    public final /* synthetic */ cA2 a;

    public cA2$b(cA2 cA22) {
        this.a = cA22;
    }

    public final void onSuccess(Object object) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        Object object2 = this.a;
        if (bl2) {
            object = ((cA2)object2).a.b();
            String string2 = da2_0.a(((cA2)object2).a);
            String string3 = "Product Config settings: writing Success ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            object2 = ((cA2)object2).d;
            stringBuilder.append(object2);
            object2 = stringBuilder.toString();
            ((b)object).b(string2, (String)object2);
        } else {
            object = ((cA2)object2).a.b();
            object2 = da2_0.a(((cA2)object2).a);
            String string4 = "Product Config settings: writing Failed";
            ((b)object).b((String)object2, string4);
        }
    }
}

