/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from iT1
 */
public final class it1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ gt1_0 c;

    public it1_1(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(0);
    }

    public final Object invoke() {
        Serializable serializable;
        ArrayList arrayList;
        String string2 = this.c.a;
        if (string2 != null && (arrayList = Uri.parse((String)string2).getFragment()) != null) {
            arrayList = new ArrayList();
            string2 = Uri.parse((String)string2).getFragment();
            serializable = new StringBuilder();
            Intrinsics.checkNotNull(string2);
            gt1_0.a(string2, arrayList, serializable);
            string2 = serializable.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "fragRegex.toString()");
            serializable = new Pair(arrayList, string2);
        } else {
            serializable = null;
        }
        return serializable;
    }
}

