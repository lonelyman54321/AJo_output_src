/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class MV0$a {
    public static MV0 a(ob1_1 ob1_12, boolean bl2) {
        MV0 mV0;
        Intrinsics.checkNotNullParameter(ob1_12, "httpUrl");
        String string2 = "/";
        String string3 = "";
        String string4 = "httpUrl.host()";
        String string5 = "httpUrl.scheme()";
        if (bl2) {
            Object object = ob1_12.c();
            Intrinsics.checkNotNullExpressionValue(object, "httpUrl.encodedPathSegments()");
            int n3 = 62;
            String string6 = "/";
            String string7 = null;
            String string8 = CollectionsKt.R((Iterable)object, string6, null, null, null, n3);
            String string9 = ob1_12.a;
            Intrinsics.checkNotNullExpressionValue(string9, string5);
            String string10 = ob1_12.d;
            Intrinsics.checkNotNullExpressionValue(string10, string4);
            boolean bl3 = b.k(string8) ^ true;
            string7 = bl3 ? (string8 = Intrinsics.stringPlus(string2, string8)) : string3;
            string8 = ob1_12.d();
            String string11 = string8 != null ? string8 : string3;
            int n4 = ob1_12.e;
            object = mV0;
            mV0 = new MV0(n4, string9, string10, string7, string11);
        } else {
            Object object = ob1_12.f;
            Object object2 = "httpUrl.pathSegments()";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            Iterable iterable = object;
            iterable = (Iterable)object;
            Object object3 = null;
            int n7 = 62;
            boolean bl4 = false;
            Object object4 = null;
            object = CollectionsKt.R(iterable, "/", null, null, null, n7);
            String string12 = ob1_12.a;
            Intrinsics.checkNotNullExpressionValue(string12, string5);
            String string13 = ob1_12.d;
            Intrinsics.checkNotNullExpressionValue(string13, string4);
            boolean bl5 = b.k((CharSequence)object) ^ true;
            object3 = bl5 ? (object = Intrinsics.stringPlus(string2, object)) : string3;
            object = ob1_12.h();
            object4 = object != null ? object : string3;
            int n8 = ob1_12.e;
            object2 = mV0;
            mV0 = new MV0(n8, string12, string13, (String)object3, (String)object4);
        }
        return mV0;
    }
}

