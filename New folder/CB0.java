/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CB0 {
    public final String a;
    public final List b;
    public final List c;
    public final String d;

    public CB0(String string2, CB0$c cB0$c, CB0$a cB0$a, String string3, ArrayList arrayList, ArrayList arrayList2, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter((Object)cB0$c, "method");
        Intrinsics.checkNotNullParameter((Object)cB0$a, "type");
        Intrinsics.checkNotNullParameter(string3, "appVersion");
        Intrinsics.checkNotNullParameter(arrayList, "path");
        Intrinsics.checkNotNullParameter(arrayList2, "parameters");
        Intrinsics.checkNotNullParameter(string4, "componentId");
        Intrinsics.checkNotNullParameter(string5, "pathType");
        Intrinsics.checkNotNullParameter(string6, "activityName");
        this.a = string2;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = string6;
    }
}

