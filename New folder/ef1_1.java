/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from ef1
 */
public final class ef1_1
implements cr_2 {
    public final vi_2 a;

    public ef1_1(vi_2 vi_22) {
        Intrinsics.checkNotNullParameter(vi_22, "ctPreference");
        this.a = vi_22;
    }

    public final void a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "deviceId");
        Intrinsics.checkNotNullParameter(string3, "accountId");
        jd3_1.a.a();
        string2 = jd3_1.a(2, string2, string3);
        this.a.a(string2);
    }

    public final List b(String iterator) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(iterator, "campaignId");
        Object object = new StringBuilder("__impressions_");
        ((StringBuilder)object).append((String)((Object)iterator));
        iterator = ((StringBuilder)object).toString();
        object = this.a;
        Object object2 = "";
        iterator = ((vi_2)object).d((String)((Object)iterator), (String)object2);
        if (iterator != null && !(bl2 = b.k((CharSequence)((Object)iterator)))) {
            object = new String[]{","};
            int n3 = 6;
            iterator = StringsKt.a0((CharSequence)((Object)iterator), (String[])object, false, 0, n3);
            object = new ArrayList();
            iterator = iterator.iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = StringsKt.l0((String)iterator.next());
                if (object2 == null) continue;
                ((ArrayList)object).add(object2);
            }
        } else {
            object = mz0_2.a;
        }
        return object;
    }
}

