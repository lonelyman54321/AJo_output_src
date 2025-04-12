/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.b;

/*
 * Renamed from oT1
 */
public final class ot1_0
extends Lambda
implements Function0 {
    public final /* synthetic */ gt1_0 c;

    public ot1_0(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        object.getClass();
        Serializable serializable = new LinkedHashMap();
        Object object2 = (Boolean)((gt1_0)object).g.getValue();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            boolean bl3;
            object2 = ((gt1_0)object).a;
            Uri uri = Uri.parse((String)object2);
            Iterator iterator = uri.getQueryParameterNames().iterator();
            while (bl3 = iterator.hasNext()) {
                int n3;
                String string2 = (String)iterator.next();
                CharSequence charSequence = new StringBuilder();
                Object object3 = uri.getQueryParameters(string2);
                int n4 = object3.size();
                if (n4 <= (n3 = 1)) {
                    String string3;
                    String string4;
                    String string5;
                    Object object4 = "queryParams";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    object3 = (String)CollectionsKt.firstOrNull((List)object3);
                    if (object3 == null) {
                        ((gt1_0)object).i = n3;
                        object3 = string2;
                    }
                    object4 = gt1_0.q.matcher((CharSequence)object3);
                    gT1$b gT1$b = new gT1$b();
                    int n7 = 0;
                    while (true) {
                        boolean bl4 = ((Matcher)object4).find();
                        string5 = "substring(...)";
                        string4 = "queryParam";
                        if (!bl4) break;
                        String string6 = ((Matcher)object4).group(n3);
                        Intrinsics.checkNotNull(string6, "null cannot be cast to non-null type kotlin.String");
                        Intrinsics.checkNotNullParameter(string6, "name");
                        gT1$b.b.add(string6);
                        Intrinsics.checkNotNullExpressionValue(object3, string4);
                        n3 = ((Matcher)object4).start();
                        string3 = ((String)object3).substring(n7, n3);
                        Intrinsics.checkNotNullExpressionValue(string3, string5);
                        string3 = Pattern.quote(string3);
                        ((StringBuilder)charSequence).append(string3);
                        string3 = "(.+?)?";
                        ((StringBuilder)charSequence).append(string3);
                        n7 = ((Matcher)object4).end();
                        n3 = 1;
                    }
                    n4 = ((String)object3).length();
                    if (n7 < n4) {
                        Intrinsics.checkNotNullExpressionValue(object3, string4);
                        object3 = ((String)object3).substring(n7);
                        Intrinsics.checkNotNullExpressionValue(object3, string5);
                        object3 = Pattern.quote((String)object3);
                        ((StringBuilder)charSequence).append((String)object3);
                    }
                    charSequence = ((StringBuilder)charSequence).toString();
                    Intrinsics.checkNotNullExpressionValue(charSequence, "argRegex.toString()");
                    object3 = ".*";
                    object4 = "\\E.*\\Q";
                    n3 = 0;
                    string3 = null;
                    charSequence = b.n((String)charSequence, (String)object3, (String)object4, false);
                    gT1$b.a = charSequence;
                    charSequence = "paramName";
                    Intrinsics.checkNotNullExpressionValue(string2, (String)charSequence);
                    serializable.put(string2, gT1$b);
                    continue;
                }
                object = uc0_0.a("Query parameter ", string2, " must only be present once in ", (String)object2, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                object = object.toString();
                serializable = new IllegalArgumentException((String)object);
                throw serializable;
            }
        }
        return serializable;
    }
}

