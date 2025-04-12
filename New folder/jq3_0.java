/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from jq3
 */
public final class jq3_0
implements C13 {
    public final HttpTransaction a;

    public jq3_0(HttpTransaction httpTransaction) {
        Intrinsics.checkNotNullParameter(httpTransaction, "transaction");
        this.a = httpTransaction;
    }

    public final ce_2 a(Context object) {
        CharSequence charSequence;
        Object object2;
        String string2;
        char c2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "context");
        object = new ce_2();
        Object object3 = this.a;
        Object object4 = ((HttpTransaction)object3).getMethod();
        object4 = Intrinsics.stringPlus("curl -X ", object4);
        ((ce_2)object).I0((String)object4);
        object4 = ((HttpTransaction)object3).getParsedRequestHeaders();
        if (object4 == null) {
            bl2 = false;
        } else {
            object4 = ((Iterable)object4).iterator();
            bl2 = false;
            while ((c2 = object4.hasNext()) != '\u0000') {
                string2 = "Accept-Encoding";
                object2 = (Ea1)object4.next();
                charSequence = ((Ea1)object2).a();
                boolean bl3 = string2.equalsIgnoreCase((String)charSequence);
                if (bl3 && (bl3 = (string2 = "gzip").equalsIgnoreCase((String)(charSequence = ((Ea1)object2).b())))) {
                    bl2 = true;
                }
                charSequence = new StringBuilder(" -H \"");
                string2 = ((Ea1)object2).a();
                ((StringBuilder)charSequence).append(string2);
                string2 = ": ";
                ((StringBuilder)charSequence).append(string2);
                object2 = ((Ea1)object2).b();
                ((StringBuilder)charSequence).append((String)object2);
                c2 = '\"';
                ((StringBuilder)charSequence).append(c2);
                object2 = ((StringBuilder)charSequence).toString();
                ((ce_2)object).I0((String)object2);
            }
        }
        object4 = ((HttpTransaction)object3).getRequestBody();
        if (object4 != null && (c2 = ((String)object4).length()) != '\u0000') {
            object2 = new StringBuilder(" --data $'");
            charSequence = "\n";
            string2 = "\\n";
            object4 = b.n((String)object4, (String)charSequence, string2, false);
            ((StringBuilder)object2).append((String)object4);
            char c3 = '\'';
            ((StringBuilder)object2).append(c3);
            object4 = ((StringBuilder)object2).toString();
            ((ce_2)object).I0((String)object4);
        }
        object4 = bl2 ? " --compressed " : " ";
        object3 = ((HttpTransaction)object3).getFormattedUrl(false);
        object3 = Intrinsics.stringPlus((String)object4, object3);
        ((ce_2)object).I0((String)object3);
        return object;
    }
}

