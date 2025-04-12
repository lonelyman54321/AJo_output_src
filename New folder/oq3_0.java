/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oq3
 */
public final class oq3_0
implements C13 {
    public final ArrayList a;

    public oq3_0(List object) {
        Intrinsics.checkNotNullParameter(object, "transactions");
        object = (Iterable)object;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<kq3_0> arrayList = new ArrayList<kq3_0>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            HttpTransaction httpTransaction = (HttpTransaction)object.next();
            kq3_0 kq3_02 = new kq3_0(httpTransaction, false);
            arrayList.add(kq3_02);
        }
        this.a = arrayList;
    }

    public final ce_2 a(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        ce_2 ce_22 = new ce_2();
        ArrayList arrayList = this.a;
        String string2 = "\n";
        CharSequence charSequence = new StringBuilder(string2);
        int c2 = R$string.chucker_export_separator;
        String string3 = object.getString(c2);
        charSequence.append(string3);
        char c3 = '\n';
        charSequence.append(c3);
        charSequence = charSequence.toString();
        int n3 = R$string.chucker_export_prefix;
        Object object2 = Intrinsics.stringPlus(object.getString(n3), string2);
        Serializable serializable = new StringBuilder(string2);
        int n4 = R$string.chucker_export_postfix;
        string2 = object.getString(n4);
        serializable.append(string2);
        serializable.append(c3);
        string3 = serializable.toString();
        serializable = new nq3_0((Context)object);
        string2 = object2;
        object2 = serializable;
        int n7 = 24;
        object = CollectionsKt.R(arrayList, (String)charSequence, string2, string3, (Function1)((Object)serializable), n7);
        ce_22.I0((String)object);
        return ce_22;
    }
}

